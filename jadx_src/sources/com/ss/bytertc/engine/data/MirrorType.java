package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum MirrorType {
    MIRROR_TYPE_NONE(0),
    MIRROR_TYPE_RENDER(1),
    MIRROR_TYPE_RENDER_AND_ENCODER(3);

    private int value;

    MirrorType(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static MirrorType fromId(int i10) {
        for (MirrorType mirrorType : values()) {
            if (mirrorType.value() == i10) {
                return mirrorType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        if (this == MIRROR_TYPE_NONE) {
            return "kMirrorTypeNone";
        }
        if (this == MIRROR_TYPE_RENDER) {
            return "kMirrorTypeRender";
        }
        return this == MIRROR_TYPE_RENDER_AND_ENCODER ? "kMirrorTypeRenderAndEncoder" : "";
    }

    public int value() {
        return this.value;
    }
}
