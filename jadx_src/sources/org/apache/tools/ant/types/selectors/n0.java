package org.apache.tools.ant.types.selectors;

import java.io.File;
import org.apache.tools.ant.types.s1;

/* JADX INFO: compiled from: SignedSelector.java */
/* JADX INFO: loaded from: classes5.dex */
public class n0 extends org.apache.tools.ant.types.s implements v {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private org.apache.tools.ant.taskdefs.condition.t f136587g = new org.apache.tools.ant.taskdefs.condition.t();

    @Override // org.apache.tools.ant.types.selectors.v
    public boolean P0(File file, String str, File file2) {
        if (file2.isDirectory()) {
            return false;
        }
        this.f136587g.J(b());
        this.f136587g.i2(file2);
        return this.f136587g.e();
    }

    @Override // org.apache.tools.ant.types.selectors.v, org.apache.tools.ant.types.resources.selectors.n
    public /* synthetic */ boolean a(s1 s1Var) {
        return u.a(this, s1Var);
    }

    public void e2(String str) {
        this.f136587g.j2(str);
    }
}
