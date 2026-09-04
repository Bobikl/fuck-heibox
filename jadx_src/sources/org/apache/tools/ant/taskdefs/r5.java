package org.apache.tools.ant.taskdefs;

import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: ResourceCount.java */
/* JADX INFO: loaded from: classes5.dex */
public class r5 extends org.apache.tools.ant.u2 implements org.apache.tools.ant.taskdefs.condition.d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f135680o = "ResourceCount can count resources from exactly one nested ResourceCollection.";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f135681p = "Use of the ResourceCount condition requires that the count attribute be set.";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private org.apache.tools.ant.types.u1 f135682k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private org.apache.tools.ant.types.q f135683l = org.apache.tools.ant.types.q.f136292d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Integer f135684m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f135685n;

    @Override // org.apache.tools.ant.u2
    public void D1() {
        if (this.f135682k == null) {
            throw new BuildException(f135680o);
        }
        if (this.f135685n != null) {
            b().n1(this.f135685n, Integer.toString(this.f135682k.size()));
            return;
        }
        log("resource count = " + this.f135682k.size());
    }

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() {
        org.apache.tools.ant.types.u1 u1Var = this.f135682k;
        if (u1Var == null) {
            throw new BuildException(f135680o);
        }
        if (this.f135684m != null) {
            return this.f135683l.h(Integer.valueOf(u1Var.size()).compareTo(this.f135684m));
        }
        throw new BuildException(f135681p);
    }

    public void i2(org.apache.tools.ant.types.u1 u1Var) {
        if (this.f135682k != null) {
            throw new BuildException(f135680o);
        }
        this.f135682k = u1Var;
    }

    public void j2(int i10) {
        this.f135684m = Integer.valueOf(i10);
    }

    public void k2(String str) {
        this.f135685n = str;
    }

    public void l2(org.apache.tools.ant.types.q1 q1Var) {
        Object objC = q1Var.c();
        if (!(objC instanceof org.apache.tools.ant.types.u1)) {
            throw new BuildException("%s doesn't denote a ResourceCollection", q1Var.b());
        }
        i2((org.apache.tools.ant.types.u1) objC);
    }

    public void m2(org.apache.tools.ant.types.q qVar) {
        this.f135683l = qVar;
    }
}
