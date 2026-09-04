package com.bumptech.glide.load.model;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.n0;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: FileLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public class g<Data> implements o<File, Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f41341b = "FileLoader";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d<Data> f41342a;

    /* JADX INFO: compiled from: FileLoader.java */
    public static class a<Data> implements p<File, Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d<Data> f41343a;

        public a(d<Data> dVar) {
            this.f41343a = dVar;
        }

        @Override // com.bumptech.glide.load.model.p
        public final void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        @n0
        public final o<File, Data> d(@n0 s sVar) {
            return new g(this.f41343a);
        }
    }

    /* JADX INFO: compiled from: FileLoader.java */
    public static class b extends a<ParcelFileDescriptor> {

        /* JADX INFO: compiled from: FileLoader.java */
        public class a implements d<ParcelFileDescriptor> {
            a() {
            }

            @Override // com.bumptech.glide.load.model.g.d
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // com.bumptech.glide.load.model.g.d
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void close(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // com.bumptech.glide.load.model.g.d
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor b(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* JADX INFO: compiled from: FileLoader.java */
    public static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final File f41344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d<Data> f41345c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Data f41346d;

        c(File file, d<Data> dVar) {
            this.f41344b = file;
            this.f41345c = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        @n0
        public Class<Data> a() {
            return this.f41345c.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Data data = this.f41346d;
            if (data != null) {
                try {
                    this.f41345c.close(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @n0
        public DataSource c() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void d(@n0 Priority priority, @n0 com.bumptech.glide.load.data.d.a<? super Data> aVar) {
            try {
                Data dataB = this.f41345c.b(this.f41344b);
                this.f41346d = dataB;
                aVar.e(dataB);
            } catch (FileNotFoundException e10) {
                if (Log.isLoggable(g.f41341b, 3)) {
                    Log.d(g.f41341b, "Failed to open file", e10);
                }
                aVar.f(e10);
            }
        }
    }

    /* JADX INFO: compiled from: FileLoader.java */
    public interface d<Data> {
        Class<Data> a();

        Data b(File file) throws FileNotFoundException;

        void close(Data data) throws IOException;
    }

    /* JADX INFO: compiled from: FileLoader.java */
    public static class e extends a<InputStream> {

        /* JADX INFO: compiled from: FileLoader.java */
        public class a implements d<InputStream> {
            a() {
            }

            @Override // com.bumptech.glide.load.model.g.d
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.model.g.d
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void close(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // com.bumptech.glide.load.model.g.d
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public InputStream b(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public g(d<Data> dVar) {
        this.f41342a = dVar;
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> a(@n0 File file, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) {
        return new o.a<>(new com.bumptech.glide.signature.e(file), new c(file, this.f41342a));
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@n0 File file) {
        return true;
    }
}
