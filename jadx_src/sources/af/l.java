package af;

import android.view.View;
import android.widget.PopupWindow;
import kotlinx.coroutines.flow.u;

/* JADX INFO: compiled from: PopUpMenu.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface l {
    void c(@dl.d View view);

    @dl.d
    u<Integer> getMenuPopState();

    @dl.e
    PopupWindow getPopupMenuWindow();

    void h(@dl.d View view);

    void r();

    void setPopupMenuWindow(@dl.e PopupWindow popupWindow);
}
