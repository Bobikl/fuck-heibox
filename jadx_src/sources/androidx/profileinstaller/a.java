package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.annotation.n0;
import androidx.annotation.w0;
import java.io.File;

/* JADX INFO: compiled from: BenchmarkOperation.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: androidx.profileinstaller.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BenchmarkOperation.java */
    @w0(api = 21)
    public static class C0209a {
        private C0209a() {
        }

        static File a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    /* JADX INFO: compiled from: BenchmarkOperation.java */
    @w0(api = 24)
    public static class b {
        private b() {
        }

        static File a(Context context) {
            return context.createDeviceProtectedStorageContext().getCodeCacheDir();
        }
    }

    private a() {
    }

    static boolean a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z10 = true;
        for (File file2 : fileArrListFiles) {
            z10 = a(file2) && z10;
        }
        return z10;
    }

    static void b(@n0 Context context, @n0 ProfileInstallReceiver.a aVar) {
        if (a(Build.VERSION.SDK_INT >= 24 ? b.a(context) : C0209a.a(context))) {
            aVar.a(14, null);
        } else {
            aVar.a(15, null);
        }
    }
}
