package com.ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.ss.bytertc.engine.IMediaPlayerEventHandler;
import com.ss.bytertc.engine.data.PlayerError;
import com.ss.bytertc.engine.data.PlayerState;

/* JADX INFO: loaded from: classes4.dex */
public class RTCMediaPlayerEventHandler {
    private IMediaPlayerEventHandler mMediaPlayerHandler;

    @CalledByNative
    void onMediaPlayerPlayingProgress(int i10, long j10) {
        IMediaPlayerEventHandler iMediaPlayerEventHandler = this.mMediaPlayerHandler;
        if (iMediaPlayerEventHandler != null) {
            iMediaPlayerEventHandler.onMediaPlayerPlayingProgress(i10, j10);
        }
    }

    @CalledByNative
    void onMediaPlayerStateChanged(int i10, PlayerState playerState, PlayerError playerError) {
        IMediaPlayerEventHandler iMediaPlayerEventHandler = this.mMediaPlayerHandler;
        if (iMediaPlayerEventHandler != null) {
            iMediaPlayerEventHandler.onMediaPlayerStateChanged(i10, playerState, playerError);
        }
    }

    public void setMediaPlayerEventHandler(IMediaPlayerEventHandler iMediaPlayerEventHandler) {
        this.mMediaPlayerHandler = iMediaPlayerEventHandler;
    }
}
