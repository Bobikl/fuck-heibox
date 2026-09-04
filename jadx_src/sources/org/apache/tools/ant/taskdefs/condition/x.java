package org.apache.tools.ant.taskdefs.condition;

import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Not.java */
/* JADX INFO: loaded from: classes5.dex */
public class x extends e implements d {
    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() throws BuildException {
        if (a2() > 1) {
            throw new BuildException("You must not nest more than one condition into <not>");
        }
        if (a2() >= 1) {
            return !b2().nextElement().e();
        }
        throw new BuildException("You must nest a condition into <not>");
    }
}
