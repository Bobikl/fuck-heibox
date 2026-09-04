package kotlinx.coroutines.flow.internal;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.ThreadContextKt;
import yh.p;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/flow/internal/UndispatchedContextCollector;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/coroutines/CoroutineContext;", "emitContext", "", ak.aF, "Ljava/lang/Object;", "countOrElement", "downstream", "<init>", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class UndispatchedContextCollector<T> implements kotlinx.coroutines.flow.f<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final CoroutineContext emitContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object countOrElement;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final p<T, kotlin.coroutines.c<? super b2>, Object> f130068d;

    public UndispatchedContextCollector(@dl.d kotlinx.coroutines.flow.f<? super T> fVar, @dl.d CoroutineContext coroutineContext) {
        this.emitContext = coroutineContext;
        this.countOrElement = ThreadContextKt.b(coroutineContext);
        this.f130068d = new UndispatchedContextCollector$emitRef$1(fVar, null);
    }

    @Override // kotlinx.coroutines.flow.f
    @dl.e
    public Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objC = d.c(this.emitContext, t10, this.countOrElement, this.f130068d, cVar);
        return objC == kotlin.coroutines.intrinsics.b.h() ? objC : b2.f124493a;
    }
}
