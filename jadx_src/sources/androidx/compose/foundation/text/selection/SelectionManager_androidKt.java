package androidx.compose.foundation.text.selection;

import android.annotation.SuppressLint;
import android.view.KeyEvent;
import androidx.compose.foundation.c0;
import androidx.compose.ui.ComposedModifierKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SelectionManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0014\u0010\b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Landroidx/compose/ui/input/key/b;", "keyEvent", "", ak.av, "(Landroid/view/KeyEvent;)Z", "Landroidx/compose/ui/n;", "Landroidx/compose/foundation/text/selection/SelectionManager;", "manager", "b", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class SelectionManager_androidKt {
    public static final boolean a(@dl.d KeyEvent keyEvent) {
        f0.p(keyEvent, "keyEvent");
        return false;
    }

    @dl.d
    @SuppressLint({"ModifierInspectorInfo"})
    public static final androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar, @dl.d SelectionManager manager) {
        f0.p(nVar, "<this>");
        f0.p(manager, "manager");
        return !c0.INSTANCE.c().i() ? nVar : ComposedModifierKt.l(nVar, null, new SelectionManager_androidKt$selectionMagnifier$1(manager), 1, null);
    }
}
