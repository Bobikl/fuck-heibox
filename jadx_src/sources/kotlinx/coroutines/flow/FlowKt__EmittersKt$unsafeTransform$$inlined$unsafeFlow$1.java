package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.c0;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/b2;", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1<R> implements e<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f129410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ yh.q f129411c;

    public FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1(e eVar, yh.q qVar) {
        this.f129410b = eVar;
        this.f129411c = qVar;
    }

    @Override // kotlinx.coroutines.flow.e
    @dl.e
    public Object a(@dl.d f<? super R> fVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objA = this.f129410b.a(new FlowKt__EmittersKt$unsafeTransform$1$1(this.f129411c, fVar), cVar);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
    }

    @dl.e
    public Object g(@dl.d f fVar, @dl.d kotlin.coroutines.c cVar) {
        c0.e(4);
        new ContinuationImpl(cVar) { // from class: kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f129412b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f129413c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) {
                this.f129412b = obj;
                this.f129413c |= Integer.MIN_VALUE;
                return FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1.this.a(null, this);
            }
        };
        c0.e(5);
        e eVar = this.f129410b;
        FlowKt__EmittersKt$unsafeTransform$1$1 flowKt__EmittersKt$unsafeTransform$1$1 = new FlowKt__EmittersKt$unsafeTransform$1$1(this.f129411c, fVar);
        c0.e(0);
        eVar.a(flowKt__EmittersKt$unsafeTransform$1$1, cVar);
        c0.e(1);
        return b2.f124493a;
    }
}
