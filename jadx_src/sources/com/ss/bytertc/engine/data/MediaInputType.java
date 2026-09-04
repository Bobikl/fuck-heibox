package com.ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes4.dex */
public enum MediaInputType {
    MEDIA_INPUT_TYPE_EXTERNAL(0),
    MEDIA_INPUT_TYPE_INTERNAL(1);

    private int value;

    MediaInputType(int i10) {
        this.value = i10;
    }

    public static MediaInputType fromId(int i10) {
        for (MediaInputType mediaInputType : values()) {
            if (mediaInputType.value() == i10) {
                return mediaInputType;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
