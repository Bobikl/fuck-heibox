package kotlinx.coroutines.selects;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.f0;
import kotlin.r0;
import kotlin.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.e2;
import kotlinx.coroutines.h1;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.g0;
import kotlinx.coroutines.internal.v;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.r;
import yh.l;
import yh.p;

/* JADX INFO: renamed from: kotlinx.coroutines.selects.b, reason: from toString */
/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0004Z[\\]B\u0015\u0012\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\bX\u0010YJ.\u0010\r\u001a\u00020\u000b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0082\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0018\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001aH\u0001¢\u0006\u0004\b!\u0010\u001dJ\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u001b\u0010+\u001a\u0004\u0018\u00010\t2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,J\u0019\u0010/\u001a\u0004\u0018\u00010\t2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J5\u00106\u001a\u00020\u000b*\u0002042\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t05H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b6\u00107JG\u0010;\u001a\u00020\u000b\"\u0004\b\u0001\u00108*\b\u0012\u0004\u0012\u00028\u0001092\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t0:H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b;\u0010<J[\u0010@\u001a\u00020\u000b\"\u0004\b\u0001\u0010=\"\u0004\b\u0002\u00108*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020>2\u0006\u0010?\u001a\u00028\u00012\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t0:H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ8\u0010D\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020B2\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t05H\u0016ø\u0001\u0000¢\u0006\u0004\bD\u0010ER\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010FR(\u0010K\u001a\u0004\u0018\u00010\"2\b\u0010\n\u001a\u0004\u0018\u00010\"8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010%R\u001c\u0010N\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006^"}, d2 = {"Lkotlinx/coroutines/selects/b;", "R", "Lkotlinx/coroutines/internal/v;", "Lkotlinx/coroutines/selects/a;", "Lkotlinx/coroutines/selects/f;", "Lkotlin/coroutines/c;", "Lkotlin/coroutines/jvm/internal/c;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/Function0;", "", "value", "Lkotlin/b2;", "block", "r0", "(Lyh/a;Lyh/a;)V", "F0", "()V", "q0", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "", "exception", ak.aB, "(Ljava/lang/Throwable;)V", "w0", "()Ljava/lang/Object;", "e", "x0", "Lkotlinx/coroutines/h1;", "handle", "p", "(Lkotlinx/coroutines/h1;)V", "", "q", "()Z", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$d;", "otherOp", "i", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode$d;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/b;", SocialConstants.PARAM_APP_DESC, "m", "(Lkotlinx/coroutines/internal/b;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/selects/c;", "Lkotlin/Function1;", "f", "(Lkotlinx/coroutines/selects/c;Lyh/l;)V", "Q", "Lkotlinx/coroutines/selects/d;", "Lkotlin/Function2;", RXScreenCaptureService.KEY_HEIGHT, "(Lkotlinx/coroutines/selects/d;Lyh/p;)V", "P", "Lkotlinx/coroutines/selects/e;", RemoteMessageConst.MessageBody.PARAM, "l", "(Lkotlinx/coroutines/selects/e;Ljava/lang/Object;Lyh/p;)V", "", "timeMillis", "t", "(JLyh/l;)V", "Lkotlin/coroutines/c;", "uCont", "t0", "()Lkotlinx/coroutines/h1;", "y0", "parentHandle", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/c;", "callerFrame", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "r", "()Lkotlin/coroutines/c;", "completion", "o", "isSelected", "<init>", "(Lkotlin/coroutines/c;)V", ak.av, "b", ak.aF, "d", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@r0
public final class SelectInstance<R> extends v implements a<R>, f<R>, kotlin.coroutines.c<R>, kotlin.coroutines.jvm.internal.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f130419f = AtomicReferenceFieldUpdater.newUpdater(SelectInstance.class, Object.class, "_state");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f130420g = AtomicReferenceFieldUpdater.newUpdater(SelectInstance.class, Object.class, "_result");

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlin.coroutines.c<R> uCont;

    /* JADX INFO: renamed from: _state, reason: from toString */
    @dl.d
    volatile /* synthetic */ Object state = g.f();

    /* JADX INFO: renamed from: _result, reason: from toString */
    @dl.d
    private volatile /* synthetic */ Object result = g.f130432c;

    @dl.d
    private volatile /* synthetic */ Object _parentHandle = null;

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.b$a, reason: from toString */
    /* JADX INFO: compiled from: Select.kt */
    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001b\u0012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\n\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0018\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/selects/b$a;", "Lkotlinx/coroutines/internal/d;", "", "k", "Lkotlin/b2;", "l", "failure", "j", "affected", "i", "d", "", "toString", "Lkotlinx/coroutines/selects/b;", "b", "Lkotlinx/coroutines/selects/b;", "impl", "Lkotlinx/coroutines/internal/b;", ak.aF, "Lkotlinx/coroutines/internal/b;", SocialConstants.PARAM_APP_DESC, "", "J", "g", "()J", "opSequence", "<init>", "(Lkotlinx/coroutines/selects/b;Lkotlinx/coroutines/internal/b;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class AtomicSelectOp extends kotlinx.coroutines.internal.d<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final SelectInstance<?> impl;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final kotlinx.coroutines.internal.b desc;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final long opSequence = g.f130434e.a();

        public AtomicSelectOp(@dl.d SelectInstance<?> selectInstance, @dl.d kotlinx.coroutines.internal.b bVar) {
            this.impl = selectInstance;
            this.desc = bVar;
            bVar.d(this);
        }

        private final void j(Object obj) {
            boolean z10 = obj == null;
            if (androidx.concurrent.futures.a.a(SelectInstance.f130419f, this.impl, this, z10 ? null : g.f()) && z10) {
                this.impl.q0();
            }
        }

        private final Object k() {
            SelectInstance<?> selectInstance = this.impl;
            while (true) {
                Object obj = selectInstance.state;
                if (obj == this) {
                    return null;
                }
                if (obj instanceof g0) {
                    ((g0) obj).c(this.impl);
                } else {
                    if (obj != g.f()) {
                        return g.d();
                    }
                    if (androidx.concurrent.futures.a.a(SelectInstance.f130419f, this.impl, g.f(), this)) {
                        return null;
                    }
                }
            }
        }

        private final void l() {
            androidx.concurrent.futures.a.a(SelectInstance.f130419f, this.impl, this, g.f());
        }

        @Override // kotlinx.coroutines.internal.d
        public void d(@dl.e Object obj, @dl.e Object obj2) {
            j(obj2);
            this.desc.a(this, obj2);
        }

        @Override // kotlinx.coroutines.internal.d
        /* JADX INFO: renamed from: g, reason: from getter */
        public long getOpSequence() {
            return this.opSequence;
        }

        @Override // kotlinx.coroutines.internal.d
        @dl.e
        public Object i(@dl.e Object affected) {
            Object objK;
            if (affected == null && (objK = k()) != null) {
                return objK;
            }
            try {
                return this.desc.c(this);
            } catch (Throwable th2) {
                if (affected == null) {
                    l();
                }
                throw th2;
            }
        }

        @Override // kotlinx.coroutines.internal.g0
        @dl.d
        public String toString() {
            return "AtomicSelectOp(sequence=" + getOpSequence() + ')';
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Select.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/selects/b$b;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/h1;", "e", "Lkotlinx/coroutines/h1;", "handle", "<init>", "(Lkotlinx/coroutines/h1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class C1193b extends LockFreeLinkedListNode {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final h1 handle;

        public C1193b(@dl.d h1 h1Var) {
            this.handle = h1Var;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.b$c */
    /* JADX INFO: compiled from: Select.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/selects/b$c;", "Lkotlinx/coroutines/internal/g0;", "", "affected", ak.aF, "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$d;", ak.av, "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$d;", "otherOp", "Lkotlinx/coroutines/internal/d;", "()Lkotlinx/coroutines/internal/d;", "atomicOp", "<init>", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode$d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class c extends g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final LockFreeLinkedListNode.PrepareOp otherOp;

        public c(@dl.d LockFreeLinkedListNode.PrepareOp prepareOp) {
            this.otherOp = prepareOp;
        }

        @Override // kotlinx.coroutines.internal.g0
        @dl.d
        public kotlinx.coroutines.internal.d<?> a() {
            return this.otherOp.a();
        }

        @Override // kotlinx.coroutines.internal.g0
        @dl.e
        public Object c(@dl.e Object affected) {
            if (affected == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>");
            }
            SelectInstance selectInstance = (SelectInstance) affected;
            this.otherOp.d();
            Object objE = this.otherOp.a().e(null);
            androidx.concurrent.futures.a.a(SelectInstance.f130419f, selectInstance, this, objE == null ? this.otherOp.desc : g.f());
            return objE;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.b$d */
    /* JADX INFO: compiled from: Select.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/selects/b$d;", "Lkotlinx/coroutines/e2;", "", "cause", "Lkotlin/b2;", "j0", "<init>", "(Lkotlinx/coroutines/selects/b;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public final class d extends e2 {
        public d() {
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
            j0(th2);
            return b2.f124493a;
        }

        @Override // kotlinx.coroutines.f0
        public void j0(@dl.e Throwable th2) {
            if (SelectInstance.this.q()) {
                SelectInstance.this.s(k0().Z());
            }
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.b$e */
    /* JADX INFO: compiled from: Runnable.kt */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/b2;", "run", "()V", "kotlinx/coroutines/y2$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class e implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f130429c;

        public e(l lVar) {
            this.f130429c = lVar;
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            if (SelectInstance.this.q()) {
                bj.a.d(this.f130429c, SelectInstance.this.r());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectInstance(@dl.d kotlin.coroutines.c<? super R> cVar) {
        this.uCont = cVar;
    }

    private final void F0() {
        d2 d2Var = (d2) getCom.umeng.analytics.pro.d.R java.lang.String().f(d2.INSTANCE);
        if (d2Var == null) {
            return;
        }
        h1 h1VarF = d2.a.f(d2Var, true, false, new d(), 2, null);
        y0(h1VarF);
        if (o()) {
            h1VarF.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0() {
        h1 h1VarT0 = t0();
        if (h1VarT0 != null) {
            h1VarT0.dispose();
        }
        for (LockFreeLinkedListNode lockFreeLinkedListNodeO = (LockFreeLinkedListNode) N(); !f0.g(lockFreeLinkedListNodeO, this); lockFreeLinkedListNodeO = lockFreeLinkedListNodeO.O()) {
            if (lockFreeLinkedListNodeO instanceof C1193b) {
                ((C1193b) lockFreeLinkedListNodeO).handle.dispose();
            }
        }
    }

    private final void r0(yh.a<? extends Object> value, yh.a<b2> block) {
        while (true) {
            Object obj = this.result;
            if (obj == g.f130432c) {
                if (androidx.concurrent.futures.a.a(f130420g, this, g.f130432c, value.invoke())) {
                    return;
                }
            } else {
                if (obj != kotlin.coroutines.intrinsics.b.h()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.a.a(f130420g, this, kotlin.coroutines.intrinsics.b.h(), g.f130433d)) {
                    block.invoke();
                    return;
                }
            }
        }
    }

    private final h1 t0() {
        return (h1) this._parentHandle;
    }

    private final void y0(h1 h1Var) {
        this._parentHandle = h1Var;
    }

    @Override // kotlinx.coroutines.selects.a
    public void f(@dl.d kotlinx.coroutines.selects.c cVar, @dl.d l<? super kotlin.coroutines.c<? super R>, ? extends Object> lVar) {
        cVar.w(this, lVar);
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @dl.e
    public kotlin.coroutines.jvm.internal.c getCallerFrame() {
        kotlin.coroutines.c<R> cVar = this.uCont;
        if (cVar instanceof kotlin.coroutines.jvm.internal.c) {
            return (kotlin.coroutines.jvm.internal.c) cVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.c
    @dl.d
    /* JADX INFO: renamed from: getContext */
    public CoroutineContext getCom.umeng.analytics.pro.d.R java.lang.String() {
        return this.uCont.getCom.umeng.analytics.pro.d.R java.lang.String();
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @dl.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.selects.a
    public <Q> void h(@dl.d kotlinx.coroutines.selects.d<? extends Q> dVar, @dl.d p<? super Q, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        dVar.F(this, pVar);
    }

    @Override // kotlinx.coroutines.selects.f
    @dl.e
    public Object i(@dl.e LockFreeLinkedListNode.PrepareOp otherOp) {
        while (true) {
            Object obj = this.state;
            if (obj == g.f()) {
                if (otherOp != null) {
                    c cVar = new c(otherOp);
                    if (androidx.concurrent.futures.a.a(f130419f, this, g.f(), cVar)) {
                        Object objC = cVar.c(this);
                        if (objC == null) {
                            break;
                        }
                        return objC;
                    }
                } else if (androidx.concurrent.futures.a.a(f130419f, this, g.f(), null)) {
                    break;
                }
            } else {
                if (!(obj instanceof g0)) {
                    if (otherOp != null && obj == otherOp.desc) {
                        return r.f130311d;
                    }
                    return null;
                }
                if (otherOp != null) {
                    kotlinx.coroutines.internal.d<?> dVarA = otherOp.a();
                    if ((dVarA instanceof AtomicSelectOp) && ((AtomicSelectOp) dVarA).impl == this) {
                        throw new IllegalStateException("Cannot use matching select clauses on the same object".toString());
                    }
                    if (dVarA.b((g0) obj)) {
                        return kotlinx.coroutines.internal.c.f130153b;
                    }
                }
                ((g0) obj).c(this);
            }
        }
        q0();
        return r.f130311d;
    }

    @Override // kotlinx.coroutines.selects.a
    public <P, Q> void k(@dl.d kotlinx.coroutines.selects.e<? super P, ? extends Q> eVar, @dl.d p<? super Q, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        a.C1192a.a(this, eVar, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.selects.a
    public <P, Q> void l(@dl.d kotlinx.coroutines.selects.e<? super P, ? extends Q> eVar, P p10, @dl.d p<? super Q, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        eVar.N(this, p10, pVar);
    }

    @Override // kotlinx.coroutines.selects.f
    @dl.e
    public Object m(@dl.d kotlinx.coroutines.internal.b desc) {
        return new AtomicSelectOp(this, desc).c(null);
    }

    @Override // kotlinx.coroutines.selects.f
    public boolean o() {
        while (true) {
            Object obj = this.state;
            if (obj == g.f()) {
                return false;
            }
            if (!(obj instanceof g0)) {
                return true;
            }
            ((g0) obj).c(this);
        }
    }

    @Override // kotlinx.coroutines.selects.f
    public void p(@dl.d h1 handle) {
        C1193b c1193b = new C1193b(handle);
        if (!o()) {
            y(c1193b);
            if (!o()) {
                return;
            }
        }
        handle.dispose();
    }

    @Override // kotlinx.coroutines.selects.f
    public boolean q() {
        Object objI = i(null);
        if (objI == r.f130311d) {
            return true;
        }
        if (objI == null) {
            return false;
        }
        throw new IllegalStateException(("Unexpected trySelectIdempotent result " + objI).toString());
    }

    @Override // kotlinx.coroutines.selects.f
    @dl.d
    public kotlin.coroutines.c<R> r() {
        return this;
    }

    @Override // kotlin.coroutines.c
    public void resumeWith(@dl.d Object result) {
        while (true) {
            Object obj = this.result;
            if (obj == g.f130432c) {
                if (androidx.concurrent.futures.a.a(f130420g, this, g.f130432c, i0.d(result, null, 1, null))) {
                    return;
                }
            } else {
                if (obj != kotlin.coroutines.intrinsics.b.h()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.a.a(f130420g, this, kotlin.coroutines.intrinsics.b.h(), g.f130433d)) {
                    if (!Result.i(result)) {
                        this.uCont.resumeWith(result);
                        return;
                    }
                    kotlin.coroutines.c<R> cVar = this.uCont;
                    Throwable thE = Result.e(result);
                    f0.m(thE);
                    Result.a aVar = Result.f124476c;
                    cVar.resumeWith(Result.b(t0.a(thE)));
                    return;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.selects.f
    public void s(@dl.d Throwable exception) {
        while (true) {
            Object obj = this.result;
            if (obj == g.f130432c) {
                if (androidx.concurrent.futures.a.a(f130420g, this, g.f130432c, new d0(exception, false, 2, null))) {
                    return;
                }
            } else {
                if (obj != kotlin.coroutines.intrinsics.b.h()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.a.a(f130420g, this, kotlin.coroutines.intrinsics.b.h(), g.f130433d)) {
                    kotlin.coroutines.c cVarD = IntrinsicsKt__IntrinsicsJvmKt.d(this.uCont);
                    Result.a aVar = Result.f124476c;
                    cVarD.resumeWith(Result.b(t0.a(exception)));
                    return;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.selects.a
    public void t(long timeMillis, @dl.d l<? super kotlin.coroutines.c<? super R>, ? extends Object> block) {
        if (timeMillis > 0) {
            p(DelayKt.d(getCom.umeng.analytics.pro.d.R java.lang.String()).r(timeMillis, new e(block), getCom.umeng.analytics.pro.d.R java.lang.String()));
        } else if (q()) {
            bj.b.c(block, r());
        }
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    @dl.d
    public String toString() {
        return "SelectInstance(state=" + this.state + ", result=" + this.result + ')';
    }

    @r0
    @dl.e
    public final Object w0() throws Throwable {
        if (!o()) {
            F0();
        }
        Object obj = this.result;
        if (obj == g.f130432c) {
            if (androidx.concurrent.futures.a.a(f130420g, this, g.f130432c, kotlin.coroutines.intrinsics.b.h())) {
                return kotlin.coroutines.intrinsics.b.h();
            }
            obj = this.result;
        }
        if (obj == g.f130433d) {
            throw new IllegalStateException("Already resumed");
        }
        if (obj instanceof d0) {
            throw ((d0) obj).cause;
        }
        return obj;
    }

    @r0
    public final void x0(@dl.d Throwable e10) throws Throwable {
        if (q()) {
            Result.a aVar = Result.f124476c;
            resumeWith(Result.b(t0.a(e10)));
        } else {
            if (e10 instanceof CancellationException) {
                return;
            }
            Object objW0 = w0();
            if ((objW0 instanceof d0) && ((d0) objW0).cause == e10) {
                return;
            }
            n0.b(getCom.umeng.analytics.pro.d.R java.lang.String(), e10);
        }
    }
}
