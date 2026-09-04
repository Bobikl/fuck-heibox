package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes4.dex */
public class MediaTypeEnhancementConfig {
    public boolean enhanceAudio;
    public boolean enhanceScreenAudio;
    public boolean enhanceScreenVideo;
    public boolean enhanceSignaling;
    public boolean enhanceVideo;

    public MediaTypeEnhancementConfig() {
        this.enhanceSignaling = false;
        this.enhanceAudio = false;
        this.enhanceVideo = false;
        this.enhanceScreenAudio = false;
        this.enhanceScreenVideo = false;
    }

    public MediaTypeEnhancementConfig(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.enhanceSignaling = z10;
        this.enhanceAudio = z11;
        this.enhanceVideo = z12;
        this.enhanceScreenAudio = z13;
        this.enhanceScreenVideo = z14;
    }
}
