package org.apache.tools.ant.listener;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.util.Properties;
import org.apache.tools.ant.util.j0;
import org.apache.tools.ant.y;

/* JADX INFO: compiled from: AnsiColorLogger.java */
/* JADX INFO: loaded from: classes5.dex */
public class a extends y {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f133515o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f133516p = 31;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f133517q = 32;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f133518r = 34;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f133519s = 35;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f133520t = 36;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f133521u = "\u001b[";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f133522v = "m";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final char f133523w = ';';

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f133524x = "\u001b[m";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f133525i = "\u001b[2;31m";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f133526j = "\u001b[2;35m";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f133527k = "\u001b[2;36m";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f133528l = "\u001b[2;32m";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f133529m = "\u001b[2;34m";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f133530n = false;

    private void k() {
        String property = System.getProperty("ant.logger.defaults");
        InputStream inputStreamNewInputStream = null;
        try {
            Properties properties = new Properties();
            inputStreamNewInputStream = property != null ? Files.newInputStream(Paths.get(property, new String[0]), new OpenOption[0]) : getClass().getResourceAsStream("/org/apache/tools/ant/listener/defaults.properties");
            if (inputStreamNewInputStream != null) {
                properties.load(inputStreamNewInputStream);
            }
            String property2 = properties.getProperty("AnsiColorLogger.ERROR_COLOR");
            String property3 = properties.getProperty("AnsiColorLogger.WARNING_COLOR");
            String property4 = properties.getProperty("AnsiColorLogger.INFO_COLOR");
            String property5 = properties.getProperty("AnsiColorLogger.VERBOSE_COLOR");
            String property6 = properties.getProperty("AnsiColorLogger.DEBUG_COLOR");
            if (property2 != null) {
                this.f133525i = f133521u + property2 + f133522v;
            }
            if (property3 != null) {
                this.f133526j = f133521u + property3 + f133522v;
            }
            if (property4 != null) {
                this.f133527k = f133521u + property4 + f133522v;
            }
            if (property5 != null) {
                this.f133528l = f133521u + property5 + f133522v;
            }
            if (property6 != null) {
                this.f133529m = f133521u + property6 + f133522v;
            }
        } catch (IOException unused) {
        } finally {
            j0.c(inputStreamNewInputStream);
        }
    }

    @Override // org.apache.tools.ant.y
    protected void i(String str, PrintStream printStream, int i10) {
        if (str == null || printStream == null) {
            return;
        }
        if (!this.f133530n) {
            k();
            this.f133530n = true;
        }
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 0) {
            sb2.insert(0, this.f133525i);
            sb2.append(f133524x);
        } else if (i10 == 1) {
            sb2.insert(0, this.f133526j);
            sb2.append(f133524x);
        } else if (i10 == 2) {
            sb2.insert(0, this.f133527k);
            sb2.append(f133524x);
        } else if (i10 != 3) {
            sb2.insert(0, this.f133529m);
            sb2.append(f133524x);
        } else {
            sb2.insert(0, this.f133528l);
            sb2.append(f133524x);
        }
        printStream.println(sb2.toString());
    }
}
