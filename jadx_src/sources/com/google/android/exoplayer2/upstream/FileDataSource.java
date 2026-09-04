package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.annotation.w0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes7.dex */
public final class FileDataSource extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private RandomAccessFile f50859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private Uri f50860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f50861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f50862i;

    public static class FileDataSourceException extends DataSourceException {
        @Deprecated
        public FileDataSourceException(Exception exc) {
            super(exc, 2000);
        }

        @Deprecated
        public FileDataSourceException(String str, IOException iOException) {
            super(str, iOException, 2000);
        }

        public FileDataSourceException(@androidx.annotation.p0 String str, @androidx.annotation.p0 Throwable th2, int i10) {
            super(str, th2, i10);
        }

        public FileDataSourceException(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    @w0(21)
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @androidx.annotation.u
        public static boolean b(@androidx.annotation.p0 Throwable th2) {
            return (th2 instanceof ErrnoException) && ((ErrnoException) th2).errno == OsConstants.EACCES;
        }
    }

    public static final class b implements o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        private u0 f50863a;

        @Override // com.google.android.exoplayer2.upstream.o.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public FileDataSource a() {
            FileDataSource fileDataSource = new FileDataSource();
            u0 u0Var = this.f50863a;
            if (u0Var != null) {
                fileDataSource.e(u0Var);
            }
            return fileDataSource;
        }

        public b d(@androidx.annotation.p0 u0 u0Var) {
            this.f50863a = u0Var;
            return this;
        }
    }

    public FileDataSource() {
        super(false);
    }

    private static RandomAccessFile A(Uri uri) throws FileDataSourceException {
        try {
            return new RandomAccessFile((String) com.google.android.exoplayer2.util.a.g(uri.getPath()), "r");
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(e10, (com.google.android.exoplayer2.util.u0.f51536a < 21 || !a.b(e10.getCause())) ? 2005 : 2006);
            }
            throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e10, 1004);
        } catch (SecurityException e11) {
            throw new FileDataSourceException(e11, 2006);
        } catch (RuntimeException e12) {
            throw new FileDataSourceException(e12, 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public long a(r rVar) throws FileDataSourceException {
        Uri uri = rVar.f51194a;
        this.f50860g = uri;
        y(rVar);
        RandomAccessFile randomAccessFileA = A(uri);
        this.f50859f = randomAccessFileA;
        try {
            randomAccessFileA.seek(rVar.f51200g);
            long length = rVar.f51201h;
            if (length == -1) {
                length = this.f50859f.length() - rVar.f51200g;
            }
            this.f50861h = length;
            if (length < 0) {
                throw new FileDataSourceException(null, null, 2008);
            }
            this.f50862i = true;
            z(rVar);
            return this.f50861h;
        } catch (IOException e10) {
            throw new FileDataSourceException(e10, 2000);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0017 */
    @Override // com.google.android.exoplayer2.upstream.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws com.google.android.exoplayer2.upstream.FileDataSource.FileDataSourceException {
        /*
            r5 = this;
            r0 = 0
            r5.f50860g = r0
            r1 = 0
            java.io.RandomAccessFile r2 = r5.f50859f     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
        Lb:
            r5.f50859f = r0
            boolean r0 = r5.f50862i
            if (r0 == 0) goto L16
            r5.f50862i = r1
            r5.x()
        L16:
            return
        L17:
            r2 = move-exception
            goto L22
        L19:
            r2 = move-exception
            com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException r3 = new com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException     // Catch: java.lang.Throwable -> L17
            r4 = 2000(0x7d0, float:2.803E-42)
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L22:
            r5.f50859f = r0
            boolean r0 = r5.f50862i
            if (r0 == 0) goto L2d
            r5.f50862i = r1
            r5.x()
        L2d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.FileDataSource.close():void");
    }

    @Override // com.google.android.exoplayer2.upstream.o
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f50860g;
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public int read(byte[] bArr, int i10, int i11) throws FileDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f50861h == 0) {
            return -1;
        }
        try {
            int i12 = ((RandomAccessFile) com.google.android.exoplayer2.util.u0.k(this.f50859f)).read(bArr, i10, (int) Math.min(this.f50861h, i11));
            if (i12 > 0) {
                this.f50861h -= (long) i12;
                w(i12);
            }
            return i12;
        } catch (IOException e10) {
            throw new FileDataSourceException(e10, 2000);
        }
    }
}
