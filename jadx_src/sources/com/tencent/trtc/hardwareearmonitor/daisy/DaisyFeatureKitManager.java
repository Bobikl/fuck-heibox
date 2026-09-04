package com.tencent.trtc.hardwareearmonitor.daisy;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import com.tencent.liteav.base.util.LiteavLog;

/* JADX INFO: loaded from: classes4.dex */
public class DaisyFeatureKitManager {
    private static final String ENGINE_PACKAGE_NAME = "com.huawei.multimedia.audioengine";
    private static final int PACKAGE_INFO_FLAG = 0;
    private static final String TAG = "DaisyAudioKit.DaisyFeatureKitManager";
    private static DaisyFeatureKitManager sInstance;
    private IDaisyAudioKitCallback mCallBack = null;
    private static final Object SET_CALL_BACK_LOCK = new Object();
    private static final Object NEW_FEATUREMANAGER_LOCK = new Object();
    private static final Object BIND_SERVICE_LOCK = new Object();
    private static final Object UNBIND_SERVICE_LOCK = new Object();

    protected static DaisyFeatureKitManager getInstance() {
        DaisyFeatureKitManager daisyFeatureKitManager;
        synchronized (NEW_FEATUREMANAGER_LOCK) {
            if (sInstance == null) {
                sInstance = new DaisyFeatureKitManager();
            }
            daisyFeatureKitManager = sInstance;
        }
        return daisyFeatureKitManager;
    }

    public static boolean isAudioKitSupport(Context context) {
        if (context == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return true;
        }
        try {
            return packageManager.getPackageInfo(ENGINE_PACKAGE_NAME, 0) != null;
        } catch (PackageManager.NameNotFoundException unused) {
            LiteavLog.e(TAG, "isAudioKitSupport ,NameNotFoundException");
            return false;
        }
    }

    protected void bindService(Context context, ServiceConnection serviceConnection, String str) {
        synchronized (BIND_SERVICE_LOCK) {
            if (context == null) {
                return;
            }
            Intent intent = new Intent();
            intent.setClassName(ENGINE_PACKAGE_NAME, str);
            try {
                context.bindService(intent, serviceConnection, 1);
            } catch (SecurityException e10) {
                LiteavLog.e(TAG, "bindService, SecurityException, %s", e10.getMessage());
            }
        }
    }

    protected <T extends DaisyAudioFeaturesKit> T createFeatureKit(int i10, Context context) {
        if (context == null || i10 != 1) {
            return null;
        }
        DaisyAudioKaraokeFeatureKit daisyAudioKaraokeFeatureKit = new DaisyAudioKaraokeFeatureKit(context);
        daisyAudioKaraokeFeatureKit.initialize(context);
        return daisyAudioKaraokeFeatureKit;
    }

    protected IDaisyAudioKitCallback getCallBack() {
        return this.mCallBack;
    }

    protected void onCallBack(int i10) {
        synchronized (SET_CALL_BACK_LOCK) {
            if (getCallBack() != null) {
                getCallBack().onResult(i10);
            }
        }
    }

    protected void setCallBack(IDaisyAudioKitCallback iDaisyAudioKitCallback) {
        this.mCallBack = iDaisyAudioKitCallback;
    }

    protected void unbindService(Context context, ServiceConnection serviceConnection) {
        synchronized (UNBIND_SERVICE_LOCK) {
            if (context != null) {
                context.unbindService(serviceConnection);
            }
        }
    }
}
