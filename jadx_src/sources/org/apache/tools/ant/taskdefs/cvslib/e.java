package org.apache.tools.ant.taskdefs.cvslib;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Vector;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.b0;

/* JADX INFO: compiled from: ChangeLogTask.java */
/* JADX INFO: loaded from: classes5.dex */
public class e extends org.apache.tools.ant.taskdefs.c {
    private File J;
    private File L;
    private File M;
    private Date N;
    private Date O;
    private String Q;
    private String R;
    private List<i> K = new Vector();
    private boolean P = false;
    private final List<b0> S = new Vector();

    private a[] d3(a[] aVarArr) {
        Date date;
        Date date2;
        ArrayList arrayList = new ArrayList();
        for (a aVar : aVarArr) {
            Date dateE = aVar.e();
            if (dateE != null && (((date = this.N) == null || !date.after(dateE)) && ((date2 = this.O) == null || !date2.before(dateE)))) {
                arrayList.add(aVar);
            }
        }
        return (a[]) arrayList.toArray(new a[arrayList.size()]);
    }

    private void e3(Properties properties) throws BuildException {
        File file = this.J;
        if (file != null) {
            try {
                properties.load(Files.newInputStream(file.toPath(), new OpenOption[0]));
            } catch (IOException e10) {
                throw new BuildException(e10.toString(), e10);
            }
        }
    }

    private void f3(Properties properties, a[] aVarArr) {
        for (a aVar : aVarArr) {
            if (properties.containsKey(aVar.c())) {
                aVar.g(properties.getProperty(aVar.c()));
            }
        }
    }

    private void p3() throws BuildException {
        if (this.L == null) {
            this.L = b().Z();
        }
        if (this.M == null) {
            throw new BuildException("Destfile must be set.");
        }
        if (!this.L.exists()) {
            throw new BuildException("Cannot find base dir %s", this.L.getAbsolutePath());
        }
        File file = this.J;
        if (file != null && !file.exists()) {
            throw new BuildException("Cannot find user lookup list %s", this.J.getAbsolutePath());
        }
        if (this.Q == null && this.R == null) {
            return;
        }
        if (this.N != null || this.O != null) {
            throw new BuildException("Specify either a tag or date range, not both");
        }
    }

    private void q3(a[] aVarArr) throws BuildException {
        try {
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(Files.newOutputStream(this.M.toPath(), new OpenOption[0]), StandardCharsets.UTF_8));
            try {
                new f().a(printWriter, aVarArr);
                if (printWriter.checkError()) {
                    throw new IOException("Encountered an error writing changelog");
                }
                printWriter.close();
            } catch (Throwable th2) {
                try {
                    printWriter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (UnsupportedEncodingException e10) {
            b().M0(e10.toString(), 0);
        } catch (IOException e11) {
            throw new BuildException(e11.toString(), e11);
        }
    }

    @Override // org.apache.tools.ant.taskdefs.c, org.apache.tools.ant.u2
    public void D1() throws BuildException {
        File file = this.L;
        try {
            p3();
            Properties properties = new Properties();
            e3(properties);
            for (i iVar : this.K) {
                iVar.e();
                properties.put(iVar.b(), iVar.a());
            }
            String str = "";
            if (this.P) {
                H2("");
                j2("rlog");
                j2("-S");
                j2(org.apache.tools.ant.taskdefs.optional.vss.g.X2);
            } else {
                H2("log");
                if (B2() != null) {
                    j jVar = new j();
                    jVar.J(b());
                    jVar.g2("cvsversion");
                    jVar.K2(r2());
                    jVar.L2(s2());
                    jVar.W2(z2());
                    jVar.N2(this.L);
                    jVar.D1();
                    if (jVar.f3()) {
                        j2("-S");
                    }
                }
            }
            String str2 = this.Q;
            if (str2 != null || this.R != null) {
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = this.R;
                if (str3 != null) {
                    str = str3;
                }
                j2("-r" + str2 + "::" + str);
            } else if (this.N != null) {
                String str4 = ">=" + new SimpleDateFormat("yyyy-MM-dd").format(this.N);
                j2("-d");
                j2(str4);
            }
            Iterator<b0> it = this.S.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                for (String str5 : it.next().B2(b()).m()) {
                    j2(str5);
                }
            }
            d dVar = new d(this.P, y2(), w2());
            m mVar = new m(dVar);
            x1(q2(), 3);
            N2(this.L);
            Q2(mVar);
            try {
                super.D1();
                String strJ = mVar.j();
                if (strJ != null) {
                    x1(strJ, 0);
                }
                a[] aVarArrD3 = d3(dVar.b());
                f3(properties, aVarArrD3);
                q3(aVarArrD3);
                this.L = file;
            } catch (Throwable th2) {
                String strJ2 = mVar.j();
                if (strJ2 != null) {
                    x1(strJ2, 0);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            this.L = file;
            throw th3;
        }
    }

    public void b3(b0 b0Var) {
        this.S.add(b0Var);
    }

    public void c3(i iVar) {
        this.K.add(iVar);
    }

    public void g3(int i10) {
        m3(new Date(System.currentTimeMillis() - ((((((long) i10) * 24) * 60) * 60) * 1000)));
    }

    public void h3(File file) {
        this.M = file;
    }

    public void i3(File file) {
        this.L = file;
    }

    public void j3(Date date) {
        this.O = date;
    }

    public void k3(String str) {
        this.R = str;
    }

    public void l3(boolean z10) {
        this.P = z10;
    }

    public void m3(Date date) {
        this.N = date;
    }

    public void n3(String str) {
        this.Q = str;
    }

    public void o3(File file) {
        this.J = file;
    }
}
