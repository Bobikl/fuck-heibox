package kotlinx.coroutines.channels;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.max.hblogistics.AddressListActivity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.w0;
import kotlin.s0;
import kotlinx.coroutines.internal.o0;
import kotlinx.coroutines.s2;

/* JADX INFO: compiled from: ConflatedBroadcastChannel.kt */
/* JADX INFO: loaded from: classes5.dex */
@s2
@Metadata(bv = {}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 **\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0004D*EFB\u0007¢\u0006\u0004\bB\u00107B\u0011\b\u0016\u0012\u0006\u00108\u001a\u00028\u0000¢\u0006\u0004\bB\u0010CJ\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J?\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\b2\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0018\u00010\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0018\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014JX\u0010\u001d\u001a\u00020\u0005\"\u0004\b\u0001\u0010\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010\u0011\u001a\u00028\u00002(\u0010\u001c\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\"2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b#\u0010$J)\u0010(\u001a\u00020\u00052\u0018\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050%j\u0002`&H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u00020\"2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b*\u0010$J\u001f\u0010-\u001a\u00020\u00052\u000e\u0010\u000e\u001a\n\u0018\u00010+j\u0004\u0018\u0001`,H\u0016¢\u0006\u0004\b-\u0010.J\u001b\u0010/\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b/\u00100J&\u00102\u001a\b\u0012\u0004\u0012\u00020\u0005012\u0006\u0010\u0011\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b2\u00103R\u0017\u00108\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b6\u00107\u001a\u0004\b4\u00105R\u0013\u0010:\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b9\u00105R\u0014\u0010=\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R&\u0010A\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006G"}, d2 = {"Lkotlinx/coroutines/channels/q;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/h;", "Lkotlinx/coroutines/channels/q$d;", "subscriber", "Lkotlin/b2;", "g", "(Lkotlinx/coroutines/channels/q$d;)V", "", "list", "f", "([Lkotlinx/coroutines/channels/q$d;Lkotlinx/coroutines/channels/q$d;)[Lkotlinx/coroutines/channels/q$d;", "o", "", "cause", "k", "(Ljava/lang/Throwable;)V", "element", "Lkotlinx/coroutines/channels/q$a;", "m", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/q$a;", "R", "Lkotlinx/coroutines/selects/f;", AddressListActivity.N, "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/b0;", "Lkotlin/coroutines/c;", "", "block", "n", "(Lkotlinx/coroutines/selects/f;Ljava/lang/Object;Lyh/p;)V", "Lkotlinx/coroutines/channels/ReceiveChannel;", ak.aG, "()Lkotlinx/coroutines/channels/ReceiveChannel;", "", "U", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/Handler;", "handler", "J", "(Lyh/l;)V", "b", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "e", "(Ljava/util/concurrent/CancellationException;)V", "X", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/n;", "v", "(Ljava/lang/Object;)Ljava/lang/Object;", RXScreenCaptureService.KEY_HEIGHT, "()Ljava/lang/Object;", "getValue$annotations", "()V", "value", "j", "valueOrNull", "O", "()Z", "isClosedForSend", "Lkotlinx/coroutines/selects/e;", "l", "()Lkotlinx/coroutines/selects/e;", "onSend", "<init>", "(Ljava/lang/Object;)V", ak.av, ak.aF, "d", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class q<E> implements h<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f129072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f129073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f129074e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    @Deprecated
    private static final o0 f129076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    @Deprecated
    private static final c<Object> f129077h;

    @dl.d
    private volatile /* synthetic */ Object _state;

    @dl.d
    private volatile /* synthetic */ int _updating;

    @dl.d
    private volatile /* synthetic */ Object onCloseHandler;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final b f129071b = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    @Deprecated
    private static final a f129075f = new a(null);

    /* JADX INFO: compiled from: ConflatedBroadcastChannel.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0007\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/channels/q$a;", "", "", ak.av, "Ljava/lang/Throwable;", "closeCause", "()Ljava/lang/Throwable;", "sendException", "b", "valueException", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.e
        @xh.e
        public final Throwable closeCause;

        public a(@dl.e Throwable th2) {
            this.closeCause = th2;
        }

        @dl.d
        public final Throwable a() {
            Throwable th2 = this.closeCause;
            return th2 == null ? new ClosedSendChannelException(o.f129069a) : th2;
        }

        @dl.d
        public final Throwable b() {
            Throwable th2 = this.closeCause;
            return th2 == null ? new IllegalStateException(o.f129069a) : th2;
        }
    }

    /* JADX INFO: compiled from: ConflatedBroadcastChannel.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/channels/q$b;", "", "Lkotlinx/coroutines/channels/q$a;", "CLOSED", "Lkotlinx/coroutines/channels/q$a;", "Lkotlinx/coroutines/channels/q$c;", "INITIAL_STATE", "Lkotlinx/coroutines/channels/q$c;", "Lkotlinx/coroutines/internal/o0;", "UNDEFINED", "Lkotlinx/coroutines/internal/o0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: ConflatedBroadcastChannel.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B'\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\"\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/channels/q$c;", androidx.exifinterface.media.a.S4, "", ak.av, "Ljava/lang/Object;", "value", "", "Lkotlinx/coroutines/channels/q$d;", "b", "[Lkotlinx/coroutines/channels/q$d;", "subscribers", "<init>", "(Ljava/lang/Object;[Lkotlinx/coroutines/channels/q$d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class c<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.e
        @xh.e
        public final Object value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.e
        @xh.e
        public final d<E>[] subscribers;

        public c(@dl.e Object obj, @dl.e d<E>[] dVarArr) {
            this.value = obj;
            this.subscribers = dVarArr;
        }
    }

    /* JADX INFO: compiled from: ConflatedBroadcastChannel.kt */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/channels/q$d;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/r;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "", "wasClosed", "Lkotlin/b2;", "j0", "element", "", "I", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/q;", "g", "Lkotlinx/coroutines/channels/q;", "broadcastChannel", "<init>", "(Lkotlinx/coroutines/channels/q;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class d<E> extends r<E> implements ReceiveChannel<E> {

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final q<E> broadcastChannel;

        public d(@dl.d q<E> qVar) {
            super(null);
            this.broadcastChannel = qVar;
        }

        @Override // kotlinx.coroutines.channels.r, kotlinx.coroutines.channels.b
        @dl.d
        public Object I(E element) {
            return super.I(element);
        }

        @Override // kotlinx.coroutines.channels.r, kotlinx.coroutines.channels.AbstractChannel
        protected void j0(boolean z10) {
            if (z10) {
                this.broadcastChannel.g(this);
            }
        }
    }

    /* JADX INFO: compiled from: ConflatedBroadcastChannel.kt */
    @Metadata(bv = {}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001JX\u0010\f\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0006\u001a\u00028\u00002(\u0010\n\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"kotlinx/coroutines/channels/q$e", "Lkotlinx/coroutines/selects/e;", "Lkotlinx/coroutines/channels/b0;", "R", "Lkotlinx/coroutines/selects/f;", AddressListActivity.N, RemoteMessageConst.MessageBody.PARAM, "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "", "block", "Lkotlin/b2;", "N", "(Lkotlinx/coroutines/selects/f;Ljava/lang/Object;Lyh/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class e implements kotlinx.coroutines.selects.e<E, b0<? super E>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q<E> f129082b;

        e(q<E> qVar) {
            this.f129082b = qVar;
        }

        @Override // kotlinx.coroutines.selects.e
        public <R> void N(@dl.d kotlinx.coroutines.selects.f<? super R> select, E param, @dl.d yh.p<? super b0<? super E>, ? super kotlin.coroutines.c<? super R>, ? extends Object> block) {
            this.f129082b.n(select, param, block);
        }
    }

    static {
        o0 o0Var = new o0("UNDEFINED");
        f129076g = o0Var;
        f129077h = new c<>(o0Var, null);
        f129072c = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_state");
        f129073d = AtomicIntegerFieldUpdater.newUpdater(q.class, "_updating");
        f129074e = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "onCloseHandler");
    }

    public q() {
        this._state = f129077h;
        this._updating = 0;
        this.onCloseHandler = null;
    }

    public q(E e10) {
        this();
        f129072c.lazySet(this, new c(e10, null));
    }

    private final d<E>[] f(d<E>[] list, d<E> subscriber) {
        if (list != null) {
            return (d[]) kotlin.collections.m.X3(list, subscriber);
        }
        d<E>[] dVarArr = new d[1];
        for (int i10 = 0; i10 < 1; i10++) {
            dVarArr[i10] = subscriber;
        }
        return dVarArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(d<E> subscriber) {
        Object obj;
        Object obj2;
        d<E>[] dVarArr;
        do {
            obj = this._state;
            if (obj instanceof a) {
                return;
            }
            if (!(obj instanceof c)) {
                throw new IllegalStateException(("Invalid state " + obj).toString());
            }
            c cVar = (c) obj;
            obj2 = cVar.value;
            dVarArr = cVar.subscribers;
            f0.m(dVarArr);
        } while (!androidx.concurrent.futures.a.a(f129072c, this, obj, new c(obj2, o(dVarArr, subscriber))));
    }

    public static /* synthetic */ void i() {
    }

    private final void k(Throwable cause) {
        o0 o0Var;
        Object obj = this.onCloseHandler;
        if (obj == null || obj == (o0Var = kotlinx.coroutines.channels.a.f129028h) || !androidx.concurrent.futures.a.a(f129074e, this, obj, o0Var)) {
            return;
        }
        ((yh.l) w0.q(obj, 1)).invoke(cause);
    }

    private final a m(E element) {
        Object obj;
        if (!f129073d.compareAndSet(this, 0, 1)) {
            return null;
        }
        do {
            try {
                obj = this._state;
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    this._updating = 0;
                    return aVar;
                }
                if (!(obj instanceof c)) {
                    throw new IllegalStateException(("Invalid state " + obj).toString());
                }
            } catch (Throwable th2) {
                this._updating = 0;
                throw th2;
            }
        } while (!androidx.concurrent.futures.a.a(f129072c, this, obj, new c(element, ((c) obj).subscribers)));
        d<E>[] dVarArr = ((c) obj).subscribers;
        if (dVarArr != null) {
            for (d<E> dVar : dVarArr) {
                dVar.I(element);
            }
        }
        this._updating = 0;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> void n(kotlinx.coroutines.selects.f<? super R> select, E element, yh.p<? super b0<? super E>, ? super kotlin.coroutines.c<? super R>, ? extends Object> block) {
        if (select.q()) {
            a aVarM = m(element);
            if (aVarM != null) {
                select.s(aVarM.a());
            } else {
                bj.b.d(block, this, select.r());
            }
        }
    }

    private final d<E>[] o(d<E>[] list, d<E> subscriber) {
        int length = list.length;
        int iJg = ArraysKt___ArraysKt.jg(list, subscriber);
        if (length == 1) {
            return null;
        }
        d<E>[] dVarArr = new d[length - 1];
        kotlin.collections.m.l1(list, dVarArr, 0, 0, iJg, 6, null);
        kotlin.collections.m.l1(list, dVarArr, iJg, iJg + 1, 0, 8, null);
        return dVarArr;
    }

    @Override // kotlinx.coroutines.channels.b0
    public void J(@dl.d yh.l<? super Throwable, b2> handler) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f129074e;
        if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, null, handler)) {
            Object obj = this._state;
            if ((obj instanceof a) && androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, handler, kotlinx.coroutines.channels.a.f129028h)) {
                handler.invoke(((a) obj).closeCause);
                return;
            }
            return;
        }
        Object obj2 = this.onCloseHandler;
        if (obj2 == kotlinx.coroutines.channels.a.f129028h) {
            throw new IllegalStateException("Another handler was already registered and successfully invoked");
        }
        throw new IllegalStateException("Another handler was already registered: " + obj2);
    }

    @Override // kotlinx.coroutines.channels.b0
    public boolean O() {
        return this._state instanceof a;
    }

    @Override // kotlinx.coroutines.channels.h
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public boolean b(@dl.e Throwable cause) {
        Object obj;
        int i10;
        do {
            obj = this._state;
            if (obj instanceof a) {
                return false;
            }
            if (!(obj instanceof c)) {
                throw new IllegalStateException(("Invalid state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.a.a(f129072c, this, obj, cause == null ? f129075f : new a(cause)));
        d<E>[] dVarArr = ((c) obj).subscribers;
        if (dVarArr != null) {
            for (d<E> dVar : dVarArr) {
                dVar.b(cause);
            }
        }
        k(cause);
        return true;
    }

    @Override // kotlinx.coroutines.channels.b0
    @dl.e
    public Object X(E e10, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        a aVarM = m(e10);
        if (aVarM != null) {
            throw aVarM.a();
        }
        if (kotlin.coroutines.intrinsics.b.h() == null) {
            return null;
        }
        return b2.f124493a;
    }

    @Override // kotlinx.coroutines.channels.h
    public void e(@dl.e CancellationException cause) {
        b(cause);
    }

    public final E h() throws Throwable {
        Object obj = this._state;
        if (obj instanceof a) {
            throw ((a) obj).b();
        }
        if (obj instanceof c) {
            E e10 = (E) ((c) obj).value;
            if (e10 != f129076g) {
                return e10;
            }
            throw new IllegalStateException("No value");
        }
        throw new IllegalStateException(("Invalid state " + obj).toString());
    }

    @dl.e
    public final E j() {
        Object obj = this._state;
        if (obj instanceof a) {
            return null;
        }
        if (!(obj instanceof c)) {
            throw new IllegalStateException(("Invalid state " + obj).toString());
        }
        o0 o0Var = f129076g;
        E e10 = (E) ((c) obj).value;
        if (e10 == o0Var) {
            return null;
        }
        return e10;
    }

    @Override // kotlinx.coroutines.channels.b0
    @dl.d
    public kotlinx.coroutines.selects.e<E, b0<E>> l() {
        return new e(this);
    }

    @Override // kotlinx.coroutines.channels.b0
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @s0(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e10) {
        return h.a.c(this, e10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.h
    @dl.d
    public ReceiveChannel<E> u() {
        Object obj;
        c cVar;
        d dVar = new d(this);
        do {
            obj = this._state;
            if (obj instanceof a) {
                dVar.b(((a) obj).closeCause);
                return dVar;
            }
            if (!(obj instanceof c)) {
                throw new IllegalStateException(("Invalid state " + obj).toString());
            }
            cVar = (c) obj;
            Object obj2 = cVar.value;
            if (obj2 != f129076g) {
                dVar.I(obj2);
            }
        } while (!androidx.concurrent.futures.a.a(f129072c, this, obj, new c(cVar.value, f(cVar.subscribers, dVar))));
        return dVar;
    }

    @Override // kotlinx.coroutines.channels.b0
    @dl.d
    public Object v(E element) {
        a aVarM = m(element);
        return aVarM != null ? n.INSTANCE.a(aVarM.a()) : n.INSTANCE.c(b2.f124493a);
    }
}
