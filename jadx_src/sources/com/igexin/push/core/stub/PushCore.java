package com.igexin.push.core.stub;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import android.os.Message;
import android.view.KeyEvent;
import android.view.Menu;
import com.igexin.push.core.CoreConsts;
import com.igexin.push.core.c;
import com.igexin.sdk.IPushCore;

/* JADX INFO: loaded from: classes.dex */
public class PushCore implements IPushCore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f63779a;

    @Override // com.igexin.sdk.IPushCore
    public void onActivityConfigurationChanged(Activity activity, Configuration configuration) {
    }

    @Override // com.igexin.sdk.IPushCore
    public boolean onActivityCreateOptionsMenu(Activity activity, Menu menu) {
        return false;
    }

    @Override // com.igexin.sdk.IPushCore
    public void onActivityDestroy(Activity activity) {
    }

    @Override // com.igexin.sdk.IPushCore
    public boolean onActivityKeyDown(Activity activity, int i10, KeyEvent keyEvent) {
        return false;
    }

    @Override // com.igexin.sdk.IPushCore
    public void onActivityNewIntent(Activity activity, Intent intent) {
    }

    @Override // com.igexin.sdk.IPushCore
    public void onActivityPause(Activity activity) {
    }

    @Override // com.igexin.sdk.IPushCore
    public void onActivityRestart(Activity activity) {
    }

    @Override // com.igexin.sdk.IPushCore
    public void onActivityResume(Activity activity) {
    }

    @Override // com.igexin.sdk.IPushCore
    public void onActivityStart(Activity activity, Intent intent) {
    }

    @Override // com.igexin.sdk.IPushCore
    public void onActivityStop(Activity activity) {
    }

    @Override // com.igexin.sdk.IPushCore
    public IBinder onServiceBind(Intent intent) {
        return null;
    }

    @Override // com.igexin.sdk.IPushCore
    public void onServiceDestroy() {
    }

    @Override // com.igexin.sdk.IPushCore
    public int onServiceStartCommand(Intent intent, int i10, int i11) {
        if (this.f63779a == null) {
            return 2;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = CoreConsts.f63456f;
        messageObtain.obj = intent;
        this.f63779a.a(messageObtain);
        return 2;
    }

    @Override // com.igexin.sdk.IPushCore
    public boolean start(Context context) {
        c cVarA = c.a();
        this.f63779a = cVarA;
        cVarA.a(context);
        return true;
    }
}
