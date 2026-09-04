package com.huawei.hms.update.note;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.availableupdate.b;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.ui.NotInstalledHmsDialogHelper;

/* JADX INFO: loaded from: classes7.dex */
public class NotInstalledHmsResolution implements IBridgeActivityDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Dialog f62725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Activity f62726b;

    public static class a implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Activity f62727a;

        public a(Activity activity) {
            this.f62727a = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            HMSLog.i("NotInstalledHmsResolution", "<Dialog onClick>");
            this.f62727a.finish();
        }
    }

    private void a() {
        Dialog dialog = this.f62725a;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.f62725a.cancel();
    }

    private void a(Activity activity) {
        a();
        this.f62725a = NotInstalledHmsDialogHelper.getDialogBuilder(activity).setPositiveButton(NotInstalledHmsDialogHelper.getConfirmResId(activity), new a(activity)).show();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        HMSLog.i("NotInstalledHmsResolution", "<Resolution getRequestCode>");
        return 0;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        HMSLog.i("NotInstalledHmsResolution", "<Resolution onBridgeActivityCreate>");
        if (activity == null || activity.isFinishing()) {
            HMSLog.e("NotInstalledHmsResolution", "<Resolution onBridgeActivityCreate> activity is null or finishing");
            return;
        }
        this.f62726b = activity;
        b.f60428b.a(activity);
        a(activity);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.i("NotInstalledHmsResolution", "<Resolution onBridgeActivityDestroy>");
        a();
        b.f60428b.b(this.f62726b);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i10, int i11, Intent intent) {
        HMSLog.i("NotInstalledHmsResolution", "<Resolution onBridgeActivityResult>");
        return false;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.i("NotInstalledHmsResolution", "<Resolution onBridgeConfigurationChanged>");
        Activity activity = this.f62726b;
        if (activity == null || activity.isFinishing()) {
            HMSLog.e("NotInstalledHmsResolution", "<Resolution onBridgeActivityCreate> mActivity is null or finishing");
        } else {
            a(this.f62726b);
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i10, KeyEvent keyEvent) {
        HMSLog.i("NotInstalledHmsResolution", "<Resolution onKeyUp>");
    }
}
