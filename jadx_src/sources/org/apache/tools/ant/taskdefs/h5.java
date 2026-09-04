package org.apache.tools.ant.taskdefs;

import com.meituan.robust.Constants;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Paths;
import org.apache.tools.ant.BuildEvent;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: RecorderEntry.java */
/* JADX INFO: loaded from: classes5.dex */
public class h5 implements org.apache.tools.ant.l, org.apache.tools.ant.q2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f134237b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f134241f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Project f134243h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f134238c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f134239d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private PrintStream f134240e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f134242g = false;

    protected h5(String str) {
        this.f134237b = null;
        this.f134241f = 0L;
        this.f134241f = System.currentTimeMillis();
        this.f134237b = str;
    }

    private void c() {
        PrintStream printStream;
        if (!this.f134238c || (printStream = this.f134240e) == null) {
            return;
        }
        printStream.flush();
    }

    private static String d(long j10) {
        long j11 = j10 / 1000;
        long j12 = j11 / 60;
        if (j12 <= 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Long.toString(j11));
            sb2.append(" second");
            sb2.append(j11 % 60 != 1 ? ak.aB : "");
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(Long.toString(j12));
        sb3.append(" minute");
        sb3.append(j12 == 1 ? " " : "s ");
        long j13 = j11 % 60;
        sb3.append(Long.toString(j13));
        sb3.append(" second");
        sb3.append(j13 != 1 ? ak.aB : "");
        return sb3.toString();
    }

    private void g(String str, int i10) {
        PrintStream printStream;
        if (!this.f134238c || i10 > this.f134239d || (printStream = this.f134240e) == null) {
            return;
        }
        printStream.println(str);
    }

    private void i(boolean z10) throws BuildException {
        if (this.f134240e == null) {
            try {
                this.f134240e = new PrintStream(org.apache.tools.ant.util.j0.h0(Paths.get(this.f134237b, new String[0]), z10));
            } catch (IOException e10) {
                throw new BuildException("Problems opening file using a recorder entry", e10);
            }
        }
    }

    @Override // org.apache.tools.ant.k
    public void B0(BuildEvent buildEvent) {
        g("<< TARGET FINISHED -- " + buildEvent.e(), 4);
        g(buildEvent.e() + ":  duration " + d(System.currentTimeMillis() - this.f134241f), 3);
        c();
    }

    @Override // org.apache.tools.ant.q2
    public void E0(BuildEvent buildEvent) {
    }

    @Override // org.apache.tools.ant.k
    public void R0(BuildEvent buildEvent) {
        g("< BUILD FINISHED", 4);
        if (this.f134238c && this.f134240e != null) {
            Throwable thA = buildEvent.a();
            if (thA == null) {
                this.f134240e.println(String.format("%nBUILD SUCCESSFUL", new Object[0]));
            } else {
                this.f134240e.println(String.format("%nBUILD FAILED%n", new Object[0]));
                thA.printStackTrace(this.f134240e);
            }
        }
        a();
    }

    @Override // org.apache.tools.ant.l
    public void S(PrintStream printStream) {
        b();
        this.f134240e = printStream;
    }

    @Override // org.apache.tools.ant.k
    public void V(BuildEvent buildEvent) {
        g("--- MESSAGE LOGGED", 4);
        StringBuffer stringBuffer = new StringBuffer();
        if (buildEvent.f() != null) {
            String strK1 = buildEvent.f().K1();
            if (!this.f134242g) {
                String str = Constants.ARRAY_TYPE + strK1 + "] ";
                int length = 12 - str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    stringBuffer.append(" ");
                }
                stringBuffer.append(str);
            }
        }
        stringBuffer.append(buildEvent.b());
        g(stringBuffer.toString(), buildEvent.c());
    }

    @Override // org.apache.tools.ant.q2
    public void W0(BuildEvent buildEvent) {
        if (buildEvent.d() == this.f134243h) {
            a();
        }
    }

    public void a() {
        b();
        Project project = this.f134243h;
        if (project != null) {
            project.U0(this);
        }
        this.f134243h = null;
    }

    void b() {
        PrintStream printStream = this.f134240e;
        if (printStream != null) {
            printStream.close();
            this.f134240e = null;
        }
    }

    public String e() {
        return this.f134237b;
    }

    public Project f() {
        return this.f134243h;
    }

    void h(boolean z10) throws BuildException {
        i(z10);
    }

    @Override // org.apache.tools.ant.k
    public void h0(BuildEvent buildEvent) {
        g(">>> TASK STARTED -- " + buildEvent.f(), 4);
    }

    @Override // org.apache.tools.ant.k
    public void i0(BuildEvent buildEvent) {
        g("> BUILD STARTED", 4);
    }

    void j() throws BuildException {
        i(true);
    }

    public void k(Project project) {
        this.f134243h = project;
        if (project != null) {
            project.c(this);
        }
    }

    public void l(Boolean bool) {
        if (bool != null) {
            c();
            this.f134238c = bool.booleanValue();
        }
    }

    @Override // org.apache.tools.ant.l
    public void m(boolean z10) {
        this.f134242g = z10;
    }

    @Override // org.apache.tools.ant.l
    public void m1(PrintStream printStream) {
        S(printStream);
    }

    @Override // org.apache.tools.ant.k
    public void r1(BuildEvent buildEvent) {
        g(">> TARGET STARTED -- " + buildEvent.e(), 4);
        g(String.format("%n%s:", buildEvent.e().k()), 2);
        this.f134241f = System.currentTimeMillis();
    }

    @Override // org.apache.tools.ant.k
    public void s0(BuildEvent buildEvent) {
        g("<<< TASK FINISHED -- " + buildEvent.f(), 4);
        c();
    }

    @Override // org.apache.tools.ant.l
    public void w0(int i10) {
        if (i10 < 0 || i10 > 4) {
            return;
        }
        this.f134239d = i10;
    }
}
