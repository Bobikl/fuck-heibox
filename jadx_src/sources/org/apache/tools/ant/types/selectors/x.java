package org.apache.tools.ant.types.selectors;

import java.io.File;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: MajoritySelector.java */
/* JADX INFO: loaded from: classes5.dex */
public class x extends j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f136640j = true;

    @Override // org.apache.tools.ant.types.selectors.j, org.apache.tools.ant.types.selectors.h, org.apache.tools.ant.types.selectors.v
    public boolean P0(File file, String str, File file2) {
        i2();
        Iterator it = Collections.list(Y()).iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            if (((v) it.next()).P0(file, str, file2)) {
                i10++;
            } else {
                i11++;
            }
        }
        if (i10 > i11) {
            return true;
        }
        if (i11 > i10) {
            return false;
        }
        return this.f136640j;
    }

    public void s2(boolean z10) {
        this.f136640j = z10;
    }

    @Override // org.apache.tools.ant.types.selectors.j, org.apache.tools.ant.types.s
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (S0()) {
            sb2.append("{majorityselect: ");
            sb2.append(super.toString());
            sb2.append(z5.g.f141884d);
        }
        return sb2.toString();
    }
}
