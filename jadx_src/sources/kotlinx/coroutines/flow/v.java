package kotlinx.coroutines.flow;

import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.o0;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a4\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a4\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\t\u0010\b\u001a-\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b\u001a6\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000\"\u001a\u0010\u0019\u001a\u00020\u00158\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u0012\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001c\u001a\u00020\u00158\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u0012\u0004\b\u001b\u0010\u0018¨\u0006\u001d"}, d2 = {androidx.exifinterface.media.a.f23244d5, "value", "Lkotlinx/coroutines/flow/j;", ak.av, "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/j;", "Lkotlin/Function1;", "function", "i", "(Lkotlinx/coroutines/flow/j;Lyh/l;)Ljava/lang/Object;", "e", "Lkotlin/b2;", RXScreenCaptureService.KEY_HEIGHT, "Lkotlinx/coroutines/flow/u;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/flow/e;", "d", "Lkotlinx/coroutines/internal/o0;", "Lkotlinx/coroutines/internal/o0;", "getNONE$annotations", "()V", "NONE", "b", "getPENDING$annotations", BBSLinkObj.REVIEW_STATE_PENDING, "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final o0 f130104a = new o0("NONE");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final o0 f130105b = new o0(BBSLinkObj.REVIEW_STATE_PENDING);

    @dl.d
    public static final <T> j<T> a(T t10) {
        if (t10 == null) {
            t10 = (T) kotlinx.coroutines.flow.internal.l.f130082a;
        }
        return new StateFlowImpl(t10);
    }

    @dl.d
    public static final <T> e<T> d(@dl.d u<? extends T> uVar, @dl.d CoroutineContext coroutineContext, int i10, @dl.d BufferOverflow bufferOverflow) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < 2) {
            z10 = true;
        }
        return ((z10 || i10 == -2) && bufferOverflow == BufferOverflow.DROP_OLDEST) ? uVar : o.e(uVar, coroutineContext, i10, bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    public static final <T> T e(@dl.d j<T> jVar, @dl.d yh.l<? super T, ? extends T> lVar) {
        ?? r10;
        do {
            r10 = (Object) jVar.getValue();
        } while (!jVar.compareAndSet(r10, lVar.invoke(r10)));
        return r10;
    }

    private static /* synthetic */ void f() {
    }

    private static /* synthetic */ void g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void h(@dl.d j<T> jVar, @dl.d yh.l<? super T, ? extends T> lVar) {
        a.a.a.a.d.p.d.c.d dVar;
        do {
            dVar = (Object) jVar.getValue();
        } while (!jVar.compareAndSet(dVar, lVar.invoke(dVar)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T i(@dl.d j<T> jVar, @dl.d yh.l<? super T, ? extends T> lVar) {
        a.a.a.a.d.p.d.c.d dVar;
        T tInvoke;
        do {
            dVar = (Object) jVar.getValue();
            tInvoke = lVar.invoke(dVar);
        } while (!jVar.compareAndSet(dVar, tInvoke));
        return tInvoke;
    }
}
