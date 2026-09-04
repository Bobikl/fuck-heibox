package com.ss.bytertc.engine;

import android.util.Pair;
import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class VideoStreamDescription {
    public EncoderPreference encodePreference;
    public int frameRate;
    public int maxKbps;
    public int minKbps;
    public Pair<Integer, Integer> videoSize;

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
        Disabled(0),
        MaintainFramerate(1),
        MaintainQuality(2),
        Balance(3);

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

    public VideoStreamDescription() {
        this.minKbps = 0;
        this.encodePreference = EncoderPreference.MaintainFramerate;
    }

    public VideoStreamDescription(int i10, int i11, int i12, int i13, int i14) {
        this.minKbps = 0;
        this.encodePreference = EncoderPreference.MaintainFramerate;
        this.videoSize = new Pair<>(Integer.valueOf(i10), Integer.valueOf(i11));
        this.frameRate = i12;
        this.maxKbps = i13;
        this.minKbps = i14;
    }

    public VideoStreamDescription(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.minKbps = 0;
        this.encodePreference = EncoderPreference.MaintainFramerate;
        this.videoSize = new Pair<>(Integer.valueOf(i10), Integer.valueOf(i11));
        this.frameRate = i12;
        this.maxKbps = i13;
        this.minKbps = i14;
        this.encodePreference = EncoderPreference.convertFromInt(i17);
    }

    @CalledByNative
    private static VideoStreamDescription create(int i10, int i11, int i12, int i13, int i14) {
        return new VideoStreamDescription(i10, i11, i12, i13, i14);
    }

    public boolean isValid() {
        Pair<Integer, Integer> pair = this.videoSize;
        if (pair == null || ((Integer) pair.first).intValue() <= 0 || ((Integer) this.videoSize.second).intValue() <= 0 || this.frameRate <= 0) {
            return false;
        }
        int i10 = this.maxKbps;
        return i10 <= 0 || this.minKbps <= i10;
    }

    public String toString() {
        return "VideoStreamDescription{videoSize=" + this.videoSize + ", frameRate=" + this.frameRate + ", maxKbps=" + this.maxKbps + ", minKbps=" + this.minKbps + ", encodePreference=" + this.encodePreference + '}';
    }
}
