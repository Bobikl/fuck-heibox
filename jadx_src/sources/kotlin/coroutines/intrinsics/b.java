package kotlin.coroutines.intrinsics;

import dl.d;
import kotlin.NotImplementedError;
import kotlin.coroutines.c;
import kotlin.u0;
import sh.f;
import yh.l;

/* JADX INFO: compiled from: Intrinsics.kt */
/* JADX INFO: loaded from: classes5.dex */
public class b extends IntrinsicsKt__IntrinsicsJvmKt {
    @d
    public static final Object h() {
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @u0(version = "1.3")
    public static /* synthetic */ void i() {
    }

    @u0(version = "1.3")
    @f
    private static final <T> Object j(l<? super c<? super T>, ? extends Object> lVar, c<? super T> cVar) {
        throw new NotImplementedError("Implementation of suspendCoroutineUninterceptedOrReturn is intrinsic");
    }
}
