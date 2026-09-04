package kotlin.reflect.full;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.KParameter;
import kotlin.reflect.i;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.s;
import kotlin.t0;
import kotlin.u0;
import xh.h;

/* JADX INFO: compiled from: KCallables.kt */
/* JADX INFO: loaded from: classes5.dex */
@h(name = "KCallables")
public final class KCallables {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @u0(version = "1.3")
    @dl.e
    public static final <R> Object a(@dl.d kotlin.reflect.c<? extends R> cVar, @dl.d Object[] objArr, @dl.d kotlin.coroutines.c<? super R> cVar2) throws Throwable {
        KCallables$callSuspend$1 kCallables$callSuspend$1;
        if (cVar2 instanceof KCallables$callSuspend$1) {
            kCallables$callSuspend$1 = (KCallables$callSuspend$1) cVar2;
            int i10 = kCallables$callSuspend$1.f125054e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kCallables$callSuspend$1.f125054e = i10 - Integer.MIN_VALUE;
            } else {
                kCallables$callSuspend$1 = new KCallables$callSuspend$1(cVar2);
            }
        } else {
            kCallables$callSuspend$1 = new KCallables$callSuspend$1(cVar2);
        }
        Object objCall = kCallables$callSuspend$1.f125053d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = kCallables$callSuspend$1.f125054e;
        if (i11 == 0) {
            t0.n(objCall);
            if (!cVar.isSuspend()) {
                return cVar.call(Arrays.copyOf(objArr, objArr.length));
            }
            if (!(cVar instanceof i)) {
                throw new IllegalArgumentException("Cannot callSuspend on a property " + cVar + ": suspend properties are not supported yet");
            }
            kCallables$callSuspend$1.f125051b = cVar;
            kCallables$callSuspend$1.f125052c = objArr;
            kCallables$callSuspend$1.f125054e = 1;
            kotlin.jvm.internal.u0 u0Var = new kotlin.jvm.internal.u0(2);
            u0Var.b(objArr);
            u0Var.a(kCallables$callSuspend$1);
            objCall = cVar.call(u0Var.d(new Object[u0Var.c()]));
            if (objCall == kotlin.coroutines.intrinsics.b.h()) {
                kotlin.coroutines.jvm.internal.f.c(kCallables$callSuspend$1);
            }
            if (objCall == objH) {
                return objH;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (kotlin.reflect.c) kCallables$callSuspend$1.f125051b;
            t0.n(objCall);
        }
        return (!f0.g(cVar.getReturnType().o(), n0.d(b2.class)) || cVar.getReturnType().p()) ? objCall : b2.f124493a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @u0(version = "1.3")
    @dl.e
    public static final <R> Object b(@dl.d kotlin.reflect.c<? extends R> cVar, @dl.d Map<KParameter, ? extends Object> map, @dl.d kotlin.coroutines.c<? super R> cVar2) throws Throwable {
        KCallables$callSuspendBy$1 kCallables$callSuspendBy$1;
        if (cVar2 instanceof KCallables$callSuspendBy$1) {
            kCallables$callSuspendBy$1 = (KCallables$callSuspendBy$1) cVar2;
            int i10 = kCallables$callSuspendBy$1.f125059f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kCallables$callSuspendBy$1.f125059f = i10 - Integer.MIN_VALUE;
            } else {
                kCallables$callSuspendBy$1 = new KCallables$callSuspendBy$1(cVar2);
            }
        } else {
            kCallables$callSuspendBy$1 = new KCallables$callSuspendBy$1(cVar2);
        }
        Object objK = kCallables$callSuspendBy$1.f125058e;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = kCallables$callSuspendBy$1.f125059f;
        if (i11 == 0) {
            t0.n(objK);
            if (!cVar.isSuspend()) {
                return cVar.callBy(map);
            }
            if (!(cVar instanceof i)) {
                throw new IllegalArgumentException("Cannot callSuspendBy on a property " + cVar + ": suspend properties are not supported yet");
            }
            KCallableImpl<?> kCallableImplB = s.b(cVar);
            if (kCallableImplB == null) {
                throw new KotlinReflectionInternalError("This callable does not support a default call: " + cVar);
            }
            kCallables$callSuspendBy$1.f125055b = cVar;
            kCallables$callSuspendBy$1.f125056c = map;
            kCallables$callSuspendBy$1.f125057d = kCallableImplB;
            kCallables$callSuspendBy$1.f125059f = 1;
            objK = kCallableImplB.k(map, kCallables$callSuspendBy$1);
            if (objK == kotlin.coroutines.intrinsics.b.h()) {
                kotlin.coroutines.jvm.internal.f.c(kCallables$callSuspendBy$1);
            }
            if (objK == objH) {
                return objH;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (kotlin.reflect.c) kCallables$callSuspendBy$1.f125055b;
            t0.n(objK);
        }
        return (!f0.g(cVar.getReturnType().o(), n0.d(b2.class)) || cVar.getReturnType().p()) ? objK : b2.f124493a;
    }

    @u0(version = "1.1")
    @dl.e
    public static final KParameter c(@dl.d kotlin.reflect.c<?> cVar, @dl.d String name) {
        f0.p(cVar, "<this>");
        f0.p(name, "name");
        Object obj = null;
        boolean z10 = false;
        Object obj2 = null;
        for (Object obj3 : cVar.getParameters()) {
            if (f0.g(((KParameter) obj3).getName(), name)) {
                if (z10) {
                    return (KParameter) obj;
                }
                z10 = true;
                obj2 = obj3;
            }
        }
        if (z10) {
            obj = obj2;
        }
        return (KParameter) obj;
    }

    @dl.e
    public static final KParameter d(@dl.d kotlin.reflect.c<?> cVar) {
        f0.p(cVar, "<this>");
        Object obj = null;
        boolean z10 = false;
        Object obj2 = null;
        for (Object obj3 : cVar.getParameters()) {
            if (((KParameter) obj3).b() == KParameter.Kind.EXTENSION_RECEIVER) {
                if (z10) {
                    return (KParameter) obj;
                }
                z10 = true;
                obj2 = obj3;
            }
        }
        if (z10) {
            obj = obj2;
        }
        return (KParameter) obj;
    }

    @u0(version = "1.1")
    public static /* synthetic */ void e(kotlin.reflect.c cVar) {
    }

    @dl.e
    public static final KParameter f(@dl.d kotlin.reflect.c<?> cVar) {
        f0.p(cVar, "<this>");
        Object obj = null;
        boolean z10 = false;
        Object obj2 = null;
        for (Object obj3 : cVar.getParameters()) {
            if (((KParameter) obj3).b() == KParameter.Kind.INSTANCE) {
                if (z10) {
                    return (KParameter) obj;
                }
                z10 = true;
                obj2 = obj3;
            }
        }
        if (z10) {
            obj = obj2;
        }
        return (KParameter) obj;
    }

    @u0(version = "1.1")
    public static /* synthetic */ void g(kotlin.reflect.c cVar) {
    }

    @dl.d
    public static final List<KParameter> h(@dl.d kotlin.reflect.c<?> cVar) {
        f0.p(cVar, "<this>");
        List<KParameter> parameters = cVar.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((KParameter) obj).b() == KParameter.Kind.VALUE) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @u0(version = "1.1")
    public static /* synthetic */ void i(kotlin.reflect.c cVar) {
    }
}
