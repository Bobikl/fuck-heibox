package com.ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum LocalProxyType {
    SOCKS5(1),
    HTTP_TUNNEL(2);

    private int value;

    LocalProxyType(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static LocalProxyType fromId(int i10) {
        for (LocalProxyType localProxyType : values()) {
            if (localProxyType.value() == i10) {
                return localProxyType;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
