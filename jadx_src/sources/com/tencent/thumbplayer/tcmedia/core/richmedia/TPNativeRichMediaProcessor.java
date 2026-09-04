package com.tencent.thumbplayer.tcmedia.core.richmedia;

import android.content.Context;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLibraryLoader;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLog;

/* JADX INFO: loaded from: classes4.dex */
public class TPNativeRichMediaProcessor implements ITPNativeRichMediaProcessor {
    private long mNativeContext = 0;

    public TPNativeRichMediaProcessor(Context context) {
        TPNativeLibraryLoader.loadLibIfNeeded(context.getApplicationContext());
        try {
            _nativeSetup();
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, "Failed to create native rich media:" + th2.getMessage());
            throw new UnsupportedOperationException("Failed to create rich media");
        }
    }

    private native int _deselectFeatureAsync(int i10);

    private native int _getCurrentPositionMsFeatureData(long j10, int[] iArr, TPNativeRichMediaFeatureData tPNativeRichMediaFeatureData);

    private native TPNativeRichMediaFeature[] _getFeatures();

    private native void _nativeSetup();

    private native int _prepareAsync();

    private native void _release();

    private native int _reset();

    private native int _seek(long j10);

    private native int _selectFeatureAsync(int i10, TPNativeRichMediaRequestExtraInfo tPNativeRichMediaRequestExtraInfo);

    private native void _setInnerProcessorCallback(ITPNativeRichMediaInnerProcessorCallback iTPNativeRichMediaInnerProcessorCallback);

    private native int _setPlaybackRate(float f10);

    private native void _setProcessorCallback(ITPNativeRichMediaProcessorCallback iTPNativeRichMediaProcessorCallback);

    private native int _setRichMediaSource(String str);

    @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaProcessor
    public void deselectFeatureAsync(int i10) {
        try {
            int i_deselectFeatureAsync = _deselectFeatureAsync(i10);
            if (i_deselectFeatureAsync == 0) {
                return;
            }
            if (i_deselectFeatureAsync != 1000012) {
                throw new IllegalStateException("deSelectAsync:".concat(String.valueOf(i_deselectFeatureAsync)));
            }
            throw new IllegalArgumentException();
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaProcessor
    public TPNativeRichMediaFeatureData getCurrentPositionMsFeatureData(long j10, int[] iArr) {
        TPNativeRichMediaFeatureData tPNativeRichMediaFeatureData = new TPNativeRichMediaFeatureData();
        try {
            int i_getCurrentPositionMsFeatureData = _getCurrentPositionMsFeatureData(j10, iArr, tPNativeRichMediaFeatureData);
            if (i_getCurrentPositionMsFeatureData == 0) {
                return tPNativeRichMediaFeatureData;
            }
            if (i_getCurrentPositionMsFeatureData == 1000012) {
                throw new IllegalArgumentException();
            }
            throw new IllegalStateException("getCurrentTimeContent:".concat(String.valueOf(i_getCurrentPositionMsFeatureData)));
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return null;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaProcessor
    public TPNativeRichMediaFeature[] getFeatures() {
        try {
            return _getFeatures();
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return new TPNativeRichMediaFeature[0];
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaProcessor
    public void prepareAsync() {
        try {
            int i_prepareAsync = _prepareAsync();
            if (i_prepareAsync != 0) {
                throw new IllegalStateException("prepareAsync:".concat(String.valueOf(i_prepareAsync)));
            }
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaProcessor
    public void release() {
        try {
            _release();
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaProcessor
    public void reset() {
        try {
            int i_reset = _reset();
            if (i_reset != 0) {
                throw new IllegalStateException("reset:".concat(String.valueOf(i_reset)));
            }
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaProcessor
    public void seek(long j10) {
        try {
            int i_seek = _seek(j10);
            if (i_seek == 0) {
                return;
            }
            if (i_seek != 1000012) {
                throw new IllegalStateException("seek:".concat(String.valueOf(i_seek)));
            }
            throw new IllegalArgumentException();
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaProcessor
    public void selectFeatureAsync(int i10, TPNativeRichMediaRequestExtraInfo tPNativeRichMediaRequestExtraInfo) {
        try {
            int i_selectFeatureAsync = _selectFeatureAsync(i10, tPNativeRichMediaRequestExtraInfo);
            if (i_selectFeatureAsync == 0) {
                return;
            }
            if (i_selectFeatureAsync != 1000012) {
                throw new IllegalStateException("selectAsync:".concat(String.valueOf(i_selectFeatureAsync)));
            }
            throw new IllegalArgumentException();
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaProcessor
    public void setInnerProcessorCallback(ITPNativeRichMediaInnerProcessorCallback iTPNativeRichMediaInnerProcessorCallback) {
        try {
            _setInnerProcessorCallback(iTPNativeRichMediaInnerProcessorCallback);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaProcessor
    public void setPlaybackRate(float f10) {
        try {
            int i_setPlaybackRate = _setPlaybackRate(f10);
            if (i_setPlaybackRate == 0) {
                return;
            }
            if (i_setPlaybackRate != 1000012) {
                throw new IllegalStateException("setPlaybackRate:".concat(String.valueOf(i_setPlaybackRate)));
            }
            throw new IllegalArgumentException();
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaProcessor
    public void setProcessorCallback(ITPNativeRichMediaProcessorCallback iTPNativeRichMediaProcessorCallback) {
        try {
            _setProcessorCallback(iTPNativeRichMediaProcessorCallback);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaProcessor
    public void setRichMediaSource(String str) {
        try {
            int i_setRichMediaSource = _setRichMediaSource(str);
            if (i_setRichMediaSource == 0) {
                return;
            }
            if (i_setRichMediaSource != 1000012) {
                throw new IllegalStateException("setRichMediaSource:".concat(String.valueOf(i_setRichMediaSource)));
            }
            throw new IllegalArgumentException();
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
        }
    }
}
