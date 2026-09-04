package org.apache.tools.ant.taskdefs.condition;

import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;
import org.apache.tools.ant.b2;
import org.apache.tools.ant.taskdefs.n7;

/* JADX INFO: compiled from: ConditionBase.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class e extends b2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f133881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<d> f133882f = new Vector();

    protected e() {
        this.f133881e = "condition";
        this.f133881e = "component";
    }

    protected e(String str) {
        this.f133881e = "condition";
        this.f133881e = str;
    }

    public void B1(d dVar) {
        this.f133882f.add(dVar);
    }

    public void D1(b bVar) {
        this.f133882f.add(bVar);
    }

    public void G1(org.apache.tools.ant.taskdefs.r rVar) {
        this.f133882f.add(rVar);
    }

    public void H1(org.apache.tools.ant.taskdefs.e0 e0Var) {
        this.f133882f.add(e0Var);
    }

    public void I1(f fVar) {
        this.f133882f.add(fVar);
    }

    public void K1(g gVar) {
        this.f133882f.add(gVar);
    }

    public void L1(h hVar) {
        this.f133882f.add(hVar);
    }

    public void N1(k kVar) {
        this.f133882f.add(kVar);
    }

    public void O1(m mVar) {
        this.f133882f.add(mVar);
    }

    public void Q1(n nVar) {
        this.f133882f.add(nVar);
    }

    public void R1(q qVar) {
        this.f133882f.add(qVar);
    }

    public void S1(r rVar) {
        this.f133882f.add(rVar);
    }

    public void U1(u uVar) {
        this.f133882f.add(uVar);
    }

    public void V1(x xVar) {
        this.f133882f.add(xVar);
    }

    public void W1(y yVar) {
        this.f133882f.add(yVar);
    }

    public void X1(z zVar) {
        this.f133882f.add(zVar);
    }

    public void Y1(e0 e0Var) {
        this.f133882f.add(e0Var);
    }

    public void Z1(n7 n7Var) {
        this.f133882f.add(n7Var);
    }

    protected int a2() {
        return this.f133882f.size();
    }

    protected final Enumeration<d> b2() {
        return Collections.enumeration(this.f133882f);
    }

    public String c2() {
        return this.f133881e;
    }

    public void d2(String str) {
        this.f133881e = str;
    }
}
