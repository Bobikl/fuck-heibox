package org.apache.tools.ant.taskdefs.optional.extension;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.v0;

/* JADX INFO: compiled from: JarLibDisplayTask.java */
/* JADX INFO: loaded from: classes5.dex */
public class v extends u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private File f135086k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<org.apache.tools.ant.types.b0> f135087l = new Vector();

    private void k2() throws BuildException {
        File file = this.f135086k;
        if (file == null) {
            if (this.f135087l.isEmpty()) {
                throw new BuildException("File attribute not specified.");
            }
        } else {
            if (!file.exists()) {
                throw new BuildException("File '%s' does not exist.", this.f135086k);
            }
            if (!this.f135086k.isFile()) {
                throw new BuildException("'%s' is not a file.", this.f135086k);
            }
        }
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        k2();
        b0 b0Var = new b0();
        if (this.f135087l.isEmpty()) {
            b0Var.a(this.f135086k);
            return;
        }
        Iterator<org.apache.tools.ant.types.b0> it = this.f135087l.iterator();
        while (it.hasNext()) {
            v0 v0VarB2 = it.next().B2(b());
            File fileF = v0VarB2.f();
            for (String str : v0VarB2.m()) {
                b0Var.a(new File(fileF, str));
            }
        }
    }

    public void i2(org.apache.tools.ant.types.b0 b0Var) {
        this.f135087l.add(b0Var);
    }

    public void j2(File file) {
        this.f135086k = file;
    }
}
