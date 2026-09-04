package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.d2;

/* JADX INFO: compiled from: Scopes.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\u0012\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0013\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lkotlinx/coroutines/internal/k0;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/a;", "Lkotlin/coroutines/jvm/internal/c;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "", "state", "Lkotlin/b2;", "q0", "F1", "Lkotlin/coroutines/c;", "d", "Lkotlin/coroutines/c;", "uCont", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/c;", "callerFrame", "", "Z0", "()Z", "isScopedCoroutine", "Lkotlinx/coroutines/d2;", "K1", "()Lkotlinx/coroutines/d2;", "parent", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/c;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class k0<T> extends kotlinx.coroutines.a<T> implements kotlin.coroutines.jvm.internal.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final kotlin.coroutines.c<T> uCont;

    /* JADX WARN: Multi-variable type inference failed */
    public k0(@dl.d CoroutineContext coroutineContext, @dl.d kotlin.coroutines.c<? super T> cVar) {
        super(coroutineContext, true, true);
        this.uCont = cVar;
    }

    @Override // kotlinx.coroutines.a
    protected void F1(@dl.e Object obj) {
        kotlin.coroutines.c<T> cVar = this.uCont;
        cVar.resumeWith(kotlinx.coroutines.i0.a(obj, cVar));
    }

    @dl.e
    public final d2 K1() {
        kotlinx.coroutines.v vVarS0 = S0();
        if (vVarS0 != null) {
            return vVarS0.getParent();
        }
        return null;
    }

    @Override // kotlinx.coroutines.JobSupport
    protected final boolean Z0() {
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @dl.e
    public final kotlin.coroutines.jvm.internal.c getCallerFrame() {
        kotlin.coroutines.c<T> cVar = this.uCont;
        if (cVar instanceof kotlin.coroutines.jvm.internal.c) {
            return (kotlin.coroutines.jvm.internal.c) cVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @dl.e
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.JobSupport
    protected void q0(@dl.e Object obj) {
        m.g(IntrinsicsKt__IntrinsicsJvmKt.d(this.uCont), kotlinx.coroutines.i0.a(obj, this.uCont), null, 2, null);
    }
}
