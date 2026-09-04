package androidx.compose.ui.input.rotary;

import androidx.compose.ui.modifier.g;
import androidx.compose.ui.modifier.p;
import androidx.compose.ui.n;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import f1.b;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: RotaryInputModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a \u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0007\u001a \u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0007\u001a$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0001*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0003\".\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b0\n8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\t\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/n;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/rotary/a;", "", "onRotaryScrollEvent", "e", "onPreRotaryScrollEvent", "d", "Lf1/b;", ak.av, "Landroidx/compose/ui/modifier/p;", "Lf1/a;", "Landroidx/compose/ui/modifier/p;", "b", "()Landroidx/compose/ui/modifier/p;", "getModifierLocalRotaryScrollParent$annotations", "()V", "ModifierLocalRotaryScrollParent", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class RotaryInputModifierKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private static final p<f1.a<RotaryScrollEvent>> f14855a = g.a(new yh.a<f1.a<RotaryScrollEvent>>() { // from class: androidx.compose.ui.input.rotary.RotaryInputModifierKt$ModifierLocalRotaryScrollParent$1
        @Override // yh.a
        @e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f1.a<RotaryScrollEvent> invoke() {
            return null;
        }
    });

    @androidx.compose.ui.g
    private static final l<b, Boolean> a(final l<? super RotaryScrollEvent, Boolean> lVar) {
        return new l<b, Boolean>() { // from class: androidx.compose.ui.input.rotary.RotaryInputModifierKt$focusAwareCallback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // yh.l
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@d b e10) {
                f0.p(e10, "e");
                if (e10 instanceof RotaryScrollEvent) {
                    return lVar.invoke(e10);
                }
                throw new IllegalStateException("FocusAwareEvent is dispatched to the wrong FocusAwareParent.".toString());
            }
        };
    }

    @d
    public static final p<f1.a<RotaryScrollEvent>> b() {
        return f14855a;
    }

    @androidx.compose.ui.g
    public static /* synthetic */ void c() {
    }

    @androidx.compose.ui.g
    @d
    public static final n d(@d n nVar, @d final l<? super RotaryScrollEvent, Boolean> onPreRotaryScrollEvent) {
        f0.p(nVar, "<this>");
        f0.p(onPreRotaryScrollEvent, "onPreRotaryScrollEvent");
        l<x0, b2> lVarB = InspectableValueKt.e() ? new l<x0, b2>() { // from class: androidx.compose.ui.input.rotary.RotaryInputModifierKt$onPreRotaryScrollEvent$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("onPreRotaryScrollEvent");
                x0Var.getProperties().c("onPreRotaryScrollEvent", onPreRotaryScrollEvent);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b();
        n.Companion companion = n.INSTANCE;
        return InspectableValueKt.d(nVar, lVarB, new f1.a(null, a(onPreRotaryScrollEvent), f14855a));
    }

    @androidx.compose.ui.g
    @d
    public static final n e(@d n nVar, @d final l<? super RotaryScrollEvent, Boolean> onRotaryScrollEvent) {
        f0.p(nVar, "<this>");
        f0.p(onRotaryScrollEvent, "onRotaryScrollEvent");
        l<x0, b2> lVarB = InspectableValueKt.e() ? new l<x0, b2>() { // from class: androidx.compose.ui.input.rotary.RotaryInputModifierKt$onRotaryScrollEvent$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("onRotaryScrollEvent");
                x0Var.getProperties().c("onRotaryScrollEvent", onRotaryScrollEvent);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b();
        n.Companion companion = n.INSTANCE;
        return InspectableValueKt.d(nVar, lVarB, new f1.a(a(onRotaryScrollEvent), null, f14855a));
    }
}
