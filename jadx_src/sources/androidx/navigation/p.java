package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: NavArgument.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final m0<Object> f25214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f25215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f25216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f25217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private final Object f25218e;

    /* JADX INFO: compiled from: NavArgument.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.e
        private m0<Object> f25219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f25220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.e
        private Object f25221c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f25222d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f25223e;

        @dl.d
        public final p a() {
            m0<Object> m0VarC = this.f25219a;
            if (m0VarC == null) {
                m0VarC = m0.f25184c.c(this.f25221c);
                kotlin.jvm.internal.f0.n(m0VarC, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
            }
            return new p(m0VarC, this.f25220b, this.f25221c, this.f25222d, this.f25223e);
        }

        @dl.d
        public final a b(@dl.e Object obj) {
            this.f25221c = obj;
            this.f25222d = true;
            return this;
        }

        @dl.d
        public final a c(boolean z10) {
            this.f25220b = z10;
            return this;
        }

        @dl.d
        public final <T> a d(@dl.d m0<T> type) {
            kotlin.jvm.internal.f0.p(type, "type");
            this.f25219a = type;
            return this;
        }

        @dl.d
        public final a e(boolean z10) {
            this.f25223e = z10;
            return this;
        }
    }

    public p(@dl.d m0<Object> type, boolean z10, @dl.e Object obj, boolean z11, boolean z12) {
        kotlin.jvm.internal.f0.p(type, "type");
        if (!(type.f() || !z10)) {
            throw new IllegalArgumentException((type.c() + " does not allow nullable values").toString());
        }
        if (!((!z10 && z11 && obj == null) ? false : true)) {
            throw new IllegalArgumentException(("Argument with type " + type.c() + " has null value but is not nullable.").toString());
        }
        this.f25214a = type;
        this.f25215b = z10;
        this.f25218e = obj;
        this.f25216c = z11 || z12;
        this.f25217d = z12;
    }

    @dl.e
    public final Object a() {
        return this.f25218e;
    }

    @dl.d
    public final m0<Object> b() {
        return this.f25214a;
    }

    public final boolean c() {
        return this.f25216c;
    }

    public final boolean d() {
        return this.f25217d;
    }

    public final boolean e() {
        return this.f25215b;
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.f0.g(p.class, obj.getClass())) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f25215b != pVar.f25215b || this.f25216c != pVar.f25216c || !kotlin.jvm.internal.f0.g(this.f25214a, pVar.f25214a)) {
            return false;
        }
        Object obj2 = this.f25218e;
        if (obj2 != null) {
            return kotlin.jvm.internal.f0.g(obj2, pVar.f25218e);
        }
        return pVar.f25218e == null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void f(@dl.d String name, @dl.d Bundle bundle) {
        Object obj;
        kotlin.jvm.internal.f0.p(name, "name");
        kotlin.jvm.internal.f0.p(bundle, "bundle");
        if (!this.f25216c || (obj = this.f25218e) == null) {
            return;
        }
        this.f25214a.k(bundle, name, obj);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean g(@dl.d String name, @dl.d Bundle bundle) {
        kotlin.jvm.internal.f0.p(name, "name");
        kotlin.jvm.internal.f0.p(bundle, "bundle");
        if (!this.f25215b && bundle.containsKey(name) && bundle.get(name) == null) {
            return false;
        }
        try {
            this.f25214a.b(bundle, name);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        int iHashCode = ((((this.f25214a.hashCode() * 31) + (this.f25215b ? 1 : 0)) * 31) + (this.f25216c ? 1 : 0)) * 31;
        Object obj = this.f25218e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    @dl.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(p.class.getSimpleName());
        sb2.append(" Type: " + this.f25214a);
        sb2.append(" Nullable: " + this.f25215b);
        if (this.f25216c) {
            sb2.append(" DefaultValue: " + this.f25218e);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "sb.toString()");
        return string;
    }
}
