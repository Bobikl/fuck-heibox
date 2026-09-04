package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: OpusUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f44192a = 48000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f44193b = 3840;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f44194c = 3;

    private o0() {
    }

    public static List<byte[]> a(byte[] bArr) {
        long jE = e(d(bArr));
        long jE2 = e(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(b(jE));
        arrayList.add(b(jE2));
        return arrayList;
    }

    private static byte[] b(long j10) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j10).array();
    }

    public static int c(byte[] bArr) {
        return bArr[9] & 255;
    }

    private static int d(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    private static long e(long j10) {
        return (j10 * com.google.android.exoplayer2.j.f46409j) / 48000;
    }
}
