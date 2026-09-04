package org.apache.tools.ant.types.selectors;

import java.io.File;
import org.apache.tools.ant.types.s1;

/* JADX INFO: compiled from: WritableSelector.java */
/* JADX INFO: loaded from: classes5.dex */
public class t0 implements v {
    @Override // org.apache.tools.ant.types.selectors.v
    public boolean P0(File file, String str, File file2) {
        return file2 != null && file2.canWrite();
    }

    @Override // org.apache.tools.ant.types.selectors.v, org.apache.tools.ant.types.resources.selectors.n
    public /* synthetic */ boolean a(s1 s1Var) {
        return u.a(this, s1Var);
    }
}
