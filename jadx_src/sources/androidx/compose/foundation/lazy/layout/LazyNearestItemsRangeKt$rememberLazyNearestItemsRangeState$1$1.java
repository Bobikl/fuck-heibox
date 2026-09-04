package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.e2;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: LazyNearestItemsRange.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1", f = "LazyNearestItemsRange.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
public final class LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f7102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ yh.a<Integer> f7103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ yh.a<Integer> f7104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.a<Integer> f7105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ a1<fi.l> f7106f;

    /* JADX INFO: compiled from: LazyNearestItemsRange.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a implements kotlinx.coroutines.flow.f<fi.l> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a1<fi.l> f7110b;

        a(a1<fi.l> a1Var) {
            this.f7110b = a1Var;
        }

        @Override // kotlinx.coroutines.flow.f
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(@dl.d fi.l lVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            this.f7110b.setValue(lVar);
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1(yh.a<Integer> aVar, yh.a<Integer> aVar2, yh.a<Integer> aVar3, a1<fi.l> a1Var, kotlin.coroutines.c<? super LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1> cVar) {
        super(2, cVar);
        this.f7103c = aVar;
        this.f7104d = aVar2;
        this.f7105e = aVar3;
        this.f7106f = a1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1(this.f7103c, this.f7104d, this.f7105e, this.f7106f, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f7102b;
        if (i10 == 0) {
            t0.n(obj);
            final yh.a<Integer> aVar = this.f7103c;
            final yh.a<Integer> aVar2 = this.f7104d;
            final yh.a<Integer> aVar3 = this.f7105e;
            kotlinx.coroutines.flow.e eVarV = e2.v(new yh.a<fi.l>() { // from class: androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final fi.l invoke() {
                    return LazyNearestItemsRangeKt.b(aVar.invoke().intValue(), aVar2.invoke().intValue(), aVar3.invoke().intValue());
                }
            });
            a aVar4 = new a(this.f7106f);
            this.f7102b = 1;
            if (eVarV.a(aVar4, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
