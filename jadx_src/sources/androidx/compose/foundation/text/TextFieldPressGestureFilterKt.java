package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.m2;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.i0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: TextFieldPressGestureFilter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\t\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Landroidx/compose/ui/n;", "Landroidx/compose/foundation/interaction/g;", "interactionSource", "", "enabled", "Lkotlin/Function1;", "Lb1/f;", "Lkotlin/b2;", "onTap", ak.av, "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class TextFieldPressGestureFilterKt {
    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.e final androidx.compose.foundation.interaction.g gVar, boolean z10, @dl.d final yh.l<? super b1.f, b2> onTap) {
        f0.p(nVar, "<this>");
        f0.p(onTap, "onTap");
        return z10 ? ComposedModifierKt.l(nVar, null, new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1

            /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: TextFieldPressGestureFilter.kt */
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2", f = "TextFieldPressGestureFilter.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass2 extends SuspendLambda implements yh.p<i0, kotlin.coroutines.c<? super b2>, Object> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f7967b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private /* synthetic */ Object f7968c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ q0 f7969d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ a1<androidx.compose.foundation.interaction.i.b> f7970e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.interaction.g f7971f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ m2<yh.l<b1.f, b2>> f7972g;

                /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: TextFieldPressGestureFilter.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1", f = "TextFieldPressGestureFilter.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
                public static final class AnonymousClass1 extends SuspendLambda implements yh.q<androidx.compose.foundation.gestures.k, b1.f, kotlin.coroutines.c<? super b2>, Object> {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f7973b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private /* synthetic */ Object f7974c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    /* synthetic */ long f7975d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ q0 f7976e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    final /* synthetic */ a1<androidx.compose.foundation.interaction.i.b> f7977f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.foundation.interaction.g f7978g;

                    /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1, reason: invalid class name and collision with other inner class name */
                    /* JADX INFO: compiled from: TextFieldPressGestureFilter.kt */
                    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", i = {1}, l = {61, 65}, m = "invokeSuspend", n = {"interaction"}, s = {"L$0"})
                    public static final class C00531 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        Object f7979b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        int f7980c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        final /* synthetic */ a1<androidx.compose.foundation.interaction.i.b> f7981d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        final /* synthetic */ long f7982e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        final /* synthetic */ androidx.compose.foundation.interaction.g f7983f;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00531(a1<androidx.compose.foundation.interaction.i.b> a1Var, long j10, androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.c<? super C00531> cVar) {
                            super(2, cVar);
                            this.f7981d = a1Var;
                            this.f7982e = j10;
                            this.f7983f = gVar;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @dl.d
                        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                            return new C00531(this.f7981d, this.f7982e, this.f7983f, cVar);
                        }

                        @Override // yh.p
                        @dl.e
                        public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                            return ((C00531) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                        }

                        /* JADX WARN: Code duplicated, block: B:22:0x005a  */
                        /* JADX WARN: Code duplicated, block: B:24:0x0064 A[RETURN] */
                        /* JADX WARN: Code duplicated, block: B:25:0x0065  */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @dl.e
                        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                            a1<androidx.compose.foundation.interaction.i.b> a1Var;
                            a1<androidx.compose.foundation.interaction.i.b> a1Var2;
                            androidx.compose.foundation.interaction.i.b bVar;
                            androidx.compose.foundation.interaction.g gVar;
                            androidx.compose.foundation.interaction.i.b bVar2;
                            Object objH = kotlin.coroutines.intrinsics.b.h();
                            int i10 = this.f7980c;
                            if (i10 != 0) {
                                if (i10 == 1) {
                                    a1Var2 = (a1) this.f7979b;
                                    t0.n(obj);
                                } else {
                                    if (i10 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    bVar2 = (androidx.compose.foundation.interaction.i.b) this.f7979b;
                                    t0.n(obj);
                                }
                                bVar = bVar2;
                                this.f7981d.setValue(bVar);
                                return b2.f124493a;
                            }
                            t0.n(obj);
                            androidx.compose.foundation.interaction.i.b value = this.f7981d.getValue();
                            if (value != null) {
                                androidx.compose.foundation.interaction.g gVar2 = this.f7983f;
                                a1Var = this.f7981d;
                                androidx.compose.foundation.interaction.i.a aVar = new androidx.compose.foundation.interaction.i.a(value);
                                if (gVar2 != null) {
                                    this.f7979b = a1Var;
                                    this.f7980c = 1;
                                    if (gVar2.b(aVar, this) == objH) {
                                        return objH;
                                    }
                                    a1Var2 = a1Var;
                                }
                                a1Var.setValue(null);
                                bVar = new androidx.compose.foundation.interaction.i.b(this.f7982e, null);
                                gVar = this.f7983f;
                                if (gVar != null) {
                                    this.f7979b = bVar;
                                    this.f7980c = 2;
                                    if (gVar.b(bVar, this) == objH) {
                                        return objH;
                                    }
                                    bVar2 = bVar;
                                    bVar = bVar2;
                                }
                            } else {
                                bVar = new androidx.compose.foundation.interaction.i.b(this.f7982e, null);
                                gVar = this.f7983f;
                                if (gVar != null) {
                                    this.f7979b = bVar;
                                    this.f7980c = 2;
                                    if (gVar.b(bVar, this) == objH) {
                                        return objH;
                                    }
                                    bVar2 = bVar;
                                    bVar = bVar2;
                                }
                            }
                            this.f7981d.setValue(bVar);
                            return b2.f124493a;
                            a1Var = a1Var2;
                            a1Var.setValue(null);
                            bVar = new androidx.compose.foundation.interaction.i.b(this.f7982e, null);
                            gVar = this.f7983f;
                            if (gVar != null) {
                                this.f7979b = bVar;
                                this.f7980c = 2;
                                if (gVar.b(bVar, this) == objH) {
                                    return objH;
                                }
                                bVar2 = bVar;
                                bVar = bVar2;
                            }
                            this.f7981d.setValue(bVar);
                            return b2.f124493a;
                        }
                    }

                    /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$2, reason: invalid class name and collision with other inner class name */
                    /* JADX INFO: compiled from: TextFieldPressGestureFilter.kt */
                    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$2", f = "TextFieldPressGestureFilter.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
                    public static final class C00542 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        Object f7984b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        int f7985c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        final /* synthetic */ a1<androidx.compose.foundation.interaction.i.b> f7986d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        final /* synthetic */ boolean f7987e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        final /* synthetic */ androidx.compose.foundation.interaction.g f7988f;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00542(a1<androidx.compose.foundation.interaction.i.b> a1Var, boolean z10, androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.c<? super C00542> cVar) {
                            super(2, cVar);
                            this.f7986d = a1Var;
                            this.f7987e = z10;
                            this.f7988f = gVar;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @dl.d
                        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                            return new C00542(this.f7986d, this.f7987e, this.f7988f, cVar);
                        }

                        @Override // yh.p
                        @dl.e
                        public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                            return ((C00542) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @dl.e
                        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                            a1<androidx.compose.foundation.interaction.i.b> a1Var;
                            a1<androidx.compose.foundation.interaction.i.b> a1Var2;
                            Object objH = kotlin.coroutines.intrinsics.b.h();
                            int i10 = this.f7985c;
                            if (i10 == 0) {
                                t0.n(obj);
                                androidx.compose.foundation.interaction.i.b value = this.f7986d.getValue();
                                if (value != null) {
                                    boolean z10 = this.f7987e;
                                    androidx.compose.foundation.interaction.g gVar = this.f7988f;
                                    a1Var = this.f7986d;
                                    androidx.compose.foundation.interaction.d cVar = z10 ? new androidx.compose.foundation.interaction.i.c(value) : new androidx.compose.foundation.interaction.i.a(value);
                                    if (gVar != null) {
                                        this.f7984b = a1Var;
                                        this.f7985c = 1;
                                        if (gVar.b(cVar, this) == objH) {
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
                            a1Var2 = (a1) this.f7984b;
                            t0.n(obj);
                            a1Var = a1Var2;
                            a1Var.setValue(null);
                            return b2.f124493a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(q0 q0Var, a1<androidx.compose.foundation.interaction.i.b> a1Var, androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                        super(3, cVar);
                        this.f7976e = q0Var;
                        this.f7977f = a1Var;
                        this.f7978g = gVar;
                    }

                    @dl.e
                    public final Object a(@dl.d androidx.compose.foundation.gestures.k kVar, long j10, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f7976e, this.f7977f, this.f7978g, cVar);
                        anonymousClass1.f7974c = kVar;
                        anonymousClass1.f7975d = j10;
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
                        int i10 = this.f7973b;
                        if (i10 == 0) {
                            t0.n(obj);
                            androidx.compose.foundation.gestures.k kVar = (androidx.compose.foundation.gestures.k) this.f7974c;
                            kotlinx.coroutines.k.f(this.f7976e, null, null, new C00531(this.f7977f, this.f7975d, this.f7978g, null), 3, null);
                            this.f7973b = 1;
                            obj = kVar.h1(this);
                            if (obj == objH) {
                                return objH;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t0.n(obj);
                        }
                        kotlinx.coroutines.k.f(this.f7976e, null, null, new C00542(this.f7977f, ((Boolean) obj).booleanValue(), this.f7978g, null), 3, null);
                        return b2.f124493a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass2(q0 q0Var, a1<androidx.compose.foundation.interaction.i.b> a1Var, androidx.compose.foundation.interaction.g gVar, m2<? extends yh.l<? super b1.f, b2>> m2Var, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
                    super(2, cVar);
                    this.f7969d = q0Var;
                    this.f7970e = a1Var;
                    this.f7971f = gVar;
                    this.f7972g = m2Var;
                }

                @Override // yh.p
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@dl.d i0 i0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    return ((AnonymousClass2) create(i0Var, cVar)).invokeSuspend(b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f7969d, this.f7970e, this.f7971f, this.f7972g, cVar);
                    anonymousClass2.f7968c = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i10 = this.f7967b;
                    if (i10 == 0) {
                        t0.n(obj);
                        i0 i0Var = (i0) this.f7968c;
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f7969d, this.f7970e, this.f7971f, null);
                        final m2<yh.l<b1.f, b2>> m2Var = this.f7972g;
                        yh.l<b1.f, b2> lVar = new yh.l<b1.f, b2>() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier.1.2.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(long j10) {
                                m2Var.getValue().invoke(b1.f.d(j10));
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(b1.f fVar) {
                                a(fVar.getF30368a());
                                return b2.f124493a;
                            }
                        };
                        this.f7967b = 1;
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                f0.p(composed, "$this$composed");
                pVar.T(-102778667);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-102778667, i10, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
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
                q0 coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                pVar.c0();
                pVar.T(-492369756);
                Object objU2 = pVar.U();
                if (objU2 == companion.a()) {
                    objU2 = h2.g(null, null, 2, null);
                    pVar.N(objU2);
                }
                pVar.c0();
                final a1 a1Var = (a1) objU2;
                m2 m2VarT = e2.t(onTap, pVar, 0);
                final androidx.compose.foundation.interaction.g gVar2 = gVar;
                pVar.T(511388516);
                boolean zS = pVar.s(a1Var) | pVar.s(gVar2);
                Object objU3 = pVar.U();
                if (zS || objU3 == companion.a()) {
                    objU3 = new yh.l<androidx.compose.runtime.f0, androidx.compose.runtime.e0>() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1

                        /* JADX INFO: compiled from: Effects.kt */
                        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                        public static final class a implements androidx.compose.runtime.e0 {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            final /* synthetic */ a1 f7965a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            final /* synthetic */ androidx.compose.foundation.interaction.g f7966b;

                            public a(a1 a1Var, androidx.compose.foundation.interaction.g gVar) {
                                this.f7965a = a1Var;
                                this.f7966b = gVar;
                            }

                            @Override // androidx.compose.runtime.e0
                            public void dispose() {
                                androidx.compose.foundation.interaction.i.b bVar = (androidx.compose.foundation.interaction.i.b) this.f7965a.getValue();
                                if (bVar != null) {
                                    androidx.compose.foundation.interaction.i.a aVar = new androidx.compose.foundation.interaction.i.a(bVar);
                                    androidx.compose.foundation.interaction.g gVar = this.f7966b;
                                    if (gVar != null) {
                                        gVar.a(aVar);
                                    }
                                    this.f7965a.setValue(null);
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
                            f0.p(DisposableEffect, "$this$DisposableEffect");
                            return new a(a1Var, gVar2);
                        }
                    };
                    pVar.N(objU3);
                }
                pVar.c0();
                EffectsKt.c(gVar2, (yh.l) objU3, pVar, 0);
                androidx.compose.ui.n.Companion companion2 = androidx.compose.ui.n.INSTANCE;
                androidx.compose.foundation.interaction.g gVar3 = gVar;
                androidx.compose.ui.n nVarC = SuspendingPointerInputFilterKt.c(companion2, gVar3, new AnonymousClass2(coroutineScope, a1Var, gVar3, m2VarT, null));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return nVarC;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        }, 1, null) : nVar;
    }

    public static /* synthetic */ androidx.compose.ui.n b(androidx.compose.ui.n nVar, androidx.compose.foundation.interaction.g gVar, boolean z10, yh.l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(nVar, gVar, z10, lVar);
    }
}
