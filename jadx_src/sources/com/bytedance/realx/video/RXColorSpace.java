package com.bytedance.realx.video;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes6.dex */
public enum RXColorSpace {
    kUnknown(0),
    kYCbCrBT601LimitedRange(1),
    kYCbCrBT601FullRange(2),
    kYCbCrBT709LimitedRange(3),
    kYCbCrBT709FullRange(4);

    private int colorSpace;

    /* JADX INFO: renamed from: com.bytedance.realx.video.RXColorSpace$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$video$RXColorSpace;

        static {
            int[] iArr = new int[RXColorSpace.values().length];
            $SwitchMap$com$bytedance$realx$video$RXColorSpace = iArr;
            try {
                iArr[RXColorSpace.kUnknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXColorSpace[RXColorSpace.kYCbCrBT601LimitedRange.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXColorSpace[RXColorSpace.kYCbCrBT601FullRange.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXColorSpace[RXColorSpace.kYCbCrBT709LimitedRange.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXColorSpace[RXColorSpace.kYCbCrBT709FullRange.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    RXColorSpace(int i10) {
        this.colorSpace = i10;
    }

    @CalledByNative
    public static RXColorSpace fromId(int i10) {
        for (RXColorSpace rXColorSpace : values()) {
            if (rXColorSpace.value() == i10) {
                return rXColorSpace;
            }
        }
        return null;
    }

    @CalledByNative
    private int value() {
        return this.colorSpace;
    }

    public int getColorSpace() {
        return this.colorSpace;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = AnonymousClass1.$SwitchMap$com$bytedance$realx$video$RXColorSpace[ordinal()];
        if (i10 == 2) {
            return "kYCbCrBT601LimitedRange";
        }
        if (i10 == 3) {
            return "kYCbCrBT601FullRange";
        }
        if (i10 != 4) {
            return i10 != 5 ? "kUnknown" : "kYCbCrBT709FullRange";
        }
        return "kYCbCrBT709LimitedRange";
    }
}
