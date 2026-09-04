package com.tencent.ugc.encoder;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.common.CodecType;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::ugc")
public final class VideoEncodeParams {
    public boolean annexb;
    public int bitrate;
    public VideoEncoderDef.BitrateMode bitrateMode;
    public CodecType codecType;
    public GLConstants.ColorRange colorRange;
    public GLConstants.ColorSpace colorSpace;
    public boolean enableBFrame;
    public com.tencent.liteav.videobase.common.d encoderProfile;
    public int fps;
    public boolean fullIFrame;
    public int gop;
    public int height;
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
        this.fullIFrame = false;
        this.enableBFrame = false;
        this.codecType = CodecType.H264;
        this.colorRange = GLConstants.ColorRange.UNKNOWN;
        this.colorSpace = GLConstants.ColorSpace.UNKNOWN;
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
        this.fullIFrame = false;
        this.enableBFrame = false;
        this.codecType = CodecType.H264;
        this.colorRange = GLConstants.ColorRange.UNKNOWN;
        this.colorSpace = GLConstants.ColorSpace.UNKNOWN;
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
        this.fullIFrame = videoEncodeParams.fullIFrame;
        this.enableBFrame = videoEncodeParams.enableBFrame;
        this.codecType = videoEncodeParams.codecType;
        this.colorSpace = videoEncodeParams.colorSpace;
        this.colorRange = videoEncodeParams.colorRange;
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

    public final boolean equals(Object obj) {
        return (obj instanceof VideoEncodeParams) && checkFieldDiffCounts(this, obj) == 0;
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final int getBitrateMode() {
        return this.bitrateMode.mValue;
    }

    public final int getColorRange() {
        GLConstants.ColorRange colorRange = this.colorRange;
        return colorRange != null ? colorRange.getValue() : GLConstants.ColorSpace.UNKNOWN.getValue();
    }

    public final int getColorSpace() {
        GLConstants.ColorSpace colorSpace = this.colorSpace;
        return colorSpace != null ? colorSpace.getValue() : GLConstants.ColorRange.UNKNOWN.getValue();
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

    public final int getWidth() {
        return this.width;
    }

    public final boolean isAnnexb() {
        return this.annexb;
    }

    public final boolean isEnablesBframe() {
        return this.enableBFrame;
    }

    public final boolean isFullIFrame() {
        return this.fullIFrame;
    }

    public final void setAnnexb(boolean z10) {
        this.annexb = z10;
    }

    public final void setBitrate(int i10) {
        this.bitrate = i10;
    }

    public final void setBitrateMode(int i10) {
        this.bitrateMode = VideoEncoderDef.BitrateMode.a(i10);
    }

    public final void setCodecType(int i10) {
        this.codecType = CodecType.a(i10);
    }

    public final void setColorRange(int i10) {
        this.colorRange = GLConstants.ColorRange.a(i10);
    }

    public final void setColorSpace(int i10) {
        this.colorSpace = GLConstants.ColorSpace.a(i10);
    }

    public final void setEnableBFrame(boolean z10) {
        this.enableBFrame = z10;
    }

    public final void setEncoderProfile(int i10) {
        this.encoderProfile = com.tencent.liteav.videobase.common.d.a(i10);
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

    public final void setWidth(int i10) {
        this.width = i10;
    }

    public final String toString() {
        return "width=" + this.width + ", height=" + this.height + ", fps=" + this.fps + ", gop=" + this.gop + ", bitrate=" + this.bitrate + ", annexb=" + this.annexb + ", encoderProfile=" + this.encoderProfile + ", bitrateMode=" + this.bitrateMode + ", fullIFrame=" + this.fullIFrame + ", enableBFrame=" + this.enableBFrame + ", codecType=" + this.codecType + ", colorRange=" + this.colorRange + ", colorSpace=" + this.colorSpace;
    }
}
