package org.apache.tools.ant.taskdefs.condition;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.b2;
import org.apache.tools.ant.types.q1;

/* JADX INFO: compiled from: IsReference.java */
/* JADX INFO: loaded from: classes5.dex */
public class q extends b2 implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private q1 f133948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f133949f;

    public void B1(q1 q1Var) {
        this.f133948e = q1Var;
    }

    public void D1(String str) {
        this.f133949f = str;
    }

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() throws BuildException {
        q1 q1Var = this.f133948e;
        if (q1Var == null) {
            throw new BuildException("No reference specified for isreference condition");
        }
        String strB = q1Var.b();
        if (!b().D0(strB)) {
            return false;
        }
        if (this.f133949f == null) {
            return true;
        }
        Class<?> cls = b().g0().get(this.f133949f);
        if (cls == null) {
            cls = b().z0().get(this.f133949f);
        }
        return cls != null && cls.isAssignableFrom(b().w0(strB).getClass());
    }
}
