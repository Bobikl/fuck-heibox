package com.ss.bytertc.engine.data;

import bb.c;
import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum VideoPixelFormat {
    UNKNOWN(0),
    I420(1),
    NV12(2),
    NV21(3),
    RGBA(5),
    TEXTURE_2D(c.e.F),
    TEXTURE_OES(36197);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.VideoPixelFormat$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat;

        static {
            int[] iArr = new int[VideoPixelFormat.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat = iArr;
            try {
                iArr[VideoPixelFormat.I420.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[VideoPixelFormat.NV12.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[VideoPixelFormat.NV21.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[VideoPixelFormat.RGBA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[VideoPixelFormat.TEXTURE_2D.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[VideoPixelFormat.TEXTURE_OES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    VideoPixelFormat(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static VideoPixelFormat fromId(int i10) {
        for (VideoPixelFormat videoPixelFormat : values()) {
            if (videoPixelFormat.value() == i10) {
                return videoPixelFormat;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[ordinal()]) {
            case 1:
                return "kVideoPixelFormatI420";
            case 2:
                return "kVideoPixelFormatNV12";
            case 3:
                return "kVideoPixelFormatNV21";
            case 4:
                return "kVideoPixelFormatRGBA";
            case 5:
                return "kVideoPixelFormatTexture2D";
            case 6:
                return "kVideoPixelFormatTextureOES";
            default:
                return "kVideoPixelFormatUnknown";
        }
    }

    @CalledByNative
    public int value() {
        return this.value;
    }
}
