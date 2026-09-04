package com.ss.bytertc.engine;

import com.ss.bytertc.engine.data.ReturnStatus;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes4.dex */
public class RTCAudioDeviceManager implements IRTCAudioDeviceManager {
    private long mAudioDeviceManager;
    private final ReentrantReadWriteLock.ReadLock mJniReadLock;
    private final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    private final ReentrantReadWriteLock mReadWriteLock;

    public RTCAudioDeviceManager(long j10) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.mAudioDeviceManager = j10;
    }

    public void destroy() {
        this.mJniWriteLock.lock();
        try {
            this.mAudioDeviceManager = -1L;
        } finally {
            this.mJniWriteLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.IRTCAudioDeviceManager
    public int startAudioDeviceRecordTest(int i10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mAudioDeviceManager;
            return j10 == -1 ? ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value() : NativeAudioDeviceManagerFunctions.nativeStartAudioDeviceRecordTest(j10, i10);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.IRTCAudioDeviceManager
    public int startAudioPlaybackDeviceTest(String str, int i10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mAudioDeviceManager;
            return j10 == -1 ? ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value() : NativeAudioDeviceManagerFunctions.nativeStartAudioPlaybackDeviceTest(j10, str, i10);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.IRTCAudioDeviceManager
    public int stopAudioDevicePlayTest() {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mAudioDeviceManager;
            return j10 == -1 ? ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value() : NativeAudioDeviceManagerFunctions.nativeStopAudioDevicePlayTest(j10);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.IRTCAudioDeviceManager
    public int stopAudioDeviceRecordAndPlayTest() {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mAudioDeviceManager;
            return j10 == -1 ? ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value() : NativeAudioDeviceManagerFunctions.nativeStopAudioDeviceRecordAndPlayTest(j10);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.IRTCAudioDeviceManager
    public int stopAudioPlaybackDeviceTest() {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mAudioDeviceManager;
            return j10 == -1 ? ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value() : NativeAudioDeviceManagerFunctions.nativeStopAudioPlaybackDeviceTest(j10);
        } finally {
            this.mJniReadLock.unlock();
        }
    }
}
