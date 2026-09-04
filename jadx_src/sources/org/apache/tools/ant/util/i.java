package org.apache.tools.ant.util;

import java.lang.reflect.InvocationTargetException;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: ClasspathUtils.java */
/* JADX INFO: loaded from: classes5.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f136803a = "ant.reuse.loader";

    /* JADX INFO: compiled from: ClasspathUtils.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final org.apache.tools.ant.b2 f136804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private org.apache.tools.ant.types.o0 f136805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f136806c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f136807d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f136808e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f136809f = false;

        a(org.apache.tools.ant.b2 b2Var) {
            this.f136804a = b2Var;
        }

        private Project e() {
            return this.f136804a.b();
        }

        public org.apache.tools.ant.types.o0 a() {
            if (this.f136805b == null) {
                this.f136805b = new org.apache.tools.ant.types.o0(this.f136804a.b());
            }
            return this.f136805b.u2();
        }

        public String b() {
            String str = this.f136808e;
            if (str != null || this.f136806c == null) {
                return str;
            }
            return org.apache.tools.ant.j1.f133501y + this.f136806c;
        }

        public ClassLoader c() {
            return i.d(e(), this.f136805b, b(), this.f136809f, this.f136808e != null || i.i(e()));
        }

        public org.apache.tools.ant.types.o0 d() {
            return this.f136805b;
        }

        public boolean f() {
            return this.f136809f;
        }

        public Object g() {
            return i.j(this.f136807d, c());
        }

        public void h(String str) {
            this.f136807d = str;
        }

        public void i(org.apache.tools.ant.types.o0 o0Var) {
            org.apache.tools.ant.types.o0 o0Var2 = this.f136805b;
            if (o0Var2 == null) {
                this.f136805b = o0Var;
            } else {
                o0Var2.n2(o0Var);
            }
        }

        public void j(org.apache.tools.ant.types.q1 q1Var) {
            this.f136806c = q1Var.b();
            a().c2(q1Var);
        }

        public void k(org.apache.tools.ant.types.q1 q1Var) {
            this.f136808e = q1Var.b();
        }

        public void l(boolean z10) {
            this.f136809f = z10;
        }
    }

    private i() {
    }

    public static ClassLoader b(Project project, org.apache.tools.ant.types.o0 o0Var, String str) {
        return c(project, o0Var, str, false);
    }

    public static ClassLoader c(Project project, org.apache.tools.ant.types.o0 o0Var, String str, boolean z10) {
        return d(project, o0Var, str, z10, i(project));
    }

    public static ClassLoader d(Project project, org.apache.tools.ant.types.o0 o0Var, String str, boolean z10, boolean z11) {
        ClassLoader classLoaderH;
        if (str == null || !z11) {
            classLoaderH = null;
        } else {
            Object objW0 = project.w0(str);
            if (objW0 != null && !(objW0 instanceof ClassLoader)) {
                throw new BuildException("The specified loader id %s does not reference a class loader", str);
            }
            classLoaderH = (ClassLoader) objW0;
        }
        if (classLoaderH == null) {
            classLoaderH = h(project, o0Var, z10);
            if (str != null && z11) {
                project.i(str, classLoaderH);
            }
        }
        return classLoaderH;
    }

    public static ClassLoader e(Project project, org.apache.tools.ant.types.q1 q1Var) {
        return f(project, q1Var, false);
    }

    public static ClassLoader f(Project project, org.apache.tools.ant.types.q1 q1Var, boolean z10) {
        String strB = q1Var.b();
        Object objW0 = project.w0(strB);
        if (!(objW0 instanceof org.apache.tools.ant.types.o0)) {
            throw new BuildException("The specified classpathref %s does not reference a Path.", strB);
        }
        return c(project, (org.apache.tools.ant.types.o0) objW0, org.apache.tools.ant.j1.f133501y + strB, z10);
    }

    public static a g(org.apache.tools.ant.b2 b2Var) {
        return new a(b2Var);
    }

    public static ClassLoader h(Project project, org.apache.tools.ant.types.o0 o0Var, boolean z10) {
        org.apache.tools.ant.g gVarZ = project.z(o0Var);
        if (z10) {
            gVarZ.t0(false);
            gVarZ.c();
        }
        return gVarZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean i(Project project) {
        return project.u0("ant.reuse.loader") != null;
    }

    public static Object j(String str, ClassLoader classLoader) {
        return k(str, classLoader, Object.class);
    }

    public static <T> T k(String str, ClassLoader classLoader, Class<T> cls) {
        try {
            T t10 = (T) Class.forName(str, true, classLoader).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (cls.isInstance(t10)) {
                return t10;
            }
            throw new BuildException("Class of unexpected Type: %s expected : %s", str, cls);
        } catch (ClassNotFoundException e10) {
            throw new BuildException(org.apache.tools.ant.taskdefs.rmic.f.f135707a + str, e10);
        } catch (IllegalAccessException e11) {
            e = e11;
            throw new BuildException("Could not instantiate " + str + ". Specified class should have a public constructor.", e);
        } catch (InstantiationException e12) {
            throw new BuildException("Could not instantiate " + str + ". Specified class should have a no argument constructor.", e12);
        } catch (LinkageError e13) {
            throw new BuildException("Class " + str + " could not be loaded because of an invalid dependency.", e13);
        } catch (NoSuchMethodException e14) {
            e = e14;
            throw new BuildException("Could not instantiate " + str + ". Specified class should have a public constructor.", e);
        } catch (InvocationTargetException e15) {
            e = e15;
            throw new BuildException("Could not instantiate " + str + ". Specified class should have a public constructor.", e);
        }
    }
}
