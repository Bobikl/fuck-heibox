package org.apache.tools.ant.types.selectors;

import java.io.File;
import java.util.Enumeration;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.p2;

/* JADX INFO: compiled from: SelectSelector.java */
/* JADX INFO: loaded from: classes5.dex */
public class j0 extends j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Object f136521j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Object f136522k;

    private j0 s2() {
        return (j0) O1(j0.class);
    }

    @Override // org.apache.tools.ant.types.selectors.j, org.apache.tools.ant.types.selectors.k0
    public v[] N0(Project project) {
        return Y1() ? s2().N0(project) : super.N0(project);
    }

    @Override // org.apache.tools.ant.types.selectors.j, org.apache.tools.ant.types.selectors.h, org.apache.tools.ant.types.selectors.v
    public boolean P0(File file, String str, File file2) {
        i2();
        if (!t2()) {
            return false;
        }
        Enumeration<v> enumerationY = Y();
        return !enumerationY.hasMoreElements() || enumerationY.nextElement().P0(file, str, file2);
    }

    @Override // org.apache.tools.ant.types.selectors.j, org.apache.tools.ant.types.selectors.k0
    public boolean S0() {
        return Y1() ? s2().S0() : super.S0();
    }

    @Override // org.apache.tools.ant.types.selectors.j, org.apache.tools.ant.types.selectors.k0
    public Enumeration<v> Y() {
        return Y1() ? s2().Y() : super.Y();
    }

    @Override // org.apache.tools.ant.types.selectors.j, org.apache.tools.ant.types.selectors.k0
    public void d0(v vVar) {
        if (Y1()) {
            throw Z1();
        }
        super.d0(vVar);
    }

    @Override // org.apache.tools.ant.types.selectors.h
    public void j2() {
        int iP1 = p1();
        if (iP1 < 0 || iP1 > 1) {
            g2("Only one selector is allowed within the <selector> tag");
        }
    }

    @Override // org.apache.tools.ant.types.selectors.j, org.apache.tools.ant.types.selectors.k0
    public int p1() {
        return Y1() ? s2().p1() : super.p1();
    }

    public boolean t2() {
        p2 p2VarU = p2.u(b());
        return p2VarU.W(this.f136521j) && p2VarU.X(this.f136522k);
    }

    @Override // org.apache.tools.ant.types.selectors.j, org.apache.tools.ant.types.s
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (S0()) {
            sb2.append("{select");
            if (this.f136521j != null) {
                sb2.append(" if: ");
                sb2.append(this.f136521j);
            }
            if (this.f136522k != null) {
                sb2.append(" unless: ");
                sb2.append(this.f136522k);
            }
            sb2.append(" ");
            sb2.append(super.toString());
            sb2.append(z5.g.f141884d);
        }
        return sb2.toString();
    }

    public void u2(Object obj) {
        this.f136521j = obj;
    }

    public void v2(String str) {
        u2(str);
    }

    public void w2(Object obj) {
        this.f136522k = obj;
    }

    public void x2(String str) {
        w2(str);
    }
}
