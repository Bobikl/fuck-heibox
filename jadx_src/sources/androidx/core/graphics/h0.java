package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Insets.java */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public static final h0 f20741e = new h0(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20745d;

    /* JADX INFO: compiled from: Insets.java */
    @androidx.annotation.w0(29)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    private h0(int i10, int i11, int i12, int i13) {
        this.f20742a = i10;
        this.f20743b = i11;
        this.f20744c = i12;
        this.f20745d = i13;
    }

    @androidx.annotation.n0
    public static h0 a(@androidx.annotation.n0 h0 h0Var, @androidx.annotation.n0 h0 h0Var2) {
        return d(h0Var.f20742a + h0Var2.f20742a, h0Var.f20743b + h0Var2.f20743b, h0Var.f20744c + h0Var2.f20744c, h0Var.f20745d + h0Var2.f20745d);
    }

    @androidx.annotation.n0
    public static h0 b(@androidx.annotation.n0 h0 h0Var, @androidx.annotation.n0 h0 h0Var2) {
        return d(Math.max(h0Var.f20742a, h0Var2.f20742a), Math.max(h0Var.f20743b, h0Var2.f20743b), Math.max(h0Var.f20744c, h0Var2.f20744c), Math.max(h0Var.f20745d, h0Var2.f20745d));
    }

    @androidx.annotation.n0
    public static h0 c(@androidx.annotation.n0 h0 h0Var, @androidx.annotation.n0 h0 h0Var2) {
        return d(Math.min(h0Var.f20742a, h0Var2.f20742a), Math.min(h0Var.f20743b, h0Var2.f20743b), Math.min(h0Var.f20744c, h0Var2.f20744c), Math.min(h0Var.f20745d, h0Var2.f20745d));
    }

    @androidx.annotation.n0
    public static h0 d(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f20741e : new h0(i10, i11, i12, i13);
    }

    @androidx.annotation.n0
    public static h0 e(@androidx.annotation.n0 Rect rect) {
        return d(rect.left, rect.top, rect.right, rect.bottom);
    }

    @androidx.annotation.n0
    public static h0 f(@androidx.annotation.n0 h0 h0Var, @androidx.annotation.n0 h0 h0Var2) {
        return d(h0Var.f20742a - h0Var2.f20742a, h0Var.f20743b - h0Var2.f20743b, h0Var.f20744c - h0Var2.f20744c, h0Var.f20745d - h0Var2.f20745d);
    }

    @androidx.annotation.n0
    @androidx.annotation.w0(api = 29)
    public static h0 g(@androidx.annotation.n0 Insets insets) {
        return d(insets.left, insets.top, insets.right, insets.bottom);
    }

    @androidx.annotation.n0
    @Deprecated
    @androidx.annotation.w0(api = 29)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static h0 i(@androidx.annotation.n0 Insets insets) {
        return g(insets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h0.class != obj.getClass()) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f20745d == h0Var.f20745d && this.f20742a == h0Var.f20742a && this.f20744c == h0Var.f20744c && this.f20743b == h0Var.f20743b;
    }

    @androidx.annotation.n0
    @androidx.annotation.w0(29)
    public Insets h() {
        return a.a(this.f20742a, this.f20743b, this.f20744c, this.f20745d);
    }

    public int hashCode() {
        return (((((this.f20742a * 31) + this.f20743b) * 31) + this.f20744c) * 31) + this.f20745d;
    }

    @androidx.annotation.n0
    public String toString() {
        return "Insets{left=" + this.f20742a + ", top=" + this.f20743b + ", right=" + this.f20744c + ", bottom=" + this.f20745d + '}';
    }
}
