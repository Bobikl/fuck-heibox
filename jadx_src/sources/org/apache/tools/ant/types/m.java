package org.apache.tools.ant.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Assertions.java */
/* JADX INFO: loaded from: classes5.dex */
public class m extends s implements Cloneable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f136221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList<a> f136222h = new ArrayList<>();

    /* JADX INFO: compiled from: Assertions.java */
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f136223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f136224b;

        protected String a() {
            return this.f136224b;
        }

        public abstract String b();

        protected String c() {
            return this.f136223a;
        }

        public void d(String str) {
            this.f136224b = str;
        }

        public void e(String str) {
            this.f136223a = str;
        }

        public String f() {
            if (c() != null && a() != null) {
                throw new BuildException("Both package and class have been set");
            }
            StringBuilder sb2 = new StringBuilder(b());
            if (c() != null) {
                sb2.append(':');
                sb2.append(c());
                if (!sb2.toString().endsWith("...")) {
                    sb2.append("...");
                }
            } else if (a() != null) {
                sb2.append(':');
                sb2.append(a());
            }
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: Assertions.java */
    public static class b extends a {
        @Override // org.apache.tools.ant.types.m.a
        public String b() {
            return "-da";
        }
    }

    /* JADX INFO: compiled from: Assertions.java */
    public static class c extends a {
        @Override // org.apache.tools.ant.types.m.a
        public String b() {
            return "-ea";
        }
    }

    private static void g2(CommandlineJava commandlineJava, String str) {
        commandlineJava.m().O1(str);
    }

    private m k2() {
        if (V1() == null) {
            return this;
        }
        Object objD = V1().d(b());
        if (objD instanceof m) {
            return (m) objD;
        }
        throw new BuildException("reference is of wrong type");
    }

    private int l2() {
        return this.f136222h.size() + (this.f136221g != null ? 1 : 0);
    }

    @Override // org.apache.tools.ant.types.s
    public void c2(q1 q1Var) {
        if (!this.f136222h.isEmpty() || this.f136221g != null) {
            throw d2();
        }
        super.c2(q1Var);
    }

    @Override // org.apache.tools.ant.types.s, org.apache.tools.ant.b2
    public Object clone() throws CloneNotSupportedException {
        m mVar = (m) super.clone();
        mVar.f136222h = new ArrayList<>(this.f136222h);
        return mVar;
    }

    public void e2(b bVar) {
        D1();
        this.f136222h.add(bVar);
    }

    public void f2(c cVar) {
        D1();
        this.f136222h.add(cVar);
    }

    public void h2(List<String> list) {
        b().M0("Applying assertions", 4);
        m mVarK2 = k2();
        if (Boolean.TRUE.equals(mVarK2.f136221g)) {
            b().M0("Enabling system assertions", 4);
            list.add("-enablesystemassertions");
        } else if (Boolean.FALSE.equals(mVarK2.f136221g)) {
            b().M0("disabling system assertions", 4);
            list.add("-disablesystemassertions");
        }
        Iterator<a> it = mVarK2.f136222h.iterator();
        while (it.hasNext()) {
            String strF = it.next().f();
            b().M0("adding assertion " + strF, 4);
            list.add(strF);
        }
    }

    public void i2(ListIterator<String> listIterator) {
        b().M0("Applying assertions", 4);
        m mVarK2 = k2();
        if (Boolean.TRUE.equals(mVarK2.f136221g)) {
            b().M0("Enabling system assertions", 4);
            listIterator.add("-enablesystemassertions");
        } else if (Boolean.FALSE.equals(mVarK2.f136221g)) {
            b().M0("disabling system assertions", 4);
            listIterator.add("-disablesystemassertions");
        }
        Iterator<a> it = mVarK2.f136222h.iterator();
        while (it.hasNext()) {
            String strF = it.next().f();
            b().M0("adding assertion " + strF, 4);
            listIterator.add(strF);
        }
    }

    public void j2(CommandlineJava commandlineJava) {
        m mVarK2 = k2();
        if (Boolean.TRUE.equals(mVarK2.f136221g)) {
            g2(commandlineJava, "-enablesystemassertions");
        } else if (Boolean.FALSE.equals(mVarK2.f136221g)) {
            g2(commandlineJava, "-disablesystemassertions");
        }
        Iterator<a> it = mVarK2.f136222h.iterator();
        while (it.hasNext()) {
            g2(commandlineJava, it.next().f());
        }
    }

    public void m2(Boolean bool) {
        B1();
        this.f136221g = bool;
    }

    public int size() {
        return k2().l2();
    }
}
