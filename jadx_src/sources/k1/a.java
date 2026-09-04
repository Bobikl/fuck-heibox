package k1;

import androidx.compose.ui.state.ToggleableState;
import com.umeng.analytics.pro.ak;
import dl.d;
import kotlin.Metadata;

/* JADX INFO: compiled from: ToggleableState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"", "value", "Landroidx/compose/ui/state/ToggleableState;", ak.av, "ui_release"}, k = 2, mv = {1, 7, 1})
public final class a {
    @d
    public static final ToggleableState a(boolean z10) {
        return z10 ? ToggleableState.On : ToggleableState.Off;
    }
}
