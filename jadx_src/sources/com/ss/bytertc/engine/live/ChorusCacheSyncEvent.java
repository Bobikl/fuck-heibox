package com.ss.bytertc.engine.live;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum ChorusCacheSyncEvent {
    CHORUS_CACHE_SYNC_EVENT_START_SUCCESS(0),
    CHORUS_CACHE_SYNC_EVENT_START_FAILED(1);

    private int value;

    ChorusCacheSyncEvent(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static ChorusCacheSyncEvent fromId(int i10) {
        for (ChorusCacheSyncEvent chorusCacheSyncEvent : values()) {
            if (chorusCacheSyncEvent.value() == i10) {
                return chorusCacheSyncEvent;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
