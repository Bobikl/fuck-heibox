package org.apache.tools.ant.taskdefs;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: JDBCTask.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class k2 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f134400w = 3;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Hashtable<String, org.apache.tools.ant.g> f134401x = new Hashtable<>(3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private org.apache.tools.ant.types.o0 f134403l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private org.apache.tools.ant.g f134404m;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f134402k = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f134405n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f134406o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f134407p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f134408q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f134409r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f134410s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f134411t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f134412u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List<b5> f134413v = new ArrayList();

    private Driver m2() throws BuildException {
        Class clsAsSubclass;
        if (this.f134406o == null) {
            throw new BuildException("Driver attribute must be set!", w1());
        }
        try {
            if (this.f134403l != null) {
                Hashtable<String, org.apache.tools.ant.g> hashtable = f134401x;
                synchronized (hashtable) {
                    if (this.f134402k) {
                        this.f134404m = hashtable.get(this.f134406o);
                    }
                    if (this.f134404m == null) {
                        x1("Loading " + this.f134406o + " using AntClassLoader with classpath " + this.f134403l, 3);
                        org.apache.tools.ant.g gVarZ = b().z(this.f134403l);
                        this.f134404m = gVarZ;
                        if (this.f134402k) {
                            hashtable.put(this.f134406o, gVarZ);
                        }
                    } else {
                        x1("Loading " + this.f134406o + " using a cached AntClassLoader.", 3);
                    }
                }
                clsAsSubclass = this.f134404m.loadClass(this.f134406o).asSubclass(Driver.class);
            } else {
                x1("Loading " + this.f134406o + " using system loader.", 3);
                clsAsSubclass = Class.forName(this.f134406o).asSubclass(Driver.class);
            }
            return (Driver) clsAsSubclass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e10) {
            throw new BuildException("Class Not Found: JDBC driver " + this.f134406o + " could not be loaded", e10, w1());
        } catch (IllegalAccessException e11) {
            throw new BuildException("Illegal Access: JDBC driver " + this.f134406o + " could not be loaded", e11, w1());
        } catch (InstantiationException e12) {
            e = e12;
            throw new BuildException(e.getClass().getSimpleName() + ": JDBC driver " + this.f134406o + " could not be loaded", e, w1());
        } catch (NoSuchMethodException e13) {
            e = e13;
            throw new BuildException(e.getClass().getSimpleName() + ": JDBC driver " + this.f134406o + " could not be loaded", e, w1());
        } catch (InvocationTargetException e14) {
            e = e14;
            throw new BuildException(e.getClass().getSimpleName() + ": JDBC driver " + this.f134406o + " could not be loaded", e, w1());
        }
    }

    protected static Hashtable<String, org.apache.tools.ant.g> o2() {
        return f134401x;
    }

    public void A2(org.apache.tools.ant.types.q1 q1Var) {
        j2().c2(q1Var);
    }

    public void B2(String str) {
        this.f134406o = str.trim();
    }

    public void C2(boolean z10) {
        this.f134412u = z10;
    }

    public void D2(String str) {
        this.f134409r = str;
    }

    public void E2(String str) {
        this.f134410s = str;
    }

    public void F2(String str) {
        this.f134407p = str;
    }

    public void G2(String str) {
        this.f134408q = str;
    }

    public void H2(String str) {
        this.f134411t = str;
    }

    public void i2(b5 b5Var) {
        this.f134413v.add(b5Var);
    }

    public org.apache.tools.ant.types.o0 j2() {
        if (this.f134403l == null) {
            this.f134403l = new org.apache.tools.ant.types.o0(b());
        }
        return this.f134403l.u2();
    }

    public org.apache.tools.ant.types.o0 k2() {
        return this.f134403l;
    }

    protected Connection l2() throws BuildException {
        if (this.f134408q == null) {
            throw new BuildException("UserId attribute must be set!", w1());
        }
        if (this.f134409r == null) {
            throw new BuildException("Password attribute must be set!", w1());
        }
        if (this.f134407p == null) {
            throw new BuildException("Url attribute must be set!", w1());
        }
        try {
            x1("connecting to " + r2(), 3);
            Properties properties = new Properties();
            properties.put("user", s2());
            properties.put(g0.a.f118920d, p2());
            for (b5 b5Var : this.f134413v) {
                String strR2 = b5Var.r2();
                String strY2 = b5Var.y2();
                if (strR2 == null || strY2 == null) {
                    x1("Only name/value pairs are supported as connection properties.", 1);
                } else {
                    x1("Setting connection property " + strR2 + " to " + strY2, 3);
                    properties.put(strR2, strY2);
                }
            }
            Connection connectionConnect = m2().connect(r2(), properties);
            if (connectionConnect != null) {
                connectionConnect.setAutoCommit(this.f134405n);
                return connectionConnect;
            }
            throw new SQLException("No suitable Driver for " + this.f134407p);
        } catch (SQLException e10) {
            if (this.f134412u) {
                throw new BuildException(e10, w1());
            }
            x1("Failed to connect: " + e10.getMessage(), 1);
            return null;
        }
    }

    protected org.apache.tools.ant.g n2() {
        return this.f134404m;
    }

    public String p2() {
        return this.f134409r;
    }

    public String q2() {
        return this.f134410s;
    }

    public String r2() {
        return this.f134407p;
    }

    public String s2() {
        return this.f134408q;
    }

    public String t2() {
        return this.f134411t;
    }

    public boolean u2() {
        return this.f134405n;
    }

    public void v2(boolean z10) {
        this.f134402k = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        if (r7.contains(" " + r6.f134411t) == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean w2(java.sql.Connection r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.f134410s
            r1 = 1
            if (r0 != 0) goto La
            java.lang.String r0 = r6.f134411t
            if (r0 != 0) goto La
            return r1
        La:
            r0 = 0
            java.sql.DatabaseMetaData r7 = r7.getMetaData()     // Catch: java.sql.SQLException -> Lb3
            java.lang.String r2 = r6.f134410s     // Catch: java.sql.SQLException -> Lb3
            r3 = 3
            if (r2 == 0) goto L51
            java.lang.String r2 = r7.getDatabaseProductName()     // Catch: java.sql.SQLException -> Lb3
            java.lang.String r2 = r2.toLowerCase()     // Catch: java.sql.SQLException -> Lb3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.sql.SQLException -> Lb3
            r4.<init>()     // Catch: java.sql.SQLException -> Lb3
            java.lang.String r5 = "RDBMS = "
            r4.append(r5)     // Catch: java.sql.SQLException -> Lb3
            r4.append(r2)     // Catch: java.sql.SQLException -> Lb3
            java.lang.String r4 = r4.toString()     // Catch: java.sql.SQLException -> Lb3
            r6.x1(r4, r3)     // Catch: java.sql.SQLException -> Lb3
            if (r2 == 0) goto L3a
            java.lang.String r4 = r6.f134410s     // Catch: java.sql.SQLException -> Lb3
            boolean r2 = r2.contains(r4)     // Catch: java.sql.SQLException -> Lb3
            if (r2 != 0) goto L51
        L3a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.sql.SQLException -> Lb3
            r7.<init>()     // Catch: java.sql.SQLException -> Lb3
            java.lang.String r1 = "Not the required RDBMS: "
            r7.append(r1)     // Catch: java.sql.SQLException -> Lb3
            java.lang.String r1 = r6.f134410s     // Catch: java.sql.SQLException -> Lb3
            r7.append(r1)     // Catch: java.sql.SQLException -> Lb3
            java.lang.String r7 = r7.toString()     // Catch: java.sql.SQLException -> Lb3
            r6.x1(r7, r3)     // Catch: java.sql.SQLException -> Lb3
            return r0
        L51:
            java.lang.String r2 = r6.f134411t     // Catch: java.sql.SQLException -> Lb3
            if (r2 == 0) goto Lb2
            java.lang.String r7 = r7.getDatabaseProductVersion()     // Catch: java.sql.SQLException -> Lb3
            java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch: java.sql.SQLException -> Lb3
            java.lang.String r7 = r7.toLowerCase(r2)     // Catch: java.sql.SQLException -> Lb3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.sql.SQLException -> Lb3
            r2.<init>()     // Catch: java.sql.SQLException -> Lb3
            java.lang.String r4 = "Version = "
            r2.append(r4)     // Catch: java.sql.SQLException -> Lb3
            r2.append(r7)     // Catch: java.sql.SQLException -> Lb3
            java.lang.String r2 = r2.toString()     // Catch: java.sql.SQLException -> Lb3
            r6.x1(r2, r3)     // Catch: java.sql.SQLException -> Lb3
            if (r7 == 0) goto L96
            java.lang.String r2 = r6.f134411t     // Catch: java.sql.SQLException -> Lb3
            boolean r2 = r7.startsWith(r2)     // Catch: java.sql.SQLException -> Lb3
            if (r2 != 0) goto Lb2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.sql.SQLException -> Lb3
            r2.<init>()     // Catch: java.sql.SQLException -> Lb3
            java.lang.String r4 = " "
            r2.append(r4)     // Catch: java.sql.SQLException -> Lb3
            java.lang.String r4 = r6.f134411t     // Catch: java.sql.SQLException -> Lb3
            r2.append(r4)     // Catch: java.sql.SQLException -> Lb3
            java.lang.String r2 = r2.toString()     // Catch: java.sql.SQLException -> Lb3
            boolean r7 = r7.contains(r2)     // Catch: java.sql.SQLException -> Lb3
            if (r7 != 0) goto Lb2
        L96:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.sql.SQLException -> Lb3
            r7.<init>()     // Catch: java.sql.SQLException -> Lb3
            java.lang.String r1 = "Not the required version: \""
            r7.append(r1)     // Catch: java.sql.SQLException -> Lb3
            java.lang.String r1 = r6.f134411t     // Catch: java.sql.SQLException -> Lb3
            r7.append(r1)     // Catch: java.sql.SQLException -> Lb3
            java.lang.String r1 = "\""
            r7.append(r1)     // Catch: java.sql.SQLException -> Lb3
            java.lang.String r7 = r7.toString()     // Catch: java.sql.SQLException -> Lb3
            r6.x1(r7, r3)     // Catch: java.sql.SQLException -> Lb3
            return r0
        Lb2:
            return r1
        Lb3:
            java.lang.String r7 = "Failed to obtain required RDBMS information"
            r6.x1(r7, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tools.ant.taskdefs.k2.w2(java.sql.Connection):boolean");
    }

    public void x2(boolean z10) {
        this.f134405n = z10;
    }

    public void y2(boolean z10) {
        this.f134402k = z10;
    }

    public void z2(org.apache.tools.ant.types.o0 o0Var) {
        this.f134403l = o0Var;
    }
}
