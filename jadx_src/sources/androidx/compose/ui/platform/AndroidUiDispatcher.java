package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: compiled from: AndroidUiDispatcher.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n*\u00010\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001=B\u0019\b\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b:\u0010;J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0017\u00109\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006>"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/lang/Runnable;", "D0", "Lkotlin/b2;", "G0", "", "frameTimeNanos", "E0", "Landroid/view/Choreographer$FrameCallback;", "callback", "H0", "(Landroid/view/Choreographer$FrameCallback;)V", "I0", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "block", "O", "Landroid/view/Choreographer;", "d", "Landroid/view/Choreographer;", "B0", "()Landroid/view/Choreographer;", "choreographer", "Landroid/os/Handler;", "e", "Landroid/os/Handler;", "handler", "", "f", "Ljava/lang/Object;", "lock", "Lkotlin/collections/i;", "g", "Lkotlin/collections/i;", "toRunTrampolined", "", RXScreenCaptureService.KEY_HEIGHT, "Ljava/util/List;", "toRunOnFrame", "i", "spareToRunOnFrame", "", "j", "Z", "scheduledTrampolineDispatch", "k", "scheduledFrameDispatch", "androidx/compose/ui/platform/AndroidUiDispatcher$c", "l", "Landroidx/compose/ui/platform/AndroidUiDispatcher$c;", "dispatchCallback", "Landroidx/compose/runtime/w0;", "m", "Landroidx/compose/runtime/w0;", "C0", "()Landroidx/compose/runtime/w0;", "frameClock", "<init>", "(Landroid/view/Choreographer;Landroid/os/Handler;)V", "n", "b", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class AndroidUiDispatcher extends CoroutineDispatcher {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f15561o = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final kotlin.z<CoroutineContext> f15562p = kotlin.b0.c(new yh.a<CoroutineContext>() { // from class: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineContext invoke() {
            kotlin.jvm.internal.u uVar = null;
            Choreographer choreographer = b0.b() ? Choreographer.getInstance() : (Choreographer) kotlinx.coroutines.i.f(kotlinx.coroutines.e1.e(), new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(null));
            kotlin.jvm.internal.f0.o(choreographer, "if (isMainThread()) Chor…eographer.getInstance() }");
            Handler handlerA = androidx.core.os.l.a(Looper.getMainLooper());
            kotlin.jvm.internal.f0.o(handlerA, "createAsync(Looper.getMainLooper())");
            AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, handlerA, uVar);
            return androidUiDispatcher.I(androidUiDispatcher.getFrameClock());
        }
    });

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private static final ThreadLocal<CoroutineContext> f15563q = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Choreographer choreographer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Handler handler;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object lock;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlin.collections.i<Runnable> toRunTrampolined;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private List<Choreographer.FrameCallback> toRunOnFrame;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private List<Choreographer.FrameCallback> spareToRunOnFrame;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean scheduledTrampolineDispatch;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean scheduledFrameDispatch;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final c dispatchCallback;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.w0 frameClock;

    /* JADX INFO: compiled from: AndroidUiDispatcher.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0004"}, d2 = {"androidx/compose/ui/platform/AndroidUiDispatcher$a", "Ljava/lang/ThreadLocal;", "Lkotlin/coroutines/CoroutineContext;", ak.av, "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends ThreadLocal<CoroutineContext> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CoroutineContext initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            kotlin.jvm.internal.f0.o(choreographer, "getInstance()");
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                throw new IllegalStateException("no Looper on this thread".toString());
            }
            Handler handlerA = androidx.core.os.l.a(looperMyLooper);
            kotlin.jvm.internal.f0.o(handlerA, "createAsync(\n           …d\")\n                    )");
            AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, handlerA, null);
            return androidUiDispatcher.I(androidUiDispatcher.getFrameClock());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidUiDispatcher$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AndroidUiDispatcher.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiDispatcher$b;", "", "Lkotlin/coroutines/CoroutineContext;", "Main$delegate", "Lkotlin/z;", "b", "()Lkotlin/coroutines/CoroutineContext;", "Main", ak.av, "CurrentThread", "Ljava/lang/ThreadLocal;", "currentThread", "Ljava/lang/ThreadLocal;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final CoroutineContext a() {
            if (b0.b()) {
                return b();
            }
            CoroutineContext coroutineContext = (CoroutineContext) AndroidUiDispatcher.f15563q.get();
            if (coroutineContext != null) {
                return coroutineContext;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
        }

        @dl.d
        public final CoroutineContext b() {
            return (CoroutineContext) AndroidUiDispatcher.f15562p.getValue();
        }
    }

    /* JADX INFO: compiled from: AndroidUiDispatcher.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/AndroidUiDispatcher$c", "Landroid/view/Choreographer$FrameCallback;", "Ljava/lang/Runnable;", "Lkotlin/b2;", "run", "", "frameTimeNanos", "doFrame", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class c implements Choreographer.FrameCallback, Runnable {
        c() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            AndroidUiDispatcher.this.handler.removeCallbacks(this);
            AndroidUiDispatcher.this.G0();
            AndroidUiDispatcher.this.E0(j10);
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidUiDispatcher.this.G0();
            Object obj = AndroidUiDispatcher.this.lock;
            AndroidUiDispatcher androidUiDispatcher = AndroidUiDispatcher.this;
            synchronized (obj) {
                if (androidUiDispatcher.toRunOnFrame.isEmpty()) {
                    androidUiDispatcher.getChoreographer().removeFrameCallback(this);
                    androidUiDispatcher.scheduledFrameDispatch = false;
                }
                kotlin.b2 b2Var = kotlin.b2.f124493a;
            }
        }
    }

    private AndroidUiDispatcher(Choreographer choreographer, Handler handler) {
        this.choreographer = choreographer;
        this.handler = handler;
        this.lock = new Object();
        this.toRunTrampolined = new kotlin.collections.i<>();
        this.toRunOnFrame = new ArrayList();
        this.spareToRunOnFrame = new ArrayList();
        this.dispatchCallback = new c();
        this.frameClock = new AndroidUiFrameClock(choreographer);
    }

    public /* synthetic */ AndroidUiDispatcher(Choreographer choreographer, Handler handler, kotlin.jvm.internal.u uVar) {
        this(choreographer, handler);
    }

    private final Runnable D0() {
        Runnable runnableA;
        synchronized (this.lock) {
            runnableA = this.toRunTrampolined.A();
        }
        return runnableA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E0(long j10) {
        synchronized (this.lock) {
            if (this.scheduledFrameDispatch) {
                this.scheduledFrameDispatch = false;
                List<Choreographer.FrameCallback> list = this.toRunOnFrame;
                this.toRunOnFrame = this.spareToRunOnFrame;
                this.spareToRunOnFrame = list;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).doFrame(j10);
                }
                list.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G0() {
        boolean z10;
        do {
            Runnable runnableD0 = D0();
            while (runnableD0 != null) {
                runnableD0.run();
                runnableD0 = D0();
            }
            synchronized (this.lock) {
                z10 = false;
                if (this.toRunTrampolined.isEmpty()) {
                    this.scheduledTrampolineDispatch = false;
                } else {
                    z10 = true;
                }
            }
        } while (z10);
    }

    @dl.d
    /* JADX INFO: renamed from: B0, reason: from getter */
    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    @dl.d
    /* JADX INFO: renamed from: C0, reason: from getter */
    public final androidx.compose.runtime.w0 getFrameClock() {
        return this.frameClock;
    }

    public final void H0(@dl.d Choreographer.FrameCallback callback) {
        kotlin.jvm.internal.f0.p(callback, "callback");
        synchronized (this.lock) {
            this.toRunOnFrame.add(callback);
            if (!this.scheduledFrameDispatch) {
                this.scheduledFrameDispatch = true;
                this.choreographer.postFrameCallback(this.dispatchCallback);
            }
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        }
    }

    public final void I0(@dl.d Choreographer.FrameCallback callback) {
        kotlin.jvm.internal.f0.p(callback, "callback");
        synchronized (this.lock) {
            this.toRunOnFrame.remove(callback);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void O(@dl.d CoroutineContext context, @dl.d Runnable block) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(block, "block");
        synchronized (this.lock) {
            this.toRunTrampolined.addLast(block);
            if (!this.scheduledTrampolineDispatch) {
                this.scheduledTrampolineDispatch = true;
                this.handler.post(this.dispatchCallback);
                if (!this.scheduledFrameDispatch) {
                    this.scheduledFrameDispatch = true;
                    this.choreographer.postFrameCallback(this.dispatchCallback);
                }
            }
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        }
    }
}
