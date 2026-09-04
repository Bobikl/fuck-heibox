package com.huawei.hms.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.adapter.sysobs.SystemObserver;
import com.huawei.hms.adapter.ui.NotInstalledHmsAdapter;
import com.huawei.hms.adapter.ui.UpdateAdapter;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.note.AppSpoofResolution;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSBIInitializer;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.UIUtil;

/* JADX INFO: loaded from: classes7.dex */
public class AvailableAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f60278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AvailableCallBack f60279b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SystemObserver f60281d = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f60280c = false;

    public interface AvailableCallBack {
        void onComplete(int i10);
    }

    public class a implements SystemObserver {
        a() {
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onNoticeResult(int i10) {
            AvailableCallBack availableCallBackA = AvailableAdapter.this.a();
            if (availableCallBackA == null) {
                HMSLog.e("AvailableAdapter", "onNoticeResult baseCallBack null");
                return true;
            }
            availableCallBackA.onComplete(i10);
            return true;
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onSolutionResult(Intent intent, String str) {
            return false;
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onUpdateResult(int i10) {
            AvailableCallBack availableCallBackA = AvailableAdapter.this.a();
            if (availableCallBackA == null) {
                HMSLog.e("AvailableAdapter", "onUpdateResult baseCallBack null");
                return true;
            }
            availableCallBackA.onComplete(i10);
            return true;
        }
    }

    public AvailableAdapter(int i10) {
        this.f60278a = i10;
    }

    private int a(Context context) {
        if (HMSPackageManager.getInstance(context).isUseOldCertificate()) {
            HMSLog.e("AvailableAdapter", "The CP uses the old certificate to terminate the connection.");
            return 13;
        }
        PackageManagerHelper.PackageStates hMSPackageStatesForMultiService = HMSPackageManager.getInstance(context).getHMSPackageStatesForMultiService();
        if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(hMSPackageStatesForMultiService)) {
            HMSLog.i("AvailableAdapter", "HMS is not installed");
            return 1;
        }
        if (PackageManagerHelper.PackageStates.SPOOF.equals(hMSPackageStatesForMultiService)) {
            HMSLog.i("AvailableAdapter", "HMS is spoofed");
            return 29;
        }
        if (!PackageManagerHelper.PackageStates.DISABLED.equals(hMSPackageStatesForMultiService)) {
            return 0;
        }
        HMSLog.i("AvailableAdapter", "HMS is disabled");
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AvailableCallBack a() {
        return this.f60279b;
    }

    private void a(Activity activity, AvailableCallBack availableCallBack) {
        HMSLog.i("AvailableAdapter", "<showHmsApkNotInstalledDialog> startResolution");
        if (!NotInstalledHmsAdapter.getShowLock()) {
            availableCallBack.onComplete(31);
            return;
        }
        this.f60279b = availableCallBack;
        SystemManager.getSystemNotifier().registerObserver(this.f60281d);
        activity.startActivity(BridgeActivity.getIntentStartBridgeActivity(activity, NotInstalledHmsAdapter.class.getName()));
    }

    private boolean a(Activity activity) {
        if (HMSPackageManager.getInstance(activity).getHmsVersionCode() < 40000000) {
            return false;
        }
        HMSLog.i("AvailableAdapter", "enter 4.0 HmsCore upgrade process");
        return true;
    }

    private void b(Context context) {
        HMSBIInitializer.getInstance(context).initBI();
    }

    public int checkHuaweiMobileServicesForUpdate(Context context) {
        Checker.checkNonNull(context, "context must not be null.");
        int iA = a(context);
        if (iA != 0 || !HMSPackageManager.getInstance(context).isApkNeedUpdate(this.f60278a)) {
            return iA;
        }
        HMSLog.i("AvailableAdapter", "The current version does not meet the target version requirements");
        return 2;
    }

    public int isHuaweiMobileServicesAvailable(Context context) {
        Checker.checkNonNull(context, "context must not be null.");
        int iA = a(context);
        if (iA != 0 || !HMSPackageManager.getInstance(context).isApkUpdateNecessary(this.f60278a)) {
            return iA;
        }
        HMSLog.i("AvailableAdapter", "The current version does not meet the minimum version requirements");
        return 2;
    }

    public boolean isUserNoticeError(int i10) {
        return i10 == 29;
    }

    public boolean isUserResolvableError(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public void setCalledBySolutionInstallHms(boolean z10) {
        this.f60280c = z10;
    }

    public void startNotice(Activity activity, AvailableCallBack availableCallBack) {
        if (activity == null || availableCallBack == null) {
            return;
        }
        if (UIUtil.isBackground(activity)) {
            HMSLog.i("AvailableAdapter", "current app is in Background");
            availableCallBack.onComplete(28);
        } else {
            HMSLog.i("AvailableAdapter", "startNotice");
            this.f60279b = availableCallBack;
            SystemManager.getSystemNotifier().registerObserver(this.f60281d);
            activity.startActivity(BridgeActivity.getIntentStartBridgeActivity(activity, AppSpoofResolution.class.getName()));
        }
    }

    public void startResolution(Activity activity, AvailableCallBack availableCallBack) {
        if (activity == null || availableCallBack == null) {
            return;
        }
        b(activity);
        if (UIUtil.isBackground(activity)) {
            HMSLog.i("AvailableAdapter", "current app is in Background");
            availableCallBack.onComplete(28);
            return;
        }
        boolean zA = a(activity);
        if (!AvailableUtil.isInstallerLibExist(activity) && !zA) {
            a(activity, availableCallBack);
            return;
        }
        HMSLog.i("AvailableAdapter", "startResolution");
        this.f60279b = availableCallBack;
        SystemManager.getSystemNotifier().registerObserver(this.f60281d);
        Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, UpdateAdapter.class.getName());
        intentStartBridgeActivity.putExtra(CommonCode.MapKey.UPDATE_VERSION, this.f60278a);
        if (this.f60280c) {
            intentStartBridgeActivity.putExtra("installHMS", "installHMS");
        }
        intentStartBridgeActivity.putExtra(CommonCode.MapKey.NEW_UPDATE, zA);
        activity.startActivity(intentStartBridgeActivity);
    }
}
