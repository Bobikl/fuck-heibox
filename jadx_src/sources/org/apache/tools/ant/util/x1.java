package org.apache.tools.ant.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: ScriptRunnerBase.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class x1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f136984b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f136986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f136987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Project f136988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ClassLoader f136989g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f136983a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f136985c = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<String, Object> f136990h = new HashMap();

    private void v(InputStream inputStream, String str, Charset charset) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, charset));
            try {
                this.f136985c += j0.o0(bufferedReader);
                bufferedReader.close();
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            throw new BuildException("Failed to read " + str, e10);
        }
    }

    public void A(boolean z10) {
        this.f136983a = z10;
    }

    public void B(String str) {
        this.f136984b = str;
    }

    public void C(Project project) {
        this.f136988f = project;
    }

    public void D(ClassLoader classLoader) {
        this.f136989g = classLoader;
    }

    public void E(File file) {
        String path = file.getPath();
        if (!file.exists()) {
            throw new BuildException("file " + path + " not found.");
        }
        try {
            InputStream inputStreamNewInputStream = Files.newInputStream(file.toPath(), new OpenOption[0]);
            try {
                String str = this.f136986d;
                v(inputStreamNewInputStream, path, str == null ? Charset.defaultCharset() : Charset.forName(str));
                if (inputStreamNewInputStream != null) {
                    inputStreamNewInputStream.close();
                }
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
            throw new BuildException("file " + path + " not found.", e10);
        }
    }

    public abstract boolean F();

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void s(String str, Object obj) {
        if (!str.isEmpty() && Character.isJavaIdentifierStart(str.charAt(0)) && str.chars().skip(1L).allMatch(new IntPredicate() { // from class: org.apache.tools.ant.util.w1
            @Override // java.util.function.IntPredicate
            public final boolean test(int i10) {
                return Character.isJavaIdentifierPart(i10);
            }
        })) {
            this.f136990h.put(str, obj);
        }
    }

    public void c(Map<String, ?> map) {
        map.forEach(new BiConsumer() { // from class: org.apache.tools.ant.util.v1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                this.f136967a.s((String) obj, obj2);
            }
        });
    }

    public void d(String str) {
        this.f136985c += str;
    }

    public void e(org.apache.tools.ant.b2 b2Var) {
        Project projectB = b2Var.b();
        this.f136988f = projectB;
        c(projectB.t0());
        c(this.f136988f.B0());
        c(this.f136988f.d0());
        c(this.f136988f.c0());
        s("project", this.f136988f);
        s("self", b2Var);
    }

    public void f(org.apache.tools.ant.b2 b2Var) {
        Project projectB = b2Var.b();
        this.f136988f = projectB;
        s("project", projectB);
        s("self", b2Var);
    }

    protected void g() {
        if (this.f136984b == null) {
            throw new BuildException("script language must be specified");
        }
    }

    public void h() {
        this.f136985c = "";
    }

    public abstract Object i(String str);

    public abstract void j(String str);

    protected Map<String, Object> k() {
        return this.f136990h;
    }

    public final boolean l() {
        return this.f136987e;
    }

    public boolean m() {
        return this.f136983a;
    }

    public String n() {
        return this.f136984b;
    }

    public abstract String o();

    public Project p() {
        return this.f136988f;
    }

    public String q() {
        return this.f136985c;
    }

    protected ClassLoader r() {
        return this.f136989g;
    }

    public void t(org.apache.tools.ant.types.s1 s1Var) {
        if (s1Var instanceof org.apache.tools.ant.types.resources.l1) {
            this.f136985c += ((org.apache.tools.ant.types.resources.l1) s1Var).B2();
            return;
        }
        if (s1Var instanceof org.apache.tools.ant.types.resources.x0) {
            this.f136985c += ((org.apache.tools.ant.types.resources.x0) s1Var).z2();
            return;
        }
        String strV2 = s1Var.v2();
        try {
            InputStream inputStreamH2 = s1Var.h2();
            try {
                v(inputStreamH2, strV2, Charset.defaultCharset());
                if (inputStreamH2 != null) {
                    inputStreamH2.close();
                }
            } catch (Throwable th2) {
                if (inputStreamH2 != null) {
                    try {
                        inputStreamH2.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IOException e10) {
            throw new BuildException("Failed to open " + strV2, e10);
        } catch (UnsupportedOperationException e11) {
            throw new BuildException("Failed to open " + strV2 + " - it is not readable", e11);
        }
    }

    public void u(org.apache.tools.ant.types.u1 u1Var) {
        u1Var.forEach(new Consumer() { // from class: org.apache.tools.ant.util.u1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f136955b.t((org.apache.tools.ant.types.s1) obj);
            }
        });
    }

    protected ClassLoader w() {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (r() == null) {
            D(getClass().getClassLoader());
        }
        Thread.currentThread().setContextClassLoader(r());
        return contextClassLoader;
    }

    protected void x(ClassLoader classLoader) {
        Thread.currentThread().setContextClassLoader(classLoader);
    }

    public final void y(boolean z10) {
        this.f136987e = z10;
    }

    public void z(String str) {
        this.f136986d = str;
    }
}
