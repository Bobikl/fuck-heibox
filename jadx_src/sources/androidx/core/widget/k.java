package androidx.core.widget;

import android.view.View;
import android.widget.ListPopupWindow;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: ListPopupWindowCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: compiled from: ListPopupWindowCompat.java */
    @w0(19)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static View.OnTouchListener a(ListPopupWindow listPopupWindow, View view) {
            return listPopupWindow.createDragToOpenListener(view);
        }
    }

    private k() {
    }

    @p0
    public static View.OnTouchListener a(@n0 ListPopupWindow listPopupWindow, @n0 View view) {
        return a.a(listPopupWindow, view);
    }

    @Deprecated
    public static View.OnTouchListener b(Object obj, View view) {
        return a((ListPopupWindow) obj, view);
    }
}
