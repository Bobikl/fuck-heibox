package org.apache.tools.ant.taskdefs;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.zip.GZIPInputStream;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: GUnzip.java */
/* JADX INFO: loaded from: classes5.dex */
public class w1 extends l7 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f135920n = 8192;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f135921o = ".gz";

    @Override // org.apache.tools.ant.taskdefs.l7
    protected void k2() {
        if (this.f134464m.i2() > this.f134463l.lastModified()) {
            log("Expanding " + this.f134464m.k2() + " to " + this.f134463l.getAbsolutePath());
            try {
                OutputStream outputStreamNewOutputStream = Files.newOutputStream(this.f134463l.toPath(), new OpenOption[0]);
                try {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(this.f134464m.h2());
                    try {
                        byte[] bArr = new byte[8192];
                        int i10 = 0;
                        do {
                            outputStreamNewOutputStream.write(bArr, 0, i10);
                            i10 = gZIPInputStream.read(bArr, 0, 8192);
                        } while (i10 != -1);
                        gZIPInputStream.close();
                        outputStreamNewOutputStream.close();
                    } catch (Throwable th2) {
                        try {
                            gZIPInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    if (outputStreamNewOutputStream != null) {
                        try {
                            outputStreamNewOutputStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                    }
                    throw th4;
                }
            } catch (IOException e10) {
                throw new BuildException("Problem expanding gzip " + e10.getMessage(), e10, w1());
            }
        }
    }

    @Override // org.apache.tools.ant.taskdefs.l7
    protected String l2() {
        return f135921o;
    }

    @Override // org.apache.tools.ant.taskdefs.l7
    protected boolean s2() {
        return getClass().equals(w1.class);
    }
}
