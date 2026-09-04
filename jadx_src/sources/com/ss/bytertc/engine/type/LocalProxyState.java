package com.ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum LocalProxyState {
    INITED(0),
    CONNECTED(1),
    ERROR(2);

    private int value;

    LocalProxyState(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static LocalProxyState fromId(int i10) {
        for (LocalProxyState localProxyState : values()) {
            if (localProxyState.value() == i10) {
                return localProxyState;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
