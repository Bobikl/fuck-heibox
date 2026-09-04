package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: WindowInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1", f = "WindowInfo.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
public final class WindowInfoKt$WindowFocusObserver$1$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f15724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ o2 f15725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.runtime.m2<yh.l<Boolean, kotlin.b2>> f15726d;

    /* JADX INFO: compiled from: WindowInfo.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a implements kotlinx.coroutines.flow.f<Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.m2<yh.l<Boolean, kotlin.b2>> f15728b;

        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.runtime.m2<? extends yh.l<? super Boolean, kotlin.b2>> m2Var) {
            this.f15728b = m2Var;
        }

        @dl.e
        public final Object a(boolean z10, @dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
            this.f15728b.getValue().invoke(kotlin.coroutines.jvm.internal.a.a(z10));
            return kotlin.b2.f124493a;
        }

        @Override // kotlinx.coroutines.flow.f
        public /* bridge */ /* synthetic */ Object emit(Boolean bool, kotlin.coroutines.c cVar) {
            return a(bool.booleanValue(), cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WindowInfoKt$WindowFocusObserver$1$1(o2 o2Var, androidx.compose.runtime.m2<? extends yh.l<? super Boolean, kotlin.b2>> m2Var, kotlin.coroutines.c<? super WindowInfoKt$WindowFocusObserver$1$1> cVar) {
        super(2, cVar);
        this.f15725c = o2Var;
        this.f15726d = m2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new WindowInfoKt$WindowFocusObserver$1$1(this.f15725c, this.f15726d, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((WindowInfoKt$WindowFocusObserver$1$1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f15724b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            final o2 o2Var = this.f15725c;
            kotlinx.coroutines.flow.e eVarV = androidx.compose.runtime.e2.v(new yh.a<Boolean>() { // from class: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1.1
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.valueOf(o2Var.b());
                }
            });
            a aVar = new a(this.f15726d);
            this.f15724b = 1;
            if (eVarV.a(aVar, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        return kotlin.b2.f124493a;
    }
}
