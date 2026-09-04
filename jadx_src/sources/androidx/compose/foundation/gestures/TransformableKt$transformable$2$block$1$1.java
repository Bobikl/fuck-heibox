package androidx.compose.foundation.gestures;

import androidx.compose.runtime.m2;
import androidx.compose.ui.input.pointer.i0;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: Transformable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.TransformableKt$transformable$2$block$1$1", f = "Transformable.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
public final class TransformableKt$transformable$2$block$1$1 extends SuspendLambda implements yh.p<i0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f5736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f5737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ m2<Boolean> f5738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ m2<t> f5739e;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableKt$transformable$2$block$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: Transformable.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.TransformableKt$transformable$2$block$1$1$1", f = "Transformable.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<i0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f5740b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f5741c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m2<Boolean> f5742d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ m2<t> f5743e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(m2<Boolean> m2Var, m2<? extends t> m2Var2, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f5742d = m2Var;
            this.f5743e = m2Var2;
        }

        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d i0 i0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(i0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f5742d, this.f5743e, cVar);
            anonymousClass1.f5741c = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f5740b;
            if (i10 == 0) {
                t0.n(obj);
                i0 i0Var = (i0) this.f5741c;
                m2<Boolean> m2Var = this.f5742d;
                m2<t> m2Var2 = this.f5743e;
                this.f5740b = 1;
                if (TransformableKt.e(i0Var, m2Var, m2Var2, this) == objH) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TransformableKt$transformable$2$block$1$1(m2<Boolean> m2Var, m2<? extends t> m2Var2, kotlin.coroutines.c<? super TransformableKt$transformable$2$block$1$1> cVar) {
        super(2, cVar);
        this.f5738d = m2Var;
        this.f5739e = m2Var2;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d i0 i0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((TransformableKt$transformable$2$block$1$1) create(i0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        TransformableKt$transformable$2$block$1$1 transformableKt$transformable$2$block$1$1 = new TransformableKt$transformable$2$block$1$1(this.f5738d, this.f5739e, cVar);
        transformableKt$transformable$2$block$1$1.f5737c = obj;
        return transformableKt$transformable$2$block$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f5736b;
        if (i10 == 0) {
            t0.n(obj);
            i0 i0Var = (i0) this.f5737c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f5738d, this.f5739e, null);
            this.f5736b = 1;
            if (ForEachGestureKt.d(i0Var, anonymousClass1, this) == objH) {
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
