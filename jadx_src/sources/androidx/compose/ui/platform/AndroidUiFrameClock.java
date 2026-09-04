package androidx.compose.ui.platform;

import android.view.Choreographer;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: compiled from: AndroidUiFrameClock.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiFrameClock;", "Landroidx/compose/runtime/w0;", "R", "Lkotlin/Function1;", "", "onFrame", "h0", "(Lyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroid/view/Choreographer;", "b", "Landroid/view/Choreographer;", ak.aF, "()Landroid/view/Choreographer;", "choreographer", "<init>", "(Landroid/view/Choreographer;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class AndroidUiFrameClock implements androidx.compose.runtime.w0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f15577c = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Choreographer choreographer;

    /* JADX INFO: compiled from: AndroidUiFrameClock.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "frameTimeNanos", "Lkotlin/b2;", "doFrame", "(J)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class a implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p<R> f15579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AndroidUiFrameClock f15580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ yh.l<Long, R> f15581d;

        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.p<? super R> pVar, AndroidUiFrameClock androidUiFrameClock, yh.l<? super Long, ? extends R> lVar) {
            this.f15579b = pVar;
            this.f15580c = androidUiFrameClock;
            this.f15581d = lVar;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            Object objB;
            kotlin.coroutines.c cVar = this.f15579b;
            yh.l<Long, R> lVar = this.f15581d;
            try {
                Result.a aVar = Result.f124476c;
                objB = Result.b(lVar.invoke(Long.valueOf(j10)));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.f124476c;
                objB = Result.b(kotlin.t0.a(th2));
            }
            cVar.resumeWith(objB);
        }
    }

    public AndroidUiFrameClock(@dl.d Choreographer choreographer) {
        kotlin.jvm.internal.f0.p(choreographer, "choreographer");
        this.choreographer = choreographer;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @dl.d
    public CoroutineContext I(@dl.d CoroutineContext coroutineContext) {
        return androidx.compose.runtime.w0.a.e(this, coroutineContext);
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    @dl.d
    public CoroutineContext d(@dl.d CoroutineContext.b<?> bVar) {
        return androidx.compose.runtime.w0.a.d(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    @dl.e
    public <E extends CoroutineContext.a> E f(@dl.d CoroutineContext.b<E> bVar) {
        return (E) androidx.compose.runtime.w0.a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public <R> R g(R r10, @dl.d yh.p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
        return (R) androidx.compose.runtime.w0.a.a(this, r10, pVar);
    }

    @Override // androidx.compose.runtime.w0, kotlin.coroutines.CoroutineContext.a
    public /* synthetic */ CoroutineContext.b getKey() {
        return androidx.compose.runtime.v0.a(this);
    }

    @Override // androidx.compose.runtime.w0
    @dl.e
    public <R> Object h0(@dl.d yh.l<? super Long, ? extends R> lVar, @dl.d kotlin.coroutines.c<? super R> cVar) {
        CoroutineContext.a aVarF = cVar.getCom.umeng.analytics.pro.d.R java.lang.String().f(kotlin.coroutines.d.f124698w1);
        final AndroidUiDispatcher androidUiDispatcher = aVarF instanceof AndroidUiDispatcher ? (AndroidUiDispatcher) aVarF : null;
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        qVar.F0();
        final a aVar = new a(qVar, this, lVar);
        if (androidUiDispatcher == null || !kotlin.jvm.internal.f0.g(androidUiDispatcher.getChoreographer(), getChoreographer())) {
            getChoreographer().postFrameCallback(aVar);
            qVar.L(new yh.l<Throwable, kotlin.b2>() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(Throwable th2) {
                    invoke2(th2);
                    return kotlin.b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@dl.e Throwable th2) {
                    this.f15584b.getChoreographer().removeFrameCallback(aVar);
                }
            });
        } else {
            androidUiDispatcher.H0(aVar);
            qVar.L(new yh.l<Throwable, kotlin.b2>() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(Throwable th2) {
                    invoke2(th2);
                    return kotlin.b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@dl.e Throwable th2) {
                    androidUiDispatcher.I0(aVar);
                }
            });
        }
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objT;
    }
}
