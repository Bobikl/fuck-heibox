package com.ss.bytertc.engine.video;

/* JADX INFO: loaded from: classes4.dex */
public enum VideoDecoderConfig {
    VIDEO_DECODER_CONFIG_RAW(0),
    VIDEO_DECODER_CONFIG_ENCODE(1),
    VIDEO_DECODER_CONFIG_BOTH(2);

    private int value;

    VideoDecoderConfig(int i10) {
        this.value = i10;
    }

    public static VideoDecoderConfig fromId(int i10) {
        for (VideoDecoderConfig videoDecoderConfig : values()) {
            if (videoDecoderConfig.value() == i10) {
                return videoDecoderConfig;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
