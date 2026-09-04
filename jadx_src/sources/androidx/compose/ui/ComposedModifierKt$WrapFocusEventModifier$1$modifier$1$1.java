package androidx.compose.ui;

import androidx.compose.ui.focus.v;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ComposedModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final /* synthetic */ class ComposedModifierKt$WrapFocusEventModifier$1$modifier$1$1 extends FunctionReferenceImpl implements yh.l<v, b2> {
    ComposedModifierKt$WrapFocusEventModifier$1$modifier$1$1(Object obj) {
        super(1, obj, androidx.compose.ui.focus.d.class, "onFocusEvent", "onFocusEvent(Landroidx/compose/ui/focus/FocusState;)V", 0);
    }

    public final void i(@dl.d v p10) {
        f0.p(p10, "p0");
        ((androidx.compose.ui.focus.d) this.receiver).R0(p10);
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ b2 invoke(v vVar) {
        i(vVar);
        return b2.f124493a;
    }
}
