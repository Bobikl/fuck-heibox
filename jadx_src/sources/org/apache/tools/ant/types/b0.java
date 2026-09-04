package org.apache.tools.ant.types;

import java.util.Iterator;
import java.util.stream.Stream;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: FileSet.java */
/* JADX INFO: loaded from: classes5.dex */
public class b0 extends i implements u1 {
    public b0() {
    }

    protected b0(b0 b0Var) {
        super(b0Var);
    }

    private b0 c3() {
        return (b0) O1(b0.class);
    }

    @Override // org.apache.tools.ant.types.i
    protected i E2(Project project) {
        return (i) R1(b0.class, U1(), project);
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
        return Y1() ? c3().iterator() : new org.apache.tools.ant.types.resources.a0(b(), z2(b()), A2().m());
    }

    @Override // org.apache.tools.ant.types.u1
    public int size() {
        return Y1() ? c3().size() : A2().X();
    }

    @Override // org.apache.tools.ant.types.u1
    public /* synthetic */ Stream stream() {
        return t1.b(this);
    }
}
