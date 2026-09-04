package com.ss.bytertc.engine.video;

import com.ss.bytertc.engine.InternalExpressDetectConfig;
import com.ss.bytertc.engine.NativeRTCVideoFunctions;
import com.ss.bytertc.engine.data.VirtualBackgroundSource;
import com.ss.bytertc.engine.handler.RTCFaceDetectionObserver;
import com.ss.bytertc.engine.type.ErrorCode;
import com.ss.bytertc.engine.utils.LogUtil;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes4.dex */
public class RTCVideoEffect extends IVideoEffect {
    private static final String TAG = "RTCVideoEffect";
    private IFaceDetectionObserver mFaceDetectionObserver;
    private final ReentrantReadWriteLock.ReadLock mJniReadLock;
    private final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    private long mNativeEngine;
    private RTCFaceDetectionObserver mRTCFaceDetectionObserver;
    private final ReentrantReadWriteLock mReadWriteLock;

    public RTCVideoEffect(long j10) {
        this.mNativeEngine = 0L;
        this.mRTCFaceDetectionObserver = null;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.mNativeEngine = j10;
        this.mRTCFaceDetectionObserver = new RTCFaceDetectionObserver(this);
        LogUtil.i(TAG, "create rtc video effect");
    }

    private boolean engineInvalid() {
        return this.mNativeEngine == 0;
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int appendEffectNodes(List<String> list) {
        int iNativeAppendVideoEffectNodes;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "invalid, appendEffectNodes failed.");
                iNativeAppendVideoEffectNodes = ErrorCode.ERROR_CODE_KICKED_OUT;
            } else {
                String[] strArr = new String[list.size()];
                list.toArray(strArr);
                iNativeAppendVideoEffectNodes = NativeRTCVideoFunctions.nativeAppendVideoEffectNodes(this.mNativeEngine, strArr);
            }
            return iNativeAppendVideoEffectNodes;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int applyStickerEffect(String str) {
        int iNativeApplyStickerEffect;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, applyStickerEffect failed.");
                iNativeApplyStickerEffect = ErrorCode.ERROR_CODE_KICKED_OUT;
            } else {
                iNativeApplyStickerEffect = NativeRTCVideoFunctions.nativeApplyStickerEffect(this.mNativeEngine, str);
            }
            return iNativeApplyStickerEffect;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void destroy() {
        LogUtil.i(TAG, "dispose rtc video effect");
        this.mJniWriteLock.lock();
        try {
            this.mNativeEngine = 0L;
        } finally {
            this.mJniWriteLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int disableFaceDetection() {
        int iNativeDisableFaceDetection;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "invalid, registerFaceDetectionObserver failed.");
                iNativeDisableFaceDetection = ErrorCode.ERROR_CODE_KICKED_OUT;
            } else {
                this.mFaceDetectionObserver = null;
                iNativeDisableFaceDetection = NativeRTCVideoFunctions.nativeDisableFaceDetection(this.mNativeEngine);
            }
            return iNativeDisableFaceDetection;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int disableVideoEffect() {
        int iNativeDisableVideoEffect;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "invalid, disableVideoEffect failed.");
                iNativeDisableVideoEffect = ErrorCode.ERROR_CODE_KICKED_OUT;
            } else {
                iNativeDisableVideoEffect = NativeRTCVideoFunctions.nativeDisableVideoEffect(this.mNativeEngine);
            }
            return iNativeDisableVideoEffect;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int disableVirtualBackground() {
        int iNativeDisableVirtualBackground;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "invalid, disableVirtualBackground failed.");
                iNativeDisableVirtualBackground = ErrorCode.ERROR_CODE_KICKED_OUT;
            } else {
                iNativeDisableVirtualBackground = NativeRTCVideoFunctions.nativeDisableVirtualBackground(this.mNativeEngine);
            }
            return iNativeDisableVirtualBackground;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int enableFaceDetection(IFaceDetectionObserver iFaceDetectionObserver, int i10, String str) {
        int iNativeEnableFaceDetection;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "invalid, registerFaceDetectionObserver failed.");
                iNativeEnableFaceDetection = ErrorCode.ERROR_CODE_KICKED_OUT;
            } else {
                this.mFaceDetectionObserver = iFaceDetectionObserver;
                iNativeEnableFaceDetection = NativeRTCVideoFunctions.nativeEnableFaceDetection(this.mNativeEngine, this.mRTCFaceDetectionObserver, i10, str);
            }
            return iNativeEnableFaceDetection;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int enableVideoEffect() {
        int iNativeEnableVideoEffect2;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "invalid, enableVideoEffect failed.");
                iNativeEnableVideoEffect2 = ErrorCode.ERROR_CODE_KICKED_OUT;
            } else {
                iNativeEnableVideoEffect2 = NativeRTCVideoFunctions.nativeEnableVideoEffect2(this.mNativeEngine);
            }
            return iNativeEnableVideoEffect2;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int enableVirtualBackground(String str, VirtualBackgroundSource virtualBackgroundSource) {
        int iNativeEnableVirtualBackground;
        String str2;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "invalid, enableVirtualBackground failed.");
                iNativeEnableVirtualBackground = ErrorCode.ERROR_CODE_KICKED_OUT;
            } else {
                iNativeEnableVirtualBackground = NativeRTCVideoFunctions.nativeEnableVirtualBackground(this.mNativeEngine, str, virtualBackgroundSource.sourceType.ordinal(), virtualBackgroundSource.sourceColor, (virtualBackgroundSource == null || (str2 = virtualBackgroundSource.sourcePath) == null) ? "" : str2);
            }
            return iNativeEnableVirtualBackground;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public IFaceDetectionObserver getFaceDetectionObserver() {
        return this.mFaceDetectionObserver;
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public long getVideoEffectHandle() {
        long jNativeGetVideoEffectHandle;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, getVideoEffectHandle failed.");
                jNativeGetVideoEffectHandle = -1006;
            } else {
                jNativeGetVideoEffectHandle = NativeRTCVideoFunctions.nativeGetVideoEffectHandle(this.mNativeEngine);
            }
            return jNativeGetVideoEffectHandle;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int initCVResource(String str, String str2) {
        int iNativeInitCVResource;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "invalid, initCVResource failed.");
                iNativeInitCVResource = ErrorCode.ERROR_CODE_KICKED_OUT;
            } else {
                iNativeInitCVResource = NativeRTCVideoFunctions.nativeInitCVResource(this.mNativeEngine, str, str2);
            }
            return iNativeInitCVResource;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int registerFaceDetectionObserver(IFaceDetectionObserver iFaceDetectionObserver, int i10) {
        int iNativeRegisterFaceDetectionObserver;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "invalid, registerFaceDetectionObserver failed.");
                iNativeRegisterFaceDetectionObserver = ErrorCode.ERROR_CODE_KICKED_OUT;
            } else {
                this.mFaceDetectionObserver = iFaceDetectionObserver;
                iNativeRegisterFaceDetectionObserver = iFaceDetectionObserver == null ? NativeRTCVideoFunctions.nativeRegisterFaceDetectionObserver(this.mNativeEngine, null, i10) : NativeRTCVideoFunctions.nativeRegisterFaceDetectionObserver(this.mNativeEngine, this.mRTCFaceDetectionObserver, i10);
            }
            return iNativeRegisterFaceDetectionObserver;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int removeEffectNodes(List<String> list) {
        int iNativeRemoveVideoEffectNodes;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "invalid, removeEffectNodes failed.");
                iNativeRemoveVideoEffectNodes = ErrorCode.ERROR_CODE_KICKED_OUT;
            } else {
                String[] strArr = new String[list.size()];
                list.toArray(strArr);
                iNativeRemoveVideoEffectNodes = NativeRTCVideoFunctions.nativeRemoveVideoEffectNodes(this.mNativeEngine, strArr);
            }
            return iNativeRemoveVideoEffectNodes;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int setAlgoModelResourceFinder(long j10, long j11) {
        int iNativeSetVideoEffectAlgoModelResourceFinder;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "invalid, setAlgoModelResourceFinder failed.");
                iNativeSetVideoEffectAlgoModelResourceFinder = ErrorCode.ERROR_CODE_KICKED_OUT;
            } else {
                iNativeSetVideoEffectAlgoModelResourceFinder = NativeRTCVideoFunctions.nativeSetVideoEffectAlgoModelResourceFinder(this.mNativeEngine, j10, j11);
            }
            return iNativeSetVideoEffectAlgoModelResourceFinder;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int setColorFilter(String str) {
        int iNativeSetVideoEffectColorFilter;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "invalid, setColorFilter failed.");
                iNativeSetVideoEffectColorFilter = ErrorCode.ERROR_CODE_KICKED_OUT;
            } else {
                iNativeSetVideoEffectColorFilter = NativeRTCVideoFunctions.nativeSetVideoEffectColorFilter(this.mNativeEngine, str);
            }
            return iNativeSetVideoEffectColorFilter;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int setColorFilterIntensity(float f10) {
        int iNativeSetVideoEffectColorFilterIntensity;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "invalid, setColorFilterIntensity failed.");
                iNativeSetVideoEffectColorFilterIntensity = ErrorCode.ERROR_CODE_KICKED_OUT;
            } else {
                iNativeSetVideoEffectColorFilterIntensity = NativeRTCVideoFunctions.nativeSetVideoEffectColorFilterIntensity(this.mNativeEngine, f10);
            }
            return iNativeSetVideoEffectColorFilterIntensity;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int setEffectNodes(List<String> list) {
        int iNativeSetVideoEffectNodes;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "invalid, setEffectNodes failed.");
                iNativeSetVideoEffectNodes = ErrorCode.ERROR_CODE_KICKED_OUT;
            } else {
                String[] strArr = new String[list.size()];
                list.toArray(strArr);
                iNativeSetVideoEffectNodes = NativeRTCVideoFunctions.nativeSetVideoEffectNodes(this.mNativeEngine, strArr);
            }
            return iNativeSetVideoEffectNodes;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int setVideoEffectExpressionDetect(VideoEffectExpressionConfig videoEffectExpressionConfig) {
        int iNativeSetVideoEffectExpressionDetect;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "invalid, setVideoEffectExpressionDetect failed.");
                iNativeSetVideoEffectExpressionDetect = ErrorCode.ERROR_CODE_KICKED_OUT;
            } else {
                iNativeSetVideoEffectExpressionDetect = NativeRTCVideoFunctions.nativeSetVideoEffectExpressionDetect(this.mNativeEngine, new InternalExpressDetectConfig(videoEffectExpressionConfig));
            }
            return iNativeSetVideoEffectExpressionDetect;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int updateEffectNode(String str, String str2, float f10) {
        int iNativeUpdateVideoEffectNode;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "invalid, updateEffectNode failed.");
                iNativeUpdateVideoEffectNode = ErrorCode.ERROR_CODE_KICKED_OUT;
            } else {
                iNativeUpdateVideoEffectNode = NativeRTCVideoFunctions.nativeUpdateVideoEffectNode(this.mNativeEngine, str, str2, f10);
            }
            return iNativeUpdateVideoEffectNode;
        } finally {
            this.mJniReadLock.unlock();
        }
    }
}
