package com.tencent.thumbplayer.tcmedia.core.richmedia.async;

import android.content.Context;
import com.tencent.thumbplayer.tcmedia.core.common.TPGeneralError;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLibraryLoader;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLog;
import com.tencent.thumbplayer.tcmedia.core.richmedia.TPNativeRichMediaFeature;
import com.tencent.thumbplayer.tcmedia.core.richmedia.TPNativeTimeRange;

/* JADX INFO: loaded from: classes4.dex */
public class TPNativeRichMediaAsyncRequester implements ITPNativeRichMediaAsyncRequester {
    private static final int REQUEST_ID_NATIVE_EXCEPTION_THROW = -100;
    private long mNativeContext = 0;

    public TPNativeRichMediaAsyncRequester(Context context) {
        TPNativeLibraryLoader.loadLibIfNeeded(context);
        try {
            if (_nativeSetup() == 0) {
            } else {
                throw new UnsupportedOperationException("failed to setup rich media");
            }
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, "Failed to create native rich media:" + th2.getMessage());
            throw new UnsupportedOperationException("failed to create rich media");
        }
    }

    private native void _cancelRequest(int i10);

    private native TPNativeRichMediaFeature[] _getFeatures();

    private native int _nativeSetup();

    private native int _prepareAsync();

    private native void _release();

    private native int _requestFeatureDataAsyncAtTimeMs(int i10, long j10);

    private native int _requestFeatureDataAsyncAtTimeMsArray(int i10, long[] jArr);

    private native int _requestFeatureDataAsyncAtTimeRange(int i10, TPNativeTimeRange tPNativeTimeRange);

    private native int _requestFeatureDataAsyncAtTimeRanges(int i10, TPNativeTimeRange[] tPNativeTimeRangeArr);

    private native void _setRequesterListener(ITPNativeRichMediaAsyncRequesterListener iTPNativeRichMediaAsyncRequesterListener);

    private native int _setRichMediaSource(String str);

    @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.async.ITPNativeRichMediaAsyncRequester
    public void cancelRequest(int i10) {
        try {
            _cancelRequest(i10);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.async.ITPNativeRichMediaAsyncRequester
    public TPNativeRichMediaFeature[] getFeatures() {
        try {
            return _getFeatures();
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return new TPNativeRichMediaFeature[0];
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.async.ITPNativeRichMediaAsyncRequester
    public void prepareAsync() {
        int i_prepareAsync;
        try {
            i_prepareAsync = _prepareAsync();
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            i_prepareAsync = TPGeneralError.FAILED;
        }
        if (i_prepareAsync != 0) {
            throw new IllegalStateException("prepareAsync, ret=".concat(String.valueOf(i_prepareAsync)));
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.async.ITPNativeRichMediaAsyncRequester
    public void release() {
        try {
            _release();
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.async.ITPNativeRichMediaAsyncRequester
    public int requestFeatureDataAsyncAtTimeMs(int i10, long j10) {
        try {
            return _requestFeatureDataAsyncAtTimeMs(i10, j10);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return -100;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.async.ITPNativeRichMediaAsyncRequester
    public int requestFeatureDataAsyncAtTimeMsArray(int i10, long[] jArr) {
        try {
            return _requestFeatureDataAsyncAtTimeMsArray(i10, jArr);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return -100;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.async.ITPNativeRichMediaAsyncRequester
    public int requestFeatureDataAsyncAtTimeRange(int i10, TPNativeTimeRange tPNativeTimeRange) {
        try {
            return _requestFeatureDataAsyncAtTimeRange(i10, tPNativeTimeRange);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return -100;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.async.ITPNativeRichMediaAsyncRequester
    public int requestFeatureDataAsyncAtTimeRanges(int i10, TPNativeTimeRange[] tPNativeTimeRangeArr) {
        try {
            return _requestFeatureDataAsyncAtTimeRanges(i10, tPNativeTimeRangeArr);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return -100;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.async.ITPNativeRichMediaAsyncRequester
    public void setRequesterListener(ITPNativeRichMediaAsyncRequesterListener iTPNativeRichMediaAsyncRequesterListener) {
        try {
            _setRequesterListener(iTPNativeRichMediaAsyncRequesterListener);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.async.ITPNativeRichMediaAsyncRequester
    public void setRichMediaSource(String str) {
        int i_setRichMediaSource;
        try {
            i_setRichMediaSource = _setRichMediaSource(str);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            i_setRichMediaSource = TPGeneralError.FAILED;
        }
        if (i_setRichMediaSource == 0) {
            return;
        }
        if (i_setRichMediaSource != 1000012) {
            throw new IllegalStateException("setRichMediaSource:".concat(String.valueOf(i_setRichMediaSource)));
        }
        throw new IllegalArgumentException("setRichMediaSource，invalid argument, url=".concat(String.valueOf(str)));
    }
}
