package androidx.compose.foundation.text.selection;

import android.annotation.SuppressLint;
import androidx.compose.foundation.c0;
import androidx.compose.ui.ComposedModifierKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TextFieldSelectionManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\"\u0018\u0010\b\u001a\u00020\u0005*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/n;", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "b", "Landroidx/compose/ui/input/pointer/p;", "", ak.av, "(Landroidx/compose/ui/input/pointer/p;)Z", "isShiftPressed", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class TextFieldSelectionManager_androidKt {
    public static final boolean a(@dl.d androidx.compose.ui.input.pointer.p pVar) {
        f0.p(pVar, "<this>");
        return false;
    }

    @dl.d
    @SuppressLint({"ModifierInspectorInfo"})
    public static final androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar, @dl.d TextFieldSelectionManager manager) {
        f0.p(nVar, "<this>");
        f0.p(manager, "manager");
        return !c0.INSTANCE.c().i() ? nVar : ComposedModifierKt.l(nVar, null, new TextFieldSelectionManager_androidKt$textFieldMagnifier$1(manager), 1, null);
    }
}
