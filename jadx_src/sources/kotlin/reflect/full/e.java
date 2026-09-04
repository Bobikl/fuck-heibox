package kotlin.reflect.full;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.e1;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.reflect.jvm.internal.impl.types.z0;
import kotlin.reflect.r;
import kotlin.reflect.t;
import kotlin.u0;
import si.l;
import xh.h;

/* JADX INFO: compiled from: KClassifiers.kt */
/* JADX INFO: loaded from: classes5.dex */
@h(name = "KClassifiers")
public final class e {

    /* JADX INFO: compiled from: KClassifiers.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f125069a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f125069a = iArr;
        }
    }

    private static final j0 a(w0 w0Var, z0 z0Var, List<t> list, boolean z10) {
        l starProjectionImpl;
        List<y0> parameters = z0Var.getParameters();
        f0.o(parameters, "typeConstructor.parameters");
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            t tVar = (t) obj;
            KTypeImpl kTypeImpl = (KTypeImpl) tVar.g();
            d0 d0VarJ = kTypeImpl != null ? kTypeImpl.j() : null;
            KVariance kVarianceH = tVar.h();
            int i12 = kVarianceH == null ? -1 : a.f125069a[kVarianceH.ordinal()];
            if (i12 == -1) {
                y0 y0Var = parameters.get(i10);
                f0.o(y0Var, "parameters[index]");
                starProjectionImpl = new StarProjectionImpl(y0Var);
            } else if (i12 == 1) {
                Variance variance = Variance.INVARIANT;
                f0.m(d0VarJ);
                starProjectionImpl = new e1(variance, d0VarJ);
            } else if (i12 == 2) {
                Variance variance2 = Variance.IN_VARIANCE;
                f0.m(d0VarJ);
                starProjectionImpl = new e1(variance2, d0VarJ);
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Variance variance3 = Variance.OUT_VARIANCE;
                f0.m(d0VarJ);
                starProjectionImpl = new e1(variance3, d0VarJ);
            }
            arrayList.add(starProjectionImpl);
            i10 = i11;
        }
        return KotlinTypeFactory.l(w0Var, z0Var, arrayList, z10, null, 16, null);
    }

    @u0(version = "1.1")
    @dl.d
    public static final r b(@dl.d kotlin.reflect.g gVar, @dl.d List<t> arguments, boolean z10, @dl.d List<? extends Annotation> annotations) {
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarA;
        f0.p(gVar, "<this>");
        f0.p(arguments, "arguments");
        f0.p(annotations, "annotations");
        i iVar = gVar instanceof i ? (i) gVar : null;
        if (iVar == null || (fVarA = iVar.a()) == null) {
            throw new KotlinReflectionInternalError("Cannot create type for an unsupported classifier: " + gVar + " (" + gVar.getClass() + ')');
        }
        z0 z0VarR = fVarA.r();
        f0.o(z0VarR, "descriptor.typeConstructor");
        List<y0> parameters = z0VarR.getParameters();
        f0.o(parameters, "typeConstructor.parameters");
        if (parameters.size() == arguments.size()) {
            return new KTypeImpl(a(annotations.isEmpty() ? w0.f128193c.h() : w0.f128193c.h(), z0VarR, arguments, z10), null, 2, null);
        }
        throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + arguments.size() + " were provided.");
    }

    public static /* synthetic */ r c(kotlin.reflect.g gVar, List list, boolean z10, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = CollectionsKt__CollectionsKt.E();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            list2 = CollectionsKt__CollectionsKt.E();
        }
        return b(gVar, list, z10, list2);
    }

    @dl.d
    public static final r d(@dl.d kotlin.reflect.g gVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarA;
        f0.p(gVar, "<this>");
        i iVar = gVar instanceof i ? (i) gVar : null;
        if (iVar == null || (fVarA = iVar.a()) == null) {
            return c(gVar, null, false, null, 7, null);
        }
        List<y0> parameters = fVarA.r().getParameters();
        f0.o(parameters, "descriptor.typeConstructor.parameters");
        if (parameters.isEmpty()) {
            return c(gVar, null, false, null, 7, null);
        }
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(parameters, 10));
        for (y0 y0Var : parameters) {
            arrayList.add(t.f128326c.c());
        }
        return c(gVar, arrayList, false, null, 6, null);
    }

    @u0(version = "1.1")
    public static /* synthetic */ void e(kotlin.reflect.g gVar) {
    }
}
