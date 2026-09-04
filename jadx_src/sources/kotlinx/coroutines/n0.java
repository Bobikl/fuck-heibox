package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a%\u0010\f\u001a\u00020\u000b2\u001a\b\u0004\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\tH\u0086\b¨\u0006\r"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "", "exception", "Lkotlin/b2;", "b", "originalException", "thrownException", ak.aF, "Lkotlin/Function2;", "handler", "Lkotlinx/coroutines/l0;", ak.av, "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class n0 {

    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"kotlinx/coroutines/n0$a", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/l0;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "", "exception", "Lkotlin/b2;", "C", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a extends kotlin.coroutines.a implements l0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.p<CoroutineContext, Throwable, kotlin.b2> f130282c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(yh.p<? super CoroutineContext, ? super Throwable, kotlin.b2> pVar, l0.Companion companion) {
            super(companion);
            this.f130282c = pVar;
        }

        @Override // kotlinx.coroutines.l0
        public void C(@dl.d CoroutineContext coroutineContext, @dl.d Throwable th2) {
            this.f130282c.invoke(coroutineContext, th2);
        }
    }

    @dl.d
    public static final l0 a(@dl.d yh.p<? super CoroutineContext, ? super Throwable, kotlin.b2> pVar) {
        return new a(pVar, l0.INSTANCE);
    }

    @z1
    public static final void b(@dl.d CoroutineContext coroutineContext, @dl.d Throwable th2) {
        try {
            l0 l0Var = (l0) coroutineContext.f(l0.INSTANCE);
            if (l0Var != null) {
                l0Var.C(coroutineContext, th2);
            } else {
                m0.a(coroutineContext, th2);
            }
        } catch (Throwable th3) {
            m0.a(coroutineContext, c(th2, th3));
        }
    }

    @dl.d
    public static final Throwable c(@dl.d Throwable th2, @dl.d Throwable th3) throws IllegalAccessException, InvocationTargetException {
        if (th2 == th3) {
            return th2;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
        kotlin.o.a(runtimeException, th2);
        return runtimeException;
    }
}
