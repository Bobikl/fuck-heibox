package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.net.URLDecoder;

/* JADX INFO: compiled from: DataSchemeDataSource.java */
/* JADX INFO: loaded from: classes7.dex */
public final class l extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f51155j = "data";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private r f51156f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private byte[] f51157g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f51158h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f51159i;

    public l() {
        super(false);
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public long a(r rVar) throws IOException {
        y(rVar);
        this.f51156f = rVar;
        Uri uri = rVar.f51194a;
        String scheme = uri.getScheme();
        boolean zEquals = "data".equals(scheme);
        String strValueOf = String.valueOf(scheme);
        com.google.android.exoplayer2.util.a.b(zEquals, strValueOf.length() != 0 ? "Unsupported scheme: ".concat(strValueOf) : new String("Unsupported scheme: "));
        String[] strArrP1 = com.google.android.exoplayer2.util.u0.p1(uri.getSchemeSpecificPart(), Constants.ACCEPT_TIME_SEPARATOR_SP);
        if (strArrP1.length != 2) {
            String strValueOf2 = String.valueOf(uri);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 23);
            sb2.append("Unexpected URI format: ");
            sb2.append(strValueOf2);
            throw ParserException.b(sb2.toString(), null);
        }
        String str = strArrP1[1];
        if (strArrP1[0].contains(";base64")) {
            try {
                this.f51157g = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                String strValueOf3 = String.valueOf(str);
                throw ParserException.b(strValueOf3.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(strValueOf3) : new String("Error while parsing Base64 encoded string: "), e10);
            }
        } else {
            this.f51157g = com.google.android.exoplayer2.util.u0.y0(URLDecoder.decode(str, com.google.common.base.c.f56719a.name()));
        }
        long j10 = rVar.f51200g;
        byte[] bArr = this.f51157g;
        if (j10 > bArr.length) {
            this.f51157g = null;
            throw new DataSourceException(2008);
        }
        int i10 = (int) j10;
        this.f51158h = i10;
        int length = bArr.length - i10;
        this.f51159i = length;
        long j11 = rVar.f51201h;
        if (j11 != -1) {
            this.f51159i = (int) Math.min(length, j11);
        }
        z(rVar);
        long j12 = rVar.f51201h;
        return j12 != -1 ? j12 : this.f51159i;
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public void close() {
        if (this.f51157g != null) {
            this.f51157g = null;
            x();
        }
        this.f51156f = null;
    }

    @Override // com.google.android.exoplayer2.upstream.o
    @androidx.annotation.p0
    public Uri getUri() {
        r rVar = this.f51156f;
        if (rVar != null) {
            return rVar.f51194a;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f51159i;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        System.arraycopy(com.google.android.exoplayer2.util.u0.k(this.f51157g), this.f51158h, bArr, i10, iMin);
        this.f51158h += iMin;
        this.f51159i -= iMin;
        w(iMin);
        return iMin;
    }
}
