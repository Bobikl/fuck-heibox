package org.apache.tools.ant.taskdefs.launcher;

import java.io.IOException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: CommandLauncherProxy.java */
/* JADX INFO: loaded from: classes5.dex */
public class d extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f134470d;

    protected d(c cVar) {
        this.f134470d = cVar;
    }

    @Override // org.apache.tools.ant.taskdefs.launcher.c
    public Process c(Project project, String[] strArr, String[] strArr2) throws IOException {
        return this.f134470d.c(project, strArr, strArr2);
    }
}
