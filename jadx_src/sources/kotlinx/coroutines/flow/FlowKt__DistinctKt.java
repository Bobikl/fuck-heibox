package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.w0;

/* JADX INFO: compiled from: Distinct.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001aT\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010\t\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u001a6\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\u001aw\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f2:\u0010\t\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/e;", ak.av, "Lkotlin/Function2;", "Lkotlin/m0;", "name", "old", "new", "", "areEquivalent", "b", "K", "Lkotlin/Function1;", "keySelector", ak.aF, "", "d", "(Lkotlinx/coroutines/flow/e;Lyh/l;Lyh/p;)Lkotlinx/coroutines/flow/e;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__DistinctKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final yh.l<Object, Object> f129366a = new yh.l<Object, Object>() { // from class: kotlinx.coroutines.flow.FlowKt__DistinctKt$defaultKeySelector$1
        @Override // yh.l
        @dl.e
        public final Object invoke(@dl.e Object obj) {
            return obj;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final yh.p<Object, Object, Boolean> f129367b = new yh.p<Object, Object, Boolean>() { // from class: kotlinx.coroutines.flow.FlowKt__DistinctKt$defaultAreEquivalent$1
        @Override // yh.p
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@dl.e Object obj, @dl.e Object obj2) {
            return Boolean.valueOf(f0.g(obj, obj2));
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <T> e<T> a(@dl.d e<? extends T> eVar) {
        return eVar instanceof u ? eVar : d(eVar, f129366a, f129367b);
    }

    @dl.d
    public static final <T> e<T> b(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super T, Boolean> pVar) {
        return d(eVar, f129366a, (yh.p) w0.q(pVar, 2));
    }

    @dl.d
    public static final <T, K> e<T> c(@dl.d e<? extends T> eVar, @dl.d yh.l<? super T, ? extends K> lVar) {
        return d(eVar, lVar, f129367b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> e<T> d(e<? extends T> eVar, yh.l<? super T, ? extends Object> lVar, yh.p<Object, Object, Boolean> pVar) {
        if (eVar instanceof DistinctFlowImpl) {
            DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) eVar;
            if (distinctFlowImpl.f129206c == lVar && distinctFlowImpl.f129207d == pVar) {
                return eVar;
            }
        }
        return new DistinctFlowImpl(eVar, lVar, pVar);
    }

    private static /* synthetic */ void e() {
    }

    private static /* synthetic */ void f() {
    }
}
