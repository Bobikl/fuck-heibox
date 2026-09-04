package kotlinx.coroutines.flow.internal;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bH\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/flow/internal/n;", androidx.exifinterface.media.a.f23244d5, "Lkotlin/coroutines/c;", "Lkotlin/coroutines/jvm/internal/c;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/Result;", "result", "Lkotlin/b2;", "resumeWith", "(Ljava/lang/Object;)V", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "b", "Lkotlin/coroutines/c;", "uCont", "Lkotlin/coroutines/CoroutineContext;", ak.aF, "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/c;", "callerFrame", "<init>", "(Lkotlin/coroutines/c;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class n<T> implements kotlin.coroutines.c<T>, kotlin.coroutines.jvm.internal.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlin.coroutines.c<T> uCont;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final CoroutineContext context;

    /* JADX WARN: Multi-variable type inference failed */
    public n(@dl.d kotlin.coroutines.c<? super T> cVar, @dl.d CoroutineContext coroutineContext) {
        this.uCont = cVar;
        this.context = coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @dl.e
    public kotlin.coroutines.jvm.internal.c getCallerFrame() {
        kotlin.coroutines.c<T> cVar = this.uCont;
        if (cVar instanceof kotlin.coroutines.jvm.internal.c) {
            return (kotlin.coroutines.jvm.internal.c) cVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.c
    @dl.d
    public CoroutineContext getContext() {
        return this.context;
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @dl.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.c
    public void resumeWith(@dl.d Object result) {
        this.uCont.resumeWith(result);
    }
}
