package kotlinx.coroutines;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
@Metadata(bv = {}, d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005B\u001f\u0012\f\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000q\u0012\u0006\u0010-\u001a\u00020'¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0010\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0082\b¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0017\u001a\u00020\u000e2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u00152\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\bJ\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJB\u0010\"\u001a\u00020\u000e2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u00152\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J8\u0010%\u001a\u00020$2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u0015H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*JZ\u00100\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010 2\u0006\u0010-\u001a\u00020'2#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00122\b\u0010/\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b0\u00101JH\u00102\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010 2\u0006\u0010-\u001a\u00020'2%\b\u0002\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0002¢\u0006\u0004\b2\u00103JJ\u00105\u001a\u0004\u0018\u0001042\b\u0010,\u001a\u0004\u0018\u00010 2\b\u0010/\u001a\u0004\u0018\u00010 2#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0002¢\u0006\u0004\b5\u00106J\u0019\u00108\u001a\u0002072\b\u0010,\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u000eH\u0002¢\u0006\u0004\b:\u0010\u001fJ\u000f\u0010;\u001a\u00020\u000eH\u0016¢\u0006\u0004\b;\u0010\u001fJ\u000f\u0010<\u001a\u00020\u0006H\u0001¢\u0006\u0004\b<\u0010\bJ\u0017\u0010?\u001a\n\u0018\u00010=j\u0004\u0018\u0001`>H\u0016¢\u0006\u0004\b?\u0010@J\u0011\u0010A\u001a\u0004\u0018\u00010 H\u0010¢\u0006\u0004\bA\u0010BJ!\u0010D\u001a\u00020\u000e2\b\u0010C\u001a\u0004\u0018\u00010 2\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\bD\u0010EJ\u0019\u0010F\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\bF\u0010\fJ\u0017\u0010G\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020$2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bI\u0010JJ8\u0010K\u001a\u00020\u000e2!\u0010.\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\bK\u0010\u0018J\u0017\u0010N\u001a\u00020\t2\u0006\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bN\u0010OJ\u0011\u0010P\u001a\u0004\u0018\u00010 H\u0001¢\u0006\u0004\bP\u0010BJ \u0010S\u001a\u00020\u000e2\f\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000QH\u0016ø\u0001\u0000¢\u0006\u0004\bS\u0010TJ<\u0010V\u001a\u00020\u000e2\u0006\u0010U\u001a\u00028\u00002#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0016¢\u0006\u0004\bV\u0010WJ8\u0010X\u001a\u00020\u000e2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u0015H\u0016¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u000eH\u0000¢\u0006\u0004\bZ\u0010\u001fJ#\u0010[\u001a\u0004\u0018\u00010 2\u0006\u0010U\u001a\u00028\u00002\b\u0010/\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b[\u0010\\JH\u0010]\u001a\u0004\u0018\u00010 2\u0006\u0010U\u001a\u00028\u00002\b\u0010/\u001a\u0004\u0018\u00010 2#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0016¢\u0006\u0004\b]\u0010^J\u0019\u0010`\u001a\u0004\u0018\u00010 2\u0006\u0010_\u001a\u00020\tH\u0016¢\u0006\u0004\b`\u0010aJ\u0017\u0010c\u001a\u00020\u000e2\u0006\u0010b\u001a\u00020 H\u0016¢\u0006\u0004\bc\u0010TJ\u001b\u0010e\u001a\u00020\u000e*\u00020d2\u0006\u0010U\u001a\u00028\u0000H\u0016¢\u0006\u0004\be\u0010fJ\u001b\u0010g\u001a\u00020\u000e*\u00020d2\u0006\u0010_\u001a\u00020\tH\u0016¢\u0006\u0004\bg\u0010hJ\u001f\u0010i\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010!\u001a\u0004\u0018\u00010 H\u0010¢\u0006\u0004\bi\u0010jJ\u001b\u0010k\u001a\u0004\u0018\u00010\t2\b\u0010!\u001a\u0004\u0018\u00010 H\u0010¢\u0006\u0004\bk\u0010lJ\u000f\u0010n\u001a\u00020mH\u0016¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00020mH\u0014¢\u0006\u0004\bp\u0010oR \u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000q8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bk\u0010r\u001a\u0004\bs\u0010tR\u001a\u0010z\u001a\u00020v8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bi\u0010w\u001a\u0004\bx\u0010yR\u0018\u0010}\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010\u007f\u001a\u00020m8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b~\u0010oR\u0017\u0010!\u001a\u0004\u0018\u00010 8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010BR\u0016\u0010\u0081\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010\bR\u0016\u0010\u0083\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010\bR\u0016\u0010\u0084\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010\bR\u001f\u0010\u0087\u0001\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u008a\u0001"}, d2 = {"Lkotlinx/coroutines/q;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/b1;", "Lkotlinx/coroutines/p;", "Lkotlin/coroutines/jvm/internal/c;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "", "y", "()Z", "", "cause", "o", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function0;", "Lkotlin/b2;", "block", "m", "(Lyh/a;)V", "Lkotlin/Function1;", "Lkotlin/m0;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "l", "(Lyh/l;Ljava/lang/Throwable;)V", "M", "J", "Lkotlinx/coroutines/h1;", RXScreenCaptureService.KEY_WIDTH, "()Lkotlinx/coroutines/h1;", androidx.exifinterface.media.a.S4, "()V", "", "state", androidx.exifinterface.media.a.W4, "(Lyh/l;Ljava/lang/Object;)V", "Lkotlinx/coroutines/n;", ak.aD, "(Lyh/l;)Lkotlinx/coroutines/n;", "", "mode", "r", "(I)V", "Lkotlinx/coroutines/r2;", "proposedUpdate", "resumeMode", "onCancellation", "idempotent", "I", "(Lkotlinx/coroutines/r2;Ljava/lang/Object;ILyh/l;Ljava/lang/Object;)Ljava/lang/Object;", "G", "(Ljava/lang/Object;ILyh/l;)V", "Lkotlinx/coroutines/internal/o0;", "K", "(Ljava/lang/Object;Ljava/lang/Object;Lyh/l;)Lkotlinx/coroutines/internal/o0;", "", "i", "(Ljava/lang/Object;)Ljava/lang/Void;", "q", "F0", "F", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", RXScreenCaptureService.KEY_HEIGHT, "()Ljava/lang/Object;", "takenState", ak.aF, "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "b", "C", "(Ljava/lang/Throwable;)V", "k", "(Lkotlinx/coroutines/n;Ljava/lang/Throwable;)V", "n", "Lkotlinx/coroutines/d2;", "parent", ak.aB, "(Lkotlinx/coroutines/d2;)Ljava/lang/Throwable;", "t", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "value", "I0", "(Ljava/lang/Object;Lyh/l;)V", "L", "(Lyh/l;)V", "p", androidx.exifinterface.media.a.T4, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "D", "(Ljava/lang/Object;Ljava/lang/Object;Lyh/l;)Ljava/lang/Object;", "exception", "c0", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", androidx.exifinterface.media.a.X4, "Lkotlinx/coroutines/CoroutineDispatcher;", "s0", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "j", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Throwable;)V", "f", "(Ljava/lang/Object;)Ljava/lang/Object;", "e", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "B", "Lkotlin/coroutines/c;", "Lkotlin/coroutines/c;", "d", "()Lkotlin/coroutines/c;", "delegate", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "g", "Lkotlinx/coroutines/h1;", "parentHandle", "v", "stateDebugRepresentation", ak.aG, "isActive", "x", "isCompleted", "isCancelled", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/c;", "callerFrame", "<init>", "(Lkotlin/coroutines/c;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class q<T> extends b1<T> implements p<T>, kotlin.coroutines.jvm.internal.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f130300h = AtomicIntegerFieldUpdater.newUpdater(q.class, "_decision");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f130301i = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_state");

    @dl.d
    private volatile /* synthetic */ int _decision;

    @dl.d
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlin.coroutines.c<T> delegate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final CoroutineContext context;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private h1 parentHandle;

    /* JADX WARN: Multi-variable type inference failed */
    public q(@dl.d kotlin.coroutines.c<? super T> cVar, int i10) {
        super(i10);
        this.delegate = cVar;
        this.context = cVar.getContext();
        this._decision = 0;
        this._state = d.f129087b;
    }

    private final void A(yh.l<? super Throwable, kotlin.b2> handler, Object state) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + handler + ", already has " + state).toString());
    }

    private final void E() {
        Throwable thU;
        kotlin.coroutines.c<T> cVar = this.delegate;
        kotlinx.coroutines.internal.l lVar = cVar instanceof kotlinx.coroutines.internal.l ? (kotlinx.coroutines.internal.l) cVar : null;
        if (lVar == null || (thU = lVar.u(this)) == null) {
            return;
        }
        p();
        b(thU);
    }

    private final void G(Object proposedUpdate, int resumeMode, yh.l<? super Throwable, kotlin.b2> onCancellation) {
        Object obj;
        do {
            obj = this._state;
            if (!(obj instanceof r2)) {
                if (obj instanceof t) {
                    t tVar = (t) obj;
                    if (tVar.c()) {
                        if (onCancellation != null) {
                            n(onCancellation, tVar.cause);
                            return;
                        }
                        return;
                    }
                }
                i(proposedUpdate);
                throw new KotlinNothingValueException();
            }
        } while (!androidx.concurrent.futures.a.a(f130301i, this, obj, I((r2) obj, proposedUpdate, resumeMode, onCancellation, null)));
        q();
        r(resumeMode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void H(q qVar, Object obj, int i10, yh.l lVar, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        qVar.G(obj, i10, lVar);
    }

    private final Object I(r2 state, Object proposedUpdate, int resumeMode, yh.l<? super Throwable, kotlin.b2> onCancellation, Object idempotent) {
        if (proposedUpdate instanceof d0) {
            return proposedUpdate;
        }
        if (!c1.c(resumeMode) && idempotent == null) {
            return proposedUpdate;
        }
        if (onCancellation != null || (((state instanceof n) && !(state instanceof f)) || idempotent != null)) {
            return new CompletedContinuation(proposedUpdate, state instanceof n ? (n) state : null, onCancellation, idempotent, null, 16, null);
        }
        return proposedUpdate;
    }

    private final boolean J() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f130300h.compareAndSet(this, 0, 2));
        return true;
    }

    private final kotlinx.coroutines.internal.o0 K(Object proposedUpdate, Object idempotent, yh.l<? super Throwable, kotlin.b2> onCancellation) {
        Object obj;
        do {
            obj = this._state;
            if (!(obj instanceof r2)) {
                if ((obj instanceof CompletedContinuation) && idempotent != null && ((CompletedContinuation) obj).idempotentResume == idempotent) {
                    return r.f130311d;
                }
                return null;
            }
        } while (!androidx.concurrent.futures.a.a(f130301i, this, obj, I((r2) obj, proposedUpdate, this.resumeMode, onCancellation, idempotent)));
        q();
        return r.f130311d;
    }

    private final boolean M() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f130300h.compareAndSet(this, 0, 1));
        return true;
    }

    private final Void i(Object proposedUpdate) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + proposedUpdate).toString());
    }

    private final void l(yh.l<? super Throwable, kotlin.b2> handler, Throwable cause) {
        try {
            handler.invoke(cause);
        } catch (Throwable th2) {
            n0.b(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final void m(yh.a<kotlin.b2> block) {
        try {
            block.invoke();
        } catch (Throwable th2) {
            n0.b(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final boolean o(Throwable cause) {
        if (y()) {
            return ((kotlinx.coroutines.internal.l) this.delegate).p(cause);
        }
        return false;
    }

    private final void q() {
        if (y()) {
            return;
        }
        p();
    }

    private final void r(int mode) {
        if (J()) {
            return;
        }
        c1.a(this, mode);
    }

    private final String v() {
        Object obj = get_state();
        if (obj instanceof r2) {
            return "Active";
        }
        return obj instanceof t ? "Cancelled" : "Completed";
    }

    private final h1 w() {
        d2 d2Var = (d2) getContext().f(d2.INSTANCE);
        if (d2Var == null) {
            return null;
        }
        h1 h1VarF = d2.a.f(d2Var, true, false, new u(this), 2, null);
        this.parentHandle = h1VarF;
        return h1VarF;
    }

    private final boolean y() {
        return c1.d(this.resumeMode) && ((kotlinx.coroutines.internal.l) this.delegate).o();
    }

    private final n z(yh.l<? super Throwable, kotlin.b2> handler) {
        return handler instanceof n ? (n) handler : new a2(handler);
    }

    @dl.d
    protected String B() {
        return "CancellableContinuation";
    }

    public final void C(@dl.d Throwable cause) {
        if (o(cause)) {
            return;
        }
        b(cause);
        q();
    }

    @Override // kotlinx.coroutines.p
    @dl.e
    public Object D(T value, @dl.e Object idempotent, @dl.e yh.l<? super Throwable, kotlin.b2> onCancellation) {
        return K(value, idempotent, onCancellation);
    }

    @xh.h(name = "resetStateReusable")
    public final boolean F() {
        Object obj = this._state;
        if ((obj instanceof CompletedContinuation) && ((CompletedContinuation) obj).idempotentResume != null) {
            p();
            return false;
        }
        this._decision = 0;
        this._state = d.f129087b;
        return true;
    }

    @Override // kotlinx.coroutines.p
    public void F0() {
        h1 h1VarW = w();
        if (h1VarW != null && x()) {
            h1VarW.dispose();
            this.parentHandle = q2.f130305b;
        }
    }

    @Override // kotlinx.coroutines.p
    public void I0(T value, @dl.e yh.l<? super Throwable, kotlin.b2> onCancellation) {
        G(value, this.resumeMode, onCancellation);
    }

    @Override // kotlinx.coroutines.p
    public void L(@dl.d yh.l<? super Throwable, kotlin.b2> handler) {
        n nVarZ = z(handler);
        while (true) {
            Object obj = this._state;
            if (obj instanceof d) {
                if (androidx.concurrent.futures.a.a(f130301i, this, obj, nVarZ)) {
                    return;
                }
            } else if (obj instanceof n) {
                A(handler, obj);
            } else {
                boolean z10 = obj instanceof d0;
                if (z10) {
                    d0 d0Var = (d0) obj;
                    if (!d0Var.b()) {
                        A(handler, obj);
                    }
                    if (obj instanceof t) {
                        if (!z10) {
                            d0Var = null;
                        }
                        l(handler, d0Var != null ? d0Var.cause : null);
                        return;
                    }
                    return;
                }
                if (obj instanceof CompletedContinuation) {
                    CompletedContinuation completedContinuation = (CompletedContinuation) obj;
                    if (completedContinuation.cancelHandler != null) {
                        A(handler, obj);
                    }
                    if (nVarZ instanceof f) {
                        return;
                    }
                    if (completedContinuation.h()) {
                        l(handler, completedContinuation.cancelCause);
                        return;
                    } else {
                        if (androidx.concurrent.futures.a.a(f130301i, this, obj, CompletedContinuation.g(completedContinuation, null, nVarZ, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (nVarZ instanceof f) {
                        return;
                    }
                    if (androidx.concurrent.futures.a.a(f130301i, this, obj, new CompletedContinuation(obj, nVarZ, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    @Override // kotlinx.coroutines.p
    public void V(@dl.d Object token) {
        r(this.resumeMode);
    }

    @Override // kotlinx.coroutines.p
    @dl.e
    public Object W(T value, @dl.e Object idempotent) {
        return K(value, idempotent, null);
    }

    @Override // kotlinx.coroutines.p
    public boolean b(@dl.e Throwable cause) {
        Object obj;
        boolean z10;
        do {
            obj = this._state;
            if (!(obj instanceof r2)) {
                return false;
            }
            z10 = obj instanceof n;
        } while (!androidx.concurrent.futures.a.a(f130301i, this, obj, new t(this, cause, z10)));
        n nVar = z10 ? (n) obj : null;
        if (nVar != null) {
            k(nVar, cause);
        }
        q();
        r(this.resumeMode);
        return true;
    }

    @Override // kotlinx.coroutines.b1
    public void c(@dl.e Object takenState, @dl.d Throwable cause) {
        while (true) {
            Object obj = this._state;
            if (obj instanceof r2) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj instanceof d0) {
                return;
            }
            if (obj instanceof CompletedContinuation) {
                CompletedContinuation completedContinuation = (CompletedContinuation) obj;
                if (!(!completedContinuation.h())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (androidx.concurrent.futures.a.a(f130301i, this, obj, CompletedContinuation.g(completedContinuation, null, null, null, null, cause, 15, null))) {
                    completedContinuation.i(this, cause);
                    return;
                }
            } else if (androidx.concurrent.futures.a.a(f130301i, this, obj, new CompletedContinuation(obj, null, null, null, cause, 14, null))) {
                return;
            }
        }
    }

    @Override // kotlinx.coroutines.p
    @dl.e
    public Object c0(@dl.d Throwable exception) {
        return K(new d0(exception, false, 2, null), null, null);
    }

    @Override // kotlinx.coroutines.b1
    @dl.d
    public final kotlin.coroutines.c<T> d() {
        return this.delegate;
    }

    @Override // kotlinx.coroutines.b1
    @dl.e
    public Throwable e(@dl.e Object state) {
        Throwable thE = super.e(state);
        if (thE != null) {
            return thE;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.b1
    public <T> T f(@dl.e Object state) {
        return state instanceof CompletedContinuation ? (T) ((CompletedContinuation) state).result : state;
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @dl.e
    public kotlin.coroutines.jvm.internal.c getCallerFrame() {
        kotlin.coroutines.c<T> cVar = this.delegate;
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

    @Override // kotlinx.coroutines.b1
    @dl.e
    public Object h() {
        return get_state();
    }

    @Override // kotlinx.coroutines.p
    public boolean isActive() {
        return get_state() instanceof r2;
    }

    @Override // kotlinx.coroutines.p
    public boolean isCancelled() {
        return get_state() instanceof t;
    }

    @Override // kotlinx.coroutines.p
    public void j(@dl.d CoroutineDispatcher coroutineDispatcher, @dl.d Throwable th2) {
        kotlin.coroutines.c<T> cVar = this.delegate;
        kotlinx.coroutines.internal.l lVar = cVar instanceof kotlinx.coroutines.internal.l ? (kotlinx.coroutines.internal.l) cVar : null;
        H(this, new d0(th2, false, 2, null), (lVar != null ? lVar.dispatcher : null) == coroutineDispatcher ? 4 : this.resumeMode, null, 4, null);
    }

    public final void k(@dl.d n handler, @dl.e Throwable cause) {
        try {
            handler.a(cause);
        } catch (Throwable th2) {
            n0.b(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void n(@dl.d yh.l<? super Throwable, kotlin.b2> onCancellation, @dl.d Throwable cause) {
        try {
            onCancellation.invoke(cause);
        } catch (Throwable th2) {
            n0.b(getContext(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void p() {
        h1 h1Var = this.parentHandle;
        if (h1Var == null) {
            return;
        }
        h1Var.dispose();
        this.parentHandle = q2.f130305b;
    }

    @Override // kotlin.coroutines.c
    public void resumeWith(@dl.d Object result) {
        H(this, i0.b(result, this), this.resumeMode, null, 4, null);
    }

    @dl.d
    public Throwable s(@dl.d d2 parent) {
        return parent.Z();
    }

    @Override // kotlinx.coroutines.p
    public void s0(@dl.d CoroutineDispatcher coroutineDispatcher, T t10) {
        kotlin.coroutines.c<T> cVar = this.delegate;
        kotlinx.coroutines.internal.l lVar = cVar instanceof kotlinx.coroutines.internal.l ? (kotlinx.coroutines.internal.l) cVar : null;
        H(this, t10, (lVar != null ? lVar.dispatcher : null) == coroutineDispatcher ? 4 : this.resumeMode, null, 4, null);
    }

    @kotlin.r0
    @dl.e
    public final Object t() {
        d2 d2Var;
        boolean zY = y();
        if (M()) {
            if (this.parentHandle == null) {
                w();
            }
            if (zY) {
                E();
            }
            return kotlin.coroutines.intrinsics.b.h();
        }
        if (zY) {
            E();
        }
        Object obj = get_state();
        if (obj instanceof d0) {
            throw ((d0) obj).cause;
        }
        if (!c1.c(this.resumeMode) || (d2Var = (d2) getContext().f(d2.INSTANCE)) == null || d2Var.isActive()) {
            return f(obj);
        }
        CancellationException cancellationExceptionZ = d2Var.Z();
        c(obj, cancellationExceptionZ);
        throw cancellationExceptionZ;
    }

    @dl.d
    public String toString() {
        return B() + '(' + t0.c(this.delegate) + "){" + v() + "}@" + t0.b(this);
    }

    @dl.e
    /* JADX INFO: renamed from: u, reason: from getter */
    public final Object get_state() {
        return this._state;
    }

    @Override // kotlinx.coroutines.p
    public boolean x() {
        return !(get_state() instanceof r2);
    }
}
