package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.d2;

/* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2", f = "WindowInsetsConnection.android.kt", i = {}, l = {bb.c.b.K3}, m = "invokeSuspend", n = {}, s = {})
public final class WindowInsetsNestedScrollConnection$fling$2 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f6217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f6218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ WindowInsetsNestedScrollConnection f6219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f6220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ float f6221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ c1 f6222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f6223h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f6224i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ Ref.FloatRef f6225j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final /* synthetic */ WindowInsetsAnimationController f6226k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final /* synthetic */ boolean f6227l;

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1", f = "WindowInsetsConnection.android.kt", i = {}, l = {bb.c.b.f30965u3}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f6228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6229c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f6230d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c1 f6231e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f6232f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f6233g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ WindowInsetsNestedScrollConnection f6234h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f6235i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ WindowInsetsAnimationController f6236j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f6237k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i10, float f10, c1 c1Var, int i11, int i12, WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, Ref.FloatRef floatRef, WindowInsetsAnimationController windowInsetsAnimationController, boolean z10, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f6229c = i10;
            this.f6230d = f10;
            this.f6231e = c1Var;
            this.f6232f = i11;
            this.f6233g = i12;
            this.f6234h = windowInsetsNestedScrollConnection;
            this.f6235i = floatRef;
            this.f6236j = windowInsetsAnimationController;
            this.f6237k = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.f6229c, this.f6230d, this.f6231e, this.f6232f, this.f6233g, this.f6234h, this.f6235i, this.f6236j, this.f6237k, cVar);
        }

        @Override // yh.p
        @dl.e
        public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f6228b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                float f10 = this.f6229c;
                float f11 = this.f6230d;
                c1 c1Var = this.f6231e;
                final int i11 = this.f6232f;
                final int i12 = this.f6233g;
                final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.f6234h;
                final Ref.FloatRef floatRef = this.f6235i;
                final WindowInsetsAnimationController windowInsetsAnimationController = this.f6236j;
                final boolean z10 = this.f6237k;
                yh.p<Float, Float, b2> pVar = new yh.p<Float, Float, b2>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.fling.2.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(float f12, float f13) {
                        float f14 = i11;
                        boolean z11 = false;
                        if (f12 <= i12 && f14 <= f12) {
                            z11 = true;
                        }
                        if (z11) {
                            windowInsetsNestedScrollConnection.m(f12);
                            return;
                        }
                        floatRef.f124888b = f13;
                        windowInsetsAnimationController.finish(z10);
                        windowInsetsNestedScrollConnection.animationController = null;
                        d2 d2Var = windowInsetsNestedScrollConnection.animationJob;
                        if (d2Var != null) {
                            d2.a.b(d2Var, null, 1, null);
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(Float f12, Float f13) {
                        a(f12.floatValue(), f13.floatValue());
                        return b2.f124493a;
                    }
                };
                this.f6228b = 1;
                if (SuspendAnimationKt.i(f10, f11, c1Var, pVar, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowInsetsNestedScrollConnection$fling$2(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, int i10, float f10, c1 c1Var, int i11, int i12, Ref.FloatRef floatRef, WindowInsetsAnimationController windowInsetsAnimationController, boolean z10, kotlin.coroutines.c<? super WindowInsetsNestedScrollConnection$fling$2> cVar) {
        super(2, cVar);
        this.f6219d = windowInsetsNestedScrollConnection;
        this.f6220e = i10;
        this.f6221f = f10;
        this.f6222g = c1Var;
        this.f6223h = i11;
        this.f6224i = i12;
        this.f6225j = floatRef;
        this.f6226k = windowInsetsAnimationController;
        this.f6227l = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        WindowInsetsNestedScrollConnection$fling$2 windowInsetsNestedScrollConnection$fling$2 = new WindowInsetsNestedScrollConnection$fling$2(this.f6219d, this.f6220e, this.f6221f, this.f6222g, this.f6223h, this.f6224i, this.f6225j, this.f6226k, this.f6227l, cVar);
        windowInsetsNestedScrollConnection$fling$2.f6218c = obj;
        return windowInsetsNestedScrollConnection$fling$2;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((WindowInsetsNestedScrollConnection$fling$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f6217b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) this.f6218c;
            WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.f6219d;
            windowInsetsNestedScrollConnection.animationJob = kotlinx.coroutines.k.f(q0Var, null, null, new AnonymousClass1(this.f6220e, this.f6221f, this.f6222g, this.f6223h, this.f6224i, windowInsetsNestedScrollConnection, this.f6225j, this.f6226k, this.f6227l, null), 3, null);
            d2 d2Var = this.f6219d.animationJob;
            if (d2Var != null) {
                this.f6217b = 1;
                if (d2Var.g0(this) == objH) {
                    return objH;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        this.f6219d.animationJob = null;
        return b2.f124493a;
    }
}
