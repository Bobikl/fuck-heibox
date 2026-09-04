package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.e0;
import androidx.compose.runtime.h;
import androidx.compose.runtime.p;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.u1;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.n;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.h1;
import androidx.compose.ui.node.m1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.r;
import androidx.compose.ui.t;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.y;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: AndroidView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aM\u0010\t\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\"(\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0002\b\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroid/view/View;", androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function1;", "Landroid/content/Context;", "factory", "Landroidx/compose/ui/n;", "modifier", "Lkotlin/b2;", "update", ak.av, "(Lyh/l;Landroidx/compose/ui/n;Lyh/l;Landroidx/compose/runtime/p;II)V", "Lkotlin/t;", "NoOpUpdate", "Lyh/l;", "b", "()Lyh/l;", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class AndroidView_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private static final l<View, b2> f17060a = new l<View, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$NoOpUpdate$1
        public final void a(@d View view) {
            f0.p(view, "$this$null");
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ b2 invoke(View view) {
            a(view);
            return b2.f124493a;
        }
    };

    /* JADX INFO: compiled from: AndroidView.android.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a implements androidx.compose.ui.input.nestedscroll.b {
        a() {
        }

        @Override // androidx.compose.ui.input.nestedscroll.b
        public /* synthetic */ Object a(long j10, long j11, kotlin.coroutines.c cVar) {
            return androidx.compose.ui.input.nestedscroll.a.a(this, j10, j11, cVar);
        }

        @Override // androidx.compose.ui.input.nestedscroll.b
        public /* synthetic */ long c(long j10, long j11, int i10) {
            return androidx.compose.ui.input.nestedscroll.a.b(this, j10, j11, i10);
        }

        @Override // androidx.compose.ui.input.nestedscroll.b
        public /* synthetic */ Object d(long j10, kotlin.coroutines.c cVar) {
            return androidx.compose.ui.input.nestedscroll.a.c(this, j10, cVar);
        }

        @Override // androidx.compose.ui.input.nestedscroll.b
        public /* synthetic */ long e(long j10, int i10) {
            return androidx.compose.ui.input.nestedscroll.a.d(this, j10, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:58:0x0123  */
    /* JADX WARN: Code duplicated, block: B:61:0x016c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0178  */
    /* JADX WARN: Code duplicated, block: B:65:0x0181  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    @t
    @h
    public static final <T extends View> void a(@d final l<? super Context, ? extends T> factory, @e n nVar, @e l<? super T, b2> lVar, @e p pVar, final int i10, final int i11) {
        int i12;
        n nVar2;
        int i13;
        l<? super T, b2> lVar2;
        int i14;
        n nVar3;
        l<? super T, b2> lVar3;
        Object objU;
        p.Companion companion;
        Object objU2;
        final androidx.compose.runtime.saveable.c cVar;
        final String strValueOf;
        Object objU3;
        final h1 h1Var;
        final yh.a<LayoutNode> aVar;
        final n nVar4;
        final l<? super T, b2> lVar4;
        u1 u1VarH;
        f0.p(factory, "factory");
        p pVarF = pVar.F(-1783766393);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(factory) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & 112) == 0) {
                nVar2 = nVar;
                i12 |= pVarF.s(nVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & bb.c.b.f30796me) == 0) {
                    lVar2 = lVar;
                    if (pVarF.s(lVar2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i12 & bb.c.b.f30586db) == 146 || !pVarF.b()) {
                    if (i15 != 0) {
                        nVar3 = n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        lVar3 = f17060a;
                    } else {
                        lVar3 = lVar2;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1783766393, i10, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:81)");
                    }
                    final Context context = (Context) pVarF.K(AndroidCompositionLocals_androidKt.g());
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = new a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    a aVar2 = (a) objU;
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    if (objU2 == companion.a()) {
                        objU2 = new NestedScrollDispatcher();
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    final NestedScrollDispatcher nestedScrollDispatcher = (NestedScrollDispatcher) objU2;
                    n nVarM = ComposedModifierKt.m(pVarF, SemanticsModifierKt.b(nVar3.s0(NestedScrollModifierKt.a(n.INSTANCE, aVar2, nestedScrollDispatcher)), true, new l<r, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$modifierWithSemantics$1
                        public final void a(@d r semantics) {
                            f0.p(semantics, "$this$semantics");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(r rVar) {
                            a(rVar);
                            return b2.f124493a;
                        }
                    }));
                    s1.e eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    final androidx.compose.runtime.r rVarU = ComposablesKt.u(pVarF, 0);
                    cVar = (androidx.compose.runtime.saveable.c) pVarF.K(SaveableStateRegistryKt.b());
                    strValueOf = String.valueOf(ComposablesKt.j(pVarF, 0));
                    pVarF.T(-492369756);
                    objU3 = pVarF.U();
                    if (objU3 == companion.a()) {
                        objU3 = new h1();
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    h1Var = (h1) objU3;
                    y yVar = (y) pVarF.K(AndroidCompositionLocals_androidKt.i());
                    androidx.savedstate.d dVar = (androidx.savedstate.d) pVarF.K(AndroidCompositionLocals_androidKt.j());
                    n nVar5 = nVar3;
                    aVar = new yh.a<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference incomplete: some casts might be missing */
                        @Override // yh.a
                        @d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final LayoutNode invoke() {
                            View typedView$ui_release;
                            ViewFactoryHolder viewFactoryHolder = new ViewFactoryHolder(context, rVarU, nestedScrollDispatcher);
                            viewFactoryHolder.setFactory(factory);
                            androidx.compose.runtime.saveable.c cVar2 = cVar;
                            Object objE = cVar2 != null ? cVar2.e(strValueOf) : null;
                            SparseArray<Parcelable> sparseArray = objE instanceof SparseArray ? (SparseArray) objE : null;
                            if (sparseArray != null && (typedView$ui_release = viewFactoryHolder.getTypedView$ui_release()) != null) {
                                typedView$ui_release.restoreHierarchyState(sparseArray);
                            }
                            h1Var.b((ViewFactoryHolder<T>) viewFactoryHolder);
                            return viewFactoryHolder.getLayoutNode();
                        }
                    };
                    pVarF.T(1886828752);
                    if (!(pVarF.G() instanceof m1)) {
                        ComposablesKt.n();
                    }
                    pVarF.J();
                    if (pVarF.D()) {
                        pVarF.L(new yh.a<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // yh.a
                            @d
                            public final LayoutNode invoke() {
                                return aVar.invoke();
                            }
                        });
                    } else {
                        pVarF.d();
                    }
                    p pVarB = Updater.b(pVarF);
                    Updater.j(pVarB, nVarM, new yh.p<LayoutNode, n, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void a(@d LayoutNode set, @d n it) {
                            f0.p(set, "$this$set");
                            f0.p(it, "it");
                            Object objA = h1Var.a();
                            f0.m(objA);
                            ((ViewFactoryHolder) objA).setModifier(it);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, n nVar6) {
                            a(layoutNode, nVar6);
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB, eVar, new yh.p<LayoutNode, s1.e, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void a(@d LayoutNode set, @d s1.e it) {
                            f0.p(set, "$this$set");
                            f0.p(it, "it");
                            Object objA = h1Var.a();
                            f0.m(objA);
                            ((ViewFactoryHolder) objA).setDensity(it);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, s1.e eVar2) {
                            a(layoutNode, eVar2);
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB, yVar, new yh.p<LayoutNode, y, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void a(@d LayoutNode set, @d y it) {
                            f0.p(set, "$this$set");
                            f0.p(it, "it");
                            Object objA = h1Var.a();
                            f0.m(objA);
                            ((ViewFactoryHolder) objA).setLifecycleOwner(it);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, y yVar2) {
                            a(layoutNode, yVar2);
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB, dVar, new yh.p<LayoutNode, androidx.savedstate.d, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void a(@d LayoutNode set, @d androidx.savedstate.d it) {
                            f0.p(set, "$this$set");
                            f0.p(it, "it");
                            Object objA = h1Var.a();
                            f0.m(objA);
                            ((ViewFactoryHolder) objA).setSavedStateRegistryOwner(it);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, androidx.savedstate.d dVar2) {
                            a(layoutNode, dVar2);
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB, lVar3, new yh.p<LayoutNode, l<? super T, ? extends b2>, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void a(@d LayoutNode set, @d l<? super T, b2> it) {
                            f0.p(set, "$this$set");
                            f0.p(it, "it");
                            ViewFactoryHolder<T> viewFactoryHolderA = h1Var.a();
                            f0.m(viewFactoryHolderA);
                            viewFactoryHolderA.setUpdateBlock(it);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, Object obj) {
                            a(layoutNode, (l) obj);
                            return b2.f124493a;
                        }
                    });
                    Updater.j(pVarB, layoutDirection, new yh.p<LayoutNode, LayoutDirection, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$6

                        /* JADX INFO: compiled from: AndroidView.android.kt */
                        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                        public final /* synthetic */ class a {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public static final /* synthetic */ int[] f17075a;

                            static {
                                int[] iArr = new int[LayoutDirection.values().length];
                                iArr[LayoutDirection.Ltr.ordinal()] = 1;
                                iArr[LayoutDirection.Rtl.ordinal()] = 2;
                                f17075a = iArr;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void a(@d LayoutNode set, @d LayoutDirection it) {
                            f0.p(set, "$this$set");
                            f0.p(it, "it");
                            Object objA = h1Var.a();
                            f0.m(objA);
                            ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) objA;
                            int i16 = a.f17075a[it.ordinal()];
                            int i17 = 1;
                            if (i16 == 1) {
                                i17 = 0;
                            } else if (i16 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            viewFactoryHolder.setLayoutDirection(i17);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, LayoutDirection layoutDirection2) {
                            a(layoutNode, layoutDirection2);
                            return b2.f124493a;
                        }
                    });
                    pVarF.f();
                    pVarF.c0();
                    if (cVar != null) {
                        EffectsKt.b(cVar, strValueOf, new l<androidx.compose.runtime.f0, e0>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3

                            /* JADX INFO: compiled from: Effects.kt */
                            @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                            public static final class a implements e0 {

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                final /* synthetic */ androidx.compose.runtime.saveable.c.a f17079a;

                                public a(androidx.compose.runtime.saveable.c.a aVar) {
                                    this.f17079a = aVar;
                                }

                                @Override // androidx.compose.runtime.e0
                                public void dispose() {
                                    this.f17079a.unregister();
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // yh.l
                            @d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final e0 invoke(@d androidx.compose.runtime.f0 DisposableEffect) {
                                f0.p(DisposableEffect, "$this$DisposableEffect");
                                final h1<ViewFactoryHolder<T>> h1Var2 = h1Var;
                                return new a(cVar.b(strValueOf, new yh.a<SparseArray<Parcelable>>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$valueProvider$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // yh.a
                                    @d
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final SparseArray<Parcelable> invoke() {
                                        SparseArray<Parcelable> sparseArray = new SparseArray<>();
                                        Object objA = h1Var2.a();
                                        f0.m(objA);
                                        View typedView$ui_release = ((ViewFactoryHolder) objA).getTypedView$ui_release();
                                        if (typedView$ui_release != null) {
                                            typedView$ui_release.saveHierarchyState(sparseArray);
                                        }
                                        return sparseArray;
                                    }
                                }));
                            }
                        }, pVarF, 8);
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar5;
                    lVar4 = lVar3;
                } else {
                    pVarF.l();
                    nVar4 = nVar2;
                    lVar4 = lVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<p, Integer, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@e p pVar2, int i16) {
                        AndroidView_androidKt.a(factory, nVar4, lVar4, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.b.f30966u4;
            lVar2 = lVar;
            if ((i12 & bb.c.b.f30586db) == 146) {
                if (i15 != 0) {
                    nVar3 = n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    lVar3 = f17060a;
                } else {
                    lVar3 = lVar2;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1783766393, i10, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:81)");
                }
                final Context context2 = (Context) pVarF.K(AndroidCompositionLocals_androidKt.g());
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = p.INSTANCE;
                if (objU == companion.a()) {
                    objU = new a();
                    pVarF.N(objU);
                }
                pVarF.c0();
                a aVar3 = (a) objU;
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                if (objU2 == companion.a()) {
                    objU2 = new NestedScrollDispatcher();
                    pVarF.N(objU2);
                }
                pVarF.c0();
                final NestedScrollDispatcher nestedScrollDispatcher2 = (NestedScrollDispatcher) objU2;
                n nVarM2 = ComposedModifierKt.m(pVarF, SemanticsModifierKt.b(nVar3.s0(NestedScrollModifierKt.a(n.INSTANCE, aVar3, nestedScrollDispatcher2)), true, new l<r, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$modifierWithSemantics$1
                    public final void a(@d r semantics) {
                        f0.p(semantics, "$this$semantics");
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(r rVar) {
                        a(rVar);
                        return b2.f124493a;
                    }
                }));
                s1.e eVar2 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection2 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                final androidx.compose.runtime.r rVarU2 = ComposablesKt.u(pVarF, 0);
                cVar = (androidx.compose.runtime.saveable.c) pVarF.K(SaveableStateRegistryKt.b());
                strValueOf = String.valueOf(ComposablesKt.j(pVarF, 0));
                pVarF.T(-492369756);
                objU3 = pVarF.U();
                if (objU3 == companion.a()) {
                    objU3 = new h1();
                    pVarF.N(objU3);
                }
                pVarF.c0();
                h1Var = (h1) objU3;
                y yVar2 = (y) pVarF.K(AndroidCompositionLocals_androidKt.i());
                androidx.savedstate.d dVar2 = (androidx.savedstate.d) pVarF.K(AndroidCompositionLocals_androidKt.j());
                n nVar6 = nVar3;
                aVar = new yh.a<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // yh.a
                    @d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final LayoutNode invoke() {
                        View typedView$ui_release;
                        ViewFactoryHolder viewFactoryHolder = new ViewFactoryHolder(context2, rVarU2, nestedScrollDispatcher2);
                        viewFactoryHolder.setFactory(factory);
                        androidx.compose.runtime.saveable.c cVar2 = cVar;
                        Object objE = cVar2 != null ? cVar2.e(strValueOf) : null;
                        SparseArray<Parcelable> sparseArray = objE instanceof SparseArray ? (SparseArray) objE : null;
                        if (sparseArray != null && (typedView$ui_release = viewFactoryHolder.getTypedView$ui_release()) != null) {
                            typedView$ui_release.restoreHierarchyState(sparseArray);
                        }
                        h1Var.b((ViewFactoryHolder<T>) viewFactoryHolder);
                        return viewFactoryHolder.getLayoutNode();
                    }
                };
                pVarF.T(1886828752);
                if (!(pVarF.G() instanceof m1)) {
                    ComposablesKt.n();
                }
                pVarF.J();
                if (pVarF.D()) {
                    pVarF.L(new yh.a<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                        @Override // yh.a
                        @d
                        public final LayoutNode invoke() {
                            return aVar.invoke();
                        }
                    });
                } else {
                    pVarF.d();
                }
                p pVarB2 = Updater.b(pVarF);
                Updater.j(pVarB2, nVarM2, new yh.p<LayoutNode, n, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(@d LayoutNode set, @d n it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        Object objA = h1Var.a();
                        f0.m(objA);
                        ((ViewFactoryHolder) objA).setModifier(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, n nVar7) {
                        a(layoutNode, nVar7);
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB2, eVar2, new yh.p<LayoutNode, s1.e, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(@d LayoutNode set, @d s1.e it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        Object objA = h1Var.a();
                        f0.m(objA);
                        ((ViewFactoryHolder) objA).setDensity(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, s1.e eVar3) {
                        a(layoutNode, eVar3);
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB2, yVar2, new yh.p<LayoutNode, y, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(@d LayoutNode set, @d y it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        Object objA = h1Var.a();
                        f0.m(objA);
                        ((ViewFactoryHolder) objA).setLifecycleOwner(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, y yVar3) {
                        a(layoutNode, yVar3);
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB2, dVar2, new yh.p<LayoutNode, androidx.savedstate.d, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(@d LayoutNode set, @d androidx.savedstate.d it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        Object objA = h1Var.a();
                        f0.m(objA);
                        ((ViewFactoryHolder) objA).setSavedStateRegistryOwner(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, androidx.savedstate.d dVar3) {
                        a(layoutNode, dVar3);
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB2, lVar3, new yh.p<LayoutNode, l<? super T, ? extends b2>, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(@d LayoutNode set, @d l<? super T, b2> it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        ViewFactoryHolder<T> viewFactoryHolderA = h1Var.a();
                        f0.m(viewFactoryHolderA);
                        viewFactoryHolderA.setUpdateBlock(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, Object obj) {
                        a(layoutNode, (l) obj);
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB2, layoutDirection2, new yh.p<LayoutNode, LayoutDirection, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$6

                    /* JADX INFO: compiled from: AndroidView.android.kt */
                    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                    public final /* synthetic */ class a {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public static final /* synthetic */ int[] f17075a;

                        static {
                            int[] iArr = new int[LayoutDirection.values().length];
                            iArr[LayoutDirection.Ltr.ordinal()] = 1;
                            iArr[LayoutDirection.Rtl.ordinal()] = 2;
                            f17075a = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(@d LayoutNode set, @d LayoutDirection it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        Object objA = h1Var.a();
                        f0.m(objA);
                        ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) objA;
                        int i16 = a.f17075a[it.ordinal()];
                        int i17 = 1;
                        if (i16 == 1) {
                            i17 = 0;
                        } else if (i16 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        viewFactoryHolder.setLayoutDirection(i17);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, LayoutDirection layoutDirection3) {
                        a(layoutNode, layoutDirection3);
                        return b2.f124493a;
                    }
                });
                pVarF.f();
                pVarF.c0();
                if (cVar != null) {
                    EffectsKt.b(cVar, strValueOf, new l<androidx.compose.runtime.f0, e0>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3

                        /* JADX INFO: compiled from: Effects.kt */
                        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                        public static final class a implements e0 {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            final /* synthetic */ androidx.compose.runtime.saveable.c.a f17079a;

                            public a(androidx.compose.runtime.saveable.c.a aVar) {
                                this.f17079a = aVar;
                            }

                            @Override // androidx.compose.runtime.e0
                            public void dispose() {
                                this.f17079a.unregister();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // yh.l
                        @d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final e0 invoke(@d androidx.compose.runtime.f0 DisposableEffect) {
                            f0.p(DisposableEffect, "$this$DisposableEffect");
                            final h1<ViewFactoryHolder<T>> h1Var2 = h1Var;
                            return new a(cVar.b(strValueOf, new yh.a<SparseArray<Parcelable>>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$valueProvider$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final SparseArray<Parcelable> invoke() {
                                    SparseArray<Parcelable> sparseArray = new SparseArray<>();
                                    Object objA = h1Var2.a();
                                    f0.m(objA);
                                    View typedView$ui_release = ((ViewFactoryHolder) objA).getTypedView$ui_release();
                                    if (typedView$ui_release != null) {
                                        typedView$ui_release.saveHierarchyState(sparseArray);
                                    }
                                    return sparseArray;
                                }
                            }));
                        }
                    }, pVarF, 8);
                }
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar6;
                lVar4 = lVar3;
            } else {
                if (i15 != 0) {
                    nVar3 = n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    lVar3 = f17060a;
                } else {
                    lVar3 = lVar2;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1783766393, i10, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:81)");
                }
                final Context context3 = (Context) pVarF.K(AndroidCompositionLocals_androidKt.g());
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = p.INSTANCE;
                if (objU == companion.a()) {
                    objU = new a();
                    pVarF.N(objU);
                }
                pVarF.c0();
                a aVar4 = (a) objU;
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                if (objU2 == companion.a()) {
                    objU2 = new NestedScrollDispatcher();
                    pVarF.N(objU2);
                }
                pVarF.c0();
                final NestedScrollDispatcher nestedScrollDispatcher3 = (NestedScrollDispatcher) objU2;
                n nVarM3 = ComposedModifierKt.m(pVarF, SemanticsModifierKt.b(nVar3.s0(NestedScrollModifierKt.a(n.INSTANCE, aVar4, nestedScrollDispatcher3)), true, new l<r, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$modifierWithSemantics$1
                    public final void a(@d r semantics) {
                        f0.p(semantics, "$this$semantics");
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(r rVar) {
                        a(rVar);
                        return b2.f124493a;
                    }
                }));
                s1.e eVar3 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection3 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                final androidx.compose.runtime.r rVarU3 = ComposablesKt.u(pVarF, 0);
                cVar = (androidx.compose.runtime.saveable.c) pVarF.K(SaveableStateRegistryKt.b());
                strValueOf = String.valueOf(ComposablesKt.j(pVarF, 0));
                pVarF.T(-492369756);
                objU3 = pVarF.U();
                if (objU3 == companion.a()) {
                    objU3 = new h1();
                    pVarF.N(objU3);
                }
                pVarF.c0();
                h1Var = (h1) objU3;
                y yVar3 = (y) pVarF.K(AndroidCompositionLocals_androidKt.i());
                androidx.savedstate.d dVar3 = (androidx.savedstate.d) pVarF.K(AndroidCompositionLocals_androidKt.j());
                n nVar7 = nVar3;
                aVar = new yh.a<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // yh.a
                    @d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final LayoutNode invoke() {
                        View typedView$ui_release;
                        ViewFactoryHolder viewFactoryHolder = new ViewFactoryHolder(context3, rVarU3, nestedScrollDispatcher3);
                        viewFactoryHolder.setFactory(factory);
                        androidx.compose.runtime.saveable.c cVar2 = cVar;
                        Object objE = cVar2 != null ? cVar2.e(strValueOf) : null;
                        SparseArray<Parcelable> sparseArray = objE instanceof SparseArray ? (SparseArray) objE : null;
                        if (sparseArray != null && (typedView$ui_release = viewFactoryHolder.getTypedView$ui_release()) != null) {
                            typedView$ui_release.restoreHierarchyState(sparseArray);
                        }
                        h1Var.b((ViewFactoryHolder<T>) viewFactoryHolder);
                        return viewFactoryHolder.getLayoutNode();
                    }
                };
                pVarF.T(1886828752);
                if (!(pVarF.G() instanceof m1)) {
                    ComposablesKt.n();
                }
                pVarF.J();
                if (pVarF.D()) {
                    pVarF.L(new yh.a<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                        @Override // yh.a
                        @d
                        public final LayoutNode invoke() {
                            return aVar.invoke();
                        }
                    });
                } else {
                    pVarF.d();
                }
                p pVarB3 = Updater.b(pVarF);
                Updater.j(pVarB3, nVarM3, new yh.p<LayoutNode, n, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(@d LayoutNode set, @d n it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        Object objA = h1Var.a();
                        f0.m(objA);
                        ((ViewFactoryHolder) objA).setModifier(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, n nVar8) {
                        a(layoutNode, nVar8);
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB3, eVar3, new yh.p<LayoutNode, s1.e, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(@d LayoutNode set, @d s1.e it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        Object objA = h1Var.a();
                        f0.m(objA);
                        ((ViewFactoryHolder) objA).setDensity(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, s1.e eVar4) {
                        a(layoutNode, eVar4);
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB3, yVar3, new yh.p<LayoutNode, y, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(@d LayoutNode set, @d y it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        Object objA = h1Var.a();
                        f0.m(objA);
                        ((ViewFactoryHolder) objA).setLifecycleOwner(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, y yVar4) {
                        a(layoutNode, yVar4);
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB3, dVar3, new yh.p<LayoutNode, androidx.savedstate.d, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(@d LayoutNode set, @d androidx.savedstate.d it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        Object objA = h1Var.a();
                        f0.m(objA);
                        ((ViewFactoryHolder) objA).setSavedStateRegistryOwner(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, androidx.savedstate.d dVar4) {
                        a(layoutNode, dVar4);
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB3, lVar3, new yh.p<LayoutNode, l<? super T, ? extends b2>, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(@d LayoutNode set, @d l<? super T, b2> it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        ViewFactoryHolder<T> viewFactoryHolderA = h1Var.a();
                        f0.m(viewFactoryHolderA);
                        viewFactoryHolderA.setUpdateBlock(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, Object obj) {
                        a(layoutNode, (l) obj);
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB3, layoutDirection3, new yh.p<LayoutNode, LayoutDirection, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$6

                    /* JADX INFO: compiled from: AndroidView.android.kt */
                    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                    public final /* synthetic */ class a {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public static final /* synthetic */ int[] f17075a;

                        static {
                            int[] iArr = new int[LayoutDirection.values().length];
                            iArr[LayoutDirection.Ltr.ordinal()] = 1;
                            iArr[LayoutDirection.Rtl.ordinal()] = 2;
                            f17075a = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(@d LayoutNode set, @d LayoutDirection it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        Object objA = h1Var.a();
                        f0.m(objA);
                        ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) objA;
                        int i16 = a.f17075a[it.ordinal()];
                        int i17 = 1;
                        if (i16 == 1) {
                            i17 = 0;
                        } else if (i16 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        viewFactoryHolder.setLayoutDirection(i17);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, LayoutDirection layoutDirection4) {
                        a(layoutNode, layoutDirection4);
                        return b2.f124493a;
                    }
                });
                pVarF.f();
                pVarF.c0();
                if (cVar != null) {
                    EffectsKt.b(cVar, strValueOf, new l<androidx.compose.runtime.f0, e0>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3

                        /* JADX INFO: compiled from: Effects.kt */
                        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                        public static final class a implements e0 {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            final /* synthetic */ androidx.compose.runtime.saveable.c.a f17079a;

                            public a(androidx.compose.runtime.saveable.c.a aVar) {
                                this.f17079a = aVar;
                            }

                            @Override // androidx.compose.runtime.e0
                            public void dispose() {
                                this.f17079a.unregister();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // yh.l
                        @d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final e0 invoke(@d androidx.compose.runtime.f0 DisposableEffect) {
                            f0.p(DisposableEffect, "$this$DisposableEffect");
                            final h1<ViewFactoryHolder<T>> h1Var2 = h1Var;
                            return new a(cVar.b(strValueOf, new yh.a<SparseArray<Parcelable>>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$valueProvider$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final SparseArray<Parcelable> invoke() {
                                    SparseArray<Parcelable> sparseArray = new SparseArray<>();
                                    Object objA = h1Var2.a();
                                    f0.m(objA);
                                    View typedView$ui_release = ((ViewFactoryHolder) objA).getTypedView$ui_release();
                                    if (typedView$ui_release != null) {
                                        typedView$ui_release.saveHierarchyState(sparseArray);
                                    }
                                    return sparseArray;
                                }
                            }));
                        }
                    }, pVarF, 8);
                }
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar7;
                lVar4 = lVar3;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<p, Integer, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@e p pVar2, int i16) {
                    AndroidView_androidKt.a(factory, nVar4, lVar4, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= 48;
        nVar2 = nVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & bb.c.b.f30796me) == 0) {
                lVar2 = lVar;
                if (pVarF.s(lVar2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i12 & bb.c.b.f30586db) == 146) {
                if (i15 != 0) {
                    nVar3 = n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    lVar3 = f17060a;
                } else {
                    lVar3 = lVar2;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1783766393, i10, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:81)");
                }
                final Context context4 = (Context) pVarF.K(AndroidCompositionLocals_androidKt.g());
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = p.INSTANCE;
                if (objU == companion.a()) {
                    objU = new a();
                    pVarF.N(objU);
                }
                pVarF.c0();
                a aVar5 = (a) objU;
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                if (objU2 == companion.a()) {
                    objU2 = new NestedScrollDispatcher();
                    pVarF.N(objU2);
                }
                pVarF.c0();
                final NestedScrollDispatcher nestedScrollDispatcher4 = (NestedScrollDispatcher) objU2;
                n nVarM4 = ComposedModifierKt.m(pVarF, SemanticsModifierKt.b(nVar3.s0(NestedScrollModifierKt.a(n.INSTANCE, aVar5, nestedScrollDispatcher4)), true, new l<r, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$modifierWithSemantics$1
                    public final void a(@d r semantics) {
                        f0.p(semantics, "$this$semantics");
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(r rVar) {
                        a(rVar);
                        return b2.f124493a;
                    }
                }));
                s1.e eVar4 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection4 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                final androidx.compose.runtime.r rVarU4 = ComposablesKt.u(pVarF, 0);
                cVar = (androidx.compose.runtime.saveable.c) pVarF.K(SaveableStateRegistryKt.b());
                strValueOf = String.valueOf(ComposablesKt.j(pVarF, 0));
                pVarF.T(-492369756);
                objU3 = pVarF.U();
                if (objU3 == companion.a()) {
                    objU3 = new h1();
                    pVarF.N(objU3);
                }
                pVarF.c0();
                h1Var = (h1) objU3;
                y yVar4 = (y) pVarF.K(AndroidCompositionLocals_androidKt.i());
                androidx.savedstate.d dVar4 = (androidx.savedstate.d) pVarF.K(AndroidCompositionLocals_androidKt.j());
                n nVar8 = nVar3;
                aVar = new yh.a<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // yh.a
                    @d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final LayoutNode invoke() {
                        View typedView$ui_release;
                        ViewFactoryHolder viewFactoryHolder = new ViewFactoryHolder(context4, rVarU4, nestedScrollDispatcher4);
                        viewFactoryHolder.setFactory(factory);
                        androidx.compose.runtime.saveable.c cVar2 = cVar;
                        Object objE = cVar2 != null ? cVar2.e(strValueOf) : null;
                        SparseArray<Parcelable> sparseArray = objE instanceof SparseArray ? (SparseArray) objE : null;
                        if (sparseArray != null && (typedView$ui_release = viewFactoryHolder.getTypedView$ui_release()) != null) {
                            typedView$ui_release.restoreHierarchyState(sparseArray);
                        }
                        h1Var.b((ViewFactoryHolder<T>) viewFactoryHolder);
                        return viewFactoryHolder.getLayoutNode();
                    }
                };
                pVarF.T(1886828752);
                if (!(pVarF.G() instanceof m1)) {
                    ComposablesKt.n();
                }
                pVarF.J();
                if (pVarF.D()) {
                    pVarF.L(new yh.a<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                        @Override // yh.a
                        @d
                        public final LayoutNode invoke() {
                            return aVar.invoke();
                        }
                    });
                } else {
                    pVarF.d();
                }
                p pVarB4 = Updater.b(pVarF);
                Updater.j(pVarB4, nVarM4, new yh.p<LayoutNode, n, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(@d LayoutNode set, @d n it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        Object objA = h1Var.a();
                        f0.m(objA);
                        ((ViewFactoryHolder) objA).setModifier(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, n nVar9) {
                        a(layoutNode, nVar9);
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB4, eVar4, new yh.p<LayoutNode, s1.e, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(@d LayoutNode set, @d s1.e it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        Object objA = h1Var.a();
                        f0.m(objA);
                        ((ViewFactoryHolder) objA).setDensity(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, s1.e eVar5) {
                        a(layoutNode, eVar5);
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB4, yVar4, new yh.p<LayoutNode, y, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(@d LayoutNode set, @d y it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        Object objA = h1Var.a();
                        f0.m(objA);
                        ((ViewFactoryHolder) objA).setLifecycleOwner(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, y yVar5) {
                        a(layoutNode, yVar5);
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB4, dVar4, new yh.p<LayoutNode, androidx.savedstate.d, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(@d LayoutNode set, @d androidx.savedstate.d it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        Object objA = h1Var.a();
                        f0.m(objA);
                        ((ViewFactoryHolder) objA).setSavedStateRegistryOwner(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, androidx.savedstate.d dVar5) {
                        a(layoutNode, dVar5);
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB4, lVar3, new yh.p<LayoutNode, l<? super T, ? extends b2>, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(@d LayoutNode set, @d l<? super T, b2> it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        ViewFactoryHolder<T> viewFactoryHolderA = h1Var.a();
                        f0.m(viewFactoryHolderA);
                        viewFactoryHolderA.setUpdateBlock(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, Object obj) {
                        a(layoutNode, (l) obj);
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB4, layoutDirection4, new yh.p<LayoutNode, LayoutDirection, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$6

                    /* JADX INFO: compiled from: AndroidView.android.kt */
                    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                    public final /* synthetic */ class a {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public static final /* synthetic */ int[] f17075a;

                        static {
                            int[] iArr = new int[LayoutDirection.values().length];
                            iArr[LayoutDirection.Ltr.ordinal()] = 1;
                            iArr[LayoutDirection.Rtl.ordinal()] = 2;
                            f17075a = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(@d LayoutNode set, @d LayoutDirection it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        Object objA = h1Var.a();
                        f0.m(objA);
                        ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) objA;
                        int i16 = a.f17075a[it.ordinal()];
                        int i17 = 1;
                        if (i16 == 1) {
                            i17 = 0;
                        } else if (i16 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        viewFactoryHolder.setLayoutDirection(i17);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, LayoutDirection layoutDirection5) {
                        a(layoutNode, layoutDirection5);
                        return b2.f124493a;
                    }
                });
                pVarF.f();
                pVarF.c0();
                if (cVar != null) {
                    EffectsKt.b(cVar, strValueOf, new l<androidx.compose.runtime.f0, e0>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3

                        /* JADX INFO: compiled from: Effects.kt */
                        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                        public static final class a implements e0 {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            final /* synthetic */ androidx.compose.runtime.saveable.c.a f17079a;

                            public a(androidx.compose.runtime.saveable.c.a aVar) {
                                this.f17079a = aVar;
                            }

                            @Override // androidx.compose.runtime.e0
                            public void dispose() {
                                this.f17079a.unregister();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // yh.l
                        @d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final e0 invoke(@d androidx.compose.runtime.f0 DisposableEffect) {
                            f0.p(DisposableEffect, "$this$DisposableEffect");
                            final h1<ViewFactoryHolder<T>> h1Var2 = h1Var;
                            return new a(cVar.b(strValueOf, new yh.a<SparseArray<Parcelable>>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$valueProvider$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final SparseArray<Parcelable> invoke() {
                                    SparseArray<Parcelable> sparseArray = new SparseArray<>();
                                    Object objA = h1Var2.a();
                                    f0.m(objA);
                                    View typedView$ui_release = ((ViewFactoryHolder) objA).getTypedView$ui_release();
                                    if (typedView$ui_release != null) {
                                        typedView$ui_release.saveHierarchyState(sparseArray);
                                    }
                                    return sparseArray;
                                }
                            }));
                        }
                    }, pVarF, 8);
                }
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar8;
                lVar4 = lVar3;
            } else {
                if (i15 != 0) {
                    nVar3 = n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    lVar3 = f17060a;
                } else {
                    lVar3 = lVar2;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1783766393, i10, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:81)");
                }
                final Context context5 = (Context) pVarF.K(AndroidCompositionLocals_androidKt.g());
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = p.INSTANCE;
                if (objU == companion.a()) {
                    objU = new a();
                    pVarF.N(objU);
                }
                pVarF.c0();
                a aVar6 = (a) objU;
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                if (objU2 == companion.a()) {
                    objU2 = new NestedScrollDispatcher();
                    pVarF.N(objU2);
                }
                pVarF.c0();
                final NestedScrollDispatcher nestedScrollDispatcher5 = (NestedScrollDispatcher) objU2;
                n nVarM5 = ComposedModifierKt.m(pVarF, SemanticsModifierKt.b(nVar3.s0(NestedScrollModifierKt.a(n.INSTANCE, aVar6, nestedScrollDispatcher5)), true, new l<r, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$modifierWithSemantics$1
                    public final void a(@d r semantics) {
                        f0.p(semantics, "$this$semantics");
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(r rVar) {
                        a(rVar);
                        return b2.f124493a;
                    }
                }));
                s1.e eVar5 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection5 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                final androidx.compose.runtime.r rVarU5 = ComposablesKt.u(pVarF, 0);
                cVar = (androidx.compose.runtime.saveable.c) pVarF.K(SaveableStateRegistryKt.b());
                strValueOf = String.valueOf(ComposablesKt.j(pVarF, 0));
                pVarF.T(-492369756);
                objU3 = pVarF.U();
                if (objU3 == companion.a()) {
                    objU3 = new h1();
                    pVarF.N(objU3);
                }
                pVarF.c0();
                h1Var = (h1) objU3;
                y yVar5 = (y) pVarF.K(AndroidCompositionLocals_androidKt.i());
                androidx.savedstate.d dVar5 = (androidx.savedstate.d) pVarF.K(AndroidCompositionLocals_androidKt.j());
                n nVar9 = nVar3;
                aVar = new yh.a<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // yh.a
                    @d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final LayoutNode invoke() {
                        View typedView$ui_release;
                        ViewFactoryHolder viewFactoryHolder = new ViewFactoryHolder(context5, rVarU5, nestedScrollDispatcher5);
                        viewFactoryHolder.setFactory(factory);
                        androidx.compose.runtime.saveable.c cVar2 = cVar;
                        Object objE = cVar2 != null ? cVar2.e(strValueOf) : null;
                        SparseArray<Parcelable> sparseArray = objE instanceof SparseArray ? (SparseArray) objE : null;
                        if (sparseArray != null && (typedView$ui_release = viewFactoryHolder.getTypedView$ui_release()) != null) {
                            typedView$ui_release.restoreHierarchyState(sparseArray);
                        }
                        h1Var.b((ViewFactoryHolder<T>) viewFactoryHolder);
                        return viewFactoryHolder.getLayoutNode();
                    }
                };
                pVarF.T(1886828752);
                if (!(pVarF.G() instanceof m1)) {
                    ComposablesKt.n();
                }
                pVarF.J();
                if (pVarF.D()) {
                    pVarF.L(new yh.a<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                        @Override // yh.a
                        @d
                        public final LayoutNode invoke() {
                            return aVar.invoke();
                        }
                    });
                } else {
                    pVarF.d();
                }
                p pVarB5 = Updater.b(pVarF);
                Updater.j(pVarB5, nVarM5, new yh.p<LayoutNode, n, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(@d LayoutNode set, @d n it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        Object objA = h1Var.a();
                        f0.m(objA);
                        ((ViewFactoryHolder) objA).setModifier(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, n nVar10) {
                        a(layoutNode, nVar10);
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB5, eVar5, new yh.p<LayoutNode, s1.e, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(@d LayoutNode set, @d s1.e it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        Object objA = h1Var.a();
                        f0.m(objA);
                        ((ViewFactoryHolder) objA).setDensity(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, s1.e eVar6) {
                        a(layoutNode, eVar6);
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB5, yVar5, new yh.p<LayoutNode, y, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(@d LayoutNode set, @d y it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        Object objA = h1Var.a();
                        f0.m(objA);
                        ((ViewFactoryHolder) objA).setLifecycleOwner(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, y yVar6) {
                        a(layoutNode, yVar6);
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB5, dVar5, new yh.p<LayoutNode, androidx.savedstate.d, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(@d LayoutNode set, @d androidx.savedstate.d it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        Object objA = h1Var.a();
                        f0.m(objA);
                        ((ViewFactoryHolder) objA).setSavedStateRegistryOwner(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, androidx.savedstate.d dVar6) {
                        a(layoutNode, dVar6);
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB5, lVar3, new yh.p<LayoutNode, l<? super T, ? extends b2>, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(@d LayoutNode set, @d l<? super T, b2> it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        ViewFactoryHolder<T> viewFactoryHolderA = h1Var.a();
                        f0.m(viewFactoryHolderA);
                        viewFactoryHolderA.setUpdateBlock(it);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, Object obj) {
                        a(layoutNode, (l) obj);
                        return b2.f124493a;
                    }
                });
                Updater.j(pVarB5, layoutDirection5, new yh.p<LayoutNode, LayoutDirection, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$6

                    /* JADX INFO: compiled from: AndroidView.android.kt */
                    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                    public final /* synthetic */ class a {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public static final /* synthetic */ int[] f17075a;

                        static {
                            int[] iArr = new int[LayoutDirection.values().length];
                            iArr[LayoutDirection.Ltr.ordinal()] = 1;
                            iArr[LayoutDirection.Rtl.ordinal()] = 2;
                            f17075a = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(@d LayoutNode set, @d LayoutDirection it) {
                        f0.p(set, "$this$set");
                        f0.p(it, "it");
                        Object objA = h1Var.a();
                        f0.m(objA);
                        ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) objA;
                        int i16 = a.f17075a[it.ordinal()];
                        int i17 = 1;
                        if (i16 == 1) {
                            i17 = 0;
                        } else if (i16 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        viewFactoryHolder.setLayoutDirection(i17);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, LayoutDirection layoutDirection6) {
                        a(layoutNode, layoutDirection6);
                        return b2.f124493a;
                    }
                });
                pVarF.f();
                pVarF.c0();
                if (cVar != null) {
                    EffectsKt.b(cVar, strValueOf, new l<androidx.compose.runtime.f0, e0>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3

                        /* JADX INFO: compiled from: Effects.kt */
                        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                        public static final class a implements e0 {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            final /* synthetic */ androidx.compose.runtime.saveable.c.a f17079a;

                            public a(androidx.compose.runtime.saveable.c.a aVar) {
                                this.f17079a = aVar;
                            }

                            @Override // androidx.compose.runtime.e0
                            public void dispose() {
                                this.f17079a.unregister();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // yh.l
                        @d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final e0 invoke(@d androidx.compose.runtime.f0 DisposableEffect) {
                            f0.p(DisposableEffect, "$this$DisposableEffect");
                            final h1<ViewFactoryHolder<T>> h1Var2 = h1Var;
                            return new a(cVar.b(strValueOf, new yh.a<SparseArray<Parcelable>>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$valueProvider$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final SparseArray<Parcelable> invoke() {
                                    SparseArray<Parcelable> sparseArray = new SparseArray<>();
                                    Object objA = h1Var2.a();
                                    f0.m(objA);
                                    View typedView$ui_release = ((ViewFactoryHolder) objA).getTypedView$ui_release();
                                    if (typedView$ui_release != null) {
                                        typedView$ui_release.saveHierarchyState(sparseArray);
                                    }
                                    return sparseArray;
                                }
                            }));
                        }
                    }, pVarF, 8);
                }
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar9;
                lVar4 = lVar3;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<p, Integer, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@e p pVar2, int i16) {
                    AndroidView_androidKt.a(factory, nVar4, lVar4, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.b.f30966u4;
        lVar2 = lVar;
        if ((i12 & bb.c.b.f30586db) == 146) {
            if (i15 != 0) {
                nVar3 = n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (i13 != 0) {
                lVar3 = f17060a;
            } else {
                lVar3 = lVar2;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1783766393, i10, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:81)");
            }
            final Context context6 = (Context) pVarF.K(AndroidCompositionLocals_androidKt.g());
            pVarF.T(-492369756);
            objU = pVarF.U();
            companion = p.INSTANCE;
            if (objU == companion.a()) {
                objU = new a();
                pVarF.N(objU);
            }
            pVarF.c0();
            a aVar7 = (a) objU;
            pVarF.T(-492369756);
            objU2 = pVarF.U();
            if (objU2 == companion.a()) {
                objU2 = new NestedScrollDispatcher();
                pVarF.N(objU2);
            }
            pVarF.c0();
            final NestedScrollDispatcher nestedScrollDispatcher6 = (NestedScrollDispatcher) objU2;
            n nVarM6 = ComposedModifierKt.m(pVarF, SemanticsModifierKt.b(nVar3.s0(NestedScrollModifierKt.a(n.INSTANCE, aVar7, nestedScrollDispatcher6)), true, new l<r, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$modifierWithSemantics$1
                public final void a(@d r semantics) {
                    f0.p(semantics, "$this$semantics");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(r rVar) {
                    a(rVar);
                    return b2.f124493a;
                }
            }));
            s1.e eVar6 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection6 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            final androidx.compose.runtime.r rVarU6 = ComposablesKt.u(pVarF, 0);
            cVar = (androidx.compose.runtime.saveable.c) pVarF.K(SaveableStateRegistryKt.b());
            strValueOf = String.valueOf(ComposablesKt.j(pVarF, 0));
            pVarF.T(-492369756);
            objU3 = pVarF.U();
            if (objU3 == companion.a()) {
                objU3 = new h1();
                pVarF.N(objU3);
            }
            pVarF.c0();
            h1Var = (h1) objU3;
            y yVar6 = (y) pVarF.K(AndroidCompositionLocals_androidKt.i());
            androidx.savedstate.d dVar6 = (androidx.savedstate.d) pVarF.K(AndroidCompositionLocals_androidKt.j());
            n nVar10 = nVar3;
            aVar = new yh.a<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // yh.a
                @d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final LayoutNode invoke() {
                    View typedView$ui_release;
                    ViewFactoryHolder viewFactoryHolder = new ViewFactoryHolder(context6, rVarU6, nestedScrollDispatcher6);
                    viewFactoryHolder.setFactory(factory);
                    androidx.compose.runtime.saveable.c cVar2 = cVar;
                    Object objE = cVar2 != null ? cVar2.e(strValueOf) : null;
                    SparseArray<Parcelable> sparseArray = objE instanceof SparseArray ? (SparseArray) objE : null;
                    if (sparseArray != null && (typedView$ui_release = viewFactoryHolder.getTypedView$ui_release()) != null) {
                        typedView$ui_release.restoreHierarchyState(sparseArray);
                    }
                    h1Var.b((ViewFactoryHolder<T>) viewFactoryHolder);
                    return viewFactoryHolder.getLayoutNode();
                }
            };
            pVarF.T(1886828752);
            if (!(pVarF.G() instanceof m1)) {
                ComposablesKt.n();
            }
            pVarF.J();
            if (pVarF.D()) {
                pVarF.L(new yh.a<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                    @Override // yh.a
                    @d
                    public final LayoutNode invoke() {
                        return aVar.invoke();
                    }
                });
            } else {
                pVarF.d();
            }
            p pVarB6 = Updater.b(pVarF);
            Updater.j(pVarB6, nVarM6, new yh.p<LayoutNode, n, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(@d LayoutNode set, @d n it) {
                    f0.p(set, "$this$set");
                    f0.p(it, "it");
                    Object objA = h1Var.a();
                    f0.m(objA);
                    ((ViewFactoryHolder) objA).setModifier(it);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, n nVar11) {
                    a(layoutNode, nVar11);
                    return b2.f124493a;
                }
            });
            Updater.j(pVarB6, eVar6, new yh.p<LayoutNode, s1.e, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(@d LayoutNode set, @d s1.e it) {
                    f0.p(set, "$this$set");
                    f0.p(it, "it");
                    Object objA = h1Var.a();
                    f0.m(objA);
                    ((ViewFactoryHolder) objA).setDensity(it);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, s1.e eVar7) {
                    a(layoutNode, eVar7);
                    return b2.f124493a;
                }
            });
            Updater.j(pVarB6, yVar6, new yh.p<LayoutNode, y, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(@d LayoutNode set, @d y it) {
                    f0.p(set, "$this$set");
                    f0.p(it, "it");
                    Object objA = h1Var.a();
                    f0.m(objA);
                    ((ViewFactoryHolder) objA).setLifecycleOwner(it);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, y yVar7) {
                    a(layoutNode, yVar7);
                    return b2.f124493a;
                }
            });
            Updater.j(pVarB6, dVar6, new yh.p<LayoutNode, androidx.savedstate.d, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(@d LayoutNode set, @d androidx.savedstate.d it) {
                    f0.p(set, "$this$set");
                    f0.p(it, "it");
                    Object objA = h1Var.a();
                    f0.m(objA);
                    ((ViewFactoryHolder) objA).setSavedStateRegistryOwner(it);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, androidx.savedstate.d dVar7) {
                    a(layoutNode, dVar7);
                    return b2.f124493a;
                }
            });
            Updater.j(pVarB6, lVar3, new yh.p<LayoutNode, l<? super T, ? extends b2>, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(@d LayoutNode set, @d l<? super T, b2> it) {
                    f0.p(set, "$this$set");
                    f0.p(it, "it");
                    ViewFactoryHolder<T> viewFactoryHolderA = h1Var.a();
                    f0.m(viewFactoryHolderA);
                    viewFactoryHolderA.setUpdateBlock(it);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, Object obj) {
                    a(layoutNode, (l) obj);
                    return b2.f124493a;
                }
            });
            Updater.j(pVarB6, layoutDirection6, new yh.p<LayoutNode, LayoutDirection, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$6

                /* JADX INFO: compiled from: AndroidView.android.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                public final /* synthetic */ class a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f17075a;

                    static {
                        int[] iArr = new int[LayoutDirection.values().length];
                        iArr[LayoutDirection.Ltr.ordinal()] = 1;
                        iArr[LayoutDirection.Rtl.ordinal()] = 2;
                        f17075a = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(@d LayoutNode set, @d LayoutDirection it) {
                    f0.p(set, "$this$set");
                    f0.p(it, "it");
                    Object objA = h1Var.a();
                    f0.m(objA);
                    ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) objA;
                    int i16 = a.f17075a[it.ordinal()];
                    int i17 = 1;
                    if (i16 == 1) {
                        i17 = 0;
                    } else if (i16 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    viewFactoryHolder.setLayoutDirection(i17);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, LayoutDirection layoutDirection7) {
                    a(layoutNode, layoutDirection7);
                    return b2.f124493a;
                }
            });
            pVarF.f();
            pVarF.c0();
            if (cVar != null) {
                EffectsKt.b(cVar, strValueOf, new l<androidx.compose.runtime.f0, e0>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3

                    /* JADX INFO: compiled from: Effects.kt */
                    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                    public static final class a implements e0 {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        final /* synthetic */ androidx.compose.runtime.saveable.c.a f17079a;

                        public a(androidx.compose.runtime.saveable.c.a aVar) {
                            this.f17079a = aVar;
                        }

                        @Override // androidx.compose.runtime.e0
                        public void dispose() {
                            this.f17079a.unregister();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // yh.l
                    @d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final e0 invoke(@d androidx.compose.runtime.f0 DisposableEffect) {
                        f0.p(DisposableEffect, "$this$DisposableEffect");
                        final h1<ViewFactoryHolder<T>> h1Var2 = h1Var;
                        return new a(cVar.b(strValueOf, new yh.a<SparseArray<Parcelable>>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$valueProvider$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final SparseArray<Parcelable> invoke() {
                                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                                Object objA = h1Var2.a();
                                f0.m(objA);
                                View typedView$ui_release = ((ViewFactoryHolder) objA).getTypedView$ui_release();
                                if (typedView$ui_release != null) {
                                    typedView$ui_release.saveHierarchyState(sparseArray);
                                }
                                return sparseArray;
                            }
                        }));
                    }
                }, pVarF, 8);
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar10;
            lVar4 = lVar3;
        } else {
            if (i15 != 0) {
                nVar3 = n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (i13 != 0) {
                lVar3 = f17060a;
            } else {
                lVar3 = lVar2;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1783766393, i10, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:81)");
            }
            final Context context7 = (Context) pVarF.K(AndroidCompositionLocals_androidKt.g());
            pVarF.T(-492369756);
            objU = pVarF.U();
            companion = p.INSTANCE;
            if (objU == companion.a()) {
                objU = new a();
                pVarF.N(objU);
            }
            pVarF.c0();
            a aVar8 = (a) objU;
            pVarF.T(-492369756);
            objU2 = pVarF.U();
            if (objU2 == companion.a()) {
                objU2 = new NestedScrollDispatcher();
                pVarF.N(objU2);
            }
            pVarF.c0();
            final NestedScrollDispatcher nestedScrollDispatcher7 = (NestedScrollDispatcher) objU2;
            n nVarM7 = ComposedModifierKt.m(pVarF, SemanticsModifierKt.b(nVar3.s0(NestedScrollModifierKt.a(n.INSTANCE, aVar8, nestedScrollDispatcher7)), true, new l<r, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$modifierWithSemantics$1
                public final void a(@d r semantics) {
                    f0.p(semantics, "$this$semantics");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(r rVar) {
                    a(rVar);
                    return b2.f124493a;
                }
            }));
            s1.e eVar7 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection7 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            final androidx.compose.runtime.r rVarU7 = ComposablesKt.u(pVarF, 0);
            cVar = (androidx.compose.runtime.saveable.c) pVarF.K(SaveableStateRegistryKt.b());
            strValueOf = String.valueOf(ComposablesKt.j(pVarF, 0));
            pVarF.T(-492369756);
            objU3 = pVarF.U();
            if (objU3 == companion.a()) {
                objU3 = new h1();
                pVarF.N(objU3);
            }
            pVarF.c0();
            h1Var = (h1) objU3;
            y yVar7 = (y) pVarF.K(AndroidCompositionLocals_androidKt.i());
            androidx.savedstate.d dVar7 = (androidx.savedstate.d) pVarF.K(AndroidCompositionLocals_androidKt.j());
            n nVar11 = nVar3;
            aVar = new yh.a<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // yh.a
                @d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final LayoutNode invoke() {
                    View typedView$ui_release;
                    ViewFactoryHolder viewFactoryHolder = new ViewFactoryHolder(context7, rVarU7, nestedScrollDispatcher7);
                    viewFactoryHolder.setFactory(factory);
                    androidx.compose.runtime.saveable.c cVar2 = cVar;
                    Object objE = cVar2 != null ? cVar2.e(strValueOf) : null;
                    SparseArray<Parcelable> sparseArray = objE instanceof SparseArray ? (SparseArray) objE : null;
                    if (sparseArray != null && (typedView$ui_release = viewFactoryHolder.getTypedView$ui_release()) != null) {
                        typedView$ui_release.restoreHierarchyState(sparseArray);
                    }
                    h1Var.b((ViewFactoryHolder<T>) viewFactoryHolder);
                    return viewFactoryHolder.getLayoutNode();
                }
            };
            pVarF.T(1886828752);
            if (!(pVarF.G() instanceof m1)) {
                ComposablesKt.n();
            }
            pVarF.J();
            if (pVarF.D()) {
                pVarF.L(new yh.a<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                    @Override // yh.a
                    @d
                    public final LayoutNode invoke() {
                        return aVar.invoke();
                    }
                });
            } else {
                pVarF.d();
            }
            p pVarB7 = Updater.b(pVarF);
            Updater.j(pVarB7, nVarM7, new yh.p<LayoutNode, n, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(@d LayoutNode set, @d n it) {
                    f0.p(set, "$this$set");
                    f0.p(it, "it");
                    Object objA = h1Var.a();
                    f0.m(objA);
                    ((ViewFactoryHolder) objA).setModifier(it);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, n nVar12) {
                    a(layoutNode, nVar12);
                    return b2.f124493a;
                }
            });
            Updater.j(pVarB7, eVar7, new yh.p<LayoutNode, s1.e, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(@d LayoutNode set, @d s1.e it) {
                    f0.p(set, "$this$set");
                    f0.p(it, "it");
                    Object objA = h1Var.a();
                    f0.m(objA);
                    ((ViewFactoryHolder) objA).setDensity(it);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, s1.e eVar8) {
                    a(layoutNode, eVar8);
                    return b2.f124493a;
                }
            });
            Updater.j(pVarB7, yVar7, new yh.p<LayoutNode, y, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(@d LayoutNode set, @d y it) {
                    f0.p(set, "$this$set");
                    f0.p(it, "it");
                    Object objA = h1Var.a();
                    f0.m(objA);
                    ((ViewFactoryHolder) objA).setLifecycleOwner(it);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, y yVar8) {
                    a(layoutNode, yVar8);
                    return b2.f124493a;
                }
            });
            Updater.j(pVarB7, dVar7, new yh.p<LayoutNode, androidx.savedstate.d, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(@d LayoutNode set, @d androidx.savedstate.d it) {
                    f0.p(set, "$this$set");
                    f0.p(it, "it");
                    Object objA = h1Var.a();
                    f0.m(objA);
                    ((ViewFactoryHolder) objA).setSavedStateRegistryOwner(it);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, androidx.savedstate.d dVar8) {
                    a(layoutNode, dVar8);
                    return b2.f124493a;
                }
            });
            Updater.j(pVarB7, lVar3, new yh.p<LayoutNode, l<? super T, ? extends b2>, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(@d LayoutNode set, @d l<? super T, b2> it) {
                    f0.p(set, "$this$set");
                    f0.p(it, "it");
                    ViewFactoryHolder<T> viewFactoryHolderA = h1Var.a();
                    f0.m(viewFactoryHolderA);
                    viewFactoryHolderA.setUpdateBlock(it);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, Object obj) {
                    a(layoutNode, (l) obj);
                    return b2.f124493a;
                }
            });
            Updater.j(pVarB7, layoutDirection7, new yh.p<LayoutNode, LayoutDirection, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$6

                /* JADX INFO: compiled from: AndroidView.android.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                public final /* synthetic */ class a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f17075a;

                    static {
                        int[] iArr = new int[LayoutDirection.values().length];
                        iArr[LayoutDirection.Ltr.ordinal()] = 1;
                        iArr[LayoutDirection.Rtl.ordinal()] = 2;
                        f17075a = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(@d LayoutNode set, @d LayoutDirection it) {
                    f0.p(set, "$this$set");
                    f0.p(it, "it");
                    Object objA = h1Var.a();
                    f0.m(objA);
                    ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) objA;
                    int i16 = a.f17075a[it.ordinal()];
                    int i17 = 1;
                    if (i16 == 1) {
                        i17 = 0;
                    } else if (i16 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    viewFactoryHolder.setLayoutDirection(i17);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, LayoutDirection layoutDirection8) {
                    a(layoutNode, layoutDirection8);
                    return b2.f124493a;
                }
            });
            pVarF.f();
            pVarF.c0();
            if (cVar != null) {
                EffectsKt.b(cVar, strValueOf, new l<androidx.compose.runtime.f0, e0>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3

                    /* JADX INFO: compiled from: Effects.kt */
                    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                    public static final class a implements e0 {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        final /* synthetic */ androidx.compose.runtime.saveable.c.a f17079a;

                        public a(androidx.compose.runtime.saveable.c.a aVar) {
                            this.f17079a = aVar;
                        }

                        @Override // androidx.compose.runtime.e0
                        public void dispose() {
                            this.f17079a.unregister();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // yh.l
                    @d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final e0 invoke(@d androidx.compose.runtime.f0 DisposableEffect) {
                        f0.p(DisposableEffect, "$this$DisposableEffect");
                        final h1<ViewFactoryHolder<T>> h1Var2 = h1Var;
                        return new a(cVar.b(strValueOf, new yh.a<SparseArray<Parcelable>>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$valueProvider$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final SparseArray<Parcelable> invoke() {
                                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                                Object objA = h1Var2.a();
                                f0.m(objA);
                                View typedView$ui_release = ((ViewFactoryHolder) objA).getTypedView$ui_release();
                                if (typedView$ui_release != null) {
                                    typedView$ui_release.saveHierarchyState(sparseArray);
                                }
                                return sparseArray;
                            }
                        }));
                    }
                }, pVarF, 8);
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar11;
            lVar4 = lVar3;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<p, Integer, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@e p pVar2, int i16) {
                AndroidView_androidKt.a(factory, nVar4, lVar4, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @d
    public static final l<View, b2> b() {
        return f17060a;
    }
}
