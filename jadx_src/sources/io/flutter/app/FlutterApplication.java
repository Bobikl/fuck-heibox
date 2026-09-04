package io.flutter.app;

import android.app.Activity;
import android.app.Application;
import androidx.annotation.i;
import io.flutter.FlutterInjector;

/* JADX INFO: loaded from: classes4.dex */
public class FlutterApplication extends Application {
    private Activity mCurrentActivity = null;

    public Activity getCurrentActivity() {
        return this.mCurrentActivity;
    }

    @Override // android.app.Application
    @i
    public void onCreate() {
        super.onCreate();
        FlutterInjector.instance().flutterLoader().startInitialization(this);
    }

    public void setCurrentActivity(Activity activity) {
        this.mCurrentActivity = activity;
    }
}
