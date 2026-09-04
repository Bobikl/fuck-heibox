package com.ss.bytertc.engine;

import com.ss.bytertc.engine.audio.IRangeAudio;
import com.ss.bytertc.engine.data.Position;
import com.ss.bytertc.engine.data.ReceiveRange;
import com.ss.bytertc.engine.type.AttenuationType;
import com.ss.bytertc.engine.utils.LogUtil;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes4.dex */
public class NativeRangeAudio implements IRangeAudio {
    private static final String TAG = "NativeRangeAudio";
    private final ReentrantReadWriteLock.ReadLock mJniReadLock;
    private final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    private long mNaiveInstance;
    private final ReentrantReadWriteLock mReadWriteLock;

    public NativeRangeAudio(long j10) {
        this.mNaiveInstance = 0L;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.mNaiveInstance = j10;
    }

    public static native void nativeEnableRangeAudio(long j10, boolean z10);

    public static native int nativeSetAttenuationType(long j10, int i10, float f10);

    public static native void nativeSetNoAttenuationFlags(long j10, String[] strArr);

    public static native int nativeUpdatePosition(long j10, float f10, float f11, float f12);

    public static native int nativeUpdateReceiveRange(long j10, int i10, int i11);

    public void destroy() {
        this.mJniWriteLock.lock();
        try {
            this.mNaiveInstance = 0L;
        } finally {
            this.mJniWriteLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.audio.IRangeAudio
    public void enableRangeAudio(boolean z10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNaiveInstance;
            if (j10 == 0) {
                LogUtil.e(TAG, "native RangeAudio is invalid, enableRangeAudio failed.");
            } else {
                nativeEnableRangeAudio(j10, z10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.audio.IRangeAudio
    public int setAttenuationModel(AttenuationType attenuationType, float f10) {
        int iNativeSetAttenuationType;
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNaiveInstance;
            if (j10 == 0) {
                LogUtil.e(TAG, "native range audio is invalid, setAttenuationModel failed.");
                iNativeSetAttenuationType = -1;
            } else {
                iNativeSetAttenuationType = nativeSetAttenuationType(j10, attenuationType.value(), f10);
            }
            return iNativeSetAttenuationType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.audio.IRangeAudio
    public void setNoAttenuationFlags(List<String> list) {
        this.mJniReadLock.lock();
        try {
            if (this.mNaiveInstance == 0) {
                LogUtil.e(TAG, "native range audio is invalid, setNoAttenuationFlags failed.");
                return;
            }
            String[] strArr = new String[list.size()];
            list.toArray(strArr);
            nativeSetNoAttenuationFlags(this.mNaiveInstance, strArr);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.audio.IRangeAudio
    public int updatePosition(Position position) {
        int iNativeUpdatePosition;
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNaiveInstance;
            if (j10 == 0) {
                LogUtil.e(TAG, "native RangeAudio is invalid, updatePosition failed.");
                iNativeUpdatePosition = -1;
            } else {
                iNativeUpdatePosition = nativeUpdatePosition(j10, position.f97942x, position.f97943y, position.f97944z);
            }
            return iNativeUpdatePosition;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.audio.IRangeAudio
    public int updateReceiveRange(ReceiveRange receiveRange) {
        int iNativeUpdateReceiveRange;
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNaiveInstance;
            if (j10 == 0) {
                LogUtil.e(TAG, "native RangeAudio is invalid, updateReceiveRange failed.");
                iNativeUpdateReceiveRange = -1;
            } else {
                iNativeUpdateReceiveRange = nativeUpdateReceiveRange(j10, receiveRange.min, receiveRange.max);
            }
            return iNativeUpdateReceiveRange;
        } finally {
            this.mJniReadLock.unlock();
        }
    }
}
