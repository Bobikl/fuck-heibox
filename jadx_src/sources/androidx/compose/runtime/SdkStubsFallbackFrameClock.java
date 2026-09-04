package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: ActualAndroid.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u000b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/SdkStubsFallbackFrameClock;", "Landroidx/compose/runtime/w0;", "R", "Lkotlin/Function1;", "", "Lkotlin/m0;", "name", "frameTimeNanos", "onFrame", "h0", "(Lyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", ak.aF, "J", "DefaultFrameDelay", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class SdkStubsFallbackFrameClock implements w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final SdkStubsFallbackFrameClock f12541b = new SdkStubsFallbackFrameClock();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final long DefaultFrameDelay = 16;

    private SdkStubsFallbackFrameClock() {
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
        return kotlinx.coroutines.i.h(kotlinx.coroutines.e1.e(), new SdkStubsFallbackFrameClock$withFrameNanos$2(lVar, null), cVar);
    }
}
