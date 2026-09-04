package org.apache.tools.ant.taskdefs.condition;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.b2;
import org.apache.tools.ant.taskdefs.z6;
import org.apache.tools.ant.types.s1;

/* JADX INFO: compiled from: IsLastModified.java */
/* JADX INFO: loaded from: classes5.dex */
public class o extends b2 implements d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private s1 f133924h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f133921e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f133922f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private z6.c f133923g = z6.f136045u;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b f133925i = b.f133933h;

    /* JADX INFO: compiled from: IsLastModified.java */
    public class a implements z6.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f133926a;

        a(String str) {
            this.f133926a = str;
        }

        @Override // org.apache.tools.ant.taskdefs.z6.c
        public DateFormat a() {
            return null;
        }

        @Override // org.apache.tools.ant.taskdefs.z6.c
        public DateFormat b() {
            return new SimpleDateFormat(this.f133926a);
        }
    }

    /* JADX INFO: compiled from: IsLastModified.java */
    public static class b extends org.apache.tools.ant.types.w {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f133929d = "before";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f133930e = "after";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f133931f = "not-before";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f133932g = "not-after";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f133928c = "equals";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final b f133933h = new b(f133928c);

        public b() {
            this(f133928c);
        }

        public b(String str) {
            g(str);
        }

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{f133928c, "before", "after", f133931f, f133932g};
        }
    }

    public void B1(s1 s1Var) {
        if (this.f133924h != null) {
            throw new BuildException("only one resource can be tested");
        }
        this.f133924h = s1Var;
    }

    protected long D1() throws BuildException {
        long j10 = this.f133921e;
        if (j10 >= 0) {
            return j10;
        }
        if ("now".equalsIgnoreCase(this.f133922f)) {
            return System.currentTimeMillis();
        }
        try {
            return this.f133923g.b().parse(this.f133922f).getTime();
        } catch (ParseException e10) {
            e = e10;
            DateFormat dateFormatA = this.f133923g.a();
            if (dateFormatA != null) {
                try {
                    return dateFormatA.parse(this.f133922f).getTime();
                } catch (ParseException e11) {
                    e = e11;
                    throw new BuildException(e.getMessage(), e, w1());
                }
            }
            throw new BuildException(e.getMessage(), e, w1());
        }
    }

    public void G1(String str) {
        this.f133922f = str;
    }

    public void H1(long j10) {
        this.f133921e = j10;
    }

    public void I1(b bVar) {
        this.f133925i = bVar;
    }

    public void K1(String str) {
        this.f133923g = new a(str);
    }

    protected void L1() throws BuildException {
        long j10 = this.f133921e;
        if (j10 >= 0 && this.f133922f != null) {
            throw new BuildException("Only one of dateTime and millis can be set");
        }
        if (j10 < 0 && this.f133922f == null) {
            throw new BuildException("millis or dateTime is required");
        }
        if (this.f133924h == null) {
            throw new BuildException("resource is required");
        }
    }

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() throws BuildException {
        L1();
        long jD1 = D1();
        long jI2 = this.f133924h.i2();
        x1("expected timestamp: " + jD1 + " (" + new Date(jD1) + "), actual timestamp: " + jI2 + " (" + new Date(jI2) + ")", 3);
        if ("equals".equals(this.f133925i.d())) {
            return jD1 == jI2;
        }
        if (com.google.android.exoplayer2.text.ttml.d.f49784c0.equals(this.f133925i.d())) {
            return jD1 > jI2;
        }
        if ("not-before".equals(this.f133925i.d())) {
            return jD1 <= jI2;
        }
        if (com.google.android.exoplayer2.text.ttml.d.f49785d0.equals(this.f133925i.d())) {
            return jD1 < jI2;
        }
        if ("not-after".equals(this.f133925i.d())) {
            return jD1 >= jI2;
        }
        throw new BuildException("Unknown mode " + this.f133925i.d());
    }
}
