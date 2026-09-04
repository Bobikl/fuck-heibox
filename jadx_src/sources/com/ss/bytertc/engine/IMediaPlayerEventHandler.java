package com.ss.bytertc.engine;

import com.ss.bytertc.engine.data.PlayerError;
import com.ss.bytertc.engine.data.PlayerState;

/* JADX INFO: loaded from: classes4.dex */
public interface IMediaPlayerEventHandler {
    void onMediaPlayerPlayingProgress(int i10, long j10);

    void onMediaPlayerStateChanged(int i10, PlayerState playerState, PlayerError playerError);
}
