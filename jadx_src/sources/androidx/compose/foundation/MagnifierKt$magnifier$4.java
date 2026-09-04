package androidx.compose.foundation;

import android.view.View;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.m2;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.t0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: Magnifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/n;", "j", "(Landroidx/compose/ui/n;Landroidx/compose/runtime/p;I)Landroidx/compose/ui/n;"}, k = 3, mv = {1, 7, 1})
public final class MagnifierKt$magnifier$4 extends Lambda implements yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ yh.l<s1.e, b1.f> f4969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ yh.l<s1.e, b1.f> f4970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ float f4971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.l<s1.l, b2> f4972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ j0 f4973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ c0 f4974g;

    /* JADX INFO: renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$1, reason: invalid class name */
    /* JADX INFO: compiled from: Magnifier.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1", f = "Magnifier.kt", i = {0}, l = {bb.c.b.f30532b4}, m = "invokeSuspend", n = {"magnifier"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f4975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f4976c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j0 f4977d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c0 f4978e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f4979f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ s1.e f4980g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f4981h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<b2> f4982i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ m2<yh.l<s1.l, b2>> f4983j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ m2<Boolean> f4984k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ m2<b1.f> f4985l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ m2<yh.l<s1.e, b1.f>> f4986m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ a1<b1.f> f4987n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ m2<Float> f4988o;

        /* JADX INFO: renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: Magnifier.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1$1", f = "Magnifier.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C00341 extends SuspendLambda implements yh.p<b2, kotlin.coroutines.c<? super b2>, Object> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f4989b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ i0 f4990c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00341(i0 i0Var, kotlin.coroutines.c<? super C00341> cVar) {
                super(2, cVar);
                this.f4990c = i0Var;
            }

            @Override // yh.p
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@dl.d b2 b2Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                return ((C00341) create(b2Var, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                return new C00341(this.f4990c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                kotlin.coroutines.intrinsics.b.h();
                if (this.f4989b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
                this.f4990c.c();
                return b2.f124493a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(j0 j0Var, c0 c0Var, View view, s1.e eVar, float f10, kotlinx.coroutines.flow.i<b2> iVar, m2<? extends yh.l<? super s1.l, b2>> m2Var, m2<Boolean> m2Var2, m2<b1.f> m2Var3, m2<? extends yh.l<? super s1.e, b1.f>> m2Var4, a1<b1.f> a1Var, m2<Float> m2Var5, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f4977d = j0Var;
            this.f4978e = c0Var;
            this.f4979f = view;
            this.f4980g = eVar;
            this.f4981h = f10;
            this.f4982i = iVar;
            this.f4983j = m2Var;
            this.f4984k = m2Var2;
            this.f4985l = m2Var3;
            this.f4986m = m2Var4;
            this.f4987n = a1Var;
            this.f4988o = m2Var5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f4977d, this.f4978e, this.f4979f, this.f4980g, this.f4981h, this.f4982i, this.f4983j, this.f4984k, this.f4985l, this.f4986m, this.f4987n, this.f4988o, cVar);
            anonymousClass1.f4976c = obj;
            return anonymousClass1;
        }

        @Override // yh.p
        @dl.e
        public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            i0 i0Var;
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f4975b;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i0Var = (i0) this.f4976c;
                try {
                    t0.n(obj);
                    i0Var.dismiss();
                    return b2.f124493a;
                } catch (Throwable th2) {
                    th = th2;
                    i0Var.dismiss();
                    throw th;
                }
            }
            t0.n(obj);
            q0 q0Var = (q0) this.f4976c;
            final i0 i0VarA = this.f4977d.a(this.f4978e, this.f4979f, this.f4980g, this.f4981h);
            final Ref.LongRef longRef = new Ref.LongRef();
            long jA = i0VarA.a();
            s1.e eVar = this.f4980g;
            yh.l lVarQ = MagnifierKt$magnifier$4.q(this.f4983j);
            if (lVarQ != null) {
                lVarQ.invoke(s1.l.c(eVar.n(s1.s.f(jA))));
            }
            longRef.f124890b = jA;
            kotlinx.coroutines.flow.g.U0(kotlinx.coroutines.flow.g.e1(this.f4982i, new C00341(i0VarA, null)), q0Var);
            try {
                final s1.e eVar2 = this.f4980g;
                final m2<Boolean> m2Var = this.f4984k;
                final m2<b1.f> m2Var2 = this.f4985l;
                final m2<yh.l<s1.e, b1.f>> m2Var3 = this.f4986m;
                final a1<b1.f> a1Var = this.f4987n;
                final m2<Float> m2Var4 = this.f4988o;
                final m2<yh.l<s1.l, b2>> m2Var5 = this.f4983j;
                kotlinx.coroutines.flow.e eVarV = e2.v(new yh.a<b2>() { // from class: androidx.compose.foundation.MagnifierKt.magnifier.4.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (!MagnifierKt$magnifier$4.l(m2Var)) {
                            i0VarA.dismiss();
                            return;
                        }
                        i0 i0Var2 = i0VarA;
                        long jR = MagnifierKt$magnifier$4.r(m2Var2);
                        Object objInvoke = MagnifierKt$magnifier$4.o(m2Var3).invoke(eVar2);
                        a1<b1.f> a1Var2 = a1Var;
                        long f30368a = ((b1.f) objInvoke).getF30368a();
                        i0Var2.b(jR, b1.g.d(f30368a) ? b1.f.v(MagnifierKt$magnifier$4.k(a1Var2), f30368a) : b1.f.f30364b.c(), MagnifierKt$magnifier$4.p(m2Var4));
                        long jA2 = i0VarA.a();
                        Ref.LongRef longRef2 = longRef;
                        s1.e eVar3 = eVar2;
                        m2<yh.l<s1.l, b2>> m2Var6 = m2Var5;
                        if (s1.r.h(jA2, longRef2.f124890b)) {
                            return;
                        }
                        longRef2.f124890b = jA2;
                        yh.l lVarQ2 = MagnifierKt$magnifier$4.q(m2Var6);
                        if (lVarQ2 != null) {
                            lVarQ2.invoke(s1.l.c(eVar3.n(s1.s.f(jA2))));
                        }
                    }
                });
                this.f4976c = i0VarA;
                this.f4975b = 1;
                if (kotlinx.coroutines.flow.g.x(eVarV, this) == objH) {
                    return objH;
                }
                i0Var = i0VarA;
                i0Var.dismiss();
                return b2.f124493a;
            } catch (Throwable th3) {
                th = th3;
                i0Var = i0VarA;
                i0Var.dismiss();
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MagnifierKt$magnifier$4(yh.l<? super s1.e, b1.f> lVar, yh.l<? super s1.e, b1.f> lVar2, float f10, yh.l<? super s1.l, b2> lVar3, j0 j0Var, c0 c0Var) {
        super(3);
        this.f4969b = lVar;
        this.f4970c = lVar2;
        this.f4971d = f10;
        this.f4972e = lVar3;
        this.f4973f = j0Var;
        this.f4974g = c0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(a1<b1.f> a1Var) {
        return a1Var.getValue().getF30368a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(m2<Boolean> m2Var) {
        return m2Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(a1<b1.f> a1Var, long j10) {
        a1Var.setValue(b1.f.d(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yh.l<s1.e, b1.f> n(m2<? extends yh.l<? super s1.e, b1.f>> m2Var) {
        return (yh.l) m2Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yh.l<s1.e, b1.f> o(m2<? extends yh.l<? super s1.e, b1.f>> m2Var) {
        return (yh.l) m2Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float p(m2<Float> m2Var) {
        return m2Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yh.l<s1.l, b2> q(m2<? extends yh.l<? super s1.l, b2>> m2Var) {
        return (yh.l) m2Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long r(m2<b1.f> m2Var) {
        return m2Var.getValue().getF30368a();
    }

    @Override // yh.q
    public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar, androidx.compose.runtime.p pVar, Integer num) {
        return j(nVar, pVar, num.intValue());
    }

    @dl.d
    @androidx.compose.runtime.h
    public final androidx.compose.ui.n j(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(composed, "$this$composed");
        pVar.T(-454877003);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-454877003, i10, -1, "androidx.compose.foundation.magnifier.<anonymous> (Magnifier.kt:272)");
        }
        View view = (View) pVar.K(AndroidCompositionLocals_androidKt.k());
        final s1.e eVar = (s1.e) pVar.K(CompositionLocalsKt.i());
        pVar.T(-492369756);
        Object objU = pVar.U();
        androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
        if (objU == companion.a()) {
            objU = h2.g(b1.f.d(b1.f.f30364b.c()), null, 2, null);
            pVar.N(objU);
        }
        pVar.c0();
        final a1 a1Var = (a1) objU;
        final m2 m2VarT = e2.t(this.f4969b, pVar, 0);
        m2 m2VarT2 = e2.t(this.f4970c, pVar, 0);
        m2 m2VarT3 = e2.t(Float.valueOf(this.f4971d), pVar, 0);
        m2 m2VarT4 = e2.t(this.f4972e, pVar, 0);
        pVar.T(-492369756);
        Object objU2 = pVar.U();
        if (objU2 == companion.a()) {
            objU2 = e2.d(new yh.a<b1.f>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$4$sourceCenterInRoot$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                public final long a() {
                    long f30368a = ((b1.f) MagnifierKt$magnifier$4.n(m2VarT).invoke(eVar)).getF30368a();
                    return (b1.g.d(MagnifierKt$magnifier$4.k(a1Var)) && b1.g.d(f30368a)) ? b1.f.v(MagnifierKt$magnifier$4.k(a1Var), f30368a) : b1.f.f30364b.c();
                }

                @Override // yh.a
                public /* bridge */ /* synthetic */ b1.f invoke() {
                    return b1.f.d(a());
                }
            });
            pVar.N(objU2);
        }
        pVar.c0();
        final m2 m2Var = (m2) objU2;
        pVar.T(-492369756);
        Object objU3 = pVar.U();
        if (objU3 == companion.a()) {
            objU3 = e2.d(new yh.a<Boolean>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$4$isMagnifierShown$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.valueOf(b1.g.d(MagnifierKt$magnifier$4.r(m2Var)));
                }
            });
            pVar.N(objU3);
        }
        pVar.c0();
        m2 m2Var2 = (m2) objU3;
        pVar.T(-492369756);
        Object objU4 = pVar.U();
        if (objU4 == companion.a()) {
            objU4 = kotlinx.coroutines.flow.o.b(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
            pVar.N(objU4);
        }
        pVar.c0();
        final kotlinx.coroutines.flow.i iVar = (kotlinx.coroutines.flow.i) objU4;
        float f10 = this.f4973f.b() ? 0.0f : this.f4971d;
        c0 c0Var = this.f4974g;
        EffectsKt.j(new Object[]{view, eVar, Float.valueOf(f10), c0Var, Boolean.valueOf(kotlin.jvm.internal.f0.g(c0Var, c0.INSTANCE.c()))}, new AnonymousClass1(this.f4973f, this.f4974g, view, eVar, this.f4971d, iVar, m2VarT4, m2Var2, m2Var, m2VarT2, a1Var, m2VarT3, null), pVar, 72);
        pVar.T(1157296644);
        boolean zS = pVar.s(a1Var);
        Object objU5 = pVar.U();
        if (zS || objU5 == companion.a()) {
            objU5 = new yh.l<androidx.compose.ui.layout.q, b2>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$4$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(@dl.d androidx.compose.ui.layout.q it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                    MagnifierKt$magnifier$4.m(a1Var, androidx.compose.ui.layout.r.f(it));
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.layout.q qVar) {
                    a(qVar);
                    return b2.f124493a;
                }
            };
            pVar.N(objU5);
        }
        pVar.c0();
        androidx.compose.ui.n nVarA = DrawModifierKt.a(OnGloballyPositionedModifierKt.a(composed, (yh.l) objU5), new yh.l<androidx.compose.ui.graphics.drawscope.g, b2>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$4.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g drawBehind) {
                kotlin.jvm.internal.f0.p(drawBehind, "$this$drawBehind");
                iVar.d(b2.f124493a);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
                a(gVar);
                return b2.f124493a;
            }
        });
        pVar.T(1157296644);
        boolean zS2 = pVar.s(m2Var);
        Object objU6 = pVar.U();
        if (zS2 || objU6 == companion.a()) {
            objU6 = new yh.l<androidx.compose.ui.semantics.r, b2>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$4$4$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(@dl.d androidx.compose.ui.semantics.r semantics) {
                    kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                    SemanticsPropertyKey<yh.a<b1.f>> semanticsPropertyKeyA = MagnifierKt.a();
                    final m2<b1.f> m2Var3 = m2Var;
                    semantics.a(semanticsPropertyKeyA, new yh.a<b1.f>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$4$4$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        public final long a() {
                            return MagnifierKt$magnifier$4.r(m2Var3);
                        }

                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b1.f invoke() {
                            return b1.f.d(a());
                        }
                    });
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.semantics.r rVar) {
                    a(rVar);
                    return b2.f124493a;
                }
            };
            pVar.N(objU6);
        }
        pVar.c0();
        androidx.compose.ui.n nVarC = SemanticsModifierKt.c(nVarA, false, (yh.l) objU6, 1, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return nVarC;
    }
}
