package com.enel.theuselessweb;

import android.app.Application;
import com.avos.avoscloud.AVAnalytics;
import com.avos.avoscloud.AVOSCloud;

/**
 * Created by Enel on 16/5/2.
 */
public class App extends Application {

  @Override public void onCreate() {
    super.onCreate();
    AVOSCloud.initialize(this, "Mvvqf8I8ab35pPlpu4sXQ4NQ-gzGzoHsz", "ri6S4MlQW8Da4dfNFszNIUcO");
    AVAnalytics.enableCrashReport(this, true);
  }
}
