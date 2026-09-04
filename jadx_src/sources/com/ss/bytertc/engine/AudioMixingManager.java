package com.ss.bytertc.engine;

import com.ss.bytertc.engine.audio.IAudioMixingManager;
import com.ss.bytertc.engine.data.AudioMixingConfig;
import com.ss.bytertc.engine.data.AudioMixingDualMonoMode;
import com.ss.bytertc.engine.data.AudioMixingType;
import com.ss.bytertc.engine.data.ReturnStatus;
import com.ss.bytertc.engine.handler.RTCAudioFileFrameObserver;
import com.ss.bytertc.engine.utils.AudioFrame;
import com.ss.bytertc.engine.utils.LogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class AudioMixingManager extends IAudioMixingManager {
    private static final String TAG = "AudioMixingManager";
    private RTCAudioFileFrameObserver mAudioFileFrameObserver;
    private long mNativeAudioMixingManager;
    private long mNativeRTCEngine;

    public AudioMixingManager(long j10) {
        this(j10, 0L);
    }

    public AudioMixingManager(long j10, long j11) {
        this.mAudioFileFrameObserver = null;
        this.mNativeAudioMixingManager = j10;
        this.mNativeRTCEngine = j11;
        this.mAudioFileFrameObserver = new RTCAudioFileFrameObserver();
    }

    public synchronized void destroy() {
        this.mNativeAudioMixingManager = 0L;
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public synchronized void disableAudioMixingFrame(int i10) {
        long j10 = this.mNativeAudioMixingManager;
        if (j10 == 0) {
            LogUtil.e(TAG, "native AudioMixingManager is invalid, DisableAudioMixingFrame failed.");
        } else {
            NativeAudioMixingManagerFunctions.nativeDisableAudioMixingFrame(j10, i10);
        }
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public synchronized void enableAudioMixingFrame(int i10, AudioMixingType audioMixingType) {
        long j10 = this.mNativeAudioMixingManager;
        if (j10 == 0) {
            LogUtil.e(TAG, "native AudioMixingManager is invalid, EnableAudioMixingFrame failed.");
        } else {
            NativeAudioMixingManagerFunctions.nativeEnableAudioMixingFrame(j10, i10, audioMixingType.value());
        }
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public synchronized int getAudioMixingCurrentPosition(int i10) {
        long j10 = this.mNativeAudioMixingManager;
        if (j10 == 0) {
            LogUtil.e(TAG, "native AudioMixingManager is invalid, GetAudioMixingCurrentPosition failed.");
            return -1;
        }
        return NativeAudioMixingManagerFunctions.nativeGetAudioMixingCurrentPosition(j10, i10);
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public synchronized int getAudioMixingDuration(int i10) {
        long j10 = this.mNativeAudioMixingManager;
        if (j10 == 0) {
            LogUtil.e(TAG, "native AudioMixingManager is invalid, GetAudioMixingDuration failed.");
            return -1;
        }
        return NativeAudioMixingManagerFunctions.nativeGetAudioMixingDuration(j10, i10);
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public synchronized int getAudioMixingPlaybackDuration(int i10) {
        long j10 = this.mNativeAudioMixingManager;
        if (j10 == 0) {
            LogUtil.e(TAG, "native AudioMixingManager is invalid, getAudioMixingPlaybackDuration failed.");
            return -1;
        }
        return NativeAudioMixingManagerFunctions.nativeGetAudioMixingPlaybackDuration(j10, i10);
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public synchronized int getAudioTrackCount(int i10) {
        long j10 = this.mNativeAudioMixingManager;
        if (j10 == 0) {
            LogUtil.e(TAG, "native AudioMixingManager is invalid, GetAudioTrackCount failed.");
            return -1;
        }
        return NativeAudioMixingManagerFunctions.nativeGetAudioTrackCount(j10, i10);
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public synchronized void pauseAllAudioMixing() {
        long j10 = this.mNativeAudioMixingManager;
        if (j10 == 0) {
            LogUtil.e(TAG, "native AudioMixingManager is invalid, PauseAllAudioMixing failed.");
        } else {
            NativeAudioMixingManagerFunctions.nativePauseAllAudioMixing(j10);
        }
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public synchronized void pauseAudioMixing(int i10) {
        long j10 = this.mNativeAudioMixingManager;
        if (j10 == 0) {
            LogUtil.e(TAG, "native AudioMixingManager is invalid, PauseAudioMixing failed.");
        } else {
            NativeAudioMixingManagerFunctions.nativePauseAudioMixing(j10, i10);
        }
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public synchronized void preloadAudioMixing(int i10, String str) {
        long j10 = this.mNativeAudioMixingManager;
        if (j10 == 0) {
            LogUtil.e(TAG, "native AudioMixingManager is invalid, PreloadAudioMixing failed.");
        } else {
            NativeAudioMixingManagerFunctions.nativePreloadAudioMixing(j10, i10, str);
        }
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public synchronized int pushAudioMixingFrame(int i10, AudioFrame audioFrame) {
        long j10 = this.mNativeAudioMixingManager;
        if (j10 != 0) {
            return NativeAudioMixingManagerFunctions.nativePushAudioMixingFrame(j10, i10, audioFrame.buffer, audioFrame.samples, audioFrame.sampleRate.value(), audioFrame.channel.value());
        }
        LogUtil.e(TAG, "native AudioMixingManager is invalid, PushAudioMixingFrame failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public synchronized void registerAudioFileFrameObserver(IAudioFileFrameObserver iAudioFileFrameObserver) {
        long j10 = this.mNativeAudioMixingManager;
        if (j10 != 0 && this.mNativeRTCEngine != 0) {
            this.mAudioFileFrameObserver.setAudioFileFrameObserver(iAudioFileFrameObserver);
            if (iAudioFileFrameObserver == null) {
                NativeAudioMixingManagerFunctions.nativeSetAudioFileFrameObserver(this.mNativeAudioMixingManager, this.mNativeRTCEngine, null);
            } else {
                NativeAudioMixingManagerFunctions.nativeSetAudioFileFrameObserver(this.mNativeAudioMixingManager, this.mNativeRTCEngine, this.mAudioFileFrameObserver);
            }
            return;
        }
        LogUtil.e(TAG, String.format("native AudioMixingManager or nativeEngine is invalid, registerAudioFileFrameObserver failed. audiomixixngptr=%d, rtcengine=%d", Long.valueOf(j10), Long.valueOf(this.mNativeRTCEngine)));
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public synchronized void resumeAllAudioMixing() {
        long j10 = this.mNativeAudioMixingManager;
        if (j10 == 0) {
            LogUtil.e(TAG, "native AudioMixingManager is invalid, ResumeAllAudioMixing failed.");
        } else {
            NativeAudioMixingManagerFunctions.nativeResumeAllAudioMixing(j10);
        }
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public synchronized void resumeAudioMixing(int i10) {
        long j10 = this.mNativeAudioMixingManager;
        if (j10 == 0) {
            LogUtil.e(TAG, "native AudioMixingManager is invalid, ResumeAudioMixing failed.");
        } else {
            NativeAudioMixingManagerFunctions.nativeResumeAudioMixing(j10, i10);
        }
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public synchronized void selectAudioTrack(int i10, int i11) {
        long j10 = this.mNativeAudioMixingManager;
        if (j10 == 0) {
            LogUtil.e(TAG, "native AudioMixingManager is invalid, SelectAudioTrack failed.");
        } else {
            NativeAudioMixingManagerFunctions.nativeSelectAudioTrack(j10, i10, i11);
        }
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public void setAllAudioMixingVolume(int i10, AudioMixingType audioMixingType) {
        long j10 = this.mNativeAudioMixingManager;
        if (j10 == 0) {
            LogUtil.e(TAG, "native AudioMixingManager is invalid, SetAllAudioMixingVolume failed.");
        } else {
            NativeAudioMixingManagerFunctions.nativeSetAllAudioMixingVolume(j10, i10, audioMixingType.value());
        }
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public synchronized void setAudioMixingDualMonoMode(int i10, AudioMixingDualMonoMode audioMixingDualMonoMode) {
        long j10 = this.mNativeAudioMixingManager;
        if (j10 == 0) {
            LogUtil.e(TAG, "native AudioMixingManager is invalid, setAudioMixingDualMonoMode failed.");
        } else {
            NativeAudioMixingManagerFunctions.nativeSetAudioMixingDualMonoMode(j10, i10, audioMixingDualMonoMode.value());
        }
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public synchronized void setAudioMixingLoudness(int i10, float f10) {
        long j10 = this.mNativeAudioMixingManager;
        if (j10 == 0) {
            LogUtil.e(TAG, "native AudioMixingManager is invalid, setAudioMixingLoudness failed.");
        } else {
            NativeAudioMixingManagerFunctions.nativeSetAudioMixingLoudness(j10, i10, f10);
        }
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public synchronized void setAudioMixingPitch(int i10, int i11) {
        long j10 = this.mNativeAudioMixingManager;
        if (j10 == 0) {
            LogUtil.e(TAG, "native AudioMixingManager is invalid, setAudioMixingPitch failed.");
        } else {
            NativeAudioMixingManagerFunctions.nativeSetAudioMixingPitch(j10, i10, i11);
        }
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public synchronized int setAudioMixingPlaybackSpeed(int i10, int i11) {
        long j10 = this.mNativeAudioMixingManager;
        if (j10 != 0) {
            return NativeAudioMixingManagerFunctions.nativeSetAudioMixingPlaybackSpeed(j10, i10, i11);
        }
        LogUtil.e(TAG, "native AudioMixingManager is invalid, setAudioMixingPlaybackSpeed failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public synchronized void setAudioMixingPosition(int i10, int i11) {
        long j10 = this.mNativeAudioMixingManager;
        if (j10 == 0) {
            LogUtil.e(TAG, "native AudioMixingManager is invalid, SetAudioMixingPosition failed.");
        } else {
            NativeAudioMixingManagerFunctions.nativeSetAudioMixingPosition(j10, i10, i11);
        }
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public synchronized void setAudioMixingProgressInterval(int i10, long j10) {
        long j11 = this.mNativeAudioMixingManager;
        if (j11 == 0) {
            LogUtil.e(TAG, "native AudioMixingManager is invalid, setAudioMixingProgressInterval failed.");
        } else {
            NativeAudioMixingManagerFunctions.nativeSetAudioMixingProgressInterval(j11, i10, j10);
        }
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public synchronized void setAudioMixingVolume(int i10, int i11, AudioMixingType audioMixingType) {
        long j10 = this.mNativeAudioMixingManager;
        if (j10 == 0) {
            LogUtil.e(TAG, "native AudioMixingManager is invalid, SetAudioMixingVolume failed.");
        } else {
            NativeAudioMixingManagerFunctions.nativeSetAudioMixingVolume(j10, i10, i11, audioMixingType.value());
        }
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public synchronized void startAudioMixing(int i10, String str, AudioMixingConfig audioMixingConfig) {
        long j10 = this.mNativeAudioMixingManager;
        if (j10 == 0) {
            LogUtil.e(TAG, "native AudioMixingManager is invalid, StartAudioMixing failed.");
        } else {
            NativeAudioMixingManagerFunctions.nativeStartAudioMixing(j10, i10, str, audioMixingConfig.type.value(), audioMixingConfig.playCount, audioMixingConfig.position, audioMixingConfig.callbackOnProgressInterval, audioMixingConfig.syncProgressToRecordFrame);
        }
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public synchronized void stopAllAudioMixing() {
        long j10 = this.mNativeAudioMixingManager;
        if (j10 == 0) {
            LogUtil.e(TAG, "native AudioMixingManager is invalid, StopAllAudioMixing failed.");
        } else {
            NativeAudioMixingManagerFunctions.nativeStopAllAudioMixing(j10);
        }
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public synchronized void stopAudioMixing(int i10) {
        long j10 = this.mNativeAudioMixingManager;
        if (j10 == 0) {
            LogUtil.e(TAG, "native AudioMixingManager is invalid, StopAudioMixing failed.");
        } else {
            NativeAudioMixingManagerFunctions.nativeStopAudioMixing(j10, i10);
        }
    }

    @Override // com.ss.bytertc.engine.audio.IAudioMixingManager
    public synchronized void unloadAudioMixing(int i10) {
        long j10 = this.mNativeAudioMixingManager;
        if (j10 == 0) {
            LogUtil.e(TAG, "native AudioMixingManager is invalid, UnloadAudioMixing failed.");
        } else {
            NativeAudioMixingManagerFunctions.nativeUnloadAudioMixing(j10, i10);
        }
    }
}
