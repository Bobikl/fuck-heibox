package org.apache.tools.ant;

import com.meituan.robust.Constants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.StringReader;
import java.text.DateFormat;
import java.util.Date;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* JADX INFO: compiled from: DefaultLogger.java */
/* JADX INFO: loaded from: classes5.dex */
public class y implements l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f137110g = 12;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    protected static final String f137111h = org.apache.tools.ant.util.j2.f136853f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected PrintStream f137112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected PrintStream f137113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f137114d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f137115e = System.currentTimeMillis();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f137116f = false;

    protected static String c(long j10) {
        return org.apache.tools.ant.util.d0.g(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g() {
        return " ";
    }

    static void j(StringBuffer stringBuffer, Throwable th2, boolean z10) {
        boolean z11;
        Throwable cause;
        while (true) {
            z11 = th2 instanceof BuildException;
            if (z11 && (cause = th2.getCause()) != null) {
                String string = th2.toString();
                String string2 = cause.toString();
                if (!string.endsWith(string2)) {
                    break;
                }
                stringBuffer.append((CharSequence) string, 0, string.length() - string2.length());
                th2 = cause;
            } else {
                break;
            }
        }
        if (z10 || !z11) {
            stringBuffer.append(org.apache.tools.ant.util.j2.b(th2));
        } else {
            stringBuffer.append(String.format("%s%n", th2));
        }
    }

    @Override // org.apache.tools.ant.k
    public void B0(BuildEvent buildEvent) {
    }

    @Override // org.apache.tools.ant.k
    public void R0(BuildEvent buildEvent) {
        Throwable thA = buildEvent.a();
        StringBuffer stringBuffer = new StringBuffer();
        if (thA == null) {
            stringBuffer.append(String.format("%n%s", e()));
        } else {
            stringBuffer.append(String.format("%n%s%n", d()));
            j(stringBuffer, thA, 3 <= this.f137114d);
        }
        stringBuffer.append(String.format("%nTotal time: %s", c(System.currentTimeMillis() - this.f137115e)));
        String string = stringBuffer.toString();
        if (thA == null) {
            i(string, this.f137112b, 3);
        } else {
            i(string, this.f137113c, 0);
        }
        h(string);
    }

    @Override // org.apache.tools.ant.l
    public void S(PrintStream printStream) {
        this.f137112b = new PrintStream((OutputStream) printStream, true);
    }

    @Override // org.apache.tools.ant.k
    public void V(BuildEvent buildEvent) {
        String str;
        int iC = buildEvent.c();
        if (iC <= this.f137114d) {
            StringBuilder sb2 = new StringBuilder();
            if (buildEvent.f() == null || this.f137116f) {
                sb2.append(buildEvent.b());
            } else {
                String str2 = Constants.ARRAY_TYPE + buildEvent.f().K1() + "] ";
                int length = 12 - str2.length();
                if (length > 0) {
                    str = ((String) Stream.generate(new Supplier() { // from class: org.apache.tools.ant.x
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return y.g();
                        }
                    }).limit(length).collect(Collectors.joining())) + str2;
                } else {
                    str = str2;
                }
                try {
                    BufferedReader bufferedReader = new BufferedReader(new StringReader(buildEvent.b()));
                    try {
                        sb2.append((String) bufferedReader.lines().collect(Collectors.joining(System.lineSeparator() + str, str, "")));
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (IOException unused) {
                    sb2.append(str2);
                    sb2.append(buildEvent.b());
                }
            }
            Throwable thA = buildEvent.a();
            if (4 <= this.f137114d && thA != null) {
                sb2.append(String.format("%n%s: ", thA.getClass().getSimpleName()));
                sb2.append(org.apache.tools.ant.util.j2.b(thA));
            }
            String string = sb2.toString();
            if (iC != 0) {
                i(string, this.f137112b, iC);
            } else {
                i(string, this.f137113c, iC);
            }
            h(string);
        }
    }

    protected String b(BuildEvent buildEvent) {
        Project projectD = buildEvent.d();
        if (projectD != null) {
            return projectD.r0();
        }
        return null;
    }

    protected String d() {
        return "BUILD FAILED";
    }

    protected String e() {
        return "BUILD SUCCESSFUL";
    }

    protected String f() {
        return DateFormat.getDateTimeInstance(3, 3).format(new Date(System.currentTimeMillis()));
    }

    protected void h(String str) {
    }

    @Override // org.apache.tools.ant.k
    public void h0(BuildEvent buildEvent) {
    }

    protected void i(String str, PrintStream printStream, int i10) {
        printStream.println(str);
    }

    @Override // org.apache.tools.ant.k
    public void i0(BuildEvent buildEvent) {
        this.f137115e = System.currentTimeMillis();
    }

    @Override // org.apache.tools.ant.l
    public void m(boolean z10) {
        this.f137116f = z10;
    }

    @Override // org.apache.tools.ant.l
    public void m1(PrintStream printStream) {
        this.f137113c = new PrintStream((OutputStream) printStream, true);
    }

    @Override // org.apache.tools.ant.k
    public void r1(BuildEvent buildEvent) {
        if (2 > this.f137114d || buildEvent.e().k().isEmpty()) {
            return;
        }
        String str = String.format("%n%s:", buildEvent.e().k());
        i(str, this.f137112b, buildEvent.c());
        h(str);
    }

    @Override // org.apache.tools.ant.k
    public void s0(BuildEvent buildEvent) {
    }

    @Override // org.apache.tools.ant.l
    public void w0(int i10) {
        this.f137114d = i10;
    }
}
