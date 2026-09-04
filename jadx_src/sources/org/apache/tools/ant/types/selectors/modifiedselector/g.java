package org.apache.tools.ant.types.selectors.modifiedselector;

import java.io.File;

/* JADX INFO: compiled from: LastModifiedAlgorithm.java */
/* JADX INFO: loaded from: classes5.dex */
public class g implements a {
    @Override // org.apache.tools.ant.types.selectors.modifiedselector.a
    public String a(File file) {
        long jLastModified = file.lastModified();
        if (jLastModified == 0) {
            return null;
        }
        return Long.toString(jLastModified);
    }

    @Override // org.apache.tools.ant.types.selectors.modifiedselector.a
    public boolean isValid() {
        return true;
    }
}
