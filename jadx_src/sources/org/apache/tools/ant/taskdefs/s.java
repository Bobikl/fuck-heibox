package org.apache.tools.ant.taskdefs;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: BUnzip2.java */
/* JADX INFO: loaded from: classes5.dex */
public class s extends l7 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f135724n = 8192;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f135725o = ".bz2";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // org.apache.tools.ant.taskdefs.l7
    protected void k2() throws Throwable {
        InputStream inputStreamH2;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        Throwable th2;
        IOException e10;
        Object obj;
        if (this.f134464m.i2() <= this.f134463l.lastModified()) {
            return;
        }
        ?? sb2 = new StringBuilder();
        sb2.append("Expanding ");
        sb2.append(this.f134464m.k2());
        sb2.append(" to ");
        ?? absolutePath = this.f134463l.getAbsolutePath();
        sb2.append(absolutePath);
        log(sb2.toString());
        try {
            try {
                absolutePath = Files.newOutputStream(this.f134463l.toPath(), new OpenOption[0]);
                try {
                    inputStreamH2 = this.f134464m.h2();
                    try {
                        bufferedInputStream = new BufferedInputStream(inputStreamH2);
                        try {
                            if (bufferedInputStream.read() != 66) {
                                throw new BuildException("Invalid bz2 file.", w1());
                            }
                            if (bufferedInputStream.read() != 90) {
                                throw new BuildException("Invalid bz2 file.", w1());
                            }
                            org.apache.tools.bzip2.c cVar = new org.apache.tools.bzip2.c(bufferedInputStream, true);
                            try {
                                byte[] bArr = new byte[8192];
                                int i10 = 0;
                                do {
                                    absolutePath.write(bArr, 0, i10);
                                    i10 = cVar.read(bArr, 0, 8192);
                                } while (i10 != -1);
                                org.apache.tools.ant.util.j0.c(bufferedInputStream);
                                org.apache.tools.ant.util.j0.c(inputStreamH2);
                                org.apache.tools.ant.util.j0.d(absolutePath);
                                org.apache.tools.ant.util.j0.c(cVar);
                            } catch (IOException e11) {
                                e10 = e11;
                                throw new BuildException("Problem expanding bzip2 " + e10.getMessage(), e10, w1());
                            }
                        } catch (IOException e12) {
                            e = e12;
                            e10 = e;
                            throw new BuildException("Problem expanding bzip2 " + e10.getMessage(), e10, w1());
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedInputStream2 = null;
                            th2 = th;
                            org.apache.tools.ant.util.j0.c(bufferedInputStream);
                            org.apache.tools.ant.util.j0.c(inputStreamH2);
                            org.apache.tools.ant.util.j0.d(absolutePath);
                            org.apache.tools.ant.util.j0.c(bufferedInputStream2);
                            throw th2;
                        }
                    } catch (IOException e13) {
                        e = e13;
                        obj = null;
                        e10 = e;
                        throw new BuildException("Problem expanding bzip2 " + e10.getMessage(), e10, w1());
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedInputStream = null;
                        bufferedInputStream2 = bufferedInputStream;
                        th2 = th;
                        org.apache.tools.ant.util.j0.c(bufferedInputStream);
                        org.apache.tools.ant.util.j0.c(inputStreamH2);
                        org.apache.tools.ant.util.j0.d(absolutePath);
                        org.apache.tools.ant.util.j0.c(bufferedInputStream2);
                        throw th2;
                    }
                } catch (IOException e14) {
                    e = e14;
                    obj = null;
                } catch (Throwable th5) {
                    th = th5;
                    inputStreamH2 = null;
                    bufferedInputStream = null;
                }
            } catch (Throwable th6) {
                th2 = th6;
            }
        } catch (IOException e15) {
            e10 = e15;
        } catch (Throwable th7) {
            inputStreamH2 = null;
            bufferedInputStream = null;
            bufferedInputStream2 = null;
            th2 = th7;
            absolutePath = 0;
        }
    }

    @Override // org.apache.tools.ant.taskdefs.l7
    protected String l2() {
        return f135725o;
    }

    @Override // org.apache.tools.ant.taskdefs.l7
    protected boolean s2() {
        return getClass().equals(s.class);
    }
}
