package com.alipay.zoloz.toyger.algorithm;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class TGFrame {
    public static final int MODE_BGR = 2;
    public static final int MODE_BGRA = 1;
    public static final int MODE_DEPTH = 7;
    public static final int MODE_GRAY_16 = 6;
    public static final int MODE_GRAY_8 = 5;
    public static final int MODE_IRIS = 6;
    public static final int MODE_NV21 = 0;
    public static final int MODE_RGB = 4;
    public static final int MODE_RGBA = 3;
    public static final int TYPE_DARK = 1;
    public static final int TYPE_DEPTH = 2;
    public static final int TYPE_IR = 3;
    public static final int TYPE_LIGHT = 0;
    public static final int TYPE_NANO = 4;
    public ByteBuffer byteBuffer;
    public byte[] data;
    public int frameMode;
    public int frameType;
    public int height;
    public int rotation;
    public int width;

    public TGFrame() {
    }

    public TGFrame(TGFrame tGFrame) {
        if (tGFrame != null) {
            byte[] bArr = tGFrame.data;
            if (bArr != null) {
                this.data = (byte[]) bArr.clone();
            }
            this.width = tGFrame.width;
            this.height = tGFrame.height;
            this.rotation = tGFrame.rotation;
            this.frameMode = tGFrame.frameMode;
            this.frameType = tGFrame.frameType;
            this.byteBuffer = tGFrame.byteBuffer;
        }
    }

    public TGFrame(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13, int i14) {
        this.byteBuffer = byteBuffer;
        this.width = i10;
        this.height = i11;
        this.rotation = i12;
        this.frameMode = i13;
        this.frameType = i14;
    }

    public TGFrame(byte[] bArr, int i10, int i11, int i12, int i13, int i14) {
        this.data = bArr;
        this.width = i10;
        this.height = i11;
        this.rotation = i12;
        this.frameMode = i13;
        this.frameType = i14;
    }

    public TGFrame deepCopy() {
        TGFrame tGFrame = new TGFrame((byte[]) null, this.width, this.height, this.rotation, this.frameMode, this.frameType);
        tGFrame.width = this.width;
        tGFrame.height = this.height;
        tGFrame.rotation = this.rotation;
        tGFrame.frameMode = this.frameMode;
        tGFrame.frameType = this.frameType;
        byte[] bArr = this.data;
        if (bArr == null || bArr.length == 0) {
            ByteBuffer byteBuffer = this.byteBuffer;
            if (byteBuffer != null) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.capacity());
                this.byteBuffer.rewind();
                byteBufferAllocate.put(this.byteBuffer);
                this.byteBuffer.rewind();
                byteBufferAllocate.rewind();
                tGFrame.data = byteBufferAllocate.array();
            }
        } else {
            tGFrame.data = Arrays.copyOf(bArr, bArr.length);
        }
        return tGFrame;
    }

    public void recycle() {
        this.data = null;
        this.byteBuffer = null;
    }

    public String toString() {
        return "TGFrame{data=***, width=" + this.width + ", height=" + this.height + ", rotation=" + this.rotation + ", frameMode=" + this.frameMode + ", frameType=" + this.frameType + '}';
    }
}
