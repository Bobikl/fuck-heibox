package org.apache.tools.ant.listener;

import kotlin.text.y;
import org.apache.tools.ant.BuildEvent;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.q2;

/* JADX INFO: compiled from: BigProjectLogger.java */
/* JADX INFO: loaded from: classes5.dex */
public class b extends i implements q2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f133531l = "======================================================================";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f133532m = "======================================================================";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f133533j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f133534k = new Object();

    private void p(BuildEvent buildEvent) {
        if (this.f133533j) {
            return;
        }
        synchronized (this.f133534k) {
            if (!this.f133533j) {
                this.f133533j = true;
                E0(buildEvent);
            }
        }
    }

    @Override // org.apache.tools.ant.q2
    public void E0(BuildEvent buildEvent) {
        String str;
        Project projectD = buildEvent.d();
        if (projectD == null) {
            str = "With no base directory";
        } else {
            str = "In " + projectD.Z().getAbsolutePath();
        }
        i(String.format("%n%s%nEntering project %s%n%s%n%s", o(), l(buildEvent), str, n()), this.f137112b, buildEvent.c());
    }

    @Override // org.apache.tools.ant.y, org.apache.tools.ant.k
    public void R0(BuildEvent buildEvent) {
        p(buildEvent);
        W0(buildEvent);
        super.R0(buildEvent);
    }

    @Override // org.apache.tools.ant.w1, org.apache.tools.ant.y, org.apache.tools.ant.k
    public void V(BuildEvent buildEvent) {
        p(buildEvent);
        super.V(buildEvent);
    }

    @Override // org.apache.tools.ant.q2
    public void W0(BuildEvent buildEvent) {
        Object[] objArr = new Object[4];
        objArr[0] = o();
        objArr[1] = buildEvent.a() != null ? "failing " : "";
        objArr[2] = l(buildEvent);
        objArr[3] = n();
        i(String.format("%n%s%nExiting %sproject %s%n%s", objArr), this.f137112b, buildEvent.c());
    }

    @Override // org.apache.tools.ant.y
    protected String d() {
        return super.d() + j.f133556i + f();
    }

    @Override // org.apache.tools.ant.y
    protected String e() {
        return super.e() + j.f133556i + f();
    }

    @Override // org.apache.tools.ant.y, org.apache.tools.ant.k
    public void h0(BuildEvent buildEvent) {
        p(buildEvent);
        super.h0(buildEvent);
    }

    protected String l(BuildEvent buildEvent) {
        String strB = b(buildEvent);
        if (strB == null) {
            return "";
        }
        return y.f128593b + strB + y.f128593b;
    }

    protected String n() {
        return "======================================================================";
    }

    protected String o() {
        return "======================================================================";
    }

    @Override // org.apache.tools.ant.w1, org.apache.tools.ant.y, org.apache.tools.ant.k
    public void r1(BuildEvent buildEvent) {
        p(buildEvent);
        super.r1(buildEvent);
    }
}
