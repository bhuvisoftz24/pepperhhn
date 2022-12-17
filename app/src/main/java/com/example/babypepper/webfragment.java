package com.example.babypepper;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class webfragment extends Fragment {

    WebView webView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_webfragment, container, false);

       webView = view.findViewById(R.id.WebviewID);
       webView.getSettings().setJavaScriptEnabled(true);
       webView.setWebViewClient(new WebViewClient());

       webView.loadUrl("https://www.youtube.com/shorts/JMK_tZAehQ4");

       return view;
    }
}