package kotlinx.coroutines;

import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes5.dex */
@z1
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH&J$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/y0;", "", "", "time", "Lkotlin/b2;", "N", "(JLkotlin/coroutines/c;)Ljava/lang/Object;", "timeMillis", "Lkotlinx/coroutines/p;", "continuation", "o", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "Lkotlinx/coroutines/h1;", "r", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface y0 {

    /* JADX INFO: compiled from: Delay.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        @kotlin.k(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        @dl.e
        public static Object a(@dl.d y0 y0Var, long j10, @dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
            if (j10 <= 0) {
                return kotlin.b2.f124493a;
            }
            q qVar = new q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
            qVar.F0();
            y0Var.o(j10, qVar);
            Object objT = qVar.t();
            if (objT == kotlin.coroutines.intrinsics.b.h()) {
                kotlin.coroutines.jvm.internal.f.c(cVar);
            }
            return objT == kotlin.coroutines.intrinsics.b.h() ? objT : kotlin.b2.f124493a;
        }

        @dl.d
        public static h1 b(@dl.d y0 y0Var, long j10, @dl.d Runnable runnable, @dl.d CoroutineContext coroutineContext) {
            return v0.a().r(j10, runnable, coroutineContext);
        }
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @dl.e
    Object N(long j10, @dl.d kotlin.coroutines.c<? super kotlin.b2> cVar);

    void o(long j10, @dl.d p<? super kotlin.b2> pVar);

    @dl.d
    h1 r(long timeMillis, @dl.d Runnable block, @dl.d CoroutineContext context);
}
