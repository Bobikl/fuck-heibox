package com.ss.bytertc.engine.data;

import com.max.xiaoheihe.bean.BizMessageObj;

/* JADX INFO: loaded from: classes4.dex */
public enum MediaPlayerCustomSourceMode {
    PUSH(0),
    PULL(1);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.MediaPlayerCustomSourceMode$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$MediaPlayerCustomSourceMode;

        static {
            int[] iArr = new int[MediaPlayerCustomSourceMode.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$MediaPlayerCustomSourceMode = iArr;
            try {
                iArr[MediaPlayerCustomSourceMode.PUSH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$MediaPlayerCustomSourceMode[MediaPlayerCustomSourceMode.PULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    MediaPlayerCustomSourceMode(int i10) {
        this.value = i10;
    }

    public static MediaPlayerCustomSourceMode fromId(int i10) {
        for (MediaPlayerCustomSourceMode mediaPlayerCustomSourceMode : values()) {
            if (mediaPlayerCustomSourceMode.value() == i10) {
                return mediaPlayerCustomSourceMode;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$MediaPlayerCustomSourceMode[ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? "" : BizMessageObj.TYPE_PULL;
        }
        return BizMessageObj.TYPE_PUSH;
    }

    public int value() {
        return this.value;
    }
}
