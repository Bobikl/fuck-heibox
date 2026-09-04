package org.apache.tools.ant.types.selectors.modifiedselector;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Locale;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: DigestAlgorithm.java */
/* JADX INFO: loaded from: classes5.dex */
public class d implements a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f136559e = 255;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f136560f = 8192;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f136561a = "MD5";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f136562b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MessageDigest f136563c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f136564d = 8192;

    @Override // org.apache.tools.ant.types.selectors.modifiedselector.a
    public String a(File file) {
        if (!file.canRead()) {
            return null;
        }
        b();
        byte[] bArr = new byte[this.f136564d];
        this.f136563c.reset();
        try {
            DigestInputStream digestInputStream = new DigestInputStream(Files.newInputStream(file.toPath(), new OpenOption[0]), this.f136563c);
            do {
                try {
                } catch (Throwable th2) {
                    try {
                        digestInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } while (digestInputStream.read(bArr, 0, this.f136564d) != -1);
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : this.f136563c.digest()) {
                sb2.append(String.format("%02x", Integer.valueOf(b10 & 255)));
            }
            String string = sb2.toString();
            digestInputStream.close();
            return string;
        } catch (IOException unused) {
            return null;
        }
    }

    public void b() {
        if (this.f136563c != null) {
            return;
        }
        String str = this.f136562b;
        if (str == null || str.isEmpty() || "null".equals(this.f136562b)) {
            try {
                this.f136563c = MessageDigest.getInstance(this.f136561a);
            } catch (NoSuchAlgorithmException e10) {
                throw new BuildException(e10);
            }
        } else {
            try {
                this.f136563c = MessageDigest.getInstance(this.f136561a, this.f136562b);
            } catch (NoSuchAlgorithmException | NoSuchProviderException e11) {
                throw new BuildException(e11);
            }
        }
    }

    public void c(String str) {
        this.f136561a = str != null ? str.toUpperCase(Locale.ENGLISH) : null;
    }

    public void d(String str) {
        this.f136562b = str;
    }

    @Override // org.apache.tools.ant.types.selectors.modifiedselector.a
    public boolean isValid() {
        return "SHA".equals(this.f136561a) || "MD5".equals(this.f136561a);
    }

    public String toString() {
        return String.format("<DigestAlgorithm:algorithm=%s;provider=%s>", this.f136561a, this.f136562b);
    }
}
