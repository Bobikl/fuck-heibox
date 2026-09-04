package com.bumptech.glide.load;

import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: ImageHeaderParserUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f40821a = 5242880;

    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    public class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f40822a;

        a(InputStream inputStream) {
            this.f40822a = inputStream;
        }

        @Override // com.bumptech.glide.load.b.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.b(this.f40822a);
            } finally {
                this.f40822a.reset();
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    public class C0324b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f40823a;

        C0324b(ByteBuffer byteBuffer) {
            this.f40823a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.b.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.d(this.f40823a);
            } finally {
                com.bumptech.glide.util.a.d(this.f40823a);
            }
        }
    }

    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    public class c implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f40824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b f40825b;

        c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f40824a = parcelFileDescriptorRewinder;
            this.f40825b = bVar;
        }

        @Override // com.bumptech.glide.load.b.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.f40824a.a().getFileDescriptor()), this.f40825b);
                try {
                    ImageHeaderParser.ImageType imageTypeB = imageHeaderParser.b(recyclableBufferedInputStream2);
                    recyclableBufferedInputStream2.release();
                    this.f40824a.a();
                    return imageTypeB;
                } catch (Throwable th2) {
                    th = th2;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        recyclableBufferedInputStream.release();
                    }
                    this.f40824a.a();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    public class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f40826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b f40827b;

        d(ByteBuffer byteBuffer, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f40826a = byteBuffer;
            this.f40827b = bVar;
        }

        @Override // com.bumptech.glide.load.b.g
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.a(this.f40826a, this.f40827b);
            } finally {
                com.bumptech.glide.util.a.d(this.f40826a);
            }
        }
    }

    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    public class e implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f40828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b f40829b;

        e(InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f40828a = inputStream;
            this.f40829b = bVar;
        }

        @Override // com.bumptech.glide.load.b.g
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.c(this.f40828a, this.f40829b);
            } finally {
                this.f40828a.reset();
            }
        }
    }

    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    public class f implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f40830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b f40831b;

        f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f40830a = parcelFileDescriptorRewinder;
            this.f40831b = bVar;
        }

        @Override // com.bumptech.glide.load.b.g
        public int a(ImageHeaderParser imageHeaderParser) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.f40830a.a().getFileDescriptor()), this.f40831b);
                try {
                    int iC = imageHeaderParser.c(recyclableBufferedInputStream2, this.f40831b);
                    recyclableBufferedInputStream2.release();
                    this.f40830a.a();
                    return iC;
                } catch (Throwable th2) {
                    th = th2;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        recyclableBufferedInputStream.release();
                    }
                    this.f40830a.a();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    public interface g {
        int a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    public interface h {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    private b() {
    }

    @w0(21)
    public static int a(@n0 List<ImageHeaderParser> list, @n0 ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @n0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        return d(list, new f(parcelFileDescriptorRewinder, bVar));
    }

    public static int b(@n0 List<ImageHeaderParser> list, @p0 InputStream inputStream, @n0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return d(list, new e(inputStream, bVar));
    }

    public static int c(@n0 List<ImageHeaderParser> list, @p0 ByteBuffer byteBuffer, @n0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        if (byteBuffer == null) {
            return -1;
        }
        return d(list, new d(byteBuffer, bVar));
    }

    private static int d(@n0 List<ImageHeaderParser> list, g gVar) throws IOException {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iA = gVar.a(list.get(i10));
            if (iA != -1) {
                return iA;
            }
        }
        return -1;
    }

    @n0
    @w0(21)
    public static ImageHeaderParser.ImageType e(@n0 List<ImageHeaderParser> list, @n0 ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @n0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        return h(list, new c(parcelFileDescriptorRewinder, bVar));
    }

    @n0
    public static ImageHeaderParser.ImageType f(@n0 List<ImageHeaderParser> list, @p0 InputStream inputStream, @n0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return h(list, new a(inputStream));
    }

    @n0
    public static ImageHeaderParser.ImageType g(@n0 List<ImageHeaderParser> list, @p0 ByteBuffer byteBuffer) throws IOException {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : h(list, new C0324b(byteBuffer));
    }

    @n0
    private static ImageHeaderParser.ImageType h(@n0 List<ImageHeaderParser> list, h hVar) throws IOException {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageHeaderParser.ImageType imageTypeA = hVar.a(list.get(i10));
            if (imageTypeA != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeA;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
