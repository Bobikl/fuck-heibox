package org.apache.tools.ant;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: AntTypeDefinition.java */
/* JADX INFO: loaded from: classes5.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f133343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Class<?> f133344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Class<?> f133345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Class<?> f133346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f133347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ClassLoader f133348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f133349g = false;

    private Object c(Project project, Class<?> cls) {
        try {
            return k(cls, project);
        } catch (IllegalAccessException unused) {
            throw new BuildException("Could not create type " + this.f133343a + " as the constructor " + cls + " is not accessible");
        } catch (InstantiationException unused2) {
            throw new BuildException("Could not create type " + this.f133343a + " as the class " + cls + " is abstract");
        } catch (NoClassDefFoundError e10) {
            throw new BuildException("Type " + this.f133343a + ": A class needed by class " + cls + " cannot be found: " + e10.getMessage(), e10);
        } catch (NoSuchMethodException unused3) {
            throw new BuildException("Could not create type " + this.f133343a + " as the class " + cls + " has no compatible constructor");
        } catch (InvocationTargetException e11) {
            Throwable targetException = e11.getTargetException();
            throw new BuildException("Could not create type " + this.f133343a + " due to " + targetException, targetException);
        } catch (Throwable th2) {
            throw new BuildException("Could not create type " + this.f133343a + " due to " + th2, th2);
        }
    }

    private String d(Class<?> cls) {
        return cls == null ? "<null>" : cls.getName();
    }

    private Object j(Project project) {
        Class<?> cls;
        Class<?> clsI = i(project);
        if (clsI == null) {
            return null;
        }
        Object objC = c(project, clsI);
        if (this.f133345c == null || ((cls = this.f133346d) != null && cls.isAssignableFrom(objC.getClass()))) {
            return objC;
        }
        y2 y2Var = (y2) c(project, this.f133345c);
        y2Var.s(objC);
        return y2Var;
    }

    public void a(Project project) {
        if (this.f133344b == null) {
            Class<?> clsI = i(project);
            this.f133344b = clsI;
            if (clsI == null) {
                throw new BuildException("Unable to create class for " + h());
            }
        }
        if (this.f133345c != null) {
            Class<?> cls = this.f133346d;
            if (cls == null || !cls.isAssignableFrom(this.f133344b)) {
                ((y2) c(project, this.f133345c)).x(this.f133344b);
            }
        }
    }

    public Object b(Project project) {
        return j(project);
    }

    public ClassLoader e() {
        return this.f133348f;
    }

    public String f() {
        return this.f133347e;
    }

    public Class<?> g(Project project) {
        Class<?> clsI;
        if (this.f133346d != null && ((clsI = i(project)) == null || this.f133346d.isAssignableFrom(clsI))) {
            return clsI;
        }
        Class<?> cls = this.f133345c;
        return cls == null ? i(project) : cls;
    }

    public String h() {
        return this.f133343a;
    }

    public Class<?> i(Project project) {
        try {
            return l();
        } catch (ClassNotFoundException unused) {
            project.M0("Could not load class (" + this.f133347e + ") for type " + this.f133343a, 4);
            return null;
        } catch (NoClassDefFoundError e10) {
            project.M0("Could not load a dependent class (" + e10.getMessage() + ") for type " + this.f133343a, 4);
            return null;
        }
    }

    public <T> T k(Class<T> cls, Project project) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Constructor<T> constructor;
        boolean z10;
        try {
            constructor = cls.getConstructor(new Class[0]);
            z10 = true;
        } catch (NoSuchMethodException unused) {
            constructor = cls.getConstructor(Project.class);
            z10 = false;
        }
        T tNewInstance = constructor.newInstance(z10 ? new Object[0] : new Object[]{project});
        project.o1(tNewInstance);
        return tNewInstance;
    }

    public Class<?> l() throws ClassNotFoundException {
        Class<?> cls = this.f133344b;
        if (cls != null) {
            return cls;
        }
        ClassLoader classLoader = this.f133348f;
        if (classLoader == null) {
            this.f133344b = Class.forName(this.f133347e);
        } else {
            this.f133344b = classLoader.loadClass(this.f133347e);
        }
        return this.f133344b;
    }

    public boolean m() {
        return this.f133349g;
    }

    public boolean n(h hVar, Project project) {
        return hVar != null && hVar.getClass() == getClass() && hVar.i(project).equals(i(project)) && hVar.g(project).equals(g(project)) && hVar.f133349g == this.f133349g && hVar.f133345c == this.f133345c && hVar.f133346d == this.f133346d;
    }

    public void o(Class<?> cls) {
        this.f133346d = cls;
    }

    public void p(Class<?> cls) {
        this.f133345c = cls;
    }

    public void q(Class<?> cls) {
        this.f133344b = cls;
        if (cls == null) {
            return;
        }
        ClassLoader classLoader = this.f133348f;
        if (classLoader == null) {
            classLoader = cls.getClassLoader();
        }
        this.f133348f = classLoader;
        String name = this.f133347e;
        if (name == null) {
            name = cls.getName();
        }
        this.f133347e = name;
    }

    public void r(ClassLoader classLoader) {
        this.f133348f = classLoader;
    }

    public void s(String str) {
        this.f133347e = str;
    }

    public void t(String str) {
        this.f133343a = str;
    }

    public void u(boolean z10) {
        this.f133349g = z10;
    }

    public boolean v(h hVar, Project project) {
        if (hVar == null || getClass() != hVar.getClass() || !f().equals(hVar.f()) || !d(this.f133345c).equals(d(hVar.f133345c)) || !d(this.f133346d).equals(d(hVar.f133346d)) || this.f133349g != hVar.f133349g) {
            return false;
        }
        ClassLoader classLoaderE = hVar.e();
        ClassLoader classLoaderE2 = e();
        return classLoaderE == classLoaderE2 || ((classLoaderE instanceof g) && (classLoaderE2 instanceof g) && ((g) classLoaderE).J().equals(((g) classLoaderE2).J()));
    }
}
