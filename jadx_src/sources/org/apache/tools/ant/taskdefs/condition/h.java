package org.apache.tools.ant.taskdefs.condition;

import java.io.File;
import java.io.IOException;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.util.j0;

/* JADX INFO: compiled from: FilesMatch.java */
/* JADX INFO: loaded from: classes5.dex */
public class h implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final j0 f133897e = j0.O();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f133898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f133899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f133900d = false;

    public void a(File file) {
        this.f133898b = file;
    }

    public void b(File file) {
        this.f133899c = file;
    }

    public void c(boolean z10) {
        this.f133900d = z10;
    }

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() throws BuildException {
        File file;
        File file2 = this.f133898b;
        if (file2 == null || (file = this.f133899c) == null) {
            throw new BuildException("both file1 and file2 are required in filesmatch");
        }
        try {
            return f133897e.k(file2, file, this.f133900d);
        } catch (IOException e10) {
            throw new BuildException("when comparing files: " + e10.getMessage(), e10);
        }
    }
}
