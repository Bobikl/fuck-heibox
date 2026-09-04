package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum RemoteMirrorType {
    NONE(0),
    RENDER(1);

    private int value;

    RemoteMirrorType(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static RemoteMirrorType fromId(int i10) {
        for (RemoteMirrorType remoteMirrorType : values()) {
            if (remoteMirrorType.value() == i10) {
                return remoteMirrorType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        if (this == NONE) {
            return "NONE";
        }
        return this == RENDER ? "RENDER" : "";
    }

    public int value() {
        return this.value;
    }
}
