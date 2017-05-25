package com.ace.vishal.edu_info360;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{
    TextView email;
    TextView category;
    private SectionsPagerAdapter mSectionsPagerAdapter;
    String website,Category;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getIntent().getBooleanExtra("IS_FROM_LOGIN", false)) {
            SharedPreferences sharedPreferences = getSharedPreferences(Constants.SHARED_PREF, MODE_PRIVATE);
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(HomeActivity.this);

            alertDialogBuilder
                    .setTitle("Edu-Info360")
                    .setIcon(R.drawable.logo)
                    .setMessage("Welcome Back"+"\t"+sharedPreferences.getString("Email","")+"\n"+"Thank you for using our services."+"\n"+"For more details contact:"+"vishalmago16@gmail.com")
                    .setCancelable(true);

            // create alert dialog
            AlertDialog alertDialog = alertDialogBuilder.create();

            // show it
            alertDialog.show();

        }
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        View hView = navigationView.getHeaderView(0);
        email = (TextView) hView.findViewById(R.id.email);
        category = (TextView) hView.findViewById(R.id.category);
        SharedPreferences sharedPreferences = getSharedPreferences(Constants.SHARED_PREF, MODE_PRIVATE);
        Category=sharedPreferences.getString("Category","");
        email.setText(sharedPreferences.getString("Email", ""));
        category.setText(sharedPreferences.getString("Category", ""));
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Intent i;
        if (id == R.id.nav_antiragging) {
            i=new Intent(HomeActivity.this,antiragging.class);
            startActivity(i);
        } else if (id == R.id.nav_rti) {
             i=new Intent(HomeActivity.this,RTI.class);
            startActivity(i);

        }  else if (id == R.id.nav_share) {
            Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Download Locator App from play store");
            sharingIntent.putExtra(Intent.EXTRA_TEXT, "Download Edu-Info 360 app for free"+"\t"+"http://play.google.com/store/apps/details?id=com.ace.vishal.edu_info360");
            startActivity(Intent.createChooser(sharingIntent, "Share via"));


        }else if(id==R.id.nav_contact){

        }else if (id == R.id.nav_about) {
            LayoutInflater li = LayoutInflater.from(this);
            View promptsView = li.inflate(R.layout.aboutcategory, null);

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                    this);

            alertDialogBuilder.setView(promptsView);

            final Spinner userInput = (Spinner) promptsView
                    .findViewById(R.id.newbusnum);
            List<String> list = new ArrayList<String>();
            list.add("Select");
            list.add("NIRF");
            list.add("NAAC");
            list.add("AICTE");
            list.add("UGC");
            list.add("AISHE");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>
                    (this, R.layout.spinner_item, list);

            dataAdapter.setDropDownViewResource
                    (android.R.layout.simple_spinner_dropdown_item);

            userInput.setAdapter(dataAdapter);

            userInput.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view,
                                           int position, long id) {
                    switch (position){
                        case 0:
                            website="0";
                            break;
                        case 1:
                            website="NIRF";
                            break;
                        case 2:
                            website="NAAC";
                            break;
                        case 3:
                            website="AICTE";
                            break;
                        case 4:
                            website="UGC";
                            break;
                        case 5:
                            website="AISHE";
                            break;
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                    // TODO Auto-generated method stub
                }
            });


            // set dialog message
            alertDialogBuilder
                    .setCancelable(true)
                    .setPositiveButton("Save",
                            new DialogInterface.OnClickListener() {
                                Intent i;
                                public void onClick(DialogInterface dialog,int id) {
                                    if(website=="0"){
                                        Toast.makeText(HomeActivity.this, "Select a valid website", Toast.LENGTH_SHORT).show();
                                    }
                                    else if(website.trim().equalsIgnoreCase("NIRF")){
                                        i=new Intent(HomeActivity.this,AboutNirf.class);
                                        startActivity(i);
                                    }else if(website.trim().equalsIgnoreCase("NAAC")){
                                        i=new Intent(HomeActivity.this,AboutNaac.class);
                                        startActivity(i);
                                    }else if(website.trim().equalsIgnoreCase("AICTE")){
                                        i=new Intent(HomeActivity.this,about_aicte.class);
                                        startActivity(i);
                                    }else if(website.trim().equalsIgnoreCase("UGC")){
                                        i=new Intent(HomeActivity.this,ugcabout.class);
                                        startActivity(i);
                                    }else if(website.trim().equalsIgnoreCase("AISHE")){
                                        i=new Intent(HomeActivity.this,AboutAishe.class);
                                        startActivity(i);
                                    }
                                }
                            })
                    .setNegativeButton("Cancel",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    dialog.cancel();
                                }
                            });

            // create alert dialog
            AlertDialog alertDialog = alertDialogBuilder.create();

            // show it
            alertDialog.show();
        }else if (id == R.id.nav_logout) {
            new AlertDialog.Builder(this).setMessage("Are you sure you want to Log Out")
                    .setPositiveButton("Yes",new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialog,int which){
                            SharedPreferences sharedPreferences = getSharedPreferences(Constants.SHARED_PREF, MODE_PRIVATE);

                            //Opening the shared preferences editor to save values
                            SharedPreferences.Editor editor = sharedPreferences.edit();

                            //Saving the boolean as true i.e. the device is registered
                            editor.putBoolean(Constants.REGISTERED, false);
                            //Applying the changes on sharedpreferences
                            editor.apply();
                            Intent i=new Intent(HomeActivity.this,Login.class);
                            startActivity(i);
                            finish();
                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    })
                    .show();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            Fragment f=null;
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            switch(position){
                case 0:
                    if (Category.trim().equalsIgnoreCase("Student")) {
                        f = new FirstFragment();
                    }
                    else if(Category.trim().equalsIgnoreCase("Institute")){
                        f=new InstituteFragment();
                    }
                    else{
                        f=new TeacherFragment();
                    }
                    break;
                case 1:
                    f=new SecondFragment();
                    break;
            }
            return f;
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Home";
                case 1:
                    return "Updates";
            }
            return null;
        }
    }
}
