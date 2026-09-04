package com.ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;
import com.ss.bytertc.engine.type.AudioEnhancementConfig;

/* JADX INFO: loaded from: classes4.dex */
public class InternalAudioEnhancementConfig {
    public boolean enhanceAudio;
    public boolean enhanceSignaling;

    public InternalAudioEnhancementConfig(AudioEnhancementConfig audioEnhancementConfig) {
        this.enhanceSignaling = false;
        this.enhanceAudio = false;
        this.enhanceSignaling = audioEnhancementConfig.enhanceSignaling;
        this.enhanceAudio = audioEnhancementConfig.enhanceAudio;
    }

    @CalledByNative
    boolean getAudioEnhance() {
        return this.enhanceAudio;
    }

    @CalledByNative
    boolean getSignalingEnhance() {
        return this.enhanceSignaling;
    }
}
