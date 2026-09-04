package pj;

import java.io.File;
import java.io.IOException;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.Ant;
import org.apache.tools.ant.taskdefs.optional.extension.j;
import org.apache.tools.ant.taskdefs.optional.extension.l;

/* JADX INFO: compiled from: AntResolver.java */
/* JADX INFO: loaded from: classes5.dex */
public class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f138299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f138300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f138301c;

    private void e() {
        if (this.f138299a == null) {
            throw new BuildException("Must specify Buildfile");
        }
        if (this.f138300b == null) {
            throw new BuildException("Must specify destination file");
        }
    }

    @Override // org.apache.tools.ant.taskdefs.optional.extension.l
    public File a(j jVar, Project project) throws BuildException {
        e();
        Ant ant = new Ant();
        ant.J(project);
        ant.E2(false);
        ant.C2(this.f138299a.getName());
        try {
            ant.D2(this.f138299a.getParentFile().getCanonicalFile());
            String str = this.f138301c;
            if (str != null) {
                ant.H2(str);
            }
            ant.D1();
            return this.f138300b;
        } catch (IOException e10) {
            throw new BuildException(e10.getMessage(), e10);
        }
    }

    public void b(File file) {
        this.f138299a = file;
    }

    public void c(File file) {
        this.f138300b = file;
    }

    public void d(String str) {
        this.f138301c = str;
    }

    public String toString() {
        return "Ant[" + this.f138299a + "==>" + this.f138300b + "]";
    }
}
