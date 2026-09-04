package com.tencent.trtc.hardwareearmonitor.honor;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public class HonorEarReturnClient extends HonorAudioFeaturesKit {
    private static final String ENGINE_CLASS_NAME = "com.hihonor.android.magicx.media.audioengine.HnEarReturnServiceImpl";
    private static final String TAG = "HnAudioEngine.HnEarReturnClient";
    private Context mContext;
    private HonorFeatureKitManager mFeatureKitManager;
    private IHonorEarReturnService mHnEarReturnService;
    private boolean mIsServiceConnected = false;
    private IBinder mService = null;
    private ServiceConnection mConnection = new ServiceConnection() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            HonorLogUtils.info(HonorEarReturnClient.TAG, "onServiceConnected");
            HonorEarReturnClient.this.mHnEarReturnService = IHonorEarReturnService.Stub.asInterface(iBinder);
            if (HonorEarReturnClient.this.mHnEarReturnService != null) {
                HonorEarReturnClient.this.mIsServiceConnected = true;
                HonorEarReturnClient honorEarReturnClient = HonorEarReturnClient.this;
                honorEarReturnClient.serviceInit(honorEarReturnClient.mContext.getPackageName());
                HonorEarReturnClient.this.serviceLinkToDeath(iBinder);
                HonorEarReturnClient.this.mFeatureKitManager.onCallBack(1000);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            HonorLogUtils.info(HonorEarReturnClient.TAG, "onServiceDisconnected");
            HonorEarReturnClient.this.mIsServiceConnected = false;
            if (HonorEarReturnClient.this.mFeatureKitManager != null) {
                HonorEarReturnClient.this.mFeatureKitManager.onCallBack(1001);
            }
        }
    };
    private IBinder.DeathRecipient mDeathRecipient = new IBinder.DeathRecipient() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient.2
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            HonorLogUtils.error(HonorEarReturnClient.TAG, "binderDied");
            HonorEarReturnClient.this.mService.unlinkToDeath(HonorEarReturnClient.this.mDeathRecipient, 0);
            HonorEarReturnClient.this.mFeatureKitManager.onCallBack(1003);
            HonorEarReturnClient.this.mService = null;
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

    public HonorEarReturnClient(Context context) {
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

    private int getEarReturnLatency() {
        HonorLogUtils.info(TAG, "getEarReturnLatency");
        try {
            IHonorEarReturnService iHonorEarReturnService = this.mHnEarReturnService;
            if (iHonorEarReturnService == null || !this.mIsServiceConnected) {
                return -1;
            }
            return iHonorEarReturnService.getEarReturnLatency();
        } catch (RemoteException e10) {
            HonorLogUtils.error(TAG, "getEarReturnLatency,RemoteException ex : " + e10.getMessage());
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serviceInit(String str) {
        try {
            IHonorEarReturnService iHonorEarReturnService = this.mHnEarReturnService;
            if (iHonorEarReturnService == null || !this.mIsServiceConnected) {
                return;
            }
            iHonorEarReturnService.init(str);
        } catch (RemoteException e10) {
            HonorLogUtils.error(TAG, "isSupported,RemoteException ex :" + e10.getMessage());
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

    public int enableEarReturn(boolean z10) {
        HonorLogUtils.info(TAG, "enableEarReturn, enable = ".concat(String.valueOf(z10)));
        try {
            IHonorEarReturnService iHonorEarReturnService = this.mHnEarReturnService;
            if (iHonorEarReturnService == null || !this.mIsServiceConnected) {
                return -2;
            }
            return iHonorEarReturnService.enableEarReturn(z10);
        } catch (RemoteException e10) {
            HonorLogUtils.error(TAG, "enableEarReturn,RemoteException ex : " + e10.getMessage());
            return -2;
        }
    }

    public void initialize(Context context) {
        HonorLogUtils.info(TAG, "initialize");
        if (context == null) {
            HonorLogUtils.info(TAG, "initialize, context is null");
        } else if (HonorFeatureKitManager.isAudioKitSupport(context)) {
            bindService(context);
        } else {
            this.mFeatureKitManager.onCallBack(2);
            HonorLogUtils.info(TAG, "initialize, not install AudioEngine");
        }
    }

    @Override // com.tencent.trtc.hardwareearmonitor.honor.HonorAudioFeaturesKit
    public boolean isServiceSupported() {
        StringBuilder sb2 = new StringBuilder("isSupported, type = ");
        HonorAudioClient.ServiceType serviceType = HonorAudioClient.ServiceType.HNAUDIO_SERVICE_EARRETURN;
        sb2.append(serviceType.getServiceType());
        HonorLogUtils.info(TAG, sb2.toString());
        try {
            IHonorEarReturnService iHonorEarReturnService = this.mHnEarReturnService;
            if (iHonorEarReturnService != null && this.mIsServiceConnected) {
                return iHonorEarReturnService.isSupported(serviceType.getServiceType());
            }
        } catch (RemoteException e10) {
            HonorLogUtils.error(TAG, "isSupported,RemoteException ex : " + e10.getMessage());
        }
        return super.isServiceSupported();
    }

    public int setParameter(ParameName parameName, int i10) {
        if (parameName == null) {
            return 1807;
        }
        try {
            HonorLogUtils.info(TAG, "parameValue =" + i10 + ", parame.getParameName() =" + parameName.getParameName());
            IHonorEarReturnService iHonorEarReturnService = this.mHnEarReturnService;
            if (iHonorEarReturnService == null || !this.mIsServiceConnected) {
                return -2;
            }
            return iHonorEarReturnService.setParameter(parameName.getParameName(), i10);
        } catch (RemoteException e10) {
            HonorLogUtils.error(TAG, "setParameter,RemoteException ex : " + e10.getMessage());
            return -2;
        }
    }
}
