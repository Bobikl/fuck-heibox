package com.tencent.ugc.common;

import android.media.MediaFormat;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.base.util.l;
import com.tencent.liteav.videobase.common.d;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import com.tencent.ugc.TXVideoEditConstants;
import com.tencent.ugc.encoder.VideoEncodeParams;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::ugc")
public class UGCTranscodeVideoEncodeParamsDecider {
    private static final String TAG = "UGCTranscodeVideoEncodeParamsDecider";
    private int[] mSourceFpsArray;
    private List<MediaFormat> mVideoMediaFormatList;
    private boolean mFullIFrame = false;
    private d mEncodeProfile = d.HIGH;
    private final long mNativeHandler = nativeCreate();

    private static Size createVideoSize(int i10, int i11) {
        return new Size(i10, i11);
    }

    private int getDecidedGOP() {
        List<MediaFormat> list = this.mVideoMediaFormatList;
        if (list == null || list.size() == 0) {
            return 3;
        }
        return getNumberFromMediaFormat(this.mVideoMediaFormatList.get(0), "i-frame-interval", 3);
    }

    private int getDecidedVideoBitrate(Size size) {
        if (this.mFullIFrame) {
            return (size.width >= 1280 || size.height >= 1280) ? 24000 : 15000;
        }
        return nativeGetSelectedBitrate(this.mNativeHandler);
    }

    private int getNumberFromMediaFormat(MediaFormat mediaFormat, String str, int i10) {
        if (mediaFormat == null || !mediaFormat.containsKey(str)) {
            return i10;
        }
        try {
            return mediaFormat.getInteger(str);
        } catch (ClassCastException e10) {
            LiteavLog.w(TAG, "getNumberFromMediaFormat integer ClassCastException: ".concat(String.valueOf(e10)));
            try {
                return (int) mediaFormat.getFloat(str);
            } catch (ClassCastException e11) {
                LiteavLog.w(TAG, "getNumberFromMediaFormat float ClassCastException: ".concat(String.valueOf(e11)));
                return i10;
            }
        }
    }

    private Size getSizeFromMediaFormat(MediaFormat mediaFormat) {
        int numberFromMediaFormat;
        Size size = new Size();
        size.width = getNumberFromMediaFormat(mediaFormat, "width", 720);
        size.height = getNumberFromMediaFormat(mediaFormat, "height", 1280);
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 23 && ((numberFromMediaFormat = getNumberFromMediaFormat(mediaFormat, "rotation-degrees", 0)) == 90 || numberFromMediaFormat == 270)) {
            size.swap();
        }
        return size;
    }

    private static native long nativeCreate();

    private static native void nativeDestroy(long j10);

    private static native int nativeGetSelectedBitrate(long j10);

    private static native int nativeGetSelectedFramerate(long j10);

    private static native Size nativeGetSelectedResolution(long j10);

    private static native void nativeSetCanvasSize(long j10, int i10, int i11);

    private static native void nativeSetEncodeBitrate(long j10, int i10);

    private static native void nativeSetEncodeFramerate(long j10, int i10);

    private static native void nativeSetEncodeResolution(long j10, int i10);

    private static native void nativeSetEncodeRotation(long j10, int i10);

    private static native void nativeSetSourceVideoInfo(long j10, int[] iArr, int[] iArr2, int[] iArr3);

    public void finalize() throws Throwable {
        nativeDestroy(this.mNativeHandler);
    }

    public VideoEncodeParams getDecidedEncodeParams() {
        VideoEncodeParams videoEncodeParams = new VideoEncodeParams();
        videoEncodeParams.annexb = true;
        videoEncodeParams.bitrateMode = VideoEncoderDef.BitrateMode.VBR;
        videoEncodeParams.fullIFrame = false;
        videoEncodeParams.encoderProfile = this.mEncodeProfile;
        videoEncodeParams.setFullIFrame(this.mFullIFrame);
        videoEncodeParams.gop = getDecidedGOP();
        Size sizeNativeGetSelectedResolution = nativeGetSelectedResolution(this.mNativeHandler);
        videoEncodeParams.width = sizeNativeGetSelectedResolution.width;
        videoEncodeParams.height = sizeNativeGetSelectedResolution.height;
        videoEncodeParams.fps = nativeGetSelectedFramerate(this.mNativeHandler);
        videoEncodeParams.bitrate = getDecidedVideoBitrate(sizeNativeGetSelectedResolution);
        LiteavLog.i(TAG, "getVideoEncodeParams: ".concat(String.valueOf(videoEncodeParams)));
        return videoEncodeParams;
    }

    public boolean isNeedFilterFrame() {
        int[] iArr = this.mSourceFpsArray;
        if (iArr != null && iArr.length != 0) {
            int iNativeGetSelectedFramerate = nativeGetSelectedFramerate(this.mNativeHandler);
            for (int i10 : this.mSourceFpsArray) {
                if (i10 > iNativeGetSelectedFramerate + 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public void setEncodeBitrate(int i10) {
        nativeSetEncodeBitrate(this.mNativeHandler, i10);
    }

    public void setEncodeFramerate(TXVideoEditConstants.VideoFrameRateLevel videoFrameRateLevel) {
        nativeSetEncodeFramerate(this.mNativeHandler, videoFrameRateLevel.asInt());
    }

    public void setEncodeProfile(int i10) {
        LiteavLog.i(TAG, "setEncodeProfile ".concat(String.valueOf(i10)));
        if (i10 == 2) {
            this.mEncodeProfile = d.MAIN;
        } else if (i10 == 1) {
            this.mEncodeProfile = d.BASELINE;
        } else {
            this.mEncodeProfile = d.HIGH;
        }
    }

    public void setEncodeRotation(l lVar) {
        nativeSetEncodeRotation(this.mNativeHandler, lVar.mValue);
    }

    public void setFullIFrame(boolean z10) {
        if (z10 == this.mFullIFrame) {
            return;
        }
        LiteavLog.i(TAG, "setFullIFrame ".concat(String.valueOf(z10)));
        this.mFullIFrame = z10;
    }

    public void setInputCanvasSize(Size size) {
        if (size == null) {
            return;
        }
        LiteavLog.i(TAG, "set input canvas size :".concat(String.valueOf(size)));
        nativeSetCanvasSize(this.mNativeHandler, size.width, size.height);
    }

    public void setInputVideoMediaFormat(List<MediaFormat> list) {
        this.mVideoMediaFormatList = list;
        if (list == null) {
            return;
        }
        int[] iArr = new int[list.size()];
        int[] iArr2 = new int[list.size()];
        this.mSourceFpsArray = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            MediaFormat mediaFormat = this.mVideoMediaFormatList.get(i10);
            Size sizeFromMediaFormat = getSizeFromMediaFormat(mediaFormat);
            iArr[i10] = sizeFromMediaFormat.width;
            iArr2[i10] = sizeFromMediaFormat.height;
            this.mSourceFpsArray[i10] = getNumberFromMediaFormat(mediaFormat, "frame-rate", 30);
            LiteavLog.i(TAG, "source video fps = " + this.mSourceFpsArray[i10] + " resolution = " + sizeFromMediaFormat);
        }
        nativeSetSourceVideoInfo(this.mNativeHandler, iArr, iArr2, this.mSourceFpsArray);
    }

    public void setOutputResolution(int i10) {
        nativeSetEncodeResolution(this.mNativeHandler, i10);
    }
}
