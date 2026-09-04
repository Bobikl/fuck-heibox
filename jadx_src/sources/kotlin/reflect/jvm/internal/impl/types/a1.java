package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: TypeSubstitution.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a1 extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final a f128047c = new a(null);

    /* JADX INFO: compiled from: TypeSubstitution.kt */
    public static final class a {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.a1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: TypeSubstitution.kt */
        public static final class C1181a extends a1 {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Map<z0, c1> f128048d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f128049e;

            /* JADX WARN: Multi-variable type inference failed */
            C1181a(Map<z0, ? extends c1> map, boolean z10) {
                this.f128048d = map;
                this.f128049e = z10;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.f1
            public boolean a() {
                return this.f128049e;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.f1
            public boolean f() {
                return this.f128048d.isEmpty();
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.a1
            @dl.e
            public c1 k(@dl.d z0 key) {
                kotlin.jvm.internal.f0.p(key, "key");
                return this.f128048d.get(key);
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public static /* synthetic */ a1 e(a aVar, Map map, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.d(map, z10);
        }

        @dl.d
        @xh.m
        public final f1 a(@dl.d d0 kotlinType) {
            kotlin.jvm.internal.f0.p(kotlinType, "kotlinType");
            return b(kotlinType.O0(), kotlinType.M0());
        }

        @dl.d
        @xh.m
        public final f1 b(@dl.d z0 typeConstructor, @dl.d List<? extends c1> arguments) {
            kotlin.jvm.internal.f0.p(typeConstructor, "typeConstructor");
            kotlin.jvm.internal.f0.p(arguments, "arguments");
            List<kotlin.reflect.jvm.internal.impl.descriptors.y0> parameters = typeConstructor.getParameters();
            kotlin.jvm.internal.f0.o(parameters, "typeConstructor.parameters");
            kotlin.reflect.jvm.internal.impl.descriptors.y0 y0Var = (kotlin.reflect.jvm.internal.impl.descriptors.y0) CollectionsKt___CollectionsKt.q3(parameters);
            if (!(y0Var != null && y0Var.I())) {
                return new c0(parameters, arguments);
            }
            List<kotlin.reflect.jvm.internal.impl.descriptors.y0> parameters2 = typeConstructor.getParameters();
            kotlin.jvm.internal.f0.o(parameters2, "typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(parameters2, 10));
            Iterator<T> it = parameters2.iterator();
            while (it.hasNext()) {
                arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.y0) it.next()).r());
            }
            return e(this, kotlin.collections.s0.B0(CollectionsKt___CollectionsKt.d6(arrayList, arguments)), false, 2, null);
        }

        @dl.d
        @xh.i
        @xh.m
        public final a1 c(@dl.d Map<z0, ? extends c1> map) {
            kotlin.jvm.internal.f0.p(map, "map");
            return e(this, map, false, 2, null);
        }

        @dl.d
        @xh.i
        @xh.m
        public final a1 d(@dl.d Map<z0, ? extends c1> map, boolean z10) {
            kotlin.jvm.internal.f0.p(map, "map");
            return new C1181a(map, z10);
        }
    }

    @dl.d
    @xh.m
    public static final f1 i(@dl.d z0 z0Var, @dl.d List<? extends c1> list) {
        return f128047c.b(z0Var, list);
    }

    @dl.d
    @xh.i
    @xh.m
    public static final a1 j(@dl.d Map<z0, ? extends c1> map) {
        return f128047c.c(map);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f1
    @dl.e
    public c1 e(@dl.d d0 key) {
        kotlin.jvm.internal.f0.p(key, "key");
        return k(key.O0());
    }

    @dl.e
    public abstract c1 k(@dl.d z0 z0Var);
}
