package kotlin;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes5.dex */
public class o {
    @u0(version = "1.1")
    @sh.e
    public static final void a(@dl.d Throwable th2, @dl.d Throwable exception) throws IllegalAccessException, InvocationTargetException {
        kotlin.jvm.internal.f0.p(th2, "<this>");
        kotlin.jvm.internal.f0.p(exception, "exception");
        if (th2 != exception) {
            sh.m.f139400a.a(th2, exception);
        }
    }

    @dl.d
    public static final StackTraceElement[] b(@dl.d Throwable th2) {
        kotlin.jvm.internal.f0.p(th2, "<this>");
        StackTraceElement[] stackTrace = th2.getStackTrace();
        kotlin.jvm.internal.f0.m(stackTrace);
        return stackTrace;
    }

    public static /* synthetic */ void c(Throwable th2) {
    }

    @dl.d
    public static final List<Throwable> d(@dl.d Throwable th2) {
        kotlin.jvm.internal.f0.p(th2, "<this>");
        return sh.m.f139400a.d(th2);
    }

    @u0(version = "1.4")
    public static /* synthetic */ void e(Throwable th2) {
    }

    @sh.f
    private static final void f(Throwable th2) {
        kotlin.jvm.internal.f0.p(th2, "<this>");
        th2.printStackTrace();
    }

    @sh.f
    private static final void g(Throwable th2, PrintStream stream) {
        kotlin.jvm.internal.f0.p(th2, "<this>");
        kotlin.jvm.internal.f0.p(stream, "stream");
        th2.printStackTrace(stream);
    }

    @sh.f
    private static final void h(Throwable th2, PrintWriter writer) {
        kotlin.jvm.internal.f0.p(th2, "<this>");
        kotlin.jvm.internal.f0.p(writer, "writer");
        th2.printStackTrace(writer);
    }

    @u0(version = "1.4")
    @dl.d
    public static final String i(@dl.d Throwable th2) {
        kotlin.jvm.internal.f0.p(th2, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        kotlin.jvm.internal.f0.o(string, "sw.toString()");
        return string;
    }
}
