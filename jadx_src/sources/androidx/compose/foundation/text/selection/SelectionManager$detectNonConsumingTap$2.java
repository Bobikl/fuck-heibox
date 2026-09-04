package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.i0;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: SelectionManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/i0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.text.selection.SelectionManager$detectNonConsumingTap$2", f = "SelectionManager.kt", i = {}, l = {bb.c.b.V8}, m = "invokeSuspend", n = {}, s = {})
public final class SelectionManager$detectNonConsumingTap$2 extends SuspendLambda implements yh.p<i0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f8242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f8243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ yh.l<b1.f, b2> f8244d;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionManager$detectNonConsumingTap$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: SelectionManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.text.selection.SelectionManager$detectNonConsumingTap$2$1", f = "SelectionManager.kt", i = {}, l = {bb.c.b.W8}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f8245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i0 f8246c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ yh.l<b1.f, b2> f8247d;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionManager$detectNonConsumingTap$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: SelectionManager.kt */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/d;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.text.selection.SelectionManager$detectNonConsumingTap$2$1$1", f = "SelectionManager.kt", i = {}, l = {bb.c.b.X8}, m = "invokeSuspend", n = {}, s = {})
        public static final class C00581 extends RestrictedSuspendLambda implements yh.p<androidx.compose.ui.input.pointer.d, kotlin.coroutines.c<? super b2>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f8248c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f8249d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ yh.l<b1.f, b2> f8250e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00581(yh.l<? super b1.f, b2> lVar, kotlin.coroutines.c<? super C00581> cVar) {
                super(2, cVar);
                this.f8250e = lVar;
            }

            @Override // yh.p
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@dl.d androidx.compose.ui.input.pointer.d dVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                return ((C00581) create(dVar, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                C00581 c00581 = new C00581(this.f8250e, cVar);
                c00581.f8249d = obj;
                return c00581;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                Object objH = kotlin.coroutines.intrinsics.b.h();
                int i10 = this.f8248c;
                if (i10 == 0) {
                    t0.n(obj);
                    androidx.compose.ui.input.pointer.d dVar = (androidx.compose.ui.input.pointer.d) this.f8249d;
                    this.f8248c = 1;
                    obj = TapGestureDetectorKt.m(dVar, this);
                    if (obj == objH) {
                        return objH;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t0.n(obj);
                }
                PointerInputChange pointerInputChange = (PointerInputChange) obj;
                if (pointerInputChange != null) {
                    this.f8250e.invoke(b1.f.d(pointerInputChange.getPosition()));
                }
                return b2.f124493a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(i0 i0Var, yh.l<? super b1.f, b2> lVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f8246c = i0Var;
            this.f8247d = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.f8246c, this.f8247d, cVar);
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
            int i10 = this.f8245b;
            if (i10 == 0) {
                t0.n(obj);
                i0 i0Var = this.f8246c;
                C00581 c00581 = new C00581(this.f8247d, null);
                this.f8245b = 1;
                if (i0Var.n1(c00581, this) == objH) {
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
    SelectionManager$detectNonConsumingTap$2(yh.l<? super b1.f, b2> lVar, kotlin.coroutines.c<? super SelectionManager$detectNonConsumingTap$2> cVar) {
        super(2, cVar);
        this.f8244d = lVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d i0 i0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((SelectionManager$detectNonConsumingTap$2) create(i0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        SelectionManager$detectNonConsumingTap$2 selectionManager$detectNonConsumingTap$2 = new SelectionManager$detectNonConsumingTap$2(this.f8244d, cVar);
        selectionManager$detectNonConsumingTap$2.f8243c = obj;
        return selectionManager$detectNonConsumingTap$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f8242b;
        if (i10 == 0) {
            t0.n(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((i0) this.f8243c, this.f8244d, null);
            this.f8242b = 1;
            if (r0.g(anonymousClass1, this) == objH) {
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
