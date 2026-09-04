package org.apache.tools.ant.taskdefs.optional;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.LongPredicate;
import java.util.function.ToLongFunction;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.h4;
import org.apache.tools.ant.taskdefs.j1;
import org.apache.tools.ant.taskdefs.k6;
import org.apache.tools.ant.taskdefs.n1;
import org.apache.tools.ant.taskdefs.r3;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.util.j0;
import org.apache.tools.ant.v0;

/* JADX INFO: compiled from: Cab.java */
/* JADX INFO: loaded from: classes5.dex */
public class e extends h4 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f134833s = -99;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final j0 f134834t = j0.O();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private File f134835l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private File f134836m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f134839p;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f134837n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f134838o = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f134840q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected String f134841r = "cab";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void I2(StringBuilder sb2, String str) {
        sb2.append(str);
        sb2.append("\n");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ File J2(String str) {
        return f134834t.n0(this.f134836m, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean K2(long j10, long j11) {
        return j11 < j10;
    }

    public void B2(org.apache.tools.ant.types.b0 b0Var) {
        if (this.f134840q) {
            throw new BuildException("Only one nested fileset allowed");
        }
        this.f134840q = true;
        this.f134236k = b0Var;
    }

    protected void C2(Vector<String> vector, v0 v0Var) {
        Collections.addAll(vector, v0Var.m());
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        D2();
        Vector<String> vectorG2 = G2();
        if (H2(vectorG2)) {
            return;
        }
        log("Building " + this.f134841r + ": " + this.f134835l.getAbsolutePath());
        File fileG = null;
        if (org.apache.tools.ant.taskdefs.condition.z.b("windows")) {
            try {
                File fileF2 = F2(vectorG2);
                j1 j1VarE2 = E2();
                j1VarE2.I2(true);
                j1VarE2.D2(this.f134836m);
                if (!this.f134838o) {
                    fileG = f134834t.G(b(), "ant", "", null, true, true);
                    j1VarE2.P2(fileG);
                }
                j1VarE2.G2("cabarc");
                j1VarE2.l2().O1("-r");
                j1VarE2.l2().O1("-p");
                if (!this.f134837n) {
                    j1VarE2.l2().O1("-m");
                    j1VarE2.l2().O1("none");
                }
                if (this.f134839p != null) {
                    j1VarE2.l2().H1(this.f134839p);
                }
                j1VarE2.l2().O1("n");
                j1VarE2.l2().G1(this.f134835l);
                j1VarE2.l2().O1("@" + fileF2.getAbsolutePath());
                j1VarE2.D1();
                if (fileG != null) {
                    fileG.delete();
                }
                fileF2.delete();
                return;
            } catch (IOException e10) {
                throw new BuildException("Problem creating " + this.f134835l + " " + e10.getMessage(), w1());
            }
        }
        x1("Using listcab/libcabinet", 3);
        final StringBuilder sb2 = new StringBuilder();
        vectorG2.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.optional.d
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                e.I2(sb2, (String) obj);
            }
        });
        sb2.append("\n");
        sb2.append(this.f134835l.getAbsolutePath());
        sb2.append("\n");
        try {
            Project projectB = b();
            String[] strArr = {"listcab"};
            File fileZ = this.f134836m;
            if (fileZ == null) {
                fileZ = b().Z();
            }
            Process processT = n1.t(projectB, strArr, null, fileZ, true);
            OutputStream outputStream = processT.getOutputStream();
            r3 r3Var = new r3((u2) this, 3);
            r3 r3Var2 = new r3((u2) this, 0);
            k6 k6Var = new k6(processT.getInputStream(), r3Var);
            k6 k6Var2 = new k6(processT.getErrorStream(), r3Var2);
            new Thread(k6Var).start();
            new Thread(k6Var2).start();
            outputStream.write(sb2.toString().getBytes());
            outputStream.flush();
            outputStream.close();
            int iWaitFor = -99;
            try {
                iWaitFor = processT.waitFor();
                k6Var.h();
                r3Var.close();
                k6Var2.h();
                r3Var2.close();
            } catch (InterruptedException e11) {
                log("Thread interrupted: " + e11);
            }
            if (n1.o(iWaitFor)) {
                log("Error executing listcab; error code: " + iWaitFor);
            }
        } catch (IOException e12) {
            throw new BuildException("Problem creating " + this.f134835l + " " + e12.getMessage(), w1());
        }
    }

    protected void D2() throws BuildException {
        File file = this.f134836m;
        if (file == null && !this.f134840q) {
            throw new BuildException("basedir attribute or one nested fileset is required!", w1());
        }
        if (file != null && !file.exists()) {
            throw new BuildException("basedir does not exist!", w1());
        }
        if (this.f134836m != null && this.f134840q) {
            throw new BuildException("Both basedir attribute and a nested fileset is not allowed");
        }
        if (this.f134835l == null) {
            throw new BuildException("cabfile attribute must be set!", w1());
        }
    }

    protected j1 E2() throws BuildException {
        return new j1(this);
    }

    protected File F2(Vector<String> vector) throws IOException {
        File fileG = f134834t.G(b(), "ant", "", null, true, true);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileG));
        try {
            Iterator<String> it = vector.iterator();
            while (it.hasNext()) {
                bufferedWriter.write(String.format("\"%s\"", it.next()));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            return fileG;
        } catch (Throwable th2) {
            try {
                bufferedWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    protected Vector<String> G2() throws BuildException {
        Vector<String> vector = new Vector<>();
        File file = this.f134836m;
        if (file != null) {
            C2(vector, super.p2(file));
        } else {
            this.f134836m = this.f134236k.y2();
            C2(vector, this.f134236k.B2(b()));
        }
        return vector;
    }

    protected boolean H2(Vector<String> vector) {
        final long jLastModified = this.f134835l.lastModified();
        return vector.stream().map(new Function() { // from class: org.apache.tools.ant.taskdefs.optional.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f134674a.J2((String) obj);
            }
        }).mapToLong(new ToLongFunction() { // from class: org.apache.tools.ant.taskdefs.optional.b
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                return ((File) obj).lastModified();
            }
        }).allMatch(new LongPredicate() { // from class: org.apache.tools.ant.taskdefs.optional.c
            @Override // java.util.function.LongPredicate
            public final boolean test(long j10) {
                return e.K2(jLastModified, j10);
            }
        });
    }

    public void L2(File file) {
        this.f134836m = file;
    }

    public void M2(File file) {
        this.f134835l = file;
    }

    public void N2(boolean z10) {
        this.f134837n = z10;
    }

    public void O2(String str) {
        this.f134839p = str;
    }

    public void P2(boolean z10) {
        this.f134838o = z10;
    }
}
