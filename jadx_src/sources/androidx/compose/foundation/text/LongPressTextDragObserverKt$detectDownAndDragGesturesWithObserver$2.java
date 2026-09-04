package androidx.compose.foundation.text;

import androidx.compose.ui.input.pointer.i0;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: LongPressTextDragObserver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlinx/coroutines/d2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super d2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f7847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f7848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ i0 f7849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ r f7850e;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: LongPressTextDragObserver.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f7851b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i0 f7852c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ r f7853d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(i0 i0Var, r rVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f7852c = i0Var;
            this.f7853d = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.f7852c, this.f7853d, cVar);
        }

        @Override // yh.p
        @dl.e
        public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f7851b;
            if (i10 == 0) {
                t0.n(obj);
                i0 i0Var = this.f7852c;
                r rVar = this.f7853d;
                this.f7851b = 1;
                if (LongPressTextDragObserverKt.f(i0Var, rVar, this) == objH) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2, reason: invalid class name */
    /* JADX INFO: compiled from: LongPressTextDragObserver.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", f = "LongPressTextDragObserver.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f7854b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i0 f7855c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ r f7856d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(i0 i0Var, r rVar, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.f7855c = i0Var;
            this.f7856d = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass2(this.f7855c, this.f7856d, cVar);
        }

        @Override // yh.p
        @dl.e
        public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f7854b;
            if (i10 == 0) {
                t0.n(obj);
                i0 i0Var = this.f7855c;
                r rVar = this.f7856d;
                this.f7854b = 1;
                if (LongPressTextDragObserverKt.e(i0Var, rVar, this) == objH) {
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
    LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(i0 i0Var, r rVar, kotlin.coroutines.c<? super LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2> cVar) {
        super(2, cVar);
        this.f7849d = i0Var;
        this.f7850e = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2 longPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2 = new LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(this.f7849d, this.f7850e, cVar);
        longPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2.f7848c = obj;
        return longPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super d2> cVar) {
        return ((LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f7847b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        q0 q0Var = (q0) this.f7848c;
        kotlinx.coroutines.k.f(q0Var, null, null, new AnonymousClass1(this.f7849d, this.f7850e, null), 3, null);
        return kotlinx.coroutines.k.f(q0Var, null, null, new AnonymousClass2(this.f7849d, this.f7850e, null), 3, null);
    }
}
