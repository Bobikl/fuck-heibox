package org.apache.tools.ant.helper;

import java.util.Hashtable;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.f1;
import org.apache.tools.ant.t2;

/* JADX INFO: compiled from: IgnoreDependenciesExecutor.java */
/* JADX INFO: loaded from: classes5.dex */
public class d implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g f133366a = new g();

    @Override // org.apache.tools.ant.f1
    public void a(Project project, String[] strArr) throws BuildException {
        Hashtable<String, t2> hashtableY0 = project.y0();
        BuildException e10 = null;
        for (String str : strArr) {
            try {
                t2 t2Var = hashtableY0.get(str);
                if (t2Var == null) {
                    throw new BuildException("Unknown target " + str);
                }
                t2Var.r();
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
        return f133366a;
    }
}
