package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Distinct.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002Bg\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012:\u0010\u0014\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000e¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/flow/DistinctFlowImpl;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/b2;", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "b", "Lkotlinx/coroutines/flow/e;", "upstream", "Lkotlin/Function1;", "", "keySelector", "Lkotlin/Function2;", "Lkotlin/m0;", "name", "old", "new", "", "areEquivalent", "<init>", "(Lkotlinx/coroutines/flow/e;Lyh/l;Lyh/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class DistinctFlowImpl<T> implements e<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final e<T> upstream;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    @xh.e
    public final yh.l<T, Object> f129206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    @xh.e
    public final yh.p<Object, Object, Boolean> f129207d;

    /* JADX WARN: Multi-variable type inference failed */
    public DistinctFlowImpl(@dl.d e<? extends T> eVar, @dl.d yh.l<? super T, ? extends Object> lVar, @dl.d yh.p<Object, Object, Boolean> pVar) {
        this.upstream = eVar;
        this.f129206c = lVar;
        this.f129207d = pVar;
    }

    @Override // kotlinx.coroutines.flow.e
    @dl.e
    public Object a(@dl.d f<? super T> fVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f124891b = (T) kotlinx.coroutines.flow.internal.l.f130082a;
        Object objA = this.upstream.a(new DistinctFlowImpl$collect$2(this, objectRef, fVar), cVar);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
    }
}
