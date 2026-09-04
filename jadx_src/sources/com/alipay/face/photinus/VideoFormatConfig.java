package com.alipay.face.photinus;

/* JADX INFO: loaded from: classes6.dex */
public enum VideoFormatConfig {
    S(50, 1000000),
    M(40, 2000000),
    L(30, 3000000);

    private int bitRate;
    private int frameRate;

    VideoFormatConfig(int i10, int i11) {
        this.frameRate = i10;
        this.bitRate = i11;
    }

    public int getBitRate() {
        return this.bitRate;
    }

    public int getFrameRate() {
        return this.frameRate;
    }
}
