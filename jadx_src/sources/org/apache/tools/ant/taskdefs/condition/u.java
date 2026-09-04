package org.apache.tools.ant.taskdefs.condition;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.b2;

/* JADX INFO: compiled from: IsTrue.java */
/* JADX INFO: loaded from: classes5.dex */
public class u extends b2 implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f133956e = null;

    public void B1(boolean z10) {
        this.f133956e = z10 ? Boolean.TRUE : Boolean.FALSE;
    }

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() throws BuildException {
        Boolean bool = this.f133956e;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new BuildException("Nothing to test for truth");
    }
}
