package com.ss.bytertc.engine;

import com.ss.bytertc.engine.audio.IMediaPlayer;
import com.ss.bytertc.engine.data.AudioMixingDualMonoMode;
import com.ss.bytertc.engine.data.AudioMixingType;
import com.ss.bytertc.engine.data.MediaPlayerConfig;
import com.ss.bytertc.engine.data.MediaPlayerCustomSource;
import com.ss.bytertc.engine.data.ReturnStatus;
import com.ss.bytertc.engine.handler.RTCMediaPlayerAudioFrameObserver;
import com.ss.bytertc.engine.handler.RTCMediaPlayerCustomSourceProvider;
import com.ss.bytertc.engine.handler.RTCMediaPlayerEventHandler;
import com.ss.bytertc.engine.utils.AudioFrame;
import com.ss.bytertc.engine.utils.LogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class RtcMediaPlayer extends IMediaPlayer {
    private static final String TAG = "MediaPlayer";
    private RTCMediaPlayerAudioFrameObserver mAudioFrameObserver;
    private RTCMediaPlayerCustomSourceProvider mMediaPlayerCustomSourceProvider;
    private RTCMediaPlayerEventHandler mMediaPlayerEventHandler;
    private long mNativeMediaPlayer;
    private long mNativeRTCEngine;

    public RtcMediaPlayer(long j10) {
        this(j10, 0L);
    }

    public RtcMediaPlayer(long j10, long j11) {
        this.mAudioFrameObserver = null;
        this.mMediaPlayerEventHandler = null;
        this.mMediaPlayerCustomSourceProvider = null;
        this.mNativeMediaPlayer = j10;
        this.mNativeRTCEngine = j11;
        this.mAudioFrameObserver = new RTCMediaPlayerAudioFrameObserver();
        this.mMediaPlayerEventHandler = new RTCMediaPlayerEventHandler();
        this.mMediaPlayerCustomSourceProvider = new RTCMediaPlayerCustomSourceProvider();
    }

    public synchronized void destroy() {
        NativeMediaPlayerFunctions.nativeDestory(this.mNativeMediaPlayer);
        this.mNativeMediaPlayer = 0L;
        this.mNativeRTCEngine = 0L;
        this.mAudioFrameObserver = null;
        this.mMediaPlayerEventHandler = null;
        this.mMediaPlayerCustomSourceProvider = null;
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int getAudioTrackCount() {
        long j10 = this.mNativeMediaPlayer;
        if (j10 != 0) {
            return NativeMediaPlayerFunctions.nativeGetAudioTrackCount(j10);
        }
        LogUtil.e(TAG, "native MediaPlayer is invalid, getAudioTrackCount failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int getPlaybackDuration() {
        long j10 = this.mNativeMediaPlayer;
        if (j10 != 0) {
            return NativeMediaPlayerFunctions.nativeGetPlaybackDuration(j10);
        }
        LogUtil.e(TAG, "native MediaPlayer is invalid, getPlaybackDuration failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int getPosition() {
        long j10 = this.mNativeMediaPlayer;
        if (j10 != 0) {
            return NativeMediaPlayerFunctions.nativeGetPosition(j10);
        }
        LogUtil.e(TAG, "native MediaPlayer is invalid, getPosition failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int getTotalDuration() {
        long j10 = this.mNativeMediaPlayer;
        if (j10 != 0) {
            return NativeMediaPlayerFunctions.nativeGetTotalDuration(j10);
        }
        LogUtil.e(TAG, "native MediaPlayer is invalid, getTotalDuration failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int getVolume(AudioMixingType audioMixingType) {
        long j10 = this.mNativeMediaPlayer;
        if (j10 != 0) {
            return NativeMediaPlayerFunctions.nativeGetVolume(j10, audioMixingType.value());
        }
        LogUtil.e(TAG, "native MediaPlayer is invalid, getVolume failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int open(String str, MediaPlayerConfig mediaPlayerConfig) {
        long j10 = this.mNativeMediaPlayer;
        if (j10 != 0) {
            return NativeMediaPlayerFunctions.nativeOpen(j10, str, mediaPlayerConfig.type.value(), mediaPlayerConfig.playCount, mediaPlayerConfig.startPos, mediaPlayerConfig.autoPlay, mediaPlayerConfig.callbackOnProgressInterval, mediaPlayerConfig.syncProgressToRecordFrame);
        }
        LogUtil.e(TAG, "native MediaPlayer is invalid, open failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int openWithCustomSource(MediaPlayerCustomSource mediaPlayerCustomSource, MediaPlayerConfig mediaPlayerConfig) {
        if (this.mNativeMediaPlayer == 0) {
            LogUtil.e(TAG, "native MediaPlayer is invalid, openWithCustomSource failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        this.mMediaPlayerCustomSourceProvider.setCustomSourceProvider(mediaPlayerCustomSource.provider);
        return NativeMediaPlayerFunctions.nativeOpenWithCustomSource(this.mNativeMediaPlayer, mediaPlayerCustomSource.mode.value(), mediaPlayerCustomSource.type.value(), this.mMediaPlayerCustomSourceProvider, mediaPlayerConfig.type.value(), mediaPlayerConfig.playCount, mediaPlayerConfig.startPos, mediaPlayerConfig.autoPlay, mediaPlayerConfig.callbackOnProgressInterval, mediaPlayerConfig.syncProgressToRecordFrame);
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int pause() {
        long j10 = this.mNativeMediaPlayer;
        if (j10 != 0) {
            return NativeMediaPlayerFunctions.nativePause(j10);
        }
        LogUtil.e(TAG, "native MediaPlayer is invalid, pause failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int pushExternalAudioFrame(AudioFrame audioFrame) {
        long j10 = this.mNativeMediaPlayer;
        if (j10 != 0) {
            return NativeMediaPlayerFunctions.nativePushExternalAudioFrame(j10, audioFrame.buffer, audioFrame.samples, audioFrame.sampleRate.value(), audioFrame.channel.value());
        }
        LogUtil.e(TAG, "native MediaPlayer is invalid, pushExternalAudioFrame failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int registerAudioFrameObserver(IMediaPlayerAudioFrameObserver iMediaPlayerAudioFrameObserver) {
        if (this.mNativeMediaPlayer == 0) {
            LogUtil.e(TAG, "native MediaPlayer is invalid, registerAudioFrameObserver failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        this.mAudioFrameObserver.setAudioFrameObserver(iMediaPlayerAudioFrameObserver);
        if (iMediaPlayerAudioFrameObserver == null) {
            return NativeMediaPlayerFunctions.nativeRegisterAudioFrameObserver(this.mNativeMediaPlayer, null);
        }
        return NativeMediaPlayerFunctions.nativeRegisterAudioFrameObserver(this.mNativeMediaPlayer, this.mAudioFrameObserver);
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int resume() {
        long j10 = this.mNativeMediaPlayer;
        if (j10 != 0) {
            return NativeMediaPlayerFunctions.nativeResume(j10);
        }
        LogUtil.e(TAG, "native MediaPlayer is invalid, resume failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int selectAudioTrack(int i10) {
        long j10 = this.mNativeMediaPlayer;
        if (j10 != 0) {
            return NativeMediaPlayerFunctions.nativeSelectAudioTrack(j10, i10);
        }
        LogUtil.e(TAG, "native MediaPlayer is invalid, selectAudioTrack failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int setAudioDualMonoMode(AudioMixingDualMonoMode audioMixingDualMonoMode) {
        long j10 = this.mNativeMediaPlayer;
        if (j10 != 0) {
            return NativeMediaPlayerFunctions.nativeSetAudioDualMonoMode(j10, audioMixingDualMonoMode.value());
        }
        LogUtil.e(TAG, "native MediaPlayer is invalid, setAudioDualMonoMode failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int setAudioPitch(int i10) {
        long j10 = this.mNativeMediaPlayer;
        if (j10 != 0) {
            return NativeMediaPlayerFunctions.nativeSetAudioPitch(j10, i10);
        }
        LogUtil.e(TAG, "native MediaPlayer is invalid, setAudioPitch failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int setEventHandler(IMediaPlayerEventHandler iMediaPlayerEventHandler) {
        if (this.mNativeMediaPlayer == 0) {
            LogUtil.e(TAG, "native MediaPlayer is invalid, setEventHandler failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        this.mMediaPlayerEventHandler.setMediaPlayerEventHandler(iMediaPlayerEventHandler);
        if (iMediaPlayerEventHandler == null) {
            return NativeMediaPlayerFunctions.nativeSetEventHandler(this.mNativeMediaPlayer, null);
        }
        return NativeMediaPlayerFunctions.nativeSetEventHandler(this.mNativeMediaPlayer, this.mMediaPlayerEventHandler);
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int setLoudness(float f10) {
        long j10 = this.mNativeMediaPlayer;
        if (j10 != 0) {
            return NativeMediaPlayerFunctions.nativeSetLoudness(j10, f10);
        }
        LogUtil.e(TAG, "native MediaPlayer is invalid, setLoudness failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int setPlaybackSpeed(int i10) {
        long j10 = this.mNativeMediaPlayer;
        if (j10 != 0) {
            return NativeMediaPlayerFunctions.nativeSetPlaybackSpeed(j10, i10);
        }
        LogUtil.e(TAG, "native MediaPlayer is invalid, setPlaybackSpeed failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int setPosition(int i10) {
        long j10 = this.mNativeMediaPlayer;
        if (j10 != 0) {
            return NativeMediaPlayerFunctions.nativeSetPosition(j10, i10);
        }
        LogUtil.e(TAG, "native MediaPlayer is invalid, setPosition failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int setProgressInterval(long j10) {
        long j11 = this.mNativeMediaPlayer;
        if (j11 != 0) {
            return NativeMediaPlayerFunctions.nativeSetProgressInterval(j11, j10);
        }
        LogUtil.e(TAG, "native MediaPlayer is invalid, setProgressInterval failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int setVolume(int i10, AudioMixingType audioMixingType) {
        long j10 = this.mNativeMediaPlayer;
        if (j10 != 0) {
            return NativeMediaPlayerFunctions.nativeSetVolume(j10, i10, audioMixingType.value());
        }
        LogUtil.e(TAG, "native MediaPlayer is invalid, setVolume failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int start() {
        long j10 = this.mNativeMediaPlayer;
        if (j10 != 0) {
            return NativeMediaPlayerFunctions.nativeStart(j10);
        }
        LogUtil.e(TAG, "native MediaPlayer is invalid, start failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int stop() {
        long j10 = this.mNativeMediaPlayer;
        if (j10 != 0) {
            return NativeMediaPlayerFunctions.nativeStop(j10);
        }
        LogUtil.e(TAG, "native MediaPlayer is invalid, stop failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }
}
