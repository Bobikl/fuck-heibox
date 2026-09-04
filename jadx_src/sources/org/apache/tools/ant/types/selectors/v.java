package org.apache.tools.ant.types.selectors;

import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.s1;

/* JADX INFO: compiled from: FileSelector.java */
/* JADX INFO: loaded from: classes5.dex */
public interface v extends org.apache.tools.ant.types.resources.selectors.n {
    boolean P0(File file, String str, File file2) throws BuildException;

    @Override // org.apache.tools.ant.types.resources.selectors.n
    boolean a(s1 s1Var);
}
