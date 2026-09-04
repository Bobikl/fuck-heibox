package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Errors.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/f;", "", "cause", "", "attempt", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
public final class FlowKt__ErrorsKt$retry$3<T> extends SuspendLambda implements yh.r<f<? super T>, Throwable, Long, kotlin.coroutines.c<? super Boolean>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f129437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f129438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ long f129439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f129440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ yh.p<Throwable, kotlin.coroutines.c<? super Boolean>, Object> f129441f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__ErrorsKt$retry$3(long j10, yh.p<? super Throwable, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar, kotlin.coroutines.c<? super FlowKt__ErrorsKt$retry$3> cVar) {
        super(4, cVar);
        this.f129440e = j10;
        this.f129441f = pVar;
    }

    @Override // yh.r
    public /* bridge */ /* synthetic */ Object U0(Object obj, Throwable th2, Long l10, kotlin.coroutines.c<? super Boolean> cVar) {
        return a((f) obj, th2, l10.longValue(), cVar);
    }

    @dl.e
    public final Object a(@dl.d f<? super T> fVar, @dl.d Throwable th2, long j10, @dl.e kotlin.coroutines.c<? super Boolean> cVar) {
        FlowKt__ErrorsKt$retry$3 flowKt__ErrorsKt$retry$3 = new FlowKt__ErrorsKt$retry$3(this.f129440e, this.f129441f, cVar);
        flowKt__ErrorsKt$retry$3.f129438c = th2;
        flowKt__ErrorsKt$retry$3.f129439d = j10;
        return flowKt__ErrorsKt$retry$3.invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f129437b;
        if (i10 == 0) {
            t0.n(obj);
            Throwable th2 = (Throwable) this.f129438c;
            if (this.f129439d < this.f129440e) {
                yh.p<Throwable, kotlin.coroutines.c<? super Boolean>, Object> pVar = this.f129441f;
                this.f129437b = 1;
                obj = pVar.invoke(th2, this);
                if (obj == objH) {
                    return objH;
                }
            }
            return kotlin.coroutines.jvm.internal.a.a(z);
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        boolean z10 = ((Boolean) obj).booleanValue();
        return kotlin.coroutines.jvm.internal.a.a(z10);
    }
}
