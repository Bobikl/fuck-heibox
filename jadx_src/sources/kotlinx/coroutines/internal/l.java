package kotlinx.coroutines.internal;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CompletedWithCancellation;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.b1;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.i3;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.o3;

/* JADX INFO: compiled from: DispatchedContinuation.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010;\u001a\u000208\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\bM\u0010NJ\u0017\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010!\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"JH\u0010'\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2%\b\b\u0010&\u001a\u001f\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\r\u0018\u00010#H\u0086\bø\u0001\u0000¢\u0006\u0004\b'\u0010(J!\u0010*\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u0016H\u0010¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010\u001cH\u0086\b¢\u0006\u0004\b-\u0010.J!\u0010/\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\bø\u0001\u0000¢\u0006\u0004\b/\u0010\"J\u001f\u00103\u001a\u00020\r2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00028\u0000H\u0000¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107R\u0014\u0010;\u001a\u0002088\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001e\u0010A\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b>\u0010?\u0012\u0004\b@\u0010\u000fR\u0014\u0010B\u001a\u00020\u001c8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010?R\u001a\u0010D\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u0013R\u0014\u00101\u001a\u0002008\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bE\u0010FR\u001c\u0010I\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006O"}, d2 = {"Lkotlinx/coroutines/internal/l;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/b1;", "Lkotlin/coroutines/jvm/internal/c;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/c;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "o", "()Z", "Lkotlin/b2;", "i", "()V", "q", "Lkotlinx/coroutines/q;", "k", "()Lkotlinx/coroutines/q;", "Lkotlinx/coroutines/p;", "continuation", "", ak.aG, "(Lkotlinx/coroutines/p;)Ljava/lang/Throwable;", "cause", "p", "(Ljava/lang/Throwable;)Z", "", RXScreenCaptureService.KEY_HEIGHT, "()Ljava/lang/Object;", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "Lkotlin/m0;", "name", "onCancellation", "r", "(Ljava/lang/Object;Lyh/l;)V", "takenState", ak.aF, "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", ak.aB, "(Ljava/lang/Object;)Z", "t", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "value", "l", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/CoroutineDispatcher;", "e", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "f", "Lkotlin/coroutines/c;", "g", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "_state", "countOrElement", "m", "reusableCancellableContinuation", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/c;", "callerFrame", "d", "()Lkotlin/coroutines/c;", "delegate", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/c;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class l<T> extends b1<T> implements kotlin.coroutines.jvm.internal.c, kotlin.coroutines.c<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f130173i = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_reusableCancellableContinuation");

    @dl.d
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final CoroutineDispatcher dispatcher;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final kotlin.coroutines.c<T> continuation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    @xh.e
    public Object _state;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final Object countOrElement;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@dl.d CoroutineDispatcher coroutineDispatcher, @dl.d kotlin.coroutines.c<? super T> cVar) {
        super(-1);
        this.dispatcher = coroutineDispatcher;
        this.continuation = cVar;
        this._state = m.f130180a;
        this.countOrElement = ThreadContextKt.b(getCom.umeng.analytics.pro.d.R java.lang.String());
        this._reusableCancellableContinuation = null;
    }

    private final kotlinx.coroutines.q<?> m() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof kotlinx.coroutines.q) {
            return (kotlinx.coroutines.q) obj;
        }
        return null;
    }

    public static /* synthetic */ void n() {
    }

    @Override // kotlinx.coroutines.b1
    public void c(@dl.e Object takenState, @dl.d Throwable cause) {
        if (takenState instanceof CompletedWithCancellation) {
            ((CompletedWithCancellation) takenState).onCancellation.invoke(cause);
        }
    }

    @Override // kotlinx.coroutines.b1
    @dl.d
    public kotlin.coroutines.c<T> d() {
        return this;
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @dl.e
    public kotlin.coroutines.jvm.internal.c getCallerFrame() {
        kotlin.coroutines.c<T> cVar = this.continuation;
        if (cVar instanceof kotlin.coroutines.jvm.internal.c) {
            return (kotlin.coroutines.jvm.internal.c) cVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.c
    @dl.d
    /* JADX INFO: renamed from: getContext */
    public CoroutineContext getCom.umeng.analytics.pro.d.R java.lang.String() {
        return this.continuation.getCom.umeng.analytics.pro.d.R java.lang.String();
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @dl.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.b1
    @dl.e
    public Object h() {
        Object obj = this._state;
        this._state = m.f130180a;
        return obj;
    }

    public final void i() {
        while (this._reusableCancellableContinuation == m.f130181b) {
        }
    }

    @dl.e
    public final kotlinx.coroutines.q<T> k() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = m.f130181b;
                return null;
            }
            if (obj instanceof kotlinx.coroutines.q) {
                if (androidx.concurrent.futures.a.a(f130173i, this, obj, m.f130181b)) {
                    return (kotlinx.coroutines.q) obj;
                }
            } else if (obj != m.f130181b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void l(@dl.d CoroutineContext context, T value) {
        this._state = value;
        this.resumeMode = 1;
        this.dispatcher.R(context, this);
    }

    public final boolean o() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean p(@dl.d Throwable cause) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            o0 o0Var = m.f130181b;
            if (kotlin.jvm.internal.f0.g(obj, o0Var)) {
                if (androidx.concurrent.futures.a.a(f130173i, this, o0Var, cause)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.a.a(f130173i, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void q() {
        i();
        kotlinx.coroutines.q<?> qVarM = m();
        if (qVarM != null) {
            qVarM.p();
        }
    }

    public final void r(@dl.d Object result, @dl.e yh.l<? super Throwable, b2> onCancellation) {
        boolean z10;
        Object objC = kotlinx.coroutines.i0.c(result, onCancellation);
        if (this.dispatcher.V(getCom.umeng.analytics.pro.d.R java.lang.String())) {
            this._state = objC;
            this.resumeMode = 1;
            this.dispatcher.O(getCom.umeng.analytics.pro.d.R java.lang.String(), this);
            return;
        }
        l1 l1VarB = i3.f130113a.b();
        if (l1VarB.B0()) {
            this._state = objC;
            this.resumeMode = 1;
            l1VarB.u0(this);
            return;
        }
        l1VarB.w0(true);
        try {
            d2 d2Var = (d2) getCom.umeng.analytics.pro.d.R java.lang.String().f(d2.INSTANCE);
            if (d2Var == null || d2Var.isActive()) {
                z10 = false;
            } else {
                CancellationException cancellationExceptionZ = d2Var.Z();
                c(objC, cancellationExceptionZ);
                Result.a aVar = Result.f124476c;
                resumeWith(Result.b(kotlin.t0.a(cancellationExceptionZ)));
                z10 = true;
            }
            if (!z10) {
                kotlin.coroutines.c<T> cVar = this.continuation;
                Object obj = this.countOrElement;
                CoroutineContext context = cVar.getCom.umeng.analytics.pro.d.R java.lang.String();
                Object objC2 = ThreadContextKt.c(context, obj);
                o3<?> o3VarG = objC2 != ThreadContextKt.f130141a ? CoroutineContextKt.g(cVar, context, objC2) : null;
                try {
                    this.continuation.resumeWith(result);
                    b2 b2Var = b2.f124493a;
                    kotlin.jvm.internal.c0.d(1);
                    if (o3VarG == null || o3VarG.L1()) {
                        ThreadContextKt.a(context, objC2);
                    }
                    kotlin.jvm.internal.c0.c(1);
                } finally {
                    kotlin.jvm.internal.c0.d(1);
                    if (o3VarG == null || o3VarG.L1()) {
                        ThreadContextKt.a(context, objC2);
                    }
                    kotlin.jvm.internal.c0.c(1);
                }
            }
            while (l1VarB.E0()) {
            }
            kotlin.jvm.internal.c0.d(1);
        } catch (Throwable th2) {
            try {
                g(th2, null);
                kotlin.jvm.internal.c0.d(1);
            } finally {
                kotlin.jvm.internal.c0.d(1);
                l1VarB.p0(true);
                kotlin.jvm.internal.c0.c(1);
            }
        }
    }

    @Override // kotlin.coroutines.c
    public void resumeWith(@dl.d Object result) {
        CoroutineContext context = this.continuation.getCom.umeng.analytics.pro.d.R java.lang.String();
        Object objD = kotlinx.coroutines.i0.d(result, null, 1, null);
        if (this.dispatcher.V(context)) {
            this._state = objD;
            this.resumeMode = 0;
            this.dispatcher.O(context, this);
            return;
        }
        l1 l1VarB = i3.f130113a.b();
        if (l1VarB.B0()) {
            this._state = objD;
            this.resumeMode = 0;
            l1VarB.u0(this);
            return;
        }
        l1VarB.w0(true);
        try {
            CoroutineContext context2 = getCom.umeng.analytics.pro.d.R java.lang.String();
            Object objC = ThreadContextKt.c(context2, this.countOrElement);
            try {
                this.continuation.resumeWith(result);
                b2 b2Var = b2.f124493a;
                ThreadContextKt.a(context2, objC);
                while (l1VarB.E0()) {
                }
            } catch (Throwable th2) {
                ThreadContextKt.a(context2, objC);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                g(th3, null);
            } finally {
                l1VarB.p0(true);
            }
        }
    }

    public final boolean s(@dl.e Object state) {
        d2 d2Var = (d2) getCom.umeng.analytics.pro.d.R java.lang.String().f(d2.INSTANCE);
        if (d2Var == null || d2Var.isActive()) {
            return false;
        }
        CancellationException cancellationExceptionZ = d2Var.Z();
        c(state, cancellationExceptionZ);
        Result.a aVar = Result.f124476c;
        resumeWith(Result.b(kotlin.t0.a(cancellationExceptionZ)));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0029 A[DONT_GENERATE] */
    public final void t(@dl.d Object result) {
        kotlin.coroutines.c<T> cVar = this.continuation;
        Object obj = this.countOrElement;
        CoroutineContext context = cVar.getCom.umeng.analytics.pro.d.R java.lang.String();
        Object objC = ThreadContextKt.c(context, obj);
        o3<?> o3VarG = objC != ThreadContextKt.f130141a ? CoroutineContextKt.g(cVar, context, objC) : null;
        try {
            this.continuation.resumeWith(result);
            b2 b2Var = b2.f124493a;
        } finally {
            kotlin.jvm.internal.c0.d(1);
            if (o3VarG == null || o3VarG.L1()) {
                ThreadContextKt.a(context, objC);
            }
            kotlin.jvm.internal.c0.c(1);
        }
    }

    @dl.d
    public String toString() {
        return "DispatchedContinuation[" + this.dispatcher + ", " + kotlinx.coroutines.t0.c(this.continuation) + ']';
    }

    @dl.e
    public final Throwable u(@dl.d kotlinx.coroutines.p<?> continuation) {
        o0 o0Var;
        do {
            Object obj = this._reusableCancellableContinuation;
            o0Var = m.f130181b;
            if (obj != o0Var) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.a.a(f130173i, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.a.a(f130173i, this, o0Var, continuation));
        return null;
    }
}
