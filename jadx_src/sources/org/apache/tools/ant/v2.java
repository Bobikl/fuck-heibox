package org.apache.tools.ant;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: TaskAdapter.java */
/* JADX INFO: loaded from: classes5.dex */
public class v2 extends u2 implements y2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Object f137102k;

    public v2() {
    }

    public v2(Object obj) {
        this();
        s(obj);
    }

    public static void i2(Class<?> cls, Project project) {
        if (nj.c.class.isAssignableFrom(cls)) {
            return;
        }
        try {
            Method method = cls.getMethod(com.tekartik.sqflite.b.f98590i, new Class[0]);
            if (Void.TYPE.equals(method.getReturnType())) {
                return;
            }
            project.M0("return type of execute() should be void but was \"" + method.getReturnType() + "\" in " + cls, 1);
        } catch (LinkageError e10) {
            String str = "Could not load " + cls + ": " + e10;
            project.M0(str, 0);
            throw new BuildException(str, e10);
        } catch (NoSuchMethodException unused) {
            String str2 = "No public execute() in " + cls;
            project.M0(str2, 0);
            throw new BuildException(str2);
        }
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        try {
            Method method = this.f137102k.getClass().getMethod("setLocation", Location.class);
            if (method != null) {
                method.invoke(this.f137102k, w1());
            }
        } catch (NoSuchMethodException unused) {
        } catch (Exception e10) {
            x1("Error setting location in " + this.f137102k.getClass(), 0);
            throw new BuildException(e10);
        }
        try {
            Method method2 = this.f137102k.getClass().getMethod("setProject", Project.class);
            if (method2 != null) {
                method2.invoke(this.f137102k, b());
            }
        } catch (NoSuchMethodException unused2) {
        } catch (Exception e11) {
            x1("Error setting project in " + this.f137102k.getClass(), 0);
            throw new BuildException(e11);
        }
        try {
            nj.b.a(this.f137102k);
        } catch (BuildException e12) {
            throw e12;
        } catch (Exception e13) {
            x1("Error in " + this.f137102k.getClass(), 3);
            throw new BuildException(e13);
        }
    }

    @Override // org.apache.tools.ant.y2
    public Object R() {
        return this.f137102k;
    }

    @Override // org.apache.tools.ant.y2
    public void s(Object obj) {
        this.f137102k = obj;
    }

    @Override // org.apache.tools.ant.y2
    public void x(Class<?> cls) {
        i2(cls, b());
    }
}
