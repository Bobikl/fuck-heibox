package org.apache.tools.ant.taskdefs;

import com.tencent.qcloud.core.util.IOUtils;
import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.launch.Locator;

/* JADX INFO: compiled from: ManifestClassPath.java */
/* JADX INFO: loaded from: classes5.dex */
public class c4 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f133822k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private File f133823l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f133824m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private org.apache.tools.ant.types.o0 f133825n;

    @Override // org.apache.tools.ant.u2
    public void D1() {
        if (this.f133822k == null) {
            throw new BuildException("Missing 'property' attribute!");
        }
        if (this.f133823l == null) {
            throw new BuildException("Missing 'jarfile' attribute!");
        }
        if (b().u0(this.f133822k) != null) {
            throw new BuildException("Property '%s' already set!", this.f133822k);
        }
        if (this.f133825n == null) {
            throw new BuildException("Missing nested <classpath>!");
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.f133824m + 1; i10++) {
            sb2.append("../");
        }
        String string = sb2.toString();
        org.apache.tools.ant.util.j0 j0VarO = org.apache.tools.ant.util.j0.O();
        this.f133823l = j0VarO.i0(this.f133823l.getAbsolutePath());
        StringBuilder sb3 = new StringBuilder();
        for (String str : this.f133825n.z2()) {
            String absolutePath = new File(str).getAbsolutePath();
            File fileI0 = j0VarO.i0(absolutePath);
            try {
                String strT = this.f133823l.equals(fileI0) ? "." : org.apache.tools.ant.util.j0.T(this.f133823l, fileI0);
                String canonicalPath = fileI0.getCanonicalPath();
                char c10 = File.separatorChar;
                if (c10 != '/') {
                    canonicalPath = canonicalPath.replace(c10, IOUtils.DIR_SEPARATOR_UNIX);
                }
                if (strT.equals(canonicalPath) || strT.startsWith(string)) {
                    throw new BuildException("No suitable relative path from %s to %s", this.f133823l, absolutePath);
                }
                if (fileI0.isDirectory() && !strT.endsWith("/")) {
                    strT = strT + IOUtils.DIR_SEPARATOR_UNIX;
                }
                sb3.append(Locator.encodeURI(strT));
                sb3.append(' ');
            } catch (Exception e10) {
                throw new BuildException("error trying to get the relative path from " + this.f133823l + " to " + absolutePath, e10);
            }
        }
        b().n1(this.f133822k, sb3.toString().trim());
    }

    public void i2(org.apache.tools.ant.types.o0 o0Var) {
        this.f133825n = o0Var;
    }

    public void j2(File file) {
        File parentFile = file.getParentFile();
        if (!parentFile.isDirectory()) {
            throw new BuildException("Jar's directory not found: %s", parentFile);
        }
        this.f133823l = parentFile;
    }

    public void k2(int i10) {
        if (i10 < 0) {
            throw new BuildException("maxParentLevels must not be a negative number");
        }
        this.f133824m = i10;
    }

    public void l2(String str) {
        this.f133822k = str;
    }
}
