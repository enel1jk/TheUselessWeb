package com.enel.theuselessweb;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Enel on 16/5/1.
 */
public class WebActivity extends AppCompatActivity {
  public static final String EXTRA_STR_URL = "url";
  private WebView web;

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
    setContentView(R.layout.activity_web);
    web = (WebView) findViewById(R.id.web);
    setupWeb();
  }

  private void setupWeb() {
    web.setWebChromeClient(new WebChromeClient());
    web.setWebViewClient(new WebViewClient());
    web.setSoundEffectsEnabled(true);
    WebSettings settings = web.getSettings();
    settings.setJavaScriptEnabled(true);

    String url = getIntent().getStringExtra(EXTRA_STR_URL);

    Log.e("zzzz", url);

    web.loadUrl(url);
  }
}
