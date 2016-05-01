package com.enel.theuselessweb;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
  private Button toWeb;
  private TextView tv;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    findViewById(R.id.to_web).setOnClickListener(this);
  }

  @Override public void onClick(View v) {
    Intent intent = new Intent(this, WebActivity.class);
    intent.putExtra(WebActivity.EXTRA_STR_URL, getRandomWeb());
    startActivity(intent);
  }

  private String getRandomWeb() {
    String[] webs = getResources().getStringArray(R.array.webs);
    int index = (int) Math.round(Math.random() * webs.length);
    return webs[index];
  }
}
