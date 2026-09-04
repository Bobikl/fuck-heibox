package com.ss.bytertc.engine.live;

import com.ss.bytertc.engine.video.VideoFrame;

/* JADX INFO: loaded from: classes4.dex */
public interface IChorusCacheSyncObserver {
    void onSyncEvent(ChorusCacheSyncEvent chorusCacheSyncEvent, ChorusCacheSyncError chorusCacheSyncError);

    void onSyncedUsersChanged(int i10, String[] strArr);

    void onSyncedVideoFrames(int i10, String[] strArr, VideoFrame[] videoFrameArr);
}
