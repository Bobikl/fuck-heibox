package com.tencent.liteav.audio2;

import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.ThreadUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::audio")
public class AndroidInterruptedStateListener implements d.a, e.b {
    private static final int RECORDING_CONFIGS_LIMIT = 10;
    public static final String TAG = "AndroidInterruptedStateListener";
    private static d mRecordingCallback;
    private final long mNativeRecordingConfigListener;
    private volatile boolean mNeedNotify = false;
    private Object mObject = new Object();
    private e mPhoneStateManager;

    public static class RecordingConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f99527a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f99528b = false;

        public int getSessionId() {
            return this.f99527a;
        }

        public boolean isSilenced() {
            return this.f99528b;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 24) {
            mRecordingCallback = new d();
        }
    }

    public AndroidInterruptedStateListener(long j10) {
        this.mNativeRecordingConfigListener = j10;
        Log.d(TAG, "new AndroidInterruptedStateListener" + hashCode(), new Object[0]);
    }

    static /* synthetic */ void lambda$registerAudioRecordingCallback$0(AndroidInterruptedStateListener androidInterruptedStateListener) {
        if (androidInterruptedStateListener.mPhoneStateManager == null) {
            androidInterruptedStateListener.mPhoneStateManager = new e(androidInterruptedStateListener);
        }
        e eVar = androidInterruptedStateListener.mPhoneStateManager;
        if (e.b()) {
            try {
                TelephonyManager telephonyManager = eVar.f99536a;
                if (telephonyManager != null) {
                    telephonyManager.listen(eVar, 32);
                    return;
                } else {
                    Log.w("PhoneStateManager", "TelephonyManager is null, start listen phone state failed.", new Object[0]);
                    return;
                }
            } catch (Throwable th2) {
                Log.e("PhoneStateManager", "start listen phone state failed, " + th2.getMessage(), new Object[0]);
                return;
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31) {
            if (i10 < 26 || e.f99535c == null) {
                return;
            }
            Log.i("PhoneStateManager", "register audio playback callback.", new Object[0]);
            e.f99535c.f99533a = eVar;
            return;
        }
        try {
            if (eVar.f99538d == null) {
                eVar.f99538d = Class.forName("android.media.AudioManager$OnModeChangedListener");
            }
            if (eVar.f99539e == null) {
                eVar.f99539e = Proxy.newProxyInstance(eVar.f99538d.getClassLoader(), new Class[]{eVar.f99538d}, new e.a(eVar));
            }
            AudioManager.class.getMethod("addOnModeChangedListener", Executor.class, eVar.f99538d).invoke(eVar.f99537b, g.a(eVar), eVar.f99539e);
        } catch (Throwable th3) {
            Log.e("PhoneStateManager", "add mode changed listener failed, " + th3.getMessage(), new Object[0]);
        }
    }

    static /* synthetic */ void lambda$unregisterAudioRecordingCallback$1(AndroidInterruptedStateListener androidInterruptedStateListener) {
        e eVar = androidInterruptedStateListener.mPhoneStateManager;
        if (eVar != null) {
            if (e.b()) {
                try {
                    TelephonyManager telephonyManager = eVar.f99536a;
                    if (telephonyManager != null) {
                        telephonyManager.listen(eVar, 0);
                    }
                    eVar.f99540f = 0;
                    return;
                } catch (Throwable th2) {
                    Log.e("PhoneStateManager", "stop listen phone state failed, " + th2.getMessage(), new Object[0]);
                    return;
                }
            }
            if (Build.VERSION.SDK_INT < 31) {
                e.c();
                return;
            }
            try {
                Class<?> cls = eVar.f99538d;
                if (cls == null || eVar.f99539e == null) {
                    return;
                }
                AudioManager.class.getMethod("removeOnModeChangedListener", cls).invoke(eVar.f99537b, eVar.f99539e);
            } catch (Throwable th3) {
                Log.e("PhoneStateManager", "remove mode changed listener failed, " + th3.getMessage(), new Object[0]);
            }
        }
    }

    private static native void nativeNotifyAudioRecordingConfigChangedFromJava(long j10, RecordingConfig[] recordingConfigArr);

    private static native void nativeNotifyInterruptedByPhoneCallFromJava(long j10);

    private static native void nativeNotifyResumedByPhoneCallFromJava(long j10);

    @Override // com.tencent.liteav.audio2.d.a
    public void OnRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
        if (list == null) {
            return;
        }
        int iMin = Math.min(list.size(), 10);
        RecordingConfig[] recordingConfigArr = new RecordingConfig[iMin];
        for (int i10 = 0; i10 < iMin; i10++) {
            recordingConfigArr[i10] = new RecordingConfig();
            AudioRecordingConfiguration audioRecordingConfiguration = list.get(i10);
            recordingConfigArr[i10].f99527a = audioRecordingConfiguration.getClientAudioSessionId();
            if (LiteavSystemInfo.getSystemOSVersionInt() < 29) {
                recordingConfigArr[i10].f99528b = false;
            } else if (Build.VERSION.SDK_INT >= 29) {
                recordingConfigArr[i10].f99528b = audioRecordingConfiguration.isClientSilenced();
            }
        }
        synchronized (this.mObject) {
            if (this.mNeedNotify) {
                nativeNotifyAudioRecordingConfigChangedFromJava(this.mNativeRecordingConfigListener, recordingConfigArr);
            }
        }
    }

    @Override // com.tencent.liteav.audio2.e.b
    public void onInterruptedByPhoneCall() {
        synchronized (this.mObject) {
            if (this.mNeedNotify) {
                nativeNotifyInterruptedByPhoneCallFromJava(this.mNativeRecordingConfigListener);
            }
        }
    }

    @Override // com.tencent.liteav.audio2.e.b
    public void onResumedByPhoneCall() {
        synchronized (this.mObject) {
            if (this.mNeedNotify) {
                nativeNotifyResumedByPhoneCallFromJava(this.mNativeRecordingConfigListener);
            }
        }
    }

    public void registerAudioRecordingCallback() {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 24) {
            return;
        }
        d dVar = mRecordingCallback;
        if (dVar != null) {
            dVar.f99534a = this;
        }
        ThreadUtils.getUiThreadHandler().post(a.a(this));
        this.mNeedNotify = true;
    }

    public void unregisterAudioRecordingCallback() {
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 24 && mRecordingCallback != null) {
            synchronized (this.mObject) {
                this.mNeedNotify = false;
                mRecordingCallback.f99534a = null;
                ThreadUtils.getUiThreadHandler().post(b.a(this));
            }
        }
    }
}
