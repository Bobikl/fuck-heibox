package com.ss.bytertc.engine.live;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum ChorusCacheSyncError {
    CHORUS_CACHE_SYNC_ERROR_OK(0),
    CHORUS_CACHE_SYNC_ERROR_WRONG_STATE(1),
    CHORUS_CACHE_SYNC_ERROR_ALREADY_RUNNING(2);

    private int value;

    ChorusCacheSyncError(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static ChorusCacheSyncError fromId(int i10) {
        for (ChorusCacheSyncError chorusCacheSyncError : values()) {
            if (chorusCacheSyncError.value() == i10) {
                return chorusCacheSyncError;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
