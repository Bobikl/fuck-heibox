package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.i;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::video")
public class SpsInfo {
    public int width = 0;
    public int height = 0;
    public Integer videoFormat = null;
    public Integer videoFullRangeFlag = null;
    public Integer colourPrimaries = null;
    public Integer transferCharacteristics = null;
    public Integer matrixCoefficients = null;
    public Integer maxNumRefFrames = null;

    public static native SpsInfo nativeDecodeSps(boolean z10, ByteBuffer byteBuffer);

    public static native byte[] nativeGetSpsPps(byte[] bArr, boolean z10, boolean z11);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpsInfo)) {
            return false;
        }
        SpsInfo spsInfo = (SpsInfo) obj;
        return spsInfo.width == this.width && spsInfo.height == this.height && i.a(this.videoFormat, spsInfo.videoFormat) && i.a(this.videoFullRangeFlag, spsInfo.videoFullRangeFlag) && i.a(this.colourPrimaries, spsInfo.colourPrimaries) && i.a(this.transferCharacteristics, spsInfo.transferCharacteristics) && i.a(this.matrixCoefficients, spsInfo.matrixCoefficients) && i.a(this.maxNumRefFrames, spsInfo.maxNumRefFrames);
    }

    public void set(SpsInfo spsInfo) {
        if (spsInfo == null) {
            spsInfo = new SpsInfo();
        }
        this.width = spsInfo.width;
        this.height = spsInfo.height;
        this.videoFormat = spsInfo.videoFormat;
        this.videoFullRangeFlag = spsInfo.videoFullRangeFlag;
        this.colourPrimaries = spsInfo.colourPrimaries;
        this.transferCharacteristics = spsInfo.transferCharacteristics;
        this.matrixCoefficients = spsInfo.matrixCoefficients;
        this.maxNumRefFrames = spsInfo.maxNumRefFrames;
    }

    public void setColourPrimaries(int i10) {
        this.colourPrimaries = Integer.valueOf(i10);
    }

    public void setHeight(int i10) {
        this.height = i10;
    }

    public void setMatrixCoefficients(int i10) {
        this.matrixCoefficients = Integer.valueOf(i10);
    }

    public void setMaxNumRefFrames(int i10) {
        this.maxNumRefFrames = Integer.valueOf(i10);
    }

    public void setTransferCharacteristics(int i10) {
        this.transferCharacteristics = Integer.valueOf(i10);
    }

    public void setVideoFormat(int i10) {
        this.videoFormat = Integer.valueOf(i10);
    }

    public void setVideoFullRangeFlag(int i10) {
        this.videoFullRangeFlag = Integer.valueOf(i10);
    }

    public void setWidth(int i10) {
        this.width = i10;
    }

    public String toString() {
        return "SpsInfo(" + ("width=" + this.width + ",height=" + this.height + ",videoFormat=" + this.videoFormat + ",videoFullRangeFlag=" + this.videoFullRangeFlag + ",colourPrimaries=" + this.colourPrimaries + ",transferCharacteristics=" + this.transferCharacteristics + ",matrixCoefficients=" + this.matrixCoefficients + ",maxNumRefFrames=" + this.maxNumRefFrames) + ")";
    }
}
