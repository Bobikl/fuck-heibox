package pj;

import java.io.File;
import java.net.URL;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.b2;
import org.apache.tools.ant.taskdefs.optional.extension.j;
import org.apache.tools.ant.taskdefs.optional.extension.l;

/* JADX INFO: compiled from: URLResolver.java */
/* JADX INFO: loaded from: classes5.dex */
public class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f138303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f138304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private URL f138305c;

    private File b() {
        String strSubstring;
        File file = this.f138303a;
        if (file != null) {
            return file;
        }
        String file2 = this.f138305c.getFile();
        if (file2 == null || file2.length() <= 1) {
            strSubstring = "default.file";
        } else {
            int iLastIndexOf = file2.lastIndexOf(47);
            if (-1 == iLastIndexOf) {
                iLastIndexOf = 0;
            }
            strSubstring = file2.substring(iLastIndexOf);
        }
        return new File(this.f138304b, strSubstring);
    }

    private void f() {
        if (this.f138305c == null) {
            throw new BuildException("Must specify URL");
        }
        File file = this.f138304b;
        if (file == null && this.f138303a == null) {
            throw new BuildException("Must specify destination file or directory");
        }
        if (file != null && this.f138303a != null) {
            throw new BuildException("Must not specify both destination file or directory");
        }
    }

    @Override // org.apache.tools.ant.taskdefs.optional.extension.l
    public File a(j jVar, Project project) throws BuildException {
        f();
        File fileB = b();
        b2 b2Var = new b2();
        b2Var.J(project);
        b2Var.z2(fileB);
        b2Var.H2(this.f138305c);
        b2Var.D1();
        return fileB;
    }

    public void c(File file) {
        this.f138304b = file;
    }

    public void d(File file) {
        this.f138303a = file;
    }

    public void e(URL url) {
        this.f138305c = url;
    }

    public String toString() {
        return "URL[" + this.f138305c + "]";
    }
}
