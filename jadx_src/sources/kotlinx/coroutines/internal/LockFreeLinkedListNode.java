package kotlinx.coroutines.internal;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlinx.coroutines.z1;

/* JADX INFO: compiled from: LockFreeLinkedList.kt */
/* JADX INFO: loaded from: classes5.dex */
@z1
@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0017\u0018\u00002\u00020\u0001:\u0005IJKLMB\u0007¢\u0006\u0004\bH\u00101J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0007\u001a\u00060\u0000j\u0002`\u00052\n\u0010\u0006\u001a\u00060\u0000j\u0002`\u0005H\u0082\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000f\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082\u0010¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0016\u001a\u00020\u00152\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u000e\b\u0004\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0081\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\n2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0005¢\u0006\u0004\b\u001a\u0010\fJ)\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\"\f\b\u0000\u0010\u0016*\u00060\u0000j\u0002`\u00052\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ,\u0010\u001e\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u000e\b\u0004\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0086\b¢\u0006\u0004\b\u001e\u0010\u001fJ4\u0010\"\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u0016\u0010!\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0005\u0012\u0004\u0012\u00020\u00130 H\u0086\b¢\u0006\u0004\b\"\u0010#JD\u0010$\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u0016\u0010!\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0005\u0012\u0004\u0012\u00020\u00130 2\u000e\b\u0004\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0086\b¢\u0006\u0004\b$\u0010%J'\u0010&\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0001¢\u0006\u0004\b&\u0010'J/\u0010*\u001a\u00020)2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u00052\u0006\u0010(\u001a\u00020\u0015H\u0001¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0013H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005H\u0001¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\n¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\nH\u0001¢\u0006\u0004\b2\u00101J\u0015\u00103\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b3\u0010/J\u0017\u00105\u001a\f\u0012\b\u0012\u00060\u0000j\u0002`\u000504¢\u0006\u0004\b5\u00106J.\u00107\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0016\u0018\u00012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130 H\u0086\b¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005H\u0014¢\u0006\u0004\b9\u0010/J'\u0010;\u001a\u00020\n2\n\u0010:\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0000¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010-R\u0011\u0010\t\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0015\u0010E\u001a\u00060\u0000j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\bD\u0010/R\u0015\u0010G\u001a\u00060\u0000j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\bF\u0010/¨\u0006N"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "", "Lkotlinx/coroutines/internal/i0;", "g0", "()Lkotlinx/coroutines/internal/i0;", "Lkotlinx/coroutines/internal/Node;", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "J", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "next", "Lkotlin/b2;", "M", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "Lkotlinx/coroutines/internal/g0;", "op", "G", "(Lkotlinx/coroutines/internal/g0;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "node", "Lkotlin/Function0;", "", "condition", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$c;", androidx.exifinterface.media.a.f23244d5, "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lyh/a;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$c;", "F", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z", "y", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$b;", "H", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$b;", ak.aD, "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lyh/a;)Z", "Lkotlin/Function1;", "predicate", androidx.exifinterface.media.a.W4, "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lyh/l;)Z", "C", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lyh/l;Lyh/a;)Z", androidx.exifinterface.media.a.S4, "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z", "condAdd", "", "h0", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$c;)I", "Z", "()Z", "f0", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Q", "()V", "R", "b0", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$e;", "I", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode$e;", "a0", "(Lyh/l;)Ljava/lang/Object;", "X", "prev", "i0", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "", "toString", "()Ljava/lang/String;", androidx.exifinterface.media.a.R4, "isRemoved", "N", "()Ljava/lang/Object;", "O", "nextNode", "P", "prevNode", "<init>", ak.av, "b", ak.aF, "d", "e", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class LockFreeLinkedListNode {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f130123b = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f130124c = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f130125d = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_removedRef");

    @dl.d
    volatile /* synthetic */ Object _next = this;

    @dl.d
    volatile /* synthetic */ Object _prev = this;

    @dl.d
    private volatile /* synthetic */ Object _removedRef = null;

    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0016\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005H\u0014J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\bH\u0014J \u0010\u000e\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\n\u0010\n\u001a\u00060\u0004j\u0002`\u0005H$J \u0010\u000f\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\n\u0010\n\u001a\u00060\u0004j\u0002`\u0005H&J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0014\u0010\u0014\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0015J\u001c\u0010\u0018\u001a\u00020\r2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\bR\u001c\u0010\u001b\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006 "}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$a;", "Lkotlinx/coroutines/internal/b;", "Lkotlinx/coroutines/internal/g0;", "op", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "m", "affected", "", "e", "next", "", "l", "Lkotlin/b2;", "f", "n", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$d;", "prepareOp", "g", "j", "k", "Lkotlinx/coroutines/internal/d;", ak.aF, "failure", ak.av, RXScreenCaptureService.KEY_HEIGHT, "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "affectedNode", "i", "originalNext", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static abstract class a extends kotlinx.coroutines.internal.b {
        @Override // kotlinx.coroutines.internal.b
        public final void a(@dl.d d<?> dVar, @dl.e Object obj) {
            LockFreeLinkedListNode queue;
            boolean z10 = obj == null;
            LockFreeLinkedListNode lockFreeLinkedListNodeH = h();
            if (lockFreeLinkedListNodeH == null || (queue = getQueue()) == null) {
                return;
            }
            if (androidx.concurrent.futures.a.a(LockFreeLinkedListNode.f130123b, lockFreeLinkedListNodeH, dVar, z10 ? n(lockFreeLinkedListNodeH, queue) : queue) && z10) {
                f(lockFreeLinkedListNodeH, queue);
            }
        }

        @Override // kotlinx.coroutines.internal.b
        @dl.e
        public final Object c(@dl.d d<?> op) {
            while (true) {
                LockFreeLinkedListNode lockFreeLinkedListNodeM = m(op);
                if (lockFreeLinkedListNodeM == null) {
                    return kotlinx.coroutines.internal.c.f130153b;
                }
                Object obj = lockFreeLinkedListNodeM._next;
                if (obj == op || op.h()) {
                    return null;
                }
                if (obj instanceof g0) {
                    g0 g0Var = (g0) obj;
                    if (op.b(g0Var)) {
                        return kotlinx.coroutines.internal.c.f130153b;
                    }
                    g0Var.c(lockFreeLinkedListNodeM);
                } else {
                    Object objE = e(lockFreeLinkedListNodeM);
                    if (objE != null) {
                        return objE;
                    }
                    if (l(lockFreeLinkedListNodeM, obj)) {
                        continue;
                    } else {
                        PrepareOp prepareOp = new PrepareOp(lockFreeLinkedListNodeM, (LockFreeLinkedListNode) obj, this);
                        if (androidx.concurrent.futures.a.a(LockFreeLinkedListNode.f130123b, lockFreeLinkedListNodeM, obj, prepareOp)) {
                            try {
                                if (prepareOp.c(lockFreeLinkedListNodeM) != x.f130208a) {
                                    return null;
                                }
                            } catch (Throwable th2) {
                                androidx.concurrent.futures.a.a(LockFreeLinkedListNode.f130123b, lockFreeLinkedListNodeM, prepareOp, obj);
                                throw th2;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }

        @dl.e
        protected Object e(@dl.d LockFreeLinkedListNode affected) {
            return null;
        }

        protected abstract void f(@dl.d LockFreeLinkedListNode lockFreeLinkedListNode, @dl.d LockFreeLinkedListNode lockFreeLinkedListNode2);

        public abstract void g(@dl.d PrepareOp prepareOp);

        @dl.e
        protected abstract LockFreeLinkedListNode h();

        @dl.e
        /* JADX INFO: renamed from: i */
        protected abstract LockFreeLinkedListNode getQueue();

        @dl.e
        public Object j(@dl.d PrepareOp prepareOp) {
            g(prepareOp);
            return null;
        }

        public void k(@dl.d LockFreeLinkedListNode lockFreeLinkedListNode) {
        }

        protected boolean l(@dl.d LockFreeLinkedListNode affected, @dl.d Object next) {
            return false;
        }

        @dl.e
        protected LockFreeLinkedListNode m(@dl.d g0 op) {
            LockFreeLinkedListNode lockFreeLinkedListNodeH = h();
            kotlin.jvm.internal.f0.m(lockFreeLinkedListNodeH);
            return lockFreeLinkedListNodeH;
        }

        @dl.d
        public abstract Object n(@dl.d LockFreeLinkedListNode affected, @dl.d LockFreeLinkedListNode next);
    }

    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u00022\u00020\u0004B\u001b\u0012\n\u0010\u001a\u001a\u00060\u0001j\u0002`\u0002\u0012\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0004\b\"\u0010\u0017J\u001f\u0010\u0007\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u000b\u001a\u00060\u0001j\u0002`\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00112\n\u0010\t\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u000b\u001a\u00060\u0001j\u0002`\u0002H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u00060\u0001j\u0002`\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u00060\u0001j\u0002`\u00028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006#"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$b;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$a;", "Lkotlinx/coroutines/internal/g0;", "op", "m", "(Lkotlinx/coroutines/internal/g0;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "affected", "", "next", "", "l", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$d;", "prepareOp", "Lkotlin/b2;", "g", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode$d;)V", "n", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "f", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "b", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "queue", ak.aF, "node", RXScreenCaptureService.KEY_HEIGHT, "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "affectedNode", "i", "originalNext", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static class b<T extends LockFreeLinkedListNode> extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f130126d = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_affectedNode");

        @dl.d
        private volatile /* synthetic */ Object _affectedNode = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final LockFreeLinkedListNode queue;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final T node;

        public b(@dl.d LockFreeLinkedListNode lockFreeLinkedListNode, @dl.d T t10) {
            this.queue = lockFreeLinkedListNode;
            this.node = t10;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        protected void f(@dl.d LockFreeLinkedListNode affected, @dl.d LockFreeLinkedListNode next) {
            this.node.M(this.queue);
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        public void g(@dl.d PrepareOp prepareOp) {
            androidx.concurrent.futures.a.a(f130126d, this, null, prepareOp.affected);
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        @dl.e
        protected final LockFreeLinkedListNode h() {
            return (LockFreeLinkedListNode) this._affectedNode;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        @dl.d
        /* JADX INFO: renamed from: i, reason: from getter */
        protected final LockFreeLinkedListNode getQueue() {
            return this.queue;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        protected boolean l(@dl.d LockFreeLinkedListNode affected, @dl.d Object next) {
            return next != this.queue;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        @dl.e
        protected final LockFreeLinkedListNode m(@dl.d g0 op) {
            return this.queue.G(op);
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        @dl.d
        public Object n(@dl.d LockFreeLinkedListNode affected, @dl.d LockFreeLinkedListNode next) {
            T t10 = this.node;
            androidx.concurrent.futures.a.a(LockFreeLinkedListNode.f130124c, t10, t10, affected);
            T t11 = this.node;
            androidx.concurrent.futures.a.a(LockFreeLinkedListNode.f130123b, t11, t11, this.queue);
            return this.node;
        }
    }

    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0013\u0012\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u0018\u0010\u000b\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$c;", "Lkotlinx/coroutines/internal/d;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "failure", "Lkotlin/b2;", "j", "b", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "newNode", ak.aF, "oldNext", "<init>", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    @kotlin.r0
    public static abstract class c extends d<LockFreeLinkedListNode> {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final LockFreeLinkedListNode newNode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.e
        @xh.e
        public LockFreeLinkedListNode oldNext;

        public c(@dl.d LockFreeLinkedListNode lockFreeLinkedListNode) {
            this.newNode = lockFreeLinkedListNode;
        }

        @Override // kotlinx.coroutines.internal.d
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void d(@dl.d LockFreeLinkedListNode lockFreeLinkedListNode, @dl.e Object obj) {
            boolean z10 = obj == null;
            LockFreeLinkedListNode lockFreeLinkedListNode2 = z10 ? this.newNode : this.oldNext;
            if (lockFreeLinkedListNode2 != null && androidx.concurrent.futures.a.a(LockFreeLinkedListNode.f130123b, lockFreeLinkedListNode, this, lockFreeLinkedListNode2) && z10) {
                LockFreeLinkedListNode lockFreeLinkedListNode3 = this.newNode;
                LockFreeLinkedListNode lockFreeLinkedListNode4 = this.oldNext;
                kotlin.jvm.internal.f0.m(lockFreeLinkedListNode4);
                lockFreeLinkedListNode3.M(lockFreeLinkedListNode4);
            }
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.LockFreeLinkedListNode$d, reason: from toString */
    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0003\u001a\u00060\tj\u0002`\n\u0012\n\u0010\u000e\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0018\u0010\u0003\u001a\u00060\tj\u0002`\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u00060\tj\u0002`\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0018\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0013¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$d;", "Lkotlinx/coroutines/internal/g0;", "", "affected", ak.aF, "Lkotlin/b2;", "d", "", "toString", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", ak.av, "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "b", "next", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$a;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$a;", SocialConstants.PARAM_APP_DESC, "Lkotlinx/coroutines/internal/d;", "()Lkotlinx/coroutines/internal/d;", "atomicOp", "<init>", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$a;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class PrepareOp extends g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final LockFreeLinkedListNode affected;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final LockFreeLinkedListNode next;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final a desc;

        public PrepareOp(@dl.d LockFreeLinkedListNode lockFreeLinkedListNode, @dl.d LockFreeLinkedListNode lockFreeLinkedListNode2, @dl.d a aVar) {
            this.affected = lockFreeLinkedListNode;
            this.next = lockFreeLinkedListNode2;
            this.desc = aVar;
        }

        @Override // kotlinx.coroutines.internal.g0
        @dl.d
        public d<?> a() {
            return this.desc.b();
        }

        @Override // kotlinx.coroutines.internal.g0
        @dl.e
        public Object c(@dl.e Object affected) {
            Object objN;
            if (affected == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            }
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) affected;
            Object objJ = this.desc.j(this);
            Object obj = x.f130208a;
            if (objJ == obj) {
                LockFreeLinkedListNode lockFreeLinkedListNode2 = this.next;
                if (androidx.concurrent.futures.a.a(LockFreeLinkedListNode.f130123b, lockFreeLinkedListNode, this, lockFreeLinkedListNode2.g0())) {
                    this.desc.k(lockFreeLinkedListNode);
                    lockFreeLinkedListNode2.G(null);
                }
                return obj;
            }
            Object objE = objJ != null ? a().e(objJ) : a().get_consensus();
            if (objE == kotlinx.coroutines.internal.c.f130152a) {
                objN = a();
            } else {
                objN = objE == null ? this.desc.n(lockFreeLinkedListNode, this.next) : this.next;
            }
            androidx.concurrent.futures.a.a(LockFreeLinkedListNode.f130123b, lockFreeLinkedListNode, this, objN);
            return null;
        }

        public final void d() {
            this.desc.g(this);
        }

        @Override // kotlinx.coroutines.internal.g0
        @dl.d
        public String toString() {
            return "PrepareOp(op=" + a() + ')';
        }
    }

    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\n\u0010\u001c\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b'\u0010(J\u001f\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0010\t\u001a\u00060\u0005j\u0002`\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\u000e2\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\r\u001a\u00020\nH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\n\u0010\r\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\u00132\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\n\u0010\r\u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u00060\u0005j\u0002`\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010!\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010$\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001c\u0010&\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#¨\u0006)"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$e;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$a;", "Lkotlinx/coroutines/internal/g0;", "op", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "m", "(Lkotlinx/coroutines/internal/g0;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "affected", "", "e", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "next", "", "l", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$d;", "prepareOp", "Lkotlin/b2;", "g", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode$d;)V", "n", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "f", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "b", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "queue", "o", "()Ljava/lang/Object;", "getResult$annotations", "()V", "result", RXScreenCaptureService.KEY_HEIGHT, "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "affectedNode", "i", "originalNext", "<init>", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static class e<T> extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f130134c = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_affectedNode");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f130135d = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_originalNext");

        @dl.d
        private volatile /* synthetic */ Object _affectedNode = null;

        @dl.d
        private volatile /* synthetic */ Object _originalNext = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final LockFreeLinkedListNode queue;

        public e(@dl.d LockFreeLinkedListNode lockFreeLinkedListNode) {
            this.queue = lockFreeLinkedListNode;
        }

        public static /* synthetic */ void p() {
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        @dl.e
        protected Object e(@dl.d LockFreeLinkedListNode affected) {
            if (affected == this.queue) {
                return w.d();
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        protected final void f(@dl.d LockFreeLinkedListNode affected, @dl.d LockFreeLinkedListNode next) {
            next.G(null);
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        public void g(@dl.d PrepareOp prepareOp) {
            androidx.concurrent.futures.a.a(f130134c, this, null, prepareOp.affected);
            androidx.concurrent.futures.a.a(f130135d, this, null, prepareOp.next);
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        @dl.e
        protected final LockFreeLinkedListNode h() {
            return (LockFreeLinkedListNode) this._affectedNode;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        @dl.e
        /* JADX INFO: renamed from: i */
        protected final LockFreeLinkedListNode getQueue() {
            return (LockFreeLinkedListNode) this._originalNext;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        protected final boolean l(@dl.d LockFreeLinkedListNode affected, @dl.d Object next) {
            if (!(next instanceof i0)) {
                return false;
            }
            ((i0) next).ref.R();
            return true;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        @dl.e
        protected final LockFreeLinkedListNode m(@dl.d g0 op) {
            LockFreeLinkedListNode lockFreeLinkedListNode = this.queue;
            while (true) {
                Object obj = lockFreeLinkedListNode._next;
                if (!(obj instanceof g0)) {
                    return (LockFreeLinkedListNode) obj;
                }
                g0 g0Var = (g0) obj;
                if (op.b(g0Var)) {
                    return null;
                }
                g0Var.c(this.queue);
            }
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        @dl.d
        public final Object n(@dl.d LockFreeLinkedListNode affected, @dl.d LockFreeLinkedListNode next) {
            return next.g0();
        }

        public final T o() {
            T t10 = (T) h();
            kotlin.jvm.internal.f0.m(t10);
            return t10;
        }
    }

    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/internal/LockFreeLinkedListNode$f", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$c;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "k", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class f extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ yh.a<Boolean> f130137d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(LockFreeLinkedListNode lockFreeLinkedListNode, yh.a<Boolean> aVar) {
            super(lockFreeLinkedListNode);
            this.f130137d = aVar;
        }

        @Override // kotlinx.coroutines.internal.d
        @dl.e
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Object i(@dl.d LockFreeLinkedListNode affected) {
            if (this.f130137d.invoke().booleanValue()) {
                return null;
            }
            return w.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LockFreeLinkedListNode G(g0 op) {
        Object obj;
        while (true) {
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) this._prev;
            LockFreeLinkedListNode lockFreeLinkedListNode2 = lockFreeLinkedListNode;
            while (true) {
                LockFreeLinkedListNode lockFreeLinkedListNode3 = null;
                while (true) {
                    obj = lockFreeLinkedListNode2._next;
                    if (obj == this) {
                        if (lockFreeLinkedListNode != lockFreeLinkedListNode2 && !androidx.concurrent.futures.a.a(f130124c, this, lockFreeLinkedListNode, lockFreeLinkedListNode2)) {
                            break;
                        }
                        return lockFreeLinkedListNode2;
                    }
                    if (S()) {
                        return null;
                    }
                    if (obj == op) {
                        return lockFreeLinkedListNode2;
                    }
                    if (obj instanceof g0) {
                        if (op != null && op.b((g0) obj)) {
                            return null;
                        }
                        ((g0) obj).c(lockFreeLinkedListNode2);
                        break;
                    }
                    if (!(obj instanceof i0)) {
                        lockFreeLinkedListNode3 = lockFreeLinkedListNode2;
                        lockFreeLinkedListNode2 = (LockFreeLinkedListNode) obj;
                    } else {
                        if (lockFreeLinkedListNode3 != null) {
                            break;
                        }
                        lockFreeLinkedListNode2 = (LockFreeLinkedListNode) lockFreeLinkedListNode2._prev;
                    }
                }
                if (!androidx.concurrent.futures.a.a(f130123b, lockFreeLinkedListNode3, lockFreeLinkedListNode2, ((i0) obj).ref)) {
                    break;
                }
                lockFreeLinkedListNode2 = lockFreeLinkedListNode3;
            }
        }
    }

    private final LockFreeLinkedListNode J(LockFreeLinkedListNode current) {
        while (current.S()) {
            current = (LockFreeLinkedListNode) current._prev;
        }
        return current;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(LockFreeLinkedListNode next) {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        do {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) next._prev;
            if (N() != next) {
                return;
            }
        } while (!androidx.concurrent.futures.a.a(f130124c, next, lockFreeLinkedListNode, this));
        if (S()) {
            next.G(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i0 g0() {
        i0 i0Var = (i0) this._removedRef;
        if (i0Var != null) {
            return i0Var;
        }
        i0 i0Var2 = new i0(this);
        f130125d.lazySet(this, i0Var2);
        return i0Var2;
    }

    public final boolean A(@dl.d LockFreeLinkedListNode node, @dl.d yh.l<? super LockFreeLinkedListNode, Boolean> predicate) {
        LockFreeLinkedListNode lockFreeLinkedListNodeP;
        do {
            lockFreeLinkedListNodeP = P();
            if (!predicate.invoke(lockFreeLinkedListNodeP).booleanValue()) {
                return false;
            }
        } while (!lockFreeLinkedListNodeP.E(node, this));
        return true;
    }

    public final boolean C(@dl.d LockFreeLinkedListNode node, @dl.d yh.l<? super LockFreeLinkedListNode, Boolean> predicate, @dl.d yh.a<Boolean> condition) {
        int iH0;
        f fVar = new f(node, condition);
        do {
            LockFreeLinkedListNode lockFreeLinkedListNodeP = P();
            if (!predicate.invoke(lockFreeLinkedListNodeP).booleanValue()) {
                return false;
            }
            iH0 = lockFreeLinkedListNodeP.h0(node, this, fVar);
            if (iH0 == 1) {
                return true;
            }
        } while (iH0 != 2);
        return false;
    }

    @kotlin.r0
    public final boolean E(@dl.d LockFreeLinkedListNode node, @dl.d LockFreeLinkedListNode next) {
        f130124c.lazySet(node, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f130123b;
        atomicReferenceFieldUpdater.lazySet(node, next);
        if (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, next, node)) {
            return false;
        }
        node.M(next);
        return true;
    }

    public final boolean F(@dl.d LockFreeLinkedListNode node) {
        f130124c.lazySet(node, this);
        f130123b.lazySet(node, this);
        while (N() == this) {
            if (androidx.concurrent.futures.a.a(f130123b, this, this, node)) {
                node.M(this);
                return true;
            }
        }
        return false;
    }

    @dl.d
    public final <T extends LockFreeLinkedListNode> b<T> H(@dl.d T node) {
        return new b<>(this, node);
    }

    @dl.d
    public final e<LockFreeLinkedListNode> I() {
        return new e<>(this);
    }

    @dl.d
    public final Object N() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof g0)) {
                return obj;
            }
            ((g0) obj).c(this);
        }
    }

    @dl.d
    public final LockFreeLinkedListNode O() {
        return w.h(N());
    }

    @dl.d
    public final LockFreeLinkedListNode P() {
        LockFreeLinkedListNode lockFreeLinkedListNodeG = G(null);
        return lockFreeLinkedListNodeG == null ? J((LockFreeLinkedListNode) this._prev) : lockFreeLinkedListNodeG;
    }

    public final void Q() {
        ((i0) N()).ref.R();
    }

    @kotlin.r0
    public final void R() {
        LockFreeLinkedListNode lockFreeLinkedListNode = this;
        while (true) {
            Object objN = lockFreeLinkedListNode.N();
            if (!(objN instanceof i0)) {
                lockFreeLinkedListNode.G(null);
                return;
            }
            lockFreeLinkedListNode = ((i0) objN).ref;
        }
    }

    public boolean S() {
        return N() instanceof i0;
    }

    @dl.d
    @kotlin.r0
    public final c T(@dl.d LockFreeLinkedListNode node, @dl.d yh.a<Boolean> condition) {
        return new f(node, condition);
    }

    @dl.e
    protected LockFreeLinkedListNode X() {
        Object objN = N();
        i0 i0Var = objN instanceof i0 ? (i0) objN : null;
        if (i0Var != null) {
            return i0Var.ref;
        }
        return null;
    }

    public boolean Z() {
        return f0() == null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object, kotlinx.coroutines.internal.LockFreeLinkedListNode] */
    public final /* synthetic */ <T> T a0(yh.l<? super T, Boolean> predicate) {
        LockFreeLinkedListNode lockFreeLinkedListNodeF0;
        while (true) {
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) N();
            if (lockFreeLinkedListNode == this) {
                return null;
            }
            kotlin.jvm.internal.f0.y(3, androidx.exifinterface.media.a.f23244d5);
            if (!(lockFreeLinkedListNode instanceof Object)) {
                return null;
            }
            if ((predicate.invoke(lockFreeLinkedListNode).booleanValue() && !lockFreeLinkedListNode.S()) || (lockFreeLinkedListNodeF0 = lockFreeLinkedListNode.f0()) == null) {
                return lockFreeLinkedListNode;
            }
            lockFreeLinkedListNodeF0.R();
        }
    }

    @dl.e
    public final LockFreeLinkedListNode b0() {
        while (true) {
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) N();
            if (lockFreeLinkedListNode == this) {
                return null;
            }
            if (lockFreeLinkedListNode.Z()) {
                return lockFreeLinkedListNode;
            }
            lockFreeLinkedListNode.Q();
        }
    }

    @kotlin.r0
    @dl.e
    public final LockFreeLinkedListNode f0() {
        Object objN;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        do {
            objN = N();
            if (objN instanceof i0) {
                return ((i0) objN).ref;
            }
            if (objN == this) {
                return (LockFreeLinkedListNode) objN;
            }
            lockFreeLinkedListNode = (LockFreeLinkedListNode) objN;
        } while (!androidx.concurrent.futures.a.a(f130123b, this, objN, lockFreeLinkedListNode.g0()));
        lockFreeLinkedListNode.G(null);
        return null;
    }

    @kotlin.r0
    public final int h0(@dl.d LockFreeLinkedListNode node, @dl.d LockFreeLinkedListNode next, @dl.d c condAdd) {
        f130124c.lazySet(node, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f130123b;
        atomicReferenceFieldUpdater.lazySet(node, next);
        condAdd.oldNext = next;
        if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, next, condAdd)) {
            return condAdd.c(this) == null ? 1 : 2;
        }
        return 0;
    }

    public final void i0(@dl.d LockFreeLinkedListNode prev, @dl.d LockFreeLinkedListNode next) {
    }

    @dl.d
    public String toString() {
        return new PropertyReference0Impl(this) { // from class: kotlinx.coroutines.internal.LockFreeLinkedListNode.toString.1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.o
            @dl.e
            public Object get() {
                return kotlinx.coroutines.t0.a(this.receiver);
            }
        } + '@' + kotlinx.coroutines.t0.b(this);
    }

    public final void y(@dl.d LockFreeLinkedListNode node) {
        while (!P().E(node, this)) {
        }
    }

    public final boolean z(@dl.d LockFreeLinkedListNode node, @dl.d yh.a<Boolean> condition) {
        int iH0;
        f fVar = new f(node, condition);
        do {
            iH0 = P().h0(node, this, fVar);
            if (iH0 == 1) {
                return true;
            }
        } while (iH0 != 2);
        return false;
    }
}
