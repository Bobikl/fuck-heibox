package com.google.common.math;

import com.google.common.base.w;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: LinearTransformation.java */
/* JADX INFO: loaded from: classes7.dex */
@com.google.common.math.e
@o9.a
@o9.c
public abstract class g {

    /* JADX INFO: compiled from: LinearTransformation.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final double f58778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final double f58779b;

        private b(double d10, double d11) {
            this.f58778a = d10;
            this.f58779b = d11;
        }

        public g a(double d10, double d11) {
            w.d(com.google.common.math.d.d(d10) && com.google.common.math.d.d(d11));
            double d12 = this.f58778a;
            if (d10 != d12) {
                return b((d11 - this.f58779b) / (d10 - d12));
            }
            w.d(d11 != this.f58779b);
            return new e(this.f58778a);
        }

        public g b(double d10) {
            w.d(!Double.isNaN(d10));
            return com.google.common.math.d.d(d10) ? new d(d10, this.f58779b - (this.f58778a * d10)) : new e(this.f58778a);
        }
    }

    /* JADX INFO: compiled from: LinearTransformation.java */
    public static final class c extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f58780a = new c();

        private c() {
        }

        @Override // com.google.common.math.g
        public g c() {
            return this;
        }

        @Override // com.google.common.math.g
        public boolean d() {
            return false;
        }

        @Override // com.google.common.math.g
        public boolean e() {
            return false;
        }

        @Override // com.google.common.math.g
        public double g() {
            return Double.NaN;
        }

        @Override // com.google.common.math.g
        public double h(double d10) {
            return Double.NaN;
        }

        public String toString() {
            return "NaN";
        }
    }

    /* JADX INFO: compiled from: LinearTransformation.java */
    public static final class d extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final double f58781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final double f58782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        @t9.b
        g f58783c;

        d(double d10, double d11) {
            this.f58781a = d10;
            this.f58782b = d11;
            this.f58783c = null;
        }

        d(double d10, double d11, g gVar) {
            this.f58781a = d10;
            this.f58782b = d11;
            this.f58783c = gVar;
        }

        private g j() {
            double d10 = this.f58781a;
            return d10 != 0.0d ? new d(1.0d / d10, (this.f58782b * (-1.0d)) / d10, this) : new e(this.f58782b, this);
        }

        @Override // com.google.common.math.g
        public g c() {
            g gVar = this.f58783c;
            if (gVar != null) {
                return gVar;
            }
            g gVarJ = j();
            this.f58783c = gVarJ;
            return gVarJ;
        }

        @Override // com.google.common.math.g
        public boolean d() {
            return this.f58781a == 0.0d;
        }

        @Override // com.google.common.math.g
        public boolean e() {
            return false;
        }

        @Override // com.google.common.math.g
        public double g() {
            return this.f58781a;
        }

        @Override // com.google.common.math.g
        public double h(double d10) {
            return (d10 * this.f58781a) + this.f58782b;
        }

        public String toString() {
            return String.format("y = %g * x + %g", Double.valueOf(this.f58781a), Double.valueOf(this.f58782b));
        }
    }

    /* JADX INFO: compiled from: LinearTransformation.java */
    public static final class e extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final double f58784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        @t9.b
        g f58785b;

        e(double d10) {
            this.f58784a = d10;
            this.f58785b = null;
        }

        e(double d10, g gVar) {
            this.f58784a = d10;
            this.f58785b = gVar;
        }

        private g j() {
            return new d(0.0d, this.f58784a, this);
        }

        @Override // com.google.common.math.g
        public g c() {
            g gVar = this.f58785b;
            if (gVar != null) {
                return gVar;
            }
            g gVarJ = j();
            this.f58785b = gVarJ;
            return gVarJ;
        }

        @Override // com.google.common.math.g
        public boolean d() {
            return false;
        }

        @Override // com.google.common.math.g
        public boolean e() {
            return true;
        }

        @Override // com.google.common.math.g
        public double g() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.math.g
        public double h(double d10) {
            throw new IllegalStateException();
        }

        public String toString() {
            return String.format("x = %g", Double.valueOf(this.f58784a));
        }
    }

    public static g a() {
        return c.f58780a;
    }

    public static g b(double d10) {
        w.d(com.google.common.math.d.d(d10));
        return new d(0.0d, d10);
    }

    public static b f(double d10, double d11) {
        w.d(com.google.common.math.d.d(d10) && com.google.common.math.d.d(d11));
        return new b(d10, d11);
    }

    public static g i(double d10) {
        w.d(com.google.common.math.d.d(d10));
        return new e(d10);
    }

    public abstract g c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract double g();

    public abstract double h(double d10);
}
