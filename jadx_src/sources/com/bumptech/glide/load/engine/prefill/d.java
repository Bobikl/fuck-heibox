package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import androidx.annotation.j1;
import androidx.annotation.p0;
import com.bumptech.glide.util.m;

/* JADX INFO: compiled from: PreFillType.java */
/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @j1
    static final Bitmap.Config f41257e = Bitmap.Config.RGB_565;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bitmap.Config f41260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f41261d;

    /* JADX INFO: compiled from: PreFillType.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f41262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f41263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bitmap.Config f41264c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f41265d;

        public a(int i10) {
            this(i10, i10);
        }

        public a(int i10, int i11) {
            this.f41265d = 1;
            if (i10 <= 0) {
                throw new IllegalArgumentException("Width must be > 0");
            }
            if (i11 <= 0) {
                throw new IllegalArgumentException("Height must be > 0");
            }
            this.f41262a = i10;
            this.f41263b = i11;
        }

        d a() {
            return new d(this.f41262a, this.f41263b, this.f41264c, this.f41265d);
        }

        Bitmap.Config b() {
            return this.f41264c;
        }

        public a c(@p0 Bitmap.Config config) {
            this.f41264c = config;
            return this;
        }

        public a d(int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Weight must be > 0");
            }
            this.f41265d = i10;
            return this;
        }
    }

    d(int i10, int i11, Bitmap.Config config, int i12) {
        this.f41260c = (Bitmap.Config) m.f(config, "Config must not be null");
        this.f41258a = i10;
        this.f41259b = i11;
        this.f41261d = i12;
    }

    Bitmap.Config a() {
        return this.f41260c;
    }

    int b() {
        return this.f41259b;
    }

    int c() {
        return this.f41261d;
    }

    int d() {
        return this.f41258a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f41259b == dVar.f41259b && this.f41258a == dVar.f41258a && this.f41261d == dVar.f41261d && this.f41260c == dVar.f41260c;
    }

    public int hashCode() {
        return (((((this.f41258a * 31) + this.f41259b) * 31) + this.f41260c.hashCode()) * 31) + this.f41261d;
    }

    public String toString() {
        return "PreFillSize{width=" + this.f41258a + ", height=" + this.f41259b + ", config=" + this.f41260c + ", weight=" + this.f41261d + '}';
    }
}
