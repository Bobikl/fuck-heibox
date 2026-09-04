package org.apache.tools.ant.types.selectors;

import java.io.File;
import java.io.IOException;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: DifferentSelector.java */
/* JADX INFO: loaded from: classes5.dex */
public class p extends y {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final org.apache.tools.ant.util.j0 f136609p = org.apache.tools.ant.util.j0.O();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f136610n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f136611o = false;

    @Override // org.apache.tools.ant.types.selectors.y
    protected boolean m2(File file, File file2) {
        if (file.exists() != file2.exists() || file.length() != file2.length()) {
            return true;
        }
        if (!this.f136610n) {
            if (!(file2.lastModified() >= file.lastModified() - ((long) this.f136645l) && file2.lastModified() <= file.lastModified() + ((long) this.f136645l))) {
                return true;
            }
        }
        if (this.f136611o) {
            return false;
        }
        try {
            return !f136609p.j(file, file2);
        } catch (IOException e10) {
            throw new BuildException("while comparing " + file + " and " + file2, e10);
        }
    }

    public void p2(boolean z10) {
        this.f136611o = z10;
    }

    public void q2(boolean z10) {
        this.f136610n = z10;
    }
}
