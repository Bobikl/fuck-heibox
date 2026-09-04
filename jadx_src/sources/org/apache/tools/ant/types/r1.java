package org.apache.tools.ant.types;

import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: RegularExpression.java */
/* JADX INFO: loaded from: classes5.dex */
public class r1 extends s {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f136306k = "regexp";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final org.apache.tools.ant.util.regexp.d f136307l = new org.apache.tools.ant.util.regexp.d();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f136310i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f136308g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private org.apache.tools.ant.util.regexp.c f136309h = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f136311j = false;

    private void h2(Project project) {
        if (this.f136308g) {
            return;
        }
        this.f136309h = f136307l.h(project);
        this.f136308g = true;
    }

    private void i2() {
        if (this.f136311j) {
            this.f136309h.g(this.f136310i);
            this.f136311j = false;
        }
    }

    public String e2(Project project) {
        h2(project);
        if (Y1()) {
            return f2(project).e2(project);
        }
        i2();
        return this.f136309h.c();
    }

    public r1 f2(Project project) {
        return (r1) R1(r1.class, U1(), project);
    }

    public org.apache.tools.ant.util.regexp.c g2(Project project) {
        h2(project);
        if (Y1()) {
            return f2(project).g2(project);
        }
        i2();
        return this.f136309h;
    }

    public void j2(String str) {
        org.apache.tools.ant.util.regexp.c cVar = this.f136309h;
        if (cVar != null) {
            cVar.g(str);
        } else {
            this.f136310i = str;
            this.f136311j = true;
        }
    }
}
