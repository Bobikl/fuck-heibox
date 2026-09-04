package org.apache.tools.ant.taskdefs.cvslib;

import com.max.xiaoheihe.module.bbs.post_edit.o;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.util.j0;
import org.apache.tools.ant.util.y;
import org.apache.tools.ant.util.z;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/* JADX INFO: compiled from: CvsTagDiff.java */
/* JADX INFO: loaded from: classes5.dex */
public class g extends org.apache.tools.ant.taskdefs.c {
    static final String V = "File ";
    static final String X = " to ";
    static final String Y = " is new;";
    static final String Z = "revision ";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    static final String f134011a0 = " changed from revision ";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    static final String f134012b0 = " is removed";
    private String J;
    private String K;
    private String L;
    private String M;
    private String N;
    private File O;
    private boolean P = false;
    private List<String> Q = new ArrayList();
    private String[] R = null;
    private int[] S = null;
    private static final j0 T = j0.O();
    private static final y U = new y();
    static final int W = 5;

    private boolean b3(List<h> list, String str) {
        int iIndexOf = str.indexOf(f134011a0);
        if (iIndexOf == -1) {
            return false;
        }
        String strSubstring = str.substring(0, iIndexOf);
        int iIndexOf2 = str.indexOf(X, iIndexOf);
        h hVar = new h(strSubstring, str.substring(iIndexOf2 + 4), str.substring(iIndexOf + 23, iIndexOf2));
        list.add(hVar);
        x1(hVar.toString(), 3);
        return true;
    }

    private boolean c3(List<h> list, String str) {
        int iIndexOf = str.indexOf(Y);
        if (iIndexOf == -1) {
            return false;
        }
        String strSubstring = str.substring(0, iIndexOf);
        int iIndexOf2 = str.indexOf(Z, iIndexOf);
        h hVar = new h(strSubstring, iIndexOf2 != -1 ? str.substring(iIndexOf2 + 9) : null);
        list.add(hVar);
        x1(hVar.toString(), 3);
        return true;
    }

    private boolean d3(List<h> list, String str) {
        int iIndexOf;
        if (this.P || (iIndexOf = str.indexOf(f134012b0)) == -1) {
            return false;
        }
        String strSubstring = str.substring(0, iIndexOf);
        int iIndexOf2 = str.indexOf(Z, iIndexOf);
        h hVar = new h(strSubstring, null, iIndexOf2 != -1 ? str.substring(iIndexOf2 + 9) : null);
        list.add(hVar);
        x1(hVar.toString(), 3);
        return true;
    }

    private void e3() {
        if (this.J != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(this.J);
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                this.Q.add(strNextToken);
                j2(strNextToken);
            }
        }
        Iterator<org.apache.tools.ant.taskdefs.c.a> it = w2().iterator();
        while (it.hasNext()) {
            this.Q.add(it.next().a());
        }
        this.R = new String[this.Q.size()];
        this.S = new int[this.Q.size()];
        int i10 = 0;
        while (true) {
            String[] strArr = this.R;
            if (i10 >= strArr.length) {
                return;
            }
            strArr[i10] = V + this.Q.get(i10) + "/";
            this.S[i10] = this.R[i10].length();
            i10++;
        }
    }

    private h[] f3(File file) throws BuildException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                ArrayList arrayList = new ArrayList();
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    String strG3 = g3(line, this.R, this.S);
                    if (strG3 != null && !c3(arrayList, strG3) && !b3(arrayList, strG3)) {
                        d3(arrayList, strG3);
                    }
                }
                h[] hVarArr = (h[]) arrayList.toArray(new h[arrayList.size()]);
                bufferedReader.close();
                return hVarArr;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            throw new BuildException("Error in parsing", e10);
        }
    }

    private static String g3(String str, String[] strArr, int[] iArr) {
        if (str.length() < W) {
            return null;
        }
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (str.startsWith(strArr[i10])) {
                return str.substring(iArr[i10]);
            }
        }
        return str.substring(W);
    }

    private void n3() throws BuildException {
        if (this.J == null && w2().isEmpty()) {
            throw new BuildException("Package/module must be set.");
        }
        if (this.O == null) {
            throw new BuildException("Destfile must be set.");
        }
        String str = this.K;
        if (str == null && this.M == null) {
            throw new BuildException("Start tag or start date must be set.");
        }
        if (str != null && this.M != null) {
            throw new BuildException("Only one of start tag and start date must be set.");
        }
        String str2 = this.L;
        if (str2 == null && this.N == null) {
            throw new BuildException("End tag or end date must be set.");
        }
        if (str2 != null && this.N != null) {
            throw new BuildException("Only one of end tag and end date must be set.");
        }
    }

    private void o3(h[] hVarArr) throws BuildException {
        try {
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(Files.newOutputStream(this.O.toPath(), new OpenOption[0]), StandardCharsets.UTF_8));
            try {
                printWriter.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
                Document documentF = z.f();
                Element elementCreateElement = documentF.createElement("tagdiff");
                String str = this.K;
                if (str != null) {
                    elementCreateElement.setAttribute("startTag", str);
                } else {
                    elementCreateElement.setAttribute(x9.b.f141154s, this.M);
                }
                String str2 = this.L;
                if (str2 != null) {
                    elementCreateElement.setAttribute("endTag", str2);
                } else {
                    elementCreateElement.setAttribute(x9.b.f141155t, this.N);
                }
                elementCreateElement.setAttribute("cvsroot", r2());
                elementCreateElement.setAttribute("package", o.a(Constants.ACCEPT_TIME_SEPARATOR_SP, this.Q));
                U.m(elementCreateElement, printWriter, 0, "\t");
                printWriter.println();
                for (h hVar : hVarArr) {
                    p3(documentF, printWriter, hVar);
                }
                U.c(elementCreateElement, printWriter, 0, "\t", true);
                printWriter.flush();
                if (printWriter.checkError()) {
                    throw new IOException("Encountered an error writing tagdiff");
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
            x1(e10.toString(), 0);
        } catch (IOException e11) {
            throw new BuildException(e11.toString(), e11);
        }
    }

    private void p3(Document document, PrintWriter printWriter, h hVar) throws IOException {
        Element elementCreateElement = document.createElement("entry");
        Element elementE = z.e(elementCreateElement, "file");
        z.b(elementE, "name", hVar.a());
        if (hVar.c() != null) {
            z.d(elementE, "revision", hVar.c());
        }
        if (hVar.b() != null) {
            z.d(elementE, "prevrevision", hVar.b());
        }
        U.q(elementCreateElement, printWriter, 1, "\t");
    }

    @Override // org.apache.tools.ant.taskdefs.c, org.apache.tools.ant.u2
    public void D1() throws Throwable {
        File fileG;
        n3();
        j2("rdiff");
        j2("-s");
        if (this.K != null) {
            j2("-r");
            j2(this.K);
        } else {
            j2(org.apache.tools.ant.taskdefs.optional.vss.g.f135460i3);
            j2(this.M);
        }
        if (this.L != null) {
            j2("-r");
            j2(this.L);
        } else {
            j2(org.apache.tools.ant.taskdefs.optional.vss.g.f135460i3);
            j2(this.N);
        }
        H2("");
        try {
            e3();
            fileG = T.G(b(), "cvstagdiff", ".log", null, true, true);
            try {
                T2(fileG);
                super.D1();
                o3(f3(fileG));
                this.R = null;
                this.S = null;
                this.Q.clear();
                if (fileG != null) {
                    fileG.delete();
                }
            } catch (Throwable th2) {
                th = th2;
                this.R = null;
                this.S = null;
                this.Q.clear();
                if (fileG != null) {
                    fileG.delete();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileG = null;
        }
    }

    @Override // org.apache.tools.ant.taskdefs.c
    public void V2(String str) {
        this.J = str;
    }

    public void h3(File file) {
        this.O = file;
    }

    public void i3(String str) {
        this.N = str;
    }

    public void j3(String str) {
        this.L = str;
    }

    public void k3(boolean z10) {
        this.P = z10;
    }

    public void l3(String str) {
        this.M = str;
    }

    public void m3(String str) {
        this.K = str;
    }
}
