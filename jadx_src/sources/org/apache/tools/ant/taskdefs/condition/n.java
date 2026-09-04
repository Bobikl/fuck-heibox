package org.apache.tools.ant.taskdefs.condition;

import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.util.j0;

/* JADX INFO: compiled from: IsFileSelected.java */
/* JADX INFO: loaded from: classes5.dex */
public class n extends org.apache.tools.ant.types.selectors.d implements d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final j0 f133918j = j0.O();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private File f133919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private File f133920i;

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() {
        if (this.f133919h == null) {
            throw new BuildException("file attribute not set");
        }
        o2();
        File fileZ = this.f133920i;
        if (fileZ == null) {
            fileZ = b().Z();
        }
        return N0(b())[0].P0(fileZ, f133918j.l0(fileZ, this.f133919h), this.f133919h);
    }

    @Override // org.apache.tools.ant.types.selectors.d
    public void o2() {
        if (p1() != 1) {
            throw new BuildException("Only one selector allowed");
        }
        super.o2();
    }

    public void p2(File file) {
        this.f133920i = file;
    }

    public void q2(File file) {
        this.f133919h = file;
    }
}
