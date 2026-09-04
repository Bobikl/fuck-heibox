package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: compiled from: Yield.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, d2 = {"Lkotlin/b2;", ak.av, "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class r3 {
    @dl.e
    public static final Object a(@dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
        Object objH;
        CoroutineContext context = cVar.getCom.umeng.analytics.pro.d.R java.lang.String();
        g2.z(context);
        kotlin.coroutines.c cVarD = IntrinsicsKt__IntrinsicsJvmKt.d(cVar);
        kotlinx.coroutines.internal.l lVar = cVarD instanceof kotlinx.coroutines.internal.l ? (kotlinx.coroutines.internal.l) cVarD : null;
        if (lVar == null) {
            objH = kotlin.b2.f124493a;
        } else {
            if (lVar.dispatcher.V(context)) {
                lVar.l(context, kotlin.b2.f124493a);
            } else {
                q3 q3Var = new q3();
                CoroutineContext coroutineContextI = context.I(q3Var);
                kotlin.b2 b2Var = kotlin.b2.f124493a;
                lVar.l(coroutineContextI, b2Var);
                objH = (!q3Var.dispatcherWasUnconfined || kotlinx.coroutines.internal.m.h(lVar)) ? kotlin.coroutines.intrinsics.b.h() : b2Var;
            }
            objH = kotlin.coroutines.intrinsics.b.h();
        }
        if (objH == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objH == kotlin.coroutines.intrinsics.b.h() ? objH : kotlin.b2.f124493a;
    }
}
