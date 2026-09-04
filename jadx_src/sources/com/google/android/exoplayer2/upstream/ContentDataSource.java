package com.google.android.exoplayer2.upstream;

import android.annotation.NonNull;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.w0;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes7.dex */
public final class ContentDataSource extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ContentResolver f50851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private Uri f50852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private AssetFileDescriptor f50853h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private FileInputStream f50854i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f50855j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f50856k;

    public static class ContentDataSourceException extends DataSourceException {
        @Deprecated
        public ContentDataSourceException(IOException iOException) {
            this(iOException, 2000);
        }

        public ContentDataSourceException(@androidx.annotation.p0 IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    @w0(31)
    public static final class a {
        private a() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.media.ApplicationMediaCapabilities$Builder] */
        @androidx.annotation.u
        public static void a(Bundle bundle) {
            bundle.putParcelable("android.provider.extra.MEDIA_CAPABILITIES", new Object() { // from class: android.media.ApplicationMediaCapabilities$Builder
                static {
                    throw new NoClassDefFoundError();
                }

                @NonNull
                public native /* synthetic */ ApplicationMediaCapabilities$Builder addSupportedHdrType(@NonNull String str);

                @NonNull
                public native /* synthetic */ ApplicationMediaCapabilities$Builder addSupportedVideoMimeType(@NonNull String str);

                @NonNull
                public native /* synthetic */ ApplicationMediaCapabilities build();
            }.addSupportedVideoMimeType("video/hevc").addSupportedHdrType("android.media.feature.hdr.dolby_vision").addSupportedHdrType("android.media.feature.hdr.hdr10").addSupportedHdrType("android.media.feature.hdr.hdr10_plus").addSupportedHdrType("android.media.feature.hdr.hlg").build());
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.f50851f = context.getContentResolver();
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public long a(r rVar) throws ContentDataSourceException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uri = rVar.f51194a;
            this.f50852g = uri;
            y(rVar);
            if ("content".equals(rVar.f51194a.getScheme())) {
                Bundle bundle = new Bundle();
                if (com.google.android.exoplayer2.util.u0.f51536a >= 31) {
                    a.a(bundle);
                }
                assetFileDescriptorOpenAssetFileDescriptor = this.f50851f.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.f50851f.openAssetFileDescriptor(uri, "r");
            }
            this.f50853h = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                String strValueOf = String.valueOf(uri);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 36);
                sb2.append("Could not open file descriptor for: ");
                sb2.append(strValueOf);
                throw new ContentDataSourceException(new IOException(sb2.toString()), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f50854i = fileInputStream;
            if (length != -1 && rVar.f51200g > length) {
                throw new ContentDataSourceException(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(rVar.f51200g + startOffset) - startOffset;
            if (jSkip != rVar.f51200g) {
                throw new ContentDataSourceException(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f50855j = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f50855j = jPosition;
                    if (jPosition < 0) {
                        throw new ContentDataSourceException(null, 2008);
                    }
                }
            } else {
                long j10 = length - jSkip;
                this.f50855j = j10;
                if (j10 < 0) {
                    throw new ContentDataSourceException(null, 2008);
                }
            }
            long jMin = rVar.f51201h;
            if (jMin != -1) {
                long j11 = this.f50855j;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.f50855j = jMin;
            }
            this.f50856k = true;
            z(rVar);
            long j12 = rVar.f51201h;
            return j12 != -1 ? j12 : this.f50855j;
        } catch (ContentDataSourceException e10) {
            throw e10;
        } catch (IOException e11) {
            throw new ContentDataSourceException(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0037 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0055 */
    @Override // com.google.android.exoplayer2.upstream.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException {
        /*
            r5 = this;
            r0 = 0
            r5.f50852g = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f50854i     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            if (r3 == 0) goto Ld
            r3.close()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
        Ld:
            r5.f50854i = r0
            android.content.res.AssetFileDescriptor r3 = r5.f50853h     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            if (r3 == 0) goto L16
            r3.close()     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
        L16:
            r5.f50853h = r0
            boolean r0 = r5.f50856k
            if (r0 == 0) goto L21
            r5.f50856k = r2
            r5.x()
        L21:
            return
        L22:
            r1 = move-exception
            goto L2b
        L24:
            r3 = move-exception
            com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException r4 = new com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L22
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L22
            throw r4     // Catch: java.lang.Throwable -> L22
        L2b:
            r5.f50853h = r0
            boolean r0 = r5.f50856k
            if (r0 == 0) goto L36
            r5.f50856k = r2
            r5.x()
        L36:
            throw r1
        L37:
            r3 = move-exception
            goto L40
        L39:
            r3 = move-exception
            com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException r4 = new com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L37
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L37
            throw r4     // Catch: java.lang.Throwable -> L37
        L40:
            r5.f50854i = r0
            android.content.res.AssetFileDescriptor r4 = r5.f50853h     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            if (r4 == 0) goto L49
            r4.close()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
        L49:
            r5.f50853h = r0
            boolean r0 = r5.f50856k
            if (r0 == 0) goto L54
            r5.f50856k = r2
            r5.x()
        L54:
            throw r3
        L55:
            r1 = move-exception
            goto L5e
        L57:
            r3 = move-exception
            com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException r4 = new com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L55
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L55
            throw r4     // Catch: java.lang.Throwable -> L55
        L5e:
            r5.f50853h = r0
            boolean r0 = r5.f50856k
            if (r0 == 0) goto L69
            r5.f50856k = r2
            r5.x()
        L69:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.ContentDataSource.close():void");
    }

    @Override // com.google.android.exoplayer2.upstream.o
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f50852g;
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public int read(byte[] bArr, int i10, int i11) throws ContentDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f50855j;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new ContentDataSourceException(e10, 2000);
            }
        }
        int i12 = ((FileInputStream) com.google.android.exoplayer2.util.u0.k(this.f50854i)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f50855j;
        if (j11 != -1) {
            this.f50855j = j11 - ((long) i12);
        }
        w(i12);
        return i12;
    }
}
