package androidx.compose.ui.text.input;

import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: InputEventCallback.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.k(message = "This function is not being used by any APIs. API is now deprecated and will be removed")
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u001d\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/input/r;", "", "", "Landroidx/compose/ui/text/input/g;", "editCommands", "Lkotlin/b2;", "b", "Landroidx/compose/ui/text/input/o;", "imeAction", ak.av, "(I)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public interface r {
    void a(int imeAction);

    void b(@dl.d List<? extends g> list);
}
