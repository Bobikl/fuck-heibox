package kotlin.reflect.jvm.internal.impl.builtins.functions;

import dl.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.d1;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.storage.m;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.u;

/* JADX INFO: compiled from: BuiltInFictitiousFunctionClassFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements gi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final m f125361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final d0 f125362b;

    public a(@dl.d m storageManager, @dl.d d0 module) {
        f0.p(storageManager, "storageManager");
        f0.p(module, "module");
        this.f125361a = storageManager;
        this.f125362b = module;
    }

    @Override // gi.b
    public boolean a(@dl.d kotlin.reflect.jvm.internal.impl.name.c packageFqName, @dl.d f name) {
        f0.p(packageFqName, "packageFqName");
        f0.p(name, "name");
        String strB = name.b();
        f0.o(strB, "name.asString()");
        return (u.v2(strB, "Function", false, 2, null) || u.v2(strB, "KFunction", false, 2, null) || u.v2(strB, "SuspendFunction", false, 2, null) || u.v2(strB, "KSuspendFunction", false, 2, null)) && FunctionClassKind.Companion.c(strB, packageFqName) != null;
    }

    @Override // gi.b
    @e
    public kotlin.reflect.jvm.internal.impl.descriptors.d b(@dl.d kotlin.reflect.jvm.internal.impl.name.b classId) {
        f0.p(classId, "classId");
        if (classId.k() || classId.l()) {
            return null;
        }
        String strB = classId.i().b();
        f0.o(strB, "classId.relativeClassName.asString()");
        if (!StringsKt__StringsKt.W2(strB, "Function", false, 2, null)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.c cVarH = classId.h();
        f0.o(cVarH, "classId.packageFqName");
        FunctionClassKind.a.C1139a c1139aC = FunctionClassKind.Companion.c(strB, cVarH);
        if (c1139aC == null) {
            return null;
        }
        FunctionClassKind functionClassKindA = c1139aC.a();
        int iB = c1139aC.b();
        List<g0> listQ = this.f125362b.R(cVarH).Q();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQ) {
            if (obj instanceof kotlin.reflect.jvm.internal.impl.builtins.a) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof kotlin.reflect.jvm.internal.impl.builtins.e) {
                arrayList2.add(obj2);
            }
        }
        g0 g0Var = (kotlin.reflect.jvm.internal.impl.builtins.e) CollectionsKt___CollectionsKt.B2(arrayList2);
        if (g0Var == null) {
            g0Var = (kotlin.reflect.jvm.internal.impl.builtins.a) CollectionsKt___CollectionsKt.w2(arrayList);
        }
        return new b(this.f125361a, g0Var, functionClassKindA, iB);
    }

    @Override // gi.b
    @dl.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> c(@dl.d kotlin.reflect.jvm.internal.impl.name.c packageFqName) {
        f0.p(packageFqName, "packageFqName");
        return d1.k();
    }
}
