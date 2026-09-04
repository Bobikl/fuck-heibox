package com.huawei.hms.adapter.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.ui.NotInstalledHmsDialogHelper;

/* JADX INFO: loaded from: classes7.dex */
public class NotInstalledHmsAdapter implements IBridgeActivityDelegate {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f60331c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f60332d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f60333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Dialog f60334b;

    public static class a implements DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Activity f60335a;

        public a(Activity activity) {
            this.f60335a = activity;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            HMSLog.i("NotInstalledHmsAdapter", "<Dialog onCancel>");
            SystemManager.getInstance().notifyUpdateResult(13);
            this.f60335a.finish();
        }
    }

    public static class b implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Activity f60336a;

        public b(Activity activity) {
            this.f60336a = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            HMSLog.i("NotInstalledHmsAdapter", "<Dialog onClick>");
            SystemManager.getInstance().notifyUpdateResult(30);
            this.f60336a.finish();
        }
    }

    private void a(Activity activity) {
        Dialog dialog = this.f60334b;
        if (dialog != null && dialog.isShowing()) {
            this.f60334b.setOnCancelListener(null);
            this.f60334b.cancel();
        }
        this.f60334b = NotInstalledHmsDialogHelper.getDialogBuilder(activity).setPositiveButton(NotInstalledHmsDialogHelper.getConfirmResId(activity), new b(activity)).setOnCancelListener(new a(activity)).show();
    }

    public static boolean getShowLock() {
        synchronized (f60331c) {
            HMSLog.i("NotInstalledHmsAdapter", "<canShowDialog> sIsShowingDialog: " + f60332d);
            if (f60332d) {
                return false;
            }
            f60332d = true;
            return true;
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        HMSLog.i("NotInstalledHmsAdapter", "<getRequestCode>");
        return 0;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        HMSLog.i("NotInstalledHmsAdapter", "<onBridgeActivityCreate>");
        if (activity == null || activity.isFinishing()) {
            HMSLog.e("NotInstalledHmsAdapter", "<onBridgeActivityCreate> activity is null or finishing");
        } else {
            this.f60333a = activity;
            a(activity);
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.i("NotInstalledHmsAdapter", "<onBridgeActivityDestroy>");
        synchronized (f60331c) {
            f60332d = false;
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i10, int i11, Intent intent) {
        HMSLog.i("NotInstalledHmsAdapter", "<onBridgeActivityResult>");
        return false;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.i("NotInstalledHmsAdapter", "<onBridgeConfigurationChanged>");
        Activity activity = this.f60333a;
        if (activity == null || activity.isFinishing()) {
            HMSLog.e("NotInstalledHmsAdapter", "<onBridgeConfigurationChanged> mActivity is null or finishing");
        } else {
            a(this.f60333a);
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i10, KeyEvent keyEvent) {
        HMSLog.i("NotInstalledHmsAdapter", "<onKeyUp>");
    }
}
