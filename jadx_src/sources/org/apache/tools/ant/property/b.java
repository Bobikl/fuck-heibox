package org.apache.tools.ant.property;

import java.util.Set;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.j1;
import org.apache.tools.ant.p2;

/* JADX INFO: compiled from: LocalProperties.java */
/* JADX INFO: loaded from: classes5.dex */
public class b extends InheritableThreadLocal<h> implements p2.e, p2.f, p2.d {
    private b() {
    }

    public static synchronized b j(Project project) {
        b bVar;
        bVar = (b) project.w0(j1.A);
        if (bVar == null) {
            bVar = new b();
            project.i(j1.A, bVar);
            p2.u(project).d(bVar);
        }
        return bVar;
    }

    @Override // org.apache.tools.ant.p2.d
    public Set<String> a() {
        return get().j();
    }

    @Override // org.apache.tools.ant.p2.f
    public boolean b(String str, Object obj, p2 p2Var) {
        return get().o(str, obj, p2Var);
    }

    @Override // org.apache.tools.ant.p2.e
    public Object c(String str, p2 p2Var) {
        return get().g(str, p2Var);
    }

    @Override // org.apache.tools.ant.p2.f
    public boolean d(String str, Object obj, p2 p2Var) {
        return get().n(str, obj, p2Var);
    }

    public void f(String str) {
        get().d(str);
    }

    public void g() {
        set(get().e());
    }

    public void h() {
        get().f();
    }

    public void i() {
        get().h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public synchronized h initialValue() {
        return new h();
    }
}
