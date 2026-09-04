package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.time.g;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.g2;
import kotlinx.coroutines.h1;
import kotlinx.coroutines.p;
import kotlinx.coroutines.q2;
import kotlinx.coroutines.y0;
import yh.l;

/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010$\u001a\u00020\n¢\u0006\u0004\b+\u0010,B\u001d\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b+\u0010-J\u001c\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u001e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0016J$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0013\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0016R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010*\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b(\u0010)¨\u0006."}, d2 = {"Lkotlinx/coroutines/android/HandlerContext;", "Lkotlinx/coroutines/android/d;", "Lkotlinx/coroutines/y0;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/b2;", "w0", "", androidx.exifinterface.media.a.X4, "O", "", "timeMillis", "Lkotlinx/coroutines/p;", "continuation", "o", "Lkotlinx/coroutines/h1;", "r", "", "toString", "", "other", "equals", "", "hashCode", "Landroid/os/Handler;", "d", "Landroid/os/Handler;", "handler", "e", "Ljava/lang/String;", "name", "f", "Z", "invokeImmediately", "_immediate", "Lkotlinx/coroutines/android/HandlerContext;", "g", "x0", "()Lkotlinx/coroutines/android/HandlerContext;", "immediate", "<init>", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "(Landroid/os/Handler;Ljava/lang/String;)V", "kotlinx-coroutines-android"}, k = 1, mv = {1, 6, 0})
public final class HandlerContext extends d implements y0 {

    @dl.e
    private volatile HandlerContext _immediate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Handler handler;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final String name;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean invokeImmediately;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final HandlerContext immediate;

    /* JADX INFO: compiled from: Runnable.kt */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/b2;", "run", "()V", "kotlinx/coroutines/y2$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f128726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HandlerContext f128727c;

        public a(p pVar, HandlerContext handlerContext) {
            this.f128726b = pVar;
            this.f128727c = handlerContext;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f128726b.s0(this.f128727c, b2.f124493a);
        }
    }

    public HandlerContext(@dl.d Handler handler, @dl.e String str) {
        this(handler, str, false);
    }

    public /* synthetic */ HandlerContext(Handler handler, String str, int i10, u uVar) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    private HandlerContext(Handler handler, String str, boolean z10) {
        super(null);
        this.handler = handler;
        this.name = str;
        this.invokeImmediately = z10;
        this._immediate = z10 ? this : null;
        HandlerContext handlerContext = this._immediate;
        if (handlerContext == null) {
            handlerContext = new HandlerContext(handler, str, true);
            this._immediate = handlerContext;
        }
        this.immediate = handlerContext;
    }

    private final void w0(CoroutineContext coroutineContext, Runnable runnable) {
        g2.f(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        e1.c().O(coroutineContext, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z0(HandlerContext handlerContext, Runnable runnable) {
        handlerContext.handler.removeCallbacks(runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void O(@dl.d CoroutineContext coroutineContext, @dl.d Runnable runnable) {
        if (this.handler.post(runnable)) {
            return;
        }
        w0(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean V(@dl.d CoroutineContext context) {
        return (this.invokeImmediately && f0.g(Looper.myLooper(), this.handler.getLooper())) ? false : true;
    }

    public boolean equals(@dl.e Object other) {
        return (other instanceof HandlerContext) && ((HandlerContext) other).handler == this.handler;
    }

    public int hashCode() {
        return System.identityHashCode(this.handler);
    }

    @Override // kotlinx.coroutines.y0
    public void o(long j10, @dl.d p<? super b2> pVar) {
        final a aVar = new a(pVar, this);
        if (this.handler.postDelayed(aVar, fi.u.C(j10, g.f128637c))) {
            pVar.L(new l<Throwable, b2>() { // from class: kotlinx.coroutines.android.HandlerContext$scheduleResumeAfterDelay$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                    invoke2(th2);
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@dl.e Throwable th2) {
                    this.f128728b.handler.removeCallbacks(aVar);
                }
            });
        } else {
            w0(pVar.getContext(), aVar);
        }
    }

    @Override // kotlinx.coroutines.android.d, kotlinx.coroutines.y0
    @dl.d
    public h1 r(long timeMillis, @dl.d final Runnable block, @dl.d CoroutineContext context) {
        if (this.handler.postDelayed(block, fi.u.C(timeMillis, g.f128637c))) {
            return new h1() { // from class: kotlinx.coroutines.android.c
                @Override // kotlinx.coroutines.h1
                public final void dispose() {
                    HandlerContext.z0(this.f128730b, block);
                }
            };
        }
        w0(context, block);
        return q2.f130305b;
    }

    @Override // kotlinx.coroutines.n2, kotlinx.coroutines.CoroutineDispatcher
    @dl.d
    public String toString() {
        String strS0 = s0();
        if (strS0 != null) {
            return strS0;
        }
        String string = this.name;
        if (string == null) {
            string = this.handler.toString();
        }
        if (!this.invokeImmediately) {
            return string;
        }
        return string + ".immediate";
    }

    @Override // kotlinx.coroutines.android.d
    @dl.d
    /* JADX INFO: renamed from: x0, reason: from getter and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public HandlerContext t0() {
        return this.immediate;
    }
}
