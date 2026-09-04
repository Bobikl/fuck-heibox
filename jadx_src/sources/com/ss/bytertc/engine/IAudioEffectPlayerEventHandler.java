package com.ss.bytertc.engine;

import com.ss.bytertc.engine.data.PlayerError;
import com.ss.bytertc.engine.data.PlayerState;

/* JADX INFO: loaded from: classes4.dex */
public interface IAudioEffectPlayerEventHandler {
    void onAudioEffectPlayerStateChanged(int i10, PlayerState playerState, PlayerError playerError);
}
