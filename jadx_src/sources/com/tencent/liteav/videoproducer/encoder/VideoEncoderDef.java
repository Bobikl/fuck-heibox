package com.tencent.liteav.videoproducer.encoder;

import android.media.MediaFormat;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.common.CodecType;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::video")
public interface VideoEncoderDef {

    public enum BitrateMode {
        UNKNOWN(-1),
        CBR(0),
        VBR(1),
        CQ(2);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final BitrateMode[] f100785e = values();
        public int mValue;

        BitrateMode(int i10) {
            this.mValue = i10;
        }

        public static BitrateMode a(int i10) {
            for (BitrateMode bitrateMode : f100785e) {
                if (i10 == bitrateMode.mValue) {
                    return bitrateMode;
                }
            }
            return VBR;
        }
    }

    public static class EncodeAbility {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f100787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f100788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f100789c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f100790d;

        public boolean isSupportHwHEVC() {
            return this.f100790d;
        }

        public boolean isSupportRPS() {
            return this.f100787a;
        }

        public boolean isSupportSVC() {
            return this.f100788b;
        }

        public boolean isSupportSwHEVC() {
            return this.f100789c;
        }
    }

    public enum EncodeScene {
        kCameraRealTime(0),
        kScreenRealTime(1);

        int mValue;

        EncodeScene(int i10) {
            this.mValue = i10;
        }

        public static EncodeScene a(int i10) {
            for (EncodeScene encodeScene : values()) {
                if (encodeScene.mValue == i10) {
                    return encodeScene;
                }
            }
            return kCameraRealTime;
        }
    }

    public enum EncoderComplexity {
        UNKNOWN(65535),
        HYPER_FAST(0),
        ULTRA_FAST(1),
        SUPER_FAST(2),
        VERY_FAST(3),
        FAST(4);

        final int mValue;

        EncoderComplexity(int i10) {
            this.mValue = i10;
        }

        public static EncoderComplexity a(int i10) {
            for (EncoderComplexity encoderComplexity : values()) {
                if (encoderComplexity.mValue == i10) {
                    return encoderComplexity;
                }
            }
            return UNKNOWN;
        }
    }

    public enum EncoderProfile {
        PROFILE_BASELINE(1),
        PROFILE_MAIN(2),
        PROFILE_HIGH(3),
        PROFILE_BASELINERPS(11),
        PROFILE_MAINRPS(12),
        PROFILE_HIGHRPS(13);


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final EncoderProfile[] f100807g = values();
        int mValue;

        EncoderProfile(int i10) {
            this.mValue = i10;
        }

        public static EncoderProfile a(int i10) {
            for (EncoderProfile encoderProfile : f100807g) {
                if (i10 == encoderProfile.mValue) {
                    return encoderProfile;
                }
            }
            return PROFILE_BASELINE;
        }
    }

    public static class EncoderProperty {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f100809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ReferenceStrategy f100810b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CodecType f100811c;

        public int getCodecType() {
            return this.f100811c.mValue;
        }

        public int getEncoderType() {
            return this.f100809a.value;
        }

        public int getReferenceStrategy() {
            return this.f100810b.mValue;
        }
    }

    public enum ReferenceStrategy {
        FIX_GOP(0),
        RPS(1),
        SVC(2),
        UNLIMITED_GOP(3);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final ReferenceStrategy[] f100816e = values();
        int mValue;

        ReferenceStrategy(int i10) {
            this.mValue = i10;
        }

        public static ReferenceStrategy a(int i10) {
            for (ReferenceStrategy referenceStrategy : f100816e) {
                if (i10 == referenceStrategy.mValue) {
                    return referenceStrategy;
                }
            }
            return FIX_GOP;
        }
    }

    public enum a {
        HARDWARE(1),
        SOFTWARE(2);

        int value;

        a(int i10) {
            this.value = i10;
        }
    }

    public static abstract class b {
        public void onBitrateModeUpdated(BitrateMode bitrateMode) {
        }

        public void onEncodedFail(com.tencent.liteav.videobase.videobase.e.a aVar) {
        }

        public void onEncodedNAL(EncodedVideoFrame encodedVideoFrame, boolean z10) {
        }

        public void onOutputFormatChanged(MediaFormat mediaFormat) {
        }
    }
}
