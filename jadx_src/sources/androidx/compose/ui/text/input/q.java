package androidx.compose.ui.text.input;

import android.view.KeyEvent;
import androidx.core.app.o0;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: InputEventCallback2.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u001d\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH&J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH&ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/input/q;", "", "", "Landroidx/compose/ui/text/input/g;", "editCommands", "Lkotlin/b2;", "b", "Landroidx/compose/ui/text/input/o;", "imeAction", ak.av, "(I)V", "Landroid/view/KeyEvent;", o0.I0, ak.aF, "Landroidx/compose/ui/text/input/c0;", "ic", "d", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface q {
    void a(int imeAction);

    void b(@dl.d List<? extends g> list);

    void c(@dl.d KeyEvent keyEvent);

    void d(@dl.d c0 c0Var);
}
