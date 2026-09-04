package org.apache.tools.ant.taskdefs;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: BZip2.java */
/* JADX INFO: loaded from: classes5.dex */
public class t extends m4 {
    @Override // org.apache.tools.ant.taskdefs.m4
    protected void k2() throws Throwable {
        Throwable th2;
        IOException e10;
        try {
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(Files.newOutputStream(this.f134507k.toPath(), new OpenOption[0]));
                bufferedOutputStream.write(66);
                bufferedOutputStream.write(90);
                org.apache.tools.bzip2.d dVar = new org.apache.tools.bzip2.d(bufferedOutputStream);
                try {
                    t2(j2(), dVar);
                    org.apache.tools.ant.util.j0.d(dVar);
                } catch (IOException e11) {
                    e10 = e11;
                    throw new BuildException("Problem creating bzip2 " + e10.getMessage(), e10, w1());
                }
            } catch (Throwable th3) {
                th2 = th3;
                org.apache.tools.ant.util.j0.d(null);
                throw th2;
            }
        } catch (IOException e12) {
            e10 = e12;
        } catch (Throwable th4) {
            th2 = th4;
            org.apache.tools.ant.util.j0.d(null);
            throw th2;
        }
    }

    @Override // org.apache.tools.ant.taskdefs.m4
    protected boolean p2() {
        return getClass().equals(t.class);
    }
}
