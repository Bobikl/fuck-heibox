package org.apache.tools.ant.types.selectors;

/* JADX INFO: compiled from: NotSelector.java */
/* JADX INFO: loaded from: classes5.dex */
public class b0 extends a0 {
    public b0() {
    }

    public b0(v vVar) {
        this();
        d0(vVar);
    }

    @Override // org.apache.tools.ant.types.selectors.h
    public void j2() {
        if (p1() != 1) {
            g2("One and only one selector is allowed within the <not> tag");
        }
    }

    @Override // org.apache.tools.ant.types.selectors.a0, org.apache.tools.ant.types.selectors.j, org.apache.tools.ant.types.s
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (S0()) {
            sb2.append("{notselect: ");
            sb2.append(super.toString());
            sb2.append(z5.g.f141884d);
        }
        return sb2.toString();
    }
}
