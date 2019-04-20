package com.example.mylibrary;

import android.content.Context;

public class Toast {

    public void makeToast(String text, Context context){

        android.widget.Toast.makeText(context, text, android.widget.Toast.LENGTH_LONG).show();
    }
}
