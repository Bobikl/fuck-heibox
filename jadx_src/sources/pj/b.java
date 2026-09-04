package pj;

import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.optional.extension.j;
import org.apache.tools.ant.taskdefs.optional.extension.l;

/* JADX INFO: compiled from: LocationResolver.java */
/* JADX INFO: loaded from: classes5.dex */
public class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f138302a;

    @Override // org.apache.tools.ant.taskdefs.optional.extension.l
    public File a(j jVar, Project project) throws BuildException {
        String str = this.f138302a;
        if (str != null) {
            return project.W0(str);
        }
        throw new BuildException("No location specified for resolver");
    }

    public void b(String str) {
        this.f138302a = str;
    }

    public String toString() {
        return "Location[" + this.f138302a + "]";
    }
}
