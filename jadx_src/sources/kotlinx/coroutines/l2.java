package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\n\u001a\u00020\t\u0012'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b¢\u0006\u0002\b\u000eø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0004\u001a\u00020\u0003H\u0014R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/l2;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/x0;", "Lkotlin/b2;", "o1", "Lkotlin/coroutines/c;", "d", "Lkotlin/coroutines/c;", "continuation", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Lkotlin/Function2;", "Lkotlinx/coroutines/q0;", "", "Lkotlin/t;", "block", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lyh/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class l2<T> extends x0<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlin.coroutines.c<kotlin.b2> continuation;

    public l2(@dl.d CoroutineContext coroutineContext, @dl.d yh.p<? super q0, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar) {
        super(coroutineContext, false);
        this.continuation = IntrinsicsKt__IntrinsicsJvmKt.c(pVar, this, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    protected void o1() throws Throwable {
        bj.a.c(this.continuation, this);
    }
}
