package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes4.dex */
public class AudioEnhancementConfig {
    public boolean enhanceAudio;
    public boolean enhanceSignaling;

    public AudioEnhancementConfig() {
        this.enhanceSignaling = false;
        this.enhanceAudio = false;
    }

    public AudioEnhancementConfig(boolean z10, boolean z11) {
        this.enhanceSignaling = z10;
        this.enhanceAudio = z11;
    }
}
