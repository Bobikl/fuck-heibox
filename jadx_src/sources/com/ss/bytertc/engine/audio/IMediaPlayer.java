package com.ss.bytertc.engine.audio;

import com.ss.bytertc.engine.IMediaPlayerAudioFrameObserver;
import com.ss.bytertc.engine.IMediaPlayerEventHandler;
import com.ss.bytertc.engine.data.AudioMixingDualMonoMode;
import com.ss.bytertc.engine.data.AudioMixingType;
import com.ss.bytertc.engine.data.MediaPlayerConfig;
import com.ss.bytertc.engine.data.MediaPlayerCustomSource;
import com.ss.bytertc.engine.utils.AudioFrame;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IMediaPlayer {
    public abstract int getAudioTrackCount();

    public abstract int getPlaybackDuration();

    public abstract int getPosition();

    public abstract int getTotalDuration();

    public abstract int getVolume(AudioMixingType audioMixingType);

    public abstract int open(String str, MediaPlayerConfig mediaPlayerConfig);

    public abstract int openWithCustomSource(MediaPlayerCustomSource mediaPlayerCustomSource, MediaPlayerConfig mediaPlayerConfig);

    public abstract int pause();

    public abstract int pushExternalAudioFrame(AudioFrame audioFrame);

    public abstract int registerAudioFrameObserver(IMediaPlayerAudioFrameObserver iMediaPlayerAudioFrameObserver);

    public abstract int resume();

    public abstract int selectAudioTrack(int i10);

    public abstract int setAudioDualMonoMode(AudioMixingDualMonoMode audioMixingDualMonoMode);

    public abstract int setAudioPitch(int i10);

    public abstract int setEventHandler(IMediaPlayerEventHandler iMediaPlayerEventHandler);

    public abstract int setLoudness(float f10);

    public abstract int setPlaybackSpeed(int i10);

    public abstract int setPosition(int i10);

    public abstract int setProgressInterval(long j10);

    public abstract int setVolume(int i10, AudioMixingType audioMixingType);

    public abstract int start();

    public abstract int stop();
}
