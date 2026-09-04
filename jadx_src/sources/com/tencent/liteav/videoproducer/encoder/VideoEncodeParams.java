package com.tencent.liteav.videoproducer.encoder;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.videobase.common.CodecType;
import java.lang.reflect.Field;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::video")
public final class VideoEncodeParams implements Cloneable {
    public boolean annexb;
    public long baseFrameIndex;
    public long baseGopIndex;
    public int bitrate;
    public VideoEncoderDef.BitrateMode bitrateMode;
    public CodecType codecType;
    public boolean enableAutoQP;
    public boolean enableBFrame;
    public VideoEncoderDef.EncodeScene encodeScene;
    public VideoEncoderDef.EncoderComplexity encoderComplexity;
    public VideoEncoderDef.EncoderProfile encoderProfile;
    public int fps;
    public boolean fullIFrame;
    public int gop;
    public int height;
    public boolean isTranscodingMode;
    public JSONArray mediaCodecDeviceRelatedParams;
    public VideoEncoderDef.ReferenceStrategy referenceStrategy;
    public int width;

    public VideoEncodeParams() {
        this.width = 0;
        this.height = 0;
        this.fps = 20;
        this.gop = 3;
        this.bitrate = 0;
        this.annexb = true;
        this.encoderProfile = null;
        this.bitrateMode = VideoEncoderDef.BitrateMode.CBR;
        this.baseFrameIndex = 0L;
        this.baseGopIndex = 0L;
        this.fullIFrame = false;
        this.enableBFrame = false;
        this.referenceStrategy = VideoEncoderDef.ReferenceStrategy.FIX_GOP;
        this.codecType = CodecType.H264;
        this.isTranscodingMode = false;
        this.encoderComplexity = null;
        this.encodeScene = VideoEncoderDef.EncodeScene.kCameraRealTime;
        this.enableAutoQP = false;
        this.mediaCodecDeviceRelatedParams = null;
    }

    public VideoEncodeParams(VideoEncodeParams videoEncodeParams) {
        this.width = 0;
        this.height = 0;
        this.fps = 20;
        this.gop = 3;
        this.bitrate = 0;
        this.annexb = true;
        this.encoderProfile = null;
        this.bitrateMode = VideoEncoderDef.BitrateMode.CBR;
        this.baseFrameIndex = 0L;
        this.baseGopIndex = 0L;
        this.fullIFrame = false;
        this.enableBFrame = false;
        this.referenceStrategy = VideoEncoderDef.ReferenceStrategy.FIX_GOP;
        this.codecType = CodecType.H264;
        this.isTranscodingMode = false;
        this.encoderComplexity = null;
        this.encodeScene = VideoEncoderDef.EncodeScene.kCameraRealTime;
        this.enableAutoQP = false;
        this.mediaCodecDeviceRelatedParams = null;
        if (videoEncodeParams == null) {
            return;
        }
        this.width = videoEncodeParams.width;
        this.height = videoEncodeParams.height;
        this.fps = videoEncodeParams.fps;
        this.gop = videoEncodeParams.gop;
        this.bitrate = videoEncodeParams.bitrate;
        this.annexb = videoEncodeParams.annexb;
        this.encoderProfile = videoEncodeParams.encoderProfile;
        this.bitrateMode = videoEncodeParams.bitrateMode;
        this.baseFrameIndex = videoEncodeParams.baseFrameIndex;
        this.baseGopIndex = videoEncodeParams.baseGopIndex;
        this.fullIFrame = videoEncodeParams.fullIFrame;
        this.enableBFrame = videoEncodeParams.enableBFrame;
        this.codecType = videoEncodeParams.codecType;
        this.referenceStrategy = videoEncodeParams.referenceStrategy;
        this.isTranscodingMode = videoEncodeParams.isTranscodingMode;
        this.encoderComplexity = videoEncodeParams.encoderComplexity;
        this.encodeScene = videoEncodeParams.encodeScene;
        this.enableAutoQP = videoEncodeParams.enableAutoQP;
        if (videoEncodeParams.mediaCodecDeviceRelatedParams != null) {
            try {
                this.mediaCodecDeviceRelatedParams = new JSONArray(videoEncodeParams.mediaCodecDeviceRelatedParams.toString());
            } catch (JSONException unused) {
            }
        }
    }

    private int checkFieldDiffCounts(Object obj, Object obj2) {
        int i10 = 0;
        for (Field field : VideoEncodeParams.class.getDeclaredFields()) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            try {
                if (!CommonUtil.equals(field.get(obj), field.get(obj2))) {
                    i10++;
                }
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            }
        }
        return i10;
    }

    public static VideoEncoderDef.EncodeScene createEncodeScene(int i10) {
        return VideoEncoderDef.EncodeScene.a(i10);
    }

    public static VideoEncoderDef.BitrateMode createEncoderBitrateMode(int i10) {
        return VideoEncoderDef.BitrateMode.a(i10);
    }

    public static VideoEncoderDef.EncoderComplexity createEncoderComplexity(int i10) {
        return VideoEncoderDef.EncoderComplexity.a(i10);
    }

    public static VideoEncoderDef.EncoderProfile createEncoderProfileType(int i10) {
        return VideoEncoderDef.EncoderProfile.a(i10);
    }

    public static CodecType createEncoderVideoCodec(int i10) {
        return CodecType.a(i10);
    }

    public static VideoEncoderDef.ReferenceStrategy createReferenceStrategy(int i10) {
        return VideoEncoderDef.ReferenceStrategy.a(i10);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof VideoEncodeParams) && checkFieldDiffCounts(this, obj) == 0;
    }

    public final long getBaseFrameIndex() {
        return this.baseFrameIndex;
    }

    public final long getBaseGopIndex() {
        return this.baseGopIndex;
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final int getBitrateMode() {
        return this.bitrateMode.mValue;
    }

    public final int getCodecType() {
        return this.codecType.mValue;
    }

    public final int getEncodeScene() {
        VideoEncoderDef.EncodeScene encodeScene = this.encodeScene;
        return encodeScene == null ? VideoEncoderDef.EncodeScene.kCameraRealTime.mValue : encodeScene.mValue;
    }

    public final int getEncoderComplexity() {
        VideoEncoderDef.EncoderComplexity encoderComplexity = this.encoderComplexity;
        return encoderComplexity == null ? VideoEncoderDef.EncoderComplexity.VERY_FAST.mValue : encoderComplexity.mValue;
    }

    public final int getEncoderProfile() {
        return this.encoderProfile.mValue;
    }

    public final int getFps() {
        return this.fps;
    }

    public final int getGop() {
        return this.gop;
    }

    public final int getHeight() {
        return this.height;
    }

    public final VideoEncoderDef.ReferenceStrategy getReferenceStrategy() {
        return this.referenceStrategy;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean isAnnexb() {
        return this.annexb;
    }

    public final boolean isEnableAutoQP() {
        return this.enableAutoQP;
    }

    public final boolean isEnablesBframe() {
        return this.enableBFrame;
    }

    public final boolean isEnablesRps() {
        return this.referenceStrategy == VideoEncoderDef.ReferenceStrategy.RPS;
    }

    public final boolean isEnablesSvc() {
        return this.referenceStrategy == VideoEncoderDef.ReferenceStrategy.SVC;
    }

    public final boolean isEnablesUnlimitedGop() {
        return this.referenceStrategy == VideoEncoderDef.ReferenceStrategy.UNLIMITED_GOP;
    }

    public final boolean isFullIFrame() {
        return this.fullIFrame;
    }

    public final boolean isTranscodingMode() {
        return this.isTranscodingMode;
    }

    public final void setAnnexb(boolean z10) {
        this.annexb = z10;
    }

    public final void setAutoQPEnabeled(boolean z10) {
        this.enableAutoQP = z10;
    }

    public final void setBFrameEnabled(boolean z10) {
        this.enableBFrame = z10;
    }

    public final void setBaseFrameIndex(long j10) {
        this.baseFrameIndex = j10;
    }

    public final void setBaseGopIndex(long j10) {
        this.baseGopIndex = j10;
    }

    public final void setBitrate(int i10) {
        this.bitrate = i10;
    }

    public final void setBitrateMode(VideoEncoderDef.BitrateMode bitrateMode) {
        this.bitrateMode = bitrateMode;
    }

    public final void setCodecType(CodecType codecType) {
        this.codecType = codecType;
    }

    public final void setEncodeScene(VideoEncoderDef.EncodeScene encodeScene) {
        this.encodeScene = encodeScene;
    }

    public final void setEncoderComplexity(VideoEncoderDef.EncoderComplexity encoderComplexity) {
        this.encoderComplexity = encoderComplexity;
    }

    public final void setEncoderProfile(VideoEncoderDef.EncoderProfile encoderProfile) {
        this.encoderProfile = encoderProfile;
    }

    public final void setFps(int i10) {
        this.fps = i10;
    }

    public final void setFullIFrame(boolean z10) {
        this.fullIFrame = z10;
    }

    public final void setGop(int i10) {
        this.gop = i10;
    }

    public final void setHeight(int i10) {
        this.height = i10;
    }

    public final void setReferenceStrategy(VideoEncoderDef.ReferenceStrategy referenceStrategy) {
        this.referenceStrategy = referenceStrategy;
    }

    public final void setTranscodingModeEnabled(boolean z10) {
        this.isTranscodingMode = z10;
    }

    public final void setWidth(int i10) {
        this.width = i10;
    }

    public final String toString() {
        return "width=" + this.width + ", height=" + this.height + ", fps=" + this.fps + ", gop=" + this.gop + ", bitrate=" + this.bitrate + ", annexb=" + this.annexb + ", encoderProfile=" + this.encoderProfile + ", bitrateMode=" + this.bitrateMode + ", baseFrameIndex=" + this.baseFrameIndex + ", baseGopIndex=" + this.baseGopIndex + ", fullIFrame=" + this.fullIFrame + ", enableBFrame=" + this.enableBFrame + ", referenceStrategy=" + this.referenceStrategy + ", codecType=" + this.codecType + ", isTransCodingMode=" + this.isTranscodingMode + ", mediaCodecDeviceRelatedParams=" + this.mediaCodecDeviceRelatedParams + ", encoderComplexity=" + this.encoderComplexity + ", encodeScene=" + this.encodeScene + ", enableAutoQP=" + this.enableAutoQP;
    }
}
