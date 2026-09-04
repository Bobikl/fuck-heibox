package org.apache.tools.ant.taskdefs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.zip.GZIPOutputStream;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: GZip.java */
/* JADX INFO: loaded from: classes5.dex */
public class x1 extends m4 {
    @Override // org.apache.tools.ant.taskdefs.m4
    protected void k2() {
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(Files.newOutputStream(this.f134507k.toPath(), new OpenOption[0]));
            try {
                t2(j2(), gZIPOutputStream);
                gZIPOutputStream.close();
            } catch (Throwable th2) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            throw new BuildException("Problem creating gzip " + e10.getMessage(), e10, w1());
        }
    }

    @Override // org.apache.tools.ant.taskdefs.m4
    protected boolean p2() {
        return getClass().equals(x1.class);
    }
}
