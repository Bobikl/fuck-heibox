package com.ss.bytertc.engine;

import com.ss.bytertc.engine.data.ReturnStatus;
import com.ss.bytertc.engine.handler.RTCAudioDeviceEventHandler;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes4.dex */
public class RTCAudioDeviceManagerEx implements IRTCAudioDeviceManagerEx {
    private long mAudioDeviceManager;
    private final ReentrantReadWriteLock.ReadLock mJniReadLock;
    private final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    private final ReentrantReadWriteLock mReadWriteLock;

    public RTCAudioDeviceManagerEx(RTCAudioDeviceEventHandler rTCAudioDeviceEventHandler) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.mAudioDeviceManager = -1L;
        this.mAudioDeviceManager = NativeRTCVideoFunctions.nativeCreateAudioDeviceManager(rTCAudioDeviceEventHandler);
    }

    public void destroy() {
        this.mJniWriteLock.lock();
        try {
            this.mAudioDeviceManager = -1L;
        } finally {
            this.mJniWriteLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.IRTCAudioDeviceManagerEx
    public void setEnableSpeakerphone(boolean z10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mAudioDeviceManager;
            if (j10 == -1) {
                return;
            }
            NativeRTCVideoFunctions.nativeSetEnableSpeakerphoneForTest(j10, z10);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.IRTCAudioDeviceManagerEx
    public int startAudioCaptureDeviceTest(int i10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mAudioDeviceManager;
            return j10 == -1 ? ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value() : NativeRTCVideoFunctions.nativeStartAudioCaptureDeviceTestEx(j10, i10);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.IRTCAudioDeviceManagerEx
    public int startAudioPlaybackDeviceTest(String str, int i10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mAudioDeviceManager;
            return j10 == -1 ? ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value() : NativeRTCVideoFunctions.nativeStartAudioPlaybackDeviceTestEx(j10, str, i10);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.IRTCAudioDeviceManagerEx
    public int stopAudioCaptureDeviceTest() {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mAudioDeviceManager;
            return j10 == -1 ? ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value() : NativeRTCVideoFunctions.nativeStopAudioCaptureDeviceTestEx(j10);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.IRTCAudioDeviceManagerEx
    public int stopAudioPlaybackDeviceTest() {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mAudioDeviceManager;
            return j10 == -1 ? ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value() : NativeRTCVideoFunctions.nativeStopAudioPlaybackDeviceTestEx(j10);
        } finally {
            this.mJniReadLock.unlock();
        }
    }
}
