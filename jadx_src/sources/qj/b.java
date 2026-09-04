package qj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.h4;
import org.apache.tools.ant.types.b0;
import org.apache.tools.ant.util.j0;
import org.apache.tools.ant.util.z0;
import org.apache.tools.ant.v0;

/* JADX INFO: compiled from: Translate.java */
/* JADX INFO: loaded from: classes5.dex */
public class b extends h4 {
    private static final int C = 0;
    private static final int D = 1;
    private static final int E = 2;
    private static final int F = 3;
    private static final int G = 4;
    private static final int H = 5;
    private static final int I = 6;
    private static final int J = 7;
    private static final j0 K = j0.O();
    private long A;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f138671l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f138672m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f138673n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f138674o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private File f138675p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f138676q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f138677r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f138678s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f138679t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f138680u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f138681v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f138685z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List<b0> f138682w = new Vector();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Map<String, String> f138683x = new Hashtable();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long[] f138684y = new long[7];
    private boolean B = false;

    private void A2() throws BuildException {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Locale locale = new Locale(this.f138672m, this.f138673n, this.f138674o);
        String str6 = "";
        if (locale.getLanguage().isEmpty()) {
            str = "";
        } else {
            str = lg.a.f131412e + locale.getLanguage();
        }
        if (locale.getCountry().isEmpty()) {
            str2 = "";
        } else {
            str2 = lg.a.f131412e + locale.getCountry();
        }
        if (locale.getVariant().isEmpty()) {
            str3 = "";
        } else {
            str3 = lg.a.f131412e + locale.getVariant();
        }
        B2(this.f138671l + str + str2 + str3, 0, false);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f138671l);
        sb2.append(str);
        sb2.append(str2);
        B2(sb2.toString(), 1, false);
        B2(this.f138671l + str, 2, false);
        B2(this.f138671l, 3, false);
        Locale locale2 = Locale.getDefault();
        if (locale2.getLanguage().isEmpty()) {
            str4 = "";
        } else {
            str4 = lg.a.f131412e + locale2.getLanguage();
        }
        if (locale2.getCountry().isEmpty()) {
            str5 = "";
        } else {
            str5 = lg.a.f131412e + locale2.getCountry();
        }
        if (!locale2.getVariant().isEmpty()) {
            str6 = lg.a.f131412e + locale2.getVariant();
        }
        this.f138678s = System.getProperty("file.encoding");
        B2(this.f138671l + str4 + str5 + str6, 4, false);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f138671l);
        sb3.append(str4);
        sb3.append(str5);
        B2(sb3.toString(), 5, false);
        B2(this.f138671l + str4, 6, true);
    }

    private void B2(String str, int i10, boolean z10) throws BuildException {
        File fileW0 = b().W0(str + ".properties");
        try {
            InputStream inputStreamNewInputStream = Files.newInputStream(fileW0.toPath(), new OpenOption[0]);
            this.B = true;
            this.f138684y[i10] = fileW0.lastModified();
            x1("Using " + fileW0, 4);
            z2(inputStreamNewInputStream);
        } catch (IOException e10) {
            x1(fileW0 + " not found.", 4);
            if (!this.B && z10) {
                throw new BuildException(e10.getMessage(), w1());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0088  */
    /* JADX WARN: Code duplicated, block: B:27:0x008c A[Catch: IOException -> 0x00db, TryCatch #1 {IOException -> 0x00db, blocks: (B:8:0x0029, B:15:0x005d, B:17:0x0078, B:27:0x008c, B:33:0x009c, B:35:0x00a1, B:36:0x00bb, B:14:0x0045, B:9:0x0031, B:11:0x0040), top: B:46:0x0029, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0096  */
    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    /* JADX WARN: Code duplicated, block: B:33:0x009c A[Catch: IOException -> 0x00db, LOOP:2: B:25:0x0089->B:33:0x009c, LOOP_END, TryCatch #1 {IOException -> 0x00db, blocks: (B:8:0x0029, B:15:0x005d, B:17:0x0078, B:27:0x008c, B:33:0x009c, B:35:0x00a1, B:36:0x00bb, B:14:0x0045, B:9:0x0031, B:11:0x0040), top: B:46:0x0029, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a1 A[Catch: IOException -> 0x00db, TryCatch #1 {IOException -> 0x00db, blocks: (B:8:0x0029, B:15:0x005d, B:17:0x0078, B:27:0x008c, B:33:0x009c, B:35:0x00a1, B:36:0x00bb, B:14:0x0045, B:9:0x0031, B:11:0x0040), top: B:46:0x0029, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00bb A[Catch: IOException -> 0x00db, TRY_LEAVE, TryCatch #1 {IOException -> 0x00db, blocks: (B:8:0x0029, B:15:0x005d, B:17:0x0078, B:27:0x008c, B:33:0x009c, B:35:0x00a1, B:36:0x00bb, B:14:0x0045, B:9:0x0031, B:11:0x0040), top: B:46:0x0029, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x009b A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x00a1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x00bb, please report this as an issue */
    private void N2() throws BuildException {
        v0 v0Var;
        boolean z10;
        int i10;
        Iterator<b0> it = this.f138682w.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            v0 v0VarB2 = it.next().B2(b());
            String[] strArrM = v0VarB2.m();
            int length = strArrM.length;
            int i12 = i11;
            int i13 = 0;
            while (i13 < length) {
                String str = strArrM[i13];
                try {
                    File fileN0 = K.n0(this.f138675p, str);
                    try {
                        File file = new File(fileN0.getParent());
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                    } catch (Exception e10) {
                        x1("Exception occurred while trying to check/create  parent directory.  " + e10.getMessage(), 4);
                    }
                    this.A = fileN0.lastModified();
                    File fileN1 = K.n0(v0VarB2.f(), str);
                    long jLastModified = fileN1.lastModified();
                    this.f138685z = jLastModified;
                    if (this.f138681v) {
                        v0Var = v0VarB2;
                    } else {
                        v0Var = v0VarB2;
                        if (this.A >= jLastModified) {
                            z10 = false;
                        }
                        if (!z10) {
                            for (i10 = 0; i10 < 7; i10++) {
                                if (this.A < this.f138684y[i10]) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    break;
                                }
                            }
                        }
                        if (z10) {
                            x1("Processing " + str, 4);
                            O2(fileN1, fileN0);
                            i12++;
                        } else {
                            x1("Skipping " + str + " as destination file is up to date", 3);
                        }
                        i13++;
                        v0VarB2 = v0Var;
                    }
                    z10 = true;
                    if (!z10) {
                        while (i10 < 7) {
                            if (this.A < this.f138684y[i10]) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                break;
                                break;
                            }
                        }
                    }
                    if (z10) {
                        x1("Processing " + str, 4);
                        O2(fileN1, fileN0);
                        i12++;
                    } else {
                        x1("Skipping " + str + " as destination file is up to date", 3);
                    }
                    i13++;
                    v0VarB2 = v0Var;
                } catch (IOException e11) {
                    throw new BuildException(e11.getMessage(), w1());
                }
            }
            i11 = i12;
        }
        x1("Translation performed on " + i11 + " file(s).", 4);
    }

    private void O2(File file, File file2) throws IOException {
        String str;
        int length;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(file2.toPath(), new OpenOption[0]), this.f138677r));
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(file.toPath(), new OpenOption[0]), this.f138676q));
            try {
                z0 z0Var = new z0();
                z0Var.B1(true);
                String strH = z0Var.h(bufferedReader);
                while (strH != null) {
                    int iIndexOf = strH.indexOf(this.f138679t);
                    while (iIndexOf >= 0 && this.f138679t.length() + iIndexOf <= strH.length()) {
                        int iIndexOf2 = strH.indexOf(this.f138680u, this.f138679t.length() + iIndexOf);
                        if (iIndexOf2 < 0) {
                            length = iIndexOf + 1;
                        } else {
                            String strSubstring = strH.substring(this.f138679t.length() + iIndexOf, iIndexOf2);
                            boolean z10 = true;
                            for (int i10 = 0; i10 < strSubstring.length() && z10; i10++) {
                                char cCharAt = strSubstring.charAt(i10);
                                if (cCharAt == ':' || cCharAt == '=' || Character.isSpaceChar(cCharAt)) {
                                    z10 = false;
                                }
                            }
                            if (z10) {
                                if (this.f138683x.containsKey(strSubstring)) {
                                    str = this.f138683x.get(strSubstring);
                                } else {
                                    x1("Replacement string missing for: " + strSubstring, 3);
                                    str = this.f138679t + strSubstring + this.f138680u;
                                }
                                strH = strH.substring(0, iIndexOf) + str + strH.substring(iIndexOf2 + this.f138680u.length());
                                length = iIndexOf + str.length();
                            } else {
                                length = iIndexOf + 1;
                            }
                        }
                        iIndexOf = strH.indexOf(this.f138679t, length);
                    }
                    bufferedWriter.write(strH);
                    strH = z0Var.h(bufferedReader);
                }
                bufferedReader.close();
                bufferedWriter.close();
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            try {
                bufferedWriter.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    private void z2(InputStream inputStream) throws BuildException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, this.f138678s));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        return;
                    }
                    if (line.trim().length() > 1 && '#' != line.charAt(0) && '!' != line.charAt(0)) {
                        int iIndexOf = line.indexOf(61);
                        if (-1 == iIndexOf) {
                            iIndexOf = line.indexOf(58);
                        }
                        if (-1 == iIndexOf) {
                            for (int i10 = 0; i10 < line.length(); i10++) {
                                if (Character.isSpaceChar(line.charAt(i10))) {
                                    iIndexOf = i10;
                                    break;
                                }
                            }
                        }
                        if (-1 != iIndexOf) {
                            String strTrim = line.substring(0, iIndexOf).trim();
                            String strTrim2 = line.substring(iIndexOf + 1).trim();
                            while (strTrim2.endsWith("\\")) {
                                strTrim2 = strTrim2.substring(0, strTrim2.length() - 1);
                                String line2 = bufferedReader.readLine();
                                if (line2 == null) {
                                    break;
                                }
                                strTrim2 = strTrim2 + line2.trim();
                            }
                            if (!strTrim.isEmpty()) {
                                this.f138683x.putIfAbsent(strTrim, strTrim2);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException e10) {
            throw new BuildException(e10.getMessage(), w1());
        }
    }

    public void C2(String str) {
        this.f138671l = str;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        if (this.f138671l == null) {
            throw new BuildException("The bundle attribute must be set.", w1());
        }
        if (this.f138679t == null) {
            throw new BuildException("The starttoken attribute must be set.", w1());
        }
        if (this.f138680u == null) {
            throw new BuildException("The endtoken attribute must be set.", w1());
        }
        if (this.f138672m == null) {
            this.f138672m = Locale.getDefault().getLanguage();
        }
        if (this.f138673n == null) {
            this.f138673n = Locale.getDefault().getCountry();
        }
        if (this.f138674o == null) {
            this.f138674o = new Locale(this.f138672m, this.f138673n).getVariant();
        }
        File file = this.f138675p;
        if (file == null) {
            throw new BuildException("The todir attribute must be set.", w1());
        }
        if (!file.exists()) {
            this.f138675p.mkdirs();
        } else if (this.f138675p.isFile()) {
            throw new BuildException("%s is not a directory", this.f138675p);
        }
        if (this.f138676q == null) {
            this.f138676q = System.getProperty("file.encoding");
        }
        if (this.f138677r == null) {
            this.f138677r = this.f138676q;
        }
        if (this.f138678s == null) {
            this.f138678s = this.f138676q;
        }
        A2();
        N2();
    }

    public void D2(String str) {
        this.f138673n = str;
    }

    public void E2(String str) {
        this.f138678s = str;
    }

    public void F2(String str) {
        this.f138672m = str;
    }

    public void G2(String str) {
        this.f138674o = str;
    }

    public void H2(String str) {
        this.f138677r = str;
    }

    public void I2(String str) {
        this.f138680u = str;
    }

    public void J2(boolean z10) {
        this.f138681v = z10;
    }

    public void K2(String str) {
        this.f138676q = str;
    }

    public void L2(String str) {
        this.f138679t = str;
    }

    public void M2(File file) {
        this.f138675p = file;
    }

    public void y2(b0 b0Var) {
        this.f138682w.add(b0Var);
    }
}
