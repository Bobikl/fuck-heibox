package org.apache.tools.ant.taskdefs;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.Properties;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: BuildNumber.java */
/* JADX INFO: loaded from: classes5.dex */
public class z extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f136000l = "build.number";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f136001m = "build.number";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final org.apache.tools.ant.util.j0 f136002n = org.apache.tools.ant.util.j0.O();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private File f136003k;

    private int i2(Properties properties) throws BuildException {
        String strTrim = properties.getProperty("build.number", "0").trim();
        try {
            return Integer.parseInt(strTrim);
        } catch (NumberFormatException e10) {
            throw new BuildException(this.f136003k + " contains a non integer build number: " + strTrim, e10);
        }
    }

    private Properties j2() throws BuildException {
        try {
            InputStream inputStreamNewInputStream = Files.newInputStream(this.f136003k.toPath(), new OpenOption[0]);
            try {
                Properties properties = new Properties();
                properties.load(inputStreamNewInputStream);
                if (inputStreamNewInputStream != null) {
                    inputStreamNewInputStream.close();
                }
                return properties;
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
            throw new BuildException(e10);
        }
    }

    private void l2() throws BuildException {
        if (this.f136003k == null) {
            this.f136003k = f136002n.n0(b().Z(), "build.number");
        }
        if (!this.f136003k.exists()) {
            try {
                f136002n.B(this.f136003k);
            } catch (IOException e10) {
                throw new BuildException(this.f136003k + " doesn't exist and new file can't be created.", e10);
            }
        }
        if (!this.f136003k.canRead()) {
            throw new BuildException("Unable to read from " + this.f136003k + ".");
        }
        if (this.f136003k.canWrite()) {
            return;
        }
        throw new BuildException("Unable to write to " + this.f136003k + ".");
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        File file = this.f136003k;
        l2();
        Properties propertiesJ2 = j2();
        int iI2 = i2(propertiesJ2);
        propertiesJ2.put("build.number", String.valueOf(iI2 + 1));
        try {
            try {
                OutputStream outputStreamNewOutputStream = Files.newOutputStream(this.f136003k.toPath(), new OpenOption[0]);
                try {
                    propertiesJ2.store(outputStreamNewOutputStream, "Build Number for ANT. Do not edit!");
                    if (outputStreamNewOutputStream != null) {
                        outputStreamNewOutputStream.close();
                    }
                    this.f136003k = file;
                    b().n1("build.number", String.valueOf(iI2));
                } catch (Throwable th2) {
                    if (outputStreamNewOutputStream != null) {
                        try {
                            outputStreamNewOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                this.f136003k = file;
                throw th4;
            }
        } catch (IOException e10) {
            throw new BuildException("Error while writing " + this.f136003k, e10);
        }
    }

    public void k2(File file) {
        this.f136003k = file;
    }
}
