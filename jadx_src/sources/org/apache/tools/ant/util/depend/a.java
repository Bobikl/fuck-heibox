package org.apache.tools.ant.util.depend;

import com.tencent.qcloud.core.util.IOUtils;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;
import java.util.zip.ZipFile;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.util.VectorSet;

/* JADX INFO: compiled from: AbstractAnalyzer.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f136767h = 1000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Vector<File> f136772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Vector<String> f136773f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o0 f136768a = new o0(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o0 f136769b = new o0(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Vector<String> f136770c = new VectorSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f136771d = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f136774g = true;

    protected a() {
        reset();
    }

    private File k(String str, String[] strArr) throws IOException {
        for (String str2 : strArr) {
            File file = new File(str2);
            if (file.exists()) {
                if (file.isDirectory()) {
                    File file2 = new File(file, str);
                    if (file2.exists()) {
                        return file2;
                    }
                } else {
                    ZipFile zipFile = new ZipFile(file);
                    try {
                        if (zipFile.getEntry(str) != null) {
                            zipFile.close();
                            return file;
                        }
                        zipFile.close();
                    } catch (Throwable th2) {
                        try {
                            zipFile.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            }
        }
        return null;
    }

    @Override // org.apache.tools.ant.util.depend.b
    public File a(String str) throws IOException {
        return k(str.replace(lg.a.f131414g, IOUtils.DIR_SEPARATOR_UNIX) + ".class", this.f136769b.z2());
    }

    @Override // org.apache.tools.ant.util.depend.b
    public File b(String str) throws IOException {
        return k(str.replace(lg.a.f131414g, IOUtils.DIR_SEPARATOR_UNIX) + ".java", this.f136768a.z2());
    }

    @Override // org.apache.tools.ant.util.depend.b
    public void c(boolean z10) {
        this.f136774g = z10;
    }

    @Override // org.apache.tools.ant.util.depend.b
    public void d(String str, Object obj) {
    }

    @Override // org.apache.tools.ant.util.depend.b
    public Enumeration<String> e() {
        if (!this.f136771d) {
            j(this.f136772e, this.f136773f);
        }
        return this.f136773f.elements();
    }

    @Override // org.apache.tools.ant.util.depend.b
    public void f(String str) {
        if (str == null || this.f136770c.contains(str)) {
            return;
        }
        this.f136770c.addElement(str);
    }

    @Override // org.apache.tools.ant.util.depend.b
    public void g(o0 o0Var) {
        if (o0Var == null) {
            return;
        }
        this.f136769b.n2(o0Var);
        this.f136769b.J(o0Var.b());
    }

    @Override // org.apache.tools.ant.util.depend.b
    public void h(o0 o0Var) {
        if (o0Var == null) {
            return;
        }
        this.f136768a.n2(o0Var);
        this.f136768a.J(o0Var.b());
    }

    @Override // org.apache.tools.ant.util.depend.b
    public Enumeration<File> i() {
        if (!n()) {
            throw new BuildException("File dependencies are not supported by this analyzer");
        }
        if (!this.f136771d) {
            j(this.f136772e, this.f136773f);
        }
        return this.f136772e.elements();
    }

    protected abstract void j(Vector<File> vector, Vector<String> vector2);

    protected Enumeration<String> l() {
        return this.f136770c.elements();
    }

    protected boolean m() {
        return this.f136774g;
    }

    protected abstract boolean n();

    @Override // org.apache.tools.ant.util.depend.b
    public void reset() {
        this.f136770c.removeAllElements();
        this.f136771d = false;
        this.f136772e = new Vector<>();
        this.f136773f = new Vector<>();
    }
}
