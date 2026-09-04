package com.ss.bytertc.engine;

import com.ss.bytertc.engine.audio.IAudioEffectPlayer;
import com.ss.bytertc.engine.data.AudioEffectPlayerConfig;
import com.ss.bytertc.engine.data.ReturnStatus;
import com.ss.bytertc.engine.handler.RTCAudioEffectPlayerEventHandler;
import com.ss.bytertc.engine.utils.LogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class AudioEffectPlayer extends IAudioEffectPlayer {
    private static final String TAG = "AudioEffectPlayer";
    private RTCAudioEffectPlayerEventHandler mAudioEffectPlayerEventHandler;
    private long mNativeAudioEffectPlayer;
    private long mNativeRTCEngine;

    public AudioEffectPlayer(long j10) {
        this(j10, 0L);
    }

    public AudioEffectPlayer(long j10, long j11) {
        this.mAudioEffectPlayerEventHandler = null;
        this.mNativeAudioEffectPlayer = j10;
        this.mNativeRTCEngine = j11;
        this.mAudioEffectPlayerEventHandler = new RTCAudioEffectPlayerEventHandler();
    }

    public synchronized void destroy() {
        this.mNativeAudioEffectPlayer = 0L;
    }

    @Override // com.ss.bytertc.engine.audio.IAudioEffectPlayer
    public synchronized int getDuration(int i10) {
        long j10 = this.mNativeAudioEffectPlayer;
        if (j10 != 0) {
            return NativeAudioEffectPlayerFunctions.nativeGetDuration(j10, i10);
        }
        LogUtil.e(TAG, "native AudioEffectPlayer is invalid, getDuration failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IAudioEffectPlayer
    public synchronized int getPosition(int i10) {
        long j10 = this.mNativeAudioEffectPlayer;
        if (j10 != 0) {
            return NativeAudioEffectPlayerFunctions.nativeGetPosition(j10, i10);
        }
        LogUtil.e(TAG, "native AudioEffectPlayer is invalid, getPosition failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IAudioEffectPlayer
    public synchronized int getVolume(int i10) {
        long j10 = this.mNativeAudioEffectPlayer;
        if (j10 != 0) {
            return NativeAudioEffectPlayerFunctions.nativeGetVolume(j10, i10);
        }
        LogUtil.e(TAG, "native AudioEffectPlayer is invalid, getVolume failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IAudioEffectPlayer
    public synchronized int pause(int i10) {
        long j10 = this.mNativeAudioEffectPlayer;
        if (j10 != 0) {
            return NativeAudioEffectPlayerFunctions.nativePause(j10, i10);
        }
        LogUtil.e(TAG, "native AudioEffectPlayer is invalid, pause failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IAudioEffectPlayer
    public synchronized int pauseAll() {
        long j10 = this.mNativeAudioEffectPlayer;
        if (j10 != 0) {
            return NativeAudioEffectPlayerFunctions.nativePauseAll(j10);
        }
        LogUtil.e(TAG, "native AudioEffectPlayer is invalid, pauseAll failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IAudioEffectPlayer
    public synchronized int preload(int i10, String str) {
        long j10 = this.mNativeAudioEffectPlayer;
        if (j10 != 0) {
            return NativeAudioEffectPlayerFunctions.nativePreload(j10, i10, str);
        }
        LogUtil.e(TAG, "native AudioEffectPlayer is invalid, preload failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IAudioEffectPlayer
    public synchronized int resume(int i10) {
        long j10 = this.mNativeAudioEffectPlayer;
        if (j10 != 0) {
            return NativeAudioEffectPlayerFunctions.nativeResume(j10, i10);
        }
        LogUtil.e(TAG, "native AudioEffectPlayer is invalid, resume failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IAudioEffectPlayer
    public synchronized int resumeAll() {
        long j10 = this.mNativeAudioEffectPlayer;
        if (j10 != 0) {
            return NativeAudioEffectPlayerFunctions.nativeResumeAll(j10);
        }
        LogUtil.e(TAG, "native AudioEffectPlayer is invalid, resumeAll failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IAudioEffectPlayer
    public synchronized int setEventHandler(IAudioEffectPlayerEventHandler iAudioEffectPlayerEventHandler) {
        if (this.mNativeAudioEffectPlayer != 0 && this.mNativeRTCEngine != 0) {
            this.mAudioEffectPlayerEventHandler.setAudioEffectPlayerEventHandler(iAudioEffectPlayerEventHandler);
            if (iAudioEffectPlayerEventHandler == null) {
                return NativeAudioEffectPlayerFunctions.nativeSetEventHandler(this.mNativeAudioEffectPlayer, this.mNativeRTCEngine, null);
            }
            return NativeAudioEffectPlayerFunctions.nativeSetEventHandler(this.mNativeAudioEffectPlayer, this.mNativeRTCEngine, this.mAudioEffectPlayerEventHandler);
        }
        LogUtil.e(TAG, "native AudioEffectPlayer is invalid or nativeEngine is invalid, setEventHandler failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IAudioEffectPlayer
    public synchronized int setPosition(int i10, int i11) {
        long j10 = this.mNativeAudioEffectPlayer;
        if (j10 != 0) {
            return NativeAudioEffectPlayerFunctions.nativeSetPosition(j10, i10, i11);
        }
        LogUtil.e(TAG, "native AudioEffectPlayer is invalid, setPosition failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IAudioEffectPlayer
    public synchronized int setVolume(int i10, int i11) {
        long j10 = this.mNativeAudioEffectPlayer;
        if (j10 != 0) {
            return NativeAudioEffectPlayerFunctions.nativeSetVolume(j10, i10, i11);
        }
        LogUtil.e(TAG, "native AudioEffectPlayer is invalid, setVolume failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IAudioEffectPlayer
    public synchronized int setVolumeAll(int i10) {
        long j10 = this.mNativeAudioEffectPlayer;
        if (j10 != 0) {
            return NativeAudioEffectPlayerFunctions.nativeSetVolumeAll(j10, i10);
        }
        LogUtil.e(TAG, "native AudioEffectPlayer is invalid, setVolumeAll failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IAudioEffectPlayer
    public synchronized int start(int i10, String str, AudioEffectPlayerConfig audioEffectPlayerConfig) {
        long j10 = this.mNativeAudioEffectPlayer;
        if (j10 != 0) {
            return NativeAudioEffectPlayerFunctions.nativeStart(j10, i10, str, audioEffectPlayerConfig.type.value(), audioEffectPlayerConfig.playCount, audioEffectPlayerConfig.startPos, audioEffectPlayerConfig.pitch);
        }
        LogUtil.e(TAG, "native AudioEffectPlayer is invalid, start failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IAudioEffectPlayer
    public synchronized int stop(int i10) {
        long j10 = this.mNativeAudioEffectPlayer;
        if (j10 != 0) {
            return NativeAudioEffectPlayerFunctions.nativeStop(j10, i10);
        }
        LogUtil.e(TAG, "native AudioEffectPlayer is invalid, stop failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IAudioEffectPlayer
    public synchronized int stopAll() {
        long j10 = this.mNativeAudioEffectPlayer;
        if (j10 != 0) {
            return NativeAudioEffectPlayerFunctions.nativeStopAll(j10);
        }
        LogUtil.e(TAG, "native AudioEffectPlayer is invalid, stopAll failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IAudioEffectPlayer
    public synchronized int unload(int i10) {
        long j10 = this.mNativeAudioEffectPlayer;
        if (j10 != 0) {
            return NativeAudioEffectPlayerFunctions.nativeUnload(j10, i10);
        }
        LogUtil.e(TAG, "native AudioEffectPlayer is invalid, unload failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IAudioEffectPlayer
    public synchronized int unloadAll() {
        long j10 = this.mNativeAudioEffectPlayer;
        if (j10 != 0) {
            return NativeAudioEffectPlayerFunctions.nativeUnloadAll(j10);
        }
        LogUtil.e(TAG, "native AudioEffectPlayer is invalid, unloadAll failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }
}
