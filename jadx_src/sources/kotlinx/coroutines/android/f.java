package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.j1;
import com.umeng.analytics.pro.ak;
import java.lang.reflect.InvocationTargetException;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.f0;
import kotlin.k;
import kotlin.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.p;
import kotlinx.coroutines.q;
import xh.h;
import xh.i;

/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0001\u001a\u0013\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0016\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0002\u001a\u001e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0002\"\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u0019\u0010\u001a\"\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroid/os/Handler;", "", "name", "Lkotlinx/coroutines/android/d;", "g", "(Landroid/os/Handler;Ljava/lang/String;)Lkotlinx/coroutines/android/d;", "Landroid/os/Looper;", "", "async", "d", "", "e", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/p;", "cont", "Lkotlin/b2;", "l", "Landroid/view/Choreographer;", "choreographer", "j", ak.av, "J", "MAX_DELAY", "b", "Lkotlinx/coroutines/android/d;", "getMain$annotations", "()V", "Main", "Landroid/view/Choreographer;", "kotlinx-coroutines-android"}, k = 2, mv = {1, 6, 0})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f128733a = 4611686018427387903L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    @xh.e
    public static final d f128734b;

    @dl.e
    private static volatile Choreographer choreographer;

    /* JADX INFO: compiled from: Runnable.kt */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/b2;", "run", "()V", "kotlinx/coroutines/y2$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f128735b;

        public a(p pVar) {
            this.f128735b = pVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f.l(this.f128735b);
        }
    }

    static {
        Object objB;
        try {
            Result.a aVar = Result.f124476c;
            objB = Result.b(new HandlerContext(d(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(t0.a(th2));
        }
        f128734b = (d) (Result.i(objB) ? null : objB);
    }

    @j1
    @dl.d
    public static final Handler d(@dl.d Looper looper, boolean z10) throws IllegalAccessException, InvocationTargetException {
        if (!z10) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        if (objInvoke != null) {
            return (Handler) objInvoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
    }

    @dl.e
    public static final Object e(@dl.d kotlin.coroutines.c<? super Long> cVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            q qVar = new q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
            qVar.F0();
            j(choreographer2, qVar);
            Object objT = qVar.t();
            if (objT == kotlin.coroutines.intrinsics.b.h()) {
                kotlin.coroutines.jvm.internal.f.c(cVar);
            }
            return objT;
        }
        q qVar2 = new q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        qVar2.F0();
        e1.e().O(EmptyCoroutineContext.f124694b, new a(qVar2));
        Object objT2 = qVar2.t();
        if (objT2 == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objT2;
    }

    @dl.d
    @h(name = "from")
    @i
    public static final d f(@dl.d Handler handler) {
        return h(handler, null, 1, null);
    }

    @dl.d
    @h(name = "from")
    @i
    public static final d g(@dl.d Handler handler, @dl.e String str) {
        return new HandlerContext(handler, str);
    }

    public static /* synthetic */ d h(Handler handler, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return g(handler, str);
    }

    @k(level = DeprecationLevel.HIDDEN, message = "Use Dispatchers.Main instead")
    public static /* synthetic */ void i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Choreographer choreographer2, final p<? super Long> pVar) {
        choreographer2.postFrameCallback(new Choreographer.FrameCallback() { // from class: kotlinx.coroutines.android.e
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                f.k(pVar, j10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(p pVar, long j10) {
        pVar.s0(e1.e(), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(p<? super Long> pVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            f0.m(choreographer2);
            choreographer = choreographer2;
        }
        j(choreographer2, pVar);
    }
}
