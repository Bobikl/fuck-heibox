package com.ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes4.dex */
public enum ZoomConfigType {
    ZOOM_FOCUS_OFFSET(0),
    ZOOM_MOVE_OFFSET(1);

    private int value;

    ZoomConfigType(int i10) {
        this.value = i10;
    }

    public static ZoomConfigType fromId(int i10) {
        for (ZoomConfigType zoomConfigType : values()) {
            if (zoomConfigType.value() == i10) {
                return zoomConfigType;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
