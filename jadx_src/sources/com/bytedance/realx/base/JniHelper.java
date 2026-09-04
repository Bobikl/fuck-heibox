package com.bytedance.realx.base;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class JniHelper {
    JniHelper() {
    }

    @CalledByNative
    static Object getKey(Map.Entry entry) {
        return entry.getKey();
    }

    @CalledByNative
    static byte[] getStringBytes(String str) {
        try {
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("utf-8 is unsupported");
        }
    }

    @CalledByNative
    static Object getStringClass() {
        return String.class;
    }

    @CalledByNative
    static Object getValue(Map.Entry entry) {
        return entry.getValue();
    }
}
