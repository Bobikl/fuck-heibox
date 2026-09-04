package kotlinx.coroutines.flow.internal;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.coroutines.g2;
import yh.p;

/* JADX INFO: compiled from: SafeCollector.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0010\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\"\u001a\u00020\f¢\u0006\u0004\b1\u00102J'\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\"\u0010\u0018\u001a\u00020\t2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\u001b\u0010\u001b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010!R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010)R\u0016\u0010-\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/f;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/c;", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "uCont", "value", "", "f", "(Lkotlin/coroutines/c;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "currentContext", "previousContext", ak.av, "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "Lkotlinx/coroutines/flow/internal/f;", "exception", RXScreenCaptureService.KEY_HEIGHT, "Ljava/lang/StackTraceElement;", "getStackTraceElement", "Lkotlin/Result;", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "b", "Lkotlinx/coroutines/flow/f;", "collector", ak.aF, "Lkotlin/coroutines/CoroutineContext;", "collectContext", "", "d", "I", "collectContextSize", "e", "lastEmissionContext", "Lkotlin/coroutines/c;", "completion", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/c;", "callerFrame", "getContext", "()Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "<init>", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class SafeCollector<T> extends ContinuationImpl implements kotlinx.coroutines.flow.f<T>, kotlin.coroutines.jvm.internal.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final kotlinx.coroutines.flow.f<T> collector;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final CoroutineContext collectContext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @xh.e
    public final int collectContextSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private CoroutineContext lastEmissionContext;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private kotlin.coroutines.c<? super b2> completion;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector(@dl.d kotlinx.coroutines.flow.f<? super T> fVar, @dl.d CoroutineContext coroutineContext) {
        super(j.f130079b, EmptyCoroutineContext.f124694b);
        this.collector = fVar;
        this.collectContext = coroutineContext;
        this.collectContextSize = ((Number) coroutineContext.g(0, new p<Integer, CoroutineContext.a, Integer>() { // from class: kotlinx.coroutines.flow.internal.SafeCollector$collectContextSize$1
            @dl.d
            public final Integer a(int i10, @dl.d CoroutineContext.a aVar) {
                return Integer.valueOf(i10 + 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, CoroutineContext.a aVar) {
                return a(num.intValue(), aVar);
            }
        })).intValue();
    }

    private final void a(CoroutineContext currentContext, CoroutineContext previousContext, T value) {
        if (previousContext instanceof f) {
            h((f) previousContext, value);
        }
        SafeCollector_commonKt.a(this, currentContext);
    }

    private final Object f(kotlin.coroutines.c<? super b2> uCont, T value) {
        CoroutineContext context = uCont.getContext();
        g2.z(context);
        CoroutineContext coroutineContext = this.lastEmissionContext;
        if (coroutineContext != context) {
            a(context, coroutineContext, value);
            this.lastEmissionContext = context;
        }
        this.completion = uCont;
        Object objInvoke = SafeCollectorKt.f130059a.invoke(this.collector, value, this);
        if (!f0.g(objInvoke, kotlin.coroutines.intrinsics.b.h())) {
            this.completion = null;
        }
        return objInvoke;
    }

    private final void h(f fVar, Object obj) {
        throw new IllegalStateException(StringsKt__IndentKt.p("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + fVar.e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // kotlinx.coroutines.flow.f
    @dl.e
    public Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        try {
            Object objF = f(cVar, t10);
            if (objF == kotlin.coroutines.intrinsics.b.h()) {
                kotlin.coroutines.jvm.internal.f.c(cVar);
            }
            return objF == kotlin.coroutines.intrinsics.b.h() ? objF : b2.f124493a;
        } catch (Throwable th2) {
            this.lastEmissionContext = new f(th2, cVar.getContext());
            throw th2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.c
    @dl.e
    public kotlin.coroutines.jvm.internal.c getCallerFrame() {
        kotlin.coroutines.c<? super b2> cVar = this.completion;
        if (cVar instanceof kotlin.coroutines.jvm.internal.c) {
            return (kotlin.coroutines.jvm.internal.c) cVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.c
    @dl.d
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.lastEmissionContext;
        return coroutineContext == null ? EmptyCoroutineContext.f124694b : coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.c
    @dl.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public Object invokeSuspend(@dl.d Object result) {
        Throwable thE = Result.e(result);
        if (thE != null) {
            this.lastEmissionContext = new f(thE, getContext());
        }
        kotlin.coroutines.c<? super b2> cVar = this.completion;
        if (cVar != null) {
            cVar.resumeWith(result);
        }
        return kotlin.coroutines.intrinsics.b.h();
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
