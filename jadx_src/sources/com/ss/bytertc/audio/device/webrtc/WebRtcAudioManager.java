package com.ss.bytertc.audio.device.webrtc;

import android.media.AudioManager;
import android.media.AudioManager$AudioRecordingCallback;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;
import com.ss.bytertc.audio.device.webrtc.observer.MicMuteChangedObserver;
import com.ss.bytertc.audio.device.webrtc.observer.VolumeChangedObserver;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class WebRtcAudioManager implements VolumeChangedObserver.OnVolumeChangedListener, MicMuteChangedObserver.OnMicMuteChangedListener {
    private static final int BITS_PER_SAMPLE = 16;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_FRAME_PER_BUFFER = 256;
    private static int MAX_VOLUMED = 0;
    private static int MAX_VOLUMED_VOIP = 0;
    private static final String TAG = "WebRtcAudioManager";
    private static final boolean blacklistDeviceForAAudioUsage = false;
    private static boolean blacklistDeviceForOpenSLESUsage;
    private static boolean blacklistDeviceForOpenSLESUsageIsOverridden;
    private static boolean useStereoInput;
    private static boolean useStereoOutput;
    private boolean aAudio;
    private int apiLevel;
    private final AudioManager audioManager;
    private boolean hardwareAEC;
    private boolean hardwareAGC;
    private boolean hardwareNS;
    private boolean initialized;
    private int inputBufferSize;
    private int inputChannels;
    private Set<NativeRecordCallbackInfo> lastRecordcallbackInfos;
    private boolean lowLatencyInput;
    private boolean lowLatencyOutput;
    private WebRtcAudioEarBack mByteAudioEarback;
    private MicMuteChangedObserver mMicMuteChangedObserver;
    private VolumeChangedObserver mVolumeChangedObserver;
    private long nativeAudioManager;
    private int nativeChannels;
    private int nativeSampleRate;
    private int outputBufferSize;
    private int outputChannels;
    private boolean proAudio;
    private int sampleRate;
    private int preferAudioLayer = 0;
    private AudioManagerRecordingCallback recordingCallback = null;
    private AudioManagerPhoneStateListener phoneStateListener = null;
    private int microphoneVolume = 100;

    public class AudioManagerPhoneStateListener extends PhoneStateListener {
        private int callState = 0;

        public AudioManagerPhoneStateListener() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i10, String str) {
            synchronized (WebRtcAudioManager.this) {
                int i11 = this.callState;
                this.callState = i10;
                RXLogging.i(WebRtcAudioManager.TAG, "onCallStateChanged, from: " + i11 + ", to: " + i10);
                if (i10 != 0) {
                    if ((i10 == 1 || i10 == 2) && i11 == 0) {
                        if (WebRtcAudioManager.this.nativeAudioManager != 0) {
                            RXLogging.i(WebRtcAudioManager.TAG, "startPhoneCall");
                            WebRtcAudioManager webRtcAudioManager = WebRtcAudioManager.this;
                            webRtcAudioManager.nativeOnPhoneCallStart(webRtcAudioManager.nativeAudioManager);
                        } else {
                            RXLogging.e(WebRtcAudioManager.TAG, "nativeAudioManager is null");
                        }
                    }
                } else if (i11 == 1 || i11 == 2) {
                    if (WebRtcAudioManager.this.nativeAudioManager != 0) {
                        RXLogging.i(WebRtcAudioManager.TAG, "endPhoneCall");
                        WebRtcAudioManager webRtcAudioManager2 = WebRtcAudioManager.this;
                        webRtcAudioManager2.nativeOnPhoneCallEnd(webRtcAudioManager2.nativeAudioManager);
                    } else {
                        RXLogging.e(WebRtcAudioManager.TAG, "nativeAudioManager is null");
                    }
                }
            }
        }

        @Override // android.telephony.PhoneStateListener
        public void onServiceStateChanged(ServiceState serviceState) {
        }
    }

    public class AudioManagerRecordingCallback extends AudioManager$AudioRecordingCallback {
        private WebRtcAudioManager manager;

        AudioManagerRecordingCallback(WebRtcAudioManager webRtcAudioManager) {
            this.manager = webRtcAudioManager;
        }

        @Override // android.media.AudioManager$AudioRecordingCallback
        public void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
            super.onRecordingConfigChanged(list);
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < list.size(); i10++) {
                AudioRecordingConfiguration audioRecordingConfiguration = list.get(i10);
                NativeRecordCallbackInfo nativeRecordCallbackInfo = new NativeRecordCallbackInfo();
                nativeRecordCallbackInfo.audio_session_id = audioRecordingConfiguration.getClientAudioSessionId();
                nativeRecordCallbackInfo.client_audio_source = audioRecordingConfiguration.getClientAudioSource();
                int i11 = Build.VERSION.SDK_INT;
                int i12 = -1;
                nativeRecordCallbackInfo.audio_source = i11 >= 29 ? audioRecordingConfiguration.getAudioSource() : -1;
                if (i11 >= 29) {
                    i12 = audioRecordingConfiguration.isClientSilenced() ? 1 : 0;
                }
                nativeRecordCallbackInfo.is_client_silenced = i12;
                hashSet.add(nativeRecordCallbackInfo);
            }
            synchronized (this.manager) {
                if (WebRtcAudioManager.this.nativeAudioManager != 0 && (WebRtcAudioManager.this.lastRecordcallbackInfos == null || !WebRtcAudioManager.this.lastRecordcallbackInfos.equals(hashSet))) {
                    WebRtcAudioManager.this.nativeRecordCallbackChanged(hashSet.toArray(new NativeRecordCallbackInfo[hashSet.size()]), WebRtcAudioManager.this.nativeAudioManager);
                    WebRtcAudioManager.this.lastRecordcallbackInfos = hashSet;
                }
            }
        }
    }

    public static final class NativeAudioLayer {
        public static final int kAndroidAAudioAudio = 8;
        public static final int kAndroidJavaAudio = 5;
        public static final int kAndroidJavaInputAndAAudioOutputAudio = 9;
        public static final int kAndroidJavaInputAndOpenSLESOutputAudio = 7;
        public static final int kAndroidOpenSLESAudio = 6;
        public static final int kPlatformDefaultAudio = 0;

        private NativeAudioLayer() {
        }
    }

    public final class NativeRecordCallbackInfo {
        private int audio_session_id;
        private int audio_source;
        private int client_audio_source;
        private int is_client_silenced;

        private NativeRecordCallbackInfo() {
            this.audio_session_id = -1;
            this.client_audio_source = -1;
            this.audio_source = -1;
            this.is_client_silenced = -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || NativeRecordCallbackInfo.class != obj.getClass()) {
                return false;
            }
            NativeRecordCallbackInfo nativeRecordCallbackInfo = (NativeRecordCallbackInfo) obj;
            return this.audio_session_id == nativeRecordCallbackInfo.audio_session_id && this.client_audio_source == nativeRecordCallbackInfo.client_audio_source && this.audio_source == nativeRecordCallbackInfo.audio_source && this.is_client_silenced == nativeRecordCallbackInfo.is_client_silenced;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.audio_session_id), Integer.valueOf(this.client_audio_source), Integer.valueOf(this.audio_source), Integer.valueOf(this.is_client_silenced));
        }
    }

    WebRtcAudioManager(long j10) {
        synchronized (this) {
            RXLogging.i(TAG, "ctor(" + this + ")" + WebRtcAudioUtils.getThreadInfo());
            this.nativeAudioManager = j10;
            AudioManager audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
            this.audioManager = audioManager;
            MAX_VOLUMED = audioManager.getStreamMaxVolume(3);
            MAX_VOLUMED_VOIP = audioManager.getStreamMaxVolume(0);
            refreshAudioParameters();
            WebRtcAudioUtils.logAudioState(TAG);
        }
    }

    private int SetAudioMode(int i10) {
        RXLogging.i(TAG, "SetAudioMode enter");
        try {
            if (i10 == getMode()) {
                return 0;
            }
            this.audioManager.setMode(i10);
            RXLogging.i(TAG, "SetAudioMode leave");
            return 0;
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    private static void assertTrue(boolean z10) {
        if (!z10) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private int earBackEnable(boolean z10) {
        WebRtcAudioEarBack webRtcAudioEarBack = this.mByteAudioEarback;
        if (webRtcAudioEarBack != null) {
            return webRtcAudioEarBack.ByteAudioEarBackEnable(z10);
        }
        return -1;
    }

    private boolean earBackGetIsSupport() {
        WebRtcAudioEarBack webRtcAudioEarBack = this.mByteAudioEarback;
        if (webRtcAudioEarBack != null) {
            return webRtcAudioEarBack.ByteAudioEarBackSupport();
        }
        return false;
    }

    private int earBackGetLatency() {
        WebRtcAudioEarBack webRtcAudioEarBack = this.mByteAudioEarback;
        if (webRtcAudioEarBack != null) {
            return webRtcAudioEarBack.ByteAudioEarBackGetLatency();
        }
        return -1;
    }

    private void earBackInit() {
        if (this.mByteAudioEarback == null) {
            this.mByteAudioEarback = new WebRtcAudioEarBack(this);
        }
        this.mByteAudioEarback.ByteAudioEarBackInit();
    }

    private int earBackSetEffect(int i10) {
        WebRtcAudioEarBack webRtcAudioEarBack = this.mByteAudioEarback;
        if (webRtcAudioEarBack == null) {
            return 0;
        }
        webRtcAudioEarBack.ByteAudioEarBackEffect(i10);
        return 0;
    }

    private int earBackSetEqualizer(int i10) {
        WebRtcAudioEarBack webRtcAudioEarBack = this.mByteAudioEarback;
        if (webRtcAudioEarBack == null) {
            return 0;
        }
        webRtcAudioEarBack.ByteAudioEarBackEqualizer(i10);
        return 0;
    }

    private int earBackSetVolume(int i10) {
        WebRtcAudioEarBack webRtcAudioEarBack = this.mByteAudioEarback;
        if (webRtcAudioEarBack == null) {
            return 0;
        }
        webRtcAudioEarBack.ByteAudioEarBackSetVolume(i10);
        return 0;
    }

    private int[] getActiveRecordingSessionIds() {
        AudioManager audioManager = this.audioManager;
        if (Build.VERSION.SDK_INT < 24 || audioManager == null) {
            return new int[0];
        }
        try {
            List activeRecordingConfigurations = audioManager.getActiveRecordingConfigurations();
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < activeRecordingConfigurations.size(); i10++) {
                AudioRecordingConfiguration audioRecordingConfiguration = (AudioRecordingConfiguration) activeRecordingConfigurations.get(i10);
                if (audioRecordingConfiguration != null) {
                    arrayList.add(Integer.valueOf(audioRecordingConfiguration.getClientAudioSessionId()));
                }
            }
            int[] iArr = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                iArr[i11] = ((Integer) arrayList.get(i11)).intValue();
            }
            return iArr;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return new int[0];
        }
    }

    private String getAudioDeviceInfo() {
        try {
            return "{ Audio State: audio mode: " + WebRtcAudioUtils.modeToString(this.audioManager.getMode()) + ", has mic: " + WebRtcAudioUtils.hasMicrophone() + ", music active: " + this.audioManager.isMusicActive() + ", speakerphone: " + this.audioManager.isSpeakerphoneOn() + ", headset: " + this.audioManager.isWiredHeadsetOn() + "BT SCO: " + this.audioManager.isBluetoothScoOn() + "music actived: " + this.audioManager.isMusicActive() + "permission: " + WebRtcAudioUtils.isPermissionGranted() + " bt_sco_available_off_call: " + this.audioManager.isBluetoothScoAvailableOffCall() + " }";
        } catch (Exception e10) {
            StringWriter stringWriter = new StringWriter();
            e10.printStackTrace(new PrintWriter(stringWriter));
            RXLogging.e(TAG, stringWriter.toString());
            return stringWriter.toString();
        }
    }

    private int getFixedDevicePlayVolume() {
        try {
            int mode = this.audioManager.getMode();
            int i10 = 2;
            if (mode != 0) {
                if (mode != 1) {
                    i10 = (mode == 2 || mode == 3) ? 0 : 3;
                }
            }
            return (int) ((((double) this.audioManager.getStreamVolume(i10)) * 100.0d) / ((double) this.audioManager.getStreamMaxVolume(i10)));
        } catch (Exception e10) {
            StringWriter stringWriter = new StringWriter();
            e10.printStackTrace(new PrintWriter(stringWriter));
            RXLogging.e(TAG, stringWriter.toString());
            return -1;
        }
    }

    private int getFixedDeviceRecordVolume() {
        return this.microphoneVolume;
    }

    private int getLowLatencyInputFramesPerBuffer() {
        return getLowLatencyOutputFramesPerBuffer();
    }

    private int getLowLatencyOutputFramesPerBuffer() {
        String property;
        if (!isLowLatencyOutputSupported()) {
            return 256;
        }
        try {
            property = this.audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        } catch (Exception e10) {
            StringWriter stringWriter = new StringWriter();
            e10.printStackTrace(new PrintWriter(stringWriter));
            RXLogging.e(TAG, stringWriter.toString());
            property = "";
        }
        if (property == null) {
            return 256;
        }
        return Integer.parseInt(property);
    }

    private static int getMinInputFrameSize(int i10, int i11) {
        return AudioRecord.getMinBufferSize(i10, i11 == 1 ? 16 : 12, 2) / (i11 * 2);
    }

    private static int getMinOutputFrameSize(int i10, int i11) {
        return AudioTrack.getMinBufferSize(i10, i11 == 1 ? 4 : 12, 2) / (i11 * 2);
    }

    private int getMode() {
        try {
            return this.audioManager.getMode();
        } catch (Exception e10) {
            StringWriter stringWriter = new StringWriter();
            e10.printStackTrace(new PrintWriter(stringWriter));
            RXLogging.e(TAG, stringWriter.toString());
            return -1;
        }
    }

    private int getNativeOutputSampleRate() {
        if (WebRtcAudioUtils.runningOnEmulator()) {
            RXLogging.i(TAG, "Running emulator, overriding sample rate to 8 kHz.");
            return 8000;
        }
        if (WebRtcAudioUtils.isDefaultSampleRateOverridden()) {
            RXLogging.i(TAG, "Default sample rate is overriden to " + WebRtcAudioUtils.getDefaultSampleRateHz() + " Hz");
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        }
        int defaultSampleRateHz = WebRtcAudioUtils.getDefaultSampleRateHz();
        RXLogging.i(TAG, "Sample rate is set to " + defaultSampleRateHz + " Hz");
        return defaultSampleRateHz;
    }

    private int getPreferAudioLayer() {
        return 0;
    }

    private int getSampleRateForApiLevel() {
        String property;
        try {
            property = this.audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        } catch (Exception e10) {
            StringWriter stringWriter = new StringWriter();
            e10.printStackTrace(new PrintWriter(stringWriter));
            RXLogging.e(TAG, stringWriter.toString());
            property = "";
        }
        return property == null ? WebRtcAudioUtils.getDefaultSampleRateHz() : Integer.parseInt(property);
    }

    public static synchronized boolean getStereoInput() {
        return useStereoInput;
    }

    public static synchronized boolean getStereoOutput() {
        return useStereoOutput;
    }

    private boolean hasEarpiece() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x008f A[Catch: Exception -> 0x00a7, all -> 0x00f1, TryCatch #2 {Exception -> 0x00a7, blocks: (B:18:0x0086, B:20:0x008f, B:23:0x00a4, B:22:0x009b), top: B:44:0x0086, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x009b A[Catch: Exception -> 0x00a7, all -> 0x00f1, TryCatch #2 {Exception -> 0x00a7, blocks: (B:18:0x0086, B:20:0x008f, B:23:0x00a4, B:22:0x009b), top: B:44:0x0086, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ce  */
    private boolean init() {
        int i10;
        boolean zIsMicrophoneMute;
        int mode;
        synchronized (this) {
            RXLogging.i(TAG, "init(" + this + ")" + WebRtcAudioUtils.getThreadInfo());
            if (this.initialized) {
                return true;
            }
            RXLogging.i(TAG, "audio mode is: " + WebRtcAudioUtils.modeToString(this.audioManager.getMode()));
            if (Build.VERSION.SDK_INT >= 24 && this.recordingCallback == null) {
                AudioManagerRecordingCallback audioManagerRecordingCallback = new AudioManagerRecordingCallback(this);
                this.recordingCallback = audioManagerRecordingCallback;
                try {
                    this.audioManager.registerAudioRecordingCallback(audioManagerRecordingCallback, null);
                } catch (Exception e10) {
                    StringWriter stringWriter = new StringWriter();
                    e10.printStackTrace(new PrintWriter(stringWriter));
                    RXLogging.e(TAG, stringWriter.toString());
                }
                registerPhoneStateListener(32);
                this.mVolumeChangedObserver = new VolumeChangedObserver(this);
                i10 = 0;
                mode = this.audioManager.getMode();
                if (mode == 0) {
                    onVolumeChanged(3, this.audioManager.getStreamVolume(3));
                } else if (mode == 3) {
                    onVolumeChanged(0, this.audioManager.getStreamVolume(0));
                }
                this.initialized = true;
                this.mMicMuteChangedObserver = new MicMuteChangedObserver(this);
                zIsMicrophoneMute = this.audioManager.isMicrophoneMute();
                if (zIsMicrophoneMute) {
                    i10 = 100;
                }
                this.microphoneVolume = i10;
                nativeOnMicMuteChanged(zIsMicrophoneMute, this.nativeAudioManager);
                return true;
            }
            registerPhoneStateListener(32);
            this.mVolumeChangedObserver = new VolumeChangedObserver(this);
            i10 = 0;
            try {
                mode = this.audioManager.getMode();
                if (mode == 0) {
                    onVolumeChanged(3, this.audioManager.getStreamVolume(3));
                } else if (mode == 3) {
                    onVolumeChanged(0, this.audioManager.getStreamVolume(0));
                }
                this.initialized = true;
            } catch (Exception e11) {
                StringWriter stringWriter2 = new StringWriter();
                e11.printStackTrace(new PrintWriter(stringWriter2));
                RXLogging.e(TAG, stringWriter2.toString());
            }
            this.mMicMuteChangedObserver = new MicMuteChangedObserver(this);
            try {
                zIsMicrophoneMute = this.audioManager.isMicrophoneMute();
                if (zIsMicrophoneMute) {
                    i10 = 100;
                }
                this.microphoneVolume = i10;
                nativeOnMicMuteChanged(zIsMicrophoneMute, this.nativeAudioManager);
            } catch (Exception e12) {
                StringWriter stringWriter3 = new StringWriter();
                e12.printStackTrace(new PrintWriter(stringWriter3));
                RXLogging.e(TAG, stringWriter3.toString());
            }
            return true;
            throw th;
        }
    }

    private boolean isAAudioSupported() {
        return Build.VERSION.SDK_INT >= 28;
    }

    private static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    private boolean isCommunicationModeEnabled() {
        try {
            return 3 == this.audioManager.getMode();
        } catch (Exception e10) {
            StringWriter stringWriter = new StringWriter();
            e10.printStackTrace(new PrintWriter(stringWriter));
            RXLogging.e(TAG, stringWriter.toString());
            return false;
        }
    }

    private boolean isDeviceBlacklistedForOpenSLESUsage() {
        boolean zDeviceIsBlacklistedForOpenSLESUsage = blacklistDeviceForOpenSLESUsageIsOverridden ? blacklistDeviceForOpenSLESUsage : WebRtcAudioUtils.deviceIsBlacklistedForOpenSLESUsage();
        if (zDeviceIsBlacklistedForOpenSLESUsage) {
            RXLogging.i(TAG, Build.MODEL + " is blacklisted for OpenSL ES usage!");
        }
        return zDeviceIsBlacklistedForOpenSLESUsage;
    }

    private boolean isLowLatencyOutputSupported() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    private static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    private boolean isPermissionGranted() {
        return WebRtcAudioUtils.isPermissionGranted();
    }

    private boolean isProAudioSupported() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.pro");
    }

    private boolean isRecordShouldUseVoiceRecognition() {
        return Build.BRAND.equals("samsung");
    }

    private boolean isWiredHeadsetOn() {
        try {
            return this.audioManager.isWiredHeadsetOn();
        } catch (Exception e10) {
            StringWriter stringWriter = new StringWriter();
            e10.printStackTrace(new PrintWriter(stringWriter));
            RXLogging.e(TAG, stringWriter.toString());
            return false;
        }
    }

    private native void nativeCacheAudioParameters(int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i14, int i15, int i16, long j10);

    private native void nativeOnHardwareEarbackReleased(boolean z10, long j10);

    private native void nativeOnHardwareEarbackSupportParamsGet(String str, long j10);

    private native void nativeOnHardwareEarbackSupported(boolean z10, long j10);

    private native void nativeOnMicMuteChanged(boolean z10, long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnPhoneCallEnd(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnPhoneCallStart(long j10);

    private native void nativeOnPhoneStateListenerRegisterChanged(boolean z10, long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeRecordCallbackChanged(Object[] objArr, long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyPhoneStateListenerRegistered(boolean z10) {
        synchronized (this) {
            if (this.nativeAudioManager != 0) {
                RXLogging.i(TAG, "dixing: notifyPhoneStateListenerRegistered: " + z10 + ", " + this.nativeAudioManager);
                nativeOnPhoneStateListenerRegisterChanged(z10, this.nativeAudioManager);
            }
        }
    }

    private native void onVolumeChanged(int i10, int i11, long j10);

    private void refreshAudioParameters() {
        storeAudioParameters();
        nativeCacheAudioParameters(this.apiLevel, this.sampleRate, this.outputChannels, this.inputChannels, this.hardwareAEC, this.hardwareAGC, this.hardwareNS, this.lowLatencyOutput, this.lowLatencyInput, this.proAudio, this.aAudio, this.outputBufferSize, this.inputBufferSize, this.preferAudioLayer, this.nativeAudioManager);
    }

    private void registerPhoneStateListener(final int i10) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ss.bytertc.audio.device.webrtc.WebRtcAudioManager.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (WebRtcAudioManager.this.phoneStateListener == null) {
                        WebRtcAudioManager.this.phoneStateListener = WebRtcAudioManager.this.new AudioManagerPhoneStateListener();
                    }
                    if (i10 == 0) {
                        WebRtcAudioManager.this.notifyPhoneStateListenerRegistered(false);
                    }
                    TelephonyManager telephonyManager = (TelephonyManager) ContextUtils.getApplicationContext().getSystemService(g0.a.f118921e);
                    if (telephonyManager != null) {
                        telephonyManager.listen(WebRtcAudioManager.this.phoneStateListener, i10);
                    }
                    if (i10 == 32) {
                        WebRtcAudioManager.this.notifyPhoneStateListenerRegistered(true);
                    }
                    RXLogging.i(WebRtcAudioManager.TAG, "registerPhoneStateListener success with event: " + i10);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    RXLogging.e(WebRtcAudioManager.TAG, "registerPhoneStateListener (" + i10 + "), error: " + th2.getCause() + ", " + th2.getMessage());
                }
            }
        });
    }

    public static synchronized void setBlacklistDeviceForOpenSLESUsage(boolean z10) {
        blacklistDeviceForOpenSLESUsageIsOverridden = true;
        blacklistDeviceForOpenSLESUsage = z10;
    }

    public static synchronized void setStereoInput(boolean z10) {
        RXLogging.w(TAG, "Overriding default input behavior: setStereoInput(" + z10 + ')');
        useStereoInput = z10;
    }

    public static synchronized void setStereoOutput(boolean z10) {
        RXLogging.w(TAG, "Overriding default output behavior: setStereoOutput(" + z10 + ')');
        useStereoOutput = z10;
    }

    private void storeAudioParameters() {
        this.apiLevel = Build.VERSION.SDK_INT;
        this.outputChannels = getStereoOutput() ? 2 : 1;
        this.inputChannels = getStereoInput() ? 2 : 1;
        this.sampleRate = getNativeOutputSampleRate();
        this.hardwareAEC = isAcousticEchoCancelerSupported();
        this.hardwareAGC = false;
        this.hardwareNS = isNoiseSuppressorSupported();
        this.lowLatencyOutput = isLowLatencyOutputSupported();
        this.lowLatencyInput = isLowLatencyInputSupported();
        this.proAudio = isProAudioSupported();
        this.aAudio = isAAudioSupported();
        this.outputBufferSize = this.lowLatencyOutput ? getLowLatencyOutputFramesPerBuffer() : getMinOutputFrameSize(this.sampleRate, this.outputChannels);
        this.inputBufferSize = this.lowLatencyInput ? getLowLatencyInputFramesPerBuffer() : getMinInputFrameSize(this.sampleRate, this.inputChannels);
        this.preferAudioLayer = getPreferAudioLayer();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0055 A[Catch: all -> 0x0074, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x002a, B:7:0x002e, B:11:0x004b, B:10:0x0035, B:12:0x004d, B:14:0x0055, B:15:0x005a, B:17:0x005e, B:18:0x0063, B:20:0x0067, B:21:0x006c, B:22:0x0072), top: B:27:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x005e A[Catch: all -> 0x0074, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x002a, B:7:0x002e, B:11:0x004b, B:10:0x0035, B:12:0x004d, B:14:0x0055, B:15:0x005a, B:17:0x005e, B:18:0x0063, B:20:0x0067, B:21:0x006c, B:22:0x0072), top: B:27:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0067 A[Catch: all -> 0x0074, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x002a, B:7:0x002e, B:11:0x004b, B:10:0x0035, B:12:0x004d, B:14:0x0055, B:15:0x005a, B:17:0x005e, B:18:0x0063, B:20:0x0067, B:21:0x006c, B:22:0x0072), top: B:27:0x0001, inners: #1 }] */
    private void terminate() {
        VolumeChangedObserver volumeChangedObserver;
        MicMuteChangedObserver micMuteChangedObserver;
        WebRtcAudioEarBack webRtcAudioEarBack;
        AudioManagerRecordingCallback audioManagerRecordingCallback;
        synchronized (this) {
            RXLogging.i(TAG, "terminate(" + this + ")" + WebRtcAudioUtils.getThreadInfo());
            if (Build.VERSION.SDK_INT < 24 || (audioManagerRecordingCallback = this.recordingCallback) == null) {
                registerPhoneStateListener(0);
                volumeChangedObserver = this.mVolumeChangedObserver;
                if (volumeChangedObserver != null) {
                    volumeChangedObserver.release();
                    this.mVolumeChangedObserver = null;
                }
                micMuteChangedObserver = this.mMicMuteChangedObserver;
                if (micMuteChangedObserver != null) {
                    micMuteChangedObserver.release();
                    this.mMicMuteChangedObserver = null;
                }
                webRtcAudioEarBack = this.mByteAudioEarback;
                if (webRtcAudioEarBack != null) {
                    webRtcAudioEarBack.ByteAudioEarBackRelease();
                    this.mByteAudioEarback = null;
                }
                this.nativeAudioManager = 0L;
                this.initialized = false;
            } else {
                try {
                    this.audioManager.unregisterAudioRecordingCallback(audioManagerRecordingCallback);
                } catch (Exception e10) {
                    StringWriter stringWriter = new StringWriter();
                    e10.printStackTrace(new PrintWriter(stringWriter));
                    RXLogging.e(TAG, stringWriter.toString());
                }
                this.recordingCallback = null;
                registerPhoneStateListener(0);
                volumeChangedObserver = this.mVolumeChangedObserver;
                if (volumeChangedObserver != null) {
                    volumeChangedObserver.release();
                    this.mVolumeChangedObserver = null;
                }
                micMuteChangedObserver = this.mMicMuteChangedObserver;
                if (micMuteChangedObserver != null) {
                    micMuteChangedObserver.release();
                    this.mMicMuteChangedObserver = null;
                }
                webRtcAudioEarBack = this.mByteAudioEarback;
                if (webRtcAudioEarBack != null) {
                    webRtcAudioEarBack.ByteAudioEarBackRelease();
                    this.mByteAudioEarback = null;
                }
                this.nativeAudioManager = 0L;
                this.initialized = false;
            }
            throw th;
        }
    }

    public boolean isLowLatencyInputSupported() {
        return isLowLatencyOutputSupported();
    }

    public void onEvent(int i10, int i11) {
        WebRtcAudioEarBack webRtcAudioEarBack = this.mByteAudioEarback;
        if (webRtcAudioEarBack != null) {
            webRtcAudioEarBack.onEvent(i10, i11);
        }
    }

    public void onHardwareEarbackReleased(boolean z10) {
        synchronized (this) {
            long j10 = this.nativeAudioManager;
            if (j10 != 0) {
                nativeOnHardwareEarbackReleased(z10, j10);
            }
        }
    }

    public void onHardwareEarbackSupportParamsGet(String str) {
        synchronized (this) {
            long j10 = this.nativeAudioManager;
            if (j10 != 0) {
                nativeOnHardwareEarbackSupportParamsGet(str, j10);
            }
        }
    }

    public void onHardwareEarbackSupported(boolean z10) {
        synchronized (this) {
            long j10 = this.nativeAudioManager;
            if (j10 != 0) {
                nativeOnHardwareEarbackSupported(z10, j10);
            }
        }
    }

    @Override // com.ss.bytertc.audio.device.webrtc.observer.MicMuteChangedObserver.OnMicMuteChangedListener
    public void onMicMuteChanged(boolean z10) {
        synchronized (this) {
            long j10 = this.nativeAudioManager;
            if (j10 != 0) {
                nativeOnMicMuteChanged(z10, j10);
            }
        }
    }

    @Override // com.ss.bytertc.audio.device.webrtc.observer.VolumeChangedObserver.OnVolumeChangedListener
    public void onVolumeChanged(int i10, int i11) {
        double d10 = ((((double) i11) * 1.0d) / ((double) (i10 == 0 ? MAX_VOLUMED_VOIP : MAX_VOLUMED))) * 100.0d;
        synchronized (this) {
            long j10 = this.nativeAudioManager;
            if (j10 != 0) {
                onVolumeChanged(i10, (int) d10, j10);
            }
        }
    }
}
