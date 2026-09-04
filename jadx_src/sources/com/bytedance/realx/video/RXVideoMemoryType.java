package com.bytedance.realx.video;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes6.dex */
public enum RXVideoMemoryType {
    kUNKNOWN(0),
    kBYTE_MEMORY(1),
    kOPENGL_TEXTURE(3);

    private int value;

    RXVideoMemoryType(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static RXVideoMemoryType fromId(int i10) {
        for (RXVideoMemoryType rXVideoMemoryType : values()) {
            if (rXVideoMemoryType.value() == i10) {
                return rXVideoMemoryType;
            }
        }
        return null;
    }

    @CalledByNative
    public int value() {
        return this.value;
    }
}
