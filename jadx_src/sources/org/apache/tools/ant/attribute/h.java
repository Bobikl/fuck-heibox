package org.apache.tools.ant.attribute;

import org.apache.tools.ant.z2;

/* JADX INFO: compiled from: IfBlankAttribute.java */
/* JADX INFO: loaded from: classes5.dex */
public class h extends f {

    /* JADX INFO: compiled from: IfBlankAttribute.java */
    public static class a extends h {
        public a() {
            S1(false);
        }
    }

    @Override // org.apache.tools.ant.attribute.g
    public boolean i(z2 z2Var, String str) {
        return I1(str == null || str.isEmpty());
    }
}
