package org.apache.tools.ant.helper;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.f1;

/* JADX INFO: compiled from: DefaultExecutor.java */
/* JADX INFO: loaded from: classes5.dex */
public class c implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g f133365a = new g();

    @Override // org.apache.tools.ant.f1
    public void a(Project project, String[] strArr) throws BuildException {
        BuildException e10 = null;
        for (String str : strArr) {
            try {
                project.I(str);
            } catch (BuildException e11) {
                e10 = e11;
                if (!project.I0()) {
                    throw e10;
                }
            }
        }
        if (e10 != null) {
            throw e10;
        }
    }

    @Override // org.apache.tools.ant.f1
    public f1 b() {
        return f133365a;
    }
}
