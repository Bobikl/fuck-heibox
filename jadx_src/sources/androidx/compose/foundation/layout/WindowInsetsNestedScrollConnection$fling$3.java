package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.Animatable;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3", f = "WindowInsetsConnection.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class WindowInsetsNestedScrollConnection$fling$3 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f6244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f6245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ WindowInsetsNestedScrollConnection f6246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f6247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f6248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ float f6249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ WindowInsetsAnimationController f6250h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ boolean f6251i;

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1, reason: invalid class name */
    /* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1", f = "WindowInsetsConnection.android.kt", i = {}, l = {bb.c.b.U3}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f6252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6253c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f6254d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f6255e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ WindowInsetsAnimationController f6256f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f6257g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ WindowInsetsNestedScrollConnection f6258h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i10, int i11, float f10, WindowInsetsAnimationController windowInsetsAnimationController, boolean z10, WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f6253c = i10;
            this.f6254d = i11;
            this.f6255e = f10;
            this.f6256f = windowInsetsAnimationController;
            this.f6257g = z10;
            this.f6258h = windowInsetsNestedScrollConnection;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.f6253c, this.f6254d, this.f6255e, this.f6256f, this.f6257g, this.f6258h, cVar);
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
            int i10 = this.f6252b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                Animatable animatableB = androidx.compose.animation.core.b.b(this.f6253c, 0.0f, 2, null);
                Float fE = kotlin.coroutines.jvm.internal.a.e(this.f6254d);
                Float fE2 = kotlin.coroutines.jvm.internal.a.e(this.f6255e);
                final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.f6258h;
                yh.l<Animatable<Float, androidx.compose.animation.core.l>, b2> lVar = new yh.l<Animatable<Float, androidx.compose.animation.core.l>, b2>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.fling.3.1.1
                    {
                        super(1);
                    }

                    public final void a(@dl.d Animatable<Float, androidx.compose.animation.core.l> animateTo) {
                        kotlin.jvm.internal.f0.p(animateTo, "$this$animateTo");
                        windowInsetsNestedScrollConnection.m(animateTo.u().floatValue());
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(Animatable<Float, androidx.compose.animation.core.l> animatable) {
                        a(animatable);
                        return b2.f124493a;
                    }
                };
                this.f6252b = 1;
                if (Animatable.i(animatableB, fE, null, fE2, lVar, this, 2, null) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            this.f6256f.finish(this.f6257g);
            this.f6258h.animationController = null;
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowInsetsNestedScrollConnection$fling$3(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, int i10, int i11, float f10, WindowInsetsAnimationController windowInsetsAnimationController, boolean z10, kotlin.coroutines.c<? super WindowInsetsNestedScrollConnection$fling$3> cVar) {
        super(2, cVar);
        this.f6246d = windowInsetsNestedScrollConnection;
        this.f6247e = i10;
        this.f6248f = i11;
        this.f6249g = f10;
        this.f6250h = windowInsetsAnimationController;
        this.f6251i = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        WindowInsetsNestedScrollConnection$fling$3 windowInsetsNestedScrollConnection$fling$3 = new WindowInsetsNestedScrollConnection$fling$3(this.f6246d, this.f6247e, this.f6248f, this.f6249g, this.f6250h, this.f6251i, cVar);
        windowInsetsNestedScrollConnection$fling$3.f6245c = obj;
        return windowInsetsNestedScrollConnection$fling$3;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((WindowInsetsNestedScrollConnection$fling$3) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f6244b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) this.f6245c;
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.f6246d;
        windowInsetsNestedScrollConnection.animationJob = kotlinx.coroutines.k.f(q0Var, null, null, new AnonymousClass1(this.f6247e, this.f6248f, this.f6249g, this.f6250h, this.f6251i, windowInsetsNestedScrollConnection, null), 3, null);
        return b2.f124493a;
    }
}
