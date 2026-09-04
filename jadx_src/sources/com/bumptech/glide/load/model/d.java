package com.bumptech.glide.load.model;

import android.util.Log;
import androidx.annotation.n0;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ByteBufferFileLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public class d implements o<File, ByteBuffer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f41321a = "ByteBufferFileLoader";

    /* JADX INFO: compiled from: ByteBufferFileLoader.java */
    public static final class a implements com.bumptech.glide.load.data.d<ByteBuffer> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final File f41322b;

        a(File file) {
            this.f41322b = file;
        }

        @Override // com.bumptech.glide.load.data.d
        @n0
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
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
        public void d(@n0 Priority priority, @n0 com.bumptech.glide.load.data.d.a<? super ByteBuffer> aVar) {
            try {
                aVar.e(com.bumptech.glide.util.a.a(this.f41322b));
            } catch (IOException e10) {
                if (Log.isLoggable(d.f41321a, 3)) {
                    Log.d(d.f41321a, "Failed to obtain ByteBuffer for file", e10);
                }
                aVar.f(e10);
            }
        }
    }

    /* JADX INFO: compiled from: ByteBufferFileLoader.java */
    public static class b implements p<File, ByteBuffer> {
        @Override // com.bumptech.glide.load.model.p
        public void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        @n0
        public o<File, ByteBuffer> d(@n0 s sVar) {
            return new d();
        }
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<ByteBuffer> a(@n0 File file, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) {
        return new o.a<>(new com.bumptech.glide.signature.e(file), new a(file));
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@n0 File file) {
        return true;
    }
}
