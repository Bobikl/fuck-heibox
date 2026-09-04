package kotlin.reflect.jvm;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.g;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.r;
import kotlin.reflect.s;
import kotlin.u0;
import xh.h;

/* JADX INFO: compiled from: KTypesJvm.kt */
/* JADX INFO: loaded from: classes5.dex */
@h(name = "KTypesJvm")
public final class d {
    @dl.d
    public static final kotlin.reflect.d<?> a(@dl.d g gVar) {
        Object obj;
        kotlin.reflect.d<?> dVarB;
        f0.p(gVar, "<this>");
        if (gVar instanceof kotlin.reflect.d) {
            return (kotlin.reflect.d) gVar;
        }
        if (!(gVar instanceof s)) {
            throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + gVar);
        }
        List<r> upperBounds = ((s) gVar).getUpperBounds();
        Iterator<T> it = upperBounds.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            r rVar = (r) next;
            f0.n(rVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            f fVarD = ((KTypeImpl) rVar).j().O0().d();
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar = fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.d ? (kotlin.reflect.jvm.internal.impl.descriptors.d) fVarD : null;
            if ((dVar == null || dVar.b() == ClassKind.INTERFACE || dVar.b() == ClassKind.ANNOTATION_CLASS) ? false : true) {
                obj = next;
                break;
            }
        }
        r rVar2 = (r) obj;
        if (rVar2 == null) {
            rVar2 = (r) CollectionsKt___CollectionsKt.B2(upperBounds);
        }
        return (rVar2 == null || (dVarB = b(rVar2)) == null) ? n0.d(Object.class) : dVarB;
    }

    @dl.d
    public static final kotlin.reflect.d<?> b(@dl.d r rVar) {
        kotlin.reflect.d<?> dVarA;
        f0.p(rVar, "<this>");
        g gVarO = rVar.o();
        if (gVarO != null && (dVarA = a(gVarO)) != null) {
            return dVarA;
        }
        throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + rVar);
    }

    @u0(version = "1.1")
    public static /* synthetic */ void c(r rVar) {
    }
}
