package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.n0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: ListViewCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: compiled from: ListViewCompat.java */
    @w0(19)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static boolean a(ListView listView, int i10) {
            return listView.canScrollList(i10);
        }

        @androidx.annotation.u
        static void b(ListView listView, int i10) {
            listView.scrollListBy(i10);
        }
    }

    private m() {
    }

    public static boolean a(@n0 ListView listView, int i10) {
        return a.a(listView, i10);
    }

    public static void b(@n0 ListView listView, int i10) {
        a.b(listView, i10);
    }
}
