package com.ss.bytertc.engine;

import com.ss.bytertc.engine.utils.AudioFrame;

/* JADX INFO: loaded from: classes4.dex */
public interface IAudioFrameTestObserver {
    void onAudioRecordFrame(AudioFrame audioFrame);

    void onLocalAudioVolume(int i10, int i11);

    boolean onPlayoutBufferSink(int i10, AudioFrame audioFrame);
}
