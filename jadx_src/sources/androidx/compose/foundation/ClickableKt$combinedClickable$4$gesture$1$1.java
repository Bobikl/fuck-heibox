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
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1$1", f = "Clickable.kt", i = {}, l = {bb.c.b.F3}, m = "invokeSuspend", n = {}, s = {})
public final class ClickableKt$combinedClickable$4$gesture$1$1 extends SuspendLambda implements yh.p<androidx.compose.ui.input.pointer.i0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f4783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f4784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ a1<b1.f> f4785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f4786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f4787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f4788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ m2<yh.a<b2>> f4789h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ m2<yh.a<b2>> f4790i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ androidx.compose.foundation.interaction.g f4791j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final /* synthetic */ a1<androidx.compose.foundation.interaction.i.b> f4792k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final /* synthetic */ m2<yh.a<Boolean>> f4793l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ m2<yh.a<b2>> f4794m;

    /* JADX INFO: renamed from: androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: Clickable.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1$1$3", f = "Clickable.kt", i = {}, l = {bb.c.b.S3}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements yh.q<androidx.compose.foundation.gestures.k, b1.f, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f4797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f4798c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ long f4799d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f4800e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.g f4801f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ a1<androidx.compose.foundation.interaction.i.b> f4802g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ m2<yh.a<Boolean>> f4803h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(boolean z10, androidx.compose.foundation.interaction.g gVar, a1<androidx.compose.foundation.interaction.i.b> a1Var, m2<? extends yh.a<Boolean>> m2Var, kotlin.coroutines.c<? super AnonymousClass3> cVar) {
            super(3, cVar);
            this.f4800e = z10;
            this.f4801f = gVar;
            this.f4802g = a1Var;
            this.f4803h = m2Var;
        }

        @dl.e
        public final Object a(@dl.d androidx.compose.foundation.gestures.k kVar, long j10, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.f4800e, this.f4801f, this.f4802g, this.f4803h, cVar);
            anonymousClass3.f4798c = kVar;
            anonymousClass3.f4799d = j10;
            return anonymousClass3.invokeSuspend(b2.f124493a);
        }

        @Override // yh.q
        public /* bridge */ /* synthetic */ Object invoke(androidx.compose.foundation.gestures.k kVar, b1.f fVar, kotlin.coroutines.c<? super b2> cVar) {
            return a(kVar, fVar.getF30368a(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f4797b;
            if (i10 == 0) {
                t0.n(obj);
                androidx.compose.foundation.gestures.k kVar = (androidx.compose.foundation.gestures.k) this.f4798c;
                long j10 = this.f4799d;
                if (this.f4800e) {
                    androidx.compose.foundation.interaction.g gVar = this.f4801f;
                    a1<androidx.compose.foundation.interaction.i.b> a1Var = this.f4802g;
                    m2<yh.a<Boolean>> m2Var = this.f4803h;
                    this.f4797b = 1;
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
    ClickableKt$combinedClickable$4$gesture$1$1(a1<b1.f> a1Var, boolean z10, boolean z11, boolean z12, m2<? extends yh.a<b2>> m2Var, m2<? extends yh.a<b2>> m2Var2, androidx.compose.foundation.interaction.g gVar, a1<androidx.compose.foundation.interaction.i.b> a1Var2, m2<? extends yh.a<Boolean>> m2Var3, m2<? extends yh.a<b2>> m2Var4, kotlin.coroutines.c<? super ClickableKt$combinedClickable$4$gesture$1$1> cVar) {
        super(2, cVar);
        this.f4785d = a1Var;
        this.f4786e = z10;
        this.f4787f = z11;
        this.f4788g = z12;
        this.f4789h = m2Var;
        this.f4790i = m2Var2;
        this.f4791j = gVar;
        this.f4792k = a1Var2;
        this.f4793l = m2Var3;
        this.f4794m = m2Var4;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d androidx.compose.ui.input.pointer.i0 i0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((ClickableKt$combinedClickable$4$gesture$1$1) create(i0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ClickableKt$combinedClickable$4$gesture$1$1 clickableKt$combinedClickable$4$gesture$1$1 = new ClickableKt$combinedClickable$4$gesture$1$1(this.f4785d, this.f4786e, this.f4787f, this.f4788g, this.f4789h, this.f4790i, this.f4791j, this.f4792k, this.f4793l, this.f4794m, cVar);
        clickableKt$combinedClickable$4$gesture$1$1.f4784c = obj;
        return clickableKt$combinedClickable$4$gesture$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        yh.l<b1.f, b2> lVar;
        yh.l<b1.f, b2> lVar2;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f4783b;
        if (i10 == 0) {
            t0.n(obj);
            androidx.compose.ui.input.pointer.i0 i0Var = (androidx.compose.ui.input.pointer.i0) this.f4784c;
            a1<b1.f> a1Var = this.f4785d;
            long jB = s1.s.b(i0Var.a());
            a1Var.setValue(b1.f.d(b1.g.a(s1.n.m(jB), s1.n.o(jB))));
            if (this.f4786e && this.f4787f) {
                final m2<yh.a<b2>> m2Var = this.f4789h;
                lVar = new yh.l<b1.f, b2>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void a(long j10) {
                        yh.a<b2> value = m2Var.getValue();
                        if (value != null) {
                            value.invoke();
                        }
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(b1.f fVar) {
                        a(fVar.getF30368a());
                        return b2.f124493a;
                    }
                };
            } else {
                lVar = null;
            }
            if (this.f4788g && this.f4787f) {
                final m2<yh.a<b2>> m2Var2 = this.f4790i;
                lVar2 = new yh.l<b1.f, b2>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void a(long j10) {
                        yh.a<b2> value = m2Var2.getValue();
                        if (value != null) {
                            value.invoke();
                        }
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(b1.f fVar) {
                        a(fVar.getF30368a());
                        return b2.f124493a;
                    }
                };
            } else {
                lVar2 = null;
            }
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.f4787f, this.f4791j, this.f4792k, this.f4793l, null);
            final boolean z10 = this.f4787f;
            final m2<yh.a<b2>> m2Var3 = this.f4794m;
            yh.l<b1.f, b2> lVar3 = new yh.l<b1.f, b2>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1$1.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void a(long j10) {
                    if (z10) {
                        m2Var3.getValue().invoke();
                    }
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(b1.f fVar) {
                    a(fVar.getF30368a());
                    return b2.f124493a;
                }
            };
            this.f4783b = 1;
            if (TapGestureDetectorKt.k(i0Var, lVar, lVar2, anonymousClass3, lVar3, this) == objH) {
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
