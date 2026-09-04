package org.apache.tools.ant.taskdefs.optional.extension;

import java.io.File;
import java.util.List;
import java.util.Vector;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.u2;

/* JADX INFO: compiled from: JarLibAvailableTask.java */
/* JADX INFO: loaded from: classes5.dex */
public class u extends u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private File f135082k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<m> f135083l = new Vector();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f135084m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private k f135085n;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ j[] m2(Project project, m mVar) {
        return mVar.i2(project);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean n2(j jVar, j jVar2) {
        return jVar2.v(jVar);
    }

    private void q2() throws BuildException {
        if (this.f135085n == null) {
            throw new BuildException("Extension element must be specified.");
        }
        File file = this.f135082k;
        if (file == null) {
            if (this.f135083l.isEmpty()) {
                throw new BuildException("File attribute not specified.");
            }
        } else {
            if (!file.exists()) {
                throw new BuildException("File '%s' does not exist.", this.f135082k);
            }
            if (!this.f135082k.isFile()) {
                throw new BuildException("'%s' is not a file.", this.f135082k);
            }
        }
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        q2();
        final Project projectB = b();
        Stream streamFlatMap = !this.f135083l.isEmpty() ? this.f135083l.stream().map(new Function() { // from class: org.apache.tools.ant.taskdefs.optional.extension.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u.m2(projectB, (m) obj);
            }
        }).flatMap(new s()) : Stream.of((Object[]) j.f(p.d(this.f135082k)));
        final j jVarM2 = this.f135085n.m2();
        if (streamFlatMap.anyMatch(new Predicate() { // from class: org.apache.tools.ant.taskdefs.optional.extension.t
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return u.n2(jVarM2, (j) obj);
            }
        })) {
            projectB.n1(this.f135084m, "true");
        }
    }

    public void k2(k kVar) {
        if (this.f135085n != null) {
            throw new BuildException("Can not specify extension to search for multiple times.");
        }
        this.f135085n = kVar;
    }

    public void l2(m mVar) {
        this.f135083l.add(mVar);
    }

    public void o2(File file) {
        this.f135082k = file;
    }

    public void p2(String str) {
        this.f135084m = str;
    }
}
