package org.apache.tools.ant.taskdefs.launcher;

import java.io.File;
import java.io.IOException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: MacCommandLauncher.java */
/* JADX INFO: loaded from: classes5.dex */
public class f extends d {
    public f(c cVar) {
        super(cVar);
    }

    @Override // org.apache.tools.ant.taskdefs.launcher.c
    public Process d(Project project, String[] strArr, String[] strArr2, File file) throws IOException {
        if (file == null) {
            return c(project, strArr, strArr2);
        }
        System.getProperties().put("user.dir", file.getAbsolutePath());
        try {
            return c(project, strArr, strArr2);
        } finally {
            System.getProperties().put("user.dir", System.getProperty("user.dir"));
        }
    }
}
