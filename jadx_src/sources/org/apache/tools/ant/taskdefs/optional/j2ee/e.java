package org.apache.tools.ant.taskdefs.optional.j2ee;

import java.io.File;
import java.util.List;
import java.util.Vector;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.u2;

/* JADX INFO: compiled from: ServerDeploy.java */
/* JADX INFO: loaded from: classes5.dex */
public class e extends u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f135167k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private File f135168l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<a> f135169m = new Vector();

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        for (a aVar : this.f135169m) {
            aVar.b();
            aVar.a();
        }
    }

    public void i2(b bVar) {
        bVar.c(this);
        this.f135169m.add(bVar);
    }

    public void j2(d dVar) {
        dVar.c(this);
        this.f135169m.add(dVar);
    }

    public void k2(f fVar) {
        fVar.c(this);
        this.f135169m.add(fVar);
    }

    public String l2() {
        return this.f135167k;
    }

    public File m2() {
        return this.f135168l;
    }

    public void n2(String str) {
        this.f135167k = str;
    }

    public void o2(File file) {
        this.f135168l = file;
    }
}
