package org.apache.tools.ant.taskdefs.launcher;

import java.io.File;
import java.io.IOException;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.o;

/* JADX INFO: compiled from: Java13CommandLauncher.java */
/* JADX INFO: loaded from: classes5.dex */
public class e extends c {
    @Override // org.apache.tools.ant.taskdefs.launcher.c
    public Process d(Project project, String[] strArr, String[] strArr2, File file) throws IOException {
        if (project != null) {
            try {
                project.M0("Execute:Java13CommandLauncher: " + o.q(strArr), 4);
            } catch (IOException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new BuildException("Unable to execute command", e11);
            }
        }
        return Runtime.getRuntime().exec(strArr, strArr2, file);
    }
}
