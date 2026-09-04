package com.ss.bytertc.engine.live;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum MixedStreamType {
    MIXED_STREAM_TYPE_BY_SERVER(0),
    MIXED_STREAM_TYPE_BY_CLIENT(1);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.live.MixedStreamType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$live$MixedStreamType;

        static {
            int[] iArr = new int[MixedStreamType.values().length];
            $SwitchMap$com$ss$bytertc$engine$live$MixedStreamType = iArr;
            try {
                iArr[MixedStreamType.MIXED_STREAM_TYPE_BY_SERVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$MixedStreamType[MixedStreamType.MIXED_STREAM_TYPE_BY_CLIENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    MixedStreamType(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static MixedStreamType fromId(int i10) {
        for (MixedStreamType mixedStreamType : values()) {
            if (mixedStreamType.value() == i10) {
                return mixedStreamType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$live$MixedStreamType[ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? "" : "MIXED_STREAM_TYPE_BY_CLIENT";
        }
        return "MIXED_STREAM_TYPE_BY_SERVER";
    }

    public int value() {
        return this.value;
    }
}
