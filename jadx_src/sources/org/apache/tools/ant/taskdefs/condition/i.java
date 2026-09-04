package org.apache.tools.ant.taskdefs.condition;

import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.util.j2;
import org.apache.tools.ant.util.l1;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: HasFreeSpace.java */
/* JADX INFO: loaded from: classes5.dex */
public class i implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f133901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f133902c;

    private void f() throws BuildException {
        if (this.f133901b == null) {
            throw new BuildException("Please set the partition attribute.");
        }
        if (this.f133902c == null) {
            throw new BuildException("Please set the needed attribute.");
        }
    }

    public String a() {
        return this.f133902c;
    }

    public String b() {
        return this.f133901b;
    }

    public void c(String str) {
        this.f133902c = str;
    }

    public void d(String str) {
        this.f133901b = str;
    }

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() throws BuildException {
        f();
        try {
            if (s0.n(s0.f136930u)) {
                return ((Long) new l1(new File(this.f133901b)).b("getFreeSpace")).longValue() >= j2.g(this.f133902c);
            }
            throw new BuildException("HasFreeSpace condition not supported on Java5 or less.");
        } catch (Exception e10) {
            throw new BuildException(e10);
        }
    }
}
