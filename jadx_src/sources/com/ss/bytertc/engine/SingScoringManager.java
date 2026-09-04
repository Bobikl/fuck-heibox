package com.ss.bytertc.engine;

import com.ss.bytertc.engine.audio.ISingScoringManager;
import com.ss.bytertc.engine.data.SingScoringConfig;
import com.ss.bytertc.engine.data.StandardPitchInfo;
import com.ss.bytertc.engine.handler.NativeSingScoringEventHandler;
import com.ss.bytertc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes4.dex */
public class SingScoringManager extends ISingScoringManager {
    private static final String TAG = "SingScoringManager";
    private final ReentrantReadWriteLock.ReadLock mJniReadLock;
    private final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    NativeSingScoringEventHandler mNativeHandler;
    private long mNativeRTCVideoEngine;
    private long mNativeSingScoringManager;
    private final ReentrantReadWriteLock mReadWriteLock;
    private WeakReference<ISingScoringEventHandler> mSingScoringEventHandler;

    public SingScoringManager(long j10, long j11) {
        this.mNativeSingScoringManager = 0L;
        this.mNativeRTCVideoEngine = 0L;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.mNativeRTCVideoEngine = j10;
        this.mNativeSingScoringManager = j11;
        this.mNativeHandler = new NativeSingScoringEventHandler(this);
    }

    public void destroy() {
        this.mJniWriteLock.lock();
        try {
            this.mNativeSingScoringManager = 0L;
        } finally {
            this.mJniWriteLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.audio.ISingScoringManager
    public int getAverageScore() {
        int iNativeGetAverageScore;
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeSingScoringManager;
            if (j10 == 0) {
                LogUtil.e(TAG, "native SingScoringManager is invalid, getAverageScore failed.");
                iNativeGetAverageScore = -1;
            } else {
                iNativeGetAverageScore = NativeSingScoringManagerFunctions.nativeGetAverageScore(j10);
            }
            return iNativeGetAverageScore;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.audio.ISingScoringManager
    public int getLastSentenceScore() {
        int iNativeGetLastSentenceScore;
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeSingScoringManager;
            if (j10 == 0) {
                LogUtil.e(TAG, "native SingScoringManager is invalid, getLastSentenceScore failed.");
                iNativeGetLastSentenceScore = -1;
            } else {
                iNativeGetLastSentenceScore = NativeSingScoringManagerFunctions.nativeGetLastSentenceScore(j10);
            }
            return iNativeGetLastSentenceScore;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public ISingScoringEventHandler getSingScoringEventHandler() {
        return this.mSingScoringEventHandler.get();
    }

    @Override // com.ss.bytertc.engine.audio.ISingScoringManager
    public List<StandardPitchInfo> getStandardPitchInfo(String str) {
        List<StandardPitchInfo> listAsList;
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeSingScoringManager;
            if (j10 == 0) {
                LogUtil.e(TAG, "native SingScoringManager is invalid, getStandardPitchInfo failed.");
                listAsList = null;
            } else {
                listAsList = Arrays.asList(NativeSingScoringManagerFunctions.nativeGetStandardPitchInfo(j10, str));
            }
            return listAsList;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.audio.ISingScoringManager
    public int getTotalScore() {
        int iNativeGetTotalScore;
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeSingScoringManager;
            if (j10 == 0) {
                LogUtil.e(TAG, "native SingScoringManager is invalid, getTotalScore failed.");
                iNativeGetTotalScore = -1;
            } else {
                iNativeGetTotalScore = NativeSingScoringManagerFunctions.nativeGetTotalScore(j10);
            }
            return iNativeGetTotalScore;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.audio.ISingScoringManager
    public int initSingScoring(String str, String str2, ISingScoringEventHandler iSingScoringEventHandler) {
        int iNativeInitSingScoring;
        this.mJniReadLock.lock();
        try {
            if (this.mNativeSingScoringManager == 0) {
                LogUtil.e(TAG, "native SingScoringManager is invalid, initSingScoring failed.");
                iNativeInitSingScoring = -1;
            } else {
                this.mSingScoringEventHandler = new WeakReference<>(iSingScoringEventHandler);
                iNativeInitSingScoring = iSingScoringEventHandler == null ? NativeSingScoringManagerFunctions.nativeInitSingScoring(this.mNativeRTCVideoEngine, this.mNativeSingScoringManager, str, str2, null) : NativeSingScoringManagerFunctions.nativeInitSingScoring(this.mNativeRTCVideoEngine, this.mNativeSingScoringManager, str, str2, this.mNativeHandler);
            }
            return iNativeInitSingScoring;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.audio.ISingScoringManager
    public int setSingScoringConfig(SingScoringConfig singScoringConfig) {
        int iNativeSetSingScoringConfig;
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeSingScoringManager;
            if (j10 == 0) {
                LogUtil.e(TAG, "native SingScoringManager is invalid, setSingScoringConfig failed.");
                iNativeSetSingScoringConfig = -1;
            } else {
                iNativeSetSingScoringConfig = NativeSingScoringManagerFunctions.nativeSetSingScoringConfig(j10, singScoringConfig.sampleRate.value(), singScoringConfig.mode.value(), singScoringConfig.lyricsFilepath, singScoringConfig.midiFilepath);
            }
            return iNativeSetSingScoringConfig;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.audio.ISingScoringManager
    public int startSingScoring(int i10, int i11) {
        int iNativeStartSingScoring;
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeSingScoringManager;
            if (j10 == 0) {
                LogUtil.e(TAG, "native SingScoringManager is invalid, startSingScoring failed.");
                iNativeStartSingScoring = -1;
            } else {
                iNativeStartSingScoring = NativeSingScoringManagerFunctions.nativeStartSingScoring(j10, i10, i11);
            }
            return iNativeStartSingScoring;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.audio.ISingScoringManager
    public int stopSingScoring() {
        int iNativeStopSingScoring;
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeSingScoringManager;
            if (j10 == 0) {
                LogUtil.e(TAG, "native SingScoringManager is invalid, stopSingScoring failed.");
                iNativeStopSingScoring = -1;
            } else {
                iNativeStopSingScoring = NativeSingScoringManagerFunctions.nativeStopSingScoring(j10);
            }
            return iNativeStopSingScoring;
        } finally {
            this.mJniReadLock.unlock();
        }
    }
}
