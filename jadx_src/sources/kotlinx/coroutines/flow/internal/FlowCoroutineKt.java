package kotlinx.coroutines.flow.internal;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlinx.coroutines.q0;
import yh.p;
import yh.q;

/* JADX INFO: compiled from: FlowCoroutine.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002)\b\u0001\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¢\u0006\u0002\b\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aU\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u000025\b\u0001\u0010\u0006\u001a/\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t¢\u0006\u0002\b\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"R", "Lkotlin/Function2;", "Lkotlinx/coroutines/q0;", "Lkotlin/coroutines/c;", "", "Lkotlin/t;", "block", ak.av, "(Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/f;", "Lkotlin/b2;", "Lkotlinx/coroutines/flow/e;", "b", "(Lyh/q;)Lkotlinx/coroutines/flow/e;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class FlowCoroutineKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/b2;", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a<R> implements kotlinx.coroutines.flow.e<R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f130048b;

        public a(q qVar) {
            this.f130048b = qVar;
        }

        @Override // kotlinx.coroutines.flow.e
        @dl.e
        public Object a(@dl.d kotlinx.coroutines.flow.f<? super R> fVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            Object objA = FlowCoroutineKt.a(new FlowCoroutineKt$scopedFlow$1$1(this.f130048b, fVar, null), cVar);
            return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
        }
    }

    @dl.e
    public static final <R> Object a(@kotlin.b @dl.d p<? super q0, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super R> cVar) {
        g gVar = new g(cVar.getCom.umeng.analytics.pro.d.R java.lang.String(), cVar);
        Object objF = bj.b.f(gVar, gVar, pVar);
        if (objF == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objF;
    }

    @dl.d
    public static final <R> kotlinx.coroutines.flow.e<R> b(@kotlin.b @dl.d q<? super q0, ? super kotlinx.coroutines.flow.f<? super R>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar) {
        return new a(qVar);
    }
}
