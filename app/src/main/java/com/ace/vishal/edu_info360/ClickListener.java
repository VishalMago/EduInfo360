package com.ace.vishal.edu_info360;

import android.view.View;

/**
 * Created by Hp on 4/1/2017.
 */
public interface ClickListener {
    void onClick(View view, int position);

    void onLongClick(View view, int position);
}