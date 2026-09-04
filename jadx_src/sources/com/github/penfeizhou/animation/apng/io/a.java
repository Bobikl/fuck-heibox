package com.github.penfeizhou.animation.apng.io;

import android.text.TextUtils;
import com.github.penfeizhou.animation.io.d;
import com.github.penfeizhou.animation.io.e;
import java.io.IOException;

/* JADX INFO: compiled from: APNGReader.java */
/* JADX INFO: loaded from: classes6.dex */
public class a extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ThreadLocal<byte[]> f43238c = new ThreadLocal<>();

    public a(e eVar) {
        super(eVar);
    }

    protected static byte[] b() {
        byte[] bArr = f43238c.get();
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[4];
        f43238c.set(bArr2);
        return bArr2;
    }

    public boolean c(String str) throws IOException {
        if (TextUtils.isEmpty(str) || str.length() != 4) {
            return false;
        }
        int iD = d();
        for (int i10 = 0; i10 < 4; i10++) {
            if (((iD >> (i10 * 8)) & 255) != str.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    public int d() throws IOException {
        byte[] bArrB = b();
        read(bArrB, 0, 4);
        return ((bArrB[3] & 255) << 24) | (bArrB[0] & 255) | ((bArrB[1] & 255) << 8) | ((bArrB[2] & 255) << 16);
    }

    public int e() throws IOException {
        byte[] bArrB = b();
        read(bArrB, 0, 4);
        return ((bArrB[0] & 255) << 24) | (bArrB[3] & 255) | ((bArrB[2] & 255) << 8) | ((bArrB[1] & 255) << 16);
    }

    public short f() throws IOException {
        byte[] bArrB = b();
        read(bArrB, 0, 2);
        return (short) (((bArrB[0] & 255) << 8) | (bArrB[1] & 255));
    }
}
