package org.apache.tools.ant.taskdefs.optional;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.Iterator;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.r1;
import org.apache.tools.ant.types.resources.w1;
import org.apache.tools.ant.types.s1;
import org.apache.tools.ant.types.u1;
import org.apache.tools.ant.types.x1;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.util.j0;

/* JADX INFO: compiled from: ReplaceRegExp.java */
/* JADX INFO: loaded from: classes5.dex */
public class w extends u2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final j0 f135475s = j0.O();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private w1 f135479n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f135482q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f135483r = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private File f135476k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f135477l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f135478m = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private r1 f135480o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private x1 f135481p = null;

    private boolean o2(Reader reader, Writer writer, int i10) throws IOException {
        return p2(j0.o0(reader), writer, i10);
    }

    private boolean p2(String str, Writer writer, int i10) throws IOException {
        String strM2 = m2(this.f135480o, this.f135481p, str, i10);
        writer.write(strM2);
        return !strM2.equals(str);
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        if (this.f135480o == null) {
            throw new BuildException("No expression to match.");
        }
        if (this.f135481p == null) {
            throw new BuildException("Nothing to replace expression with.");
        }
        if (this.f135476k != null && this.f135479n != null) {
            throw new BuildException("You cannot supply the 'file' attribute and resource collections at the same time.");
        }
        int iA = org.apache.tools.ant.util.regexp.g.a(this.f135477l);
        File file = this.f135476k;
        if (file != null && file.exists()) {
            try {
                n2(this.f135476k, iA);
            } catch (IOException e10) {
                x1("An error occurred processing file: '" + this.f135476k.getAbsolutePath() + "': " + e10.toString(), 0);
            }
        } else if (this.f135476k != null) {
            x1("The following file is missing: '" + this.f135476k.getAbsolutePath() + "'", 0);
        }
        w1 w1Var = this.f135479n;
        if (w1Var != null) {
            Iterator<s1> it = w1Var.iterator();
            while (it.hasNext()) {
                File fileL0 = ((org.apache.tools.ant.types.resources.y) it.next().e2(org.apache.tools.ant.types.resources.y.class)).l0();
                if (fileL0.exists()) {
                    try {
                        n2(fileL0, iA);
                    } catch (Exception e11) {
                        x1("An error occurred processing file: '" + fileL0.getAbsolutePath() + "': " + e11.toString(), 0);
                    }
                } else {
                    x1("The following file is missing: '" + fileL0.getAbsolutePath() + "'", 0);
                }
            }
        }
    }

    public void i2(u1 u1Var) {
        if (!u1Var.O()) {
            throw new BuildException("only filesystem resources are supported");
        }
        if (this.f135479n == null) {
            this.f135479n = new w1();
        }
        this.f135479n.f2(u1Var);
    }

    public void j2(org.apache.tools.ant.types.b0 b0Var) {
        i2(b0Var);
    }

    public r1 k2() {
        if (this.f135480o != null) {
            throw new BuildException("Only one regular expression is allowed.");
        }
        r1 r1Var = new r1();
        this.f135480o = r1Var;
        return r1Var;
    }

    public x1 l2() {
        if (this.f135481p != null) {
            throw new BuildException("Only one substitution expression is allowed");
        }
        x1 x1Var = new x1();
        this.f135481p = x1Var;
        return x1Var;
    }

    protected String m2(r1 r1Var, x1 x1Var, String str, int i10) {
        org.apache.tools.ant.util.regexp.c cVarG2 = r1Var.g2(b());
        if (!cVarG2.e(str, i10)) {
            return str;
        }
        x1("Found match; substituting", 4);
        return cVarG2.a(str, x1Var.e2(b()), i10);
    }

    protected void n2(File file, int i10) throws IOException {
        Writer outputStreamWriter;
        boolean zO2;
        int i11;
        File fileG = f135475s.G(b(), org.apache.tools.ant.taskdefs.optional.vss.g.K2, ".txt", null, true, true);
        try {
            String str = this.f135483r;
            Charset charsetDefaultCharset = str == null ? Charset.defaultCharset() : Charset.forName(str);
            InputStream inputStreamNewInputStream = Files.newInputStream(file.toPath(), new OpenOption[0]);
            try {
                OutputStream outputStreamNewOutputStream = Files.newOutputStream(fileG.toPath(), new OpenOption[0]);
                Reader reader = null;
                try {
                    try {
                        Reader inputStreamReader = new InputStreamReader(inputStreamNewInputStream, charsetDefaultCharset);
                        try {
                            outputStreamWriter = new OutputStreamWriter(outputStreamNewOutputStream, charsetDefaultCharset);
                            try {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Replacing pattern '");
                                sb2.append(this.f135480o.e2(b()));
                                sb2.append("' with '");
                                sb2.append(this.f135481p.e2(b()));
                                sb2.append("' in '");
                                sb2.append(file.getPath());
                                sb2.append("'");
                                String str2 = "";
                                sb2.append(this.f135478m ? " by line" : "");
                                if (!this.f135477l.isEmpty()) {
                                    str2 = " with flags: '" + this.f135477l + "'";
                                }
                                sb2.append(str2);
                                sb2.append(".");
                                x1(sb2.toString(), 3);
                                if (this.f135478m) {
                                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                                    try {
                                        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
                                        try {
                                            StringBuilder sb3 = new StringBuilder();
                                            boolean z10 = false;
                                            zO2 = false;
                                            do {
                                                i11 = bufferedReader.read();
                                                if (i11 == 13) {
                                                    if (z10) {
                                                        zO2 |= p2(sb3.toString(), bufferedWriter, i10);
                                                        bufferedWriter.write(13);
                                                        sb3 = new StringBuilder();
                                                    } else {
                                                        z10 = true;
                                                    }
                                                } else if (i11 == 10) {
                                                    zO2 |= p2(sb3.toString(), bufferedWriter, i10);
                                                    if (z10) {
                                                        bufferedWriter.write(13);
                                                        z10 = false;
                                                    }
                                                    bufferedWriter.write(10);
                                                    sb3 = new StringBuilder();
                                                } else {
                                                    if (z10 || i11 < 0) {
                                                        zO2 |= p2(sb3.toString(), bufferedWriter, i10);
                                                        if (z10) {
                                                            bufferedWriter.write(13);
                                                            z10 = false;
                                                        }
                                                        sb3 = new StringBuilder();
                                                    }
                                                    if (i11 >= 0) {
                                                        sb3.append((char) i11);
                                                    }
                                                }
                                            } while (i11 >= 0);
                                            outputStreamWriter = bufferedWriter;
                                            inputStreamReader = bufferedReader;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            reader = bufferedReader;
                                            outputStreamWriter = bufferedWriter;
                                            j0.e(reader);
                                            j0.f(outputStreamWriter);
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        reader = bufferedReader;
                                    }
                                } else {
                                    zO2 = o2(inputStreamReader, outputStreamWriter, i10);
                                }
                                j0.e(inputStreamReader);
                                j0.f(outputStreamWriter);
                                if (outputStreamNewOutputStream != null) {
                                    outputStreamNewOutputStream.close();
                                }
                                if (inputStreamNewInputStream != null) {
                                    inputStreamNewInputStream.close();
                                }
                                if (zO2) {
                                    x1("File has changed; saving the updated file", 3);
                                    try {
                                        long jLastModified = file.lastModified();
                                        j0 j0Var = f135475s;
                                        j0Var.m0(fileG, file);
                                        if (this.f135482q) {
                                            j0Var.p0(file, jLastModified);
                                        }
                                        fileG = null;
                                    } catch (IOException e10) {
                                        throw new BuildException("Couldn't rename temporary file " + fileG, e10, w1());
                                    }
                                } else {
                                    x1("No change made", 4);
                                }
                                if (fileG != null) {
                                    fileG.delete();
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                reader = inputStreamReader;
                                j0.e(reader);
                                j0.f(outputStreamWriter);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            outputStreamWriter = null;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        outputStreamWriter = null;
                    }
                } catch (Throwable th7) {
                    if (outputStreamNewOutputStream == null) {
                        throw th7;
                    }
                    try {
                        outputStreamNewOutputStream.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            } catch (Throwable th9) {
                if (inputStreamNewInputStream == null) {
                    throw th9;
                }
                try {
                    inputStreamNewInputStream.close();
                    throw th9;
                } catch (Throwable th10) {
                    th9.addSuppressed(th10);
                    throw th9;
                }
            }
        } catch (Throwable th11) {
            if (fileG != null) {
                fileG.delete();
            }
            throw th11;
        }
    }

    @Deprecated
    public void q2(String str) {
        this.f135478m = Boolean.parseBoolean(str);
    }

    public void r2(boolean z10) {
        this.f135478m = z10;
    }

    public void s2(String str) {
        this.f135483r = str;
    }

    public void t2(File file) {
        this.f135476k = file;
    }

    public void u2(String str) {
        this.f135477l = str;
    }

    public void v2(String str) {
        if (this.f135480o != null) {
            throw new BuildException("Only one regular expression is allowed");
        }
        r1 r1Var = new r1();
        this.f135480o = r1Var;
        r1Var.j2(str);
    }

    public void w2(boolean z10) {
        this.f135482q = z10;
    }

    public void x2(String str) {
        if (this.f135481p != null) {
            throw new BuildException("Only one substitution expression is allowed");
        }
        x1 x1Var = new x1();
        this.f135481p = x1Var;
        x1Var.g2(str);
    }
}
