package org.apache.tools.ant.helper;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.f1;

/* JADX INFO: compiled from: SingleCheckExecutor.java */
/* JADX INFO: loaded from: classes5.dex */
public class g implements f1 {
    @Override // org.apache.tools.ant.f1
    public void a(Project project, String[] strArr) throws BuildException {
        project.H(project.w1(strArr, project.y0(), false));
    }

    @Override // org.apache.tools.ant.f1
    public f1 b() {
        return this;
    }
}
