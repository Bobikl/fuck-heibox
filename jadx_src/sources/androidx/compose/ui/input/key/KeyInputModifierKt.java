package androidx.compose.ui.input.key;

import androidx.compose.ui.modifier.g;
import androidx.compose.ui.modifier.p;
import androidx.compose.ui.n;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: KeyInputModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001ø\u0001\u0000\u001a!\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001ø\u0001\u0000\"\"\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/n;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/b;", "", "onKeyEvent", "b", "onPreviewKeyEvent", ak.aF, "Landroidx/compose/ui/modifier/p;", "Landroidx/compose/ui/input/key/e;", ak.av, "Landroidx/compose/ui/modifier/p;", "()Landroidx/compose/ui/modifier/p;", "ModifierLocalKeyInput", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class KeyInputModifierKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final p<e> f14452a = g.a(new yh.a<e>() { // from class: androidx.compose.ui.input.key.KeyInputModifierKt$ModifierLocalKeyInput$1
        @Override // yh.a
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e invoke() {
            return null;
        }
    });

    @dl.d
    public static final p<e> a() {
        return f14452a;
    }

    @dl.d
    public static final n b(@dl.d n nVar, @dl.d final l<? super b, Boolean> onKeyEvent) {
        f0.p(nVar, "<this>");
        f0.p(onKeyEvent, "onKeyEvent");
        l<x0, b2> lVarB = InspectableValueKt.e() ? new l<x0, b2>() { // from class: androidx.compose.ui.input.key.KeyInputModifierKt$onKeyEvent$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("onKeyEvent");
                x0Var.getProperties().c("onKeyEvent", onKeyEvent);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b();
        n.Companion companion = n.INSTANCE;
        return InspectableValueKt.d(nVar, lVarB, new e(onKeyEvent, null));
    }

    @dl.d
    public static final n c(@dl.d n nVar, @dl.d final l<? super b, Boolean> onPreviewKeyEvent) {
        f0.p(nVar, "<this>");
        f0.p(onPreviewKeyEvent, "onPreviewKeyEvent");
        l<x0, b2> lVarB = InspectableValueKt.e() ? new l<x0, b2>() { // from class: androidx.compose.ui.input.key.KeyInputModifierKt$onPreviewKeyEvent$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("onPreviewKeyEvent");
                x0Var.getProperties().c("onPreviewKeyEvent", onPreviewKeyEvent);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b();
        n.Companion companion = n.INSTANCE;
        return InspectableValueKt.d(nVar, lVarB, new e(null, onPreviewKeyEvent));
    }
}
