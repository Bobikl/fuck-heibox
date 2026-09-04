package org.apache.tools.ant.taskdefs.email;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.util.q2;

/* JADX INFO: compiled from: UUMailer.java */
/* JADX INFO: loaded from: classes5.dex */
public class i extends h {
    i() {
    }

    @Override // org.apache.tools.ant.taskdefs.email.h
    protected void y(File file, PrintStream printStream) throws IOException {
        if (!file.exists() || !file.canRead()) {
            throw new BuildException("File \"%s\" does not exist or is not readable.", file.getAbsolutePath());
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(Files.newInputStream(file.toPath(), new OpenOption[0]));
        try {
            new q2(file.getName()).a(bufferedInputStream, printStream);
            bufferedInputStream.close();
        } catch (Throwable th2) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
