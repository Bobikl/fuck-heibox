package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class AssetDataSource extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AssetManager f50846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private Uri f50847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private InputStream f50848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f50849i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f50850j;

    public static final class AssetDataSourceException extends DataSourceException {
        @Deprecated
        public AssetDataSourceException(IOException iOException) {
            super(iOException, 2000);
        }

        public AssetDataSourceException(@androidx.annotation.p0 Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f50846f = context.getAssets();
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public long a(r rVar) throws AssetDataSourceException {
        try {
            Uri uri = rVar.f51194a;
            this.f50847g = uri;
            String strSubstring = (String) com.google.android.exoplayer2.util.a.g(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            y(rVar);
            InputStream inputStreamOpen = this.f50846f.open(strSubstring, 1);
            this.f50848h = inputStreamOpen;
            if (inputStreamOpen.skip(rVar.f51200g) < rVar.f51200g) {
                throw new AssetDataSourceException(null, 2008);
            }
            long j10 = rVar.f51201h;
            if (j10 != -1) {
                this.f50849i = j10;
            } else {
                long jAvailable = this.f50848h.available();
                this.f50849i = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f50849i = -1L;
                }
            }
            this.f50850j = true;
            z(rVar);
            return this.f50849i;
        } catch (AssetDataSourceException e10) {
            throw e10;
        } catch (IOException e11) {
            throw new AssetDataSourceException(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0017 */
    @Override // com.google.android.exoplayer2.upstream.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException {
        /*
            r5 = this;
            r0 = 0
            r5.f50847g = r0
            r1 = 0
            java.io.InputStream r2 = r5.f50848h     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
        Lb:
            r5.f50848h = r0
            boolean r0 = r5.f50850j
            if (r0 == 0) goto L16
            r5.f50850j = r1
            r5.x()
        L16:
            return
        L17:
            r2 = move-exception
            goto L22
        L19:
            r2 = move-exception
            com.google.android.exoplayer2.upstream.AssetDataSource$AssetDataSourceException r3 = new com.google.android.exoplayer2.upstream.AssetDataSource$AssetDataSourceException     // Catch: java.lang.Throwable -> L17
            r4 = 2000(0x7d0, float:2.803E-42)
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L22:
            r5.f50848h = r0
            boolean r0 = r5.f50850j
            if (r0 == 0) goto L2d
            r5.f50850j = r1
            r5.x()
        L2d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.AssetDataSource.close():void");
    }

    @Override // com.google.android.exoplayer2.upstream.o
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f50847g;
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public int read(byte[] bArr, int i10, int i11) throws AssetDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f50849i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new AssetDataSourceException(e10, 2000);
            }
        }
        int i12 = ((InputStream) com.google.android.exoplayer2.util.u0.k(this.f50848h)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f50849i;
        if (j11 != -1) {
            this.f50849i = j11 - ((long) i12);
        }
        w(i12);
        return i12;
    }
}
