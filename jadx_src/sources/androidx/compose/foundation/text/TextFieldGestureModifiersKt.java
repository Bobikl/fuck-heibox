package androidx.compose.foundation.text;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TextFieldGestureModifiers.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a:\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0000\u001a\u001c\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/n;", "Landroidx/compose/foundation/text/r;", "observer", "", "enabled", ak.av, "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "Landroidx/compose/foundation/interaction/g;", "interactionSource", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/v;", "Lkotlin/b2;", "onFocusChanged", ak.aF, "Landroidx/compose/foundation/text/selection/e;", "b", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class TextFieldGestureModifiersKt {
    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d r observer, boolean z10) {
        f0.p(nVar, "<this>");
        f0.p(observer, "observer");
        return z10 ? SuspendingPointerInputFilterKt.c(nVar, observer, new TextFieldGestureModifiersKt$longPressDragGestureFilter$1(observer, null)) : nVar;
    }

    @dl.d
    public static final androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar, @dl.d androidx.compose.foundation.text.selection.e observer, boolean z10) {
        f0.p(nVar, "<this>");
        f0.p(observer, "observer");
        return z10 ? SuspendingPointerInputFilterKt.c(androidx.compose.ui.n.INSTANCE, observer, new TextFieldGestureModifiersKt$mouseDragGestureDetector$1(observer, null)) : nVar;
    }

    @dl.d
    public static final androidx.compose.ui.n c(@dl.d androidx.compose.ui.n nVar, boolean z10, @dl.d FocusRequester focusRequester, @dl.e androidx.compose.foundation.interaction.g gVar, @dl.d yh.l<? super androidx.compose.ui.focus.v, b2> onFocusChanged) {
        f0.p(nVar, "<this>");
        f0.p(focusRequester, "focusRequester");
        f0.p(onFocusChanged, "onFocusChanged");
        return FocusableKt.c(FocusChangedModifierKt.a(FocusRequesterModifierKt.a(nVar, focusRequester), onFocusChanged), z10, gVar);
    }
}
