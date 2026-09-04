package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.t0;

/* JADX INFO: compiled from: Count.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a#\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aG\u0010\n\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/e;", "", ak.av, "(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "", "", "predicate", "b", "(Lkotlinx/coroutines/flow/e;Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__CountKt {

    /* JADX INFO: compiled from: Count.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {androidx.exifinterface.media.a.f23244d5, "it", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class a<T> implements f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f129304b;

        a(Ref.IntRef intRef) {
            this.f129304b = intRef;
        }

        @Override // kotlinx.coroutines.flow.f
        @dl.e
        public final Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            this.f129304b.f124889b++;
            return b2.f124493a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public static final <T> Object a(@dl.d e<? extends T> eVar, @dl.d kotlin.coroutines.c<? super Integer> cVar) throws Throwable {
        FlowKt__CountKt$count$1 flowKt__CountKt$count$1;
        Ref.IntRef intRef;
        if (cVar instanceof FlowKt__CountKt$count$1) {
            flowKt__CountKt$count$1 = (FlowKt__CountKt$count$1) cVar;
            int i10 = flowKt__CountKt$count$1.f129307d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__CountKt$count$1.f129307d = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__CountKt$count$1 = new FlowKt__CountKt$count$1(cVar);
            }
        } else {
            flowKt__CountKt$count$1 = new FlowKt__CountKt$count$1(cVar);
        }
        Object obj = flowKt__CountKt$count$1.f129306c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = flowKt__CountKt$count$1.f129307d;
        if (i11 == 0) {
            t0.n(obj);
            Ref.IntRef intRef2 = new Ref.IntRef();
            f<? super Object> aVar = new a<>(intRef2);
            flowKt__CountKt$count$1.f129305b = intRef2;
            flowKt__CountKt$count$1.f129307d = 1;
            if (eVar.a(aVar, flowKt__CountKt$count$1) == objH) {
                return objH;
            }
            intRef = intRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            intRef = (Ref.IntRef) flowKt__CountKt$count$1.f129305b;
            t0.n(obj);
        }
        return kotlin.coroutines.jvm.internal.a.f(intRef.f124889b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public static final <T> Object b(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super Integer> cVar) throws Throwable {
        FlowKt__CountKt$count$3 flowKt__CountKt$count$3;
        Ref.IntRef intRef;
        if (cVar instanceof FlowKt__CountKt$count$3) {
            flowKt__CountKt$count$3 = (FlowKt__CountKt$count$3) cVar;
            int i10 = flowKt__CountKt$count$3.f129310d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__CountKt$count$3.f129310d = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__CountKt$count$3 = new FlowKt__CountKt$count$3(cVar);
            }
        } else {
            flowKt__CountKt$count$3 = new FlowKt__CountKt$count$3(cVar);
        }
        Object obj = flowKt__CountKt$count$3.f129309c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = flowKt__CountKt$count$3.f129310d;
        if (i11 == 0) {
            t0.n(obj);
            Ref.IntRef intRef2 = new Ref.IntRef();
            f<? super Object> flowKt__CountKt$count$4 = new FlowKt__CountKt$count$4<>(pVar, intRef2);
            flowKt__CountKt$count$3.f129308b = intRef2;
            flowKt__CountKt$count$3.f129310d = 1;
            if (eVar.a(flowKt__CountKt$count$4, flowKt__CountKt$count$3) == objH) {
                return objH;
            }
            intRef = intRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            intRef = (Ref.IntRef) flowKt__CountKt$count$3.f129308b;
            t0.n(obj);
        }
        return kotlin.coroutines.jvm.internal.a.f(intRef.f124889b);
    }
}
