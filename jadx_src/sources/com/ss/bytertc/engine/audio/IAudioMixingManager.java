package com.ss.bytertc.engine.audio;

import com.ss.bytertc.engine.IAudioFileFrameObserver;
import com.ss.bytertc.engine.data.AudioMixingConfig;
import com.ss.bytertc.engine.data.AudioMixingDualMonoMode;
import com.ss.bytertc.engine.data.AudioMixingType;
import com.ss.bytertc.engine.utils.AudioFrame;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IAudioMixingManager {
    @Deprecated
    public abstract void disableAudioMixingFrame(int i10);

    @Deprecated
    public abstract void enableAudioMixingFrame(int i10, AudioMixingType audioMixingType);

    @Deprecated
    public abstract int getAudioMixingCurrentPosition(int i10);

    @Deprecated
    public abstract int getAudioMixingDuration(int i10);

    @Deprecated
    public abstract int getAudioMixingPlaybackDuration(int i10);

    @Deprecated
    public abstract int getAudioTrackCount(int i10);

    @Deprecated
    public abstract void pauseAllAudioMixing();

    @Deprecated
    public abstract void pauseAudioMixing(int i10);

    @Deprecated
    public abstract void preloadAudioMixing(int i10, String str);

    @Deprecated
    public abstract int pushAudioMixingFrame(int i10, AudioFrame audioFrame);

    @Deprecated
    public abstract void registerAudioFileFrameObserver(IAudioFileFrameObserver iAudioFileFrameObserver);

    @Deprecated
    public abstract void resumeAllAudioMixing();

    @Deprecated
    public abstract void resumeAudioMixing(int i10);

    @Deprecated
    public abstract void selectAudioTrack(int i10, int i11);

    @Deprecated
    public abstract void setAllAudioMixingVolume(int i10, AudioMixingType audioMixingType);

    @Deprecated
    public abstract void setAudioMixingDualMonoMode(int i10, AudioMixingDualMonoMode audioMixingDualMonoMode);

    @Deprecated
    public abstract void setAudioMixingLoudness(int i10, float f10);

    @Deprecated
    public abstract void setAudioMixingPitch(int i10, int i11);

    @Deprecated
    public abstract int setAudioMixingPlaybackSpeed(int i10, int i11);

    @Deprecated
    public abstract void setAudioMixingPosition(int i10, int i11);

    @Deprecated
    public abstract void setAudioMixingProgressInterval(int i10, long j10);

    @Deprecated
    public abstract void setAudioMixingVolume(int i10, int i11, AudioMixingType audioMixingType);

    @Deprecated
    public abstract void startAudioMixing(int i10, String str, AudioMixingConfig audioMixingConfig);

    @Deprecated
    public abstract void stopAllAudioMixing();

    @Deprecated
    public abstract void stopAudioMixing(int i10);

    @Deprecated
    public abstract void unloadAudioMixing(int i10);
}
