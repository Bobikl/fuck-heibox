package com.ss.bytertc.ktv.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum MusicHotType {
    CONTENT_CENTER(1),
    PROJECT(2);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.ktv.data.MusicHotType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$ktv$data$MusicHotType;

        static {
            int[] iArr = new int[MusicHotType.values().length];
            $SwitchMap$com$ss$bytertc$ktv$data$MusicHotType = iArr;
            try {
                iArr[MusicHotType.CONTENT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$MusicHotType[MusicHotType.PROJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    MusicHotType(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static MusicHotType fromId(int i10) {
        for (MusicHotType musicHotType : values()) {
            if (musicHotType.value() == i10) {
                return musicHotType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = AnonymousClass1.$SwitchMap$com$ss$bytertc$ktv$data$MusicHotType[ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? "" : "PROJECT_RANK";
        }
        return "CONTENT_CENTER_RANK";
    }

    public int value() {
        return this.value;
    }
}
