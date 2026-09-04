package com.ss.bytertc.engine.data;

import com.max.xiaoheihe.bean.WebProtocolObj;

/* JADX INFO: loaded from: classes4.dex */
public enum MediaPlayerCustomSourceStreamType {
    RAW(0),
    ENCODED(1);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.MediaPlayerCustomSourceStreamType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$MediaPlayerCustomSourceStreamType;

        static {
            int[] iArr = new int[MediaPlayerCustomSourceStreamType.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$MediaPlayerCustomSourceStreamType = iArr;
            try {
                iArr[MediaPlayerCustomSourceStreamType.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$MediaPlayerCustomSourceStreamType[MediaPlayerCustomSourceStreamType.ENCODED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    MediaPlayerCustomSourceStreamType(int i10) {
        this.value = i10;
    }

    public static MediaPlayerCustomSourceStreamType fromId(int i10) {
        for (MediaPlayerCustomSourceStreamType mediaPlayerCustomSourceStreamType : values()) {
            if (mediaPlayerCustomSourceStreamType.value() == i10) {
                return mediaPlayerCustomSourceStreamType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$MediaPlayerCustomSourceStreamType[ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? "" : "ENCODED";
        }
        return WebProtocolObj.HTTP_METHOD_RAW;
    }

    public int value() {
        return this.value;
    }
}
