package org.apache.tools.ant.types;

import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: Substitution.java */
/* JADX INFO: loaded from: classes5.dex */
public class x1 extends s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f136677h = "substitution";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f136678g = null;

    public String e2(Project project) {
        return Y1() ? f2(project).e2(project) : this.f136678g;
    }

    public x1 f2(Project project) {
        return (x1) R1(x1.class, U1(), project);
    }

    public void g2(String str) {
        this.f136678g = str;
    }
}
