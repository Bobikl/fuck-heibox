package com.ss.bytertc.ktv;

import androidx.annotation.n0;
import com.ss.bytertc.engine.NativeKTVPlayerFunctions;
import com.ss.bytertc.engine.handler.KTVPlayEventHandler;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.ktv.data.AudioPlayType;
import com.ss.bytertc.ktv.data.AudioTrackType;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes4.dex */
public class KTVPlayerImpl extends IKTVPlayer {
    private static final String TAG = "KTVPlayerImpl";
    private KTVPlayEventHandler handler;
    private final ReentrantReadWriteLock.ReadLock mJniReadLock;
    private final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    private long mNativeKTVPlayer;
    private long mNativePlayerEventHandler;
    private final ReentrantReadWriteLock mReadWriteLock;

    public KTVPlayerImpl(long j10) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.mNativeKTVPlayer = j10;
    }

    public void destroy() {
        this.mJniWriteLock.lock();
        try {
            long j10 = this.mNativePlayerEventHandler;
            if (j10 != 0) {
                NativeKTVPlayerFunctions.nativeReleaseKTVPlayerEventHandler(j10);
                this.mNativePlayerEventHandler = 0L;
            }
            this.mNativeKTVPlayer = 0L;
            this.handler = null;
        } finally {
            this.mJniWriteLock.unlock();
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVPlayer
    public void pauseMusic(@n0 String str) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeKTVPlayer;
            if (j10 == 0) {
                LogUtil.e(TAG, "native mNativeKTVPlayer is invalid, pauseMusic failed.");
            } else {
                NativeKTVPlayerFunctions.nativePauseMusic(j10, str);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVPlayer
    public void playMusic(@n0 String str, @n0 AudioTrackType audioTrackType, @n0 AudioPlayType audioPlayType) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeKTVPlayer;
            if (j10 == 0) {
                LogUtil.e(TAG, "native mNativeKTVPlayer is invalid, playMusic failed.");
            } else {
                NativeKTVPlayerFunctions.nativePlayMusic(j10, str, audioTrackType.value(), audioPlayType.value());
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVPlayer
    public void resumeMusic(@n0 String str) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeKTVPlayer;
            if (j10 == 0) {
                LogUtil.e(TAG, "native mNativeKTVPlayer is invalid, resumeMusic failed.");
            } else {
                NativeKTVPlayerFunctions.nativeResumeMusic(j10, str);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVPlayer
    public void seekMusic(@n0 String str, int i10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeKTVPlayer;
            if (j10 == 0) {
                LogUtil.e(TAG, "native mNativeKTVPlayer is invalid, seekMusic failed.");
            } else {
                NativeKTVPlayerFunctions.nativeSeekMusic(j10, str, i10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVPlayer
    public void setMusicPitch(@n0 String str, int i10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeKTVPlayer;
            if (j10 == 0) {
                LogUtil.e(TAG, "native mNativeKTVPlayer is invalid, setMusicPitch failed.");
            } else {
                NativeKTVPlayerFunctions.nativeSetMusicPitch(j10, str, i10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVPlayer
    public void setMusicVolume(@n0 String str, int i10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeKTVPlayer;
            if (j10 == 0) {
                LogUtil.e(TAG, "native mNativeKTVPlayer is invalid, setMusicVolume failed.");
            } else {
                NativeKTVPlayerFunctions.nativeSetMusicVolume(j10, str, i10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVPlayer
    public void setPlayerEventHandler(IKTVPlayerEventHandler iKTVPlayerEventHandler) {
        KTVPlayEventHandler kTVPlayEventHandler = new KTVPlayEventHandler(iKTVPlayerEventHandler);
        this.handler = kTVPlayEventHandler;
        long j10 = this.mNativePlayerEventHandler;
        this.mNativePlayerEventHandler = NativeKTVPlayerFunctions.nativeSetPlayerEventHandler(this.mNativeKTVPlayer, kTVPlayEventHandler);
        if (j10 != 0) {
            NativeKTVPlayerFunctions.nativeReleaseKTVPlayerEventHandler(j10);
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVPlayer
    public void stopMusic(@n0 String str) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeKTVPlayer;
            if (j10 == 0) {
                LogUtil.e(TAG, "native mNativeKTVPlayer is invalid, stopMusic failed.");
            } else {
                NativeKTVPlayerFunctions.nativeStopMusic(j10, str);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVPlayer
    public void switchAudioTrackType(@n0 String str) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeKTVPlayer;
            if (j10 == 0) {
                LogUtil.e(TAG, "native mNativeKTVPlayer is invalid, switchAudioTrackType failed.");
            } else {
                NativeKTVPlayerFunctions.nativeSwitchAudioTrackType(j10, str);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }
}
