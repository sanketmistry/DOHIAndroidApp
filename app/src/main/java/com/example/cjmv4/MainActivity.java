package com.example.cjmv4;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtView = (TextView) findViewById(R.id.txtview);
        txtView.setText("Welcome to Douglas OHI app. You can view all the updates on our website as well as give feedback through our feedback form!");
        txtView.setVisibility(View.VISIBLE);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //toolbar.setVisibility((View.GONE));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_website);
        WebView myWebView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://www.douglasohi.com/");
        myWebView.setVisibility(View.VISIBLE);
        setTitle("Douglas OHI - Website");
        /*ToggleButton toggle1 = (ToggleButton) findViewById(R.id.app_bar_switch);
            toggle1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        // The toggle is enabled
                        setTheme(android.R.style.ThemeOverlay_Material_Dark);

                    } else {
                        // The toggle is disabled
                        setTheme(android.R.style.Theme);
                    }
                }
            });*/
    }
    /*@Override
    protected void onSaveInstanceState(Bundle outState )
    {
        super.onSaveInstanceState(outState);
        myWebView.saveState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);
        myWebView.restoreState(savedInstanceState);
    }*/
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
        //getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        setContentView(R.layout.activity_main);
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

        if (id == R.id.nav_website) {
            WebView myWebView = (WebView) findViewById(R.id.webview);
            WebSettings webSettings = myWebView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            myWebView.setWebViewClient(new WebViewClient());
            myWebView.loadUrl("https://www.douglasohi.com/");
            myWebView.setVisibility(View.VISIBLE);
            TextView txtView = (TextView) findViewById(R.id.txtview);
            txtView.setVisibility(View.GONE);
            setTitle("Douglas OHI - Website");
            NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
            navigationView.setNavigationItemSelectedListener(this);
            navigationView.setCheckedItem(R.id.nav_website);
            //return true;
        } else if (id == R.id.nav_feedback) {
            WebView myWebView = (WebView) findViewById(R.id.webview);
            WebSettings webSettings = myWebView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            myWebView.setWebViewClient(new WebViewClient());
            myWebView.loadUrl("https://feedback.douglasohi.com/cjmv3/testquery.aspx");
            myWebView.setVisibility(View.VISIBLE);
            TextView txtView = (TextView) findViewById(R.id.txtview);
            txtView.setVisibility(View.GONE);
            setTitle("Douglas OHI - Feedback");
            NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
            navigationView.setNavigationItemSelectedListener(this);
            navigationView.setCheckedItem(R.id.nav_feedback);
            //return true;
        }
        else if (id == R.id.nav_twitter) {
            WebView myWebView = (WebView) findViewById(R.id.webview);
            WebSettings webSettings = myWebView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            myWebView.setWebViewClient(new WebViewClient());
            myWebView.loadUrl("https://twitter.com/Douglas0hi");
            myWebView.setVisibility(View.VISIBLE);
            TextView txtView = (TextView) findViewById(R.id.txtview);
            txtView.setVisibility(View.GONE);
            setTitle("Douglas OHI - Twitter");
            NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
            navigationView.setNavigationItemSelectedListener(this);
            navigationView.setCheckedItem(R.id.nav_twitter);
            //return true;
        }
        else if (id == R.id.nav_linkedin) {
            WebView myWebView = (WebView) findViewById(R.id.webview);
            WebSettings webSettings = myWebView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            myWebView.setWebViewClient(new WebViewClient());
            myWebView.loadUrl("https://www.linkedin.com/company/douglasohi/");
            myWebView.setVisibility(View.VISIBLE);
            TextView txtView = (TextView) findViewById(R.id.txtview);
            txtView.setVisibility(View.GONE);
            setTitle("Douglas OHI - LinkedIn");
            NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
            navigationView.setNavigationItemSelectedListener(this);
            navigationView.setCheckedItem(R.id.nav_linkedin);
            //return true;
        }
        else if (id == R.id.nav_insta) {
            WebView myWebView = (WebView) findViewById(R.id.webview);
            WebSettings webSettings = myWebView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            myWebView.setWebViewClient(new WebViewClient());
            myWebView.loadUrl("https://www.instagram.com/douglasohi/");
            myWebView.setVisibility(View.VISIBLE);
            TextView txtView = (TextView) findViewById(R.id.txtview);
            txtView.setVisibility(View.GONE);
            setTitle("Douglas OHI - Instagram");
            NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
            navigationView.setNavigationItemSelectedListener(this);
            navigationView.setCheckedItem(R.id.nav_insta);
            //return true;
        }
        else
        {
            WebView myWebView = (WebView) findViewById(R.id.webview);
            TextView txtView = (TextView) findViewById(R.id.txtview);
            txtView.setText("Welcome to Douglas OHI app. You can view all the updates on our website as well as give feedback through our feedback form!");
            txtView.setVisibility(View.VISIBLE);
            myWebView.setVisibility(View.GONE);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
