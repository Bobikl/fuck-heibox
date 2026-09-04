package androidx.navigation.serialization;

import androidx.annotation.RestrictTo;
import androidx.navigation.j;
import androidx.navigation.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.b2;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.r;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.t;
import yh.l;
import yh.q;

/* JADX INFO: compiled from: RouteSerializer.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nRouteSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteSerializer.kt\nandroidx/navigation/serialization/RouteSerializerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n1#2:226\n*E\n"})
public final class RouteSerializerKt {
    private static final <T> void c(kotlinx.serialization.g<T> gVar, yh.a<b2> aVar) {
        if (gVar instanceof PolymorphicSerializer) {
            aVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0<Object> d(kotlinx.serialization.descriptors.f fVar, Map<r, ? extends m0<?>> map) {
        Object next;
        Iterator<T> it = map.keySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!d.c(fVar, (r) next));
        r rVar = (r) next;
        m0<?> m0VarB = rVar != null ? map.get(rVar) : null;
        if (!(m0VarB instanceof m0)) {
            m0VarB = null;
        }
        if (m0VarB == null) {
            m0VarB = d.b(fVar);
        }
        if (f0.g(m0VarB, i.f25283t)) {
            return null;
        }
        f0.n(m0VarB, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
        return m0VarB;
    }

    @xh.h(name = "forEachIndexedKType")
    private static final <T> void e(kotlinx.serialization.g<T> gVar, Map<r, ? extends m0<?>> map, q<? super Integer, ? super String, ? super m0<Object>, b2> qVar) {
        int iF = gVar.a().f();
        for (int i10 = 0; i10 < iF; i10++) {
            String strH = gVar.a().h(i10);
            m0<Object> m0VarD = d(gVar.a().e(i10), map);
            if (m0VarD == null) {
                throw new IllegalArgumentException(o(strH, gVar.a().e(i10).j(), gVar.a().j(), map.toString()));
            }
            qVar.invoke(Integer.valueOf(i10), strH, m0VarD);
        }
    }

    static /* synthetic */ void f(kotlinx.serialization.g gVar, Map map, q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = s0.z();
        }
        e(gVar, map, qVar);
    }

    @xh.h(name = "forEachIndexedName")
    private static final <T> void g(kotlinx.serialization.g<T> gVar, Map<String, ? extends m0<Object>> map, q<? super Integer, ? super String, ? super m0<Object>, b2> qVar) {
        int iF = gVar.a().f();
        for (int i10 = 0; i10 < iF; i10++) {
            String strH = gVar.a().h(i10);
            m0<Object> m0Var = map.get(strH);
            if (m0Var == null) {
                throw new IllegalStateException(("Cannot locate NavType for argument [" + strH + ']').toString());
            }
            qVar.invoke(Integer.valueOf(i10), strH, m0Var);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T> int h(@dl.d kotlinx.serialization.g<T> gVar) {
        f0.p(gVar, "<this>");
        int iHashCode = gVar.a().j().hashCode();
        int iF = gVar.a().f();
        for (int i10 = 0; i10 < iF; i10++) {
            iHashCode = (iHashCode * 31) + gVar.a().h(i10).hashCode();
        }
        return iHashCode;
    }

    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T> List<androidx.navigation.i> i(@dl.d final kotlinx.serialization.g<T> gVar, @dl.d final Map<r, ? extends m0<?>> typeMap) {
        f0.p(gVar, "<this>");
        f0.p(typeMap, "typeMap");
        c(gVar, new yh.a<b2>() { // from class: androidx.navigation.serialization.RouteSerializerKt$generateNavArguments$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                throw new IllegalArgumentException("Cannot generate NavArguments for polymorphic serializer " + gVar + ". Arguments can only be generated from concrete classes or objects.");
            }
        });
        int iF = gVar.a().f();
        ArrayList arrayList = new ArrayList(iF);
        for (final int i10 = 0; i10 < iF; i10++) {
            final String strH = gVar.a().h(i10);
            arrayList.add(j.a(strH, new l<androidx.navigation.q, b2>() { // from class: androidx.navigation.serialization.RouteSerializerKt$generateNavArguments$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void a(androidx.navigation.q navArgument) {
                    f0.p(navArgument, "$this$navArgument");
                    kotlinx.serialization.descriptors.f fVarE = gVar.a().e(i10);
                    boolean zC = fVarE.c();
                    m0<?> m0VarD = RouteSerializerKt.d(fVarE, typeMap);
                    if (m0VarD == null) {
                        throw new IllegalArgumentException(RouteSerializerKt.o(strH, fVarE.j(), gVar.a().j(), typeMap.toString()));
                    }
                    navArgument.h(m0VarD);
                    navArgument.g(zC);
                    if (gVar.a().k(i10)) {
                        navArgument.i(true);
                    }
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(androidx.navigation.q qVar) {
                    a(qVar);
                    return b2.f124493a;
                }
            }));
        }
        return arrayList;
    }

    public static /* synthetic */ List j(kotlinx.serialization.g gVar, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = s0.z();
        }
        return i(gVar, map);
    }

    @dl.d
    public static final <T> String k(@dl.d final kotlinx.serialization.g<T> gVar, @dl.d Map<r, ? extends m0<?>> typeMap, @dl.e String str) {
        f0.p(gVar, "<this>");
        f0.p(typeMap, "typeMap");
        c(gVar, new yh.a<b2>() { // from class: androidx.navigation.serialization.RouteSerializerKt$generateRoutePattern$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Cannot generate route pattern from polymorphic class ");
                kotlin.reflect.d<?> dVarA = kotlinx.serialization.descriptors.b.a(gVar.a());
                sb2.append(dVarA != null ? dVarA.F() : null);
                sb2.append(". Routes can only be generated from concrete classes or objects.");
                throw new IllegalArgumentException(sb2.toString());
            }
        });
        final RouteBuilder routeBuilder = str != null ? new RouteBuilder(str, gVar) : new RouteBuilder(gVar);
        e(gVar, typeMap, new q<Integer, String, m0<Object>, b2>() { // from class: androidx.navigation.serialization.RouteSerializerKt$generateRoutePattern$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final void a(int i10, String argName, m0<Object> navType) {
                f0.p(argName, "argName");
                f0.p(navType, "navType");
                routeBuilder.d(i10, argName, navType);
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ b2 invoke(Integer num, String str2, m0<Object> m0Var) {
                a(num.intValue(), str2, m0Var);
                return b2.f124493a;
            }
        });
        return routeBuilder.e();
    }

    public static /* synthetic */ String l(kotlinx.serialization.g gVar, Map map, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = s0.z();
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return k(gVar, map, str);
    }

    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T> String m(@dl.d T route, @dl.d Map<String, ? extends m0<Object>> typeMap) {
        f0.p(route, "route");
        f0.p(typeMap, "typeMap");
        kotlinx.serialization.g gVarG = t.g(n0.d(route.getClass()));
        final Map<String, List<String>> mapI = new g(gVarG, typeMap).I(route);
        final RouteBuilder routeBuilder = new RouteBuilder(gVarG);
        g(gVarG, typeMap, new q<Integer, String, m0<Object>, b2>() { // from class: androidx.navigation.serialization.RouteSerializerKt$generateRouteWithArgs$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final void a(int i10, String argName, m0<Object> navType) {
                f0.p(argName, "argName");
                f0.p(navType, "navType");
                List<String> list = mapI.get(argName);
                f0.m(list);
                routeBuilder.c(i10, argName, navType, list);
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ b2 invoke(Integer num, String str, m0<Object> m0Var) {
                a(num.intValue(), str, m0Var);
                return b2.f124493a;
            }
        });
        return routeBuilder.e();
    }

    public static final boolean n(@dl.d kotlinx.serialization.descriptors.f fVar) {
        f0.p(fVar, "<this>");
        return f0.g(fVar.b(), kotlinx.serialization.descriptors.i.a.f130591a) && fVar.g() && fVar.f() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String o(String str, String str2, String str3, String str4) {
        return "Route " + str3 + " could not find any NavType for argument " + str + " of type " + str2 + " - typeMap received was " + str4;
    }
}
