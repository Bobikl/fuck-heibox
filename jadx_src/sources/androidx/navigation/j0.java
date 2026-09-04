package androidx.navigation;

import androidx.annotation.RestrictTo;
import androidx.navigation.serialization.RouteSerializerKt;

/* JADX INFO: compiled from: NavOptions.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f25154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f25155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.d0
    private final int f25156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f25157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f25158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f25159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f25160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f25161h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f25162i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private String f25163j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private kotlin.reflect.d<?> f25164k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private Object f25165l;

    /* JADX INFO: compiled from: NavOptions.kt */
    @kotlin.jvm.internal.t0({"SMAP\nNavOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavOptions.kt\nandroidx/navigation/NavOptions$Builder\n*L\n1#1,594:1\n430#1,6:595\n*S KotlinDebug\n*F\n+ 1 NavOptions.kt\nandroidx/navigation/NavOptions$Builder\n*L\n-1#1:595,6\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f25166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f25167b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.e
        private String f25169d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.e
        private kotlin.reflect.d<?> f25170e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @dl.e
        private Object f25171f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f25172g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f25173h;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.d0
        private int f25168c = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @androidx.annotation.a
        @androidx.annotation.b
        private int f25174i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @androidx.annotation.a
        @androidx.annotation.b
        private int f25175j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @androidx.annotation.a
        @androidx.annotation.b
        private int f25176k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @androidx.annotation.a
        @androidx.annotation.b
        private int f25177l = -1;

        public static /* synthetic */ a p(a aVar, int i10, boolean z10, boolean z11, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            return aVar.h(i10, z10, z11);
        }

        public static /* synthetic */ a q(a aVar, Object obj, boolean z10, boolean z11, int i10, Object obj2) {
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            return aVar.j(obj, z10, z11);
        }

        public static /* synthetic */ a r(a aVar, String str, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            return aVar.l(str, z10, z11);
        }

        public static /* synthetic */ a s(a aVar, kotlin.reflect.d dVar, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            return aVar.m(dVar, z10, z11);
        }

        public static /* synthetic */ a t(a aVar, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z11 = false;
            }
            kotlin.jvm.internal.f0.y(4, androidx.exifinterface.media.a.f23244d5);
            aVar.m(kotlin.jvm.internal.n0.d(Object.class), z10, z11);
            return aVar;
        }

        @dl.d
        public final j0 a() {
            String str = this.f25169d;
            if (str != null) {
                return new j0(this.f25166a, this.f25167b, str, this.f25172g, this.f25173h, this.f25174i, this.f25175j, this.f25176k, this.f25177l);
            }
            kotlin.reflect.d<?> dVar = this.f25170e;
            if (dVar != null) {
                return new j0(this.f25166a, this.f25167b, dVar, this.f25172g, this.f25173h, this.f25174i, this.f25175j, this.f25176k, this.f25177l);
            }
            Object obj = this.f25171f;
            if (obj == null) {
                return new j0(this.f25166a, this.f25167b, this.f25168c, this.f25172g, this.f25173h, this.f25174i, this.f25175j, this.f25176k, this.f25177l);
            }
            boolean z10 = this.f25166a;
            boolean z11 = this.f25167b;
            kotlin.jvm.internal.f0.m(obj);
            return new j0(z10, z11, obj, this.f25172g, this.f25173h, this.f25174i, this.f25175j, this.f25176k, this.f25177l);
        }

        @dl.d
        public final a b(@androidx.annotation.a @androidx.annotation.b int i10) {
            this.f25174i = i10;
            return this;
        }

        @dl.d
        public final a c(@androidx.annotation.a @androidx.annotation.b int i10) {
            this.f25175j = i10;
            return this;
        }

        @dl.d
        public final a d(boolean z10) {
            this.f25166a = z10;
            return this;
        }

        @dl.d
        public final a e(@androidx.annotation.a @androidx.annotation.b int i10) {
            this.f25176k = i10;
            return this;
        }

        @dl.d
        public final a f(@androidx.annotation.a @androidx.annotation.b int i10) {
            this.f25177l = i10;
            return this;
        }

        @dl.d
        @xh.i
        public final a g(@androidx.annotation.d0 int i10, boolean z10) {
            return p(this, i10, z10, false, 4, null);
        }

        @dl.d
        @xh.i
        public final a h(@androidx.annotation.d0 int i10, boolean z10, boolean z11) {
            this.f25168c = i10;
            this.f25169d = null;
            this.f25172g = z10;
            this.f25173h = z11;
            return this;
        }

        @dl.d
        @xh.i
        public final <T> a i(@dl.d T route, boolean z10) {
            kotlin.jvm.internal.f0.p(route, "route");
            return q(this, route, z10, false, 4, null);
        }

        @dl.d
        @xh.i
        public final <T> a j(@dl.d T route, boolean z10, boolean z11) {
            kotlin.jvm.internal.f0.p(route, "route");
            this.f25171f = route;
            h(RouteSerializerKt.h(kotlinx.serialization.t.g(kotlin.jvm.internal.n0.d(route.getClass()))), z10, z11);
            return this;
        }

        @dl.d
        @xh.i
        public final a k(@dl.e String str, boolean z10) {
            return r(this, str, z10, false, 4, null);
        }

        @dl.d
        @xh.i
        public final a l(@dl.e String str, boolean z10, boolean z11) {
            this.f25169d = str;
            this.f25168c = -1;
            this.f25172g = z10;
            this.f25173h = z11;
            return this;
        }

        @dl.d
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final a m(@dl.d kotlin.reflect.d<?> klass, boolean z10, boolean z11) {
            kotlin.jvm.internal.f0.p(klass, "klass");
            this.f25170e = klass;
            this.f25168c = -1;
            this.f25172g = z10;
            this.f25173h = z11;
            return this;
        }

        @xh.i
        public final /* synthetic */ <T> a n(boolean z10) {
            kotlin.jvm.internal.f0.y(4, androidx.exifinterface.media.a.f23244d5);
            m(kotlin.jvm.internal.n0.d(Object.class), z10, false);
            return this;
        }

        @xh.i
        public final /* synthetic */ <T> a o(boolean z10, boolean z11) {
            kotlin.jvm.internal.f0.y(4, androidx.exifinterface.media.a.f23244d5);
            m(kotlin.jvm.internal.n0.d(Object.class), z10, z11);
            return this;
        }

        @dl.d
        public final a u(boolean z10) {
            this.f25167b = z10;
            return this;
        }
    }

    public j0(boolean z10, boolean z11, @androidx.annotation.d0 int i10, boolean z12, boolean z13, @androidx.annotation.a @androidx.annotation.b int i11, @androidx.annotation.a @androidx.annotation.b int i12, @androidx.annotation.a @androidx.annotation.b int i13, @androidx.annotation.a @androidx.annotation.b int i14) {
        this.f25154a = z10;
        this.f25155b = z11;
        this.f25156c = i10;
        this.f25157d = z12;
        this.f25158e = z13;
        this.f25159f = i11;
        this.f25160g = i12;
        this.f25161h = i13;
        this.f25162i = i14;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j0(boolean z10, boolean z11, @dl.d Object popUpToRouteObject, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this(z10, z11, RouteSerializerKt.h(kotlinx.serialization.t.g(kotlin.jvm.internal.n0.d(popUpToRouteObject.getClass()))), z12, z13, i10, i11, i12, i13);
        kotlin.jvm.internal.f0.p(popUpToRouteObject, "popUpToRouteObject");
        this.f25165l = popUpToRouteObject;
    }

    public j0(boolean z10, boolean z11, @dl.e String str, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this(z10, z11, NavDestination.f24858l.a(str).hashCode(), z12, z13, i10, i11, i12, i13);
        this.f25163j = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j0(boolean z10, boolean z11, @dl.e kotlin.reflect.d<?> dVar, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this(z10, z11, RouteSerializerKt.h(kotlinx.serialization.t.g(dVar)), z12, z13, i10, i11, i12, i13);
        kotlin.jvm.internal.f0.m(dVar);
        this.f25164k = dVar;
    }

    @androidx.annotation.a
    @androidx.annotation.b
    public final int a() {
        return this.f25159f;
    }

    @androidx.annotation.a
    @androidx.annotation.b
    public final int b() {
        return this.f25160g;
    }

    @androidx.annotation.a
    @androidx.annotation.b
    public final int c() {
        return this.f25161h;
    }

    @androidx.annotation.a
    @androidx.annotation.b
    public final int d() {
        return this.f25162i;
    }

    @androidx.annotation.d0
    @kotlin.k(message = "Use popUpToId instead.", replaceWith = @kotlin.s0(expression = "popUpToId", imports = {}))
    public final int e() {
        return this.f25156c;
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f25154a == j0Var.f25154a && this.f25155b == j0Var.f25155b && this.f25156c == j0Var.f25156c && kotlin.jvm.internal.f0.g(this.f25163j, j0Var.f25163j) && kotlin.jvm.internal.f0.g(this.f25164k, j0Var.f25164k) && kotlin.jvm.internal.f0.g(this.f25165l, j0Var.f25165l) && this.f25157d == j0Var.f25157d && this.f25158e == j0Var.f25158e && this.f25159f == j0Var.f25159f && this.f25160g == j0Var.f25160g && this.f25161h == j0Var.f25161h && this.f25162i == j0Var.f25162i;
    }

    @androidx.annotation.d0
    public final int f() {
        return this.f25156c;
    }

    @dl.e
    public final String g() {
        return this.f25163j;
    }

    @dl.e
    public final kotlin.reflect.d<?> h() {
        return this.f25164k;
    }

    public int hashCode() {
        int i10 = (((((k() ? 1 : 0) * 31) + (m() ? 1 : 0)) * 31) + this.f25156c) * 31;
        String str = this.f25163j;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        kotlin.reflect.d<?> dVar = this.f25164k;
        int iHashCode2 = (iHashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        Object obj = this.f25165l;
        return ((((((((((((iHashCode2 + (obj != null ? obj.hashCode() : 0)) * 31) + (j() ? 1 : 0)) * 31) + (l() ? 1 : 0)) * 31) + this.f25159f) * 31) + this.f25160g) * 31) + this.f25161h) * 31) + this.f25162i;
    }

    @dl.e
    public final Object i() {
        return this.f25165l;
    }

    public final boolean j() {
        return this.f25157d;
    }

    public final boolean k() {
        return this.f25154a;
    }

    public final boolean l() {
        return this.f25158e;
    }

    public final boolean m() {
        return this.f25155b;
    }

    @dl.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j0.class.getSimpleName());
        sb2.append("(");
        if (this.f25154a) {
            sb2.append("launchSingleTop ");
        }
        if (this.f25155b) {
            sb2.append("restoreState ");
        }
        String str = this.f25163j;
        if ((str != null || this.f25156c != -1) && str != null) {
            sb2.append("popUpTo(");
            String str2 = this.f25163j;
            if (str2 != null) {
                sb2.append(str2);
            } else {
                kotlin.reflect.d<?> dVar = this.f25164k;
                if (dVar != null) {
                    sb2.append(dVar);
                } else {
                    Object obj = this.f25165l;
                    if (obj != null) {
                        sb2.append(obj);
                    } else {
                        sb2.append("0x");
                        sb2.append(Integer.toHexString(this.f25156c));
                    }
                }
            }
            if (this.f25157d) {
                sb2.append(" inclusive");
            }
            if (this.f25158e) {
                sb2.append(" saveState");
            }
            sb2.append(")");
        }
        if (this.f25159f != -1 || this.f25160g != -1 || this.f25161h != -1 || this.f25162i != -1) {
            sb2.append("anim(enterAnim=0x");
            sb2.append(Integer.toHexString(this.f25159f));
            sb2.append(" exitAnim=0x");
            sb2.append(Integer.toHexString(this.f25160g));
            sb2.append(" popEnterAnim=0x");
            sb2.append(Integer.toHexString(this.f25161h));
            sb2.append(" popExitAnim=0x");
            sb2.append(Integer.toHexString(this.f25162i));
            sb2.append(")");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "sb.toString()");
        return string;
    }
}
