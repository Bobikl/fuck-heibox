package com.alipay.face.ui;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.app.o0;

/* JADX INFO: loaded from: classes6.dex */
public class FaceBaseActivity extends Activity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f38920b = "FINISH_WITH_EXCEPTION";

    private void e() {
        PackageManager packageManager = getPackageManager();
        if (packageManager != null) {
            ((AlarmManager) getSystemService(o0.K0)).set(1, System.currentTimeMillis() + 100, PendingIntent.getActivity(this, Integer.MAX_VALUE, packageManager.getLaunchIntentForPackage(getPackageName()), 268435456));
            Process.killProcess(Process.myPid());
        }
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        b.b().e(this);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null || !TextUtils.equals(bundle.getString(f38920b), androidx.exifinterface.media.a.f23244d5)) {
            b.b().d(this);
        } else {
            e();
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        b.b().e(this);
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        b.b().f(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putString(f38920b, androidx.exifinterface.media.a.f23244d5);
        super.onSaveInstanceState(bundle);
    }
}
