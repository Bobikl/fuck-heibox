package com.tencent.ugc.videobase.common;

import android.media.MediaFormat;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.common.CodecType;
import com.tencent.liteav.videobase.common.c;
import com.tencent.liteav.videobase.common.d;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::ugc")
public class EncodedVideoFrame {
    public ByteBuffer data;
    public long dts;
    public int height;
    public long pts;
    public int rotation;
    public MediaFormat videoFormat;
    public int width;
    public c nalType = c.UNKNOWN;
    public d profileType = d.UNKNOWN;
    public CodecType codecType = CodecType.H264;
    public boolean isEosFrame = false;

    public static EncodedVideoFrame create(int i10) {
        EncodedVideoFrame encodedVideoFrame = new EncodedVideoFrame();
        encodedVideoFrame.data = ByteBuffer.allocateDirect(i10);
        return encodedVideoFrame;
    }

    public static int getNextNALHeaderPos(int i10, ByteBuffer byteBuffer) {
        while (true) {
            int i11 = i10 + 3;
            if (i11 >= byteBuffer.remaining()) {
                return -1;
            }
            if (byteBuffer.get(i10) == 0 && byteBuffer.get(i10 + 1) == 0 && byteBuffer.get(i10 + 2) == 0 && byteBuffer.get(i11) == 1) {
                return i10 + 4;
            }
            if (byteBuffer.get(i10) == 0 && byteBuffer.get(i10 + 1) == 0 && byteBuffer.get(i10 + 2) == 1) {
                return i11;
            }
            i10++;
        }
    }

    public int getCodecType() {
        return this.codecType.mValue;
    }

    public long getDTS() {
        return this.dts;
    }

    public ByteBuffer getData() {
        return this.data;
    }

    public int getHeight() {
        return this.height;
    }

    public MediaFormat getMediaFormat() {
        return this.videoFormat;
    }

    public int getNalType() {
        return this.nalType.mValue;
    }

    public long getPTS() {
        return this.pts;
    }

    public int getProfileType() {
        return this.profileType.mValue;
    }

    public int getRotation() {
        return this.rotation;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isEosFrame() {
        return this.isEosFrame;
    }

    public boolean isH265() {
        return this.codecType == CodecType.H265;
    }

    public boolean isIDRFrame() {
        c cVar = this.nalType;
        return cVar != null && cVar.a();
    }

    public boolean isValidFrame() {
        ByteBuffer byteBuffer = this.data;
        return byteBuffer != null && byteBuffer.remaining() > 0 && this.nalType != null && this.codecType != null && this.width > 0 && this.height > 0;
    }

    public void setCodecType(int i10) {
        this.codecType = CodecType.a(i10);
    }

    public void setDTS(long j10) {
        this.dts = j10;
    }

    public void setEosFrame(boolean z10) {
        this.isEosFrame = z10;
    }

    public void setHeight(int i10) {
        this.height = i10;
    }

    public void setNalType(int i10) {
        this.nalType = c.a(i10);
    }

    public void setPTS(long j10) {
        this.pts = j10;
    }

    public void setProfileType(int i10) {
        this.profileType = d.a(i10);
    }

    public void setRotation(int i10) {
        this.rotation = i10;
    }

    public void setWidth(int i10) {
        this.width = i10;
    }

    public String toString() {
        return "nalType = " + this.nalType + ", profileType=" + this.profileType + ", rotation=" + this.rotation + ", codecType=" + this.codecType + ", dts=" + this.dts + ", pts=" + this.pts;
    }
}
