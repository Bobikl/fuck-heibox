package pl.droidsonroids.gif;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.n0;

/* JADX INFO: compiled from: LibraryLoader.java */
/* JADX INFO: loaded from: classes5.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f138392a = "pl_droidsonroids_gif";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static Context f138393b;

    private m() {
    }

    private static Context a() {
        if (f138393b == null) {
            try {
                f138393b = (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception e10) {
                throw new IllegalStateException("LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes.", e10);
            }
        }
        return f138393b;
    }

    public static void b(@n0 Context context) {
        f138393b = context.getApplicationContext();
    }

    static void c() {
        try {
            System.loadLibrary(f138392a);
        } catch (UnsatisfiedLinkError unused) {
            com.getkeepsafe.relinker.d.b(a(), f138392a);
        }
    }
}
