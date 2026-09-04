package androidx.compose.ui.focus;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.s0;

/* JADX INFO: compiled from: FocusModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\u001a\f\u0010\u0002\u001a\u00020\u0000*\u00020\u0000H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\"\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u001a\u0010\u000e\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/n;", "b", ak.av, "Landroidx/compose/ui/focus/FocusModifier;", "focusModifier", ak.aF, "Landroidx/compose/ui/modifier/p;", "Landroidx/compose/ui/modifier/p;", "d", "()Landroidx/compose/ui/modifier/p;", "ModifierLocalParentFocusModifier", "Landroidx/compose/ui/n;", "e", "()Landroidx/compose/ui/n;", "ResetFocusModifierLocals", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class FocusModifierKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.ui.modifier.p<FocusModifier> f13515a = androidx.compose.ui.modifier.g.a(new yh.a<FocusModifier>() { // from class: androidx.compose.ui.focus.FocusModifierKt$ModifierLocalParentFocusModifier$1
        @Override // yh.a
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FocusModifier invoke() {
            return null;
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.ui.n f13516b = androidx.compose.ui.n.INSTANCE.s0(new a()).s0(new b()).s0(new c());

    /* JADX INFO: compiled from: FocusModifier.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"androidx/compose/ui/focus/FocusModifierKt$a", "Landroidx/compose/ui/modifier/m;", "Landroidx/compose/ui/focus/q;", "Landroidx/compose/ui/modifier/p;", "getKey", "()Landroidx/compose/ui/modifier/p;", "key", ak.av, "()Landroidx/compose/ui/focus/q;", "value", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements androidx.compose.ui.modifier.m<q> {
        a() {
        }

        @Override // androidx.compose.ui.modifier.m
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public q getValue() {
            return null;
        }

        @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
        public /* synthetic */ boolean a0(yh.l lVar) {
            return androidx.compose.ui.o.a(this, lVar);
        }

        @Override // androidx.compose.ui.modifier.m
        @dl.d
        public androidx.compose.ui.modifier.p<q> getKey() {
            return FocusPropertiesKt.c();
        }

        @Override // androidx.compose.ui.n
        public /* synthetic */ androidx.compose.ui.n s0(androidx.compose.ui.n nVar) {
            return androidx.compose.ui.m.a(this, nVar);
        }

        @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
        public /* synthetic */ boolean t(yh.l lVar) {
            return androidx.compose.ui.o.b(this, lVar);
        }

        @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
        public /* synthetic */ Object v(Object obj, yh.p pVar) {
            return androidx.compose.ui.o.d(this, obj, pVar);
        }

        @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
        public /* synthetic */ Object x(Object obj, yh.p pVar) {
            return androidx.compose.ui.o.c(this, obj, pVar);
        }
    }

    /* JADX INFO: compiled from: FocusModifier.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"androidx/compose/ui/focus/FocusModifierKt$b", "Landroidx/compose/ui/modifier/m;", "Landroidx/compose/ui/focus/e;", "Landroidx/compose/ui/modifier/p;", "getKey", "()Landroidx/compose/ui/modifier/p;", "key", ak.av, "()Landroidx/compose/ui/focus/e;", "value", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements androidx.compose.ui.modifier.m<e> {
        b() {
        }

        @Override // androidx.compose.ui.modifier.m
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e getValue() {
            return null;
        }

        @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
        public /* synthetic */ boolean a0(yh.l lVar) {
            return androidx.compose.ui.o.a(this, lVar);
        }

        @Override // androidx.compose.ui.modifier.m
        @dl.d
        public androidx.compose.ui.modifier.p<e> getKey() {
            return FocusEventModifierKt.a();
        }

        @Override // androidx.compose.ui.n
        public /* synthetic */ androidx.compose.ui.n s0(androidx.compose.ui.n nVar) {
            return androidx.compose.ui.m.a(this, nVar);
        }

        @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
        public /* synthetic */ boolean t(yh.l lVar) {
            return androidx.compose.ui.o.b(this, lVar);
        }

        @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
        public /* synthetic */ Object v(Object obj, yh.p pVar) {
            return androidx.compose.ui.o.d(this, obj, pVar);
        }

        @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
        public /* synthetic */ Object x(Object obj, yh.p pVar) {
            return androidx.compose.ui.o.c(this, obj, pVar);
        }
    }

    /* JADX INFO: compiled from: FocusModifier.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"androidx/compose/ui/focus/FocusModifierKt$c", "Landroidx/compose/ui/modifier/m;", "Landroidx/compose/ui/focus/u;", "Landroidx/compose/ui/modifier/p;", "getKey", "()Landroidx/compose/ui/modifier/p;", "key", ak.av, "()Landroidx/compose/ui/focus/u;", "value", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class c implements androidx.compose.ui.modifier.m<u> {
        c() {
        }

        @Override // androidx.compose.ui.modifier.m
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u getValue() {
            return null;
        }

        @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
        public /* synthetic */ boolean a0(yh.l lVar) {
            return androidx.compose.ui.o.a(this, lVar);
        }

        @Override // androidx.compose.ui.modifier.m
        @dl.d
        public androidx.compose.ui.modifier.p<u> getKey() {
            return FocusRequesterModifierKt.b();
        }

        @Override // androidx.compose.ui.n
        public /* synthetic */ androidx.compose.ui.n s0(androidx.compose.ui.n nVar) {
            return androidx.compose.ui.m.a(this, nVar);
        }

        @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
        public /* synthetic */ boolean t(yh.l lVar) {
            return androidx.compose.ui.o.b(this, lVar);
        }

        @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
        public /* synthetic */ Object v(Object obj, yh.p pVar) {
            return androidx.compose.ui.o.d(this, obj, pVar);
        }

        @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
        public /* synthetic */ Object x(Object obj, yh.p pVar) {
            return androidx.compose.ui.o.c(this, obj, pVar);
        }
    }

    @dl.d
    @kotlin.k(message = "Replaced by focusTarget", replaceWith = @s0(expression = "focusTarget()", imports = {"androidx.compose.ui.focus.focusTarget"}))
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar) {
        f0.p(nVar, "<this>");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.ui.focus.FocusModifierKt$focusModifier$$inlined$debugInspectorInfo$1
            public final void a(@dl.d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("focusModifier");
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.ui.focus.FocusModifierKt$focusModifier$2
            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                f0.p(composed, "$this$composed");
                pVar.T(-1810534337);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1810534337, i10, -1, "androidx.compose.ui.focus.focusModifier.<anonymous> (FocusModifier.kt:209)");
                }
                pVar.T(-492369756);
                Object objU = pVar.U();
                androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = new FocusModifier(FocusStateImpl.Inactive, null, 2, null);
                    pVar.N(objU);
                }
                pVar.c0();
                final FocusModifier focusModifier = (FocusModifier) objU;
                pVar.T(1157296644);
                boolean zS = pVar.s(focusModifier);
                Object objU2 = pVar.U();
                if (zS || objU2 == companion.a()) {
                    objU2 = new yh.a<b2>() { // from class: androidx.compose.ui.focus.FocusModifierKt$focusModifier$2$1$1
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
                            FocusTransactionsKt.m(focusModifier);
                        }
                    };
                    pVar.N(objU2);
                }
                pVar.c0();
                EffectsKt.k((yh.a) objU2, pVar, 0);
                androidx.compose.ui.n nVarC = FocusModifierKt.c(composed, focusModifier);
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
        });
    }

    @dl.d
    public static final androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar) {
        f0.p(nVar, "<this>");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.ui.focus.FocusModifierKt$focusTarget$$inlined$debugInspectorInfo$1
            public final void a(@dl.d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("focusTarget");
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.ui.focus.FocusModifierKt$focusTarget$2
            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                f0.p(composed, "$this$composed");
                pVar.T(-326009031);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-326009031, i10, -1, "androidx.compose.ui.focus.focusTarget.<anonymous> (FocusModifier.kt:194)");
                }
                pVar.T(-492369756);
                Object objU = pVar.U();
                androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = new FocusModifier(FocusStateImpl.Inactive, null, 2, null);
                    pVar.N(objU);
                }
                pVar.c0();
                final FocusModifier focusModifier = (FocusModifier) objU;
                pVar.T(1157296644);
                boolean zS = pVar.s(focusModifier);
                Object objU2 = pVar.U();
                if (zS || objU2 == companion.a()) {
                    objU2 = new yh.a<b2>() { // from class: androidx.compose.ui.focus.FocusModifierKt$focusTarget$2$1$1
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
                            FocusTransactionsKt.m(focusModifier);
                        }
                    };
                    pVar.N(objU2);
                }
                pVar.c0();
                EffectsKt.k((yh.a) objU2, pVar, 0);
                androidx.compose.ui.n nVarC = FocusModifierKt.c(composed, focusModifier);
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
        });
    }

    @dl.d
    public static final androidx.compose.ui.n c(@dl.d androidx.compose.ui.n nVar, @dl.d FocusModifier focusModifier) {
        f0.p(nVar, "<this>");
        f0.p(focusModifier, "focusModifier");
        return nVar.s0(focusModifier).s0(f13516b);
    }

    @dl.d
    public static final androidx.compose.ui.modifier.p<FocusModifier> d() {
        return f13515a;
    }

    @dl.d
    public static final androidx.compose.ui.n e() {
        return f13516b;
    }
}
