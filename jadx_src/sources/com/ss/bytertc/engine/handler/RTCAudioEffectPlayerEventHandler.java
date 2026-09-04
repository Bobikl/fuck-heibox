package com.ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.ss.bytertc.engine.IAudioEffectPlayerEventHandler;
import com.ss.bytertc.engine.data.PlayerError;
import com.ss.bytertc.engine.data.PlayerState;

/* JADX INFO: loaded from: classes4.dex */
public class RTCAudioEffectPlayerEventHandler {
    private IAudioEffectPlayerEventHandler mAudioEffectHandler;

    @CalledByNative
    void onAudioEffectPlayerStateChanged(int i10, PlayerState playerState, PlayerError playerError) {
        IAudioEffectPlayerEventHandler iAudioEffectPlayerEventHandler = this.mAudioEffectHandler;
        if (iAudioEffectPlayerEventHandler != null) {
            iAudioEffectPlayerEventHandler.onAudioEffectPlayerStateChanged(i10, playerState, playerError);
        }
    }

    public void setAudioEffectPlayerEventHandler(IAudioEffectPlayerEventHandler iAudioEffectPlayerEventHandler) {
        this.mAudioEffectHandler = iAudioEffectPlayerEventHandler;
    }
}
