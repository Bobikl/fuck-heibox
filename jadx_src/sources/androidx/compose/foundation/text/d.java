package androidx.compose.foundation.text;

import android.view.KeyEvent;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: KeyEventHelpers.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\b\u0010\u0005\u001a\u00020\u0004H\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/input/key/b;", "", ak.av, "(Landroid/view/KeyEvent;)Z", "Lkotlin/b2;", "b", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class d {
    public static final boolean a(@dl.d KeyEvent cancelsTextSelection) {
        f0.p(cancelsTextSelection, "$this$cancelsTextSelection");
        return cancelsTextSelection.getKeyCode() == 4 && androidx.compose.ui.input.key.c.g(androidx.compose.ui.input.key.d.b(cancelsTextSelection), androidx.compose.ui.input.key.c.INSTANCE.b());
    }

    public static final void b() {
    }
}
