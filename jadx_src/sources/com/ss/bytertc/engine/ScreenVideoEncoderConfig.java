package com.ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class ScreenVideoEncoderConfig {
    public EncoderPreference encodePreference;
    public int frameRate;
    public int height;
    public int maxBitrate;
    public int minBitrate;
    public int width;

    public enum CodecMode {
        CODEC_MODE_AUTO(0),
        CODEC_MODE_HARDWARE(1),
        CODEC_MODE_SOFTWARE(2);

        private int value;

        CodecMode(int i10) {
            this.value = i10;
        }

        public static CodecMode convertFromInt(int i10) {
            return values()[i10];
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum EncoderPreference {
        MaintainFramerate(1),
        MaintainQuality(2);

        private int value;

        EncoderPreference(int i10) {
            this.value = i10;
        }

        public static EncoderPreference convertFromInt(int i10) {
            return values()[i10];
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum VideoCodecType {
        CODEC_TYPE_AUTO(0),
        CODEC_TYPE_H264(1),
        CODEC_TYPE_BYTEVC1(2);

        private int value;

        VideoCodecType(int i10) {
            this.value = i10;
        }

        public static VideoCodecType convertFromInt(int i10) {
            return values()[i10];
        }

        public int getValue() {
            return this.value;
        }
    }

    public ScreenVideoEncoderConfig() {
        this.maxBitrate = -1;
        this.minBitrate = 0;
        this.encodePreference = EncoderPreference.MaintainFramerate;
    }

    public ScreenVideoEncoderConfig(int i10, int i11, int i12, int i13, int i14) {
        this.maxBitrate = -1;
        this.minBitrate = 0;
        this.encodePreference = EncoderPreference.MaintainFramerate;
        this.width = i10;
        this.height = i11;
        this.frameRate = i12;
        this.maxBitrate = i13;
        this.minBitrate = i14;
    }

    public ScreenVideoEncoderConfig(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.maxBitrate = -1;
        this.minBitrate = 0;
        this.encodePreference = EncoderPreference.MaintainFramerate;
        this.width = i10;
        this.height = i11;
        this.frameRate = i12;
        this.maxBitrate = i13;
        this.minBitrate = i14;
        this.encodePreference = EncoderPreference.convertFromInt(i17);
    }

    @CalledByNative
    private static ScreenVideoEncoderConfig create(int i10, int i11, int i12, int i13, int i14) {
        return new ScreenVideoEncoderConfig(i10, i11, i12, i13, i14);
    }

    public boolean isValid() {
        if (this.width <= 0 || this.height <= 0 || this.frameRate <= 0) {
            return false;
        }
        int i10 = this.maxBitrate;
        return i10 <= 0 || i10 >= this.minBitrate;
    }

    public String toString() {
        return "ScreenVideoEncoderConfig{width=" + this.width + "height=" + this.height + ", frameRate=" + this.frameRate + ", maxBitrate=" + this.maxBitrate + ", minBitrate=" + this.minBitrate + ", encodePreference=" + this.encodePreference + '}';
    }
}
