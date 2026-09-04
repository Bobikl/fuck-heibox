package com.tencent.liteav.videobase.common;

/* JADX INFO: loaded from: classes4.dex */
public enum CodecType {
    UNKNOWN(-1),
    H264(0),
    H265(1),
    VP8(2),
    KAV1(3);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final CodecType[] f100303f = values();
    public final int mValue;

    CodecType(int i10) {
        this.mValue = i10;
    }

    public static CodecType a(int i10) {
        for (CodecType codecType : f100303f) {
            if (i10 == codecType.mValue) {
                return codecType;
            }
        }
        return H264;
    }
}
