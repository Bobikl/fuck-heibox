package com.ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;
import com.ss.bytertc.engine.type.MediaTypeEnhancementConfig;

/* JADX INFO: loaded from: classes4.dex */
public class InternalMediaTypeEnhancementConfig {
    public boolean enhanceAudio;
    public boolean enhanceScreenAudio;
    public boolean enhanceScreenVideo;
    public boolean enhanceSignaling;
    public boolean enhanceVideo;

    public InternalMediaTypeEnhancementConfig(MediaTypeEnhancementConfig mediaTypeEnhancementConfig) {
        this.enhanceSignaling = false;
        this.enhanceAudio = false;
        this.enhanceVideo = false;
        this.enhanceScreenAudio = false;
        this.enhanceScreenVideo = false;
        this.enhanceSignaling = mediaTypeEnhancementConfig.enhanceSignaling;
        this.enhanceAudio = mediaTypeEnhancementConfig.enhanceAudio;
        this.enhanceVideo = mediaTypeEnhancementConfig.enhanceVideo;
        this.enhanceScreenAudio = mediaTypeEnhancementConfig.enhanceScreenAudio;
        this.enhanceScreenVideo = mediaTypeEnhancementConfig.enhanceScreenVideo;
    }

    @CalledByNative
    boolean getAudioEnhance() {
        return this.enhanceAudio;
    }

    @CalledByNative
    boolean getScreenAudioEnhance() {
        return this.enhanceScreenAudio;
    }

    @CalledByNative
    boolean getScreenVideoEnhance() {
        return this.enhanceScreenVideo;
    }

    @CalledByNative
    boolean getSignalingEnhance() {
        return this.enhanceSignaling;
    }

    @CalledByNative
    boolean getVideoEnhance() {
        return this.enhanceVideo;
    }
}
