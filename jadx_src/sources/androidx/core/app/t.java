package androidx.core.app;

import android.app.Dialog;
import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: DialogCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: compiled from: DialogCompat.java */
    @androidx.annotation.w0(28)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static <T> T a(Dialog dialog, int i10) {
            return (T) dialog.requireViewById(i10);
        }
    }

    private t() {
    }

    @androidx.annotation.n0
    public static View a(@androidx.annotation.n0 Dialog dialog, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) a.a(dialog, i10);
        }
        View viewFindViewById = dialog.findViewById(i10);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
    }
}
