package org.apache.tools.ant.types;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: FileList.java */
/* JADX INFO: loaded from: classes5.dex */
public class a0 extends s implements u1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<String> f136096g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private File f136097h;

    /* JADX INFO: compiled from: FileList.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f136098a;

        public String a() {
            return this.f136098a;
        }

        public void b(String str) {
            this.f136098a = str;
        }
    }

    public a0() {
        this.f136096g = new ArrayList();
    }

    protected a0(a0 a0Var) {
        this.f136096g = new ArrayList();
        this.f136097h = a0Var.f136097h;
        this.f136096g = a0Var.f136096g;
        J(a0Var.b());
    }

    private a0 h2() {
        return (a0) O1(a0.class);
    }

    private a0 i2(Project project) {
        return (a0) R1(a0.class, U1(), project);
    }

    @Override // org.apache.tools.ant.types.u1
    public boolean O() {
        return true;
    }

    @Override // org.apache.tools.ant.types.s
    public void c2(q1 q1Var) throws BuildException {
        if (this.f136097h != null || !this.f136096g.isEmpty()) {
            throw d2();
        }
        super.c2(q1Var);
    }

    public void e2(a aVar) {
        if (aVar.a() == null) {
            throw new BuildException("No name specified in nested file element");
        }
        this.f136096g.add(aVar.a());
    }

    public File f2(Project project) {
        return Y1() ? i2(project).f2(project) : this.f136097h;
    }

    public String[] g2(Project project) {
        if (Y1()) {
            return i2(project).g2(project);
        }
        if (this.f136097h == null) {
            throw new BuildException("No directory specified for filelist.");
        }
        if (this.f136096g.isEmpty()) {
            throw new BuildException("No files specified for filelist.");
        }
        List<String> list = this.f136096g;
        return (String[]) list.toArray(new String[list.size()]);
    }

    @Override // org.apache.tools.ant.types.u1
    public /* synthetic */ boolean isEmpty() {
        return t1.a(this);
    }

    @Override // java.lang.Iterable
    public Iterator<s1> iterator() {
        if (Y1()) {
            return h2().iterator();
        }
        Project projectB = b();
        File file = this.f136097h;
        List<String> list = this.f136096g;
        return new org.apache.tools.ant.types.resources.a0(projectB, file, (String[]) list.toArray(new String[list.size()]));
    }

    public void j2(File file) throws BuildException {
        B1();
        this.f136097h = file;
    }

    public void k2(String str) {
        B1();
        if (str == null || str.isEmpty()) {
            return;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, ", \t\n\r\f", false);
        while (stringTokenizer.hasMoreTokens()) {
            this.f136096g.add(stringTokenizer.nextToken());
        }
    }

    @Override // org.apache.tools.ant.types.u1
    public int size() {
        return Y1() ? h2().size() : this.f136096g.size();
    }

    @Override // org.apache.tools.ant.types.u1
    public /* synthetic */ Stream stream() {
        return t1.b(this);
    }
}
