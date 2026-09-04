package hj;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;

/* JADX INFO: compiled from: Log4a.java */
/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static me.pqpo.librarylog4a.logger.c f119195a = new me.pqpo.librarylog4a.logger.a();

    public static void a(String str, String str2) {
        i(3, str, str2);
    }

    public static void b(String str, String str2) {
        i(6, str, str2);
    }

    public static void c(String str, String str2, Throwable th2) {
        i(6, str, str2 + "\n" + g(th2));
    }

    public static void d(String str, Throwable th2) {
        i(6, str, g(th2));
    }

    public static void e() {
        me.pqpo.librarylog4a.logger.c cVar = f119195a;
        if (cVar != null) {
            cVar.flush();
        }
    }

    public static me.pqpo.librarylog4a.logger.c f() {
        return f119195a;
    }

    public static String g(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
            if (cause instanceof UnknownHostException) {
                return "";
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    public static void h(String str, String str2) {
        i(4, str, str2);
    }

    public static void i(int i10, String str, String str2) {
        me.pqpo.librarylog4a.logger.c cVar = f119195a;
        if (cVar != null) {
            cVar.a(i10, str, str2);
        }
    }

    public static void j() {
        me.pqpo.librarylog4a.logger.c cVar = f119195a;
        if (cVar != null) {
            cVar.release();
        }
        f119195a = null;
    }

    public static void k(me.pqpo.librarylog4a.logger.c cVar) {
        f119195a = cVar;
    }

    public static void l(String str, String str2) {
        i(2, str, str2);
    }

    public static void m(String str, String str2) {
        i(5, str, str2);
    }

    public static void n(String str, String str2, Throwable th2) {
        i(5, str, str2 + "\n" + g(th2));
    }

    public static void o(String str, Throwable th2) {
        i(5, str, g(th2));
    }
}
