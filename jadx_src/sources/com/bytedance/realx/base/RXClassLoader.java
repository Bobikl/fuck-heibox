package com.bytedance.realx.base;

/* JADX INFO: loaded from: classes6.dex */
public class RXClassLoader {
    RXClassLoader() {
    }

    @CalledByNative
    static Object getClassLoader() {
        return RXClassLoader.class.getClassLoader();
    }
}
