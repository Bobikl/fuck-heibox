package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.b0;
import kotlin.reflect.jvm.internal.impl.types.c1;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.e0;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.i1;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.n0;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.reflect.jvm.internal.impl.types.x0;
import kotlin.reflect.jvm.internal.impl.types.y;
import kotlin.reflect.jvm.internal.impl.types.z0;

/* JADX INFO: compiled from: typeEnhancement.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.b f126385a;

    /* JADX INFO: compiled from: typeEnhancement.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.e
        private final d0 f126386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f126387b;

        public a(@dl.e d0 d0Var, int i10) {
            this.f126386a = d0Var;
            this.f126387b = i10;
        }

        public final int a() {
            return this.f126387b;
        }

        @dl.e
        public final d0 b() {
            return this.f126386a;
        }
    }

    /* JADX INFO: compiled from: typeEnhancement.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.e
        private final j0 f126388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f126389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f126390c;

        public b(@dl.e j0 j0Var, int i10, boolean z10) {
            this.f126388a = j0Var;
            this.f126389b = i10;
            this.f126390c = z10;
        }

        public final boolean a() {
            return this.f126390c;
        }

        public final int b() {
            return this.f126389b;
        }

        @dl.e
        public final j0 c() {
            return this.f126388a;
        }
    }

    public c(@dl.d kotlin.reflect.jvm.internal.impl.load.java.lazy.b javaResolverSettings) {
        f0.p(javaResolverSettings, "javaResolverSettings");
        this.f126385a = javaResolverSettings;
    }

    private final b b(j0 j0Var, yh.l<? super Integer, d> lVar, int i10, TypeComponentPosition typeComponentPosition, boolean z10, boolean z11) {
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD;
        z0 z0VarO0;
        boolean z12;
        boolean z13;
        a aVar;
        c1 c1VarS;
        yh.l<? super Integer, d> lVar2 = lVar;
        boolean zA = j.a(typeComponentPosition);
        boolean z14 = (z11 && z10) ? false : true;
        d0 d0Var = null;
        if ((zA || !j0Var.M0().isEmpty()) && (fVarD = j0Var.O0().d()) != null) {
            d dVarInvoke = lVar2.invoke(Integer.valueOf(i10));
            kotlin.reflect.jvm.internal.impl.descriptors.f fVarF = l.f(fVarD, dVarInvoke, typeComponentPosition);
            Boolean boolH = l.h(dVarInvoke, typeComponentPosition);
            if (fVarF == null || (z0VarO0 = fVarF.r()) == null) {
                z0VarO0 = j0Var.O0();
            }
            z0 z0Var = z0VarO0;
            f0.o(z0Var, "enhancedClassifier?.typeConstructor ?: constructor");
            int iA = i10 + 1;
            List<c1> listM0 = j0Var.M0();
            List<y0> parameters = z0Var.getParameters();
            f0.o(parameters, "typeConstructor.parameters");
            Iterator<T> it = listM0.iterator();
            Iterator<T> it2 = parameters.iterator();
            ArrayList arrayList = new ArrayList(Math.min(t.Y(listM0, 10), t.Y(parameters, 10)));
            while (it.hasNext() && it2.hasNext()) {
                Object next = it.next();
                y0 y0Var = (y0) it2.next();
                c1 c1Var = (c1) next;
                if (z14) {
                    z13 = z14;
                    if (!c1Var.b()) {
                        aVar = d(c1Var.getType().R0(), lVar2, iA, z11);
                    } else if (lVar2.invoke(Integer.valueOf(iA)).d() == NullabilityQualifier.FORCE_FLEXIBILITY) {
                        l1 l1VarR0 = c1Var.getType().R0();
                        aVar = new a(KotlinTypeFactory.d(b0.c(l1VarR0).V0(false), b0.d(l1VarR0).V0(true)), 1);
                    } else {
                        aVar = new a(null, 1);
                    }
                } else {
                    z13 = z14;
                    aVar = new a(d0Var, 0);
                }
                iA += aVar.a();
                if (aVar.b() != null) {
                    d0 d0VarB = aVar.b();
                    Variance varianceC = c1Var.c();
                    f0.o(varianceC, "arg.projectionKind");
                    c1VarS = TypeUtilsKt.f(d0VarB, varianceC, y0Var);
                } else if (fVarF == null || c1Var.b()) {
                    c1VarS = fVarF != null ? i1.s(y0Var) : null;
                } else {
                    d0 type = c1Var.getType();
                    f0.o(type, "arg.type");
                    Variance varianceC2 = c1Var.c();
                    f0.o(varianceC2, "arg.projectionKind");
                    c1VarS = TypeUtilsKt.f(type, varianceC2, y0Var);
                }
                arrayList.add(c1VarS);
                lVar2 = lVar;
                z14 = z13;
                d0Var = null;
            }
            int i11 = iA - i10;
            if (fVarF == null && boolH == null) {
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z12 = true;
                            break;
                        }
                        if (!(((c1) it3.next()) == null)) {
                            z12 = false;
                            break;
                        }
                    }
                } else {
                    z12 = true;
                    break;
                }
                if (z12) {
                    return new b(null, i11, false);
                }
            }
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.e[] eVarArr = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.e[3];
            eVarArr[0] = j0Var.getAnnotations();
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.b bVar = l.f126416b;
            if (!(fVarF != null)) {
                bVar = null;
            }
            eVarArr[1] = bVar;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVarG = l.g();
            if (!(boolH != null)) {
                eVarG = null;
            }
            eVarArr[2] = eVarG;
            w0 w0VarB = x0.b(l.e(CollectionsKt__CollectionsKt.N(eVarArr)));
            List<c1> listM1 = j0Var.M0();
            Iterator it4 = arrayList.iterator();
            Iterator<T> it5 = listM1.iterator();
            ArrayList arrayList2 = new ArrayList(Math.min(t.Y(arrayList, 10), t.Y(listM1, 10)));
            while (it4.hasNext() && it5.hasNext()) {
                Object next2 = it4.next();
                c1 c1Var2 = (c1) it5.next();
                c1 c1Var3 = (c1) next2;
                if (c1Var3 != null) {
                    c1Var2 = c1Var3;
                }
                arrayList2.add(c1Var2);
            }
            j0 j0VarL = KotlinTypeFactory.l(w0VarB, z0Var, arrayList2, boolH != null ? boolH.booleanValue() : j0Var.P0(), null, 16, null);
            if (dVarInvoke.b()) {
                j0VarL = e(j0VarL);
            }
            return new b(j0VarL, i11, boolH != null && dVarInvoke.e());
        }
        return new b(null, 1, false);
    }

    static /* synthetic */ b c(c cVar, j0 j0Var, yh.l lVar, int i10, TypeComponentPosition typeComponentPosition, boolean z10, boolean z11, int i11, Object obj) {
        return cVar.b(j0Var, lVar, i10, typeComponentPosition, (i11 & 8) != 0 ? false : z10, (i11 & 16) != 0 ? false : z11);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0098  */
    private final a d(l1 l1Var, yh.l<? super Integer, d> lVar, int i10, boolean z10) {
        d0 d0VarC;
        d0 d0VarD = null;
        if (e0.a(l1Var)) {
            return new a(null, 1);
        }
        if (!(l1Var instanceof y)) {
            if (!(l1Var instanceof j0)) {
                throw new NoWhenBranchMatchedException();
            }
            b bVarC = c(this, (j0) l1Var, lVar, i10, TypeComponentPosition.INFLEXIBLE, false, z10, 8, null);
            return new a(bVarC.a() ? k1.d(l1Var, bVarC.c()) : bVarC.c(), bVarC.b());
        }
        boolean z11 = l1Var instanceof i0;
        y yVar = (y) l1Var;
        b bVarB = b(yVar.W0(), lVar, i10, TypeComponentPosition.FLEXIBLE_LOWER, z11, z10);
        b bVarB2 = b(yVar.X0(), lVar, i10, TypeComponentPosition.FLEXIBLE_UPPER, z11, z10);
        bVarB.b();
        bVarB2.b();
        if (bVarB.c() != null || bVarB2.c() != null) {
            if (bVarB.a() || bVarB2.a()) {
                j0 j0VarC = bVarB2.c();
                if (j0VarC == null) {
                    d0VarC = bVarB.c();
                    f0.m(d0VarC);
                } else {
                    j0 j0VarC2 = bVarB.c();
                    if (j0VarC2 == null) {
                        j0VarC2 = j0VarC;
                    }
                    d0VarC = KotlinTypeFactory.d(j0VarC2, j0VarC);
                    if (d0VarC == null) {
                        d0VarC = bVarB.c();
                        f0.m(d0VarC);
                    }
                }
                d0VarD = k1.d(l1Var, d0VarC);
            } else if (z11) {
                j0 j0VarC3 = bVarB.c();
                if (j0VarC3 == null) {
                    j0VarC3 = yVar.W0();
                }
                j0 j0VarC4 = bVarB2.c();
                if (j0VarC4 == null) {
                    j0VarC4 = yVar.X0();
                }
                d0VarD = new RawTypeImpl(j0VarC3, j0VarC4);
            } else {
                j0 j0VarC5 = bVarB.c();
                if (j0VarC5 == null) {
                    j0VarC5 = yVar.W0();
                }
                j0 j0VarC6 = bVarB2.c();
                if (j0VarC6 == null) {
                    j0VarC6 = yVar.X0();
                }
                d0VarD = KotlinTypeFactory.d(j0VarC5, j0VarC6);
            }
        }
        return new a(d0VarD, bVarB.b());
    }

    private final j0 e(j0 j0Var) {
        return this.f126385a.a() ? n0.h(j0Var, true) : new e(j0Var);
    }

    @dl.e
    public final d0 a(@dl.d d0 d0Var, @dl.d yh.l<? super Integer, d> qualifiers, boolean z10) {
        f0.p(d0Var, "<this>");
        f0.p(qualifiers, "qualifiers");
        return d(d0Var.R0(), qualifiers, 0, z10).b();
    }
}
