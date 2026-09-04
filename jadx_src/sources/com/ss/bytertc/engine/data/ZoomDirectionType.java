package com.ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes4.dex */
public enum ZoomDirectionType {
    CAMERA_MOVE_LEFT(0),
    CAMERA_MOVE_RIGHT(1),
    CAMERA_MOVE_UP(2),
    CAMERA_MOVE_DOWN(3),
    CAMERA_ZOOM_OUT(4),
    CAMERA_ZOOM_IN(5),
    CAMERA_RESET(6);

    private int value;

    ZoomDirectionType(int i10) {
        this.value = i10;
    }

    public static ZoomDirectionType fromId(int i10) {
        for (ZoomDirectionType zoomDirectionType : values()) {
            if (zoomDirectionType.value() == i10) {
                return zoomDirectionType;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
