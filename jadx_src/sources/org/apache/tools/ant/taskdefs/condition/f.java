package org.apache.tools.ant.taskdefs.condition;

import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Contains.java */
/* JADX INFO: loaded from: classes5.dex */
public class f implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f133885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f133886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f133887d = true;

    public void a(boolean z10) {
        this.f133887d = z10;
    }

    public void b(String str) {
        this.f133885b = str;
    }

    public void c(String str) {
        this.f133886c = str;
    }

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() throws BuildException {
        String str;
        String str2 = this.f133885b;
        if (str2 == null || (str = this.f133886c) == null) {
            throw new BuildException("both string and substring are required in contains");
        }
        return this.f133887d ? str2.contains(str) : str2.toLowerCase().contains(this.f133886c.toLowerCase());
    }
}
