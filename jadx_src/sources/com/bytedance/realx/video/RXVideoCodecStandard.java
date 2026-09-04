package com.bytedance.realx.video;

/* JADX INFO: compiled from: RXVideoCodecDesc.java */
/* JADX INFO: loaded from: classes6.dex */
public enum RXVideoCodecStandard {
    H264(0),
    ByteVC1(1),
    Unknown(2),
    VP8(8),
    VP9(9);

    private final int value;

    RXVideoCodecStandard(int i10) {
        this.value = i10;
    }

    static RXVideoCodecStandard fromValue(int i10) {
        if (i10 == 0) {
            return H264;
        }
        if (i10 != 1) {
            return i10 != 8 ? H264 : VP8;
        }
        return ByteVC1;
    }

    String mimeType() {
        int i10 = this.value;
        if (i10 != 1) {
            return i10 != 8 ? "video/avc" : "video/x-vnd.on2.vp8";
        }
        return "video/hevc";
    }

    public int toInt() {
        return this.value;
    }
}
