package com.ss.bytertc.engine.audio;

import com.ss.bytertc.engine.IAudioEffectPlayerEventHandler;
import com.ss.bytertc.engine.data.AudioEffectPlayerConfig;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IAudioEffectPlayer {
    public abstract int getDuration(int i10);

    public abstract int getPosition(int i10);

    public abstract int getVolume(int i10);

    public abstract int pause(int i10);

    public abstract int pauseAll();

    public abstract int preload(int i10, String str);

    public abstract int resume(int i10);

    public abstract int resumeAll();

    public abstract int setEventHandler(IAudioEffectPlayerEventHandler iAudioEffectPlayerEventHandler);

    public abstract int setPosition(int i10, int i11);

    public abstract int setVolume(int i10, int i11);

    public abstract int setVolumeAll(int i10);

    public abstract int start(int i10, String str, AudioEffectPlayerConfig audioEffectPlayerConfig);

    public abstract int stop(int i10);

    public abstract int stopAll();

    public abstract int unload(int i10);

    public abstract int unloadAll();
}
