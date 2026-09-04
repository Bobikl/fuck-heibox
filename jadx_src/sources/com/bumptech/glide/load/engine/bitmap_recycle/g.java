package com.bumptech.glide.load.engine.bitmap_recycle;

/* JADX INFO: compiled from: ByteArrayAdapter.java */
/* JADX INFO: loaded from: classes6.dex */
public final class g implements a<byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f40980a = "ByteArrayPool";

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public int b() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int a(byte[] bArr) {
        return bArr.length;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public byte[] newArray(int i10) {
        return new byte[i10];
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public String getTag() {
        return f40980a;
    }
}
