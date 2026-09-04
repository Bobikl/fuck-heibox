package kotlinx.coroutines.channels;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.max.hblogistics.AddressListActivity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.w0;
import kotlinx.coroutines.h1;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.n0;
import kotlinx.coroutines.internal.o0;
import kotlinx.coroutines.t0;

/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0004ijKkB)\u0012 \u0010g\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0018\u00010:j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`f¢\u0006\u0004\bh\u0010>J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000f\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u000b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JX\u0010\u001c\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00172\u0006\u0010\b\u001a\u00028\u00002(\u0010\u001b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b!\u0010\"J#\u0010#\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0014¢\u0006\u0004\b#\u0010$J\u0011\u0010&\u001a\u0004\u0018\u00010%H\u0004¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010(2\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0004\b)\u0010*J#\u0010-\u001a\u000e\u0012\u0002\b\u00030+j\u0006\u0012\u0002\b\u0003`,2\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0004\b-\u0010.J\u001b\u0010/\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b/\u0010\rJ\u0017\u00101\u001a\u0002002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b1\u00102J$\u00104\u001a\b\u0012\u0004\u0012\u00020\u000b032\u0006\u0010\b\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b4\u0010\"J\u0019\u00106\u001a\u0004\u0018\u00010\u001a2\u0006\u00105\u001a\u00020%H\u0014¢\u0006\u0004\b6\u00107J\u0019\u00108\u001a\u0002002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b8\u00109J)\u0010=\u001a\u00020\u000b2\u0018\u0010<\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u000b0:j\u0002`;H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020?H\u0014¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010(H\u0014¢\u0006\u0004\bB\u0010CJ\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000D2\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0004\bE\u0010FJ\u000f\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bH\u0010IR\u001a\u0010O\u001a\u00020J8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0014\u0010R\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010T\u001a\u00020G8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010IR\u0014\u0010V\u001a\u0002008$X¤\u0004¢\u0006\u0006\u001a\u0004\bU\u0010QR\u0014\u0010X\u001a\u0002008$X¤\u0004¢\u0006\u0006\u001a\u0004\bW\u0010QR\u001a\u0010[\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u001a\u0010]\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010ZR\u0011\u0010_\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b^\u0010QR#\u0010c\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020`8F¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0014\u0010e\u001a\u00020G8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bd\u0010I\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006l"}, d2 = {"Lkotlinx/coroutines/channels/b;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/b0;", "Lkotlinx/coroutines/channels/p;", "closed", "", "x", "(Lkotlinx/coroutines/channels/p;)Ljava/lang/Throwable;", "element", RXScreenCaptureService.KEY_WIDTH, "(Ljava/lang/Object;Lkotlinx/coroutines/channels/p;)Ljava/lang/Throwable;", "Lkotlin/b2;", "P", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/coroutines/c;", ak.aD, "(Lkotlin/coroutines/c;Ljava/lang/Object;Lkotlinx/coroutines/channels/p;)V", "cause", androidx.exifinterface.media.a.W4, "(Ljava/lang/Throwable;)V", "t", "(Lkotlinx/coroutines/channels/p;)V", "R", "Lkotlinx/coroutines/selects/f;", AddressListActivity.N, "Lkotlin/Function2;", "", "block", "M", "(Lkotlinx/coroutines/selects/f;Ljava/lang/Object;Lyh/p;)V", "", "i", "()I", "I", "(Ljava/lang/Object;)Ljava/lang/Object;", "K", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/f;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/a0;", androidx.exifinterface.media.a.R4, "()Lkotlinx/coroutines/channels/a0;", "Lkotlinx/coroutines/channels/y;", "N", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/y;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$b;", "Lkotlinx/coroutines/internal/AddLastDesc;", "j", "(Ljava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$b;", "X", "", "offer", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/channels/n;", "v", "send", "m", "(Lkotlinx/coroutines/channels/a0;)Ljava/lang/Object;", "U", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/Handler;", "handler", "J", "(Lyh/l;)V", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "L", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "Q", "()Lkotlinx/coroutines/channels/y;", "Lkotlinx/coroutines/channels/b$d;", "k", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/b$d;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/internal/v;", ak.aF, "Lkotlinx/coroutines/internal/v;", "q", "()Lkotlinx/coroutines/internal/v;", "queue", "F", "()Z", "isFullImpl", ak.aB, "queueDebugStateString", "C", "isBufferAlwaysFull", "D", "isBufferFull", "p", "()Lkotlinx/coroutines/channels/p;", "closedForSend", "o", "closedForReceive", "O", "isClosedForSend", "Lkotlinx/coroutines/selects/e;", "l", "()Lkotlinx/coroutines/selects/e;", "onSend", "n", "bufferDebugString", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", ak.av, "b", "d", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class b<E> implements b0<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f129029d = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "onCloseHandler");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    @xh.e
    protected final yh.l<E, b2> f129030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlinx.coroutines.internal.v queue = new kotlinx.coroutines.internal.v();

    @dl.d
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0010\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0010\u001a\u00028\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/channels/b$a;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/a0;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$d;", "otherOp", "Lkotlinx/coroutines/internal/o0;", "o0", "Lkotlin/b2;", "j0", "Lkotlinx/coroutines/channels/p;", "closed", "m0", "", "toString", "e", "Ljava/lang/Object;", "element", "", "k0", "()Ljava/lang/Object;", "pollResult", "<init>", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a<E> extends a0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public final E element;

        public a(E e10) {
            this.element = e10;
        }

        @Override // kotlinx.coroutines.channels.a0
        public void j0() {
        }

        @Override // kotlinx.coroutines.channels.a0
        @dl.e
        /* JADX INFO: renamed from: k0, reason: from getter */
        public Object getElement() {
            return this.element;
        }

        @Override // kotlinx.coroutines.channels.a0
        public void m0(@dl.d p<?> pVar) {
        }

        @Override // kotlinx.coroutines.channels.a0
        @dl.e
        public o0 o0(@dl.e LockFreeLinkedListNode.PrepareOp otherOp) {
            o0 o0Var = kotlinx.coroutines.r.f130311d;
            if (otherOp != null) {
                otherOp.d();
            }
            return o0Var;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @dl.d
        public String toString() {
            return "SendBuffered@" + t0.b(this) + '(' + this.element + ')';
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractChannel.kt */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003`\u0004B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/channels/b$b;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$b;", "Lkotlinx/coroutines/channels/b$a;", "Lkotlinx/coroutines/internal/AddLastDesc;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "affected", "", "e", "Lkotlinx/coroutines/internal/v;", "queue", "element", "<init>", "(Lkotlinx/coroutines/internal/v;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static class C1188b<E> extends LockFreeLinkedListNode.b<a<? extends E>> {
        public C1188b(@dl.d kotlinx.coroutines.internal.v vVar, E e10) {
            super(vVar, new a(e10));
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        @dl.e
        protected Object e(@dl.d LockFreeLinkedListNode affected) {
            if (affected instanceof p) {
                return affected;
            }
            if (affected instanceof y) {
                return kotlinx.coroutines.channels.a.f129025e;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\u00020\u00032\u00020\u0004BX\u0012\u0006\u0010\u0016\u001a\u00028\u0001\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00020\u001b\u0012(\u0010#\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010 \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020!\u0012\u0006\u0012\u0004\u0018\u00010\"0\u001fø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\u0014\u0010\u000e\u001a\u00020\t2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u001a\u0010\u0016\u001a\u00028\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00020\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lkotlinx/coroutines/channels/b$c;", androidx.exifinterface.media.a.S4, "R", "Lkotlinx/coroutines/channels/a0;", "Lkotlinx/coroutines/h1;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$d;", "otherOp", "Lkotlinx/coroutines/internal/o0;", "o0", "Lkotlin/b2;", "j0", "dispose", "Lkotlinx/coroutines/channels/p;", "closed", "m0", "p0", "", "toString", "e", "Ljava/lang/Object;", "k0", "()Ljava/lang/Object;", "pollResult", "Lkotlinx/coroutines/channels/b;", "f", "Lkotlinx/coroutines/channels/b;", "channel", "Lkotlinx/coroutines/selects/f;", "g", "Lkotlinx/coroutines/selects/f;", AddressListActivity.N, "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/b0;", "Lkotlin/coroutines/c;", "", "block", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/b;Lkotlinx/coroutines/selects/f;Lyh/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class c<E, R> extends a0 implements h1 {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final E pollResult;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final b<E> channel;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final kotlinx.coroutines.selects.f<R> select;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @dl.d
        @xh.e
        public final yh.p<b0<? super E>, kotlin.coroutines.c<? super R>, Object> f129036h;

        /* JADX WARN: Multi-variable type inference failed */
        public c(E e10, @dl.d b<E> bVar, @dl.d kotlinx.coroutines.selects.f<? super R> fVar, @dl.d yh.p<? super b0<? super E>, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
            this.pollResult = e10;
            this.channel = bVar;
            this.select = fVar;
            this.f129036h = pVar;
        }

        @Override // kotlinx.coroutines.h1
        public void dispose() throws IllegalAccessException, InvocationTargetException {
            if (Z()) {
                p0();
            }
        }

        @Override // kotlinx.coroutines.channels.a0
        public void j0() throws Throwable {
            bj.a.f(this.f129036h, this.channel, this.select.r(), null, 4, null);
        }

        @Override // kotlinx.coroutines.channels.a0
        /* JADX INFO: renamed from: k0 */
        public E getElement() {
            return this.pollResult;
        }

        @Override // kotlinx.coroutines.channels.a0
        public void m0(@dl.d p<?> pVar) {
            if (this.select.q()) {
                this.select.s(pVar.w0());
            }
        }

        @Override // kotlinx.coroutines.channels.a0
        @dl.e
        public o0 o0(@dl.e LockFreeLinkedListNode.PrepareOp otherOp) {
            return (o0) this.select.i(otherOp);
        }

        @Override // kotlinx.coroutines.channels.a0
        public void p0() throws IllegalAccessException, InvocationTargetException {
            yh.l<E, b2> lVar = this.channel.f129030b;
            if (lVar != null) {
                OnUndeliveredElementKt.b(lVar, getElement(), this.select.r().getCom.umeng.analytics.pro.d.R java.lang.String());
            }
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @dl.d
        public String toString() {
            return "SendSelect@" + t0.b(this) + '(' + getElement() + ")[" + this.channel + ", " + this.select + ']';
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003`\u0004B\u0017\u0012\u0006\u0010\u000e\u001a\u00028\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016R\u0014\u0010\u000e\u001a\u00028\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/channels/b$d;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$e;", "Lkotlinx/coroutines/channels/y;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "affected", "", "e", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$d;", "Lkotlinx/coroutines/internal/PrepareOp;", "prepareOp", "j", "Ljava/lang/Object;", "element", "Lkotlinx/coroutines/internal/v;", "queue", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/v;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class d<E> extends LockFreeLinkedListNode.e<y<? super E>> {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public final E element;

        public d(E e10, @dl.d kotlinx.coroutines.internal.v vVar) {
            super(vVar);
            this.element = e10;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.e, kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        @dl.e
        protected Object e(@dl.d LockFreeLinkedListNode affected) {
            if (affected instanceof p) {
                return affected;
            }
            if (affected instanceof y) {
                return null;
            }
            return kotlinx.coroutines.channels.a.f129025e;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        @dl.e
        public Object j(@dl.d LockFreeLinkedListNode.PrepareOp prepareOp) {
            o0 o0VarN = ((y) prepareOp.affected).n(this.element, prepareOp);
            if (o0VarN == null) {
                return kotlinx.coroutines.internal.x.f130208a;
            }
            Object obj = kotlinx.coroutines.internal.c.f130153b;
            if (o0VarN == obj) {
                return obj;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/internal/LockFreeLinkedListNode$f", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$c;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "k", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class e extends LockFreeLinkedListNode.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f129038d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(LockFreeLinkedListNode lockFreeLinkedListNode, b bVar) {
            super(lockFreeLinkedListNode);
            this.f129038d = bVar;
        }

        @Override // kotlinx.coroutines.internal.d
        @dl.e
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Object i(@dl.d LockFreeLinkedListNode affected) {
            if (this.f129038d.D()) {
                return null;
            }
            return kotlinx.coroutines.internal.w.a();
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @Metadata(bv = {}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001JX\u0010\f\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0006\u001a\u00028\u00002(\u0010\n\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"kotlinx/coroutines/channels/b$f", "Lkotlinx/coroutines/selects/e;", "Lkotlinx/coroutines/channels/b0;", "R", "Lkotlinx/coroutines/selects/f;", AddressListActivity.N, RemoteMessageConst.MessageBody.PARAM, "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "", "block", "Lkotlin/b2;", "N", "(Lkotlinx/coroutines/selects/f;Ljava/lang/Object;Lyh/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class f implements kotlinx.coroutines.selects.e<E, b0<? super E>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b<E> f129039b;

        f(b<E> bVar) {
            this.f129039b = bVar;
        }

        @Override // kotlinx.coroutines.selects.e
        public <R> void N(@dl.d kotlinx.coroutines.selects.f<? super R> select, E param, @dl.d yh.p<? super b0<? super E>, ? super kotlin.coroutines.c<? super R>, ? extends Object> block) throws Throwable {
            this.f129039b.M(select, param, block);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@dl.e yh.l<? super E, b2> lVar) {
        this.f129030b = lVar;
    }

    private final void A(Throwable cause) {
        o0 o0Var;
        Object obj = this.onCloseHandler;
        if (obj == null || obj == (o0Var = kotlinx.coroutines.channels.a.f129028h) || !androidx.concurrent.futures.a.a(f129029d, this, obj, o0Var)) {
            return;
        }
        ((yh.l) w0.q(obj, 1)).invoke(cause);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean F() {
        return !(this.queue.O() instanceof y) && D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> void M(kotlinx.coroutines.selects.f<? super R> select, E element, yh.p<? super b0<? super E>, ? super kotlin.coroutines.c<? super R>, ? extends Object> block) throws Throwable {
        while (!select.o()) {
            if (F()) {
                c cVar = new c(element, this, select, block);
                Object objM = m(cVar);
                if (objM == null) {
                    select.p(cVar);
                    return;
                }
                if (objM instanceof p) {
                    throw n0.p(w(element, (p) objM));
                }
                if (objM != kotlinx.coroutines.channels.a.f129027g && !(objM instanceof x)) {
                    throw new IllegalStateException(("enqueueSend returned " + objM + ' ').toString());
                }
            }
            Object objK = K(element, select);
            if (objK == kotlinx.coroutines.selects.g.d()) {
                return;
            }
            if (objK != kotlinx.coroutines.channels.a.f129025e && objK != kotlinx.coroutines.internal.c.f130153b) {
                if (objK == kotlinx.coroutines.channels.a.f129024d) {
                    bj.b.d(block, this, select.r());
                    return;
                } else {
                    if (objK instanceof p) {
                        throw n0.p(w(element, (p) objK));
                    }
                    throw new IllegalStateException(("offerSelectInternal returned " + objK).toString());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0073 A[EDGE_INSN: B:29:0x0073->B:30:0x0078 BREAK  A[LOOP:0: B:3:0x0008->B:45:?]] */
    /* JADX WARN: Code duplicated, block: B:38:0x008f  */
    /* JADX WARN: Code duplicated, block: B:43:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x006f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:3:0x0008->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x008f, please report this as an issue */
    public final Object P(E e10, kotlin.coroutines.c<? super b2> cVar) throws IllegalAccessException, InvocationTargetException {
        Object objI;
        kotlinx.coroutines.q qVarB = kotlinx.coroutines.s.b(IntrinsicsKt__IntrinsicsJvmKt.d(cVar));
        while (true) {
            if (F()) {
                a0 c0Var = this.f129030b == null ? new c0(e10, qVarB) : new d0(e10, qVarB, this.f129030b);
                Object objM = m(c0Var);
                if (objM == null) {
                    kotlinx.coroutines.s.c(qVarB, c0Var);
                    break;
                }
                if (objM instanceof p) {
                    z(qVarB, e10, (p) objM);
                    break;
                }
                if (objM != kotlinx.coroutines.channels.a.f129027g && !(objM instanceof x)) {
                    throw new IllegalStateException(("enqueueSend returned " + objM).toString());
                }
                objI = I(e10);
                if (objI == kotlinx.coroutines.channels.a.f129024d) {
                    Result.a aVar = Result.f124476c;
                    qVarB.resumeWith(Result.b(b2.f124493a));
                    break;
                }
                if (objI != kotlinx.coroutines.channels.a.f129025e) {
                    if (objI instanceof p) {
                        z(qVarB, e10, (p) objI);
                        break;
                    }
                    throw new IllegalStateException(("offerInternal returned " + objI).toString());
                }
            } else {
                objI = I(e10);
                if (objI == kotlinx.coroutines.channels.a.f129024d) {
                    Result.a aVar2 = Result.f124476c;
                    qVarB.resumeWith(Result.b(b2.f124493a));
                    break;
                }
                if (objI != kotlinx.coroutines.channels.a.f129025e) {
                    if (objI instanceof p) {
                        z(qVarB, e10, (p) objI);
                        break;
                    }
                    throw new IllegalStateException(("offerInternal returned " + objI).toString());
                }
            }
        }
        Object objT = qVarB.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objT == kotlin.coroutines.intrinsics.b.h() ? objT : b2.f124493a;
    }

    private final int i() {
        kotlinx.coroutines.internal.v vVar = this.queue;
        int i10 = 0;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeO = (LockFreeLinkedListNode) vVar.N(); !f0.g(lockFreeLinkedListNodeO, vVar); lockFreeLinkedListNodeO = lockFreeLinkedListNodeO.O()) {
            if (lockFreeLinkedListNodeO instanceof LockFreeLinkedListNode) {
                i10++;
            }
        }
        return i10;
    }

    private final String s() {
        String string;
        LockFreeLinkedListNode lockFreeLinkedListNodeO = this.queue.O();
        if (lockFreeLinkedListNodeO == this.queue) {
            return "EmptyQueue";
        }
        if (lockFreeLinkedListNodeO instanceof p) {
            string = lockFreeLinkedListNodeO.toString();
        } else if (lockFreeLinkedListNodeO instanceof x) {
            string = "ReceiveQueued";
        } else if (lockFreeLinkedListNodeO instanceof a0) {
            string = "SendQueued";
        } else {
            string = "UNEXPECTED:" + lockFreeLinkedListNodeO;
        }
        LockFreeLinkedListNode lockFreeLinkedListNodeP = this.queue.P();
        if (lockFreeLinkedListNodeP == lockFreeLinkedListNodeO) {
            return string;
        }
        String str = string + ",queueSize=" + i();
        if (!(lockFreeLinkedListNodeP instanceof p)) {
            return str;
        }
        return str + ",closedForSend=" + lockFreeLinkedListNodeP;
    }

    private final void t(p<?> closed) {
        Object objC = kotlinx.coroutines.internal.p.c(null, 1, null);
        while (true) {
            LockFreeLinkedListNode lockFreeLinkedListNodeP = closed.P();
            x xVar = lockFreeLinkedListNodeP instanceof x ? (x) lockFreeLinkedListNodeP : null;
            if (xVar == null) {
                break;
            } else if (xVar.Z()) {
                objC = kotlinx.coroutines.internal.p.h(objC, xVar);
            } else {
                xVar.Q();
            }
        }
        if (objC != null) {
            if (objC instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) objC;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    ((x) arrayList.get(size)).m0(closed);
                }
            } else {
                ((x) objC).m0(closed);
            }
        }
        L(closed);
    }

    private final Throwable w(E element, p<?> closed) throws IllegalAccessException, InvocationTargetException {
        UndeliveredElementException undeliveredElementExceptionD;
        t(closed);
        yh.l<E, b2> lVar = this.f129030b;
        if (lVar == null || (undeliveredElementExceptionD = OnUndeliveredElementKt.d(lVar, element, null, 2, null)) == null) {
            return closed.w0();
        }
        kotlin.o.a(undeliveredElementExceptionD, closed.w0());
        throw undeliveredElementExceptionD;
    }

    private final Throwable x(p<?> closed) {
        t(closed);
        return closed.w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(kotlin.coroutines.c<?> cVar, E e10, p<?> pVar) throws IllegalAccessException, InvocationTargetException {
        UndeliveredElementException undeliveredElementExceptionD;
        t(pVar);
        Throwable thW0 = pVar.w0();
        yh.l<E, b2> lVar = this.f129030b;
        if (lVar == null || (undeliveredElementExceptionD = OnUndeliveredElementKt.d(lVar, e10, null, 2, null)) == null) {
            Result.a aVar = Result.f124476c;
            cVar.resumeWith(Result.b(kotlin.t0.a(thW0)));
        } else {
            kotlin.o.a(undeliveredElementExceptionD, thW0);
            Result.a aVar2 = Result.f124476c;
            cVar.resumeWith(Result.b(kotlin.t0.a(undeliveredElementExceptionD)));
        }
    }

    protected abstract boolean C();

    protected abstract boolean D();

    @dl.d
    protected Object I(E element) {
        y<E> yVarQ;
        do {
            yVarQ = Q();
            if (yVarQ == null) {
                return kotlinx.coroutines.channels.a.f129025e;
            }
        } while (yVarQ.n(element, null) == null);
        yVarQ.e(element);
        return yVarQ.a();
    }

    @Override // kotlinx.coroutines.channels.b0
    public void J(@dl.d yh.l<? super Throwable, b2> handler) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f129029d;
        if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, null, handler)) {
            p<?> pVarP = p();
            if (pVarP == null || !androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, handler, kotlinx.coroutines.channels.a.f129028h)) {
                return;
            }
            handler.invoke(pVarP.closeCause);
            return;
        }
        Object obj = this.onCloseHandler;
        if (obj == kotlinx.coroutines.channels.a.f129028h) {
            throw new IllegalStateException("Another handler was already registered and successfully invoked");
        }
        throw new IllegalStateException("Another handler was already registered: " + obj);
    }

    @dl.d
    protected Object K(E element, @dl.d kotlinx.coroutines.selects.f<?> select) {
        d<E> dVarK = k(element);
        Object objM = select.m(dVarK);
        if (objM != null) {
            return objM;
        }
        y<? super E> yVarO = dVarK.o();
        yVarO.e(element);
        return yVarO.a();
    }

    protected void L(@dl.d LockFreeLinkedListNode closed) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.e
    protected final y<?> N(E element) {
        LockFreeLinkedListNode lockFreeLinkedListNodeP;
        kotlinx.coroutines.internal.v vVar = this.queue;
        a aVar = new a(element);
        do {
            lockFreeLinkedListNodeP = vVar.P();
            if (lockFreeLinkedListNodeP instanceof y) {
                return (y) lockFreeLinkedListNodeP;
            }
        } while (!lockFreeLinkedListNodeP.E(aVar, vVar));
        return null;
    }

    @Override // kotlinx.coroutines.channels.b0
    public final boolean O() {
        return p() != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.internal.LockFreeLinkedListNode] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    @dl.e
    protected y<E> Q() {
        ?? r10;
        LockFreeLinkedListNode lockFreeLinkedListNodeF0;
        kotlinx.coroutines.internal.v vVar = this.queue;
        while (true) {
            r10 = (LockFreeLinkedListNode) vVar.N();
            if (r10 == vVar || !(r10 instanceof y)) {
                break;
            }
            if ((!(((y) r10) instanceof p) || r10.S()) && (lockFreeLinkedListNodeF0 = r10.f0()) != null) {
                lockFreeLinkedListNodeF0.R();
            }
            return (y) r10;
        }
        r10 = 0;
        return (y) r10;
    }

    @dl.e
    protected final a0 S() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        LockFreeLinkedListNode lockFreeLinkedListNodeF0;
        kotlinx.coroutines.internal.v vVar = this.queue;
        while (true) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) vVar.N();
            if (lockFreeLinkedListNode == vVar || !(lockFreeLinkedListNode instanceof a0)) {
                break;
            }
            if ((!(((a0) lockFreeLinkedListNode) instanceof p) || lockFreeLinkedListNode.S()) && (lockFreeLinkedListNodeF0 = lockFreeLinkedListNode.f0()) != null) {
                lockFreeLinkedListNodeF0.R();
            }
            return (a0) lockFreeLinkedListNode;
        }
        lockFreeLinkedListNode = null;
        return (a0) lockFreeLinkedListNode;
    }

    @Override // kotlinx.coroutines.channels.b0
    /* JADX INFO: renamed from: U */
    public boolean b(@dl.e Throwable cause) {
        LockFreeLinkedListNode lockFreeLinkedListNodeP;
        boolean z10;
        p<?> pVar = new p<>(cause);
        LockFreeLinkedListNode lockFreeLinkedListNode = this.queue;
        do {
            lockFreeLinkedListNodeP = lockFreeLinkedListNode.P();
            z10 = true;
            if (!(!(lockFreeLinkedListNodeP instanceof p))) {
                z10 = false;
                break;
            }
        } while (!lockFreeLinkedListNodeP.E(pVar, lockFreeLinkedListNode));
        if (!z10) {
            pVar = (p) this.queue.P();
        }
        t(pVar);
        if (z10) {
            A(cause);
        }
        return z10;
    }

    @Override // kotlinx.coroutines.channels.b0
    @dl.e
    public final Object X(E e10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objP;
        return (I(e10) != kotlinx.coroutines.channels.a.f129024d && (objP = P(e10, cVar)) == kotlin.coroutines.intrinsics.b.h()) ? objP : b2.f124493a;
    }

    @dl.d
    protected final LockFreeLinkedListNode.b<?> j(E element) {
        return new C1188b(this.queue, element);
    }

    @dl.d
    protected final d<E> k(E element) {
        return new d<>(element, this.queue);
    }

    @Override // kotlinx.coroutines.channels.b0
    @dl.d
    public final kotlinx.coroutines.selects.e<E, b0<E>> l() {
        return new f(this);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0036  */
    /* JADX WARN: Code duplicated, block: B:24:0x0039 A[ORIG_RETURN, RETURN] */
    @dl.e
    protected Object m(@dl.d a0 send) {
        int iH0;
        boolean z10;
        LockFreeLinkedListNode lockFreeLinkedListNodeP;
        if (C()) {
            LockFreeLinkedListNode lockFreeLinkedListNode = this.queue;
            do {
                lockFreeLinkedListNodeP = lockFreeLinkedListNode.P();
                if (lockFreeLinkedListNodeP instanceof y) {
                    return lockFreeLinkedListNodeP;
                }
            } while (!lockFreeLinkedListNodeP.E(send, lockFreeLinkedListNode));
            return null;
        }
        LockFreeLinkedListNode lockFreeLinkedListNode2 = this.queue;
        e eVar = new e(send, this);
        do {
            LockFreeLinkedListNode lockFreeLinkedListNodeP2 = lockFreeLinkedListNode2.P();
            if (lockFreeLinkedListNodeP2 instanceof y) {
                return lockFreeLinkedListNodeP2;
            }
            iH0 = lockFreeLinkedListNodeP2.h0(send, lockFreeLinkedListNode2, eVar);
            z10 = true;
            if (iH0 != 1) {
            }
            if (z10) {
                return null;
            }
            return kotlinx.coroutines.channels.a.f129027g;
        } while (iH0 != 2);
        z10 = false;
        if (z10) {
            return kotlinx.coroutines.channels.a.f129027g;
        }
        return null;
    }

    @dl.d
    protected String n() {
        return "";
    }

    @dl.e
    protected final p<?> o() {
        LockFreeLinkedListNode lockFreeLinkedListNodeO = this.queue.O();
        p<?> pVar = lockFreeLinkedListNodeO instanceof p ? (p) lockFreeLinkedListNodeO : null;
        if (pVar == null) {
            return null;
        }
        t(pVar);
        return pVar;
    }

    @Override // kotlinx.coroutines.channels.b0
    public boolean offer(E element) throws IllegalAccessException, InvocationTargetException {
        UndeliveredElementException undeliveredElementExceptionD;
        try {
            return b0.a.c(this, element);
        } catch (Throwable th2) {
            yh.l<E, b2> lVar = this.f129030b;
            if (lVar == null || (undeliveredElementExceptionD = OnUndeliveredElementKt.d(lVar, element, null, 2, null)) == null) {
                throw th2;
            }
            kotlin.o.a(undeliveredElementExceptionD, th2);
            throw undeliveredElementExceptionD;
        }
    }

    @dl.e
    protected final p<?> p() {
        LockFreeLinkedListNode lockFreeLinkedListNodeP = this.queue.P();
        p<?> pVar = lockFreeLinkedListNodeP instanceof p ? (p) lockFreeLinkedListNodeP : null;
        if (pVar == null) {
            return null;
        }
        t(pVar);
        return pVar;
    }

    @dl.d
    /* JADX INFO: renamed from: q, reason: from getter */
    protected final kotlinx.coroutines.internal.v getQueue() {
        return this.queue;
    }

    @dl.d
    public String toString() {
        return t0.a(this) + '@' + t0.b(this) + '{' + s() + '}' + n();
    }

    @Override // kotlinx.coroutines.channels.b0
    @dl.d
    public final Object v(E element) {
        Object objI = I(element);
        if (objI == kotlinx.coroutines.channels.a.f129024d) {
            return n.INSTANCE.c(b2.f124493a);
        }
        if (objI == kotlinx.coroutines.channels.a.f129025e) {
            p<?> pVarP = p();
            return pVarP == null ? n.INSTANCE.b() : n.INSTANCE.a(x(pVarP));
        }
        if (objI instanceof p) {
            return n.INSTANCE.a(x((p) objI));
        }
        throw new IllegalStateException(("trySend returned " + objI).toString());
    }
}
