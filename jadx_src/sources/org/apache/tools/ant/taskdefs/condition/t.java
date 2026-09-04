package org.apache.tools.ant.taskdefs.condition;

import java.io.File;
import java.io.IOException;
import java.util.function.Predicate;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.g4;
import org.apache.tools.ant.util.h2;

/* JADX INFO: compiled from: IsSigned.java */
/* JADX INFO: loaded from: classes5.dex */
public class t extends org.apache.tools.ant.types.s implements d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f133951i = "META-INF/";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f133952j = ".SF";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f133953k = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f133954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private File f133955h;

    /* JADX WARN: Code duplicated, block: B:16:0x006f  */
    public static boolean f2(File file, String str) throws IOException {
        boolean z10;
        org.apache.tools.zip.x xVar = new org.apache.tools.zip.x(file);
        try {
            if (str == null) {
                boolean zAnyMatch = h2.a(xVar.i()).anyMatch(new Predicate() { // from class: org.apache.tools.ant.taskdefs.condition.s
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return t.g2((org.apache.tools.zip.t) obj);
                    }
                });
                xVar.close();
                return zAnyMatch;
            }
            String strH2 = h2(str);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f133951i);
            sb2.append(strH2.toUpperCase());
            sb2.append(f133952j);
            boolean z11 = true;
            boolean z12 = xVar.n(sb2.toString()) != null;
            if (strH2.length() > 8) {
                if (xVar.n(f133951i + strH2.substring(0, 8).toUpperCase() + f133952j) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (!z12 && !z10) {
                z11 = false;
            }
            xVar.close();
            return z11;
        } catch (Throwable th2) {
            try {
                xVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean g2(org.apache.tools.zip.t tVar) {
        return tVar.getName().startsWith(f133951i) && tVar.getName().endsWith(f133952j);
    }

    private static String h2(String str) {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        for (char c10 : str.toCharArray()) {
            if (g4.f134208q.indexOf(c10) < 0) {
                sb2.append(lg.a.f131412e);
                z10 = true;
            } else {
                sb2.append(c10);
            }
        }
        return z10 ? sb2.toString() : str;
    }

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() {
        File file = this.f133955h;
        if (file == null) {
            throw new BuildException("The file attribute must be set.");
        }
        boolean zF2 = false;
        if (!file.exists()) {
            x1("The file \"" + this.f133955h.getAbsolutePath() + "\" does not exist.", 3);
            return false;
        }
        try {
            zF2 = f2(this.f133955h, this.f133954g);
        } catch (IOException e10) {
            x1("Got IOException reading file \"" + this.f133955h.getAbsolutePath() + "\"" + e10, 1);
        }
        if (zF2) {
            x1("File \"" + this.f133955h.getAbsolutePath() + "\" is signed.", 3);
        }
        return zF2;
    }

    public void i2(File file) {
        this.f133955h = file;
    }

    public void j2(String str) {
        this.f133954g = str;
    }
}
