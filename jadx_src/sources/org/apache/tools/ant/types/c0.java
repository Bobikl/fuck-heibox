package org.apache.tools.ant.types;

import java.util.Stack;
import java.util.Vector;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: FilterChain.java */
/* JADX INFO: loaded from: classes5.dex */
public class c0 extends s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Vector<Object> f136109g = new Vector<>();

    private c0 C2() {
        return (c0) O1(c0.class);
    }

    public void A2(org.apache.tools.ant.filters.z.k kVar) {
        if (Y1()) {
            throw Z1();
        }
        b2(false);
        this.f136109g.addElement(kVar);
    }

    public Vector<Object> B2() {
        if (Y1()) {
            return C2().B2();
        }
        H1();
        return this.f136109g;
    }

    @Override // org.apache.tools.ant.types.s
    protected synchronized void I1(Stack<Object> stack, Project project) throws BuildException {
        if (X1()) {
            return;
        }
        if (Y1()) {
            super.I1(stack, project);
        } else {
            for (Object obj : this.f136109g) {
                if (obj instanceof s) {
                    s.a2((s) obj, stack, project);
                }
            }
            b2(true);
        }
    }

    @Override // org.apache.tools.ant.types.s
    public void c2(q1 q1Var) throws BuildException {
        if (!this.f136109g.isEmpty()) {
            throw d2();
        }
        super.c2(q1Var);
    }

    public void e2(org.apache.tools.ant.filters.c cVar) {
        if (Y1()) {
            throw Z1();
        }
        b2(false);
        this.f136109g.addElement(cVar);
    }

    public void f2(org.apache.tools.ant.filters.d dVar) {
        if (Y1()) {
            throw Z1();
        }
        b2(false);
        this.f136109g.addElement(dVar);
    }

    public void g2(org.apache.tools.ant.filters.z.b bVar) {
        if (Y1()) {
            throw Z1();
        }
        b2(false);
        this.f136109g.addElement(bVar);
    }

    public void h2(org.apache.tools.ant.filters.z.d dVar) {
        if (Y1()) {
            throw Z1();
        }
        b2(false);
        this.f136109g.addElement(dVar);
    }

    public void i2(org.apache.tools.ant.filters.f fVar) {
        if (Y1()) {
            throw Z1();
        }
        b2(false);
        this.f136109g.addElement(fVar);
    }

    public void j2(org.apache.tools.ant.filters.h hVar) {
        if (Y1()) {
            throw Z1();
        }
        b2(false);
        this.f136109g.addElement(hVar);
    }

    public void k2(j jVar) {
        if (Y1()) {
            throw Z1();
        }
        b2(false);
        this.f136109g.addElement(jVar);
    }

    public void l2(org.apache.tools.ant.filters.j jVar) {
        if (Y1()) {
            throw Z1();
        }
        b2(false);
        this.f136109g.addElement(jVar);
    }

    public void m2(org.apache.tools.ant.filters.z.g gVar) {
        if (Y1()) {
            throw Z1();
        }
        b2(false);
        this.f136109g.addElement(gVar);
    }

    public void n2(org.apache.tools.ant.filters.k kVar) {
        if (Y1()) {
            throw Z1();
        }
        b2(false);
        this.f136109g.addElement(kVar);
    }

    public void o2(org.apache.tools.ant.filters.l lVar) {
        if (Y1()) {
            throw Z1();
        }
        b2(false);
        this.f136109g.addElement(lVar);
    }

    public void p2(org.apache.tools.ant.filters.n nVar) {
        if (Y1()) {
            throw Z1();
        }
        b2(false);
        this.f136109g.addElement(nVar);
    }

    public void q2(org.apache.tools.ant.filters.z.h hVar) {
        if (Y1()) {
            throw Z1();
        }
        b2(false);
        this.f136109g.addElement(hVar);
    }

    public void r2(org.apache.tools.ant.filters.z.i iVar) {
        if (Y1()) {
            throw Z1();
        }
        b2(false);
        this.f136109g.addElement(iVar);
    }

    public void s2(org.apache.tools.ant.filters.p pVar) {
        if (Y1()) {
            throw Z1();
        }
        b2(false);
        this.f136109g.addElement(pVar);
    }

    public void t2(org.apache.tools.ant.filters.t tVar) {
        if (Y1()) {
            throw Z1();
        }
        b2(false);
        this.f136109g.addElement(tVar);
    }

    public void u2(org.apache.tools.ant.filters.u uVar) {
        if (Y1()) {
            throw Z1();
        }
        b2(false);
        this.f136109g.addElement(uVar);
    }

    public void v2(org.apache.tools.ant.filters.v vVar) {
        if (Y1()) {
            throw Z1();
        }
        b2(false);
        this.f136109g.addElement(vVar);
    }

    public void w2(org.apache.tools.ant.filters.w wVar) {
        if (Y1()) {
            throw Z1();
        }
        b2(false);
        this.f136109g.addElement(wVar);
    }

    public void x2(org.apache.tools.ant.filters.x xVar) {
        if (Y1()) {
            throw Z1();
        }
        b2(false);
        this.f136109g.addElement(xVar);
    }

    public void y2(org.apache.tools.ant.filters.y yVar) {
        if (Y1()) {
            throw Z1();
        }
        b2(false);
        this.f136109g.addElement(yVar);
    }

    public void z2(org.apache.tools.ant.filters.z zVar) {
        if (Y1()) {
            throw Z1();
        }
        b2(false);
        this.f136109g.addElement(zVar);
    }
}
