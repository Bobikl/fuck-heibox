package org.apache.tools.ant.types;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: Reference.java */
/* JADX INFO: loaded from: classes5.dex */
public class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f136302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Project f136303b;

    @Deprecated
    public q1() {
    }

    @Deprecated
    public q1(String str) {
        f(str);
    }

    public q1(Project project, String str) {
        f(str);
        e(project);
    }

    public Project a() {
        return this.f136303b;
    }

    public String b() {
        return this.f136302a;
    }

    public <T> T c() throws BuildException {
        Project project = this.f136303b;
        if (project != null) {
            return (T) d(project);
        }
        throw new BuildException("No project set on reference to " + this.f136302a);
    }

    public <T> T d(Project project) throws BuildException {
        String str = this.f136302a;
        if (str == null) {
            throw new BuildException("No reference specified");
        }
        Project project2 = this.f136303b;
        T t10 = project2 == null ? (T) project.w0(str) : (T) project2.w0(str);
        if (t10 != null) {
            return t10;
        }
        throw new BuildException("Reference " + this.f136302a + " not found.");
    }

    public void e(Project project) {
        this.f136303b = project;
    }

    public void f(String str) {
        this.f136302a = str;
    }
}
