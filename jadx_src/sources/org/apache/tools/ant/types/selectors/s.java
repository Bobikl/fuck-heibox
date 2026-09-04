package org.apache.tools.ant.types.selectors;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.q1;

/* JADX INFO: compiled from: ExtendSelector.java */
/* JADX INFO: loaded from: classes5.dex */
public class s extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f136621i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private v f136622j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<org.apache.tools.ant.types.m0> f136623k = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private org.apache.tools.ant.types.o0 f136624l = null;

    @Override // org.apache.tools.ant.types.selectors.h, org.apache.tools.ant.types.selectors.v
    public boolean P0(File file, String str, File file2) throws BuildException {
        i2();
        if (!this.f136623k.isEmpty()) {
            v vVar = this.f136622j;
            if (vVar instanceof r) {
                List<org.apache.tools.ant.types.m0> list = this.f136623k;
                ((r) vVar).H0((org.apache.tools.ant.types.m0[]) list.toArray(new org.apache.tools.ant.types.m0[list.size()]));
            }
        }
        return this.f136622j.P0(file, str, file2);
    }

    @Override // org.apache.tools.ant.types.selectors.h
    public void j2() {
        if (this.f136622j == null) {
            n2();
        }
        String str = this.f136621i;
        if (str == null || str.length() < 1) {
            g2("The classname attribute is required");
            return;
        }
        v vVar = this.f136622j;
        if (vVar == null) {
            g2("Internal Error: The custom selector was not created");
        } else {
            if ((vVar instanceof r) || this.f136623k.isEmpty()) {
                return;
            }
            g2("Cannot set parameters on custom selector that does not implement ExtendFileSelector");
        }
    }

    public void k2(org.apache.tools.ant.types.m0 m0Var) {
        this.f136623k.add(m0Var);
    }

    public final org.apache.tools.ant.types.o0 l2() {
        if (Y1()) {
            throw Z1();
        }
        if (this.f136624l == null) {
            this.f136624l = new org.apache.tools.ant.types.o0(b());
        }
        return this.f136624l.u2();
    }

    public final org.apache.tools.ant.types.o0 m2() {
        return this.f136624l;
    }

    public void n2() {
        Class<?> cls;
        String str = this.f136621i;
        if (str == null || str.isEmpty()) {
            g2("There is no classname specified");
            return;
        }
        try {
            if (this.f136624l == null) {
                cls = Class.forName(this.f136621i);
            } else {
                cls = Class.forName(this.f136621i, true, b().z(this.f136624l));
            }
            this.f136622j = (v) cls.asSubclass(v.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            Project projectB = b();
            if (projectB != null) {
                projectB.o1(this.f136622j);
            }
        } catch (ClassNotFoundException unused) {
            g2("Selector " + this.f136621i + " not initialized, no such class");
        } catch (IllegalAccessException unused2) {
            g2("Selector " + this.f136621i + " not initialized, class not accessible");
        } catch (InstantiationException | NoSuchMethodException | InvocationTargetException unused3) {
            g2("Selector " + this.f136621i + " not initialized, could not create class");
        }
    }

    public void o2(String str) {
        this.f136621i = str;
    }

    public final void p2(org.apache.tools.ant.types.o0 o0Var) {
        if (Y1()) {
            throw d2();
        }
        org.apache.tools.ant.types.o0 o0Var2 = this.f136624l;
        if (o0Var2 == null) {
            this.f136624l = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void q2(q1 q1Var) {
        if (Y1()) {
            throw d2();
        }
        l2().c2(q1Var);
    }
}
