package org.apache.tools.ant.taskdefs.condition;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.b2;

/* JADX INFO: compiled from: IsFalse.java */
/* JADX INFO: loaded from: classes5.dex */
public class m extends b2 implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f133917e = null;

    public void B1(boolean z10) {
        this.f133917e = z10 ? Boolean.TRUE : Boolean.FALSE;
    }

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() throws BuildException {
        Boolean bool = this.f133917e;
        if (bool != null) {
            return !bool.booleanValue();
        }
        throw new BuildException("Nothing to test for falsehood");
    }
}
