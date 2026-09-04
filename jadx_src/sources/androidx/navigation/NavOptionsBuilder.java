package androidx.navigation;

import androidx.annotation.RestrictTo;
import kotlin.b2;

/* JADX INFO: compiled from: NavOptionsBuilder.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nNavOptionsBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavOptionsBuilder.kt\nandroidx/navigation/NavOptionsBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
@l0
public final class NavOptionsBuilder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24934c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private String f24936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f24937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f24938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private kotlin.reflect.d<?> f24939h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private Object f24940i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final j0.a f24932a = new j0.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.d0
    private int f24935d = -1;

    @kotlin.k(message = "Use the popUpToId property.")
    public static /* synthetic */ void e() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void p(NavOptionsBuilder navOptionsBuilder, int i10, yh.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = new yh.l<u0, b2>() { // from class: androidx.navigation.NavOptionsBuilder$popUpTo$1
                public final void a(u0 u0Var) {
                    kotlin.jvm.internal.f0.p(u0Var, "$this$null");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(u0 u0Var) {
                    a(u0Var);
                    return b2.f124493a;
                }
            };
        }
        navOptionsBuilder.k(i10, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void q(NavOptionsBuilder navOptionsBuilder, Object obj, yh.l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = new yh.l<u0, b2>() { // from class: androidx.navigation.NavOptionsBuilder$popUpTo$4
                public final void a(u0 u0Var) {
                    kotlin.jvm.internal.f0.p(u0Var, "$this$null");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(u0 u0Var) {
                    a(u0Var);
                    return b2.f124493a;
                }
            };
        }
        navOptionsBuilder.l(obj, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void r(NavOptionsBuilder navOptionsBuilder, String str, yh.l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = new yh.l<u0, b2>() { // from class: androidx.navigation.NavOptionsBuilder$popUpTo$2
                public final void a(u0 u0Var) {
                    kotlin.jvm.internal.f0.p(u0Var, "$this$null");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(u0 u0Var) {
                    a(u0Var);
                    return b2.f124493a;
                }
            };
        }
        navOptionsBuilder.m(str, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void s(NavOptionsBuilder navOptionsBuilder, yh.l popUpToBuilder, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            popUpToBuilder = new yh.l<u0, b2>() { // from class: androidx.navigation.NavOptionsBuilder$popUpTo$3
                public final void a(u0 u0Var) {
                    kotlin.jvm.internal.f0.p(u0Var, "$this$null");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(u0 u0Var) {
                    a(u0Var);
                    return b2.f124493a;
                }
            };
        }
        kotlin.jvm.internal.f0.p(popUpToBuilder, "popUpToBuilder");
        kotlin.jvm.internal.f0.y(4, androidx.exifinterface.media.a.f23244d5);
        navOptionsBuilder.n(kotlin.jvm.internal.n0.d(Object.class), popUpToBuilder);
    }

    private final void w(String str) {
        if (str != null) {
            if (!(!kotlin.text.u.V1(str))) {
                throw new IllegalArgumentException("Cannot pop up to an empty route".toString());
            }
            this.f24936e = str;
            this.f24937f = false;
        }
    }

    private final void x(kotlin.reflect.d<?> dVar) {
        if (dVar != null) {
            this.f24939h = dVar;
            this.f24937f = false;
        }
    }

    private final void y(Object obj) {
        if (obj != null) {
            this.f24940i = obj;
            this.f24937f = false;
        }
    }

    public final void a(@dl.d yh.l<? super f, b2> animBuilder) {
        kotlin.jvm.internal.f0.p(animBuilder, "animBuilder");
        f fVar = new f();
        animBuilder.invoke(fVar);
        this.f24932a.b(fVar.a()).c(fVar.b()).e(fVar.c()).f(fVar.d());
    }

    @dl.d
    public final j0 b() {
        j0.a aVar = this.f24932a;
        aVar.d(this.f24933b);
        aVar.u(this.f24934c);
        String str = this.f24936e;
        if (str != null) {
            aVar.l(str, this.f24937f, this.f24938g);
        } else {
            kotlin.reflect.d<?> dVar = this.f24939h;
            if (dVar != null) {
                kotlin.jvm.internal.f0.m(dVar);
                aVar.m(dVar, this.f24937f, this.f24938g);
            } else {
                Object obj = this.f24940i;
                if (obj != null) {
                    kotlin.jvm.internal.f0.m(obj);
                    aVar.j(obj, this.f24937f, this.f24938g);
                } else {
                    aVar.h(this.f24935d, this.f24937f, this.f24938g);
                }
            }
        }
        return aVar.a();
    }

    public final boolean c() {
        return this.f24933b;
    }

    public final int d() {
        return this.f24935d;
    }

    public final int f() {
        return this.f24935d;
    }

    @dl.e
    public final String g() {
        return this.f24936e;
    }

    @dl.e
    public final kotlin.reflect.d<?> h() {
        return this.f24939h;
    }

    @dl.e
    public final Object i() {
        return this.f24940i;
    }

    public final boolean j() {
        return this.f24934c;
    }

    public final void k(@androidx.annotation.d0 int i10, @dl.d yh.l<? super u0, b2> popUpToBuilder) {
        kotlin.jvm.internal.f0.p(popUpToBuilder, "popUpToBuilder");
        v(i10);
        w(null);
        u0 u0Var = new u0();
        popUpToBuilder.invoke(u0Var);
        this.f24937f = u0Var.a();
        this.f24938g = u0Var.b();
    }

    public final <T> void l(@dl.d T route, @dl.d yh.l<? super u0, b2> popUpToBuilder) {
        kotlin.jvm.internal.f0.p(route, "route");
        kotlin.jvm.internal.f0.p(popUpToBuilder, "popUpToBuilder");
        y(route);
        v(-1);
        w(null);
        u0 u0Var = new u0();
        popUpToBuilder.invoke(u0Var);
        this.f24937f = u0Var.a();
        this.f24938g = u0Var.b();
    }

    public final void m(@dl.d String route, @dl.d yh.l<? super u0, b2> popUpToBuilder) {
        kotlin.jvm.internal.f0.p(route, "route");
        kotlin.jvm.internal.f0.p(popUpToBuilder, "popUpToBuilder");
        w(route);
        v(-1);
        u0 u0Var = new u0();
        popUpToBuilder.invoke(u0Var);
        this.f24937f = u0Var.a();
        this.f24938g = u0Var.b();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final <T> void n(@dl.d kotlin.reflect.d<T> klass, @dl.d yh.l<? super u0, b2> popUpToBuilder) {
        kotlin.jvm.internal.f0.p(klass, "klass");
        kotlin.jvm.internal.f0.p(popUpToBuilder, "popUpToBuilder");
        x(klass);
        v(-1);
        w(null);
        u0 u0Var = new u0();
        popUpToBuilder.invoke(u0Var);
        this.f24937f = u0Var.a();
        this.f24938g = u0Var.b();
    }

    public final /* synthetic */ <T> void o(yh.l<? super u0, b2> popUpToBuilder) {
        kotlin.jvm.internal.f0.p(popUpToBuilder, "popUpToBuilder");
        kotlin.jvm.internal.f0.y(4, androidx.exifinterface.media.a.f23244d5);
        n(kotlin.jvm.internal.n0.d(Object.class), popUpToBuilder);
    }

    public final void t(boolean z10) {
        this.f24933b = z10;
    }

    @kotlin.k(message = "Use the popUpTo function and passing in the id.")
    public final void u(int i10) {
        p(this, i10, null, 2, null);
    }

    public final void v(int i10) {
        this.f24935d = i10;
        this.f24937f = false;
    }

    public final void z(boolean z10) {
        this.f24934c = z10;
    }
}
