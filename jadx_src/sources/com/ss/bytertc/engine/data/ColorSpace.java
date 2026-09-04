package com.ss.bytertc.engine.data;

import androidx.annotation.w0;
import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
@w0(api = 15)
public enum ColorSpace {
    UNKNOWN(0),
    BT601_LIMITED_RANGE(1),
    BT601_FULL_RANGE(2),
    BT709_LIMITED_RANGE(3),
    BT709_FULL_RANGE(4);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.ColorSpace$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$ColorSpace;

        static {
            int[] iArr = new int[ColorSpace.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$ColorSpace = iArr;
            try {
                iArr[ColorSpace.BT601_LIMITED_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$ColorSpace[ColorSpace.BT601_FULL_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$ColorSpace[ColorSpace.BT709_LIMITED_RANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$ColorSpace[ColorSpace.BT709_FULL_RANGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    ColorSpace(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static ColorSpace fromId(int i10) {
        for (ColorSpace colorSpace : values()) {
            if (colorSpace.value() == i10) {
                return colorSpace;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$ColorSpace[ordinal()];
        if (i10 == 1) {
            return "kColorSpaceYCbCrBT601LimitedRange";
        }
        if (i10 == 2) {
            return "kColorSpaceYCbCrBT601FullRange";
        }
        if (i10 != 3) {
            return i10 != 4 ? "kColorSpaceUnknown" : "kColorSpaceYCbCrBT709FullRange";
        }
        return "kColorSpaceYCbCrBT709LimitedRange";
    }

    @CalledByNative
    public int value() {
        return this.value;
    }
}
