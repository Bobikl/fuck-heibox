package com.bumptech.glide.load.model;

import android.util.Base64;
import androidx.annotation.n0;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: DataUrlLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public final class e<Model, Data> implements o<Model, Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f41323b = "data:image";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f41324c = ";base64";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a<Data> f41325a;

    /* JADX INFO: compiled from: DataUrlLoader.java */
    public interface a<Data> {
        Class<Data> a();

        void close(Data data) throws IOException;

        Data decode(String str) throws IllegalArgumentException;
    }

    /* JADX INFO: compiled from: DataUrlLoader.java */
    public static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f41326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a<Data> f41327c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Data f41328d;

        b(String str, a<Data> aVar) {
            this.f41326b = str;
            this.f41327c = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        @n0
        public Class<Data> a() {
            return this.f41327c.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            try {
                this.f41327c.close(this.f41328d);
            } catch (IOException unused) {
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

        /* JADX WARN: Type inference failed for: r2v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void d(@n0 Priority priority, @n0 com.bumptech.glide.load.data.d.a<? super Data> aVar) {
            try {
                Data dataDecode = this.f41327c.decode(this.f41326b);
                this.f41328d = dataDecode;
                aVar.e(dataDecode);
            } catch (IllegalArgumentException e10) {
                aVar.f(e10);
            }
        }
    }

    /* JADX INFO: compiled from: DataUrlLoader.java */
    public static final class c<Model> implements p<Model, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a<InputStream> f41329a = new a();

        /* JADX INFO: compiled from: DataUrlLoader.java */
        public class a implements a<InputStream> {
            a() {
            }

            @Override // com.bumptech.glide.load.model.e.a
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.model.e.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void close(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // com.bumptech.glide.load.model.e.a
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream decode(String str) {
                if (!str.startsWith(e.f41323b)) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(e.f41324c)) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // com.bumptech.glide.load.model.p
        public void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        @n0
        public o<Model, InputStream> d(@n0 s sVar) {
            return new e(this.f41329a);
        }
    }

    public e(a<Data> aVar) {
        this.f41325a = aVar;
    }

    @Override // com.bumptech.glide.load.model.o
    public o.a<Data> a(@n0 Model model, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) {
        return new o.a<>(new com.bumptech.glide.signature.e(model), new b(model.toString(), this.f41325a));
    }

    @Override // com.bumptech.glide.load.model.o
    public boolean b(@n0 Model model) {
        return model.toString().startsWith(f41323b);
    }
}
