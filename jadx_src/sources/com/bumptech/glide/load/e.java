package com.bumptech.glide.load;

import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.util.m;
import java.security.MessageDigest;

/* JADX INFO: compiled from: Option.java */
/* JADX INFO: loaded from: classes6.dex */
public final class e<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b<Object> f40897e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f40898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b<T> f40899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f40900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile byte[] f40901d;

    /* JADX INFO: compiled from: Option.java */
    public class a implements b<Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.e.b
        public void a(@n0 byte[] bArr, @n0 Object obj, @n0 MessageDigest messageDigest) {
        }
    }

    /* JADX INFO: compiled from: Option.java */
    public interface b<T> {
        void a(@n0 byte[] bArr, @n0 T t10, @n0 MessageDigest messageDigest);
    }

    private e(@n0 String str, @p0 T t10, @n0 b<T> bVar) {
        this.f40900c = m.c(str);
        this.f40898a = t10;
        this.f40899b = (b) m.e(bVar);
    }

    @n0
    public static <T> e<T> a(@n0 String str, @n0 b<T> bVar) {
        return new e<>(str, null, bVar);
    }

    @n0
    public static <T> e<T> b(@n0 String str, @p0 T t10, @n0 b<T> bVar) {
        return new e<>(str, t10, bVar);
    }

    @n0
    private static <T> b<T> c() {
        return (b<T>) f40897e;
    }

    @n0
    private byte[] e() {
        if (this.f40901d == null) {
            this.f40901d = this.f40900c.getBytes(c.f40833b);
        }
        return this.f40901d;
    }

    @n0
    public static <T> e<T> f(@n0 String str) {
        return new e<>(str, null, c());
    }

    @n0
    public static <T> e<T> g(@n0 String str, @n0 T t10) {
        return new e<>(str, t10, c());
    }

    @p0
    public T d() {
        return this.f40898a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f40900c.equals(((e) obj).f40900c);
        }
        return false;
    }

    public void h(@n0 T t10, @n0 MessageDigest messageDigest) {
        this.f40899b.a(e(), t10, messageDigest);
    }

    public int hashCode() {
        return this.f40900c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f40900c + "'}";
    }
}
