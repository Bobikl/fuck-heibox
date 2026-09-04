package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: TypeAliasExpansion.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class s0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final a f128171e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private final s0 f128172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.x0 f128173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final List<c1> f128174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final Map<kotlin.reflect.jvm.internal.impl.descriptors.y0, c1> f128175d;

    /* JADX INFO: compiled from: TypeAliasExpansion.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final s0 a(@dl.e s0 s0Var, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.x0 typeAliasDescriptor, @dl.d List<? extends c1> arguments) {
            kotlin.jvm.internal.f0.p(typeAliasDescriptor, "typeAliasDescriptor");
            kotlin.jvm.internal.f0.p(arguments, "arguments");
            List<kotlin.reflect.jvm.internal.impl.descriptors.y0> parameters = typeAliasDescriptor.r().getParameters();
            kotlin.jvm.internal.f0.o(parameters, "typeAliasDescriptor.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(parameters, 10));
            Iterator<T> it = parameters.iterator();
            while (it.hasNext()) {
                arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.y0) it.next()).a());
            }
            return new s0(s0Var, typeAliasDescriptor, arguments, kotlin.collections.s0.B0(CollectionsKt___CollectionsKt.d6(arrayList, arguments)), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private s0(s0 s0Var, kotlin.reflect.jvm.internal.impl.descriptors.x0 x0Var, List<? extends c1> list, Map<kotlin.reflect.jvm.internal.impl.descriptors.y0, ? extends c1> map) {
        this.f128172a = s0Var;
        this.f128173b = x0Var;
        this.f128174c = list;
        this.f128175d = map;
    }

    public /* synthetic */ s0(s0 s0Var, kotlin.reflect.jvm.internal.impl.descriptors.x0 x0Var, List list, Map map, kotlin.jvm.internal.u uVar) {
        this(s0Var, x0Var, list, map);
    }

    @dl.d
    public final List<c1> a() {
        return this.f128174c;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.descriptors.x0 b() {
        return this.f128173b;
    }

    @dl.e
    public final c1 c(@dl.d z0 constructor) {
        kotlin.jvm.internal.f0.p(constructor, "constructor");
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = constructor.d();
        if (fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.y0) {
            return this.f128175d.get(fVarD);
        }
        return null;
    }

    public final boolean d(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.x0 descriptor) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        if (!kotlin.jvm.internal.f0.g(this.f128173b, descriptor)) {
            s0 s0Var = this.f128172a;
            if (!(s0Var != null ? s0Var.d(descriptor) : false)) {
                return false;
            }
        }
        return true;
    }
}
