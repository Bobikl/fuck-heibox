package androidx.compose.runtime;

import android.view.Choreographer;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: compiled from: ActualAndroid.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u000f\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/DefaultChoreographerFrameClock;", "Landroidx/compose/runtime/w0;", "R", "Lkotlin/Function1;", "", "Lkotlin/m0;", "name", "frameTimeNanos", "onFrame", "h0", "(Lyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", ak.aF, "Landroid/view/Choreographer;", "choreographer", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class DefaultChoreographerFrameClock implements w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final DefaultChoreographerFrameClock f12355b = new DefaultChoreographerFrameClock();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Choreographer choreographer = (Choreographer) kotlinx.coroutines.i.f(kotlinx.coroutines.e1.e().t0(), new DefaultChoreographerFrameClock$choreographer$1(null));

    /* JADX INFO: compiled from: ActualAndroid.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "frameTimeNanos", "Lkotlin/b2;", "doFrame", "(J)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class a implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p<R> f12357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.l<Long, R> f12358c;

        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.p<? super R> pVar, yh.l<? super Long, ? extends R> lVar) {
            this.f12357b = pVar;
            this.f12358c = lVar;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            Object objB;
            kotlin.coroutines.c cVar = this.f12357b;
            DefaultChoreographerFrameClock defaultChoreographerFrameClock = DefaultChoreographerFrameClock.f12355b;
            yh.l<Long, R> lVar = this.f12358c;
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

    private DefaultChoreographerFrameClock() {
    }

    @Override // kotlin.coroutines.CoroutineContext
    @dl.d
    public CoroutineContext I(@dl.d CoroutineContext coroutineContext) {
        return w0.a.e(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    @dl.d
    public CoroutineContext d(@dl.d CoroutineContext.b<?> bVar) {
        return w0.a.d(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    @dl.e
    public <E extends CoroutineContext.a> E f(@dl.d CoroutineContext.b<E> bVar) {
        return (E) w0.a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public <R> R g(R r10, @dl.d yh.p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
        return (R) w0.a.a(this, r10, pVar);
    }

    @Override // androidx.compose.runtime.w0, kotlin.coroutines.CoroutineContext.a
    public /* synthetic */ CoroutineContext.b getKey() {
        return v0.a(this);
    }

    @Override // androidx.compose.runtime.w0
    @dl.e
    public <R> Object h0(@dl.d yh.l<? super Long, ? extends R> lVar, @dl.d kotlin.coroutines.c<? super R> cVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        qVar.F0();
        final a aVar = new a(qVar, lVar);
        choreographer.postFrameCallback(aVar);
        qVar.L(new yh.l<Throwable, kotlin.b2>() { // from class: androidx.compose.runtime.DefaultChoreographerFrameClock$withFrameNanos$2$1
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
                DefaultChoreographerFrameClock.choreographer.removeFrameCallback(aVar);
            }
        });
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objT;
    }
}
