package com.example.babypepper;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class helpfragment extends Fragment {

    WebView webView2;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_helpfragment, container, false);

        webView2 = view.findViewById(R.id.WebviewID);
        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.setWebViewClient(new WebViewClient());

        webView2.loadUrl("https://www.bahn.de/");

        return view;
    }
}