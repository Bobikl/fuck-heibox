package org.apache.tools.ant.types.resources.selectors;

import java.util.Iterator;
import org.apache.tools.ant.types.s1;

/* JADX INFO: compiled from: Majority.java */
/* JADX INFO: loaded from: classes5.dex */
public class g extends o implements n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f136439h;

    public g() {
        this.f136439h = true;
    }

    public g(n... nVarArr) {
        super(nVarArr);
        this.f136439h = true;
    }

    @Override // org.apache.tools.ant.types.resources.selectors.n
    public synchronized boolean a(s1 s1Var) {
        int iP1 = p1();
        boolean z10 = iP1 % 2 == 0;
        int i10 = iP1 / 2;
        Iterator<n> it = g2().iterator();
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            if (it.next().a(s1Var)) {
                i12++;
                if (i12 > i10 || (z10 && this.f136439h && i12 == i10)) {
                    return true;
                }
            } else {
                i11++;
                if (i11 > i10 || (z10 && !this.f136439h && i11 == i10)) {
                    return false;
                }
            }
        }
        return false;
    }

    public synchronized void i2(boolean z10) {
        this.f136439h = z10;
    }
}
