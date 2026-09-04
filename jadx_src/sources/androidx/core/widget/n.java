package androidx.core.widget;

import android.view.View;
import android.widget.PopupMenu;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: PopupMenuCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: compiled from: PopupMenuCompat.java */
    @w0(19)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static View.OnTouchListener a(PopupMenu popupMenu) {
            return popupMenu.getDragToOpenListener();
        }
    }

    private n() {
    }

    @p0
    public static View.OnTouchListener a(@n0 Object obj) {
        return a.a((PopupMenu) obj);
    }
}
