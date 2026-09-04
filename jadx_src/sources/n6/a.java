package n6;

import com.apm.lite.CrashType;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f132018a;

    private a() {
    }

    public static a a() {
        if (f132018a == null) {
            synchronized (a.class) {
                if (f132018a == null) {
                    f132018a = new a();
                }
            }
        }
        return f132018a;
    }

    public void b(CrashType crashType, long j10, String str) {
    }

    public void c(String str) {
    }

    public void d() {
    }
}
