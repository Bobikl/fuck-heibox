package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteCursor;
import android.os.Build;
import androidx.annotation.n0;
import androidx.annotation.u;
import androidx.annotation.w0;

/* JADX INFO: compiled from: SQLiteCursorCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: compiled from: SQLiteCursorCompat.java */
    @w0(28)
    public static class a {
        private a() {
        }

        @u
        static void a(SQLiteCursor sQLiteCursor, boolean z10) {
            sQLiteCursor.setFillWindowForwardOnly(z10);
        }
    }

    private b() {
    }

    public static void a(@n0 SQLiteCursor sQLiteCursor, boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            a.a(sQLiteCursor, z10);
        }
    }
}
