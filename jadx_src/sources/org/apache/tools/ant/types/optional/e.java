package org.apache.tools.ant.types.optional;

import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.j1;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.types.q1;
import org.apache.tools.ant.types.selectors.h;
import org.apache.tools.ant.util.x1;
import org.apache.tools.ant.util.z1;

/* JADX INFO: compiled from: ScriptSelector.java */
/* JADX INFO: loaded from: classes5.dex */
public class e extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private z1 f136265i = new z1();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private x1 f136266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private File f136267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f136268l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private File f136269m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f136270n;

    private void o2() throws BuildException {
        if (this.f136266j != null) {
            return;
        }
        this.f136266j = this.f136265i.j();
    }

    @Override // org.apache.tools.ant.b2
    public void J(Project project) {
        super.J(project);
        this.f136265i.s(this);
    }

    @Override // org.apache.tools.ant.types.selectors.h, org.apache.tools.ant.types.selectors.v
    public boolean P0(File file, String str, File file2) {
        o2();
        v2(true);
        this.f136269m = file2;
        this.f136267k = file;
        this.f136268l = str;
        this.f136266j.s(j1.f133489m, file);
        this.f136266j.s("filename", str);
        this.f136266j.s("file", file2);
        this.f136266j.j("ant_selector");
        return p2();
    }

    public void k2(String str) {
        this.f136265i.b(str);
    }

    public File l0() {
        return this.f136269m;
    }

    public o0 l2() {
        return this.f136265i.c();
    }

    public File m2() {
        return this.f136267k;
    }

    public String n2() {
        return this.f136268l;
    }

    public boolean p2() {
        return this.f136270n;
    }

    public void q2(o0 o0Var) {
        this.f136265i.m(o0Var);
    }

    public void r2(q1 q1Var) {
        this.f136265i.n(q1Var);
    }

    public void s2(String str) {
        this.f136265i.p(str);
    }

    public void t2(String str) {
        this.f136265i.q(str);
    }

    public void u2(String str) {
        this.f136265i.r(str);
    }

    public void v2(boolean z10) {
        this.f136270n = z10;
    }

    public void w2(boolean z10) {
        this.f136265i.t(z10);
    }

    public void x2(File file) {
        this.f136265i.u(file);
    }
}
