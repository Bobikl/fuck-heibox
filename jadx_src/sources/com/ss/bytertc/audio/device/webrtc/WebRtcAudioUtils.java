package com.ss.bytertc.audio.device.webrtc;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class WebRtcAudioUtils {
    private static final int DEFAULT_SAMPLE_RATE_HZ = 16000;
    private static final String RO_PRODUCT_BRAND = "ro.product.brand";
    private static final String RO_VIVO_OS_BUILD_DISPLAY_ID = "ro.vivo.os.build.display.id";
    private static final String RO_VIVO_OS_PRODUCT_VERSION = "ro.vivo.product.version";
    private static final String TAG = "WebRtcAudioUtils";
    private static boolean isDefaultSampleRateOverridden;
    private static final String[] BLACKLISTED_OPEN_SL_ES_MODELS = {"SM-G9650", "SM-G9750", "SM-N9600", "V1962A"};
    private static final String[] BLACKLISTED_AEC_MODELS = new String[0];
    private static final String[] BLACKLISTED_NS_MODELS = new String[0];
    private static int defaultSampleRateHz = 16000;
    private static boolean useWebRtcBasedAcousticEchoCanceler = false;
    private static boolean useWebRtcBasedNoiseSuppressor = false;

    public static boolean deviceIsBlacklistedForOpenSLESUsage() {
        return Arrays.asList(BLACKLISTED_OPEN_SL_ES_MODELS).contains(Build.MODEL);
    }

    private static String deviceTypeToString(int i10) {
        switch (i10) {
            case 1:
                return "TYPE_BUILTIN_EARPIECE";
            case 2:
                return "TYPE_BUILTIN_SPEAKER";
            case 3:
                return "TYPE_WIRED_HEADSET";
            case 4:
                return "TYPE_WIRED_HEADPHONES";
            case 5:
                return "TYPE_LINE_ANALOG";
            case 6:
                return "TYPE_LINE_DIGITAL";
            case 7:
                return "TYPE_BLUETOOTH_SCO";
            case 8:
                return "TYPE_BLUETOOTH_A2DP";
            case 9:
                return "TYPE_HDMI";
            case 10:
                return "TYPE_HDMI_ARC";
            case 11:
                return "TYPE_USB_DEVICE";
            case 12:
                return "TYPE_USB_ACCESSORY";
            case 13:
                return "TYPE_DOCK";
            case 14:
                return "TYPE_FM";
            case 15:
                return "TYPE_BUILTIN_MIC";
            case 16:
                return "TYPE_FM_TUNER";
            case 17:
                return "TYPE_TV_TUNER";
            case 18:
                return "TYPE_TELEPHONY";
            case 19:
                return "TYPE_AUX_LINE";
            case 20:
                return "TYPE_IP";
            case 21:
                return "TYPE_BUS";
            case 22:
                return "TYPE_USB_HEADSET";
            default:
                return "TYPE_UNKNOWN";
        }
    }

    public static List<String> getBlackListedModelsForAecUsage() {
        return Arrays.asList(BLACKLISTED_AEC_MODELS);
    }

    public static List<String> getBlackListedModelsForNsUsage() {
        return Arrays.asList(BLACKLISTED_NS_MODELS);
    }

    public static synchronized int getDefaultSampleRateHz() {
        return defaultSampleRateHz;
    }

    public static String getProductBrand() {
        return getSystemProperty(RO_PRODUCT_BRAND);
    }

    public static String getRomVersion(String str) {
        return str.toLowerCase().equals("vivo") ? getVivoRomVersion() : "";
    }

    private static String getSystemProperty(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "");
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static String getThreadInfo() {
        return "@[name=" + Thread.currentThread().getName() + ", id=" + Thread.currentThread().getId() + "]";
    }

    private static String getVivoRomVersion() {
        return getSystemProperty(RO_VIVO_OS_BUILD_DISPLAY_ID) + lg.a.f131412e + getSystemProperty(RO_VIVO_OS_PRODUCT_VERSION);
    }

    public static boolean hasMicrophone() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.microphone");
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    public static boolean isAutomaticGainControlSupported() {
        return false;
    }

    public static synchronized boolean isDefaultSampleRateOverridden() {
        return isDefaultSampleRateOverridden;
    }

    public static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    public static boolean isPermissionGranted() {
        return androidx.core.content.d.a(ContextUtils.getApplicationContext(), "android.permission.RECORD_AUDIO") == 0;
    }

    private static boolean isVolumeFixed(AudioManager audioManager) {
        return audioManager.isVolumeFixed();
    }

    private static void logAudioDeviceInfo(String str, AudioManager audioManager) {
        AudioDeviceInfo[] devices = audioManager.getDevices(3);
        if (devices.length == 0) {
            return;
        }
        RXLogging.i(str, "Audio Devices: ");
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  ");
            sb2.append(deviceTypeToString(audioDeviceInfo.getType()));
            sb2.append(audioDeviceInfo.isSource() ? "(in): " : "(out): ");
            if (audioDeviceInfo.getChannelCounts().length > 0) {
                sb2.append("channels=");
                sb2.append(Arrays.toString(audioDeviceInfo.getChannelCounts()));
                sb2.append(", ");
            }
            if (audioDeviceInfo.getEncodings().length > 0) {
                sb2.append("encodings=");
                sb2.append(Arrays.toString(audioDeviceInfo.getEncodings()));
                sb2.append(", ");
            }
            if (audioDeviceInfo.getSampleRates().length > 0) {
                sb2.append("sample rates=");
                sb2.append(Arrays.toString(audioDeviceInfo.getSampleRates()));
                sb2.append(", ");
            }
            sb2.append("id=");
            sb2.append(audioDeviceInfo.getId());
            RXLogging.i(str, sb2.toString());
        }
    }

    public static void logAudioState(String str) {
        logAudioStateBasic(str, (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio"));
    }

    private static void logAudioStateBasic(String str, AudioManager audioManager) {
        RXLogging.i(str, "Audio State: audio mode: " + modeToString(audioManager.getMode()) + ", has mic: " + hasMicrophone() + ", mic muted: " + audioManager.isMicrophoneMute() + ", music active: " + audioManager.isMusicActive() + ", speakerphone: " + audioManager.isSpeakerphoneOn() + ", BT SCO: " + audioManager.isBluetoothScoOn());
    }

    private static void logAudioStateVolume(String str, AudioManager audioManager) {
        int[] iArr = {0, 3, 2, 4, 5, 1};
        RXLogging.i(str, "Audio State: ");
        boolean zIsVolumeFixed = isVolumeFixed(audioManager);
        RXLogging.i(str, "  fixed volume=" + zIsVolumeFixed);
        if (zIsVolumeFixed) {
            return;
        }
        for (int i10 = 0; i10 < 6; i10++) {
            int i11 = iArr[i10];
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  " + streamTypeToString(i11) + ": ");
            sb2.append("volume=");
            sb2.append(audioManager.getStreamVolume(i11));
            sb2.append(", max=");
            sb2.append(audioManager.getStreamMaxVolume(i11));
            logIsStreamMute(str, audioManager, i11, sb2);
            RXLogging.i(str, sb2.toString());
        }
    }

    private static void logIsStreamMute(String str, AudioManager audioManager, int i10, StringBuilder sb2) {
        sb2.append(", muted=");
        sb2.append(audioManager.isStreamMute(i10));
    }

    public static String modeToString(int i10) {
        if (i10 == 0) {
            return "MODE_NORMAL";
        }
        if (i10 == 1) {
            return "MODE_RINGTONE";
        }
        if (i10 != 2) {
            return i10 != 3 ? "MODE_INVALID" : "MODE_IN_COMMUNICATION";
        }
        return "MODE_IN_CALL";
    }

    public static boolean runningOnEmulator() {
        return Build.HARDWARE.equals("goldfish") && Build.BRAND.startsWith("generic_");
    }

    public static synchronized void setDefaultSampleRateHz(int i10) {
        isDefaultSampleRateOverridden = true;
        defaultSampleRateHz = i10;
    }

    public static synchronized void setWebRtcBasedAcousticEchoCanceler(boolean z10) {
        useWebRtcBasedAcousticEchoCanceler = z10;
    }

    public static synchronized void setWebRtcBasedAutomaticGainControl(boolean z10) {
        RXLogging.w(TAG, "setWebRtcBasedAutomaticGainControl() is deprecated");
    }

    public static synchronized void setWebRtcBasedNoiseSuppressor(boolean z10) {
        useWebRtcBasedNoiseSuppressor = z10;
    }

    private static String streamTypeToString(int i10) {
        if (i10 == 0) {
            return "STREAM_VOICE_CALL";
        }
        if (i10 == 1) {
            return "STREAM_SYSTEM";
        }
        if (i10 == 2) {
            return "STREAM_RING";
        }
        if (i10 == 3) {
            return "STREAM_MUSIC";
        }
        if (i10 != 4) {
            return i10 != 5 ? "STREAM_INVALID" : "STREAM_NOTIFICATION";
        }
        return "STREAM_ALARM";
    }

    public static synchronized boolean useWebRtcBasedAcousticEchoCanceler() {
        if (useWebRtcBasedAcousticEchoCanceler) {
            RXLogging.w(TAG, "Overriding default behavior; now using WebRTC AEC!");
        }
        return useWebRtcBasedAcousticEchoCanceler;
    }

    public static synchronized boolean useWebRtcBasedAutomaticGainControl() {
        return true;
    }

    public static synchronized boolean useWebRtcBasedNoiseSuppressor() {
        if (useWebRtcBasedNoiseSuppressor) {
            RXLogging.w(TAG, "Overriding default behavior; now using WebRTC NS!");
        }
        return useWebRtcBasedNoiseSuppressor;
    }
}
