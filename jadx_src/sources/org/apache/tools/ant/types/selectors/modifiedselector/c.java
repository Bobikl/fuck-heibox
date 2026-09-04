package org.apache.tools.ant.types.selectors.modifiedselector;

import java.io.BufferedInputStream;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: ChecksumAlgorithm.java */
/* JADX INFO: loaded from: classes5.dex */
public class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f136557a = "CRC";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Checksum f136558b = null;

    @Override // org.apache.tools.ant.types.selectors.modifiedselector.a
    public String a(File file) {
        b();
        if (!file.canRead()) {
            return null;
        }
        this.f136558b.reset();
        try {
            CheckedInputStream checkedInputStream = new CheckedInputStream(new BufferedInputStream(Files.newInputStream(file.toPath(), new OpenOption[0])), this.f136558b);
            do {
                try {
                } catch (Throwable th2) {
                    try {
                        checkedInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } while (checkedInputStream.read() != -1);
            String string = Long.toString(checkedInputStream.getChecksum().getValue());
            checkedInputStream.close();
            return string;
        } catch (Exception unused) {
            return null;
        }
    }

    public void b() {
        if (this.f136558b != null) {
            return;
        }
        if ("CRC".equals(this.f136557a)) {
            this.f136558b = new CRC32();
        } else {
            if (!"ADLER".equals(this.f136557a)) {
                throw new BuildException(new NoSuchAlgorithmException());
            }
            this.f136558b = new Adler32();
        }
    }

    public void c(String str) {
        this.f136557a = str != null ? str.toUpperCase(Locale.ENGLISH) : null;
    }

    @Override // org.apache.tools.ant.types.selectors.modifiedselector.a
    public boolean isValid() {
        return "CRC".equals(this.f136557a) || "ADLER".equals(this.f136557a);
    }

    public String toString() {
        return String.format("<ChecksumAlgorithm:algorithm=%s>", this.f136557a);
    }
}
