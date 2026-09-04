package org.apache.tools.ant.taskdefs;

import java.util.List;
import java.util.Vector;
import java.util.function.Consumer;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Sequential.java */
/* JADX INFO: loaded from: classes5.dex */
public class d6 extends org.apache.tools.ant.u2 implements org.apache.tools.ant.x2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<org.apache.tools.ant.u2> f134052k = new Vector();

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        org.apache.tools.ant.property.b bVarJ = org.apache.tools.ant.property.b.j(b());
        bVarJ.h();
        try {
            this.f134052k.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.c6
                @Override // java.util.function.Consumer
                public final void accept(Object obj) throws Throwable {
                    ((org.apache.tools.ant.u2) obj).b2();
                }
            });
        } finally {
            bVarJ.i();
        }
    }

    @Override // org.apache.tools.ant.x2
    public void c1(org.apache.tools.ant.u2 u2Var) {
        this.f134052k.add(u2Var);
    }
}
