package com.tencent.rtmp;

import android.graphics.Bitmap;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class TXLivePushConfig implements Serializable {
    public static final int DEFAULT_MAX_VIDEO_BITRATE = 1200;
    public static final int DEFAULT_MIN_VIDEO_BITRATE = 800;
    public int mAudioBitrate;
    public String mAudioPreProcessFuncName;
    public String mAudioPreProcessLibrary;
    public HashMap<String, String> mMetaData;
    public String mVideoPreProcessFuncName;
    public String mVideoPreProcessLibrary;
    public Bitmap mWatermark;
    public int mCustomModeType = 0;
    public int mAudioSample = 48000;
    public int mAudioChannels = 1;
    public int mVideoFPS = 20;
    public TXVideoResolution mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_540_960;
    public int mVideoBitrate = 1200;
    public int mMaxVideoBitrate = 1500;
    public int mMinVideoBitrate = 800;
    public int mBeautyLevel = 0;
    public int mWhiteningLevel = 0;
    public int mRuddyLevel = 0;
    public int mEyeScaleLevel = 0;
    public int mFaceSlimLevel = 0;
    public int mConnectRetryCount = 3;
    public int mConnectRetryInterval = 3;
    public int mWatermarkX = 0;
    public int mWatermarkY = 0;
    public float mWatermarkXF = 0.0f;
    public float mWatermarkYF = 0.0f;
    public float mWatermarkWidth = -1.0f;
    public int mVideoEncodeGop = 3;
    public boolean mVideoEncoderXMirror = false;
    public boolean mEnableHighResolutionCapture = false;
    public boolean mEnableVideoHardEncoderMainProfile = true;
    public boolean mFrontCamera = true;
    public boolean mAutoAdjustBitrate = false;
    public int mAutoAdjustStrategy = 0;
    public int mHardwareAccel = 2;
    public boolean mTouchFocus = true;
    public boolean mEnableZoom = false;
    public int mHomeOrientation = 1;
    public Bitmap mPauseImg = null;
    public int mPauseTime = 300;
    public int mPauseFps = 5;
    public int mPauseFlag = 1;
    public boolean mEnableAec = false;
    public boolean mEnableAgc = false;
    public boolean mEnableAns = false;
    public boolean mEnableAudioPreview = false;
    public boolean mEnableScreenCaptureAutoRotate = false;
    public boolean mEnablePureAudioPush = false;
    public boolean mEnableNearestIP = true;
    public int mVolumeType = 0;
    public int mLocalVideoMirrorType = 0;
    public int mRtmpChannelType = 0;

    @Deprecated
    public void enableAEC(boolean z10) {
        this.mEnableAec = z10;
    }

    @Deprecated
    public void enableAGC(boolean z10) {
        this.mEnableAgc = z10;
    }

    public void enableANS(boolean z10) {
        this.mEnableAns = z10;
    }

    public void enableAudioEarMonitoring(boolean z10) {
        this.mEnableAudioPreview = z10;
    }

    @Deprecated
    public void enableHighResolutionCaptureMode(boolean z10) {
        this.mEnableHighResolutionCapture = z10;
    }

    @Deprecated
    public void enableNearestIP(boolean z10) {
        this.mEnableNearestIP = z10;
    }

    public void enablePureAudioPush(boolean z10) {
        this.mEnablePureAudioPush = z10;
    }

    public void enableScreenCaptureAutoRotate(boolean z10) {
        this.mEnableScreenCaptureAutoRotate = z10;
    }

    public void enableVideoHardEncoderMainProfile(boolean z10) {
        this.mEnableVideoHardEncoderMainProfile = z10;
    }

    public void setAudioChannels(int i10) {
        this.mAudioChannels = i10;
    }

    public void setAudioSampleRate(int i10) {
        this.mAudioSample = i10;
    }

    public void setAutoAdjustBitrate(boolean z10) {
        this.mAutoAdjustBitrate = z10;
    }

    public void setAutoAdjustStrategy(int i10) {
        this.mAutoAdjustStrategy = i10;
    }

    @Deprecated
    public void setBeautyFilter(int i10, int i11, int i12) {
        this.mBeautyLevel = i10;
        this.mWhiteningLevel = i11;
        this.mRuddyLevel = i12;
    }

    public void setConnectRetryCount(int i10) {
        this.mConnectRetryCount = i10;
    }

    public void setConnectRetryInterval(int i10) {
        this.mConnectRetryInterval = i10;
    }

    public void setCustomModeType(int i10) {
        this.mCustomModeType = i10;
    }

    public void setEnableZoom(boolean z10) {
        this.mEnableZoom = z10;
    }

    @Deprecated
    public void setEyeScaleLevel(int i10) {
        this.mEyeScaleLevel = i10;
    }

    @Deprecated
    public void setFaceSlimLevel(int i10) {
        this.mFaceSlimLevel = i10;
    }

    @Deprecated
    public void setFrontCamera(boolean z10) {
        this.mFrontCamera = z10;
    }

    public void setHardwareAcceleration(int i10) {
        if (i10 < 0) {
            i10 = 2;
        }
        this.mHardwareAccel = i10 <= 2 ? i10 : 2;
    }

    public void setHomeOrientation(int i10) {
        this.mHomeOrientation = i10;
    }

    public void setLocalVideoMirrorType(int i10) {
        this.mLocalVideoMirrorType = i10;
    }

    public void setMaxVideoBitrate(int i10) {
        this.mMaxVideoBitrate = i10;
    }

    public void setMetaData(HashMap<String, String> map) {
        this.mMetaData = map;
    }

    public void setMinVideoBitrate(int i10) {
        this.mMinVideoBitrate = i10;
    }

    public void setPauseFlag(int i10) {
        this.mPauseFlag = i10;
    }

    @Deprecated
    public void setPauseImg(int i10, int i11) {
        this.mPauseTime = i10;
        this.mPauseFps = i11;
    }

    public void setPauseImg(Bitmap bitmap) {
        this.mPauseImg = bitmap;
    }

    @Deprecated
    public void setRtmpChannelType(int i10) {
        this.mRtmpChannelType = i10;
    }

    public void setTouchFocus(boolean z10) {
        this.mTouchFocus = z10;
    }

    public void setVideoBitrate(int i10) {
        this.mVideoBitrate = i10;
    }

    public void setVideoEncodeGop(int i10) {
        this.mVideoEncodeGop = i10;
    }

    public void setVideoEncoderXMirror(boolean z10) {
        this.mVideoEncoderXMirror = z10;
    }

    public void setVideoFPS(int i10) {
        this.mVideoFPS = i10;
    }

    public void setVideoResolution(int i10) {
        if (i10 == 30) {
            this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_1080_1920;
            return;
        }
        if (i10 == 31) {
            this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_1920_1080;
            return;
        }
        switch (i10) {
            case 0:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_360_640;
                break;
            case 1:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_540_960;
                break;
            case 2:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_720_1280;
                break;
            case 3:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_640_360;
                break;
            case 4:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_960_540;
                break;
            case 5:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_1280_720;
                break;
            case 6:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_320_480;
                break;
            case 7:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_180_320;
                break;
            case 8:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_270_480;
                break;
            case 9:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_320_180;
                break;
            case 10:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_480_270;
                break;
            case 11:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_240_320;
                break;
            case 12:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_360_480;
                break;
            case 13:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_480_640;
                break;
            case 14:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_320_240;
                break;
            case 15:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_480_360;
                break;
            case 16:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_640_480;
                break;
            case 17:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_480_480;
                break;
            case 18:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_270_270;
                break;
            case 19:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_160_160;
                break;
        }
    }

    public void setVolumeType(int i10) {
        this.mVolumeType = i10;
    }

    public void setWatermark(Bitmap bitmap, float f10, float f11, float f12) {
        this.mWatermark = bitmap;
        this.mWatermarkXF = f10;
        this.mWatermarkYF = f11;
        this.mWatermarkWidth = f12;
    }

    public void setWatermark(Bitmap bitmap, int i10, int i11) {
        this.mWatermark = bitmap;
        this.mWatermarkX = i10;
        this.mWatermarkY = i11;
    }

    public String toString() {
        return "[resolution:" + this.mVideoResolution + "][fps:" + this.mVideoFPS + "][gop:" + this.mVideoEncodeGop + "][bitrate:" + this.mVideoBitrate + "][maxBitrate:" + this.mMaxVideoBitrate + "][minBitrate:" + this.mMinVideoBitrate + "][highCapture:" + this.mEnableHighResolutionCapture + "][hwAcc:" + this.mHardwareAccel + "][homeOrientation:" + this.mHomeOrientation + "][volumeType:" + this.mVolumeType + "][earMonitor:" + this.mEnableAudioPreview + "][agc:" + this.mEnableAgc + "][ans:" + this.mEnableAns + "][aec:" + this.mEnableAec + "][sample:" + this.mAudioSample + "][pureAudioPush:" + this.mEnablePureAudioPush + "]";
    }
}
