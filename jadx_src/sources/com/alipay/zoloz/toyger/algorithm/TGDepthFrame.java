package com.alipay.zoloz.toyger.algorithm;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class TGDepthFrame {
    public ByteBuffer byteBuffer;
    public byte[] data;
    public int height;
    public int rotation;
    public int width;

    public TGDepthFrame() {
    }

    public TGDepthFrame(byte b10, int i10, int i11, int i12) {
    }

    public TGDepthFrame(TGDepthFrame tGDepthFrame) {
        if (tGDepthFrame != null) {
            byte[] bArr = tGDepthFrame.data;
            if (bArr != null) {
                this.data = (byte[]) bArr.clone();
            }
            this.width = tGDepthFrame.width;
            this.height = tGDepthFrame.height;
            this.rotation = tGDepthFrame.rotation;
            this.byteBuffer = tGDepthFrame.byteBuffer;
        }
    }

    public TGDepthFrame(ByteBuffer byteBuffer, int i10, int i11, int i12) {
        this.byteBuffer = byteBuffer;
        this.width = i10;
        this.height = i11;
        this.rotation = i12;
    }

    public TGDepthFrame(byte[] bArr, int i10, int i11, int i12) {
        this.data = bArr;
        this.width = i10;
        this.height = i11;
        this.rotation = i12;
    }

    public void assign(TGDepthFrame tGDepthFrame) {
        this.width = tGDepthFrame.width;
        this.height = tGDepthFrame.height;
        this.rotation = tGDepthFrame.rotation;
        byte[] bArr = tGDepthFrame.data;
        if (bArr != null) {
            this.data = Arrays.copyOf(bArr, bArr.length);
        }
    }

    public TGDepthFrame deepCopy() {
        TGDepthFrame tGDepthFrame = new TGDepthFrame((byte[]) null, this.width, this.height, this.rotation);
        tGDepthFrame.width = this.width;
        tGDepthFrame.height = this.height;
        tGDepthFrame.rotation = this.rotation;
        byte[] bArr = this.data;
        if (bArr == null || bArr.length == 0) {
            ByteBuffer byteBuffer = this.byteBuffer;
            if (byteBuffer != null) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.capacity());
                this.byteBuffer.rewind();
                byteBufferAllocate.put(this.byteBuffer);
                this.byteBuffer.rewind();
                byteBufferAllocate.rewind();
                tGDepthFrame.data = byteBufferAllocate.array();
            }
        } else {
            tGDepthFrame.data = Arrays.copyOf(bArr, bArr.length);
        }
        return tGDepthFrame;
    }

    public void recycle() {
        this.data = null;
        this.byteBuffer = null;
    }

    public String toString() {
        return "TGDepthFrame{data=***, width=" + this.width + ", height=" + this.height + ", rotation=" + this.rotation + '}';
    }
}
