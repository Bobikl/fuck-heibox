package kotlinx.coroutines.channels;

import com.max.hblogistics.AddressListActivity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.s0;
import kotlin.t0;
import kotlinx.coroutines.h1;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.n0;
import kotlinx.coroutines.internal.o0;

/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0007U(VW+XYB)\u0012 \u0010R\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0013\u0018\u00010Pj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`Q¢\u0006\u0004\bS\u0010TJ!\u0010\u0007\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002JT\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0001\u0010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00052$\u0010\u0012\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015JZ\u0010\u0017\u001a\u00020\u0013\"\u0004\b\u0001\u0010\u0004* \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JT\u0010\u0019\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2$\u0010\u0012\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001d\u001a\u00020\u00132\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0010H\u0014J\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00102\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0014J\u0013\u0010 \u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0014J\"\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b$\u0010!J\u001c\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000#ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0001\u0010%J\u0012\u0010(\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010&H\u0007J\u0016\u0010+\u001a\u00020\u00132\u000e\u0010'\u001a\n\u0018\u00010)j\u0004\u0018\u0001`*J\u0019\u0010,\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010&H\u0000¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u000bH\u0014J/\u00105\u001a\u00020\u00132\f\u00102\u001a\b\u0012\u0004\u0012\u000201002\n\u00104\u001a\u0006\u0012\u0002\b\u000303H\u0014ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00028\u000007H\u0086\u0002J\u000e\u0010:\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0004J\u0010\u0010<\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010;H\u0014J\b\u0010=\u001a\u00020\u0013H\u0014J\b\u0010>\u001a\u00020\u0013H\u0014R\u0014\u0010A\u001a\u00020\u000b8$X¤\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020\u000b8$X¤\u0004¢\u0006\u0006\u001a\u0004\bB\u0010@R\u0014\u0010E\u001a\u00020\u000b8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bD\u0010@R\u0014\u0010F\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010@R\u0014\u0010G\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010@R\u0014\u0010I\u001a\u00020\u000b8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bH\u0010@R\u0017\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000J8F¢\u0006\u0006\u001a\u0004\bK\u0010LR \u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#0J8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\bN\u0010L\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006Z"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/b;", "Lkotlinx/coroutines/channels/k;", "R", "", "receiveMode", "p0", "(ILkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/x;", "receive", "", "c0", "Lkotlinx/coroutines/selects/f;", AddressListActivity.N, "Lkotlin/Function2;", "", "Lkotlin/coroutines/c;", "block", "Lkotlin/b2;", "q0", "(Lkotlinx/coroutines/selects/f;ILyh/p;)V", "value", "s0", "(Lyh/p;Lkotlinx/coroutines/selects/f;ILjava/lang/Object;)V", "e0", "(Lkotlinx/coroutines/selects/f;Lyh/p;I)Z", "Lkotlinx/coroutines/p;", "cont", "r0", "n0", "o0", RXScreenCaptureService.KEY_HEIGHT, "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "d0", "Lkotlinx/coroutines/channels/n;", "H", "()Ljava/lang/Object;", "", "cause", "b", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "e", "a0", "(Ljava/lang/Throwable;)Z", "wasClosed", "j0", "Lkotlinx/coroutines/internal/p;", "Lkotlinx/coroutines/channels/a0;", "list", "Lkotlinx/coroutines/channels/p;", "closed", "k0", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/p;)V", "Lkotlinx/coroutines/channels/ChannelIterator;", "iterator", "Lkotlinx/coroutines/channels/AbstractChannel$g;", "b0", "Lkotlinx/coroutines/channels/y;", "Q", "m0", "l0", "g0", "()Z", "isBufferAlwaysEmpty", "h0", "isBufferEmpty", "f0", "hasReceiveOrClosed", "isClosedForReceive", "isEmpty", "i0", "isEmptyImpl", "Lkotlinx/coroutines/selects/d;", androidx.exifinterface.media.a.f23244d5, "()Lkotlinx/coroutines/selects/d;", "onReceive", "y", "onReceiveCatching", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lyh/l;)V", ak.av, ak.aF, "d", "f", "g", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class AbstractChannel<E> extends kotlinx.coroutines.channels.b<E> implements k<E> {

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0013\u0010\u0007\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0005H\u0096Bø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\n\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$a;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/ChannelIterator;", "", "result", "", "e", "f", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "b", "next", "()Ljava/lang/Object;", "Lkotlinx/coroutines/channels/AbstractChannel;", ak.av, "Lkotlinx/coroutines/channels/AbstractChannel;", "channel", "Ljava/lang/Object;", "d", "g", "(Ljava/lang/Object;)V", "<init>", "(Lkotlinx/coroutines/channels/AbstractChannel;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a<E> implements ChannelIterator<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final AbstractChannel<E> channel;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private Object result = kotlinx.coroutines.channels.a.f129026f;

        public a(@dl.d AbstractChannel<E> abstractChannel) {
            this.channel = abstractChannel;
        }

        private final boolean e(Object result) throws Throwable {
            if (!(result instanceof p)) {
                return true;
            }
            p pVar = (p) result;
            if (pVar.closeCause == null) {
                return false;
            }
            throw n0.p(pVar.t0());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object f(kotlin.coroutines.c<? super Boolean> cVar) {
            kotlinx.coroutines.q qVarB = kotlinx.coroutines.s.b(IntrinsicsKt__IntrinsicsJvmKt.d(cVar));
            d dVar = new d(this, qVarB);
            while (true) {
                if (this.channel.c0(dVar)) {
                    this.channel.r0(qVarB, dVar);
                    break;
                }
                Object objN0 = this.channel.n0();
                g(objN0);
                if (objN0 instanceof p) {
                    p pVar = (p) objN0;
                    if (pVar.closeCause != null) {
                        Result.a aVar = Result.f124476c;
                        qVarB.resumeWith(Result.b(t0.a(pVar.t0())));
                        break;
                    }
                    Result.a aVar2 = Result.f124476c;
                    qVarB.resumeWith(Result.b(kotlin.coroutines.jvm.internal.a.a(false)));
                    break;
                }
                if (objN0 != kotlinx.coroutines.channels.a.f129026f) {
                    Boolean boolA = kotlin.coroutines.jvm.internal.a.a(true);
                    yh.l<E, b2> lVar = this.channel.f129030b;
                    qVarB.I0(boolA, lVar != null ? OnUndeliveredElementKt.a(lVar, objN0, qVarB.getContext()) : null);
                    break;
                }
            }
            Object objT = qVarB.t();
            if (objT == kotlin.coroutines.intrinsics.b.h()) {
                kotlin.coroutines.jvm.internal.f.c(cVar);
            }
            return objT;
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        @xh.h(name = "next")
        public /* synthetic */ Object a(kotlin.coroutines.c cVar) {
            return ChannelIterator.DefaultImpls.a(this, cVar);
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        @dl.e
        public Object b(@dl.d kotlin.coroutines.c<? super Boolean> cVar) {
            Object obj = this.result;
            o0 o0Var = kotlinx.coroutines.channels.a.f129026f;
            if (obj != o0Var) {
                return kotlin.coroutines.jvm.internal.a.a(e(obj));
            }
            Object objN0 = this.channel.n0();
            this.result = objN0;
            return objN0 != o0Var ? kotlin.coroutines.jvm.internal.a.a(e(objN0)) : f(cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: d, reason: from getter */
        public final Object getResult() {
            return this.result;
        }

        public final void g(@dl.e Object obj) {
            this.result = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.channels.ChannelIterator
        public E next() throws Throwable {
            E e10 = (E) this.result;
            if (e10 instanceof p) {
                throw n0.p(((p) e10).t0());
            }
            o0 o0Var = kotlinx.coroutines.channels.a.f129026f;
            if (e10 == o0Var) {
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            this.result = o0Var;
            return e10;
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0012\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001f\u0012\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00028\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0011\u001a\u00020\f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$b;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/x;", "value", "", "o0", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$d;", "otherOp", "Lkotlinx/coroutines/internal/o0;", "n", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$d;)Lkotlinx/coroutines/internal/o0;", "Lkotlin/b2;", "e", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/channels/p;", "closed", "m0", "", "toString", "Lkotlinx/coroutines/p;", "Lkotlinx/coroutines/p;", "cont", "", "f", "I", "receiveMode", "<init>", "(Lkotlinx/coroutines/p;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static class b<E> extends x<E> {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final kotlinx.coroutines.p<Object> cont;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public final int receiveMode;

        public b(@dl.d kotlinx.coroutines.p<Object> pVar, int i10) {
            this.cont = pVar;
            this.receiveMode = i10;
        }

        @Override // kotlinx.coroutines.channels.y
        public void e(E value) {
            this.cont.V(kotlinx.coroutines.r.f130311d);
        }

        @Override // kotlinx.coroutines.channels.x
        public void m0(@dl.d p<?> pVar) {
            if (this.receiveMode != 1) {
                kotlinx.coroutines.p<Object> pVar2 = this.cont;
                Result.a aVar = Result.f124476c;
                pVar2.resumeWith(Result.b(t0.a(pVar.t0())));
            } else {
                kotlinx.coroutines.p<Object> pVar3 = this.cont;
                n nVarB = n.b(n.INSTANCE.a(pVar.closeCause));
                Result.a aVar2 = Result.f124476c;
                pVar3.resumeWith(Result.b(nVarB));
            }
        }

        @Override // kotlinx.coroutines.channels.y
        @dl.e
        public o0 n(E value, @dl.e LockFreeLinkedListNode.PrepareOp otherOp) {
            if (this.cont.D(o0(value), otherOp != null ? otherOp.desc : null, k0(value)) == null) {
                return null;
            }
            if (otherOp != null) {
                otherOp.d();
            }
            return kotlinx.coroutines.r.f130311d;
        }

        @dl.e
        public final Object o0(E value) {
            return this.receiveMode == 1 ? n.b(n.INSTANCE.c(value)) : value;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @dl.d
        public String toString() {
            return "ReceiveElement@" + kotlinx.coroutines.t0.b(this) + "[receiveMode=" + this.receiveMode + ']';
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00010\u0002B=\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00028\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$c;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/AbstractChannel$b;", "value", "Lkotlin/Function1;", "", "Lkotlin/b2;", "k0", "(Ljava/lang/Object;)Lyh/l;", "Lkotlinx/coroutines/p;", "", "cont", "", "receiveMode", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lkotlinx/coroutines/p;ILyh/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class c<E> extends b<E> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @dl.d
        @xh.e
        public final yh.l<E, b2> f128757g;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@dl.d kotlinx.coroutines.p<Object> pVar, int i10, @dl.d yh.l<? super E, b2> lVar) {
            super(pVar, i10);
            this.f128757g = lVar;
        }

        @Override // kotlinx.coroutines.channels.x
        @dl.e
        public yh.l<Throwable, b2> k0(E value) {
            return OnUndeliveredElementKt.a(this.f128757g, value, this.cont.getContext());
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B#\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00028\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u000e\u001a\u00020\t2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$d;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/x;", "value", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$d;", "otherOp", "Lkotlinx/coroutines/internal/o0;", "n", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$d;)Lkotlinx/coroutines/internal/o0;", "Lkotlin/b2;", "e", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/channels/p;", "closed", "m0", "Lkotlin/Function1;", "", "k0", "(Ljava/lang/Object;)Lyh/l;", "", "toString", "Lkotlinx/coroutines/channels/AbstractChannel$a;", "Lkotlinx/coroutines/channels/AbstractChannel$a;", "iterator", "Lkotlinx/coroutines/p;", "", "f", "Lkotlinx/coroutines/p;", "cont", "<init>", "(Lkotlinx/coroutines/channels/AbstractChannel$a;Lkotlinx/coroutines/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static class d<E> extends x<E> {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final a<E> iterator;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final kotlinx.coroutines.p<Boolean> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@dl.d a<E> aVar, @dl.d kotlinx.coroutines.p<? super Boolean> pVar) {
            this.iterator = aVar;
            this.cont = pVar;
        }

        @Override // kotlinx.coroutines.channels.y
        public void e(E value) {
            this.iterator.g(value);
            this.cont.V(kotlinx.coroutines.r.f130311d);
        }

        @Override // kotlinx.coroutines.channels.x
        @dl.e
        public yh.l<Throwable, b2> k0(E value) {
            yh.l<E, b2> lVar = this.iterator.channel.f129030b;
            if (lVar != null) {
                return OnUndeliveredElementKt.a(lVar, value, this.cont.getContext());
            }
            return null;
        }

        @Override // kotlinx.coroutines.channels.x
        public void m0(@dl.d p<?> pVar) {
            Object objB = pVar.closeCause == null ? kotlinx.coroutines.p.a.b(this.cont, Boolean.FALSE, null, 2, null) : this.cont.c0(pVar.t0());
            if (objB != null) {
                this.iterator.g(pVar);
                this.cont.V(objB);
            }
        }

        @Override // kotlinx.coroutines.channels.y
        @dl.e
        public o0 n(E value, @dl.e LockFreeLinkedListNode.PrepareOp otherOp) {
            if (this.cont.D(Boolean.TRUE, otherOp != null ? otherOp.desc : null, k0(value)) == null) {
                return null;
            }
            if (otherOp != null) {
                otherOp.d();
            }
            return kotlinx.coroutines.r.f130311d;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @dl.d
        public String toString() {
            return "ReceiveHasNext@" + kotlinx.coroutines.t0.b(this);
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @Metadata(bv = {}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\b\u0012\u0004\u0012\u00028\u00020\u00032\u00020\u0004BT\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00020\u0018\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b\u0012$\u0010&\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010%\u0012\u0006\u0012\u0004\u0018\u00010$0#\u0012\u0006\u0010\"\u001a\u00020\u001fø\u0001\u0000¢\u0006\u0004\b'\u0010(J#\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00028\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0010\u001a\u00020\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$e;", "R", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/x;", "Lkotlinx/coroutines/h1;", "value", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$d;", "otherOp", "Lkotlinx/coroutines/internal/o0;", "n", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$d;)Lkotlinx/coroutines/internal/o0;", "Lkotlin/b2;", "e", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/channels/p;", "closed", "m0", "dispose", "Lkotlin/Function1;", "", "k0", "(Ljava/lang/Object;)Lyh/l;", "", "toString", "Lkotlinx/coroutines/channels/AbstractChannel;", "Lkotlinx/coroutines/channels/AbstractChannel;", "channel", "Lkotlinx/coroutines/selects/f;", "f", "Lkotlinx/coroutines/selects/f;", AddressListActivity.N, "", RXScreenCaptureService.KEY_HEIGHT, "I", "receiveMode", "Lkotlin/Function2;", "", "Lkotlin/coroutines/c;", "block", "<init>", "(Lkotlinx/coroutines/channels/AbstractChannel;Lkotlinx/coroutines/selects/f;Lyh/p;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class e<R, E> extends x<E> implements h1 {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final AbstractChannel<E> channel;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final kotlinx.coroutines.selects.f<R> select;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @dl.d
        @xh.e
        public final yh.p<Object, kotlin.coroutines.c<? super R>, Object> f128762g;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public final int receiveMode;

        /* JADX WARN: Multi-variable type inference failed */
        public e(@dl.d AbstractChannel<E> abstractChannel, @dl.d kotlinx.coroutines.selects.f<? super R> fVar, @dl.d yh.p<Object, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar, int i10) {
            this.channel = abstractChannel;
            this.select = fVar;
            this.f128762g = pVar;
            this.receiveMode = i10;
        }

        @Override // kotlinx.coroutines.h1
        public void dispose() {
            if (Z()) {
                this.channel.l0();
            }
        }

        @Override // kotlinx.coroutines.channels.y
        public void e(E value) throws Throwable {
            bj.a.e(this.f128762g, this.receiveMode == 1 ? n.b(n.INSTANCE.c(value)) : value, this.select.r(), k0(value));
        }

        @Override // kotlinx.coroutines.channels.x
        @dl.e
        public yh.l<Throwable, b2> k0(E value) {
            yh.l<E, b2> lVar = this.channel.f129030b;
            if (lVar != null) {
                return OnUndeliveredElementKt.a(lVar, value, this.select.r().getContext());
            }
            return null;
        }

        @Override // kotlinx.coroutines.channels.x
        public void m0(@dl.d p<?> pVar) throws Throwable {
            if (this.select.q()) {
                int i10 = this.receiveMode;
                if (i10 == 0) {
                    this.select.s(pVar.t0());
                } else {
                    if (i10 != 1) {
                        return;
                    }
                    bj.a.f(this.f128762g, n.b(n.INSTANCE.a(pVar.closeCause)), this.select.r(), null, 4, null);
                }
            }
        }

        @Override // kotlinx.coroutines.channels.y
        @dl.e
        public o0 n(E value, @dl.e LockFreeLinkedListNode.PrepareOp otherOp) {
            return (o0) this.select.i(otherOp);
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @dl.d
        public String toString() {
            return "ReceiveSelect@" + kotlinx.coroutines.t0.b(this) + '[' + this.select + ",receiveMode=" + this.receiveMode + ']';
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$f;", "Lkotlinx/coroutines/f;", "", "cause", "Lkotlin/b2;", ak.av, "", "toString", "Lkotlinx/coroutines/channels/x;", "b", "Lkotlinx/coroutines/channels/x;", "receive", "<init>", "(Lkotlinx/coroutines/channels/AbstractChannel;Lkotlinx/coroutines/channels/x;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public final class f extends kotlinx.coroutines.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final x<?> receive;

        public f(x<?> xVar) {
            this.receive = xVar;
        }

        @Override // kotlinx.coroutines.o
        public void a(@dl.e Throwable th2) {
            if (this.receive.Z()) {
                AbstractChannel.this.l0();
            }
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
            a(th2);
            return b2.f124493a;
        }

        @dl.d
        public String toString() {
            return "RemoveReceiveOnCancel[" + this.receive + ']';
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$g;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$e;", "Lkotlinx/coroutines/channels/a0;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "affected", "", "e", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$d;", "Lkotlinx/coroutines/internal/PrepareOp;", "prepareOp", "j", "Lkotlin/b2;", "k", "Lkotlinx/coroutines/internal/v;", "queue", "<init>", "(Lkotlinx/coroutines/internal/v;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class g<E> extends LockFreeLinkedListNode.e<a0> {
        public g(@dl.d kotlinx.coroutines.internal.v vVar) {
            super(vVar);
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.e, kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        @dl.e
        protected Object e(@dl.d LockFreeLinkedListNode affected) {
            if (affected instanceof p) {
                return affected;
            }
            if (affected instanceof a0) {
                return null;
            }
            return kotlinx.coroutines.channels.a.f129026f;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        @dl.e
        public Object j(@dl.d LockFreeLinkedListNode.PrepareOp prepareOp) {
            o0 o0VarO0 = ((a0) prepareOp.affected).o0(prepareOp);
            if (o0VarO0 == null) {
                return kotlinx.coroutines.internal.x.f130208a;
            }
            Object obj = kotlinx.coroutines.internal.c.f130153b;
            if (o0VarO0 == obj) {
                return obj;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        public void k(@dl.d LockFreeLinkedListNode lockFreeLinkedListNode) {
            ((a0) lockFreeLinkedListNode).p0();
        }
    }

    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/internal/LockFreeLinkedListNode$f", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$c;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "k", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class h extends LockFreeLinkedListNode.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractChannel f128766d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(LockFreeLinkedListNode lockFreeLinkedListNode, AbstractChannel abstractChannel) {
            super(lockFreeLinkedListNode);
            this.f128766d = abstractChannel;
        }

        @Override // kotlinx.coroutines.internal.d
        @dl.e
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Object i(@dl.d LockFreeLinkedListNode affected) {
            if (this.f128766d.h0()) {
                return null;
            }
            return kotlinx.coroutines.internal.w.a();
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @Metadata(bv = {}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001JJ\u0010\n\u001a\u00020\t\"\u0004\b\u0001\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"kotlinx/coroutines/channels/AbstractChannel$i", "Lkotlinx/coroutines/selects/d;", "R", "Lkotlinx/coroutines/selects/f;", AddressListActivity.N, "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "", "block", "Lkotlin/b2;", "F", "(Lkotlinx/coroutines/selects/f;Lyh/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class i implements kotlinx.coroutines.selects.d<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractChannel<E> f128767b;

        i(AbstractChannel<E> abstractChannel) {
            this.f128767b = abstractChannel;
        }

        @Override // kotlinx.coroutines.selects.d
        public <R> void F(@dl.d kotlinx.coroutines.selects.f<? super R> select, @dl.d yh.p<? super E, ? super kotlin.coroutines.c<? super R>, ? extends Object> block) throws Throwable {
            this.f128767b.q0(select, 0, block);
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @Metadata(bv = {}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001JS\u0010\u000b\u001a\u00020\n\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042(\u0010\t\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0016ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"kotlinx/coroutines/channels/AbstractChannel$j", "Lkotlinx/coroutines/selects/d;", "Lkotlinx/coroutines/channels/n;", "R", "Lkotlinx/coroutines/selects/f;", AddressListActivity.N, "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "", "block", "Lkotlin/b2;", "F", "(Lkotlinx/coroutines/selects/f;Lyh/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class j implements kotlinx.coroutines.selects.d<n<? extends E>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractChannel<E> f128768b;

        j(AbstractChannel<E> abstractChannel) {
            this.f128768b = abstractChannel;
        }

        @Override // kotlinx.coroutines.selects.d
        public <R> void F(@dl.d kotlinx.coroutines.selects.f<? super R> select, @dl.d yh.p<? super n<? extends E>, ? super kotlin.coroutines.c<? super R>, ? extends Object> block) throws Throwable {
            this.f128768b.q0(select, 1, block);
        }
    }

    public AbstractChannel(@dl.e yh.l<? super E, b2> lVar) {
        super(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c0(x<? super E> receive) {
        boolean zD0 = d0(receive);
        if (zD0) {
            m0();
        }
        return zD0;
    }

    private final <R> boolean e0(kotlinx.coroutines.selects.f<? super R> select, yh.p<Object, ? super kotlin.coroutines.c<? super R>, ? extends Object> block, int receiveMode) {
        e eVar = new e(this, select, block, receiveMode);
        boolean zC0 = c0(eVar);
        if (zC0) {
            select.p(eVar);
        }
        return zC0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final <R> Object p0(int i10, kotlin.coroutines.c<? super R> cVar) {
        kotlinx.coroutines.q qVarB = kotlinx.coroutines.s.b(IntrinsicsKt__IntrinsicsJvmKt.d(cVar));
        b bVar = this.f129030b == null ? new b(qVarB, i10) : new c(qVarB, i10, this.f129030b);
        while (true) {
            if (c0(bVar)) {
                r0(qVarB, bVar);
                break;
            }
            Object objN0 = n0();
            if (objN0 instanceof p) {
                bVar.m0((p) objN0);
                break;
            }
            if (objN0 != kotlinx.coroutines.channels.a.f129026f) {
                qVarB.I0(bVar.o0(objN0), bVar.k0(objN0));
                break;
            }
        }
        Object objT = qVarB.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> void q0(kotlinx.coroutines.selects.f<? super R> select, int receiveMode, yh.p<Object, ? super kotlin.coroutines.c<? super R>, ? extends Object> block) throws Throwable {
        while (!select.o()) {
            if (!i0()) {
                Object objO0 = o0(select);
                if (objO0 == kotlinx.coroutines.selects.g.d()) {
                    return;
                }
                if (objO0 != kotlinx.coroutines.channels.a.f129026f && objO0 != kotlinx.coroutines.internal.c.f130153b) {
                    s0(block, select, receiveMode, objO0);
                }
            } else if (e0(select, block, receiveMode)) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0(kotlinx.coroutines.p<?> pVar, x<?> xVar) {
        pVar.L(new f(xVar));
    }

    private final <R> void s0(yh.p<Object, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar, kotlinx.coroutines.selects.f<? super R> fVar, int i10, Object obj) throws Throwable {
        boolean z10 = obj instanceof p;
        if (!z10) {
            if (i10 != 1) {
                bj.b.d(pVar, obj, fVar.r());
                return;
            } else {
                n.Companion companion = n.INSTANCE;
                bj.b.d(pVar, n.b(z10 ? companion.a(((p) obj).closeCause) : companion.c(obj)), fVar.r());
                return;
            }
        }
        if (i10 == 0) {
            throw n0.p(((p) obj).t0());
        }
        if (i10 == 1 && fVar.q()) {
            bj.b.d(pVar, n.b(n.INSTANCE.a(((p) obj).closeCause)), fVar.r());
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @dl.d
    public kotlinx.coroutines.selects.d<E> B() {
        return k.a.b(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @dl.d
    public final Object E() {
        Object objN0 = n0();
        if (objN0 == kotlinx.coroutines.channels.a.f129026f) {
            return n.INSTANCE.b();
        }
        return objN0 instanceof p ? n.INSTANCE.a(((p) objN0).closeCause) : n.INSTANCE.c(objN0);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @s0(expression = "receiveCatching().getOrNull()", imports = {}))
    @sh.h
    @dl.e
    public Object G(@dl.d kotlin.coroutines.c<? super E> cVar) {
        return k.a.e(this, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @dl.e
    public final Object H(@dl.d kotlin.coroutines.c<? super n<? extends E>> cVar) throws Throwable {
        AbstractChannel$receiveCatching$1 abstractChannel$receiveCatching$1;
        if (cVar instanceof AbstractChannel$receiveCatching$1) {
            abstractChannel$receiveCatching$1 = (AbstractChannel$receiveCatching$1) cVar;
            int i10 = abstractChannel$receiveCatching$1.f128771d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                abstractChannel$receiveCatching$1.f128771d = i10 - Integer.MIN_VALUE;
            } else {
                abstractChannel$receiveCatching$1 = new AbstractChannel$receiveCatching$1(this, cVar);
            }
        } else {
            abstractChannel$receiveCatching$1 = new AbstractChannel$receiveCatching$1(this, cVar);
        }
        Object objP0 = abstractChannel$receiveCatching$1.f128769b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = abstractChannel$receiveCatching$1.f128771d;
        if (i11 == 0) {
            t0.n(objP0);
            Object objN0 = n0();
            if (objN0 != kotlinx.coroutines.channels.a.f129026f) {
                return objN0 instanceof p ? n.INSTANCE.a(((p) objN0).closeCause) : n.INSTANCE.c(objN0);
            }
            abstractChannel$receiveCatching$1.f128771d = 1;
            objP0 = p0(1, abstractChannel$receiveCatching$1);
            if (objP0 == objH) {
                return objH;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(objP0);
        }
        return ((n) objP0).getHolder();
    }

    @Override // kotlinx.coroutines.channels.b
    @dl.e
    protected y<E> Q() {
        y<E> yVarQ = super.Q();
        if (yVarQ != null && !(yVarQ instanceof p)) {
            l0();
        }
        return yVarQ;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean R() {
        return o() != null && h0();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @dl.d
    public final kotlinx.coroutines.selects.d<E> T() {
        return new i(this);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final boolean b(@dl.e Throwable cause) {
        boolean zU = U(cause);
        j0(zU);
        return zU;
    }

    @dl.d
    protected final g<E> b0() {
        return new g<>(getQueue());
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        e(null);
    }

    protected boolean d0(@dl.d x<? super E> receive) {
        int iH0;
        LockFreeLinkedListNode lockFreeLinkedListNodeP;
        if (!g0()) {
            LockFreeLinkedListNode queue = getQueue();
            h hVar = new h(receive, this);
            do {
                LockFreeLinkedListNode lockFreeLinkedListNodeP2 = queue.P();
                if (!(!(lockFreeLinkedListNodeP2 instanceof a0))) {
                    return false;
                }
                iH0 = lockFreeLinkedListNodeP2.h0(receive, queue, hVar);
                if (iH0 != 1) {
                }
            } while (iH0 != 2);
            return false;
        }
        LockFreeLinkedListNode queue2 = getQueue();
        do {
            lockFreeLinkedListNodeP = queue2.P();
            if (!(!(lockFreeLinkedListNodeP instanceof a0))) {
                return false;
            }
        } while (!lockFreeLinkedListNodeP.E(receive, queue2));
        return true;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void e(@dl.e CancellationException cancellationException) {
        if (R()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(kotlinx.coroutines.t0.a(this) + " was cancelled");
        }
        b(cancellationException);
    }

    protected final boolean f0() {
        return getQueue().O() instanceof y;
    }

    protected abstract boolean g0();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @dl.e
    public final Object h(@dl.d kotlin.coroutines.c<? super E> cVar) {
        Object objN0 = n0();
        return (objN0 == kotlinx.coroutines.channels.a.f129026f || (objN0 instanceof p)) ? p0(0, cVar) : objN0;
    }

    protected abstract boolean h0();

    protected final boolean i0() {
        return !(getQueue().O() instanceof a0) && h0();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
        return i0();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @dl.d
    public final ChannelIterator<E> iterator() {
        return new a(this);
    }

    protected void j0(boolean z10) {
        p<?> pVarP = p();
        if (pVarP == null) {
            throw new IllegalStateException("Cannot happen".toString());
        }
        Object objC = kotlinx.coroutines.internal.p.c(null, 1, null);
        while (true) {
            LockFreeLinkedListNode lockFreeLinkedListNodeP = pVarP.P();
            if (lockFreeLinkedListNodeP instanceof kotlinx.coroutines.internal.v) {
                k0(objC, pVarP);
                return;
            } else if (lockFreeLinkedListNodeP.Z()) {
                objC = kotlinx.coroutines.internal.p.h(objC, (a0) lockFreeLinkedListNodeP);
            } else {
                lockFreeLinkedListNodeP.Q();
            }
        }
    }

    protected void k0(@dl.d Object list, @dl.d p<?> closed) {
        if (list == null) {
            return;
        }
        if (!(list instanceof ArrayList)) {
            ((a0) list).m0(closed);
            return;
        }
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                ((a0) arrayList.get(size)).m0(closed);
            }
        }
    }

    protected void l0() {
    }

    protected void m0() {
    }

    @dl.e
    protected Object n0() {
        while (true) {
            a0 a0VarS = S();
            if (a0VarS == null) {
                return kotlinx.coroutines.channels.a.f129026f;
            }
            if (a0VarS.o0(null) != null) {
                a0VarS.j0();
                return a0VarS.getElement();
            }
            a0VarS.p0();
        }
    }

    @dl.e
    protected Object o0(@dl.d kotlinx.coroutines.selects.f<?> select) {
        g<E> gVarB0 = b0();
        Object objM = select.m(gVarB0);
        if (objM != null) {
            return objM;
        }
        gVarB0.o().j0();
        return gVarB0.o().getElement();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @s0(expression = "tryReceive().getOrNull()", imports = {}))
    @dl.e
    public E poll() {
        return (E) k.a.d(this);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @dl.d
    public final kotlinx.coroutines.selects.d<n<E>> y() {
        return new j(this);
    }
}
