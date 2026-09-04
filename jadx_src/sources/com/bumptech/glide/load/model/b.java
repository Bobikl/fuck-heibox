package com.bumptech.glide.load.model;

import androidx.annotation.n0;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ByteArrayLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public class b<Data> implements o<byte[], Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0336b<Data> f41315a;

    /* JADX INFO: compiled from: ByteArrayLoader.java */
    public static class a implements p<byte[], ByteBuffer> {

        /* JADX INFO: renamed from: com.bumptech.glide.load.model.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ByteArrayLoader.java */
        public class C0335a implements InterfaceC0336b<ByteBuffer> {
            C0335a() {
            }

            @Override // com.bumptech.glide.load.model.b.InterfaceC0336b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // com.bumptech.glide.load.model.b.InterfaceC0336b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // com.bumptech.glide.load.model.p
        public void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        @n0
        public o<byte[], ByteBuffer> d(@n0 s sVar) {
            return new b(new C0335a());
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ByteArrayLoader.java */
    public interface InterfaceC0336b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* JADX INFO: compiled from: ByteArrayLoader.java */
    public static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f41317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InterfaceC0336b<Data> f41318c;

        c(byte[] bArr, InterfaceC0336b<Data> interfaceC0336b) {
            this.f41317b = bArr;
            this.f41318c = interfaceC0336b;
        }

        @Override // com.bumptech.glide.load.data.d
        @n0
        public Class<Data> a() {
            return this.f41318c.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        @n0
        public DataSource c() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void d(@n0 Priority priority, @n0 com.bumptech.glide.load.data.d.a<? super Data> aVar) {
            aVar.e(this.f41318c.b(this.f41317b));
        }
    }

    /* JADX INFO: compiled from: ByteArrayLoader.java */
    public static class d implements p<byte[], InputStream> {

        /* JADX INFO: compiled from: ByteArrayLoader.java */
        public class a implements InterfaceC0336b<InputStream> {
            a() {
            }

            @Override // com.bumptech.glide.load.model.b.InterfaceC0336b
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.model.b.InterfaceC0336b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // com.bumptech.glide.load.model.p
        public void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        @n0
        public o<byte[], InputStream> d(@n0 s sVar) {
            return new b(new a());
        }
    }

    public b(InterfaceC0336b<Data> interfaceC0336b) {
        this.f41315a = interfaceC0336b;
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> a(@n0 byte[] bArr, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) {
        return new o.a<>(new com.bumptech.glide.signature.e(bArr), new c(bArr, this.f41315a));
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@n0 byte[] bArr) {
        return true;
    }
}
