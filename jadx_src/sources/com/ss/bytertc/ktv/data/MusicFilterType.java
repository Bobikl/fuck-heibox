package com.ss.bytertc.ktv.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum MusicFilterType {
    NONE(0),
    WITHOUT_LYRIC(1),
    UNSUPPORTED_SCORE(2),
    UNSUPPORTED_ACCOMPANY(4),
    UNSUPPORTED_CLIMAX(8);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.ktv.data.MusicFilterType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$ktv$data$MusicFilterType;

        static {
            int[] iArr = new int[MusicFilterType.values().length];
            $SwitchMap$com$ss$bytertc$ktv$data$MusicFilterType = iArr;
            try {
                iArr[MusicFilterType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$MusicFilterType[MusicFilterType.WITHOUT_LYRIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$MusicFilterType[MusicFilterType.UNSUPPORTED_SCORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$MusicFilterType[MusicFilterType.UNSUPPORTED_ACCOMPANY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$MusicFilterType[MusicFilterType.UNSUPPORTED_CLIMAX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    MusicFilterType(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static MusicFilterType fromId(int i10) {
        for (MusicFilterType musicFilterType : values()) {
            if (musicFilterType.value() == i10) {
                return musicFilterType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = AnonymousClass1.$SwitchMap$com$ss$bytertc$ktv$data$MusicFilterType[ordinal()];
        if (i10 == 1) {
            return "MUSIC_FILTER_TYPE_NONE";
        }
        if (i10 == 2) {
            return "MUSIC_FILTER_TYPE_WITHOUT_LYRIC";
        }
        if (i10 == 3) {
            return "MUSIC_FILTER_TYPE_UNSUPPORTED_SCORE";
        }
        if (i10 != 4) {
            return i10 != 5 ? "" : "MUSIC_FILTER_TYPE_UNSUPPORTED_CLIMAX";
        }
        return "MUSIC_FILTER_TYPE_UNSUPPORTED_ACCOMPANY";
    }

    public int value() {
        return this.value;
    }
}
