package com.ace.vishal.edu_info360;

import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by hp on 4/2/2017.
 */
public class RTIWebView  extends AppCompatActivity {

    WebView myWebView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rtiwebview_layout);
        final ProgressDialog pd = ProgressDialog.show(this, "", "Loading...", true);
        this.myWebView = (WebView)findViewById(R.id.webview);
        WebSettings webSettings = myWebView.getSettings();
        myWebView.getSettings().setLoadWithOverviewMode(true);
        myWebView.getSettings().setUseWideViewPort(true);
        myWebView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        myWebView.setScrollbarFadingEnabled(true);
        myWebView.setInitialScale(30);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setPluginState(WebSettings.PluginState.ON);
        SharedPreferences sharedPreferences =getSharedPreferences(Constants.SHARED_PREF,MODE_PRIVATE);
        String URL=sharedPreferences.getString("URLRTI","");
        myWebView.loadUrl(URL);
        myWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (myWebView.getProgress() == 100) {
                    pd.dismiss();
                    myWebView.setVisibility(View.VISIBLE);
                }

            }
        });
        myWebView.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((keyCode == KeyEvent.KEYCODE_BACK) && myWebView.canGoBack()) {
                    myWebView.goBack();
                    return true;
                }
                return false;
            }
        });
    }
}

