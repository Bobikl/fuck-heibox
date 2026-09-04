package com.efs.sdk.memoryinfo;

import android.app.Activity;
import android.content.Context;
import com.efs.sdk.base.EfsReporter;

/* JADX INFO: loaded from: classes6.dex */
public interface UMMemoryMonitorApi {
    String getCurrentActivity();

    boolean isEnable();

    boolean isForeground();

    void onActivityResumed(Activity activity);

    void onActivityStarted(Activity activity);

    void onActivityStopped(Activity activity);

    void setEnable(boolean z10);

    void start(Context context, EfsReporter efsReporter);
}
