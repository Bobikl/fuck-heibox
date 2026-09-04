package kotlinx.coroutines.flow.internal;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlinx.coroutines.r0;
import yh.q;

/* JADX INFO: compiled from: Combine.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0092\u0001\u0010\u000e\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u00010\u00030\u000629\u0010\r\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\fH\u0081@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001ap\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\"\u0004\b\u0000\u0010\u0010\"\u0004\b\u0001\u0010\u0011\"\u0004\b\u0002\u0010\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042(\u0010\r\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015*\u001c\b\u0002\u0010\u0017\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00162\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"R", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/f;", "", "Lkotlinx/coroutines/flow/e;", "flows", "Lkotlin/Function0;", "arrayFactory", "Lkotlin/Function3;", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "", "Lkotlin/t;", "transform", ak.av, "(Lkotlinx/coroutines/flow/f;[Lkotlinx/coroutines/flow/e;Lyh/a;Lyh/q;Lkotlin/coroutines/c;)Ljava/lang/Object;", "T1", "T2", "flow", "flow2", "b", "(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lyh/q;)Lkotlinx/coroutines/flow/e;", "Lkotlin/collections/h0;", "Update", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class CombineKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/b2;", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a<R> implements kotlinx.coroutines.flow.e<R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.e f129989b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.e f129990c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ q f129991d;

        public a(kotlinx.coroutines.flow.e eVar, kotlinx.coroutines.flow.e eVar2, q qVar) {
            this.f129989b = eVar;
            this.f129990c = eVar2;
            this.f129991d = qVar;
        }

        @Override // kotlinx.coroutines.flow.e
        @dl.e
        public Object a(@dl.d kotlinx.coroutines.flow.f<? super R> fVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            Object objG = r0.g(new CombineKt$zipImpl$1$1(fVar, this.f129989b, this.f129990c, this.f129991d, null), cVar);
            return objG == kotlin.coroutines.intrinsics.b.h() ? objG : b2.f124493a;
        }
    }

    @kotlin.r0
    @dl.e
    public static final <R, T> Object a(@dl.d kotlinx.coroutines.flow.f<? super R> fVar, @dl.d kotlinx.coroutines.flow.e<? extends T>[] eVarArr, @dl.d yh.a<T[]> aVar, @dl.d q<? super kotlinx.coroutines.flow.f<? super R>, ? super T[], ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objA = FlowCoroutineKt.a(new CombineKt$combineInternal$2(eVarArr, aVar, qVar, fVar, null), cVar);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
    }

    @dl.d
    public static final <T1, T2, R> kotlinx.coroutines.flow.e<R> b(@dl.d kotlinx.coroutines.flow.e<? extends T1> eVar, @dl.d kotlinx.coroutines.flow.e<? extends T2> eVar2, @dl.d q<? super T1, ? super T2, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return new a(eVar2, eVar, qVar);
    }
}
