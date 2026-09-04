package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes4.dex */
public enum MediaStreamType {
    RTC_MEDIA_STREAM_TYPE_AUDIO(1),
    RTC_MEDIA_STREAM_TYPE_VIDEO(2),
    RTC_MEDIA_STREAM_TYPE_BOTH(3);

    public final int value;

    MediaStreamType(int i10) {
        this.value = i10;
    }

    public static MediaStreamType valueOf(int i10) {
        if (i10 == 1) {
            return RTC_MEDIA_STREAM_TYPE_AUDIO;
        }
        if (i10 == 2) {
            return RTC_MEDIA_STREAM_TYPE_VIDEO;
        }
        if (i10 != 3) {
            return null;
        }
        return RTC_MEDIA_STREAM_TYPE_BOTH;
    }
}
