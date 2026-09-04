package org.apache.tools.ant.taskdefs.optional.ejb;

import com.max.xiaoheihe.module.account.AliVerifyDialogActivity;
import com.tencent.qcloud.core.util.IOUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.j1;
import org.apache.tools.ant.taskdefs.n1;
import org.apache.tools.ant.taskdefs.q1;
import org.apache.tools.ant.taskdefs.v2;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.u2;

/* JADX INFO: compiled from: BorlandDeploymentTool.java */
/* JADX INFO: loaded from: classes5.dex */
public class c extends h implements q1 {
    public static final String E = "-//Inprise Corporation//DTD Enterprise JavaBeans 1.1//EN";
    protected static final String F = "/com/inprise/j2ee/xml/dtds/ejb-jar.dtd";
    protected static final String G = "/com/inprise/j2ee/xml/dtds/ejb-inprise.dtd";
    protected static final String H = "ejb-inprise.xml";
    protected static final String I = "ejb-borland.xml";
    protected static final String J = "java2iiop";
    protected static final String K = "com.inprise.ejb.util.Verify";
    static final int L = 5;
    static final int M = 4;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f134895w;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f134894v = "-ejb.jar";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f134896x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f134897y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f134898z = false;
    private int A = 4;
    private boolean B = true;
    private String C = "";
    private Map<String, File> D = new Hashtable();

    /* JADX INFO: compiled from: BorlandDeploymentTool.java */
    public class a extends e {
        final /* synthetic */ File I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u2 u2Var, File file, File file2) {
            super(u2Var, file);
            this.I = file2;
        }

        @Override // org.apache.tools.ant.taskdefs.optional.ejb.e
        protected void d() {
            if ("type-storage".equals(this.f134932e)) {
                this.f134934g.put(this.f134933f, new File(this.I, this.f134933f.substring(9)));
            }
        }
    }

    private void H(Collection<String> collection) {
        n1 n1Var = new n1(this);
        Project projectB = u().b();
        n1Var.w(projectB);
        n1Var.E(projectB.Z());
        final org.apache.tools.ant.types.o oVar = new org.apache.tools.ant.types.o();
        oVar.w(J);
        if (this.f134896x) {
            oVar.h().O1("-VBJdebug");
        }
        oVar.h().O1("-VBJclasspath");
        oVar.h().I1(m());
        oVar.h().O1("-list_files");
        oVar.h().O1("-no_tie");
        if (this.f134897y != null) {
            x("additional  " + this.f134897y + " to java2iiop ", 0);
            oVar.h().H1(this.f134897y);
        }
        oVar.h().O1("-root_dir");
        oVar.h().O1(n().f134951a.getAbsolutePath());
        oVar.h().O1("-compile");
        collection.stream().map(new Function() { // from class: org.apache.tools.ant.taskdefs.optional.ejb.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((String) obj).toString();
            }
        }).forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.optional.ejb.b
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                c.K(oVar, (String) obj);
            }
        });
        try {
            x("Calling java2iiop", 3);
            x(oVar.o(), 4);
            n1Var.x(oVar.s());
            int iE = n1Var.e();
            if (n1.o(iE)) {
                throw new BuildException("Failed executing java2iiop (ret code is " + iE + ")", u().w1());
            }
        } catch (IOException e10) {
            x("java2iiop exception :" + e10.getMessage(), 0);
            throw new BuildException(e10, u().w1());
        }
    }

    private void I(File file) {
        u().b().l("internal_bas_generateclient", d.class);
        x("generate client for " + file, 2);
        try {
            d dVar = (d) u().b().C("internal_bas_generateclient");
            dVar.r2(file);
            dVar.q2(this.f134896x);
            o0 o0VarM = m();
            if (o0VarM != null) {
                dVar.n2(o0VarM);
            }
            dVar.t2(this.A);
            dVar.g2("generate client");
            dVar.D1();
        } catch (Exception e10) {
            throw new BuildException("Exception while calling com.inprise.ejb.util.Verify", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K(org.apache.tools.ant.types.o oVar, String str) {
        oVar.h().O1(str);
    }

    private String T(String str) {
        return str.substring(0, str.lastIndexOf(".class")).replace(IOUtils.DIR_SEPARATOR_WINDOWS, lg.a.f131414g).replace(IOUtils.DIR_SEPARATOR_UNIX, lg.a.f131414g);
    }

    private String U(String str) {
        return str.replaceFirst("\\.java$", ".class");
    }

    private void V(File file) {
        int i10 = this.A;
        if (i10 == 4) {
            W(file);
            return;
        }
        if (i10 == 5) {
            X(file);
            return;
        }
        x("verify jar skipped because the version is invalid [" + this.A + "]", 1);
    }

    private void W(File file) {
        x("verify BAS " + file, 2);
        try {
            String str = this.C + " " + file.getPath();
            v2 v2Var = new v2(u());
            v2Var.g2(AliVerifyDialogActivity.f77461k);
            v2Var.K2(K);
            v2Var.q2().H1(str);
            o0 o0VarM = m();
            if (o0VarM != null) {
                v2Var.L2(o0VarM);
                v2Var.S2(true);
            }
            x("Calling com.inprise.ejb.util.Verify for " + file.toString(), 3);
            v2Var.D1();
        } catch (Exception e10) {
            throw new BuildException("Exception while calling com.inprise.ejb.util.Verify Details: " + e10.toString(), e10);
        }
    }

    private void X(File file) {
        x("verify BES " + file, 2);
        try {
            j1 j1Var = new j1(u());
            j1Var.D2(new File("."));
            j1Var.G2("iastool");
            if (m() != null) {
                j1Var.l2().O1("-VBJclasspath");
                j1Var.l2().O1(m().toString());
            }
            if (this.f134896x) {
                j1Var.l2().O1("-debug");
            }
            j1Var.l2().O1("-verify");
            j1Var.l2().O1("-src");
            j1Var.l2().O1(file.getPath());
            x("Calling iastool", 3);
            j1Var.D1();
        } catch (Exception e10) {
            throw new BuildException("Exception while calling generateclient Details: ", e10);
        }
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h
    protected void F(String str, File file, Hashtable<String, File> hashtable, String str2) throws BuildException {
        ArrayList arrayList = new ArrayList();
        for (String str3 : hashtable.keySet()) {
            if (str3.endsWith("Home.class")) {
                String strT = T(str3);
                arrayList.add(strT);
                x(" Home " + strT, 3);
            }
        }
        H(arrayList);
        hashtable.putAll(this.D);
        super.F(str, file, hashtable, str2);
        if (this.B) {
            V(file);
        }
        if (this.f134898z) {
            I(file);
        }
        this.D.clear();
    }

    protected e J(File file) {
        a aVar = new a(u(), file, file);
        String str = this.f134895w;
        if (str == null) {
            str = G;
        }
        aVar.e(E, str);
        for (g.c cVar : n().f134958h) {
            aVar.e(cVar.c(), cVar.b());
        }
        return aVar;
    }

    public void L(String str) {
        this.f134895w = str;
    }

    public void M(boolean z10) {
        this.f134896x = z10;
    }

    public void N(boolean z10) {
        this.f134898z = z10;
    }

    public void O(String str) {
        this.f134897y = str;
    }

    public void P(String str) {
        this.f134894v = str;
    }

    public void Q(boolean z10) {
        this.B = z10;
    }

    public void R(String str) {
        this.C = str;
    }

    public void S(int i10) {
        this.A = i10;
    }

    @Override // org.apache.tools.ant.taskdefs.q1
    public void e1(InputStream inputStream) throws IOException {
        String line = new BufferedReader(new InputStreamReader(inputStream)).readLine();
        if (line != null) {
            x("[java2iiop] " + line, 0);
        }
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h
    protected void g(Hashtable<String, File> hashtable, String str) {
        int i10 = this.A;
        if (i10 != 5 && i10 != 4) {
            throw new BuildException("version " + this.A + " is not supported");
        }
        String str2 = i10 == 5 ? I : H;
        x("vendor file : " + str + str2, 4);
        File file = new File(n().f134952b, str + str2);
        if (!file.exists()) {
            x("Unable to locate borland deployment descriptor. It was expected to be in " + file.getPath(), 1);
            return;
        }
        x("Borland specific file found " + file, 3);
        hashtable.put("META-INF/" + str2, file);
    }

    @Override // org.apache.tools.ant.taskdefs.q1
    public void o1(OutputStream outputStream) throws IOException {
    }

    @Override // org.apache.tools.ant.taskdefs.q1
    public void q1(InputStream inputStream) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        return;
                    } else if (line.endsWith(".java")) {
                        String strU = U(line);
                        this.D.put(strU.substring(n().f134951a.getAbsolutePath().length() + 1), new File(strU));
                    }
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
                throw new BuildException("Exception while parsing java2iiop output.", e);
            }
        } catch (Exception e10) {
            throw new BuildException("Exception while parsing java2iiop output.", e10);
        }
    }

    @Override // org.apache.tools.ant.taskdefs.q1
    public void start() throws IOException {
    }

    @Override // org.apache.tools.ant.taskdefs.q1
    public void stop() {
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h
    File w(String str) {
        return new File(p(), str + this.f134894v);
    }
}
