package org.apache.tools.ant.taskdefs.optional.jsp;

import java.io.File;
import java.time.Instant;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.h4;
import org.apache.tools.ant.taskdefs.v2;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.v0;

/* JADX INFO: compiled from: WLJspc.java */
/* JADX INFO: loaded from: classes5.dex */
public class e extends h4 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private File f135273l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private File f135274m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f135275n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private o0 f135276o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f135277p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List<String> f135278q = new Vector();

    protected void A2(String[] strArr) {
        String str;
        long epochMilli = Instant.now().toEpochMilli();
        for (String str2 : strArr) {
            File file = new File(this.f135274m, str2);
            String parent = new File(str2).getParent();
            if (parent == null || parent.isEmpty()) {
                str = this.f135277p;
            } else {
                String str3 = File.separator;
                str = this.f135277p + str3 + lg.a.f131412e + z2(parent, str3, "_/");
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            String str4 = File.separator;
            sb2.append(str4);
            sb2.append(lg.a.f131412e);
            String string = sb2.toString();
            int iLastIndexOf = str2.lastIndexOf(str4) != -1 ? str2.lastIndexOf(str4) + 1 : 0;
            int iIndexOf = str2.indexOf(".jsp");
            if (iIndexOf == -1) {
                x1("Skipping " + str2 + ". Not a JSP", 3);
            } else {
                File file2 = new File(this.f135273l, (string + str2.substring(iLastIndexOf, iIndexOf)) + ".class");
                if (file.lastModified() > epochMilli) {
                    x1("Warning: file modified in the future: " + str2, 1);
                }
                if (file.lastModified() > file2.lastModified()) {
                    this.f135278q.add(str2);
                    x1("Recompiling File " + str2, 3);
                }
            }
        }
    }

    public void B2(o0 o0Var) {
        o0 o0Var2 = this.f135276o;
        if (o0Var2 == null) {
            this.f135276o = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void C2(File file) {
        this.f135273l = file;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        if (!this.f135273l.isDirectory()) {
            throw new BuildException("destination directory %s is not valid", this.f135273l.getPath());
        }
        if (!this.f135274m.isDirectory()) {
            throw new BuildException("src directory %s is not valid", this.f135274m.getPath());
        }
        String str = this.f135275n;
        if (str == null) {
            throw new BuildException("package attribute must be present.", w1());
        }
        this.f135277p = str.replace(lg.a.f131414g, File.separatorChar);
        v0 v0VarP2 = super.p2(this.f135274m);
        if (this.f135276o == null) {
            this.f135276o = new o0(b());
        }
        this.f135276o = this.f135276o.r2();
        v2 v2Var = new v2(this);
        v2Var.S2(true);
        v2Var.K2("weblogic.jspc");
        v2Var.g2(K1());
        String[] strArr = new String[12];
        strArr[0] = "-d";
        strArr[1] = this.f135273l.getAbsolutePath().trim();
        strArr[2] = "-docroot";
        strArr[3] = this.f135274m.getAbsolutePath().trim();
        strArr[4] = "-keepgenerated";
        strArr[5] = "-compilerclass";
        strArr[6] = "sun.tools.javac.Main";
        strArr[7] = "-classpath";
        strArr[8] = this.f135276o.toString();
        A2(v0VarP2.m());
        log("Compiling " + this.f135278q.size() + " JSP files");
        for (String str2 : this.f135278q) {
            File file = new File(str2);
            strArr[9] = "-package";
            String parent = file.getParent();
            if (parent == null || parent.isEmpty()) {
                strArr[10] = this.f135275n;
            } else {
                strArr[10] = this.f135275n + "._" + z2(parent, File.separator, "_.");
            }
            strArr[11] = this.f135274m + File.separator + str2;
            v2Var.p2();
            for (int i10 = 0; i10 < 12; i10++) {
                v2Var.q2().O1(strArr[i10]);
            }
            v2Var.L2(this.f135276o);
            if (v2Var.y2() != 0) {
                x1(str2 + " failed to compile", 1);
            }
        }
    }

    public void D2(String str) {
        this.f135275n = str;
    }

    public void E2(File file) {
        this.f135274m = file;
    }

    public o0 y2() {
        if (this.f135276o == null) {
            this.f135276o = new o0(b());
        }
        return this.f135276o;
    }

    protected String z2(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(str, str2, true);
        int iCountTokens = stringTokenizer.countTokens();
        for (int i10 = 0; i10 < iCountTokens; i10++) {
            String strNextToken = stringTokenizer.nextToken();
            if (strNextToken.equals(str2)) {
                strNextToken = str3;
            }
            sb2.append(strNextToken);
        }
        return sb2.toString();
    }
}
