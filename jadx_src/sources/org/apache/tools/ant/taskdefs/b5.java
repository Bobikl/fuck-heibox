package org.apache.tools.ant.taskdefs;

import com.tencent.qcloud.core.util.IOUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.function.BiConsumer;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: Property.java */
/* JADX INFO: loaded from: classes5.dex */
public class b5 extends org.apache.tools.ant.u2 {
    protected boolean A;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected String f133770k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected String f133771l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected File f133772m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected URL f133773n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected String f133774o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected org.apache.tools.ant.types.o0 f133775p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected String f133776q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected org.apache.tools.ant.types.q1 f133777r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected String f133778s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f133779t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Project f133780u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Object f133781v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f133782w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f133783x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private File f133784y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f133785z;

    public b5() {
        this(false);
    }

    protected b5(boolean z10) {
        this(z10, null);
    }

    protected b5(boolean z10, Project project) {
        this.f133782w = false;
        this.f133783x = false;
        this.f133785z = false;
        this.A = z10;
        this.f133780u = project;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A2(Map map, Object obj, Object obj2) {
        if (obj instanceof String) {
            map.put((String) obj, obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B2(String str, Object obj) {
        if (this.f133778s != null) {
            str = this.f133778s + str;
        }
        l2(str, obj);
    }

    private void E2(Properties properties, InputStream inputStream, boolean z10) throws IOException {
        if (z10) {
            properties.loadFromXML(inputStream);
        } else {
            properties.load(inputStream);
        }
    }

    private void I2(Map<String, Object> map) throws BuildException {
        org.apache.tools.ant.p2 p2VarU = org.apache.tools.ant.p2.u(b());
        new org.apache.tools.ant.property.o(b(), p2VarU, p2VarU.k()).c(map, s2(), t2());
    }

    private void z2(Object obj) {
        this.f133781v = obj;
        this.f133771l = obj == null ? null : obj.toString();
    }

    protected void C2(String str) {
        Properties properties = new Properties();
        if (!str.endsWith(".")) {
            str = str + ".";
        }
        x1("Loading Environment " + str, 3);
        for (Map.Entry<String, String> entry : n1.h().entrySet()) {
            properties.put(str + entry.getKey(), entry.getValue());
        }
        k2(properties);
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        org.apache.tools.ant.types.q1 q1Var;
        Object obj;
        if (b() == null) {
            throw new IllegalStateException("project has not been set");
        }
        String str = this.f133770k;
        if (str != null) {
            if (this.f133781v == null && this.f133777r == null) {
                throw new BuildException("You must specify value, location or refid with the name attribute", w1());
            }
        } else if (this.f133773n == null && this.f133772m == null && this.f133774o == null && this.f133776q == null && this.f133779t == null) {
            throw new BuildException("You must specify url, file, resource, environment or runtime when not using the name attribute", w1());
        }
        if (this.f133773n == null && this.f133772m == null && this.f133774o == null && this.f133778s != null) {
            throw new BuildException("Prefix is only valid when loading from a url, file or resource", w1());
        }
        if (str != null && (obj = this.f133781v) != null) {
            if (this.f133783x) {
                try {
                    File file = obj instanceof File ? (File) obj : new File(this.f133781v.toString());
                    File fileZ = this.f133784y;
                    if (fileZ == null) {
                        fileZ = b().Z();
                    }
                    m2(this.f133770k, org.apache.tools.ant.util.j0.T(fileZ, file).replace(IOUtils.DIR_SEPARATOR_UNIX, File.separatorChar));
                } catch (Exception e10) {
                    throw new BuildException(e10, w1());
                }
            } else {
                l2(str, obj);
            }
        }
        File file2 = this.f133772m;
        if (file2 != null) {
            D2(file2);
        }
        URL url = this.f133773n;
        if (url != null) {
            H2(url);
        }
        String str2 = this.f133774o;
        if (str2 != null) {
            F2(str2);
        }
        String str3 = this.f133776q;
        if (str3 != null) {
            C2(str3);
        }
        String str4 = this.f133779t;
        if (str4 != null) {
            G2(str4);
        }
        String str5 = this.f133770k;
        if (str5 == null || (q1Var = this.f133777r) == null) {
            return;
        }
        try {
            m2(str5, q1Var.d(b()).toString());
        } catch (BuildException e11) {
            Project project = this.f133780u;
            if (project == null) {
                throw e11;
            }
            m2(this.f133770k, this.f133777r.d(project).toString());
        }
    }

    protected void D2(File file) throws BuildException {
        Properties properties = new Properties();
        x1("Loading " + file.getAbsolutePath(), 3);
        try {
            if (!file.exists()) {
                x1("Unable to find property file: " + file.getAbsolutePath(), 3);
                return;
            }
            InputStream inputStreamNewInputStream = Files.newInputStream(file.toPath(), new OpenOption[0]);
            try {
                E2(properties, inputStreamNewInputStream, file.getName().endsWith(".xml"));
                if (inputStreamNewInputStream != null) {
                    inputStreamNewInputStream.close();
                }
                k2(properties);
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
            throw new BuildException(e10, w1());
        }
    }

    protected void F2(String str) {
        Properties properties = new Properties();
        x1("Resource Loading " + str, 3);
        ClassLoader classLoader = this.f133775p == null ? getClass().getClassLoader() : b().z(this.f133775p);
        try {
            try {
                InputStream systemResourceAsStream = classLoader == null ? ClassLoader.getSystemResourceAsStream(str) : classLoader.getResourceAsStream(str);
                try {
                    if (systemResourceAsStream == null) {
                        x1("Unable to find resource " + str, 1);
                    } else {
                        E2(properties, systemResourceAsStream, str.endsWith(".xml"));
                        k2(properties);
                    }
                    if (systemResourceAsStream != null) {
                        systemResourceAsStream.close();
                    }
                    if (this.f133775p == null || classLoader == null) {
                        return;
                    }
                    ((org.apache.tools.ant.g) classLoader).n();
                } catch (Throwable th2) {
                    if (systemResourceAsStream != null) {
                        try {
                            systemResourceAsStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                throw new BuildException(e10, w1());
            }
        } catch (Throwable th4) {
            if (this.f133775p != null && classLoader != null) {
                ((org.apache.tools.ant.g) classLoader).n();
            }
            throw th4;
        }
    }

    protected void G2(String str) {
        Properties properties = new Properties();
        if (!str.endsWith(".")) {
            str = str + ".";
        }
        x1("Loading Runtime properties " + str, 3);
        Runtime runtime = Runtime.getRuntime();
        properties.put(str + "availableProcessors", String.valueOf(runtime.availableProcessors()));
        properties.put(str + "freeMemory", String.valueOf(runtime.freeMemory()));
        properties.put(str + "maxMemory", String.valueOf(runtime.maxMemory()));
        properties.put(str + "totalMemory", String.valueOf(runtime.totalMemory()));
        k2(properties);
    }

    protected void H2(URL url) throws BuildException {
        Properties properties = new Properties();
        x1("Loading " + url, 3);
        try {
            InputStream inputStreamOpenStream = url.openStream();
            try {
                E2(properties, inputStreamOpenStream, url.getFile().endsWith(".xml"));
                if (inputStreamOpenStream != null) {
                    inputStreamOpenStream.close();
                }
                k2(properties);
            } catch (Throwable th2) {
                if (inputStreamOpenStream != null) {
                    try {
                        inputStreamOpenStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IOException e10) {
            throw new BuildException(e10, w1());
        }
    }

    public void J2(File file) {
        this.f133784y = file;
    }

    public void K2(org.apache.tools.ant.types.o0 o0Var) {
        org.apache.tools.ant.types.o0 o0Var2 = this.f133775p;
        if (o0Var2 == null) {
            this.f133775p = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void L2(org.apache.tools.ant.types.q1 q1Var) {
        o2().c2(q1Var);
    }

    public void M2(String str) {
        this.f133776q = str;
    }

    public void N2(File file) {
        this.f133772m = file;
    }

    public void O2(File file) {
        if (this.f133783x) {
            z2(file);
        } else {
            Z2(file.getAbsolutePath());
        }
    }

    public void P2(String str) {
        this.f133770k = str;
    }

    public void Q2(String str) {
        this.f133778s = str;
        if (str == null || str.endsWith(".")) {
            return;
        }
        this.f133778s += ".";
    }

    public void R2(boolean z10) {
        this.f133785z = z10;
    }

    public void S2(org.apache.tools.ant.types.q1 q1Var) {
        this.f133777r = q1Var;
    }

    public void T2(boolean z10) {
        this.f133783x = z10;
    }

    public void U2(String str) {
        this.f133774o = str;
    }

    public void V2(String str) {
        this.f133779t = str;
    }

    public void W2(URL url) {
        this.f133773n = url;
    }

    @Deprecated
    public void X2(boolean z10) {
        x1("DEPRECATED: Ignoring request to set user property in Property task.", 1);
    }

    public void Y2(Object obj) {
        this.f133782w = true;
        z2(obj);
    }

    public void Z2(String str) {
        Y2(str);
    }

    protected void k2(Properties properties) {
        final HashMap map = new HashMap();
        properties.forEach(new BiConsumer() { // from class: org.apache.tools.ant.taskdefs.z4
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                b5.A2(map, obj, obj2);
            }
        });
        I2(map);
        map.forEach(new BiConsumer() { // from class: org.apache.tools.ant.taskdefs.a5
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                this.f133718a.B2((String) obj, obj2);
            }
        });
    }

    public File l0() {
        return this.f133772m;
    }

    protected void l2(String str, Object obj) {
        org.apache.tools.ant.p2 p2VarU = org.apache.tools.ant.p2.u(b());
        if (!this.A) {
            p2VarU.L(str, obj);
            return;
        }
        if (p2VarU.y(str) == null) {
            p2VarU.J(str, obj);
            return;
        }
        x1("Override ignored for " + str, 3);
    }

    protected void m2(String str, String str2) {
        l2(str, str2);
    }

    public void n2(String str) {
        if (this.f133782w) {
            if (!str.trim().isEmpty()) {
                throw new BuildException("can't combine nested text with value attribute");
            }
            return;
        }
        String strV0 = b().V0(str);
        String strY2 = y2();
        if (strY2 != null) {
            strV0 = strY2 + strV0;
        }
        z2(strV0);
    }

    public org.apache.tools.ant.types.o0 o2() {
        if (this.f133775p == null) {
            this.f133775p = new org.apache.tools.ant.types.o0(b());
        }
        return this.f133775p.u2();
    }

    public org.apache.tools.ant.types.o0 p2() {
        return this.f133775p;
    }

    public String q2() {
        return this.f133776q;
    }

    public String r2() {
        return this.f133770k;
    }

    public String s2() {
        return this.f133778s;
    }

    public boolean t2() {
        return this.f133785z;
    }

    public String toString() {
        String str = this.f133771l;
        return str == null ? "" : str;
    }

    public org.apache.tools.ant.types.q1 u2() {
        return this.f133777r;
    }

    public String v2() {
        return this.f133774o;
    }

    public String w2() {
        return this.f133779t;
    }

    public URL x2() {
        return this.f133773n;
    }

    public String y2() {
        return this.f133771l;
    }
}
