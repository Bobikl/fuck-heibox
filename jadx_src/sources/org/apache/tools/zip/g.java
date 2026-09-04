package org.apache.tools.zip;

import java.util.zip.ZipException;

/* JADX INFO: compiled from: JarMarker.java */
/* JADX INFO: loaded from: classes5.dex */
public final class g implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a0 f137410b = new a0(51966);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a0 f137411c = new a0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f137412d = new byte[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final g f137413e = new g();

    public static g h() {
        return f137413e;
    }

    @Override // org.apache.tools.zip.u
    public byte[] a() {
        return f137412d;
    }

    @Override // org.apache.tools.zip.u
    public a0 c() {
        return f137411c;
    }

    @Override // org.apache.tools.zip.u
    public a0 d() {
        return f137410b;
    }

    @Override // org.apache.tools.zip.u
    public byte[] e() {
        return f137412d;
    }

    @Override // org.apache.tools.zip.u
    public a0 f() {
        return f137411c;
    }

    @Override // org.apache.tools.zip.u
    public void g(byte[] bArr, int i10, int i11) throws ZipException {
        if (i11 != 0) {
            throw new ZipException("JarMarker doesn't expect any data");
        }
    }
}
