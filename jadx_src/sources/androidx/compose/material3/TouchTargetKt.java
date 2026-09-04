package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: TouchTarget.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\f\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000\"&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0004\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/ui/n;", ak.aF, "Landroidx/compose/runtime/j1;", "", ak.av, "Landroidx/compose/runtime/j1;", "()Landroidx/compose/runtime/j1;", "getLocalMinimumTouchTargetEnforcement$annotations", "()V", "LocalMinimumTouchTargetEnforcement", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class TouchTargetKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.j1<Boolean> f11742a = CompositionLocalKt.e(new yh.a<Boolean>() { // from class: androidx.compose.material3.TouchTargetKt$LocalMinimumTouchTargetEnforcement$1
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    });

    @w
    @dl.d
    public static final androidx.compose.runtime.j1<Boolean> a() {
        return f11742a;
    }

    @w
    public static /* synthetic */ void b() {
    }

    @dl.d
    public static final androidx.compose.ui.n c(@dl.d androidx.compose.ui.n nVar) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, kotlin.b2>() { // from class: androidx.compose.material3.TouchTargetKt$minimumTouchTargetSize$$inlined$debugInspectorInfo$1
            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("minimumTouchTargetSize");
                x0Var.getProperties().c("README", "Adds outer padding to measure at least 48.dp (default) in size to disambiguate touch interactions if the element would measure smaller");
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return kotlin.b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.material3.TouchTargetKt$minimumTouchTargetSize$2
            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(-1937671640);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1937671640, i10, -1, "androidx.compose.material3.minimumTouchTargetSize.<anonymous> (TouchTarget.kt:42)");
                }
                androidx.compose.ui.n minimumTouchTargetModifier = ((Boolean) pVar.K(TouchTargetKt.a())).booleanValue() ? new MinimumTouchTargetModifier(((androidx.compose.ui.platform.d2) pVar.K(CompositionLocalsKt.u())).e(), null) : androidx.compose.ui.n.INSTANCE;
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return minimumTouchTargetModifier;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }
}
