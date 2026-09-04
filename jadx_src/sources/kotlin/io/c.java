package kotlin.io;

import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.jvm.internal.f0;
import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: Console.kt */
/* JADX INFO: loaded from: classes5.dex */
@xh.h(name = "ConsoleKt")
public final class c {
    @sh.f
    private static final void a(byte b10) {
        System.out.print(Byte.valueOf(b10));
    }

    @sh.f
    private static final void b(char c10) {
        System.out.print(c10);
    }

    @sh.f
    private static final void c(double d10) {
        System.out.print(d10);
    }

    @sh.f
    private static final void d(float f10) {
        System.out.print(f10);
    }

    @sh.f
    private static final void e(int i10) {
        System.out.print(i10);
    }

    @sh.f
    private static final void f(long j10) {
        System.out.print(j10);
    }

    @sh.f
    private static final void g(Object obj) {
        System.out.print(obj);
    }

    @sh.f
    private static final void h(short s10) {
        System.out.print(Short.valueOf(s10));
    }

    @sh.f
    private static final void i(boolean z10) {
        System.out.print(z10);
    }

    @sh.f
    private static final void j(char[] message) {
        f0.p(message, "message");
        System.out.print(message);
    }

    @sh.f
    private static final void k() {
        System.out.println();
    }

    @sh.f
    private static final void l(byte b10) {
        System.out.println(Byte.valueOf(b10));
    }

    @sh.f
    private static final void m(char c10) {
        System.out.println(c10);
    }

    @sh.f
    private static final void n(double d10) {
        System.out.println(d10);
    }

    @sh.f
    private static final void o(float f10) {
        System.out.println(f10);
    }

    @sh.f
    private static final void p(int i10) {
        System.out.println(i10);
    }

    @sh.f
    private static final void q(long j10) {
        System.out.println(j10);
    }

    @sh.f
    private static final void r(Object obj) {
        System.out.println(obj);
    }

    @sh.f
    private static final void s(short s10) {
        System.out.println(Short.valueOf(s10));
    }

    @sh.f
    private static final void t(boolean z10) {
        System.out.println(z10);
    }

    @sh.f
    private static final void u(char[] message) {
        f0.p(message, "message");
        System.out.println(message);
    }

    @dl.e
    public static final String v() {
        l lVar = l.f124775a;
        InputStream inputStream = System.in;
        f0.o(inputStream, "`in`");
        Charset charsetDefaultCharset = Charset.defaultCharset();
        f0.o(charsetDefaultCharset, "defaultCharset()");
        return lVar.d(inputStream, charsetDefaultCharset);
    }

    @u0(version = s0.f136930u)
    @dl.d
    public static final String w() {
        String strX = x();
        if (strX != null) {
            return strX;
        }
        throw new ReadAfterEOFException("EOF has already been reached");
    }

    @u0(version = s0.f136930u)
    @dl.e
    public static final String x() {
        return v();
    }
}
