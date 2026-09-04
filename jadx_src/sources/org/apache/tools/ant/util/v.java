package org.apache.tools.ant.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: ContainerMapper.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class v implements g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<g0> f136960b = new ArrayList();

    public synchronized void a(g0 g0Var) {
        if (this != g0Var) {
            if (!(g0Var instanceof v) || !((v) g0Var).d(this)) {
                this.f136960b.add(g0Var);
            }
        }
        throw new IllegalArgumentException("Circular mapper containment condition detected");
    }

    public void b(g0 g0Var) {
        a(g0Var);
    }

    public void c(org.apache.tools.ant.types.k0 k0Var) {
        a(k0Var.i2());
    }

    protected synchronized boolean d(g0 g0Var) {
        for (g0 g0Var2 : this.f136960b) {
            if (g0Var2 == g0Var) {
                return true;
            }
            if ((g0Var2 instanceof v) && ((v) g0Var2).d(g0Var)) {
                return true;
            }
        }
        return false;
    }

    public synchronized List<g0> e() {
        return Collections.unmodifiableList(this.f136960b);
    }

    @Override // org.apache.tools.ant.util.g0
    public void n0(String str) {
    }

    @Override // org.apache.tools.ant.util.g0
    public void q0(String str) {
    }
}
