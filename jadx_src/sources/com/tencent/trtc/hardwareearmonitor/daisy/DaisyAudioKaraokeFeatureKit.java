package com.tencent.trtc.hardwareearmonitor.daisy;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.tencent.liteav.base.util.LiteavLog;

/* JADX INFO: loaded from: classes4.dex */
public class DaisyAudioKaraokeFeatureKit extends DaisyAudioFeaturesKit {
    private static final String ENGINE_CLASS_NAME = "com.huawei.multimedia.audioengine.HwAudioKaraokeFeatureService";
    private static final String TAG = "DaisyAudioKit.DaisyAudioKaraokeFeatureKit";
    private Context mContext;
    private DaisyFeatureKitManager mFeatureKitManager;
    private IDaisyAudioKaraokeFeature mIHwAudioKaraokeFeatureAidl;
    private boolean mIsServiceConnected = false;
    private IBinder mService = null;
    private ServiceConnection mConnection = new ServiceConnection() { // from class: com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            DaisyAudioKaraokeFeatureKit.this.mIHwAudioKaraokeFeatureAidl = IDaisyAudioKaraokeFeature.Stub.asInterface(iBinder);
            if (DaisyAudioKaraokeFeatureKit.this.mIHwAudioKaraokeFeatureAidl != null) {
                DaisyAudioKaraokeFeatureKit.this.mIsServiceConnected = true;
                DaisyAudioKaraokeFeatureKit.this.mFeatureKitManager.onCallBack(1000);
                DaisyAudioKaraokeFeatureKit daisyAudioKaraokeFeatureKit = DaisyAudioKaraokeFeatureKit.this;
                daisyAudioKaraokeFeatureKit.serviceInit(daisyAudioKaraokeFeatureKit.mContext.getPackageName());
                DaisyAudioKaraokeFeatureKit.this.serviceLinkToDeath(iBinder);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            DaisyAudioKaraokeFeatureKit.this.mIsServiceConnected = false;
            if (DaisyAudioKaraokeFeatureKit.this.mFeatureKitManager != null) {
                DaisyAudioKaraokeFeatureKit.this.mFeatureKitManager.onCallBack(1001);
            }
        }
    };
    private IBinder.DeathRecipient mDeathRecipient = new IBinder.DeathRecipient() { // from class: com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit.2
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            LiteavLog.e(DaisyAudioKaraokeFeatureKit.TAG, "binderDied");
            DaisyAudioKaraokeFeatureKit.this.mService.unlinkToDeath(DaisyAudioKaraokeFeatureKit.this.mDeathRecipient, 0);
            DaisyAudioKaraokeFeatureKit.this.mFeatureKitManager.onCallBack(1003);
            DaisyAudioKaraokeFeatureKit.this.mService = null;
        }
    };

    public enum ParameName {
        CMD_SET_AUDIO_EFFECT_MODE_BASE("Karaoke_reverb_mode="),
        CMD_SET_VOCAL_VOLUME_BASE("Karaoke_volume="),
        CMD_SET_VOCAL_EQUALIZER_MODE("Karaoke_eq_mode=");

        private String mParameName;

        ParameName(String str) {
            this.mParameName = str;
        }

        public final String getParameName() {
            return this.mParameName;
        }
    }

    protected DaisyAudioKaraokeFeatureKit(Context context) {
        this.mFeatureKitManager = null;
        this.mFeatureKitManager = DaisyFeatureKitManager.getInstance();
        this.mContext = context;
    }

    private void bindService(Context context) {
        DaisyFeatureKitManager daisyFeatureKitManager = this.mFeatureKitManager;
        if (daisyFeatureKitManager == null || this.mIsServiceConnected) {
            return;
        }
        daisyFeatureKitManager.bindService(context, this.mConnection, ENGINE_CLASS_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serviceInit(String str) {
        try {
            IDaisyAudioKaraokeFeature iDaisyAudioKaraokeFeature = this.mIHwAudioKaraokeFeatureAidl;
            if (iDaisyAudioKaraokeFeature == null || !this.mIsServiceConnected) {
                return;
            }
            iDaisyAudioKaraokeFeature.init(str);
        } catch (RemoteException e10) {
            LiteavLog.e(TAG, "isFeatureSupported,RemoteException ex : %s", e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serviceLinkToDeath(IBinder iBinder) {
        this.mService = iBinder;
        if (iBinder != null) {
            try {
                iBinder.linkToDeath(this.mDeathRecipient, 0);
            } catch (RemoteException unused) {
                this.mFeatureKitManager.onCallBack(1002);
                LiteavLog.e(TAG, "serviceLinkToDeath, RemoteException");
            }
        }
    }

    public void destroy() {
        if (this.mIsServiceConnected) {
            this.mIsServiceConnected = false;
            this.mFeatureKitManager.unbindService(this.mContext, this.mConnection);
        }
    }

    public int enableKaraokeFeature(boolean z10) {
        try {
            IDaisyAudioKaraokeFeature iDaisyAudioKaraokeFeature = this.mIHwAudioKaraokeFeatureAidl;
            if (iDaisyAudioKaraokeFeature == null || !this.mIsServiceConnected) {
                return -2;
            }
            return iDaisyAudioKaraokeFeature.enableKaraokeFeature(z10);
        } catch (RemoteException e10) {
            LiteavLog.e(TAG, "enableKaraokeFeature,RemoteException ex : %s", e10.getMessage());
            return -2;
        }
    }

    public int getKaraokeLatency() {
        try {
            IDaisyAudioKaraokeFeature iDaisyAudioKaraokeFeature = this.mIHwAudioKaraokeFeatureAidl;
            if (iDaisyAudioKaraokeFeature == null || !this.mIsServiceConnected) {
                return -1;
            }
            return iDaisyAudioKaraokeFeature.getKaraokeLatency();
        } catch (RemoteException e10) {
            LiteavLog.e(TAG, "getKaraokeLatency,RemoteException ex : %s", e10.getMessage());
            return -1;
        }
    }

    protected void initialize(Context context) {
        if (context == null) {
            return;
        }
        if (DaisyFeatureKitManager.isAudioKitSupport(context)) {
            bindService(context);
        } else {
            this.mFeatureKitManager.onCallBack(2);
        }
    }

    public boolean isKaraokeFeatureSupport() {
        try {
            IDaisyAudioKaraokeFeature iDaisyAudioKaraokeFeature = this.mIHwAudioKaraokeFeatureAidl;
            if (iDaisyAudioKaraokeFeature != null && this.mIsServiceConnected) {
                return iDaisyAudioKaraokeFeature.isKaraokeFeatureSupport();
            }
        } catch (RemoteException e10) {
            LiteavLog.e(TAG, "isFeatureSupported,RemoteException ex : %s", e10.getMessage());
        }
        return false;
    }

    public int setParameter(ParameName parameName, int i10) {
        if (parameName == null) {
            return 1807;
        }
        try {
            IDaisyAudioKaraokeFeature iDaisyAudioKaraokeFeature = this.mIHwAudioKaraokeFeatureAidl;
            if (iDaisyAudioKaraokeFeature == null || !this.mIsServiceConnected) {
                return -2;
            }
            return iDaisyAudioKaraokeFeature.setParameter(parameName.getParameName(), i10);
        } catch (RemoteException e10) {
            LiteavLog.e(TAG, "setParameter,RemoteException ex : %s", e10.getMessage());
            return -2;
        }
    }
}
