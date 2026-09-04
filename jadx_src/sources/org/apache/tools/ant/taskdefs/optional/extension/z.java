package org.apache.tools.ant.taskdefs.optional.extension;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.u2;

/* JADX INFO: compiled from: JarLibResolveTask.java */
/* JADX INFO: loaded from: classes5.dex */
public class z extends u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f135097k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private j f135098l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List<l> f135099m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f135100n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f135101o = true;

    private void m2(File file) {
        if (!file.exists()) {
            throw new BuildException("File %s does not exist", file);
        }
        if (!file.isFile()) {
            throw new BuildException("File %s is not a file", file);
        }
        if (!this.f135100n) {
            b().M0("Setting property to " + file + " without verifying library satisfies extension", 3);
            q2(file);
            return;
        }
        b().M0("Checking file " + file + " to see if it satisfies extension", 3);
        for (j jVar : j.f(p.d(file))) {
            if (jVar.v(this.f135098l)) {
                q2(file);
                return;
            }
        }
        String str = "File " + file + " skipped as it does not satisfy extension";
        b().M0(str, 3);
        throw new BuildException(str);
    }

    private void n2() {
        if (this.f135101o) {
            throw new BuildException("Unable to resolve extension to a file");
        }
        b().M0("Unable to resolve extension to a file", 0);
    }

    private void q2(File file) {
        b().n1(this.f135097k, file.getAbsolutePath());
    }

    private void s2() throws BuildException {
        if (this.f135097k == null) {
            throw new BuildException("Property attribute must be specified.");
        }
        if (this.f135098l == null) {
            throw new BuildException("Extension element must be specified.");
        }
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        s2();
        b().M0("Resolving extension: " + this.f135098l, 3);
        String strU0 = b().u0(this.f135097k);
        if (strU0 != null) {
            String str = "Property Already set to: " + strU0;
            if (this.f135101o) {
                throw new BuildException(str);
            }
            b().M0(str, 0);
            return;
        }
        for (l lVar : this.f135099m) {
            b().M0("Searching for extension using Resolver:" + lVar, 3);
            try {
                File fileA = lVar.a(this.f135098l, b());
                try {
                    m2(fileA);
                    return;
                } catch (BuildException e10) {
                    b().M0("File " + fileA + " returned by resolver failed to satisfy extension due to: " + e10.getMessage(), 1);
                }
            } catch (BuildException e11) {
                b().M0("Failed to resolve extension to file using resolver " + lVar + " due to: " + e11, 1);
            }
        }
        n2();
    }

    public void i2(pj.a aVar) {
        this.f135099m.add(aVar);
    }

    public void j2(k kVar) {
        if (this.f135098l != null) {
            throw new BuildException("Can not specify extension to resolve multiple times.");
        }
        this.f135098l = kVar.m2();
    }

    public void k2(pj.b bVar) {
        this.f135099m.add(bVar);
    }

    public void l2(pj.c cVar) {
        this.f135099m.add(cVar);
    }

    public void o2(boolean z10) {
        this.f135100n = z10;
    }

    public void p2(boolean z10) {
        this.f135101o = z10;
    }

    public void r2(String str) {
        this.f135097k = str;
    }
}
