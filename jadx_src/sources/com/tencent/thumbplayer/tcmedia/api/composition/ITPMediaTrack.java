package com.tencent.thumbplayer.tcmedia.api.composition;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface ITPMediaTrack extends ITPMediaAsset {
    int addTrackClip(ITPMediaTrackClip iTPMediaTrackClip);

    List<ITPMediaTrackClip> getAllTrackClips();

    long getTimelineDurationMs();

    ITPMediaTrackClip getTrackClip(int i10);

    int getTrackId();

    int insertTrackClip(ITPMediaTrackClip iTPMediaTrackClip, int i10);

    void removeAllTrackClips();

    boolean removeTrackClip(ITPMediaTrackClip iTPMediaTrackClip);

    boolean swapTrackClip(int i10, int i11);
}
