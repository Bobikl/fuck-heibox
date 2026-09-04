package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.j1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.meituan.robust.Constants;
import java.util.NavigableMap;

/* JADX INFO: compiled from: SizeStrategy.java */
/* JADX INFO: loaded from: classes6.dex */
@w0(19)
public final class o implements l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f41026d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f41027a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h<a, Bitmap> f41028b = new h<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final NavigableMap<Integer, Integer> f41029c = new PrettyPrintTreeMap();

    /* JADX INFO: compiled from: SizeStrategy.java */
    @j1
    public static final class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f41030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f41031b;

        a(b bVar) {
            this.f41030a = bVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
        public void a() {
            this.f41030a.c(this);
        }

        public void b(int i10) {
            this.f41031b = i10;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && this.f41031b == ((a) obj).f41031b;
        }

        public int hashCode() {
            return this.f41031b;
        }

        public String toString() {
            return o.g(this.f41031b);
        }
    }

    /* JADX INFO: compiled from: SizeStrategy.java */
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

        public a e(int i10) {
            a aVar = (a) super.b();
            aVar.b(i10);
            return aVar;
        }
    }

    o() {
    }

    private void f(Integer num) {
        Integer num2 = this.f41029c.get(num);
        if (num2.intValue() == 1) {
            this.f41029c.remove(num);
        } else {
            this.f41029c.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    static String g(int i10) {
        return Constants.ARRAY_TYPE + i10 + "]";
    }

    private static String h(Bitmap bitmap) {
        return g(com.bumptech.glide.util.o.i(bitmap));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String a(int i10, int i11, Bitmap.Config config) {
        return g(com.bumptech.glide.util.o.h(i10, i11, config));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public int b(Bitmap bitmap) {
        return com.bumptech.glide.util.o.i(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String c(Bitmap bitmap) {
        return h(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public void d(Bitmap bitmap) {
        a aVarE = this.f41027a.e(com.bumptech.glide.util.o.i(bitmap));
        this.f41028b.d(aVarE, bitmap);
        Integer num = this.f41029c.get(Integer.valueOf(aVarE.f41031b));
        this.f41029c.put(Integer.valueOf(aVarE.f41031b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    @p0
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        int iH = com.bumptech.glide.util.o.h(i10, i11, config);
        a aVarE = this.f41027a.e(iH);
        Integer numCeilingKey = this.f41029c.ceilingKey(Integer.valueOf(iH));
        if (numCeilingKey != null && numCeilingKey.intValue() != iH && numCeilingKey.intValue() <= iH * 8) {
            this.f41027a.c(aVarE);
            aVarE = this.f41027a.e(numCeilingKey.intValue());
        }
        Bitmap bitmapA = this.f41028b.a(aVarE);
        if (bitmapA != null) {
            bitmapA.reconfigure(i10, i11, config);
            f(numCeilingKey);
        }
        return bitmapA;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    @p0
    public Bitmap removeLast() {
        Bitmap bitmapF = this.f41028b.f();
        if (bitmapF != null) {
            f(Integer.valueOf(com.bumptech.glide.util.o.i(bitmapF)));
        }
        return bitmapF;
    }

    public String toString() {
        return "SizeStrategy:\n  " + this.f41028b + "\n  SortedSizes" + this.f41029c;
    }
}
