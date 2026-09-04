package n7;

import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f132020a = "DOS:";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f132021b = false;

    public static void a(String str, String str2) {
        if (f132021b) {
            Log.d(f132020a + str, str2);
        }
    }

    public static void b(String str, String str2, Throwable th2) {
        if (f132021b) {
            Log.d(f132020a + str, str2, th2);
        }
    }

    public static void c(String str, String str2) {
        if (f132021b) {
            Log.i(f132020a + str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        if (f132021b) {
            Log.i(f132020a + str, str2, th2);
        }
    }

    public static void e(String str, String str2) {
        Log.w(f132020a + str, str2);
    }

    public static void f(String str, String str2, Throwable th2) {
        Log.w(f132020a + str, str2, th2);
    }
}
