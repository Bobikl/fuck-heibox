package com.ss.bytertc.audio.device.webrtc;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import androidx.annotation.p0;
import com.bytedance.realx.base.RXLogging;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public class WebRtcAudioEffects {
    private static final boolean DEBUG = false;
    private static final String TAG = "WebRtcAudioEffects";

    @p0
    private static AudioEffect.Descriptor[] cachedEffects;

    @p0
    private AcousticEchoCanceler aec;

    @p0
    private NoiseSuppressor ns;
    private boolean shouldEnableAec;
    private boolean shouldEnableNs;
    private static Map<String, List<String>> audioEffectBlackList = new HashMap();
    private static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    private static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");

    private WebRtcAudioEffects() {
        RXLogging.i(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
    }

    public static boolean IsAudioEffectSupported() {
        if (audioEffectBlackList.isEmpty()) {
            initAudioEffectBlackList();
        }
        String productBrand = WebRtcAudioUtils.getProductBrand();
        if (productBrand.isEmpty() || !audioEffectBlackList.containsKey(productBrand)) {
            return true;
        }
        String romVersion = WebRtcAudioUtils.getRomVersion(productBrand);
        boolean zContains = audioEffectBlackList.get(productBrand).contains(romVersion);
        RXLogging.w(TAG, "IsAudioEffectSupported, " + productBrand + ", " + romVersion + ", in black list = " + zContains);
        return !zContains;
    }

    private static void assertTrue(boolean z10) {
        if (!z10) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static boolean canUseAcousticEchoCanceler() {
        boolean z10 = (!isAcousticEchoCancelerSupported() || WebRtcAudioUtils.useWebRtcBasedAcousticEchoCanceler() || isAcousticEchoCancelerBlacklisted()) ? false : true;
        RXLogging.i(TAG, "canUseAcousticEchoCanceler: " + z10);
        return z10;
    }

    public static boolean canUseNoiseSuppressor() {
        boolean z10 = (!isNoiseSuppressorSupported() || WebRtcAudioUtils.useWebRtcBasedNoiseSuppressor() || isNoiseSuppressorBlacklisted()) ? false : true;
        RXLogging.i(TAG, "canUseNoiseSuppressor: " + z10);
        return z10;
    }

    public static WebRtcAudioEffects create() {
        return new WebRtcAudioEffects();
    }

    private boolean effectTypeIsVoIP(UUID uuid) {
        return (AudioEffect.EFFECT_TYPE_AEC.equals(uuid) && isAcousticEchoCancelerSupported()) || (AudioEffect.EFFECT_TYPE_NS.equals(uuid) && isNoiseSuppressorSupported());
    }

    @p0
    private static AudioEffect.Descriptor[] getAvailableEffects() {
        AudioEffect.Descriptor[] descriptorArr = cachedEffects;
        if (descriptorArr != null) {
            return descriptorArr;
        }
        try {
            AudioEffect.Descriptor[] descriptorArrQueryEffects = AudioEffect.queryEffects();
            cachedEffects = descriptorArrQueryEffects;
            return descriptorArrQueryEffects;
        } catch (Exception e10) {
            e10.printStackTrace();
            return cachedEffects;
        }
    }

    private static void initAudioEffectBlackList() {
        audioEffectBlackList.put("vivo", new ArrayList());
        audioEffectBlackList.get("vivo").add("Funtouch OS_3.1_PD1616_D_7.17.5");
    }

    public static boolean isAcousticEchoCancelerBlacklisted() {
        List<String> blackListedModelsForAecUsage = WebRtcAudioUtils.getBlackListedModelsForAecUsage();
        String str = Build.MODEL;
        boolean zContains = blackListedModelsForAecUsage.contains(str);
        if (zContains) {
            RXLogging.w(TAG, str + " is blacklisted for HW AEC usage!");
        }
        return zContains;
    }

    private static boolean isAcousticEchoCancelerEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC);
    }

    private static boolean isAcousticEchoCancelerExcludedByUUID() {
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_AEC) && descriptor.uuid.equals(AOSP_ACOUSTIC_ECHO_CANCELER)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isAcousticEchoCancelerEffectAvailable();
    }

    private static boolean isEffectTypeAvailable(UUID uuid) {
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects == null) {
            return false;
        }
        for (AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorBlacklisted() {
        List<String> blackListedModelsForNsUsage = WebRtcAudioUtils.getBlackListedModelsForNsUsage();
        String str = Build.MODEL;
        boolean zContains = blackListedModelsForNsUsage.contains(str);
        if (zContains) {
            RXLogging.w(TAG, str + " is blacklisted for HW NS usage!");
        }
        return zContains;
    }

    private static boolean isNoiseSuppressorEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS);
    }

    private static boolean isNoiseSuppressorExcludedByUUID() {
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_NS) && descriptor.uuid.equals(AOSP_NOISE_SUPPRESSOR)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorSupported() {
        return isNoiseSuppressorEffectAvailable();
    }

    public void enable(int i10) {
        boolean z10;
        boolean z11;
        boolean enabled;
        boolean z12;
        boolean enabled2;
        boolean z13;
        boolean z14;
        boolean enabled3;
        RXLogging.i(TAG, "enable(audioSession=" + i10 + ")");
        boolean z15 = false;
        if (isAcousticEchoCancelerSupported()) {
            try {
                if (this.aec != null) {
                    RXLogging.e(TAG, "Release previous aec instance");
                    this.aec.release();
                    this.aec = null;
                }
                AcousticEchoCanceler acousticEchoCancelerCreate = AcousticEchoCanceler.create(i10);
                this.aec = acousticEchoCancelerCreate;
                if (acousticEchoCancelerCreate != null) {
                    enabled = acousticEchoCancelerCreate.getEnabled();
                    try {
                        z12 = this.shouldEnableAec && canUseAcousticEchoCanceler();
                        try {
                            if (this.aec.setEnabled(z12) != 0) {
                                RXLogging.e(TAG, "Failed to set the AcousticEchoCanceler state");
                            }
                            enabled2 = this.aec.getEnabled();
                        } catch (Exception e10) {
                            boolean z16 = z12;
                            z10 = enabled;
                            e = e10;
                            z11 = z16;
                            e.printStackTrace();
                            enabled = z10;
                            z12 = z11;
                            enabled2 = false;
                        }
                    } catch (Exception e11) {
                        z11 = false;
                        z10 = enabled;
                        e = e11;
                    }
                } else {
                    enabled = false;
                    z12 = false;
                    enabled2 = false;
                }
            } catch (Exception e12) {
                e = e12;
                z10 = false;
                z11 = false;
            }
            if (this.aec != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("AcousticEchoCanceler: was ");
                sb2.append(enabled ? "enabled" : "disabled");
                sb2.append(", enable: ");
                sb2.append(z12);
                sb2.append(", is now: ");
                sb2.append(enabled2 ? "enabled" : "disabled");
                RXLogging.i(TAG, sb2.toString());
            } else {
                RXLogging.e(TAG, "Failed to create the AcousticEchoCanceler instance");
            }
        }
        if (isNoiseSuppressorSupported()) {
            try {
                if (this.ns != null) {
                    RXLogging.e(TAG, "Release previous ns instance");
                    this.ns.release();
                    this.ns = null;
                }
                NoiseSuppressor noiseSuppressorCreate = NoiseSuppressor.create(i10);
                this.ns = noiseSuppressorCreate;
                if (noiseSuppressorCreate != null) {
                    boolean enabled4 = noiseSuppressorCreate.getEnabled();
                    try {
                        z14 = this.shouldEnableNs && canUseNoiseSuppressor();
                        try {
                            if (this.ns.setEnabled(z14) != 0) {
                                RXLogging.e(TAG, "Failed to set the NoiseSuppressor state");
                            }
                            z15 = enabled4;
                            enabled3 = this.ns.getEnabled();
                        } catch (Exception e13) {
                            e = e13;
                            Exception exc = e;
                            z13 = enabled4;
                            e = exc;
                            e.printStackTrace();
                            enabled3 = false;
                            z15 = z13;
                        }
                    } catch (Exception e14) {
                        e = e14;
                        z14 = false;
                    }
                } else {
                    enabled3 = false;
                    z14 = false;
                }
            } catch (Exception e15) {
                e = e15;
                z13 = false;
                z14 = false;
            }
            if (this.ns == null) {
                RXLogging.e(TAG, "Failed to create the NoiseSuppressor instance");
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("NoiseSuppressor: was ");
            sb3.append(z15 ? "enabled" : "disabled");
            sb3.append(", enable: ");
            sb3.append(z14);
            sb3.append(", is now: ");
            sb3.append(enabled3 ? "enabled" : "disabled");
            RXLogging.i(TAG, sb3.toString());
        }
    }

    public void release() {
        RXLogging.i(TAG, "release");
        try {
            AcousticEchoCanceler acousticEchoCanceler = this.aec;
            if (acousticEchoCanceler != null) {
                acousticEchoCanceler.release();
                this.aec = null;
            }
            NoiseSuppressor noiseSuppressor = this.ns;
            if (noiseSuppressor != null) {
                noiseSuppressor.release();
                this.ns = null;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            this.aec = null;
            this.ns = null;
        }
    }

    public boolean setAEC(boolean z10) {
        RXLogging.i(TAG, "setAEC(" + z10 + ")");
        if (!canUseAcousticEchoCanceler()) {
            RXLogging.w(TAG, "Platform AEC is not supported");
            this.shouldEnableAec = false;
            return false;
        }
        if (this.aec == null || z10 == this.shouldEnableAec) {
            this.shouldEnableAec = z10;
            return true;
        }
        RXLogging.e(TAG, "Platform AEC state can't be modified while recording");
        return false;
    }

    public boolean setNS(boolean z10) {
        RXLogging.i(TAG, "setNS(" + z10 + ")");
        if (!canUseNoiseSuppressor()) {
            RXLogging.w(TAG, "Platform NS is not supported");
            this.shouldEnableNs = false;
            return false;
        }
        if (this.ns == null || z10 == this.shouldEnableNs) {
            this.shouldEnableNs = z10;
            return true;
        }
        RXLogging.e(TAG, "Platform NS state can't be modified while recording");
        return false;
    }
}
