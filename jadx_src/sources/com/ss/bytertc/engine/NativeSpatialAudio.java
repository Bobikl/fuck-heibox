package com.ss.bytertc.engine;

import com.ss.bytertc.engine.audio.ISpatialAudio;
import com.ss.bytertc.engine.data.HumanOrientation;
import com.ss.bytertc.engine.data.Orientation;
import com.ss.bytertc.engine.data.Position;
import com.ss.bytertc.engine.data.PositionInfo;
import com.ss.bytertc.engine.utils.LogUtil;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes4.dex */
public class NativeSpatialAudio implements ISpatialAudio {
    private static final String TAG = "NativeSpatialAudio";
    private final ReentrantReadWriteLock.ReadLock mJniReadLock;
    private final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    private long mNaiveInstance;
    private final ReentrantReadWriteLock mReadWriteLock;

    public NativeSpatialAudio(long j10) {
        this.mNaiveInstance = 0L;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.mNaiveInstance = j10;
    }

    public static native void nativeDisableRemoteOrientation(long j10);

    public static native void nativeEnableSpatialAudio(long j10, boolean z10);

    public static native int nativeRemoveAllRemotePosition(long j10);

    public static native int nativeRemoveRemotePosition(long j10, String str);

    public static native int nativeUpdateListenerOrientation(long j10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18);

    public static native int nativeUpdateListenerPosition(long j10, float f10, float f11, float f12);

    public static native int nativeUpdatePosition(long j10, float f10, float f11, float f12);

    public static native int nativeUpdateRemotePosition(long j10, String str, PositionInfo positionInfo);

    public static native int nativeUpdateSelfOrientation(long j10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18);

    public static native int nativeUpdateSelfPosition(long j10, PositionInfo positionInfo);

    public void destroy() {
        this.mJniWriteLock.lock();
        try {
            this.mNaiveInstance = 0L;
        } finally {
            this.mJniWriteLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.audio.ISpatialAudio
    public void disableRemoteOrientation() {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNaiveInstance;
            if (j10 == 0) {
                LogUtil.e(TAG, "native SpatialAudio is invalid, disableRemoteOrientation failed.");
            } else {
                nativeDisableRemoteOrientation(j10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.audio.ISpatialAudio
    public void enableSpatialAudio(boolean z10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNaiveInstance;
            if (j10 == 0) {
                LogUtil.e(TAG, "native SpatialAudio is invalid, enableSpatialAudio failed.");
            } else {
                nativeEnableSpatialAudio(j10, z10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.audio.ISpatialAudio
    public int removeAllRemotePosition() {
        int iNativeRemoveAllRemotePosition;
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNaiveInstance;
            if (j10 == 0) {
                LogUtil.e(TAG, "native SpatialAudio is invalid, updatePosition failed.");
                iNativeRemoveAllRemotePosition = -1;
            } else {
                iNativeRemoveAllRemotePosition = nativeRemoveAllRemotePosition(j10);
            }
            return iNativeRemoveAllRemotePosition;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.audio.ISpatialAudio
    public int removeRemotePosition(String str) {
        int iNativeRemoveRemotePosition;
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNaiveInstance;
            if (j10 == 0) {
                LogUtil.e(TAG, "native SpatialAudio is invalid, updatePosition failed.");
                iNativeRemoveRemotePosition = -1;
            } else {
                iNativeRemoveRemotePosition = nativeRemoveRemotePosition(j10, str);
            }
            return iNativeRemoveRemotePosition;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.audio.ISpatialAudio
    public int updateListenerOrientation(HumanOrientation humanOrientation) {
        int iNativeUpdateListenerOrientation;
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNaiveInstance;
            if (j10 == 0) {
                LogUtil.e(TAG, "native SpatialAudio is invalid, updateListenerOrientation failed.");
                iNativeUpdateListenerOrientation = -1;
            } else {
                Orientation orientation = humanOrientation.forward;
                float f10 = orientation.f97939x;
                float f11 = orientation.f97940y;
                float f12 = orientation.f97941z;
                Orientation orientation2 = humanOrientation.right;
                float f13 = orientation2.f97939x;
                float f14 = orientation2.f97940y;
                float f15 = orientation2.f97941z;
                Orientation orientation3 = humanOrientation.up;
                iNativeUpdateListenerOrientation = nativeUpdateListenerOrientation(j10, f10, f11, f12, f13, f14, f15, orientation3.f97939x, orientation3.f97940y, orientation3.f97941z);
            }
            return iNativeUpdateListenerOrientation;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.audio.ISpatialAudio
    public int updateListenerPosition(Position position) {
        int iNativeUpdateListenerPosition;
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNaiveInstance;
            if (j10 == 0) {
                LogUtil.e(TAG, "native SpatialAudio is invalid, updateListenerPosition failed.");
                iNativeUpdateListenerPosition = -1;
            } else {
                iNativeUpdateListenerPosition = nativeUpdateListenerPosition(j10, position.f97942x, position.f97943y, position.f97944z);
            }
            return iNativeUpdateListenerPosition;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.audio.ISpatialAudio
    public int updatePosition(Position position) {
        int iNativeUpdatePosition;
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNaiveInstance;
            if (j10 == 0) {
                LogUtil.e(TAG, "native SpatialAudio is invalid, updatePosition failed.");
                iNativeUpdatePosition = -1;
            } else {
                iNativeUpdatePosition = nativeUpdatePosition(j10, position.f97942x, position.f97943y, position.f97944z);
            }
            return iNativeUpdatePosition;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.audio.ISpatialAudio
    public int updateRemotePosition(String str, PositionInfo positionInfo) {
        int iNativeUpdateRemotePosition;
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNaiveInstance;
            if (j10 == 0) {
                LogUtil.e(TAG, "native SpatialAudio is invalid, updatePosition failed.");
                iNativeUpdateRemotePosition = -1;
            } else {
                iNativeUpdateRemotePosition = nativeUpdateRemotePosition(j10, str, positionInfo);
            }
            return iNativeUpdateRemotePosition;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.audio.ISpatialAudio
    public int updateSelfOrientation(HumanOrientation humanOrientation) {
        int iNativeUpdateSelfOrientation;
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNaiveInstance;
            if (j10 == 0) {
                LogUtil.e(TAG, "native SpatialAudio is invalid, updateSelfOrientation failed.");
                iNativeUpdateSelfOrientation = -1;
            } else {
                Orientation orientation = humanOrientation.forward;
                float f10 = orientation.f97939x;
                float f11 = orientation.f97940y;
                float f12 = orientation.f97941z;
                Orientation orientation2 = humanOrientation.right;
                float f13 = orientation2.f97939x;
                float f14 = orientation2.f97940y;
                float f15 = orientation2.f97941z;
                Orientation orientation3 = humanOrientation.up;
                iNativeUpdateSelfOrientation = nativeUpdateSelfOrientation(j10, f10, f11, f12, f13, f14, f15, orientation3.f97939x, orientation3.f97940y, orientation3.f97941z);
            }
            return iNativeUpdateSelfOrientation;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.audio.ISpatialAudio
    public int updateSelfPosition(PositionInfo positionInfo) {
        int iNativeUpdateSelfPosition;
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNaiveInstance;
            if (j10 == 0) {
                LogUtil.e(TAG, "native SpatialAudio is invalid, updatePosition failed.");
                iNativeUpdateSelfPosition = -1;
            } else {
                iNativeUpdateSelfPosition = nativeUpdateSelfPosition(j10, positionInfo);
            }
            return iNativeUpdateSelfPosition;
        } finally {
            this.mJniReadLock.unlock();
        }
    }
}
