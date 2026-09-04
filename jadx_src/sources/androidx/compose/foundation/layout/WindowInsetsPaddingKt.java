package androidx.compose.foundation.layout;

import androidx.compose.runtime.j2;
import androidx.compose.ui.platform.InspectableValueKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: WindowInsetsPadding.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0007\u001a/\u0010\u000e\u001a\u00020\u0000*\u00020\u00002!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\bH\u0007\" \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/n;", "Landroidx/compose/foundation/layout/h1;", "insets", "d", "b", "Landroidx/compose/foundation/layout/m0;", "paddingValues", ak.av, "Lkotlin/Function1;", "Lkotlin/m0;", "name", "consumedWindowInsets", "Lkotlin/b2;", "block", "e", "Landroidx/compose/ui/modifier/p;", "Landroidx/compose/ui/modifier/p;", ak.aF, "()Landroidx/compose/ui/modifier/p;", "ModifierLocalConsumedWindowInsets", "foundation-layout_release"}, k = 2, mv = {1, 7, 1})
public final class WindowInsetsPaddingKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.ui.modifier.p<h1> f6261a = androidx.compose.ui.modifier.g.a(new yh.a<h1>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$ModifierLocalConsumedWindowInsets$1
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h1 invoke() {
            return i1.a(0, 0, 0, 0);
        }
    });

    @t
    @j2
    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d final m0 paddingValues) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(paddingValues, "paddingValues");
        return nVar.s0(new n0(paddingValues, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$consumedWindowInsets$$inlined$debugInspectorInfo$2
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("consumedWindowInsets");
                x0Var.getProperties().c("paddingValues", paddingValues);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b()));
    }

    @t
    @j2
    @dl.d
    public static final androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar, @dl.d final h1 insets) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(insets, "insets");
        return nVar.s0(new e1(insets, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$consumedWindowInsets$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("consumedWindowInsets");
                x0Var.getProperties().c("insets", insets);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b()));
    }

    @dl.d
    public static final androidx.compose.ui.modifier.p<h1> c() {
        return f6261a;
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n d(@dl.d androidx.compose.ui.n nVar, @dl.d final h1 insets) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(insets, "insets");
        return nVar.s0(new InsetsPaddingModifier(insets, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$windowInsetsPadding$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("windowInsetsPadding");
                x0Var.getProperties().c("insets", insets);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b()));
    }

    @t
    @j2
    @dl.d
    public static final androidx.compose.ui.n e(@dl.d androidx.compose.ui.n nVar, @dl.d final yh.l<? super h1, b2> block) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(block, "block");
        return nVar.s0(new p(block, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$withConsumedWindowInsets$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("withConsumedWindowInsets");
                x0Var.getProperties().c("block", block);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b()));
    }
}
