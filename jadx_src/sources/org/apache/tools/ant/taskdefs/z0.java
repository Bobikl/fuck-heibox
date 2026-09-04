package org.apache.tools.ant.taskdefs;

import com.tencent.qcloud.core.util.IOUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.function.Supplier;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Location;

/* JADX INFO: compiled from: Definer.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class z0 extends v0 {
    private static final String A = "/antlib.xml";
    private static final ThreadLocal<Map<URL, Location>> B = ThreadLocal.withInitial(new Supplier() { // from class: org.apache.tools.ant.taskdefs.y0
        @Override // java.util.function.Supplier
        public final Object get() {
            return new HashMap();
        }
    });

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f136004o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f136005p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private File f136006q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f136007r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f136008s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f136009t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f136010u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f136011v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f136012w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f136013x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Class<?> f136014y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Class<?> f136015z;

    /* JADX INFO: compiled from: Definer.java */
    public static class a extends org.apache.tools.ant.types.w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f136016c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f136017d = 1;

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{"properties", "xml"};
        }
    }

    /* JADX INFO: compiled from: Definer.java */
    public static class b extends org.apache.tools.ant.types.w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f136018c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f136019d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f136020e = 2;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f136021f = 3;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f136022g = "fail";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f136023h = "report";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f136024i = "ignore";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f136025j = "failall";

        public b() {
        }

        public b(String str) {
            g(str);
        }

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{"fail", "report", f136024i, f136025j};
        }
    }

    private void D2(ClassLoader classLoader, URL url) {
        try {
            n nVarI2 = n.i2(b(), url, j2());
            nVarI2.k2(classLoader);
            nVarI2.l2(j2());
            nVarI2.D1();
        } catch (BuildException e10) {
            throw org.apache.tools.ant.e2.c(e10, w1());
        }
    }

    public static String F2(String str) {
        String strSubstring = str.substring(7);
        if (!strSubstring.startsWith("//")) {
            return strSubstring.replace(lg.a.f131414g, IOUtils.DIR_SEPARATOR_UNIX) + A;
        }
        String strSubstring2 = strSubstring.substring(2);
        if (strSubstring2.endsWith(".xml")) {
            return strSubstring2;
        }
        return strSubstring2 + A;
    }

    private Enumeration<URL> G2(ClassLoader classLoader) {
        try {
            Enumeration<URL> resources = classLoader.getResources(this.f136007r);
            if (!resources.hasMoreElements()) {
                String str = "Could not load definitions from resource " + this.f136007r + z5.J;
                int i10 = this.f136011v;
                if (i10 == 0 || i10 == 1) {
                    x1(str, 1);
                } else if (i10 == 2) {
                    x1(str, 3);
                } else if (i10 == 3) {
                    throw new BuildException(str);
                }
            }
            return resources;
        } catch (IOException e10) {
            throw new BuildException("Could not fetch resources named " + this.f136007r, e10, w1());
        }
    }

    private void T2() {
        throw new BuildException("Only one of the attributes name, file and resource can be set", w1());
    }

    private URL z2() {
        String str;
        if (this.f136006q.exists()) {
            str = null;
        } else {
            str = "File " + this.f136006q + " does not exist";
        }
        if (str == null && !this.f136006q.isFile()) {
            str = "File " + this.f136006q + " is not a file";
        }
        if (str == null) {
            try {
                return org.apache.tools.ant.util.j0.O().N(this.f136006q);
            } catch (Exception e10) {
                str = "File " + this.f136006q + " cannot use as URL: " + e10.toString();
            }
        }
        int i10 = this.f136011v;
        if (i10 == 0 || i10 == 1) {
            x1(str, 1);
        } else if (i10 == 2) {
            x1(str, 3);
        } else if (i10 == 3) {
            throw new BuildException(str);
        }
        return null;
    }

    public String A2() {
        return this.f136005p;
    }

    public String B2() {
        return this.f136004o;
    }

    public String C2() {
        return this.f136007r;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        Enumeration<URL> enumeration;
        ClassLoader classLoaderN2 = n2();
        if (!this.f136010u) {
            if (j2() == null) {
                throw new BuildException("name, file or resource attribute of " + K1() + " is undefined", w1());
            }
            if (!j2().startsWith("antlib:")) {
                throw new BuildException("Only antlib URIs can be located from the URI alone, not the URI '" + j2() + "'");
            }
            R2(F2(j2()));
        }
        String str = this.f136004o;
        if (str != null) {
            String str2 = this.f136005p;
            if (str2 != null) {
                y2(classLoaderN2, str, str2);
                return;
            }
            throw new BuildException("classname attribute of " + K1() + " element is undefined", w1());
        }
        if (this.f136005p != null) {
            throw new BuildException("You must not specify classname together with file or resource.", w1());
        }
        if (this.f136006q == null) {
            enumeration = G2(classLoaderN2);
        } else {
            URL urlZ2 = z2();
            if (urlZ2 == null) {
                return;
            } else {
                enumeration = Collections.enumeration(Collections.singleton(urlZ2));
            }
        }
        while (enumeration.hasMoreElements()) {
            URL urlNextElement = enumeration.nextElement();
            int i10 = this.f136009t;
            if (urlNextElement.getPath().toLowerCase(Locale.ENGLISH).endsWith(".xml")) {
                i10 = 1;
            }
            if (i10 == 0) {
                E2(classLoaderN2, urlNextElement);
                return;
            }
            ThreadLocal<Map<URL, Location>> threadLocal = B;
            if (threadLocal.get().get(urlNextElement) != null) {
                x1("Warning: Recursive loading of " + urlNextElement + " ignored at " + w1() + " originally loaded at " + threadLocal.get().get(urlNextElement), 1);
            } else {
                try {
                    threadLocal.get().put(urlNextElement, w1());
                    D2(classLoaderN2, urlNextElement);
                    threadLocal.get().remove(urlNextElement);
                } catch (Throwable th2) {
                    B.get().remove(urlNextElement);
                    throw th2;
                }
            }
        }
    }

    protected void E2(ClassLoader classLoader, URL url) {
        try {
            InputStream inputStreamOpenStream = url.openStream();
            try {
                if (inputStreamOpenStream == null) {
                    x1("Could not load definitions from " + url, 1);
                    if (inputStreamOpenStream != null) {
                        inputStreamOpenStream.close();
                        return;
                    }
                    return;
                }
                Properties properties = new Properties();
                properties.load(inputStreamOpenStream);
                for (String str : properties.stringPropertyNames()) {
                    this.f136004o = str;
                    String property = properties.getProperty(str);
                    this.f136005p = property;
                    y2(classLoader, this.f136004o, property);
                }
                inputStreamOpenStream.close();
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

    public void H2(String str) {
        this.f136013x = str;
    }

    protected void I2(Class<?> cls) {
        this.f136015z = cls;
    }

    public void J2(String str) {
        this.f136012w = str;
    }

    protected void K2(Class<?> cls) {
        this.f136014y = cls;
    }

    public void L2(String str) {
        if (this.f136010u) {
            T2();
        }
        if (!str.startsWith("antlib:")) {
            throw new BuildException("Invalid antlib attribute - it must start with antlib:");
        }
        l2(str);
        this.f136007r = str.substring(7).replace(lg.a.f131414g, IOUtils.DIR_SEPARATOR_UNIX) + A;
        this.f136010u = true;
    }

    public void M2(String str) {
        this.f136005p = str;
    }

    public void N2(File file) {
        if (this.f136010u) {
            T2();
        }
        this.f136010u = true;
        this.f136006q = file;
    }

    public void O2(a aVar) {
        this.f136009t = aVar.b();
    }

    public void P2(String str) {
        if (this.f136010u) {
            T2();
        }
        this.f136010u = true;
        this.f136004o = str;
    }

    public void Q2(b bVar) {
        this.f136011v = bVar.b();
    }

    public void R2(String str) {
        if (this.f136010u) {
            T2();
        }
        this.f136010u = true;
        this.f136007r = str;
    }

    protected void S2(boolean z10) {
        this.f136008s = z10;
    }

    public File l0() {
        return this.f136006q;
    }

    protected void y2(ClassLoader classLoader, String str, String str2) throws BuildException {
        try {
            try {
                String strL = org.apache.tools.ant.e2.l(j2(), str);
                Class<?> cls = this.f136011v != 2 ? Class.forName(str2, true, classLoader) : null;
                String str3 = this.f136012w;
                if (str3 != null) {
                    this.f136014y = Class.forName(str3, true, classLoader);
                }
                String str4 = this.f136013x;
                if (str4 != null) {
                    this.f136015z = Class.forName(str4, true, classLoader);
                }
                org.apache.tools.ant.h hVar = new org.apache.tools.ant.h();
                hVar.t(strL);
                hVar.s(str2);
                hVar.q(cls);
                hVar.p(this.f136014y);
                hVar.o(this.f136015z);
                hVar.u(this.f136008s);
                hVar.r(classLoader);
                if (cls != null) {
                    hVar.a(b());
                }
                org.apache.tools.ant.u.y(b()).h(hVar);
            } catch (ClassNotFoundException e10) {
                throw new BuildException(K1() + " class " + str2 + " cannot be found\n using the classloader " + classLoader, e10, w1());
            } catch (NoClassDefFoundError e11) {
                throw new BuildException(K1() + " A class needed by class " + str2 + " cannot be found: " + e11.getMessage() + "\n using the classloader " + classLoader, e11, w1());
            }
        } catch (BuildException e12) {
            int i10 = this.f136011v;
            if (i10 != 0) {
                if (i10 == 1) {
                    x1(e12.b() + "Warning: " + e12.getMessage(), 1);
                    return;
                }
                if (i10 != 3) {
                    x1(e12.b() + e12.getMessage(), 4);
                    return;
                }
            }
            throw e12;
        }
    }
}
