package androidx.core.database;

import android.database.CursorWindow;
import android.os.Build;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.w0;

/* JADX INFO: compiled from: CursorWindowCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: compiled from: CursorWindowCompat.java */
    @w0(15)
    public static class a {
        private a() {
        }

        @u
        static CursorWindow a(String str) {
            return new CursorWindow(str);
        }
    }

    /* JADX INFO: renamed from: androidx.core.database.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CursorWindowCompat.java */
    @w0(28)
    public static class C0129b {
        private C0129b() {
        }

        @u
        static CursorWindow a(String str, long j10) {
            return new CursorWindow(str, j10);
        }
    }

    private b() {
    }

    @n0
    public static CursorWindow a(@p0 String str, long j10) {
        return Build.VERSION.SDK_INT >= 28 ? C0129b.a(str, j10) : a.a(str);
    }
}
