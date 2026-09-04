package com.ss.bytertc.engine.live;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum ChorusCacheSyncMode {
    CHORUS_CACHE_SYNC_MODE_PRODUCER(0),
    CHORUS_CACHE_SYNC_MODE_RETRANSMITTER(1),
    CHORUS_CACHE_SYNC_MODE_CONSUMER(2);

    private int value;

    ChorusCacheSyncMode(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static ChorusCacheSyncMode fromId(int i10) {
        for (ChorusCacheSyncMode chorusCacheSyncMode : values()) {
            if (chorusCacheSyncMode.value() == i10) {
                return chorusCacheSyncMode;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
