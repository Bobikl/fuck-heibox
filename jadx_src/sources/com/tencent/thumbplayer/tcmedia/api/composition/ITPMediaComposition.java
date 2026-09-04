package com.tencent.thumbplayer.tcmedia.api.composition;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface ITPMediaComposition extends ITPMediaAsset {
    ITPMediaTrack addAVTrack();

    ITPMediaTrack addAudioTrack();

    ITPMediaTrack addVideoTrack();

    List<ITPMediaTrack> getAllAVTracks();

    List<ITPMediaTrack> getAllAudioTracks();

    List<ITPMediaTrack> getAllVideoTracks();

    long getDurationMs();

    void release();

    boolean removeAVTrack(ITPMediaTrack iTPMediaTrack);

    boolean removeAudioTrack(ITPMediaTrack iTPMediaTrack);

    boolean removeVideoTrack(ITPMediaTrack iTPMediaTrack);
}
