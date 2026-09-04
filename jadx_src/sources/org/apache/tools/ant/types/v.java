package org.apache.tools.ant.types;

import java.util.Iterator;
import java.util.stream.Stream;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: DirSet.java */
/* JADX INFO: loaded from: classes5.dex */
public class v extends i implements u1 {
    public v() {
    }

    protected v(v vVar) {
        super(vVar);
    }

    private v c3() {
        return (v) O1(v.class);
    }

    @Override // org.apache.tools.ant.types.i
    protected i E2(Project project) {
        return (i) R1(v.class, U1(), project);
    }

    @Override // org.apache.tools.ant.types.u1
    public boolean O() {
        return true;
    }

    @Override // org.apache.tools.ant.types.i, org.apache.tools.ant.types.s, org.apache.tools.ant.b2
    public Object clone() {
        return Y1() ? c3().clone() : super.clone();
    }

    @Override // org.apache.tools.ant.types.u1
    public /* synthetic */ boolean isEmpty() {
        return t1.a(this);
    }

    @Override // java.lang.Iterable
    public Iterator<s1> iterator() {
        return Y1() ? c3().iterator() : new org.apache.tools.ant.types.resources.a0(b(), z2(b()), A2().j());
    }

    @Override // org.apache.tools.ant.types.u1
    public int size() {
        return Y1() ? c3().size() : A2().W();
    }

    @Override // org.apache.tools.ant.types.u1
    public /* synthetic */ Stream stream() {
        return t1.b(this);
    }

    @Override // org.apache.tools.ant.types.i, org.apache.tools.ant.types.s
    public String toString() {
        return org.apache.tools.ant.taskdefs.y1.a(";", A2().j());
    }
}
