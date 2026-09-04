package org.apache.tools.ant.taskdefs;

import java.io.File;
import java.io.IOException;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: CopyPath.java */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class r0 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f135649p = "No destDir specified";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f135650q = "No path specified";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f135651r = "No mapper specified";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final org.apache.tools.ant.util.j0 f135652s = org.apache.tools.ant.util.j0.O();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private org.apache.tools.ant.util.g0 f135653k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private org.apache.tools.ant.types.o0 f135654l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private File f135655m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f135656n = f135652s.M();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f135657o = false;

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        File file;
        int i10 = 0;
        x1("This task should have never been released and was obsoleted by ResourceCollection support in <copy> available since Ant 1.7.0.  Don't use it.", 0);
        p2();
        String[] strArrZ2 = this.f135654l.z2();
        int i11 = 3;
        if (strArrZ2.length == 0) {
            x1("Path is empty", 3);
            return;
        }
        int length = strArrZ2.length;
        int i12 = 0;
        while (i12 < length) {
            String str = strArrZ2[i12];
            File file2 = new File(str);
            String[] strArrY0 = this.f135653k.y0(str);
            if (strArrY0 != null) {
                int length2 = strArrY0.length;
                int i13 = i10;
                while (i13 < length2) {
                    File file3 = new File(this.f135655m, strArrY0[i13]);
                    if (file2.equals(file3)) {
                        x1("Skipping self-copy of " + str, i11);
                    } else {
                        if (file2.isDirectory()) {
                            log("Skipping directory " + str);
                        } else {
                            try {
                                x1("Copying " + file2 + " to " + file3, i11);
                                file = file2;
                                try {
                                    f135652s.n(file2, file3, null, null, false, this.f135657o, null, null, b());
                                } catch (IOException e10) {
                                    e = e10;
                                    String str2 = "Failed to copy " + file + " to " + file3 + " due to " + e.getMessage();
                                    if (file3.exists() && !file3.delete()) {
                                        str2 = str2 + " and I couldn't delete the corrupt " + file3;
                                    }
                                    throw new BuildException(str2, e, w1());
                                }
                            } catch (IOException e11) {
                                e = e11;
                                file = file2;
                            }
                        }
                        i13++;
                        file2 = file;
                        strArrY0 = strArrY0;
                        length2 = length2;
                        i11 = 3;
                    }
                    file = file2;
                    i13++;
                    file2 = file;
                    strArrY0 = strArrY0;
                    length2 = length2;
                    i11 = 3;
                }
            }
            i12++;
            i10 = 0;
            i11 = 3;
        }
    }

    public void i2(org.apache.tools.ant.util.g0 g0Var) {
        if (this.f135653k != null) {
            throw new BuildException("Only one mapper allowed");
        }
        this.f135653k = g0Var;
    }

    public org.apache.tools.ant.types.o0 j2() {
        if (this.f135654l == null) {
            this.f135654l = new org.apache.tools.ant.types.o0(b());
        }
        return this.f135654l;
    }

    public void k2(File file) {
        this.f135655m = file;
    }

    public void l2(long j10) {
        this.f135656n = j10;
    }

    public void m2(org.apache.tools.ant.types.o0 o0Var) {
        j2().n2(o0Var);
    }

    public void n2(org.apache.tools.ant.types.q1 q1Var) {
        j2().c2(q1Var);
    }

    public void o2(boolean z10) {
        this.f135657o = z10;
    }

    protected void p2() throws BuildException {
        if (this.f135655m == null) {
            throw new BuildException(f135649p);
        }
        if (this.f135653k == null) {
            throw new BuildException(f135651r);
        }
        if (this.f135654l == null) {
            throw new BuildException(f135650q);
        }
    }
}
