package org.apache.tools.ant.taskdefs;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.zip.GZIPInputStream;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Untar.java */
/* JADX INFO: loaded from: classes5.dex */
public class m7 extends t1 {
    private a A;

    /* JADX INFO: compiled from: Untar.java */
    public static final class a extends org.apache.tools.ant.types.w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f134511c = "none";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f134512d = "gzip";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f134513e = "bzip2";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f134514f = "xz";

        public a() {
            g("none");
        }

        private static InputStream i(InputStream inputStream) throws BuildException {
            try {
                return (InputStream) Class.forName("org.tukaani.xz.XZInputStream").asSubclass(InputStream.class).getConstructor(InputStream.class).newInstance(inputStream);
            } catch (ClassNotFoundException e10) {
                throw new BuildException("xz decompression requires the XZ for Java library", e10);
            } catch (IllegalAccessException e11) {
                e = e11;
                throw new BuildException("failed to create XZInputStream", e);
            } catch (InstantiationException e12) {
                e = e12;
                throw new BuildException("failed to create XZInputStream", e);
            } catch (NoSuchMethodException e13) {
                e = e13;
                throw new BuildException("failed to create XZInputStream", e);
            } catch (InvocationTargetException e14) {
                e = e14;
                throw new BuildException("failed to create XZInputStream", e);
            }
        }

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{"none", "gzip", f134513e, f134514f};
        }

        public InputStream h(String str, InputStream inputStream) throws IOException, BuildException {
            String strD = d();
            if ("gzip".equals(strD)) {
                return new GZIPInputStream(inputStream);
            }
            if (f134514f.equals(strD)) {
                return i(inputStream);
            }
            if (!f134513e.equals(strD)) {
                return inputStream;
            }
            char[] cArr = {'B', 'Z'};
            for (int i10 = 0; i10 < 2; i10++) {
                if (inputStream.read() != cArr[i10]) {
                    throw new BuildException("Invalid bz2 file." + str);
                }
            }
            return new org.apache.tools.bzip2.c(inputStream);
        }
    }

    public m7() {
        super(null);
        this.A = new a();
    }

    private void F2(String str, InputStream inputStream, File file) throws IOException {
        org.apache.tools.tar.f fVar = new org.apache.tools.tar.f(this.A.h(str, new BufferedInputStream(inputStream)), r2());
        try {
            x1("Expanding: " + str + " into " + file, 2);
            org.apache.tools.ant.util.g0 g0VarT2 = t2();
            boolean z10 = true;
            while (true) {
                org.apache.tools.tar.d dVarF = fVar.f();
                if (dVarF == null) {
                    break;
                }
                p2(org.apache.tools.ant.util.j0.O(), null, file, fVar, dVarF.n(), dVarF.l(), dVarF.v(), g0VarT2);
                z10 = false;
            }
            if (z10 && s2()) {
                throw new BuildException("archive '%s' is empty", str);
            }
            x1("expand complete", 3);
            fVar.close();
        } catch (Throwable th2) {
            try {
                fVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // org.apache.tools.ant.taskdefs.t1
    public void C2(boolean z10) {
        throw new BuildException("The " + K1() + " task doesn't support the encoding attribute", w1());
    }

    public void G2(a aVar) {
        this.A = aVar;
    }

    @Override // org.apache.tools.ant.taskdefs.t1
    protected void n2(org.apache.tools.ant.util.j0 j0Var, File file, File file2) {
        if (!file.exists()) {
            throw new BuildException("Unable to untar " + file + " as the file does not exist", w1());
        }
        try {
            InputStream inputStreamNewInputStream = Files.newInputStream(file.toPath(), new OpenOption[0]);
            try {
                F2(file.getPath(), inputStreamNewInputStream, file2);
                if (inputStreamNewInputStream != null) {
                    inputStreamNewInputStream.close();
                }
            } catch (Throwable th2) {
                if (inputStreamNewInputStream != null) {
                    try {
                        inputStreamNewInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IOException e10) {
            throw new BuildException("Error while expanding " + file.getPath() + "\n" + e10.toString(), e10, w1());
        }
    }

    @Override // org.apache.tools.ant.taskdefs.t1
    protected void o2(org.apache.tools.ant.types.s1 s1Var, File file) {
        if (!s1Var.p2()) {
            throw new BuildException("Unable to untar " + s1Var.k2() + " as the it does not exist", w1());
        }
        try {
            InputStream inputStreamH2 = s1Var.h2();
            try {
                F2(s1Var.k2(), inputStreamH2, file);
                if (inputStreamH2 != null) {
                    inputStreamH2.close();
                }
            } catch (Throwable th2) {
                if (inputStreamH2 != null) {
                    try {
                        inputStreamH2.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IOException e10) {
            throw new BuildException("Error while expanding " + s1Var.k2(), e10, w1());
        }
    }
}
