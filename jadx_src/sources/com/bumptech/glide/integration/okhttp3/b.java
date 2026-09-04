package com.bumptech.glide.integration.okhttp3;

import androidx.annotation.n0;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.model.h;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.p;
import com.bumptech.glide.load.model.s;
import java.io.InputStream;
import okhttp3.e;
import okhttp3.z;

/* JADX INFO: compiled from: OkHttpUrlLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public class b implements o<h, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e.a f40795a;

    /* JADX INFO: compiled from: OkHttpUrlLoader.java */
    public static class a implements p<h, InputStream> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static volatile e.a f40796b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e.a f40797a;

        public a() {
            this(a());
        }

        public a(@n0 e.a aVar) {
            this.f40797a = aVar;
        }

        private static e.a a() {
            if (f40796b == null) {
                synchronized (a.class) {
                    if (f40796b == null) {
                        f40796b = new z();
                    }
                }
            }
            return f40796b;
        }

        @Override // com.bumptech.glide.load.model.p
        public void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        @n0
        public o<h, InputStream> d(s sVar) {
            return new b(this.f40797a);
        }
    }

    public b(@n0 e.a aVar) {
        this.f40795a = aVar;
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> a(@n0 h hVar, int i10, int i11, @n0 f fVar) {
        return new o.a<>(hVar, new v6.a(this.f40795a, hVar));
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@n0 h hVar) {
        return true;
    }
}
