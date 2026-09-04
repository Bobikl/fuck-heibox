package org.apache.tools.ant.taskdefs;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Truncate.java */
/* JADX INFO: loaded from: classes5.dex */
public class b7 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f133786p = 1024;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f133788r = "No files specified.";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f133789s = "Cannot truncate to length ";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f133790t = "rw";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private org.apache.tools.ant.types.o0 f133793k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f133794l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f133795m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Long f133796n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Long f133797o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Long f133787q = 0L;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final org.apache.tools.ant.util.j0 f133791u = org.apache.tools.ant.util.j0.O();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final byte[] f133792v = new byte[1024];

    private synchronized org.apache.tools.ant.types.o0 j2() {
        if (this.f133793k == null) {
            this.f133793k = new org.apache.tools.ant.types.o0(b());
        }
        return this.f133793k;
    }

    private void k2(File file) {
        long length = file.length();
        Long l10 = this.f133796n;
        long jLongValue = l10 == null ? this.f133797o.longValue() + length : l10.longValue();
        if (length == jLongValue) {
            return;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, f133790t);
            try {
                try {
                    if (jLongValue > length) {
                        randomAccessFile.seek(length);
                        while (length < jLongValue) {
                            byte[] bArr = f133792v;
                            long jMin = Math.min(bArr.length, jLongValue - length);
                            randomAccessFile.write(bArr, 0, (int) jMin);
                            length += jMin;
                        }
                    } else {
                        randomAccessFile.setLength(jLongValue);
                    }
                    try {
                        randomAccessFile.close();
                    } catch (IOException e10) {
                        x1("Caught " + e10 + " closing " + randomAccessFile, 1);
                    }
                } catch (Throwable th2) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e11) {
                        x1("Caught " + e11 + " closing " + randomAccessFile, 1);
                    }
                    throw th2;
                }
            } catch (IOException e12) {
                throw new BuildException("Exception working with " + randomAccessFile, e12);
            }
        } catch (Exception e13) {
            throw new BuildException("Could not open " + file + " for writing", e13);
        }
    }

    private boolean q2(File file) {
        if (file.isFile()) {
            return true;
        }
        if (!this.f133794l) {
            return false;
        }
        IOException e10 = null;
        try {
            if (f133791u.C(file, this.f133795m)) {
                return true;
            }
        } catch (IOException e11) {
            e10 = e11;
        }
        String str = "Unable to create " + file;
        if (e10 != null) {
            throw new BuildException(str, e10);
        }
        x1(str, 1);
        return false;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() {
        Long l10 = this.f133796n;
        if (l10 != null && this.f133797o != null) {
            throw new BuildException("length and adjust are mutually exclusive options");
        }
        if (l10 == null && this.f133797o == null) {
            this.f133796n = f133787q;
        }
        org.apache.tools.ant.types.o0 o0Var = this.f133793k;
        if (o0Var == null) {
            throw new BuildException(f133788r);
        }
        Iterator<org.apache.tools.ant.types.s1> it = o0Var.iterator();
        while (it.hasNext()) {
            File fileL0 = ((org.apache.tools.ant.types.resources.y) it.next().e2(org.apache.tools.ant.types.resources.y.class)).l0();
            if (q2(fileL0)) {
                k2(fileL0);
            }
        }
    }

    public void i2(org.apache.tools.ant.types.u1 u1Var) {
        j2().f2(u1Var);
    }

    public void l2(Long l10) {
        this.f133797o = l10;
    }

    public void m2(boolean z10) {
        this.f133794l = z10;
    }

    public void n2(File file) {
        i2(new org.apache.tools.ant.types.resources.z(file));
    }

    public void o2(Long l10) {
        this.f133796n = l10;
        if (l10 == null || l10.longValue() >= 0) {
            return;
        }
        throw new BuildException(f133789s + l10);
    }

    public void p2(boolean z10) {
        this.f133795m = z10;
    }
}
