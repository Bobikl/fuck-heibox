package org.apache.tools.ant.taskdefs.condition;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.b2;

/* JADX INFO: compiled from: IsSet.java */
/* JADX INFO: loaded from: classes5.dex */
public class r extends b2 implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f133950e;

    public void B1(String str) {
        this.f133950e = str;
    }

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() throws BuildException {
        if (this.f133950e != null) {
            return b().u0(this.f133950e) != null;
        }
        throw new BuildException("No property specified for isset condition");
    }
}
