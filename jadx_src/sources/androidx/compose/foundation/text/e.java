package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.core.app.o0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: KeyMapping.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/e;", "", "Landroidx/compose/ui/input/key/b;", o0.I0, "Landroidx/compose/foundation/text/KeyCommand;", ak.av, "(Landroid/view/KeyEvent;)Landroidx/compose/foundation/text/KeyCommand;", "foundation_release"}, k = 1, mv = {1, 7, 1})
public interface e {
    @dl.e
    KeyCommand a(@dl.d KeyEvent event);
}
