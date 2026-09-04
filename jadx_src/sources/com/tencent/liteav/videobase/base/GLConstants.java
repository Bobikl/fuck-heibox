package com.tencent.liteav.videobase.base;

/* JADX INFO: loaded from: classes4.dex */
public interface GLConstants {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f100237a = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f100238b = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float[] f100239c = {-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[] f100240d = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float[] f100241e = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float[] f100242f = {1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float[] f100243g = {0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float[] f100244h = {1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f};

    public enum ColorRange {
        UNKNOWN(0),
        VIDEO_RANGE(1),
        FULL_RANGE(2);

        private final int mJniValue;

        ColorRange(int i10) {
            this.mJniValue = i10;
        }

        public static ColorRange a(int i10) {
            for (ColorRange colorRange : values()) {
                if (colorRange.mJniValue == i10) {
                    return colorRange;
                }
            }
            return UNKNOWN;
        }

        public final int getValue() {
            return this.mJniValue;
        }
    }

    public enum ColorSpace {
        UNKNOWN(0),
        BT601(1),
        BT709(2);

        private final int mJniValue;

        ColorSpace(int i10) {
            this.mJniValue = i10;
        }

        public static ColorSpace a(int i10) {
            for (ColorSpace colorSpace : values()) {
                if (colorSpace.mJniValue == i10) {
                    return colorSpace;
                }
            }
            return UNKNOWN;
        }

        public final int getValue() {
            return this.mJniValue;
        }
    }

    public enum GLScaleType {
        CENTER_CROP(0),
        FIT_CENTER(1),
        FILL(2);


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final GLScaleType[] f100256d = values();
        public int mValue;

        GLScaleType(int i10) {
            this.mValue = i10;
        }

        public static GLScaleType a(int i10) {
            for (GLScaleType gLScaleType : f100256d) {
                if (gLScaleType.mValue == i10) {
                    return gLScaleType;
                }
            }
            return FIT_CENTER;
        }
    }

    public enum PixelFormatType {
        I420(0),
        NV12(1),
        NV21(2),
        RGB(3),
        YUY2(4),
        RGBA(5),
        BGR(6),
        YV12(7),
        BGRA(8),
        ARGB(9),
        YUV422P(10),
        UYVY(11),
        YUYV(12),
        JPG(13),
        H264(14),
        MAX(100);


        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final PixelFormatType[] f100274q = values();
        private final int mJniValue;

        PixelFormatType(int i10) {
            this.mJniValue = i10;
        }

        public static PixelFormatType a(int i10) {
            for (PixelFormatType pixelFormatType : f100274q) {
                if (pixelFormatType.mJniValue == i10) {
                    return pixelFormatType;
                }
            }
            return null;
        }

        public final int getValue() {
            return this.mJniValue;
        }
    }

    public enum a {
        BYTE_BUFFER(0),
        TEXTURE_2D(1),
        TEXTURE_OES(2),
        BYTE_ARRAY(3);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final a[] f100280e = values();
        public int mValue;

        a(int i10) {
            this.mValue = i10;
        }

        public static a a(int i10) {
            for (a aVar : f100280e) {
                if (aVar.mValue == i10) {
                    return aVar;
                }
            }
            return TEXTURE_2D;
        }
    }
}
