package com.ss.bytertc.engine.video;

import android.graphics.Bitmap;
import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.data.StreamIndex;

/* JADX INFO: loaded from: classes4.dex */
public interface ISnapshotResultCallback {
    void onTakeLocalSnapshotResult(long j10, StreamIndex streamIndex, Bitmap bitmap, int i10);

    void onTakeRemoteSnapshotResult(long j10, RemoteStreamKey remoteStreamKey, Bitmap bitmap, int i10);
}
