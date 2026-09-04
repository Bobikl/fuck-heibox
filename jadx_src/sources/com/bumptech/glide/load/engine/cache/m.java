package com.bumptech.glide.load.engine.cache;

import androidx.annotation.n0;
import androidx.core.util.n;
import com.bumptech.glide.util.o;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: SafeKeyGenerator.java */
/* JADX INFO: loaded from: classes6.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.util.j<com.bumptech.glide.load.c, String> f41085a = new com.bumptech.glide.util.j<>(1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n.a<b> f41086b = com.bumptech.glide.util.pool.a.e(10, new a());

    /* JADX INFO: compiled from: SafeKeyGenerator.java */
    public class a implements com.bumptech.glide.util.pool.a.d<b> {
        a() {
        }

        @Override // com.bumptech.glide.util.pool.a.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: compiled from: SafeKeyGenerator.java */
    public static final class b implements com.bumptech.glide.util.pool.a.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final MessageDigest f41088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.bumptech.glide.util.pool.c f41089c = com.bumptech.glide.util.pool.c.a();

        b(MessageDigest messageDigest) {
            this.f41088b = messageDigest;
        }

        @Override // com.bumptech.glide.util.pool.a.f
        @n0
        public com.bumptech.glide.util.pool.c e() {
            return this.f41089c;
        }
    }

    private String a(com.bumptech.glide.load.c cVar) {
        b bVar = (b) com.bumptech.glide.util.m.e(this.f41086b.a());
        try {
            cVar.b(bVar.f41088b);
            return o.A(bVar.f41088b.digest());
        } finally {
            this.f41086b.b(bVar);
        }
    }

    public String b(com.bumptech.glide.load.c cVar) {
        String strJ;
        synchronized (this.f41085a) {
            strJ = this.f41085a.j(cVar);
        }
        if (strJ == null) {
            strJ = a(cVar);
        }
        synchronized (this.f41085a) {
            this.f41085a.n(cVar, strJ);
        }
        return strJ;
    }
}
