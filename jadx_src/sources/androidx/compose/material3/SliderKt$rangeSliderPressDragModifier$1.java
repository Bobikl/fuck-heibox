package androidx.compose.material3;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.m2;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/i0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1", f = "Slider.kt", i = {}, l = {1202}, m = "invokeSuspend", n = {}, s = {})
public final class SliderKt$rangeSliderPressDragModifier$1 extends SuspendLambda implements yh.p<androidx.compose.ui.input.pointer.i0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f10715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f10716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.foundation.interaction.g f10717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ androidx.compose.foundation.interaction.g f10718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ m2<Float> f10719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ m2<Float> f10720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ m2<yh.p<Boolean, Float, kotlin.b2>> f10721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ boolean f10722i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ float f10723j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final /* synthetic */ m2<yh.l<Boolean, kotlin.b2>> f10724k;

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", i = {}, l = {1203}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f10726c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.input.pointer.i0 f10727d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f10728e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f10729f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ RangeSliderLogic f10730g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ m2<Float> f10731h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ m2<yh.l<Boolean, kotlin.b2>> f10732i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ m2<Float> f10733j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ m2<yh.p<Boolean, Float, kotlin.b2>> f10734k;

        /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: Slider.kt */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/i0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", i = {}, l = {1204}, m = "invokeSuspend", n = {}, s = {})
        public static final class C00691 extends SuspendLambda implements yh.p<androidx.compose.ui.input.pointer.i0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f10735b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f10736c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f10737d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ float f10738e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ RangeSliderLogic f10739f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ m2<Float> f10740g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.q0 f10741h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ m2<yh.l<Boolean, kotlin.b2>> f10742i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ m2<Float> f10743j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ m2<yh.p<Boolean, Float, kotlin.b2>> f10744k;

            /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: Slider.kt */
            @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/d;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$1", f = "Slider.kt", i = {0, 1, 1, 1, 1, 1, 2, 2}, l = {1205, bb.c.b.f30960tk, bb.c.b.Mk}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", androidx.core.app.o0.I0, "interaction", "posX", "draggingStart", "interaction", "draggingStart"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
            public static final class C00701 extends RestrictedSuspendLambda implements yh.p<androidx.compose.ui.input.pointer.d, kotlin.coroutines.c<? super kotlin.b2>, Object> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f10745c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Object f10746d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                Object f10747e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f10748f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                int f10749g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private /* synthetic */ Object f10750h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                final /* synthetic */ boolean f10751i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                final /* synthetic */ float f10752j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                final /* synthetic */ RangeSliderLogic f10753k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                final /* synthetic */ m2<Float> f10754l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.q0 f10755m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ m2<yh.l<Boolean, kotlin.b2>> f10756n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ m2<Float> f10757o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ m2<yh.p<Boolean, Float, kotlin.b2>> f10758p;

                /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Slider.kt */
                @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
                @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$1$2", f = "Slider.kt", i = {}, l = {bb.c.b.f30596dl}, m = "invokeSuspend", n = {}, s = {})
                public static final class AnonymousClass2 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f10759b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ RangeSliderLogic f10760c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ Ref.BooleanRef f10761d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.foundation.interaction.a f10762e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(RangeSliderLogic rangeSliderLogic, Ref.BooleanRef booleanRef, androidx.compose.foundation.interaction.a aVar, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
                        super(2, cVar);
                        this.f10760c = rangeSliderLogic;
                        this.f10761d = booleanRef;
                        this.f10762e = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.d
                    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                        return new AnonymousClass2(this.f10760c, this.f10761d, this.f10762e, cVar);
                    }

                    @Override // yh.p
                    @dl.e
                    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
                        return ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                        Object objH = kotlin.coroutines.intrinsics.b.h();
                        int i10 = this.f10759b;
                        if (i10 == 0) {
                            kotlin.t0.n(obj);
                            androidx.compose.foundation.interaction.g gVarA = this.f10760c.a(this.f10761d.f124884b);
                            androidx.compose.foundation.interaction.a aVar = this.f10762e;
                            this.f10759b = 1;
                            if (gVarA.b(aVar, this) == objH) {
                                return objH;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.t0.n(obj);
                        }
                        return kotlin.b2.f124493a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C00701(boolean z10, float f10, RangeSliderLogic rangeSliderLogic, m2<Float> m2Var, kotlinx.coroutines.q0 q0Var, m2<? extends yh.l<? super Boolean, kotlin.b2>> m2Var2, m2<Float> m2Var3, m2<? extends yh.p<? super Boolean, ? super Float, kotlin.b2>> m2Var4, kotlin.coroutines.c<? super C00701> cVar) {
                    super(2, cVar);
                    this.f10751i = z10;
                    this.f10752j = f10;
                    this.f10753k = rangeSliderLogic;
                    this.f10754l = m2Var;
                    this.f10755m = q0Var;
                    this.f10756n = m2Var2;
                    this.f10757o = m2Var3;
                    this.f10758p = m2Var4;
                }

                @Override // yh.p
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@dl.d androidx.compose.ui.input.pointer.d dVar, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
                    return ((C00701) create(dVar, cVar)).invokeSuspend(kotlin.b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    C00701 c00701 = new C00701(this.f10751i, this.f10752j, this.f10753k, this.f10754l, this.f10755m, this.f10756n, this.f10757o, this.f10758p, cVar);
                    c00701.f10750h = obj;
                    return c00701;
                }

                /* JADX WARN: Code duplicated, block: B:35:0x00d9  */
                /* JADX WARN: Code duplicated, block: B:40:0x0117  */
                /* JADX WARN: Code duplicated, block: B:42:0x011a  */
                /* JADX WARN: Code duplicated, block: B:55:0x0172 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:56:0x0173  */
                /* JADX WARN: Code duplicated, block: B:59:0x017d A[Catch: CancellationException -> 0x018b, TryCatch #0 {CancellationException -> 0x018b, blocks: (B:8:0x001d, B:57:0x0175, B:59:0x017d, B:60:0x0183), top: B:67:0x001d }] */
                /* JADX WARN: Code duplicated, block: B:60:0x0183 A[Catch: CancellationException -> 0x018b, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x018b, blocks: (B:8:0x001d, B:57:0x0175, B:59:0x017d, B:60:0x0183), top: B:67:0x001d }] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    androidx.compose.ui.input.pointer.d dVar;
                    Object objD;
                    Object objF;
                    androidx.compose.ui.input.pointer.d dVar2;
                    PointerInputChange pointerInputChange;
                    Ref.FloatRef floatRef;
                    androidx.compose.foundation.interaction.a.b bVar;
                    final Ref.BooleanRef booleanRef;
                    Pair pair;
                    Ref.BooleanRef booleanRef2;
                    androidx.compose.foundation.interaction.a.b bVar2;
                    Object objA;
                    m2<Float> m2Var;
                    boolean z10;
                    float fD;
                    boolean z11;
                    androidx.compose.foundation.interaction.a c0046a;
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i10 = this.f10749g;
                    if (i10 == 0) {
                        kotlin.t0.n(obj);
                        dVar = (androidx.compose.ui.input.pointer.d) this.f10750h;
                        this.f10750h = dVar;
                        this.f10749g = 1;
                        objD = TapGestureDetectorKt.d(dVar, false, this);
                        if (objD == objH) {
                            return objH;
                        }
                    } else if (i10 == 1) {
                        dVar = (androidx.compose.ui.input.pointer.d) this.f10750h;
                        kotlin.t0.n(obj);
                        objD = obj;
                    } else {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            booleanRef2 = (Ref.BooleanRef) this.f10745c;
                            bVar2 = (androidx.compose.foundation.interaction.a.b) this.f10750h;
                            try {
                                kotlin.t0.n(obj);
                                objA = obj;
                                if (((Boolean) objA).booleanValue()) {
                                    c0046a = new androidx.compose.foundation.interaction.a.c(bVar2);
                                } else {
                                    c0046a = new androidx.compose.foundation.interaction.a.C0046a(bVar2);
                                }
                            } catch (CancellationException unused) {
                                c0046a = new androidx.compose.foundation.interaction.a.C0046a(bVar2);
                            }
                            this.f10756n.getValue().invoke(kotlin.coroutines.jvm.internal.a.a(booleanRef2.f124884b));
                            kotlinx.coroutines.k.f(this.f10755m, null, null, new AnonymousClass2(this.f10753k, booleanRef2, c0046a, null), 3, null);
                            return kotlin.b2.f124493a;
                        }
                        booleanRef = (Ref.BooleanRef) this.f10748f;
                        Ref.FloatRef floatRef2 = (Ref.FloatRef) this.f10747e;
                        bVar = (androidx.compose.foundation.interaction.a.b) this.f10746d;
                        PointerInputChange pointerInputChange2 = (PointerInputChange) this.f10745c;
                        androidx.compose.ui.input.pointer.d dVar3 = (androidx.compose.ui.input.pointer.d) this.f10750h;
                        kotlin.t0.n(obj);
                        dVar2 = dVar3;
                        pointerInputChange = pointerInputChange2;
                        floatRef = floatRef2;
                        objF = obj;
                        pair = (Pair) objF;
                        if (pair != null) {
                            m2Var = this.f10757o;
                            m2<Float> m2Var2 = this.f10754l;
                            z10 = this.f10751i;
                            fD = DragGestureDetectorCopyKt.d(dVar2.getViewConfiguration(), pointerInputChange.getType());
                            if (Math.abs(m2Var.getValue().floatValue() - floatRef.f124888b) < fD || Math.abs(m2Var2.getValue().floatValue() - floatRef.f124888b) >= fD) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (z11) {
                                float fFloatValue = ((Number) pair.f()).floatValue();
                                booleanRef.f124884b = z10 ? fFloatValue < 0.0f : fFloatValue >= 0.0f;
                                floatRef.f124888b += b1.f.p(androidx.compose.ui.input.pointer.q.k((PointerInputChange) pair.e()));
                            }
                        }
                        this.f10753k.b(booleanRef.f124884b, floatRef.f124888b, bVar, this.f10755m);
                        try {
                            long id2 = pointerInputChange.getId();
                            final m2<yh.p<Boolean, Float, kotlin.b2>> m2Var3 = this.f10758p;
                            final boolean z12 = this.f10751i;
                            yh.l<PointerInputChange, kotlin.b2> lVar = new yh.l<PointerInputChange, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$1$finishInteraction$success$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                public final void a(@dl.d PointerInputChange it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                    float fP = b1.f.p(androidx.compose.ui.input.pointer.q.k(it));
                                    yh.p<Boolean, Float, kotlin.b2> value = m2Var3.getValue();
                                    Boolean boolValueOf = Boolean.valueOf(booleanRef.f124884b);
                                    if (z12) {
                                        fP = -fP;
                                    }
                                    value.invoke(boolValueOf, Float.valueOf(fP));
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(PointerInputChange pointerInputChange3) {
                                    a(pointerInputChange3);
                                    return kotlin.b2.f124493a;
                                }
                            };
                            this.f10750h = bVar;
                            this.f10745c = booleanRef;
                            this.f10746d = null;
                            this.f10747e = null;
                            this.f10748f = null;
                            this.f10749g = 3;
                            objA = DragGestureDetectorKt.A(dVar2, id2, lVar, this);
                            if (objA == objH) {
                                return objH;
                            }
                            booleanRef2 = booleanRef;
                            bVar2 = bVar;
                            if (((Boolean) objA).booleanValue()) {
                                c0046a = new androidx.compose.foundation.interaction.a.c(bVar2);
                            } else {
                                c0046a = new androidx.compose.foundation.interaction.a.C0046a(bVar2);
                            }
                            this.f10756n.getValue().invoke(kotlin.coroutines.jvm.internal.a.a(booleanRef2.f124884b));
                            kotlinx.coroutines.k.f(this.f10755m, null, null, new AnonymousClass2(this.f10753k, booleanRef2, c0046a, null), 3, null);
                            return kotlin.b2.f124493a;
                        } catch (CancellationException unused2) {
                            booleanRef2 = booleanRef;
                            bVar2 = bVar;
                            c0046a = new androidx.compose.foundation.interaction.a.C0046a(bVar2);
                        }
                    }
                    androidx.compose.ui.input.pointer.d dVar4 = dVar;
                    PointerInputChange pointerInputChange3 = (PointerInputChange) objD;
                    androidx.compose.foundation.interaction.a.b bVar3 = new androidx.compose.foundation.interaction.a.b();
                    Ref.FloatRef floatRef3 = new Ref.FloatRef();
                    float fP = this.f10751i ? this.f10752j - b1.f.p(pointerInputChange3.getPosition()) : b1.f.p(pointerInputChange3.getPosition());
                    floatRef3.f124888b = fP;
                    int iC = this.f10753k.c(fP);
                    Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
                    booleanRef3.f124884b = iC == 0 ? this.f10754l.getValue().floatValue() > floatRef3.f124888b : iC < 0;
                    long id3 = pointerInputChange3.getId();
                    int type = pointerInputChange3.getType();
                    this.f10750h = dVar4;
                    this.f10745c = pointerInputChange3;
                    this.f10746d = bVar3;
                    this.f10747e = floatRef3;
                    this.f10748f = booleanRef3;
                    this.f10749g = 2;
                    objF = SliderKt.F(dVar4, id3, type, this);
                    if (objF == objH) {
                        return objH;
                    }
                    dVar2 = dVar4;
                    pointerInputChange = pointerInputChange3;
                    floatRef = floatRef3;
                    bVar = bVar3;
                    booleanRef = booleanRef3;
                    pair = (Pair) objF;
                    if (pair != null) {
                        m2Var = this.f10757o;
                        m2<Float> m2Var4 = this.f10754l;
                        z10 = this.f10751i;
                        fD = DragGestureDetectorCopyKt.d(dVar2.getViewConfiguration(), pointerInputChange.getType());
                        if (Math.abs(m2Var.getValue().floatValue() - floatRef.f124888b) < fD) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            float fFloatValue2 = ((Number) pair.f()).floatValue();
                            booleanRef.f124884b = z10 ? fFloatValue2 < 0.0f : fFloatValue2 >= 0.0f;
                            floatRef.f124888b += b1.f.p(androidx.compose.ui.input.pointer.q.k((PointerInputChange) pair.e()));
                        }
                    }
                    this.f10753k.b(booleanRef.f124884b, floatRef.f124888b, bVar, this.f10755m);
                    long id4 = pointerInputChange.getId();
                    final m2<? extends yh.p<? super Boolean, ? super Float, kotlin.b2>> m2Var5 = this.f10758p;
                    final boolean z13 = this.f10751i;
                    yh.l<PointerInputChange, kotlin.b2> lVar2 = new yh.l<PointerInputChange, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$1$finishInteraction$success$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d PointerInputChange it) {
                            kotlin.jvm.internal.f0.p(it, "it");
                            float fP2 = b1.f.p(androidx.compose.ui.input.pointer.q.k(it));
                            yh.p<Boolean, Float, kotlin.b2> value = m2Var5.getValue();
                            Boolean boolValueOf = Boolean.valueOf(booleanRef.f124884b);
                            if (z13) {
                                fP2 = -fP2;
                            }
                            value.invoke(boolValueOf, Float.valueOf(fP2));
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(PointerInputChange pointerInputChange4) {
                            a(pointerInputChange4);
                            return kotlin.b2.f124493a;
                        }
                    };
                    this.f10750h = bVar;
                    this.f10745c = booleanRef;
                    this.f10746d = null;
                    this.f10747e = null;
                    this.f10748f = null;
                    this.f10749g = 3;
                    objA = DragGestureDetectorKt.A(dVar2, id4, lVar2, this);
                    if (objA == objH) {
                        return objH;
                    }
                    booleanRef2 = booleanRef;
                    bVar2 = bVar;
                    if (((Boolean) objA).booleanValue()) {
                        c0046a = new androidx.compose.foundation.interaction.a.c(bVar2);
                    } else {
                        c0046a = new androidx.compose.foundation.interaction.a.C0046a(bVar2);
                    }
                    this.f10756n.getValue().invoke(kotlin.coroutines.jvm.internal.a.a(booleanRef2.f124884b));
                    kotlinx.coroutines.k.f(this.f10755m, null, null, new AnonymousClass2(this.f10753k, booleanRef2, c0046a, null), 3, null);
                    return kotlin.b2.f124493a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00691(boolean z10, float f10, RangeSliderLogic rangeSliderLogic, m2<Float> m2Var, kotlinx.coroutines.q0 q0Var, m2<? extends yh.l<? super Boolean, kotlin.b2>> m2Var2, m2<Float> m2Var3, m2<? extends yh.p<? super Boolean, ? super Float, kotlin.b2>> m2Var4, kotlin.coroutines.c<? super C00691> cVar) {
                super(2, cVar);
                this.f10737d = z10;
                this.f10738e = f10;
                this.f10739f = rangeSliderLogic;
                this.f10740g = m2Var;
                this.f10741h = q0Var;
                this.f10742i = m2Var2;
                this.f10743j = m2Var3;
                this.f10744k = m2Var4;
            }

            @Override // yh.p
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@dl.d androidx.compose.ui.input.pointer.i0 i0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
                return ((C00691) create(i0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                C00691 c00691 = new C00691(this.f10737d, this.f10738e, this.f10739f, this.f10740g, this.f10741h, this.f10742i, this.f10743j, this.f10744k, cVar);
                c00691.f10736c = obj;
                return c00691;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                Object objH = kotlin.coroutines.intrinsics.b.h();
                int i10 = this.f10735b;
                if (i10 == 0) {
                    kotlin.t0.n(obj);
                    androidx.compose.ui.input.pointer.i0 i0Var = (androidx.compose.ui.input.pointer.i0) this.f10736c;
                    C00701 c00701 = new C00701(this.f10737d, this.f10738e, this.f10739f, this.f10740g, this.f10741h, this.f10742i, this.f10743j, this.f10744k, null);
                    this.f10735b = 1;
                    if (i0Var.n1(c00701, this) == objH) {
                        return objH;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.t0.n(obj);
                }
                return kotlin.b2.f124493a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(androidx.compose.ui.input.pointer.i0 i0Var, boolean z10, float f10, RangeSliderLogic rangeSliderLogic, m2<Float> m2Var, m2<? extends yh.l<? super Boolean, kotlin.b2>> m2Var2, m2<Float> m2Var3, m2<? extends yh.p<? super Boolean, ? super Float, kotlin.b2>> m2Var4, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f10727d = i0Var;
            this.f10728e = z10;
            this.f10729f = f10;
            this.f10730g = rangeSliderLogic;
            this.f10731h = m2Var;
            this.f10732i = m2Var2;
            this.f10733j = m2Var3;
            this.f10734k = m2Var4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10727d, this.f10728e, this.f10729f, this.f10730g, this.f10731h, this.f10732i, this.f10733j, this.f10734k, cVar);
            anonymousClass1.f10726c = obj;
            return anonymousClass1;
        }

        @Override // yh.p
        @dl.e
        public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
            return ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f10725b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) this.f10726c;
                androidx.compose.ui.input.pointer.i0 i0Var = this.f10727d;
                C00691 c00691 = new C00691(this.f10728e, this.f10729f, this.f10730g, this.f10731h, q0Var, this.f10732i, this.f10733j, this.f10734k, null);
                this.f10725b = 1;
                if (ForEachGestureKt.d(i0Var, c00691, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            return kotlin.b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SliderKt$rangeSliderPressDragModifier$1(androidx.compose.foundation.interaction.g gVar, androidx.compose.foundation.interaction.g gVar2, m2<Float> m2Var, m2<Float> m2Var2, m2<? extends yh.p<? super Boolean, ? super Float, kotlin.b2>> m2Var3, boolean z10, float f10, m2<? extends yh.l<? super Boolean, kotlin.b2>> m2Var4, kotlin.coroutines.c<? super SliderKt$rangeSliderPressDragModifier$1> cVar) {
        super(2, cVar);
        this.f10717d = gVar;
        this.f10718e = gVar2;
        this.f10719f = m2Var;
        this.f10720g = m2Var2;
        this.f10721h = m2Var3;
        this.f10722i = z10;
        this.f10723j = f10;
        this.f10724k = m2Var4;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d androidx.compose.ui.input.pointer.i0 i0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((SliderKt$rangeSliderPressDragModifier$1) create(i0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        SliderKt$rangeSliderPressDragModifier$1 sliderKt$rangeSliderPressDragModifier$1 = new SliderKt$rangeSliderPressDragModifier$1(this.f10717d, this.f10718e, this.f10719f, this.f10720g, this.f10721h, this.f10722i, this.f10723j, this.f10724k, cVar);
        sliderKt$rangeSliderPressDragModifier$1.f10716c = obj;
        return sliderKt$rangeSliderPressDragModifier$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f10715b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((androidx.compose.ui.input.pointer.i0) this.f10716c, this.f10722i, this.f10723j, new RangeSliderLogic(this.f10717d, this.f10718e, this.f10719f, this.f10720g, this.f10721h), this.f10719f, this.f10724k, this.f10720g, this.f10721h, null);
            this.f10715b = 1;
            if (kotlinx.coroutines.r0.g(anonymousClass1, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        return kotlin.b2.f124493a;
    }
}
