package org.apache.tools.ant.taskdefs.launcher;

import java.io.File;
import java.io.IOException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: WinNTCommandLauncher.java */
/* JADX INFO: loaded from: classes5.dex */
public class l extends d {
    public l(c cVar) {
        super(cVar);
    }

    @Override // org.apache.tools.ant.taskdefs.launcher.c
    public Process d(Project project, String[] strArr, String[] strArr2, File file) throws IOException {
        if (file == null) {
            if (project == null) {
                return c(project, strArr, strArr2);
            }
            file = project.Z();
        }
        String[] strArr3 = new String[strArr.length + 6];
        strArr3[0] = com.taobao.agoo.a.a.b.JSON_CMD;
        strArr3[1] = "/c";
        strArr3[2] = "cd";
        strArr3[3] = "/d";
        strArr3[4] = file.getAbsolutePath();
        strArr3[5] = "&&";
        System.arraycopy(strArr, 0, strArr3, 6, strArr.length);
        return c(project, strArr3, strArr2);
    }
}
