package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.l;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.v;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.m;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.c1;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.reflect.jvm.internal.impl.types.z0;

/* JADX INFO: compiled from: suspendFunctionTypes.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final v f125470a;

    static {
        l lVar = new l(kotlin.reflect.jvm.internal.impl.types.error.h.f128123a.i(), h.f125404m);
        ClassKind classKind = ClassKind.INTERFACE;
        kotlin.reflect.jvm.internal.impl.name.f fVarG = h.f125407p.g();
        t0 t0Var = t0.f125942a;
        m mVar = LockBasedStorageManager.f127923e;
        v vVar = new v(lVar, classKind, false, false, fVarG, t0Var, mVar);
        vVar.N0(Modality.ABSTRACT);
        vVar.P0(r.f125868e);
        vVar.O0(s.k(g0.S0(vVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b(), false, Variance.IN_VARIANCE, kotlin.reflect.jvm.internal.impl.name.f.f(androidx.exifinterface.media.a.f23244d5), 0, mVar)));
        vVar.L0();
        f125470a = vVar;
    }

    @dl.d
    public static final j0 a(@dl.d d0 suspendFunType) {
        f0.p(suspendFunType, "suspendFunType");
        f.q(suspendFunType);
        g gVarI = TypeUtilsKt.i(suspendFunType);
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations = suspendFunType.getAnnotations();
        d0 d0VarJ = f.j(suspendFunType);
        List<d0> listE = f.e(suspendFunType);
        List<c1> listL = f.l(suspendFunType);
        ArrayList arrayList = new ArrayList(t.Y(listL, 10));
        Iterator<T> it = listL.iterator();
        while (it.hasNext()) {
            arrayList.add(((c1) it.next()).getType());
        }
        w0 w0VarH = w0.f128193c.h();
        z0 z0VarR = f125470a.r();
        f0.o(z0VarR, "FAKE_CONTINUATION_CLASS_DESCRIPTOR.typeConstructor");
        List listZ4 = CollectionsKt___CollectionsKt.z4(arrayList, KotlinTypeFactory.l(w0VarH, z0VarR, s.k(TypeUtilsKt.a(f.k(suspendFunType))), false, null, 16, null));
        j0 j0VarI = TypeUtilsKt.i(suspendFunType).I();
        f0.o(j0VarI, "suspendFunType.builtIns.nullableAnyType");
        return f.b(gVarI, annotations, d0VarJ, listE, listZ4, null, j0VarI, (128 & 128) != 0 ? false : false).V0(suspendFunType.P0());
    }
}
