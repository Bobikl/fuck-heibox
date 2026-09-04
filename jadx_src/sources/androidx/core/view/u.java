package androidx.core.view;

import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;

/* JADX INFO: compiled from: MenuCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: compiled from: MenuCompat.java */
    @androidx.annotation.w0(28)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(Menu menu, boolean z10) {
            menu.setGroupDividerEnabled(z10);
        }
    }

    private u() {
    }

    public static void a(@androidx.annotation.n0 Menu menu, boolean z10) {
        if (menu instanceof y1.a) {
            ((y1.a) menu).setGroupDividerEnabled(z10);
        } else if (Build.VERSION.SDK_INT >= 28) {
            a.a(menu, z10);
        }
    }

    @Deprecated
    public static void b(MenuItem menuItem, int i10) {
        menuItem.setShowAsAction(i10);
    }
}
