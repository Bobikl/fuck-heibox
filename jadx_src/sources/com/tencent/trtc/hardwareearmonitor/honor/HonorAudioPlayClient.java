package com.tencent.trtc.hardwareearmonitor.honor;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public class HonorAudioPlayClient extends HonorAudioFeaturesKit {
    private static final String ENGINE_CLASS_NAME = "com.hihonor.android.magicx.media.audioengine.HnAudioPlayServiceImpl";
    private static final String TAG = "HnAudioEngine.HnAudioPlayClient";
    private Context mContext;
    private HonorFeatureKitManager mFeatureKitManager;
    private IHonorAudioPlayService mHnAudioPlayService;
    private boolean mIsServiceConnected = false;
    private IBinder mService = null;
    private ServiceConnection mConnection = new ServiceConnection() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HonorAudioPlayClient.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            HonorLogUtils.info(HonorAudioPlayClient.TAG, "onServiceConnected");
            HonorAudioPlayClient.this.mHnAudioPlayService = IHonorAudioPlayService.Stub.asInterface(iBinder);
            if (HonorAudioPlayClient.this.mHnAudioPlayService != null) {
                HonorAudioPlayClient.this.mIsServiceConnected = true;
                HonorAudioPlayClient honorAudioPlayClient = HonorAudioPlayClient.this;
                honorAudioPlayClient.serviceInit(honorAudioPlayClient.mContext.getPackageName());
                HonorAudioPlayClient.this.serviceLinkToDeath(iBinder);
                HonorAudioPlayClient.this.mFeatureKitManager.onCallBack(3000);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            HonorLogUtils.info(HonorAudioPlayClient.TAG, "onServiceDisconnected");
            HonorAudioPlayClient.this.mIsServiceConnected = false;
            if (HonorAudioPlayClient.this.mFeatureKitManager != null) {
                HonorAudioPlayClient.this.mFeatureKitManager.onCallBack(3001);
            }
        }
    };
    private IBinder.DeathRecipient mDeathRecipient = new IBinder.DeathRecipient() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HonorAudioPlayClient.2
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            HonorAudioPlayClient.this.mService.unlinkToDeath(HonorAudioPlayClient.this.mDeathRecipient, 0);
            HonorAudioPlayClient.this.mFeatureKitManager.onCallBack(3004);
            HonorLogUtils.error(HonorAudioPlayClient.TAG, "service binder died");
            HonorAudioPlayClient.this.mService = null;
        }
    };

    public HonorAudioPlayClient(Context context) {
        this.mFeatureKitManager = null;
        this.mFeatureKitManager = HonorFeatureKitManager.getInstance();
        this.mContext = context;
    }

    private void bindService(Context context) {
        HonorLogUtils.info(TAG, "bindService");
        HonorFeatureKitManager honorFeatureKitManager = this.mFeatureKitManager;
        if (honorFeatureKitManager == null || this.mIsServiceConnected) {
            return;
        }
        honorFeatureKitManager.bindService(context, this.mConnection, ENGINE_CLASS_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serviceInit(String str) {
        HonorLogUtils.info(TAG, "HnAudioPlayClient serviceInit");
        try {
            IHonorAudioPlayService iHonorAudioPlayService = this.mHnAudioPlayService;
            if (iHonorAudioPlayService == null || !this.mIsServiceConnected) {
                return;
            }
            iHonorAudioPlayService.init(str);
        } catch (RemoteException e10) {
            HonorLogUtils.error(TAG, "HnAudioPlayClient isSupported,RemoteException ex :" + e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serviceLinkToDeath(IBinder iBinder) {
        this.mService = iBinder;
        if (iBinder != null) {
            try {
                iBinder.linkToDeath(this.mDeathRecipient, 0);
            } catch (RemoteException unused) {
                this.mFeatureKitManager.onCallBack(3003);
                HonorLogUtils.error(TAG, "serviceLinkToDeath, RemoteException");
            }
        }
    }

    @Override // com.tencent.trtc.hardwareearmonitor.honor.HonorAudioFeaturesKit
    public void destroy() {
        super.destroy();
        HonorLogUtils.info(TAG, "destroy, mIsServiceConnected = " + this.mIsServiceConnected);
        if (this.mIsServiceConnected) {
            this.mIsServiceConnected = false;
            this.mFeatureKitManager.unbindService(this.mContext, this.mConnection);
        }
    }

    public void enableHighSampleRatePlay(boolean z10) {
        if (HonorFeatureKitManager.mMinVersion < 1000001) {
            HonorLogUtils.error(TAG, "not support high sample rate play service. The mix version is " + HonorFeatureKitManager.mMinVersion);
            this.mFeatureKitManager.onCallBack(3002);
            return;
        }
        HonorLogUtils.info(TAG, "enableHighSampleRatePlay, enable = ".concat(String.valueOf(z10)));
        try {
            IHonorAudioPlayService iHonorAudioPlayService = this.mHnAudioPlayService;
            if (iHonorAudioPlayService == null || !this.mIsServiceConnected) {
                return;
            }
            iHonorAudioPlayService.enableHighSampleRatePlay(z10);
        } catch (RemoteException e10) {
            HonorLogUtils.error(TAG, "enableHighSampleRatePlay,RemoteException ex : " + e10.getMessage());
        }
    }

    public void initialize(Context context) {
        if (context == null) {
            HonorLogUtils.info(TAG, "initialize, context is null");
        } else if (HonorFeatureKitManager.isAudioKitSupport(context)) {
            bindService(context);
        } else {
            this.mFeatureKitManager.onCallBack(2);
            HonorLogUtils.info(TAG, "initialize, not install AudioEngine");
        }
    }
}
