package com.google.android.material.color;

import android.app.Activity;
import android.graphics.Bitmap;
import androidx.annotation.RestrictTo;
import androidx.annotation.e1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.material.color.utilities.f6;
import com.google.android.material.color.utilities.r6;

/* JADX INFO: compiled from: DynamicColorsOptions.java */
/* JADX INFO: loaded from: classes7.dex */
public class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final g.f f53730e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final g.e f53731f = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @e1
    private final int f53732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final g.f f53733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    private final g.e f53734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private Integer f53735d;

    /* JADX INFO: compiled from: DynamicColorsOptions.java */
    public class a implements g.f {
        a() {
        }

        @Override // com.google.android.material.color.g.f
        public boolean a(@n0 Activity activity, int i10) {
            return true;
        }
    }

    /* JADX INFO: compiled from: DynamicColorsOptions.java */
    public class b implements g.e {
        b() {
        }

        @Override // com.google.android.material.color.g.e
        public void a(@n0 Activity activity) {
        }
    }

    /* JADX INFO: compiled from: DynamicColorsOptions.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @e1
        private int f53736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @n0
        private g.f f53737b = h.f53730e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @n0
        private g.e f53738c = h.f53731f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private Bitmap f53739d;

        @n0
        public h e() {
            return new h(this, null);
        }

        @s9.a
        @n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public c f(@n0 Bitmap bitmap) {
            this.f53739d = bitmap;
            return this;
        }

        @s9.a
        @n0
        public c g(@n0 g.e eVar) {
            this.f53738c = eVar;
            return this;
        }

        @s9.a
        @n0
        public c h(@n0 g.f fVar) {
            this.f53737b = fVar;
            return this;
        }

        @s9.a
        @n0
        public c i(@e1 int i10) {
            this.f53736a = i10;
            return this;
        }
    }

    private h(c cVar) {
        this.f53732a = cVar.f53736a;
        this.f53733b = cVar.f53737b;
        this.f53734c = cVar.f53738c;
        if (cVar.f53739d != null) {
            this.f53735d = Integer.valueOf(c(cVar.f53739d));
        }
    }

    /* synthetic */ h(c cVar, a aVar) {
        this(cVar);
    }

    private static int c(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return r6.b(f6.a(iArr, 128)).get(0).intValue();
    }

    @p0
    public Integer d() {
        return this.f53735d;
    }

    @n0
    public g.e e() {
        return this.f53734c;
    }

    @n0
    public g.f f() {
        return this.f53733b;
    }

    @e1
    public int g() {
        return this.f53732a;
    }
}
