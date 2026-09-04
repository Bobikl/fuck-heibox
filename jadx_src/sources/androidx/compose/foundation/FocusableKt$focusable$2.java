package androidx.compose.foundation;

import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.t0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: Focusable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/n;", "e", "(Landroidx/compose/ui/n;Landroidx/compose/runtime/p;I)Landroidx/compose/ui/n;"}, k = 3, mv = {1, 7, 1})
public final class FocusableKt$focusable$2 extends Lambda implements yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.foundation.interaction.g f4862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f4863c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FocusableKt$focusable$2(androidx.compose.foundation.interaction.g gVar, boolean z10) {
        super(3);
        this.f4862b = gVar;
        this.f4863c = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.lazy.layout.t f(a1<androidx.compose.foundation.lazy.layout.t> a1Var) {
        return a1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(a1<androidx.compose.foundation.lazy.layout.t> a1Var, androidx.compose.foundation.lazy.layout.t tVar) {
        a1Var.setValue(tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(a1<Boolean> a1Var) {
        return a1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(a1<Boolean> a1Var, boolean z10) {
        a1Var.setValue(Boolean.valueOf(z10));
    }

    @dl.d
    @androidx.compose.runtime.h
    public final androidx.compose.ui.n e(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
        androidx.compose.ui.n nVarB;
        androidx.compose.ui.n nVar;
        kotlin.jvm.internal.f0.p(composed, "$this$composed");
        pVar.T(1871352361);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1871352361, i10, -1, "androidx.compose.foundation.focusable.<anonymous> (Focusable.kt:72)");
        }
        pVar.T(773894976);
        pVar.T(-492369756);
        Object objU = pVar.U();
        androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
        if (objU == companion.a()) {
            Object xVar = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVar));
            pVar.N(xVar);
            objU = xVar;
        }
        pVar.c0();
        final q0 coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
        pVar.c0();
        pVar.T(-492369756);
        Object objU2 = pVar.U();
        if (objU2 == companion.a()) {
            objU2 = h2.g(null, null, 2, null);
            pVar.N(objU2);
        }
        pVar.c0();
        final a1 a1Var = (a1) objU2;
        pVar.T(-492369756);
        Object objU3 = pVar.U();
        if (objU3 == companion.a()) {
            objU3 = h2.g(null, null, 2, null);
            pVar.N(objU3);
        }
        pVar.c0();
        final a1 a1Var2 = (a1) objU3;
        pVar.T(-492369756);
        Object objU4 = pVar.U();
        if (objU4 == companion.a()) {
            objU4 = h2.g(Boolean.FALSE, null, 2, null);
            pVar.N(objU4);
        }
        pVar.c0();
        final a1 a1Var3 = (a1) objU4;
        pVar.T(-492369756);
        Object objU5 = pVar.U();
        if (objU5 == companion.a()) {
            objU5 = new FocusRequester();
            pVar.N(objU5);
        }
        pVar.c0();
        final FocusRequester focusRequester = (FocusRequester) objU5;
        pVar.T(-492369756);
        Object objU6 = pVar.U();
        if (objU6 == companion.a()) {
            objU6 = BringIntoViewRequesterKt.a();
            pVar.N(objU6);
        }
        pVar.c0();
        final androidx.compose.foundation.relocation.e eVar = (androidx.compose.foundation.relocation.e) objU6;
        final androidx.compose.foundation.interaction.g gVar = this.f4862b;
        pVar.T(511388516);
        boolean zS = pVar.s(a1Var) | pVar.s(gVar);
        Object objU7 = pVar.U();
        if (zS || objU7 == companion.a()) {
            objU7 = new yh.l<androidx.compose.runtime.f0, androidx.compose.runtime.e0>() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$1$1

                /* JADX INFO: compiled from: Effects.kt */
                @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                public static final class a implements androidx.compose.runtime.e0 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ a1 f4866a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.foundation.interaction.g f4867b;

                    public a(a1 a1Var, androidx.compose.foundation.interaction.g gVar) {
                        this.f4866a = a1Var;
                        this.f4867b = gVar;
                    }

                    @Override // androidx.compose.runtime.e0
                    public void dispose() {
                        androidx.compose.foundation.interaction.b.a aVar = (androidx.compose.foundation.interaction.b.a) this.f4866a.getValue();
                        if (aVar != null) {
                            androidx.compose.foundation.interaction.b.C0047b c0047b = new androidx.compose.foundation.interaction.b.C0047b(aVar);
                            androidx.compose.foundation.interaction.g gVar = this.f4867b;
                            if (gVar != null) {
                                gVar.a(c0047b);
                            }
                            this.f4866a.setValue(null);
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final androidx.compose.runtime.e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                    kotlin.jvm.internal.f0.p(DisposableEffect, "$this$DisposableEffect");
                    return new a(a1Var, gVar);
                }
            };
            pVar.N(objU7);
        }
        pVar.c0();
        EffectsKt.c(gVar, (yh.l) objU7, pVar, 0);
        Boolean boolValueOf = Boolean.valueOf(this.f4863c);
        final boolean z10 = this.f4863c;
        final androidx.compose.foundation.interaction.g gVar2 = this.f4862b;
        EffectsKt.c(boolValueOf, new yh.l<androidx.compose.runtime.f0, androidx.compose.runtime.e0>() { // from class: androidx.compose.foundation.FocusableKt$focusable$2.2

            /* JADX INFO: renamed from: androidx.compose.foundation.FocusableKt$focusable$2$2$1, reason: invalid class name */
            /* JADX INFO: compiled from: Focusable.kt */
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.FocusableKt$focusable$2$2$1", f = "Focusable.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                Object f4872b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                int f4873c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ a1<androidx.compose.foundation.interaction.b.a> f4874d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.interaction.g f4875e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(a1<androidx.compose.foundation.interaction.b.a> a1Var, androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.f4874d = a1Var;
                    this.f4875e = gVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    return new AnonymousClass1(this.f4874d, this.f4875e, cVar);
                }

                @Override // yh.p
                @dl.e
                public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    return ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    a1<androidx.compose.foundation.interaction.b.a> a1Var;
                    a1<androidx.compose.foundation.interaction.b.a> a1Var2;
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i10 = this.f4873c;
                    if (i10 == 0) {
                        t0.n(obj);
                        androidx.compose.foundation.interaction.b.a value = this.f4874d.getValue();
                        if (value != null) {
                            androidx.compose.foundation.interaction.g gVar = this.f4875e;
                            a1Var = this.f4874d;
                            androidx.compose.foundation.interaction.b.C0047b c0047b = new androidx.compose.foundation.interaction.b.C0047b(value);
                            if (gVar != null) {
                                this.f4872b = a1Var;
                                this.f4873c = 1;
                                if (gVar.b(c0047b, this) == objH) {
                                    return objH;
                                }
                                a1Var2 = a1Var;
                            }
                            a1Var.setValue(null);
                        }
                        return b2.f124493a;
                    }
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1Var2 = (a1) this.f4872b;
                    t0.n(obj);
                    a1Var = a1Var2;
                    a1Var.setValue(null);
                    return b2.f124493a;
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.FocusableKt$focusable$2$2$a */
            /* JADX INFO: compiled from: Effects.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
            public static final class a implements androidx.compose.runtime.e0 {
                @Override // androidx.compose.runtime.e0
                public void dispose() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.runtime.e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                kotlin.jvm.internal.f0.p(DisposableEffect, "$this$DisposableEffect");
                if (!z10) {
                    kotlinx.coroutines.k.f(coroutineScope, null, null, new AnonymousClass1(a1Var, gVar2, null), 3, null);
                }
                return new a();
            }
        }, pVar, 0);
        if (this.f4863c) {
            pVar.T(1407541023);
            if (i(a1Var3)) {
                pVar.T(-492369756);
                Object objU8 = pVar.U();
                if (objU8 == companion.a()) {
                    objU8 = new u();
                    pVar.N(objU8);
                }
                pVar.c0();
                nVar = (androidx.compose.ui.n) objU8;
            } else {
                nVar = androidx.compose.ui.n.INSTANCE;
            }
            pVar.c0();
            androidx.compose.ui.n nVarC = SemanticsModifierKt.c(androidx.compose.ui.n.INSTANCE, false, new yh.l<androidx.compose.ui.semantics.r, b2>() { // from class: androidx.compose.foundation.FocusableKt$focusable$2.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(@dl.d androidx.compose.ui.semantics.r semantics) {
                    kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                    SemanticsPropertiesKt.h0(semantics, FocusableKt$focusable$2.i(a1Var3));
                    final FocusRequester focusRequester2 = focusRequester;
                    final a1<Boolean> a1Var4 = a1Var3;
                    SemanticsPropertiesKt.W(semantics, null, new yh.a<Boolean>() { // from class: androidx.compose.foundation.FocusableKt.focusable.2.3.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Boolean invoke() {
                            focusRequester2.g();
                            return Boolean.valueOf(FocusableKt$focusable$2.i(a1Var4));
                        }
                    }, 1, null);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.semantics.r rVar) {
                    a(rVar);
                    return b2.f124493a;
                }
            }, 1, null);
            pVar.T(1157296644);
            boolean zS2 = pVar.s(a1Var2);
            Object objU9 = pVar.U();
            if (zS2 || objU9 == companion.a()) {
                objU9 = new yh.l<androidx.compose.foundation.lazy.layout.t, b2>() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.e androidx.compose.foundation.lazy.layout.t tVar) {
                        FocusableKt$focusable$2.h(a1Var2, tVar);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.foundation.lazy.layout.t tVar) {
                        a(tVar);
                        return b2.f124493a;
                    }
                };
                pVar.N(objU9);
            }
            pVar.c0();
            androidx.compose.ui.n nVarS0 = FocusRequesterModifierKt.a(BringIntoViewRequesterKt.b(FocusableKt.f(nVarC, (yh.l) objU9), eVar), focusRequester).s0(nVar);
            final androidx.compose.foundation.interaction.g gVar3 = this.f4862b;
            nVarB = FocusModifierKt.b(FocusChangedModifierKt.a(nVarS0, new yh.l<androidx.compose.ui.focus.v, b2>() { // from class: androidx.compose.foundation.FocusableKt$focusable$2.5

                /* JADX INFO: renamed from: androidx.compose.foundation.FocusableKt$focusable$2$5$1, reason: invalid class name */
                /* JADX INFO: compiled from: Focusable.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.FocusableKt$focusable$2$5$1", f = "Focusable.kt", i = {0}, l = {144}, m = "invokeSuspend", n = {"pinnedItemsHandle"}, s = {"L$0"})
                public static final class AnonymousClass1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    Object f4887b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f4888c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.foundation.relocation.e f4889d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ a1<androidx.compose.foundation.lazy.layout.t> f4890e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(androidx.compose.foundation.relocation.e eVar, a1<androidx.compose.foundation.lazy.layout.t> a1Var, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.f4889d = eVar;
                        this.f4890e = a1Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.d
                    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                        return new AnonymousClass1(this.f4889d, this.f4890e, cVar);
                    }

                    @Override // yh.p
                    @dl.e
                    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                        return ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                        androidx.compose.foundation.lazy.layout.t.a aVar;
                        Object objH = kotlin.coroutines.intrinsics.b.h();
                        int i10 = this.f4888c;
                        androidx.compose.foundation.lazy.layout.t.a aVar2 = null;
                        try {
                            if (i10 == 0) {
                                t0.n(obj);
                                androidx.compose.foundation.lazy.layout.t tVarF = FocusableKt$focusable$2.f(this.f4890e);
                                androidx.compose.foundation.lazy.layout.t.a aVarA = tVarF != null ? tVarF.a() : null;
                                try {
                                    androidx.compose.foundation.relocation.e eVar = this.f4889d;
                                    this.f4887b = aVarA;
                                    this.f4888c = 1;
                                    if (androidx.compose.foundation.relocation.d.a(eVar, null, this, 1, null) == objH) {
                                        return objH;
                                    }
                                    aVar = aVarA;
                                } catch (Throwable th2) {
                                    aVar2 = aVarA;
                                    th = th2;
                                    if (aVar2 != null) {
                                        aVar2.a();
                                    }
                                    throw th;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                aVar = (androidx.compose.foundation.lazy.layout.t.a) this.f4887b;
                                t0.n(obj);
                            }
                            if (aVar != null) {
                                aVar.a();
                            }
                            return b2.f124493a;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                }

                /* JADX INFO: renamed from: androidx.compose.foundation.FocusableKt$focusable$2$5$2, reason: invalid class name */
                /* JADX INFO: compiled from: Focusable.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.FocusableKt$focusable$2$5$2", f = "Focusable.kt", i = {1}, l = {152, 156}, m = "invokeSuspend", n = {"interaction"}, s = {"L$0"})
                public static final class AnonymousClass2 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    Object f4891b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f4892c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ a1<androidx.compose.foundation.interaction.b.a> f4893d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.foundation.interaction.g f4894e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(a1<androidx.compose.foundation.interaction.b.a> a1Var, androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
                        super(2, cVar);
                        this.f4893d = a1Var;
                        this.f4894e = gVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.d
                    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                        return new AnonymousClass2(this.f4893d, this.f4894e, cVar);
                    }

                    @Override // yh.p
                    @dl.e
                    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                        return ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                    }

                    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
                    /* JADX WARN: Code duplicated, block: B:24:0x0062 A[RETURN] */
                    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                        a1<androidx.compose.foundation.interaction.b.a> a1Var;
                        a1<androidx.compose.foundation.interaction.b.a> a1Var2;
                        androidx.compose.foundation.interaction.b.a aVar;
                        androidx.compose.foundation.interaction.g gVar;
                        androidx.compose.foundation.interaction.b.a aVar2;
                        Object objH = kotlin.coroutines.intrinsics.b.h();
                        int i10 = this.f4892c;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                a1Var2 = (a1) this.f4891b;
                                t0.n(obj);
                            } else {
                                if (i10 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                aVar2 = (androidx.compose.foundation.interaction.b.a) this.f4891b;
                                t0.n(obj);
                            }
                            aVar = aVar2;
                            this.f4893d.setValue(aVar);
                            return b2.f124493a;
                        }
                        t0.n(obj);
                        androidx.compose.foundation.interaction.b.a value = this.f4893d.getValue();
                        if (value != null) {
                            androidx.compose.foundation.interaction.g gVar2 = this.f4894e;
                            a1Var = this.f4893d;
                            androidx.compose.foundation.interaction.b.C0047b c0047b = new androidx.compose.foundation.interaction.b.C0047b(value);
                            if (gVar2 != null) {
                                this.f4891b = a1Var;
                                this.f4892c = 1;
                                if (gVar2.b(c0047b, this) == objH) {
                                    return objH;
                                }
                                a1Var2 = a1Var;
                            }
                            a1Var.setValue(null);
                            aVar = new androidx.compose.foundation.interaction.b.a();
                            gVar = this.f4894e;
                            if (gVar != null) {
                                this.f4891b = aVar;
                                this.f4892c = 2;
                                if (gVar.b(aVar, this) == objH) {
                                    return objH;
                                }
                                aVar2 = aVar;
                                aVar = aVar2;
                            }
                        } else {
                            aVar = new androidx.compose.foundation.interaction.b.a();
                            gVar = this.f4894e;
                            if (gVar != null) {
                                this.f4891b = aVar;
                                this.f4892c = 2;
                                if (gVar.b(aVar, this) == objH) {
                                    return objH;
                                }
                                aVar2 = aVar;
                                aVar = aVar2;
                            }
                        }
                        this.f4893d.setValue(aVar);
                        return b2.f124493a;
                        a1Var = a1Var2;
                        a1Var.setValue(null);
                        aVar = new androidx.compose.foundation.interaction.b.a();
                        gVar = this.f4894e;
                        if (gVar != null) {
                            this.f4891b = aVar;
                            this.f4892c = 2;
                            if (gVar.b(aVar, this) == objH) {
                                return objH;
                            }
                            aVar2 = aVar;
                            aVar = aVar2;
                        }
                        this.f4893d.setValue(aVar);
                        return b2.f124493a;
                    }
                }

                /* JADX INFO: renamed from: androidx.compose.foundation.FocusableKt$focusable$2$5$3, reason: invalid class name */
                /* JADX INFO: compiled from: Focusable.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.FocusableKt$focusable$2$5$3", f = "Focusable.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
                public static final class AnonymousClass3 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    Object f4895b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f4896c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ a1<androidx.compose.foundation.interaction.b.a> f4897d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.foundation.interaction.g f4898e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass3(a1<androidx.compose.foundation.interaction.b.a> a1Var, androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.c<? super AnonymousClass3> cVar) {
                        super(2, cVar);
                        this.f4897d = a1Var;
                        this.f4898e = gVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.d
                    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                        return new AnonymousClass3(this.f4897d, this.f4898e, cVar);
                    }

                    @Override // yh.p
                    @dl.e
                    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                        return ((AnonymousClass3) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                        a1<androidx.compose.foundation.interaction.b.a> a1Var;
                        a1<androidx.compose.foundation.interaction.b.a> a1Var2;
                        Object objH = kotlin.coroutines.intrinsics.b.h();
                        int i10 = this.f4896c;
                        if (i10 == 0) {
                            t0.n(obj);
                            androidx.compose.foundation.interaction.b.a value = this.f4897d.getValue();
                            if (value != null) {
                                androidx.compose.foundation.interaction.g gVar = this.f4898e;
                                a1Var = this.f4897d;
                                androidx.compose.foundation.interaction.b.C0047b c0047b = new androidx.compose.foundation.interaction.b.C0047b(value);
                                if (gVar != null) {
                                    this.f4895b = a1Var;
                                    this.f4896c = 1;
                                    if (gVar.b(c0047b, this) == objH) {
                                        return objH;
                                    }
                                    a1Var2 = a1Var;
                                }
                                a1Var.setValue(null);
                            }
                            return b2.f124493a;
                        }
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a1Var2 = (a1) this.f4895b;
                        t0.n(obj);
                        a1Var = a1Var2;
                        a1Var.setValue(null);
                        return b2.f124493a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(@dl.d androidx.compose.ui.focus.v it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                    FocusableKt$focusable$2.j(a1Var3, it.isFocused());
                    if (!FocusableKt$focusable$2.i(a1Var3)) {
                        kotlinx.coroutines.k.f(coroutineScope, null, null, new AnonymousClass3(a1Var, gVar3, null), 3, null);
                    } else {
                        kotlinx.coroutines.k.f(coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(eVar, a1Var2, null), 1, null);
                        kotlinx.coroutines.k.f(coroutineScope, null, null, new AnonymousClass2(a1Var, gVar3, null), 3, null);
                    }
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.focus.v vVar) {
                    a(vVar);
                    return b2.f124493a;
                }
            }));
        } else {
            nVarB = androidx.compose.ui.n.INSTANCE;
        }
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return nVarB;
    }

    @Override // yh.q
    public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar, androidx.compose.runtime.p pVar, Integer num) {
        return e(nVar, pVar, num.intValue());
    }
}
