package org.apache.tools.ant.taskdefs.condition;

import java.io.IOException;
import java.util.Iterator;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.resources.w1;
import org.apache.tools.ant.types.s1;
import org.apache.tools.ant.types.u1;
import org.apache.tools.ant.util.ResourceUtils;

/* JADX INFO: compiled from: ResourcesMatch.java */
/* JADX INFO: loaded from: classes5.dex */
public class d0 implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private w1 f133879b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f133880c = false;

    public void a(u1 u1Var) {
        if (u1Var == null) {
            return;
        }
        w1 w1Var = this.f133879b;
        if (w1Var == null) {
            w1Var = new w1();
        }
        this.f133879b = w1Var;
        w1Var.f2(u1Var);
    }

    public void b(boolean z10) {
        this.f133880c = z10;
    }

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() throws BuildException {
        w1 w1Var = this.f133879b;
        if (w1Var == null) {
            throw new BuildException("You must specify one or more nested resource collections");
        }
        if (w1Var.size() > 1) {
            Iterator<s1> it = this.f133879b.iterator();
            s1 next = it.next();
            while (it.hasNext()) {
                s1 next2 = it.next();
                try {
                    if (!ResourceUtils.h(next, next2, this.f133880c)) {
                        return false;
                    }
                    next = next2;
                } catch (IOException e10) {
                    throw new BuildException("when comparing resources " + next.toString() + " and " + next2.toString(), e10);
                }
            }
        }
        return true;
    }
}
