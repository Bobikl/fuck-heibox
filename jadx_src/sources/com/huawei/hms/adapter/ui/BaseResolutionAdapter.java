package com.huawei.hms.adapter.ui;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.ApkResolutionFailedManager;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.kpms.KpmsConstant;
import com.huawei.hms.utils.IntentUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class BaseResolutionAdapter implements IBridgeActivityDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f60329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f60330b = "";

    private void a() {
        Activity activityB = b();
        if (activityB == null || activityB.isFinishing()) {
            return;
        }
        activityB.finish();
    }

    private Activity b() {
        WeakReference<Activity> weakReference = this.f60329a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private void c() {
        SystemManager.getInstance().notifyResolutionResult(null, this.f60330b);
        a();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 1001;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        this.f60329a = new WeakReference<>(activity);
        Intent intent = activity.getIntent();
        if (intent == null) {
            c();
            return;
        }
        Bundle extras = null;
        try {
            extras = intent.getExtras();
            this.f60330b = intent.getStringExtra(CommonCode.MapKey.TRANSACTION_ID);
        } catch (Exception e10) {
            HMSLog.e("BaseResolutionAdapter", "get transaction_id exception:" + e10.getMessage());
        }
        if (this.f60330b != null && Build.VERSION.SDK_INT >= 29) {
            HMSLog.i("BaseResolutionAdapter", "remove apk resolution failed task.");
            ApkResolutionFailedManager.getInstance().removeTask(this.f60330b);
        }
        if (extras == null) {
            c();
            return;
        }
        Parcelable parcelable = extras.getParcelable("resolution");
        if (parcelable == null) {
            c();
            return;
        }
        if (parcelable instanceof Intent) {
            try {
                activity.startActivityForResult(IntentUtil.modifyIntentBehaviorsSafe((Intent) parcelable), 1001);
                return;
            } catch (Throwable unused) {
                c();
                HMSLog.e("BaseResolutionAdapter", "ActivityNotFoundException:exception");
                return;
            }
        }
        if (parcelable instanceof PendingIntent) {
            try {
                activity.startIntentSenderForResult(((PendingIntent) parcelable).getIntentSender(), 1001, null, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused2) {
                c();
                HMSLog.e("BaseResolutionAdapter", "SendIntentException:exception");
            }
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.i("BaseResolutionAdapter", "onBridgeActivityDestroy");
        this.f60329a = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i10, int i11, Intent intent) {
        if (i10 != getRequestCode()) {
            return false;
        }
        HMSLog.i("BaseResolutionAdapter", "onBridgeActivityResult, resultCode: " + i11);
        if (i11 == 1001 || i11 == 1002) {
            if (intent == null) {
                intent = new Intent();
            }
            intent.putExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT, i11);
        }
        if (i11 == -1 || intent.hasExtra(KpmsConstant.KIT_UPDATE_RESULT) || intent.hasExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT)) {
            SystemManager.getInstance().notifyResolutionResult(intent, this.f60330b);
        } else {
            SystemManager.getInstance().notifyResolutionResult(null, this.f60330b);
        }
        a();
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.i("BaseResolutionAdapter", "onBridgeConfigurationChanged");
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i10, KeyEvent keyEvent) {
        HMSLog.i("BaseResolutionAdapter", "On key up when resolve conn error");
    }
}
