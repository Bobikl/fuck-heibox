package org.apache.tools.ant.taskdefs;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.function.Consumer;
import java.util.function.Function;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: ManifestTask.java */
/* JADX INFO: loaded from: classes5.dex */
public class g4 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f134208q = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private File f134210l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private a f134211m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f134212n;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private y3 f134209k = new y3();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f134213o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f134214p = false;

    /* JADX INFO: compiled from: ManifestTask.java */
    public static class a extends org.apache.tools.ant.types.w {
        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{"update", org.apache.tools.ant.taskdefs.optional.vss.g.K2};
        }
    }

    public g4() {
        a aVar = new a();
        this.f134211m = aVar;
        aVar.g(org.apache.tools.ant.taskdefs.optional.vss.g.K2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m2(y3.a aVar) throws BuildException {
        String strD = aVar.d();
        char cCharAt = strD.charAt(0);
        if (cCharAt == '-' || cCharAt == '_') {
            throw new BuildException("Manifest attribute names must not start with '%c'.", Character.valueOf(cCharAt));
        }
        for (int i10 = 0; i10 < strD.length(); i10++) {
            char cCharAt2 = strD.charAt(i10);
            if (f134208q.indexOf(cCharAt2) < 0) {
                throw new BuildException("Manifest attribute names must not contain '%c'", Character.valueOf(cCharAt2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n2(String str) {
        x1("Manifest warning: " + str, 1);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ae A[Catch: ManifestException -> 0x012d, TryCatch #1 {ManifestException -> 0x012d, blocks: (B:33:0x00a0, B:35:0x00ae, B:38:0x00b8, B:41:0x00c1, B:42:0x00c2), top: B:70:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8 A[Catch: ManifestException -> 0x012d, TryCatch #1 {ManifestException -> 0x012d, blocks: (B:33:0x00a0, B:35:0x00ae, B:38:0x00b8, B:41:0x00c1, B:42:0x00c2), top: B:70:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c1 A[Catch: ManifestException -> 0x012d, TryCatch #1 {ManifestException -> 0x012d, blocks: (B:33:0x00a0, B:35:0x00ae, B:38:0x00b8, B:41:0x00c1, B:42:0x00c2), top: B:70:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f9 A[Catch: IOException -> 0x010f, TRY_ENTER, TRY_LEAVE, TryCatch #7 {IOException -> 0x010f, blocks: (B:47:0x00d6, B:50:0x00f9, B:59:0x010e, B:58:0x010b, B:48:0x00ee, B:52:0x00fd, B:53:0x0104, B:55:0x0106), top: B:75:0x00d6, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00fd A[Catch: all -> 0x0105, TRY_ENTER, TryCatch #4 {all -> 0x0105, blocks: (B:48:0x00ee, B:52:0x00fd, B:53:0x0104), top: B:71:0x00ee, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        BuildException buildException;
        PrintWriter printWriter;
        ManifestException e10;
        y3 y3Var;
        IOException e11;
        if (this.f134210l == null) {
            throw new BuildException("the file attribute is required");
        }
        y3 y3VarG = y3.g();
        y3 y3Var2 = null;
        if (this.f134210l.exists()) {
            String str = this.f134212n;
            if (str == null) {
                str = "UTF-8";
            }
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(Files.newInputStream(this.f134210l.toPath(), new OpenOption[0]), Charset.forName(str));
                try {
                    y3Var = new y3(inputStreamReader);
                    try {
                        inputStreamReader.close();
                        buildException = null;
                    } catch (IOException e12) {
                        e11 = e12;
                        buildException = new BuildException("Failed to read " + this.f134210l, e11, w1());
                    } catch (ManifestException e13) {
                        e10 = e13;
                        buildException = new BuildException("Existing manifest " + this.f134210l + " is invalid", e10, w1());
                    }
                } catch (Throwable th2) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e14) {
                e11 = e14;
                y3Var = null;
                buildException = new BuildException("Failed to read " + this.f134210l, e11, w1());
                y3Var2 = y3Var;
                org.apache.tools.ant.util.h2.a(this.f134209k.l()).forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.d4
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        this.f134042b.n2((String) obj);
                    }
                });
                if ("update".equals(this.f134211m.d())) {
                    if (y3Var2 != null) {
                        y3VarG.p(y3Var2, false, this.f134213o);
                    } else if (buildException != null) {
                        throw buildException;
                    }
                }
                y3VarG.p(this.f134209k, false, this.f134213o);
                if (y3VarG.equals(y3Var2)) {
                    x1("Manifest has not changed, do not recreate", 3);
                    return;
                }
                try {
                    printWriter = new PrintWriter(new OutputStreamWriter(Files.newOutputStream(this.f134210l.toPath(), new OpenOption[0]), y3.f135974n));
                    try {
                        y3VarG.r(printWriter, this.f134214p);
                        if (printWriter.checkError()) {
                            throw new IOException("Encountered an error writing manifest");
                        }
                        printWriter.close();
                        return;
                    } catch (Throwable th4) {
                        try {
                            printWriter.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (IOException e15) {
                    throw new BuildException("Failed to write " + this.f134210l, e15, w1());
                }
                throw new BuildException("Failed to write " + this.f134210l, e15, w1());
            } catch (ManifestException e16) {
                e10 = e16;
                y3Var = null;
                buildException = new BuildException("Existing manifest " + this.f134210l + " is invalid", e10, w1());
                y3Var2 = y3Var;
                org.apache.tools.ant.util.h2.a(this.f134209k.l()).forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.d4
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        this.f134042b.n2((String) obj);
                    }
                });
                if ("update".equals(this.f134211m.d())) {
                    if (y3Var2 != null) {
                        y3VarG.p(y3Var2, false, this.f134213o);
                    } else if (buildException != null) {
                        throw buildException;
                    }
                }
                y3VarG.p(this.f134209k, false, this.f134213o);
                if (y3VarG.equals(y3Var2)) {
                    x1("Manifest has not changed, do not recreate", 3);
                    return;
                }
                printWriter = new PrintWriter(new OutputStreamWriter(Files.newOutputStream(this.f134210l.toPath(), new OpenOption[0]), y3.f135974n));
                y3VarG.r(printWriter, this.f134214p);
                if (printWriter.checkError()) {
                    throw new IOException("Encountered an error writing manifest");
                }
                printWriter.close();
                return;
                throw new BuildException("Failed to write " + this.f134210l, e15, w1());
            }
            y3Var2 = y3Var;
        } else {
            buildException = null;
        }
        org.apache.tools.ant.util.h2.a(this.f134209k.l()).forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.d4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f134042b.n2((String) obj);
            }
        });
        try {
            if ("update".equals(this.f134211m.d()) && this.f134210l.exists()) {
                if (y3Var2 != null) {
                    y3VarG.p(y3Var2, false, this.f134213o);
                } else if (buildException != null) {
                    throw buildException;
                }
            }
            y3VarG.p(this.f134209k, false, this.f134213o);
            if (y3VarG.equals(y3Var2)) {
                x1("Manifest has not changed, do not recreate", 3);
                return;
            }
            printWriter = new PrintWriter(new OutputStreamWriter(Files.newOutputStream(this.f134210l.toPath(), new OpenOption[0]), y3.f135974n));
            y3VarG.r(printWriter, this.f134214p);
            if (printWriter.checkError()) {
                throw new IOException("Encountered an error writing manifest");
            }
            printWriter.close();
            return;
            throw new BuildException("Failed to write " + this.f134210l, e15, w1());
        } catch (ManifestException e17) {
            throw new BuildException("Manifest is invalid", e17, w1());
        }
    }

    public void k2(y3.a aVar) throws ManifestException {
        m2(aVar);
        this.f134209k.e(aVar);
    }

    public void l2(final y3.b bVar) throws ManifestException {
        org.apache.tools.ant.util.h2.a(bVar.g()).map(new Function() { // from class: org.apache.tools.ant.taskdefs.e4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return bVar.f((String) obj);
            }
        }).forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.f4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f134147b.m2((y3.a) obj);
            }
        });
        this.f134209k.f(bVar);
    }

    public void o2(String str) {
        this.f134212n = str;
    }

    public void p2(File file) {
        this.f134210l = file;
    }

    public void q2(boolean z10) {
        this.f134214p = z10;
    }

    public void r2(boolean z10) {
        this.f134213o = z10;
    }

    public void s2(a aVar) {
        this.f134211m = aVar;
    }
}
