package com.tencent.ugc.decoder;

import com.tencent.ugc.videobase.common.EncodedVideoFrame;

/* JADX INFO: loaded from: classes4.dex */
public interface VideoDecoderInterface {

    public enum DecoderType {
        SOFTWARE(0),
        HARDWARE(1),
        CUSTOM(2),
        SOFTWARE_DEVICE(3);

        int mValue;

        DecoderType(int i10) {
            this.mValue = i10;
        }

        public final int getValue() {
            return this.mValue;
        }
    }

    void abandonDecodingFrames();

    boolean decode(EncodedVideoFrame encodedVideoFrame);

    DecoderType getDecoderType();

    void initialize();

    void setScene(VideoDecoderDef.ConsumerScene consumerScene);

    void start(Object obj, VideoDecoderListener videoDecoderListener);

    void stop();

    void uninitialize();
}
