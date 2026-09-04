package org.apache.tools.ant.taskdefs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Locale;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Exec.java */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class i1 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f134247k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f134248l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private File f134249m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f134250n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected PrintWriter f134251o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f134252p = false;

    /* JADX INFO: compiled from: Exec.java */
    public class a extends Thread {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f134253f = 5;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private BufferedReader f134254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f134255c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f134256d = false;

        public a(InputStream inputStream, int i10) {
            this.f134254b = new BufferedReader(new InputStreamReader(inputStream));
            this.f134255c = i10;
        }

        public void a() throws IOException {
            if (this.f134256d) {
                return;
            }
            String line = this.f134254b.readLine();
            if (line != null) {
                i1.this.j2(line, this.f134255c);
            } else {
                this.f134256d = true;
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!this.f134256d) {
                try {
                    try {
                        a();
                        Thread.sleep(5L);
                    } catch (IOException unused) {
                        return;
                    }
                } catch (InterruptedException unused2) {
                }
            }
            this.f134254b.close();
        }
    }

    public i1() {
        System.err.println("As of Ant 1.2 released in October 2000, the Exec class");
        System.err.println("is considered to be dead code by the Ant developers and is unmaintained.");
        System.err.println("Don't use it!");
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        k2(this.f134250n);
    }

    protected void i2() {
        PrintWriter printWriter = this.f134251o;
        if (printWriter != null) {
            printWriter.close();
        }
    }

    protected void j2(String str, int i10) {
        PrintWriter printWriter = this.f134251o;
        if (printWriter == null) {
            x1(str, i10);
        } else {
            printWriter.println(str);
        }
    }

    protected int k2(String str) throws BuildException {
        String property = System.getProperty("os.name");
        x1("Myos = " + property, 3);
        String str2 = this.f134247k;
        if (str2 != null && !str2.contains(property)) {
            x1("Not found in " + this.f134247k, 3);
            return 0;
        }
        if (this.f134249m == null) {
            this.f134249m = b().Z();
        }
        Locale locale = Locale.ENGLISH;
        if (!property.toLowerCase(locale).contains("windows")) {
            String strU0 = b().u0(org.apache.tools.ant.j1.f133495s);
            if (strU0 == null) {
                throw new BuildException("Property 'ant.home' not found", w1());
            }
            str = b().W0(strU0 + "/bin/antRun").toString() + " " + this.f134249m + " " + str;
        } else if (!this.f134249m.equals(b().W0("."))) {
            if (property.toLowerCase(locale).contains("nt")) {
                str = "cmd /c cd " + this.f134249m + " && " + str;
            } else {
                String strU1 = b().u0(org.apache.tools.ant.j1.f133495s);
                if (strU1 == null) {
                    throw new BuildException("Property 'ant.home' not found", w1());
                }
                str = b().W0(strU1 + "/bin/antRun.bat").toString() + " " + this.f134249m + " " + str;
            }
        }
        int iExitValue = -1;
        try {
            x1(str, 3);
            Process processExec = Runtime.getRuntime().exec(str);
            if (this.f134248l != null) {
                this.f134251o = new PrintWriter(new FileWriter(this.f134248l));
                x1("Output redirected to " + this.f134248l, 3);
            }
            a aVar = new a(processExec.getInputStream(), 2);
            a aVar2 = new a(processExec.getErrorStream(), 1);
            aVar.start();
            aVar2.start();
            processExec.waitFor();
            aVar.join();
            aVar2.join();
            processExec.destroy();
            i2();
            iExitValue = processExec.exitValue();
            if (iExitValue != 0) {
                if (this.f134252p) {
                    throw new BuildException("Exec returned: " + iExitValue, w1());
                }
                x1("Result: " + iExitValue, 0);
            }
        } catch (IOException e10) {
            throw new BuildException("Error exec: " + str, e10, w1());
        } catch (InterruptedException unused) {
        }
        return iExitValue;
    }

    public void l2(String str) {
        this.f134250n = str;
    }

    public void m2(String str) {
        this.f134249m = b().W0(str);
    }

    public void n2(boolean z10) {
        this.f134252p = z10;
    }

    public void o2(String str) {
        this.f134247k = str;
    }

    public void p2(String str) {
        this.f134248l = str;
    }
}
