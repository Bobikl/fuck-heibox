package org.apache.tools.ant.taskdefs;

import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: ConditionTask.java */
/* JADX INFO: loaded from: classes5.dex */
public class n0 extends org.apache.tools.ant.taskdefs.condition.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f134587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f134588h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Object f134589i;

    public n0() {
        super("condition");
        this.f134587g = null;
        this.f134588h = "true";
        this.f134589i = null;
    }

    public void e2() throws BuildException {
        if (a2() > 1) {
            throw new BuildException("You must not nest more than one condition into <%s>", c2());
        }
        if (a2() < 1) {
            throw new BuildException("You must nest a condition into <%s>", c2());
        }
        if (this.f134587g == null) {
            throw new BuildException("The property attribute is required.");
        }
        if (b2().nextElement().e()) {
            x1("Condition true; setting " + this.f134587g + " to " + this.f134588h, 4);
            org.apache.tools.ant.p2.u(b()).L(this.f134587g, this.f134588h);
            return;
        }
        if (this.f134589i == null) {
            x1("Condition false; not setting " + this.f134587g, 4);
            return;
        }
        x1("Condition false; setting " + this.f134587g + " to " + this.f134589i, 4);
        org.apache.tools.ant.p2.u(b()).L(this.f134587g, this.f134589i);
    }

    public void f2(Object obj) {
        this.f134589i = obj;
    }

    public void g2(String str) {
        f2(str);
    }

    public void h2(String str) {
        this.f134587g = str;
    }

    public void i2(Object obj) {
        this.f134588h = obj;
    }

    public void j2(String str) {
        i2(str);
    }
}
