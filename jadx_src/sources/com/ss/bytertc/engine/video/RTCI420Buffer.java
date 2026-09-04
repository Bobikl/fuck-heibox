package com.ss.bytertc.engine.video;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class RTCI420Buffer {
    private int width = 0;
    private int height = 0;
    private ByteBuffer dataY = null;
    private ByteBuffer dataU = null;
    private ByteBuffer dataV = null;

    public ByteBuffer getDataU() {
        return this.dataU;
    }

    public ByteBuffer getDataV() {
        return this.dataV;
    }

    public ByteBuffer getDataY() {
        return this.dataY;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setDataU(ByteBuffer byteBuffer) {
        this.dataU = byteBuffer;
    }

    public void setDataV(ByteBuffer byteBuffer) {
        this.dataV = byteBuffer;
    }

    public void setDataY(ByteBuffer byteBuffer) {
        this.dataY = byteBuffer;
    }

    public void setHeight(int i10) {
        this.height = i10;
    }

    public void setWidth(int i10) {
        this.width = i10;
    }
}
