package org.apache.tools.ant.types.selectors;

import java.io.File;
import java.nio.file.Files;
import org.apache.tools.ant.types.s1;

/* JADX INFO: compiled from: SymlinkSelector.java */
/* JADX INFO: loaded from: classes5.dex */
public class p0 implements v {
    @Override // org.apache.tools.ant.types.selectors.v
    public boolean P0(File file, String str, File file2) {
        return file2 != null && Files.isSymbolicLink(file2.toPath());
    }

    @Override // org.apache.tools.ant.types.selectors.v, org.apache.tools.ant.types.resources.selectors.n
    public /* synthetic */ boolean a(s1 s1Var) {
        return u.a(this, s1Var);
    }
}
