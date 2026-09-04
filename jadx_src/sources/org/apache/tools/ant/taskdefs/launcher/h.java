package org.apache.tools.ant.taskdefs.launcher;

import java.io.File;
import java.io.IOException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.j1;

/* JADX INFO: compiled from: PerlScriptCommandLauncher.java */
/* JADX INFO: loaded from: classes5.dex */
public class h extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f134471e;

    public h(String str, c cVar) {
        super(cVar);
        this.f134471e = str;
    }

    @Override // org.apache.tools.ant.taskdefs.launcher.c
    public Process d(Project project, String[] strArr, String[] strArr2, File file) throws IOException {
        if (project == null) {
            if (file == null) {
                return c(project, strArr, strArr2);
            }
            throw new IOException("Cannot locate antRun script: No project provided");
        }
        String strU0 = project.u0(j1.f133495s);
        if (strU0 == null) {
            throw new IOException("Cannot locate antRun script: Property 'ant.home' not found");
        }
        String string = c.f134467a.n0(project.Z(), strU0 + File.separator + this.f134471e).toString();
        if (file == null) {
            file = project.Z();
        }
        String[] strArr3 = new String[strArr.length + 3];
        strArr3[0] = "perl";
        strArr3[1] = string;
        strArr3[2] = file.getAbsolutePath();
        System.arraycopy(strArr, 0, strArr3, 3, strArr.length);
        return c(project, strArr3, strArr2);
    }
}
