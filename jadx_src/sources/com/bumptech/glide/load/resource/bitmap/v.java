package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: ImageReader.java */
/* JADX INFO: loaded from: classes6.dex */
public interface v {

    /* JADX INFO: compiled from: ImageReader.java */
    public static final class a implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f41613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<ImageHeaderParser> f41614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.bumptech.glide.load.engine.bitmap_recycle.b f41615c;

        a(byte[] bArr, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f41613a = bArr;
            this.f41614b = list;
            this.f41615c = bVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v
        public void a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v
        public int b() throws IOException {
            return com.bumptech.glide.load.b.c(this.f41614b, ByteBuffer.wrap(this.f41613a), this.f41615c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v
        @p0
        public Bitmap c(BitmapFactory.Options options) {
            byte[] bArr = this.f41613a;
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.b.g(this.f41614b, ByteBuffer.wrap(this.f41613a));
        }
    }

    /* JADX INFO: compiled from: ImageReader.java */
    public static final class b implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f41616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<ImageHeaderParser> f41617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.bumptech.glide.load.engine.bitmap_recycle.b f41618c;

        b(ByteBuffer byteBuffer, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f41616a = byteBuffer;
            this.f41617b = list;
            this.f41618c = bVar;
        }

        private InputStream e() {
            return com.bumptech.glide.util.a.g(com.bumptech.glide.util.a.d(this.f41616a));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v
        public void a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v
        public int b() throws IOException {
            return com.bumptech.glide.load.b.c(this.f41617b, com.bumptech.glide.util.a.d(this.f41616a), this.f41618c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v
        @p0
        public Bitmap c(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(e(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.b.g(this.f41617b, com.bumptech.glide.util.a.d(this.f41616a));
        }
    }

    /* JADX INFO: compiled from: ImageReader.java */
    public static final class c implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f41619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<ImageHeaderParser> f41620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.bumptech.glide.load.engine.bitmap_recycle.b f41621c;

        c(File file, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f41619a = file;
            this.f41620b = list;
            this.f41621c = bVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v
        public void a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v
        public int b() throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream;
            Throwable th2;
            try {
                recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream(this.f41619a), this.f41621c);
                try {
                    int iB = com.bumptech.glide.load.b.b(this.f41620b, recyclableBufferedInputStream, this.f41621c);
                    try {
                        recyclableBufferedInputStream.close();
                    } catch (IOException unused) {
                    }
                    return iB;
                } catch (Throwable th3) {
                    th2 = th3;
                    if (recyclableBufferedInputStream != null) {
                        try {
                            recyclableBufferedInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                recyclableBufferedInputStream = null;
                th2 = th4;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v
        @p0
        public Bitmap c(BitmapFactory.Options options) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.f41619a), this.f41621c);
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(recyclableBufferedInputStream2, null, options);
                    try {
                        recyclableBufferedInputStream2.close();
                    } catch (IOException unused) {
                    }
                    return bitmapDecodeStream;
                } catch (Throwable th2) {
                    th = th2;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        try {
                            recyclableBufferedInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v
        public ImageHeaderParser.ImageType d() throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream;
            Throwable th2;
            try {
                recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream(this.f41619a), this.f41621c);
                try {
                    ImageHeaderParser.ImageType imageTypeF = com.bumptech.glide.load.b.f(this.f41620b, recyclableBufferedInputStream, this.f41621c);
                    try {
                        recyclableBufferedInputStream.close();
                    } catch (IOException unused) {
                    }
                    return imageTypeF;
                } catch (Throwable th3) {
                    th2 = th3;
                    if (recyclableBufferedInputStream != null) {
                        try {
                            recyclableBufferedInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                recyclableBufferedInputStream = null;
                th2 = th4;
            }
        }
    }

    /* JADX INFO: compiled from: ImageReader.java */
    public static final class d implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.data.k f41622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.bumptech.glide.load.engine.bitmap_recycle.b f41623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<ImageHeaderParser> f41624c;

        d(InputStream inputStream, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f41623b = (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.m.e(bVar);
            this.f41624c = (List) com.bumptech.glide.util.m.e(list);
            this.f41622a = new com.bumptech.glide.load.data.k(inputStream, bVar);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v
        public void a() {
            this.f41622a.c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v
        public int b() throws IOException {
            return com.bumptech.glide.load.b.b(this.f41624c, this.f41622a.a(), this.f41623b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v
        @p0
        public Bitmap c(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f41622a.a(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.b.f(this.f41624c, this.f41622a.a(), this.f41623b);
        }
    }

    /* JADX INFO: compiled from: ImageReader.java */
    @w0(21)
    public static final class e implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.engine.bitmap_recycle.b f41625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<ImageHeaderParser> f41626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ParcelFileDescriptorRewinder f41627c;

        e(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f41625a = (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.m.e(bVar);
            this.f41626b = (List) com.bumptech.glide.util.m.e(list);
            this.f41627c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v
        public void a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v
        public int b() throws IOException {
            return com.bumptech.glide.load.b.a(this.f41626b, this.f41627c, this.f41625a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v
        @p0
        public Bitmap c(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f41627c.a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.b.e(this.f41626b, this.f41627c, this.f41625a);
        }
    }

    void a();

    int b() throws IOException;

    @p0
    Bitmap c(BitmapFactory.Options options) throws IOException;

    ImageHeaderParser.ImageType d() throws IOException;
}
