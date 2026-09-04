package org.apache.tools.ant.taskdefs.condition;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.b2;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.types.q1;

/* JADX INFO: compiled from: HasMethod.java */
/* JADX INFO: loaded from: classes5.dex */
public class j extends b2 implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f133903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f133904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f133905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private o0 f133906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private org.apache.tools.ant.g f133907i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f133908j = false;

    private boolean D1(Class<?> cls) {
        for (Field field : cls.getDeclaredFields()) {
            if (field.getName().equals(this.f133905g)) {
                return true;
            }
        }
        return false;
    }

    private boolean G1(Class<?> cls) {
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals(this.f133904f)) {
                return true;
            }
        }
        return false;
    }

    private Class<?> H1(String str) {
        try {
            if (!this.f133908j) {
                org.apache.tools.ant.g gVar = this.f133907i;
                if (gVar != null) {
                    return gVar.loadClass(str);
                }
                ClassLoader classLoader = getClass().getClassLoader();
                return classLoader != null ? Class.forName(str, true, classLoader) : Class.forName(str);
            }
            org.apache.tools.ant.g gVarZ = b().z(this.f133906h);
            this.f133907i = gVarZ;
            gVarZ.t0(false);
            this.f133907i.c();
            try {
                return this.f133907i.findClass(str);
            } catch (SecurityException e10) {
                throw new BuildException("class \"" + str + "\" was found but a SecurityException has been raised while loading it", e10);
            }
        } catch (ClassNotFoundException unused) {
            throw new BuildException("class \"" + str + "\" was not found");
        } catch (NoClassDefFoundError e11) {
            throw new BuildException("Could not load dependent class \"" + e11.getMessage() + "\" for class \"" + str + "\"");
        }
    }

    public o0 B1() {
        if (this.f133906h == null) {
            this.f133906h = new o0(b());
        }
        return this.f133906h.u2();
    }

    public void I1(String str) {
        this.f133903e = str;
    }

    public void K1(o0 o0Var) {
        B1().n2(o0Var);
    }

    public void L1(q1 q1Var) {
        B1().c2(q1Var);
    }

    public void N1(String str) {
        this.f133905g = str;
    }

    public void O1(boolean z10) {
        this.f133908j = z10;
    }

    public void Q1(String str) {
        this.f133904f = str;
    }

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() throws BuildException {
        String str = this.f133903e;
        if (str == null) {
            throw new BuildException("No classname defined");
        }
        org.apache.tools.ant.g gVar = this.f133907i;
        try {
            Class<?> clsH1 = H1(str);
            if (this.f133904f != null) {
                boolean zG1 = G1(clsH1);
                org.apache.tools.ant.g gVar2 = this.f133907i;
                if (gVar != gVar2 && gVar2 != null) {
                    gVar2.n();
                    this.f133907i = null;
                }
                return zG1;
            }
            if (this.f133905g == null) {
                throw new BuildException("Neither method nor field defined");
            }
            boolean zD1 = D1(clsH1);
            org.apache.tools.ant.g gVar3 = this.f133907i;
            if (gVar != gVar3 && gVar3 != null) {
                gVar3.n();
                this.f133907i = null;
            }
            return zD1;
        } catch (Throwable th2) {
            org.apache.tools.ant.g gVar4 = this.f133907i;
            if (gVar != gVar4 && gVar4 != null) {
                gVar4.n();
                this.f133907i = null;
            }
            throw th2;
        }
    }
}
