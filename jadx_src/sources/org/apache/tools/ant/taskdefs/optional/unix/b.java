package org.apache.tools.ant.taskdefs.optional.unix;

import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Chgrp.java */
/* JADX INFO: loaded from: classes5.dex */
public class b extends a {
    private boolean Z = false;

    public b() {
        super.G2("chgrp");
    }

    public void C3(String str) {
        l2().O1(str);
        this.Z = true;
    }

    @Override // org.apache.tools.ant.taskdefs.j1
    public void G2(String str) {
        throw new BuildException(L1() + " doesn't support the executable attribute", w1());
    }

    @Override // org.apache.tools.ant.taskdefs.p1, org.apache.tools.ant.taskdefs.j1
    protected void k2() {
        if (!this.Z) {
            throw new BuildException("Required attribute group not set in chgrp", w1());
        }
        super.k2();
    }
}
