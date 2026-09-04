package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.j1;
import com.meituan.robust.Constants;

/* JADX INFO: compiled from: AttributeStrategy.java */
/* JADX INFO: loaded from: classes6.dex */
public class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f40972a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h<a, Bitmap> f40973b = new h<>();

    /* JADX INFO: compiled from: AttributeStrategy.java */
    @j1
    public static class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f40974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f40975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f40976c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Bitmap.Config f40977d;

        public a(b bVar) {
            this.f40974a = bVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
        public void a() {
            this.f40974a.c(this);
        }

        public void b(int i10, int i11, Bitmap.Config config) {
            this.f40975b = i10;
            this.f40976c = i11;
            this.f40977d = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f40975b == aVar.f40975b && this.f40976c == aVar.f40976c && this.f40977d == aVar.f40977d;
        }

        public int hashCode() {
            int i10 = ((this.f40975b * 31) + this.f40976c) * 31;
            Bitmap.Config config = this.f40977d;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return c.f(this.f40975b, this.f40976c, this.f40977d);
        }
    }

    /* JADX INFO: compiled from: AttributeStrategy.java */
    @j1
    public static class b extends d<a> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        a e(int i10, int i11, Bitmap.Config config) {
            a aVarB = b();
            aVarB.b(i10, i11, config);
            return aVarB;
        }
    }

    c() {
    }

    static String f(int i10, int i11, Bitmap.Config config) {
        return Constants.ARRAY_TYPE + i10 + "x" + i11 + "], " + config;
    }

    private static String g(Bitmap bitmap) {
        return f(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String a(int i10, int i11, Bitmap.Config config) {
        return f(i10, i11, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public int b(Bitmap bitmap) {
        return com.bumptech.glide.util.o.i(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String c(Bitmap bitmap) {
        return g(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public void d(Bitmap bitmap) {
        this.f40973b.d(this.f40972a.e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        return this.f40973b.a(this.f40972a.e(i10, i11, config));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public Bitmap removeLast() {
        return this.f40973b.f();
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f40973b;
    }
}
