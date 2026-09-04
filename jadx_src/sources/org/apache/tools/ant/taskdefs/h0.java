package org.apache.tools.ant.taskdefs;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: CloseResources.java */
/* JADX INFO: loaded from: classes5.dex */
public class h0 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private org.apache.tools.ant.types.resources.w1 f134223k = new org.apache.tools.ant.types.resources.w1();

    @Override // org.apache.tools.ant.u2
    public void D1() {
        Iterator<org.apache.tools.ant.types.s1> it = this.f134223k.iterator();
        while (it.hasNext()) {
            org.apache.tools.ant.types.resources.p1 p1Var = (org.apache.tools.ant.types.resources.p1) it.next().e2(org.apache.tools.ant.types.resources.p1.class);
            if (p1Var != null) {
                try {
                    org.apache.tools.ant.util.j0.h(p1Var.getURL().openConnection());
                } catch (IOException unused) {
                }
            }
        }
    }

    public void i2(org.apache.tools.ant.types.u1 u1Var) {
        this.f134223k.f2(u1Var);
    }
}
