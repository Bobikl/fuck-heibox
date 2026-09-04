package m4;

import android.content.Context;
import android.os.SystemClock;
import x5.b;
import z5.e;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f131442a;

    /* JADX INFO: renamed from: m4.a$a, reason: collision with other inner class name */
    public interface InterfaceC1200a {
        void a(String str);
    }

    public static boolean a(Context context) {
        try {
            b.e().b(context);
            long jElapsedRealtime = SystemClock.elapsedRealtime() / 1000;
            if (jElapsedRealtime - f131442a < 600) {
                return false;
            }
            f131442a = jElapsedRealtime;
            h5.a.a(context);
            return true;
        } catch (Exception e10) {
            e.d(e10);
            return false;
        }
    }

    public static void b(InterfaceC1200a interfaceC1200a) {
        e.e(interfaceC1200a);
    }
}
