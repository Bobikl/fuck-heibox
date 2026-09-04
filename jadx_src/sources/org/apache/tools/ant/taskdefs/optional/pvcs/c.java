package org.apache.tools.ant.taskdefs.optional.pvcs;

import com.tencent.qcloud.core.util.IOUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.text.MessageFormat;
import java.text.ParseException;
import java.util.Iterator;
import java.util.Random;
import java.util.Vector;
import java.util.function.Function;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.d5;
import org.apache.tools.ant.taskdefs.n1;
import org.apache.tools.ant.taskdefs.optional.vss.g;
import org.apache.tools.ant.taskdefs.q1;
import org.apache.tools.ant.taskdefs.r3;
import org.apache.tools.ant.taskdefs.s3;
import org.apache.tools.ant.types.o;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.util.j0;

/* JADX INFO: compiled from: Pvcs.java */
/* JADX INFO: loaded from: classes5.dex */
public class c extends u2 {
    private static final int A = 2;
    private static final int B = 3;
    private static final String C = "pcli";
    private static final String D = "get";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f135298z = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f135307s;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f135312x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f135313y;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f135301m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Vector<d> f135302n = new Vector<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f135303o = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f135300l = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f135299k = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f135304p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f135305q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f135306r = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f135308t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f135309u = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f135311w = "\"P:";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f135310v = "{0}-arc({1})";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String C2(String str) {
        return str.replace(IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator D2(BufferedReader bufferedReader) {
        return bufferedReader.lines().map(new Function() { // from class: org.apache.tools.ant.taskdefs.optional.pvcs.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return c.C2((String) obj);
            }
        }).iterator();
    }

    private void E2(File file, File file2) throws IOException {
        final BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
            try {
                Iterator it = new Iterable() { // from class: org.apache.tools.ant.taskdefs.optional.pvcs.b
                    @Override // java.lang.Iterable
                    public final Iterator iterator() {
                        return c.D2(bufferedReader);
                    }
                }.iterator();
                while (it.hasNext()) {
                    bufferedWriter.write((String) it.next());
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
                bufferedReader.close();
            } catch (Throwable th2) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            try {
                bufferedReader.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    private void l2(File file) throws IOException, ParseException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            MessageFormat messageFormat = new MessageFormat(o2());
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                x1("Considering \"" + line + "\"", 3);
                if (line.startsWith("\"\\") || line.startsWith("\"/") || (line.length() > 3 && line.startsWith("\"") && Character.isLetter(line.charAt(1)) && String.valueOf(line.charAt(2)).equals(":") && String.valueOf(line.charAt(3)).equals("\\"))) {
                    String str = (String) messageFormat.parse(line)[1];
                    int iLastIndexOf = str.lastIndexOf(File.separator);
                    if (iLastIndexOf > -1) {
                        File file2 = new File(str.substring(0, iLastIndexOf));
                        if (file2.exists()) {
                            x1(file2.getAbsolutePath() + " exists. Skipping", 3);
                        } else {
                            x1("Creating " + file2.getAbsolutePath(), 3);
                            if (file2.mkdirs() || file2.isDirectory()) {
                                x1("Created " + file2.getAbsolutePath(), 2);
                            } else {
                                x1("Failed to create " + file2.getAbsolutePath(), 2);
                            }
                        }
                    } else {
                        x1("File separator problem with " + line, 1);
                    }
                } else {
                    x1("Skipped \"" + line + "\"", 3);
                }
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

    private String n2(String str) {
        StringBuilder sb2 = new StringBuilder();
        if (u2() != null) {
            String str2 = this.f135299k;
            String str3 = File.separator;
            if (str2.endsWith(str3)) {
                sb2.append(this.f135299k);
            } else {
                sb2.append(this.f135299k);
                sb2.append(str3);
            }
        }
        sb2.append(str);
        return sb2.toString();
    }

    public String A2() {
        return this.f135312x;
    }

    public String B2() {
        return this.f135303o;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0332  */
    /* JADX WARN: Code duplicated, block: B:109:0x0337  */
    @Override // org.apache.tools.ant.u2
    public void D1() throws Throwable {
        File file;
        String str = this.f135300l;
        if (str == null || str.trim().isEmpty()) {
            throw new BuildException("Required argument repository not specified");
        }
        o oVar = new o();
        oVar.w(n2(C));
        oVar.h().O1("lvf");
        oVar.h().O1("-z");
        oVar.h().O1("-aw");
        if (B2() != null) {
            oVar.h().O1("-sp" + B2());
        }
        oVar.h().O1("-pr" + x2());
        String strA2 = A2();
        if (strA2 != null) {
            oVar.h().O1("-id" + strA2);
        }
        if (v2() == null && w2().isEmpty()) {
            this.f135301m = "/";
        }
        if (v2() != null) {
            oVar.h().O1(v2());
        }
        if (!w2().isEmpty()) {
            Iterator<d> it = w2().iterator();
            while (it.hasNext()) {
                String strA = it.next().a();
                if (strA == null || strA.trim().isEmpty()) {
                    throw new BuildException("name is a required attribute of pvcsproject");
                }
                oVar.h().O1(strA);
            }
        }
        File file2 = null;
        try {
            Random random = new Random(System.currentTimeMillis());
            File file3 = new File("pvcs_ant_" + random.nextLong() + ".log");
            try {
                OutputStream outputStreamNewOutputStream = Files.newOutputStream(file3.toPath(), new OpenOption[0]);
                file = new File("pvcs_ant_" + random.nextLong() + ".log");
                try {
                    x1(oVar.o(), 3);
                    try {
                        int iF2 = F2(oVar, new d5(outputStreamNewOutputStream, new r3((u2) this, 1)));
                        j0.d(outputStreamNewOutputStream);
                        if (n1.o(iF2) && !this.f135308t) {
                            throw new BuildException("Failed executing: " + oVar.toString(), w1());
                        }
                        if (!file3.exists()) {
                            throw new BuildException("Communication between ant and pvcs failed. No output generated from executing PVCS commandline interface \"pcli\" and \"get\"");
                        }
                        x1("Creating folders", 2);
                        l2(file3);
                        E2(file3, file);
                        oVar.g();
                        oVar.w(n2(D));
                        if (m2() != null && !m2().isEmpty()) {
                            oVar.h().O1("-c" + m2());
                        }
                        if (p2() == null || !p2().equals("yes")) {
                            oVar.h().O1(g.X2);
                        } else {
                            oVar.h().O1("-Y");
                        }
                        if (t2() != null) {
                            oVar.h().O1("-G" + t2());
                        } else if (r2() != null) {
                            oVar.h().O1("-v" + r2());
                        } else if (y2() != null) {
                            oVar.h().O1("-r" + y2());
                        }
                        if (this.f135309u) {
                            oVar.h().O1(g.f135457f3);
                        }
                        oVar.h().O1("@" + file.getAbsolutePath());
                        x1("Getting files", 2);
                        x1("Executing " + oVar.toString(), 3);
                        int iF3 = F2(oVar, new s3((u2) this, 2, 1));
                        if (iF3 != 0 && !this.f135308t) {
                            throw new BuildException("Failed executing: " + oVar.toString() + ". Return code was " + iF3, w1());
                        }
                        file3.delete();
                        file.delete();
                    } catch (Throwable th2) {
                        j0.d(outputStreamNewOutputStream);
                        throw th2;
                    }
                } catch (IOException e10) {
                    e = e10;
                    file2 = file3;
                    try {
                        throw new BuildException("Failed executing: " + oVar.toString() + ". Exception: " + e.getMessage(), w1());
                    } catch (Throwable th3) {
                        th = th3;
                        if (file2 != null) {
                            file2.delete();
                        }
                        if (file != null) {
                            file.delete();
                        }
                        throw th;
                    }
                } catch (ParseException e11) {
                    e = e11;
                    file2 = file3;
                    throw new BuildException("Failed executing: " + oVar.toString() + ". Exception: " + e.getMessage(), w1());
                } catch (Throwable th4) {
                    th = th4;
                    file2 = file3;
                    if (file2 != null) {
                        file2.delete();
                    }
                    if (file != null) {
                        file.delete();
                    }
                    throw th;
                }
            } catch (IOException e12) {
                e = e12;
                file = null;
                file2 = file3;
                throw new BuildException("Failed executing: " + oVar.toString() + ". Exception: " + e.getMessage(), w1());
            } catch (ParseException e13) {
                e = e13;
                file = null;
                file2 = file3;
                throw new BuildException("Failed executing: " + oVar.toString() + ". Exception: " + e.getMessage(), w1());
            } catch (Throwable th5) {
                th = th5;
                file = null;
            }
        } catch (IOException e14) {
            e = e14;
            file = null;
            throw new BuildException("Failed executing: " + oVar.toString() + ". Exception: " + e.getMessage(), w1());
        } catch (ParseException e15) {
            e = e15;
            file = null;
            throw new BuildException("Failed executing: " + oVar.toString() + ". Exception: " + e.getMessage(), w1());
        } catch (Throwable th6) {
            th = th6;
            file = null;
        }
    }

    protected int F2(o oVar, q1 q1Var) {
        try {
            Project projectB = b();
            n1 n1Var = new n1(q1Var);
            n1Var.w(projectB);
            n1Var.E(projectB.Z());
            n1Var.x(oVar.s());
            return n1Var.e();
        } catch (IOException e10) {
            throw new BuildException("Failed executing: " + oVar.toString() + ". Exception: " + e10.getMessage(), w1());
        }
    }

    public void G2(File file) {
        this.f135313y = file.toString();
    }

    public void H2(String str) {
        this.f135310v = str;
    }

    public void I2(String str) {
        this.f135304p = "yes".equalsIgnoreCase(str) ? "yes" : "no";
    }

    public void J2(boolean z10) {
        this.f135308t = z10;
    }

    public void K2(String str) {
        this.f135306r = str;
    }

    public void L2(String str) {
        this.f135311w = str;
    }

    public void M2(String str) {
        this.f135305q = str;
    }

    public void N2(String str) {
        this.f135299k = str;
    }

    public void O2(String str) {
        this.f135301m = str;
    }

    public void P2(String str) {
        this.f135300l = str;
    }

    public void Q2(String str) {
        this.f135307s = str;
    }

    public void R2(boolean z10) {
        this.f135309u = z10;
    }

    public void S2(String str) {
        this.f135312x = str;
    }

    public void T2(String str) {
        this.f135303o = str;
    }

    public void k2(d dVar) {
        this.f135302n.addElement(dVar);
    }

    public String m2() {
        return this.f135313y;
    }

    public String o2() {
        return this.f135310v;
    }

    public String p2() {
        return this.f135304p;
    }

    public boolean q2() {
        return this.f135308t;
    }

    public String r2() {
        return this.f135306r;
    }

    public String s2() {
        return this.f135311w;
    }

    public String t2() {
        return this.f135305q;
    }

    public String u2() {
        return this.f135299k;
    }

    public String v2() {
        return this.f135301m;
    }

    public Vector<d> w2() {
        return this.f135302n;
    }

    public String x2() {
        return this.f135300l;
    }

    public String y2() {
        return this.f135307s;
    }

    public boolean z2() {
        return this.f135309u;
    }
}
