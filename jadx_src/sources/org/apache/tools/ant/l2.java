package org.apache.tools.ant;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: compiled from: ProjectHelperRepository.java */
/* JADX INFO: loaded from: classes5.dex */
public class l2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f133510b = "ant.project-helper-repo.debug";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f133511c = "true".equals(System.getProperty(f133510b));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static l2 f133512d = new l2();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Constructor<org.apache.tools.ant.helper.e> f133513e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Constructor<? extends e2>> f133514a = new ArrayList();

    static {
        try {
            f133513e = org.apache.tools.ant.helper.e.class.getConstructor(new Class[0]);
        } catch (Exception e10) {
            throw new BuildException(e10);
        }
    }

    private l2() {
        d();
    }

    private void d() {
        q(i());
        try {
            ClassLoader classLoaderD = org.apache.tools.ant.util.a1.d();
            if (classLoaderD != null) {
                Iterator it = Collections.list(classLoaderD.getResources("META-INF/services/org.apache.tools.ant.ProjectHelper")).iterator();
                while (it.hasNext()) {
                    URLConnection uRLConnectionOpenConnection = ((URL) it.next()).openConnection();
                    uRLConnectionOpenConnection.setUseCaches(false);
                    q(h(uRLConnectionOpenConnection.getInputStream()));
                }
            }
            InputStream systemResourceAsStream = ClassLoader.getSystemResourceAsStream("META-INF/services/org.apache.tools.ant.ProjectHelper");
            if (systemResourceAsStream != null) {
                q(h(systemResourceAsStream));
            }
        } catch (Exception e10) {
            System.err.println("Unable to load ProjectHelper from service META-INF/services/org.apache.tools.ant.ProjectHelper (" + e10.getClass().getName() + ": " + e10.getMessage() + ")");
            if (f133511c) {
                e10.printStackTrace(System.err);
            }
        }
    }

    private Constructor<? extends e2> e(String str) throws BuildException {
        Class<?> clsLoadClass;
        ClassLoader classLoaderD = org.apache.tools.ant.util.a1.d();
        if (classLoaderD != null) {
            try {
                try {
                    clsLoadClass = classLoaderD.loadClass(str);
                } catch (Exception e10) {
                    throw new BuildException(e10);
                }
            } catch (ClassNotFoundException unused) {
                clsLoadClass = null;
            }
        } else {
            clsLoadClass = null;
        }
        if (clsLoadClass == null) {
            clsLoadClass = Class.forName(str);
        }
        return clsLoadClass.asSubclass(e2.class).getConstructor(new Class[0]);
    }

    public static l2 g() {
        return f133512d;
    }

    private Constructor<? extends e2> h(InputStream inputStream) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
            String line = bufferedReader.readLine();
            bufferedReader.close();
            if (line == null || line.isEmpty()) {
                return null;
            }
            return e(line);
        } catch (Exception e10) {
            System.out.println("Unable to load ProjectHelper from service META-INF/services/org.apache.tools.ant.ProjectHelper (" + e10.getMessage() + ")");
            if (!f133511c) {
                return null;
            }
            e10.printStackTrace(System.err);
            return null;
        }
    }

    private Constructor<? extends e2> i() {
        String property = System.getProperty("org.apache.tools.ant.ProjectHelper");
        if (property == null) {
            return null;
        }
        try {
            return e(property);
        } catch (SecurityException e10) {
            System.err.println("Unable to load ProjectHelper class \"" + property + " specified in system property org.apache.tools.ant.ProjectHelper (" + e10.getMessage() + ")");
            if (!f133511c) {
                return null;
            }
            e10.printStackTrace(System.err);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e2 l(Constructor constructor) {
        try {
            return (e2) constructor.newInstance(new Object[0]);
        } catch (Exception unused) {
            throw new BuildException("Failed to invoke no-arg constructor on " + constructor.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean m(org.apache.tools.ant.types.s1 s1Var, e2 e2Var) {
        return e2Var.f(s1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean n(org.apache.tools.ant.types.s1 s1Var, e2 e2Var) {
        return e2Var.g(s1Var);
    }

    private void q(Constructor<? extends e2> constructor) {
        if (constructor == null) {
            return;
        }
        if (f133511c) {
            System.out.println("ProjectHelper " + constructor.getClass().getName() + " registered.");
        }
        this.f133514a.add(constructor);
    }

    public Iterator<e2> f() {
        final Stream.Builder builder = Stream.builder();
        List<Constructor<? extends e2>> list = this.f133514a;
        Objects.requireNonNull(builder);
        list.forEach(new Consumer() { // from class: org.apache.tools.ant.i2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.add((Constructor) obj);
            }
        });
        final Class<e2> cls = e2.class;
        return builder.add(f133513e).build().map(new Function() { // from class: org.apache.tools.ant.j2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return l2.l((Constructor) obj);
            }
        }).map(new Function() { // from class: org.apache.tools.ant.k2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (e2) cls.cast((e2) obj);
            }
        }).iterator();
    }

    public e2 j(final org.apache.tools.ant.types.s1 s1Var) throws BuildException {
        e2 e2Var = (e2) org.apache.tools.ant.util.h2.b(f()).filter(new Predicate() { // from class: org.apache.tools.ant.g2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return l2.m(s1Var, (e2) obj);
            }
        }).findFirst().orElse(null);
        if (e2Var == null) {
            throw new BuildException("BUG: at least the ProjectHelper2 should have supported the file " + s1Var);
        }
        if (f133511c) {
            System.out.println("ProjectHelper " + e2Var.getClass().getName() + " selected for the antlib " + s1Var);
        }
        return e2Var;
    }

    public e2 k(final org.apache.tools.ant.types.s1 s1Var) throws BuildException {
        e2 e2Var = (e2) org.apache.tools.ant.util.h2.b(f()).filter(new Predicate() { // from class: org.apache.tools.ant.h2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return l2.n(s1Var, (e2) obj);
            }
        }).findFirst().orElse(null);
        if (e2Var == null) {
            throw new BuildException("BUG: at least the ProjectHelper2 should have supported the file " + s1Var);
        }
        if (f133511c) {
            System.out.println("ProjectHelper " + e2Var.getClass().getName() + " selected for the build file " + s1Var);
        }
        return e2Var;
    }

    public void o(Class<? extends e2> cls) throws BuildException {
        try {
            q(cls.getConstructor(new Class[0]));
        } catch (NoSuchMethodException unused) {
            throw new BuildException("Couldn't find no-arg constructor in " + cls.getName());
        }
    }

    public void p(String str) throws BuildException {
        q(e(str));
    }
}
