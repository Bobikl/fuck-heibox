package androidx.core.content;

import android.content.LocusId;
import android.os.Build;

/* JADX INFO: compiled from: LocusIdCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocusId f20452b;

    /* JADX INFO: compiled from: LocusIdCompat.java */
    @androidx.annotation.w0(29)
    public static class a {
        private a() {
        }

        @androidx.annotation.n0
        static LocusId a(@androidx.annotation.n0 String str) {
            return new LocusId(str);
        }

        @androidx.annotation.n0
        static String b(@androidx.annotation.n0 LocusId locusId) {
            return locusId.getId();
        }
    }

    public m0(@androidx.annotation.n0 String str) {
        this.f20451a = (String) androidx.core.util.o.q(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.f20452b = a.a(str);
        } else {
            this.f20452b = null;
        }
    }

    @androidx.annotation.n0
    private String b() {
        return this.f20451a.length() + "_chars";
    }

    @androidx.annotation.n0
    @androidx.annotation.w0(29)
    public static m0 d(@androidx.annotation.n0 LocusId locusId) {
        androidx.core.util.o.m(locusId, "locusId cannot be null");
        return new m0((String) androidx.core.util.o.q(a.b(locusId), "id cannot be empty"));
    }

    @androidx.annotation.n0
    public String a() {
        return this.f20451a;
    }

    @androidx.annotation.n0
    @androidx.annotation.w0(29)
    public LocusId c() {
        return this.f20452b;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m0.class != obj.getClass()) {
            return false;
        }
        m0 m0Var = (m0) obj;
        String str = this.f20451a;
        if (str == null) {
            return m0Var.f20451a == null;
        }
        return str.equals(m0Var.f20451a);
    }

    public int hashCode() {
        String str = this.f20451a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    @androidx.annotation.n0
    public String toString() {
        return "LocusIdCompat[" + b() + "]";
    }
}
