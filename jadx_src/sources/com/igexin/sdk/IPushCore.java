package com.igexin.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.Menu;

/* JADX INFO: loaded from: classes6.dex */
public interface IPushCore {
    void onActivityConfigurationChanged(Activity activity, Configuration configuration);

    boolean onActivityCreateOptionsMenu(Activity activity, Menu menu);

    void onActivityDestroy(Activity activity);

    boolean onActivityKeyDown(Activity activity, int i10, KeyEvent keyEvent);

    void onActivityNewIntent(Activity activity, Intent intent);

    void onActivityPause(Activity activity);

    void onActivityRestart(Activity activity);

    void onActivityResume(Activity activity);

    void onActivityStart(Activity activity, Intent intent);

    void onActivityStop(Activity activity);

    IBinder onServiceBind(Intent intent);

    void onServiceDestroy();

    int onServiceStartCommand(Intent intent, int i10, int i11);

    boolean start(Context context);
}
