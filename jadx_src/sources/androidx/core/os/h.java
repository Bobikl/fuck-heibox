package androidx.core.os;

import android.os.Environment;
import androidx.annotation.w0;
import java.io.File;

/* JADX INFO: compiled from: EnvironmentCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f20974a = "EnvironmentCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f20975b = "unknown";

    /* JADX INFO: compiled from: EnvironmentCompat.java */
    @w0(19)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static String a(File file) {
            return Environment.getStorageState(file);
        }
    }

    /* JADX INFO: compiled from: EnvironmentCompat.java */
    @w0(21)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static String a(File file) {
            return Environment.getExternalStorageState(file);
        }
    }

    private h() {
    }

    @androidx.annotation.n0
    public static String a(@androidx.annotation.n0 File file) {
        return b.a(file);
    }
}
