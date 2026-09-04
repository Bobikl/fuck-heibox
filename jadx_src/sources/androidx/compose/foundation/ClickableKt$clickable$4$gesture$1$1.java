package androidx.compose.foundation;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.m2;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1", f = "Clickable.kt", i = {}, l = {156}, m = "invokeSuspend", n = {}, s = {})
public final class ClickableKt$clickable$4$gesture$1$1 extends SuspendLambda implements yh.p<androidx.compose.ui.input.pointer.i0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f4733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f4734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ a1<b1.f> f4735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f4736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ androidx.compose.foundation.interaction.g f4737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ a1<androidx.compose.foundation.interaction.i.b> f4738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ m2<yh.a<Boolean>> f4739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ m2<yh.a<b2>> f4740i;

    /* JADX INFO: renamed from: androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: Clickable.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1$1", f = "Clickable.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.q<androidx.compose.foundation.gestures.k, b1.f, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f4741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f4742c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ long f4743d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f4744e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.g f4745f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ a1<androidx.compose.foundation.interaction.i.b> f4746g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ m2<yh.a<Boolean>> f4747h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(boolean z10, androidx.compose.foundation.interaction.g gVar, a1<androidx.compose.foundation.interaction.i.b> a1Var, m2<? extends yh.a<Boolean>> m2Var, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(3, cVar);
            this.f4744e = z10;
            this.f4745f = gVar;
            this.f4746g = a1Var;
            this.f4747h = m2Var;
        }

        @dl.e
        public final Object a(@dl.d androidx.compose.foundation.gestures.k kVar, long j10, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f4744e, this.f4745f, this.f4746g, this.f4747h, cVar);
            anonymousClass1.f4742c = kVar;
            anonymousClass1.f4743d = j10;
            return anonymousClass1.invokeSuspend(b2.f124493a);
        }

        @Override // yh.q
        public /* bridge */ /* synthetic */ Object invoke(androidx.compose.foundation.gestures.k kVar, b1.f fVar, kotlin.coroutines.c<? super b2> cVar) {
            return a(kVar, fVar.getF30368a(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f4741b;
            if (i10 == 0) {
                t0.n(obj);
                androidx.compose.foundation.gestures.k kVar = (androidx.compose.foundation.gestures.k) this.f4742c;
                long j10 = this.f4743d;
                if (this.f4744e) {
                    androidx.compose.foundation.interaction.g gVar = this.f4745f;
                    a1<androidx.compose.foundation.interaction.i.b> a1Var = this.f4746g;
                    m2<yh.a<Boolean>> m2Var = this.f4747h;
                    this.f4741b = 1;
                    if (ClickableKt.n(kVar, j10, gVar, a1Var, m2Var, this) == objH) {
                        return objH;
                    }
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
    ClickableKt$clickable$4$gesture$1$1(a1<b1.f> a1Var, boolean z10, androidx.compose.foundation.interaction.g gVar, a1<androidx.compose.foundation.interaction.i.b> a1Var2, m2<? extends yh.a<Boolean>> m2Var, m2<? extends yh.a<b2>> m2Var2, kotlin.coroutines.c<? super ClickableKt$clickable$4$gesture$1$1> cVar) {
        super(2, cVar);
        this.f4735d = a1Var;
        this.f4736e = z10;
        this.f4737f = gVar;
        this.f4738g = a1Var2;
        this.f4739h = m2Var;
        this.f4740i = m2Var2;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d androidx.compose.ui.input.pointer.i0 i0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((ClickableKt$clickable$4$gesture$1$1) create(i0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ClickableKt$clickable$4$gesture$1$1 clickableKt$clickable$4$gesture$1$1 = new ClickableKt$clickable$4$gesture$1$1(this.f4735d, this.f4736e, this.f4737f, this.f4738g, this.f4739h, this.f4740i, cVar);
        clickableKt$clickable$4$gesture$1$1.f4734c = obj;
        return clickableKt$clickable$4$gesture$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f4733b;
        if (i10 == 0) {
            t0.n(obj);
            androidx.compose.ui.input.pointer.i0 i0Var = (androidx.compose.ui.input.pointer.i0) this.f4734c;
            a1<b1.f> a1Var = this.f4735d;
            long jB = s1.s.b(i0Var.a());
            a1Var.setValue(b1.f.d(b1.g.a(s1.n.m(jB), s1.n.o(jB))));
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f4736e, this.f4737f, this.f4738g, this.f4739h, null);
            final boolean z10 = this.f4736e;
            final m2<yh.a<b2>> m2Var = this.f4740i;
            yh.l<b1.f, b2> lVar = new yh.l<b1.f, b2>() { // from class: androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void a(long j10) {
                    if (z10) {
                        m2Var.getValue().invoke();
                    }
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(b1.f fVar) {
                    a(fVar.getF30368a());
                    return b2.f124493a;
                }
            };
            this.f4733b = 1;
            if (TapGestureDetectorKt.i(i0Var, anonymousClass1, lVar, this) == objH) {
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
