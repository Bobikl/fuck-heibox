package org.apache.tools.ant.taskdefs;

import com.tencent.qcloud.core.util.IOUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Expand.java */
/* JADX INFO: loaded from: classes5.dex */
public class t1 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f135750w = "native-encoding";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f135751x = "Cannot define more than one mapper";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final org.apache.tools.ant.util.j0 f135752y = org.apache.tools.ant.util.j0.O();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f135753z = 1024;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private File f135754k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private File f135755l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f135756m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private org.apache.tools.ant.types.k0 f135757n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<org.apache.tools.ant.types.w0> f135758o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private org.apache.tools.ant.types.resources.w1 f135759p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f135760q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f135761r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f135762s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f135763t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Boolean f135764u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f135765v;

    public t1() {
        this("UTF8");
    }

    protected t1(String str) {
        this.f135756m = true;
        this.f135757n = null;
        this.f135758o = new Vector();
        this.f135759p = new org.apache.tools.ant.types.resources.w1();
        this.f135760q = false;
        this.f135761r = false;
        this.f135762s = true;
        this.f135763t = true;
        this.f135764u = null;
        this.f135765v = str;
    }

    public void A2(boolean z10) {
        this.f135761r = z10;
    }

    public void B2(boolean z10) {
        this.f135756m = z10;
    }

    public void C2(boolean z10) {
        w2(z10);
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        if ("expand".equals(L1())) {
            log("!! expand is deprecated. Use unzip instead. !!");
        }
        if (this.f135755l == null && !this.f135760q) {
            throw new BuildException("src attribute and/or resources must be specified");
        }
        File file = this.f135754k;
        if (file == null) {
            throw new BuildException("Dest attribute must be specified");
        }
        if (file.exists() && !this.f135754k.isDirectory()) {
            throw new BuildException("Dest must be a directory.", w1());
        }
        File file2 = this.f135755l;
        if (file2 != null) {
            if (file2.isDirectory()) {
                throw new BuildException("Src must not be a directory. Use nested filesets instead.", w1());
            }
            if (!this.f135755l.exists()) {
                throw new BuildException("src '" + this.f135755l + "' doesn't exist.");
            }
            if (!this.f135755l.canRead()) {
                throw new BuildException("src '" + this.f135755l + "' cannot be read.");
            }
            n2(f135752y, this.f135755l, this.f135754k);
        }
        for (org.apache.tools.ant.types.s1 s1Var : this.f135759p) {
            if (s1Var.p2()) {
                org.apache.tools.ant.types.resources.y yVar = (org.apache.tools.ant.types.resources.y) s1Var.e2(org.apache.tools.ant.types.resources.y.class);
                if (yVar != null) {
                    n2(f135752y, yVar.l0(), this.f135754k);
                } else {
                    o2(s1Var, this.f135754k);
                }
            } else {
                log("Skipping '" + s1Var.k2() + "' because it doesn't exist.");
            }
        }
    }

    public void D2(File file) {
        this.f135755l = file;
    }

    public void E2(boolean z10) {
        this.f135762s = z10;
    }

    public void i2(org.apache.tools.ant.types.u1 u1Var) {
        this.f135760q = true;
        this.f135759p.f2(u1Var);
    }

    public void j2(org.apache.tools.ant.util.g0 g0Var) {
        m2().e2(g0Var);
    }

    public void k2(org.apache.tools.ant.types.b0 b0Var) {
        i2(b0Var);
    }

    public void l2(org.apache.tools.ant.types.w0 w0Var) {
        this.f135758o.add(w0Var);
    }

    public org.apache.tools.ant.types.k0 m2() throws BuildException {
        if (this.f135757n != null) {
            throw new BuildException(f135751x, w1());
        }
        org.apache.tools.ant.types.k0 k0Var = new org.apache.tools.ant.types.k0(b());
        this.f135757n = k0Var;
        return k0Var;
    }

    protected void n2(org.apache.tools.ant.util.j0 j0Var, File file, File file2) {
        x1("Expanding: " + file + " into " + file2, 2);
        org.apache.tools.ant.util.g0 g0VarT2 = t2();
        if (!file.exists()) {
            throw new BuildException("Unable to expand " + file + " as the file does not exist", w1());
        }
        try {
            org.apache.tools.zip.x xVar = new org.apache.tools.zip.x(file, this.f135765v, this.f135763t);
            try {
                Enumeration<org.apache.tools.zip.t> enumerationI = xVar.i();
                int i10 = 1;
                boolean z10 = true;
                while (enumerationI.hasMoreElements()) {
                    org.apache.tools.zip.t tVarNextElement = enumerationI.nextElement();
                    InputStream inputStream = null;
                    x1("extracting " + tVarNextElement.getName(), 4);
                    try {
                        InputStream inputStreamO = xVar.o(tVarNextElement);
                        try {
                            int i11 = i10;
                            p2(j0Var, file, file2, inputStreamO, tVarNextElement.getName(), new Date(tVarNextElement.getTime()), tVarNextElement.isDirectory(), g0VarT2);
                            org.apache.tools.ant.util.j0.c(inputStreamO);
                            i10 = i11;
                            z10 = false;
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream = inputStreamO;
                            org.apache.tools.ant.util.j0.c(inputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                int i12 = i10;
                if (z10 && s2()) {
                    Object[] objArr = new Object[i12];
                    objArr[0] = file;
                    throw new BuildException("archive '%s' is empty", objArr);
                }
                x1("expand complete", 3);
                xVar.close();
            } catch (Throwable th4) {
                try {
                    xVar.close();
                    throw th4;
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                    throw th4;
                }
            }
        } catch (IOException e10) {
            throw new BuildException("Error while expanding " + file.getPath() + "\n" + e10.toString(), e10);
        }
    }

    protected void o2(org.apache.tools.ant.types.s1 s1Var, File file) {
        throw new BuildException("only filesystem based resources are supported by this task.");
    }

    protected void p2(org.apache.tools.ant.util.j0 j0Var, File file, File file2, InputStream inputStream, String str, Date date, boolean z10, org.apache.tools.ant.util.g0 g0Var) throws IOException {
        boolean z11;
        String[] strArr;
        char c10;
        boolean z12;
        String strSubstring = str;
        boolean zIsEmpty = str.isEmpty();
        char c11 = IOUtils.DIR_SEPARATOR_UNIX;
        boolean z13 = !zIsEmpty && (strSubstring.charAt(0) == File.separatorChar || strSubstring.charAt(0) == '/' || strSubstring.charAt(0) == '\\');
        if (this.f135762s && z13) {
            x1("stripped absolute path spec from " + strSubstring, 3);
            strSubstring = strSubstring.substring(1);
        }
        boolean z14 = Boolean.TRUE == q2() || (q2() == null && !this.f135762s && z13);
        List<org.apache.tools.ant.types.w0> list = this.f135758o;
        if (list != null && !list.isEmpty()) {
            String strReplace = strSubstring.replace(IOUtils.DIR_SEPARATOR_UNIX, File.separatorChar).replace(IOUtils.DIR_SEPARATOR_WINDOWS, File.separatorChar);
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (org.apache.tools.ant.types.w0 w0Var : this.f135758o) {
                String[] strArrS2 = w0Var.s2(b());
                if (strArrS2 == null || strArrS2.length == 0) {
                    strArrS2 = new String[]{org.apache.tools.ant.types.selectors.m0.f136554a};
                }
                int length = strArrS2.length;
                int i10 = 0;
                while (i10 < length) {
                    int i11 = length;
                    String[] strArr2 = strArrS2;
                    String strReplace2 = strArrS2[i10].replace(c11, File.separatorChar).replace(IOUtils.DIR_SEPARATOR_WINDOWS, File.separatorChar);
                    if (strReplace2.endsWith(File.separator)) {
                        strReplace2 = strReplace2 + org.apache.tools.ant.types.selectors.m0.f136554a;
                    }
                    hashSet.add(strReplace2);
                    i10++;
                    length = i11;
                    strArrS2 = strArr2;
                    c11 = IOUtils.DIR_SEPARATOR_UNIX;
                }
                String[] strArrR2 = w0Var.r2(b());
                if (strArrR2 != null) {
                    int length2 = strArrR2.length;
                    int i12 = 0;
                    while (i12 < length2) {
                        String[] strArr3 = strArrR2;
                        String strReplace3 = strArrR2[i12].replace(IOUtils.DIR_SEPARATOR_UNIX, File.separatorChar).replace(IOUtils.DIR_SEPARATOR_WINDOWS, File.separatorChar);
                        if (strReplace3.endsWith(File.separator)) {
                            strReplace3 = strReplace3 + org.apache.tools.ant.types.selectors.m0.f136554a;
                        }
                        hashSet2.add(strReplace3);
                        i12++;
                        strArrR2 = strArr3;
                    }
                }
                c11 = IOUtils.DIR_SEPARATOR_UNIX;
            }
            Iterator it = hashSet.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (org.apache.tools.ant.types.selectors.m0.j((String) it.next(), strReplace)) {
                        z12 = true;
                        break;
                    }
                } else {
                    z12 = false;
                    break;
                }
            }
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                if (org.apache.tools.ant.types.selectors.m0.j((String) it2.next(), strReplace)) {
                    z12 = false;
                    break;
                }
            }
            if (!z12) {
                x1("skipping " + strSubstring + " as it is excluded or not included.", 3);
                return;
            }
        }
        String[] strArrY0 = g0Var.y0(strSubstring);
        if (strArrY0 == null || strArrY0.length == 0) {
            z11 = true;
            c10 = 0;
            strArr = new String[]{strSubstring};
        } else {
            strArr = strArrY0;
            z11 = true;
            c10 = 0;
        }
        File fileN0 = j0Var.n0(file2, strArr[c10]);
        if (!z14 && !j0Var.Z(file2, fileN0, z11)) {
            x1("skipping " + strSubstring + " as its target " + fileN0.getCanonicalPath() + " is outside of " + file2.getCanonicalPath() + ".", 3);
            return;
        }
        try {
            if (!this.f135756m && fileN0.exists() && fileN0.lastModified() >= date.getTime()) {
                x1("Skipping " + fileN0 + " as it is up-to-date", 4);
                return;
            }
            x1("expanding " + strSubstring + " to " + fileN0, 3);
            File parentFile = fileN0.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            if (z10) {
                fileN0.mkdirs();
            } else {
                byte[] bArr = new byte[1024];
                OutputStream outputStreamNewOutputStream = Files.newOutputStream(fileN0.toPath(), new OpenOption[0]);
                while (true) {
                    try {
                        int i13 = inputStream.read(bArr);
                        if (i13 < 0) {
                            break;
                        } else {
                            outputStreamNewOutputStream.write(bArr, 0, i13);
                        }
                    } catch (Throwable th2) {
                        if (outputStreamNewOutputStream == null) {
                            throw th2;
                        }
                        try {
                            outputStreamNewOutputStream.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                    X1("Unable to expand to file " + fileN0.getPath(), e, 1);
                }
                if (outputStreamNewOutputStream != null) {
                    outputStreamNewOutputStream.close();
                }
            }
            j0Var.p0(fileN0, date.getTime());
        } catch (FileNotFoundException e10) {
            X1("Unable to expand to file " + fileN0.getPath(), e10, 1);
        }
    }

    public Boolean q2() {
        return this.f135764u;
    }

    public String r2() {
        return this.f135765v;
    }

    public boolean s2() {
        return this.f135761r;
    }

    protected org.apache.tools.ant.util.g0 t2() {
        org.apache.tools.ant.types.k0 k0Var = this.f135757n;
        return k0Var != null ? k0Var.i2() : new org.apache.tools.ant.util.q0();
    }

    public boolean u2() {
        return this.f135763t;
    }

    protected void v2(String str) {
        if (f135750w.equals(str)) {
            str = null;
        }
        this.f135765v = str;
    }

    protected void w2(boolean z10) {
        this.f135763t = z10;
    }

    public void x2(boolean z10) {
        this.f135764u = Boolean.valueOf(z10);
    }

    public void y2(File file) {
        this.f135754k = file;
    }

    public void z2(String str) {
        v2(str);
    }
}
