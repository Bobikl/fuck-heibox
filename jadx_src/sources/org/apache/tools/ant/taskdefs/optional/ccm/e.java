package org.apache.tools.ant.taskdefs.optional.ccm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.n1;
import org.apache.tools.ant.taskdefs.q1;
import org.apache.tools.ant.types.o;
import org.apache.tools.ant.util.j2;

/* JADX INFO: compiled from: CCMCreateTask.java */
/* JADX INFO: loaded from: classes5.dex */
public class e extends g implements q1 {
    public static final String A = "/resolver";
    public static final String B = "/release";
    public static final String C = "/subsystem";
    public static final String D = "/task";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f134693y = "/synopsis";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f134694z = "/plat";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f134695s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f134696t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f134697u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f134698v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f134699w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f134700x = null;

    public e() {
        m2(g.f134708n);
    }

    private void o2(o oVar) {
        if (p2() != null) {
            oVar.h().O1(f134693y);
            oVar.h().O1("\"" + p2() + "\"");
        }
        if (q2() != null) {
            oVar.h().O1(f134694z);
            oVar.h().O1(q2());
        }
        if (s2() != null) {
            oVar.h().O1(A);
            oVar.h().O1(s2());
        }
        if (t2() != null) {
            oVar.h().O1(C);
            oVar.h().O1("\"" + t2() + "\"");
        }
        if (r2() != null) {
            oVar.h().O1(B);
            oVar.h().O1(r2());
        }
    }

    public void A2(String str) {
        this.f134700x = str;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        o oVar = new o();
        oVar.w(j2());
        oVar.h().O1(i2());
        o2(oVar);
        if (n1.o(l2(oVar, this))) {
            throw new BuildException("Failed executing: " + oVar, w1());
        }
        o oVar2 = new o();
        oVar2.w(j2());
        oVar2.h().O1(g.f134712r);
        oVar2.h().O1(u2());
        x1(oVar.o(), 4);
        if (k2(oVar2) == 0) {
            return;
        }
        throw new BuildException("Failed executing: " + oVar2, w1());
    }

    @Override // org.apache.tools.ant.taskdefs.q1
    public void e1(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            String line = bufferedReader.readLine();
            if (line != null) {
                x1("err " + line, 4);
            }
            bufferedReader.close();
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // org.apache.tools.ant.taskdefs.q1
    public void o1(OutputStream outputStream) throws IOException {
    }

    public String p2() {
        return this.f134695s;
    }

    @Override // org.apache.tools.ant.taskdefs.q1
    public void q1(InputStream inputStream) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    x1("buffer:" + line, 4);
                    String strTrim = line.substring(line.indexOf(32)).trim();
                    A2(strTrim.substring(0, strTrim.lastIndexOf(32)).trim());
                    x1("task is " + u2(), 4);
                }
                bufferedReader.close();
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (NullPointerException e10) {
            x1("error procession stream, null pointer exception", 0);
            x1(j2.b(e10), 0);
            throw new BuildException(e10);
        } catch (Exception e11) {
            x1("error procession stream " + e11.getMessage(), 0);
            throw new BuildException(e11.getMessage());
        }
    }

    public String q2() {
        return this.f134696t;
    }

    public String r2() {
        return this.f134698v;
    }

    public String s2() {
        return this.f134697u;
    }

    @Override // org.apache.tools.ant.taskdefs.q1
    public void start() throws IOException {
    }

    @Override // org.apache.tools.ant.taskdefs.q1
    public void stop() {
    }

    public String t2() {
        return this.f134699w;
    }

    public String u2() {
        return this.f134700x;
    }

    public void v2(String str) {
        this.f134695s = str;
    }

    public void w2(String str) {
        this.f134696t = str;
    }

    public void x2(String str) {
        this.f134698v = str;
    }

    public void y2(String str) {
        this.f134697u = str;
    }

    public void z2(String str) {
        this.f134699w = str;
    }
}
