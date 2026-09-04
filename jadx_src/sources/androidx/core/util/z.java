package androidx.core.util;

import android.util.SizeF;
import androidx.annotation.n0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: SizeFCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f21301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f21302b;

    /* JADX INFO: compiled from: SizeFCompat.java */
    @w0(21)
    public static final class a {
        private a() {
        }

        @n0
        @androidx.annotation.u
        static SizeF a(@n0 z zVar) {
            o.l(zVar);
            return new SizeF(zVar.b(), zVar.a());
        }

        @n0
        @androidx.annotation.u
        static z b(@n0 SizeF sizeF) {
            o.l(sizeF);
            return new z(sizeF.getWidth(), sizeF.getHeight());
        }
    }

    public z(float f10, float f11) {
        this.f21301a = o.d(f10, "width");
        this.f21302b = o.d(f11, "height");
    }

    @n0
    @w0(21)
    public static z d(@n0 SizeF sizeF) {
        return a.b(sizeF);
    }

    public float a() {
        return this.f21302b;
    }

    public float b() {
        return this.f21301a;
    }

    @n0
    @w0(21)
    public SizeF c() {
        return a.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return zVar.f21301a == this.f21301a && zVar.f21302b == this.f21302b;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f21301a) ^ Float.floatToIntBits(this.f21302b);
    }

    @n0
    public String toString() {
        return this.f21301a + "x" + this.f21302b;
    }
}
