package com.ss.bytertc.engine.live;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum ByteRTCStreamMixingType {
    STREAM_MIXING_BY_SERVER(0),
    STREAM_MIXING_BY_CLIENT(1);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.live.ByteRTCStreamMixingType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingType;

        static {
            int[] iArr = new int[ByteRTCStreamMixingType.values().length];
            $SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingType = iArr;
            try {
                iArr[ByteRTCStreamMixingType.STREAM_MIXING_BY_SERVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingType[ByteRTCStreamMixingType.STREAM_MIXING_BY_CLIENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    ByteRTCStreamMixingType(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static ByteRTCStreamMixingType fromId(int i10) {
        for (ByteRTCStreamMixingType byteRTCStreamMixingType : values()) {
            if (byteRTCStreamMixingType.value() == i10) {
                return byteRTCStreamMixingType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingType[ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? "" : "STREAM_MIXING_BY_CLIENT";
        }
        return "STREAM_MIXING_BY_SERVER";
    }

    public int value() {
        return this.value;
    }
}
