package com.ss.bytertc.engine.live;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class ChorusCacheSyncConfig {
    private int maxCacheTimeMs = 2000;
    private ChorusCacheSyncMode mode = ChorusCacheSyncMode.CHORUS_CACHE_SYNC_MODE_RETRANSMITTER;
    private int videoFps = 15;

    @CalledByNative
    public int getChorusCacheSyncConfigMaxCacheTimeMs() {
        return this.maxCacheTimeMs;
    }

    @CalledByNative
    public int getChorusCacheSyncConfigMode() {
        return this.mode.value();
    }

    @CalledByNative
    public int getChorusCacheSyncConfigVideoFps() {
        return this.videoFps;
    }

    public int getMaxCacheTimeMs() {
        return this.maxCacheTimeMs;
    }

    public ChorusCacheSyncMode getMode() {
        return this.mode;
    }

    public int getVideoFps() {
        return this.videoFps;
    }

    public ChorusCacheSyncConfig setMaxCacheTimeMs(int i10) {
        this.maxCacheTimeMs = i10;
        return this;
    }

    public ChorusCacheSyncConfig setMode(ChorusCacheSyncMode chorusCacheSyncMode) {
        this.mode = chorusCacheSyncMode;
        return this;
    }

    public ChorusCacheSyncConfig setVideoFps(int i10) {
        this.videoFps = i10;
        return this;
    }
}
