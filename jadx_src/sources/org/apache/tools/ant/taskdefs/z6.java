package org.apache.tools.ant.taskdefs;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Touch.java */
/* JADX INFO: loaded from: classes5.dex */
public class z6 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final c f136045u = new a();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final org.apache.tools.ant.util.j0 f136046v = org.apache.tools.ant.util.j0.O();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private File f136047k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f136049m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private org.apache.tools.ant.types.resources.w1 f136051o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f136052p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f136053q;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f136048l = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<org.apache.tools.ant.types.b0> f136050n = new Vector();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f136054r = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private org.apache.tools.ant.util.g0 f136055s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private c f136056t = f136045u;

    /* JADX INFO: compiled from: Touch.java */
    public class a implements c {
        a() {
        }

        @Override // org.apache.tools.ant.taskdefs.z6.c
        public DateFormat a() {
            return org.apache.tools.ant.util.d0.f136756q.get();
        }

        @Override // org.apache.tools.ant.taskdefs.z6.c
        public DateFormat b() {
            return org.apache.tools.ant.util.d0.f136755p.get();
        }
    }

    /* JADX INFO: compiled from: Touch.java */
    public class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f136057a;

        b(String str) {
            this.f136057a = str;
        }

        @Override // org.apache.tools.ant.taskdefs.z6.c
        public DateFormat a() {
            return null;
        }

        @Override // org.apache.tools.ant.taskdefs.z6.c
        public DateFormat b() {
            return new SimpleDateFormat(this.f136057a);
        }
    }

    /* JADX INFO: compiled from: Touch.java */
    public interface c {
        DateFormat a();

        DateFormat b();
    }

    private long o2() {
        long j10 = this.f136048l;
        return j10 < 0 ? System.currentTimeMillis() : j10;
    }

    private void x2(File file, long j10) {
        if (!file.exists()) {
            x1("Creating " + file, this.f136054r ? 2 : 3);
            try {
                f136046v.C(file, this.f136053q);
            } catch (IOException e10) {
                throw new BuildException("Could not create " + file, e10, w1());
            }
        }
        if (!file.canWrite()) {
            throw new BuildException("Can not change modification date of read-only file %s", file);
        }
        f136046v.p0(file, j10);
    }

    private void y2(org.apache.tools.ant.types.s1 s1Var, long j10) {
        org.apache.tools.ant.util.g0 g0Var = this.f136055s;
        if (g0Var == null) {
            org.apache.tools.ant.types.resources.y yVar = (org.apache.tools.ant.types.resources.y) s1Var.e2(org.apache.tools.ant.types.resources.y.class);
            if (yVar != null) {
                x2(yVar.l0(), j10);
                return;
            } else {
                ((org.apache.tools.ant.types.resources.o1) s1Var.e2(org.apache.tools.ant.types.resources.o1.class)).Z0(j10);
                return;
            }
        }
        String[] strArrY0 = g0Var.y0(s1Var.k2());
        if (strArrY0 == null || strArrY0.length <= 0) {
            return;
        }
        if (this.f136048l < 0 && s1Var.p2()) {
            j10 = s1Var.i2();
        }
        for (String str : strArrY0) {
            x2(b().W0(str), j10);
        }
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        n2();
        v2();
    }

    public synchronized void i2(org.apache.tools.ant.types.u1 u1Var) {
        org.apache.tools.ant.types.resources.w1 w1Var = this.f136051o;
        if (w1Var == null) {
            w1Var = new org.apache.tools.ant.types.resources.w1();
        }
        this.f136051o = w1Var;
        w1Var.f2(u1Var);
    }

    public void j2(org.apache.tools.ant.util.g0 g0Var) throws BuildException {
        if (this.f136055s != null) {
            throw new BuildException("Only one mapper may be added to the %s task.", K1());
        }
        this.f136055s = g0Var;
    }

    public void k2(org.apache.tools.ant.types.k0 k0Var) {
        j2(k0Var.i2());
    }

    public void l2(org.apache.tools.ant.types.a0 a0Var) {
        i2(a0Var);
    }

    public void m2(org.apache.tools.ant.types.b0 b0Var) {
        this.f136050n.add(b0Var);
        i2(b0Var);
    }

    protected synchronized void n2() throws BuildException {
        long jCurrentTimeMillis;
        File file = this.f136047k;
        if (file == null && this.f136051o == null) {
            throw new BuildException("Specify at least one source--a file or resource collection.");
        }
        if (file != null && file.exists() && this.f136047k.isDirectory()) {
            throw new BuildException("Use a resource collection to touch directories.");
        }
        String str = this.f136049m;
        if (str != null && !this.f136052p) {
            long time = this.f136048l;
            if ("now".equalsIgnoreCase(str)) {
                jCurrentTimeMillis = System.currentTimeMillis();
            } else {
                ParseException parseException = null;
                try {
                    time = this.f136056t.b().parse(this.f136049m).getTime();
                } catch (ParseException e10) {
                    e = e10;
                    DateFormat dateFormatA = this.f136056t.a();
                    if (dateFormatA == null) {
                        parseException = e;
                    } else {
                        try {
                            time = dateFormatA.parse(this.f136049m).getTime();
                        } catch (ParseException e11) {
                            e = e11;
                            parseException = e;
                        }
                    }
                }
                if (parseException != null) {
                    throw new BuildException(parseException.getMessage(), parseException, w1());
                }
                if (time < 0) {
                    throw new BuildException("Date of %s results in negative milliseconds value relative to epoch (January 1, 1970, 00:00:00 GMT).", this.f136049m);
                }
                jCurrentTimeMillis = time;
            }
            x1("Setting millis to " + jCurrentTimeMillis + " from datetime attribute", this.f136048l < 0 ? 4 : 3);
            r2(jCurrentTimeMillis);
            this.f136052p = true;
        }
    }

    public void p2(String str) {
        if (this.f136049m != null) {
            x1("Resetting datetime attribute to " + str, 3);
        }
        this.f136049m = str;
        this.f136052p = false;
    }

    public void q2(File file) {
        this.f136047k = file;
    }

    public void r2(long j10) {
        this.f136048l = j10;
    }

    public void s2(boolean z10) {
        this.f136053q = z10;
    }

    public void t2(String str) {
        this.f136056t = new b(str);
    }

    public void u2(boolean z10) {
        this.f136054r = z10;
    }

    protected void v2() throws BuildException {
        long jO2 = o2();
        if (this.f136047k != null) {
            y2(new org.apache.tools.ant.types.resources.z(this.f136047k.getParentFile(), this.f136047k.getName()), jO2);
        }
        org.apache.tools.ant.types.resources.w1 w1Var = this.f136051o;
        if (w1Var == null) {
            return;
        }
        for (org.apache.tools.ant.types.s1 s1Var : w1Var) {
            if (((org.apache.tools.ant.types.resources.o1) s1Var.e2(org.apache.tools.ant.types.resources.o1.class)) == null) {
                throw new BuildException("Can't touch " + s1Var);
            }
            y2(s1Var, jO2);
        }
        for (org.apache.tools.ant.types.b0 b0Var : this.f136050n) {
            org.apache.tools.ant.v0 v0VarB2 = b0Var.B2(b());
            File fileZ2 = b0Var.z2(b());
            for (String str : v0VarB2.j()) {
                y2(new org.apache.tools.ant.types.resources.z(fileZ2, str), jO2);
            }
        }
    }

    @Deprecated
    protected void w2(File file) {
        x2(file, o2());
    }
}
