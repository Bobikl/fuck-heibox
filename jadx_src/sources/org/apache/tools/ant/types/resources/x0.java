package org.apache.tools.ant.types.resources;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.p2;

/* JADX INFO: compiled from: PropertyResource.java */
/* JADX INFO: loaded from: classes5.dex */
public class x0 extends org.apache.tools.ant.types.s1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f136475p = org.apache.tools.ant.types.s1.j2("PropertyResource".getBytes());

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final InputStream f136476q = new a();

    /* JADX INFO: compiled from: PropertyResource.java */
    public class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int read() {
            return -1;
        }
    }

    public x0() {
    }

    public x0(Project project, String str) {
        super(str);
        J(project);
    }

    protected boolean A2() {
        return Y1() || (w2() instanceof org.apache.tools.ant.types.s1);
    }

    @Override // org.apache.tools.ant.types.s1
    public boolean equals(Object obj) {
        return super.equals(obj) || (A2() && y2().equals(obj));
    }

    @Override // org.apache.tools.ant.types.s1
    public InputStream h2() throws IOException {
        if (A2()) {
            return y2().h2();
        }
        Object objW2 = w2();
        return objW2 == null ? f136476q : new ByteArrayInputStream(String.valueOf(objW2).getBytes());
    }

    @Override // org.apache.tools.ant.types.s1
    public int hashCode() {
        return A2() ? y2().hashCode() : super.hashCode() * f136475p;
    }

    @Override // org.apache.tools.ant.types.s1
    public OutputStream l2() throws IOException {
        if (A2()) {
            return y2().l2();
        }
        if (p2()) {
            throw new ImmutableResourceException();
        }
        return new org.apache.tools.ant.util.g1(b(), k2());
    }

    @Override // org.apache.tools.ant.types.s1
    public long n2() {
        if (A2()) {
            return y2().n2();
        }
        Object objW2 = w2();
        if (objW2 == null) {
            return 0L;
        }
        return String.valueOf(objW2).length();
    }

    @Override // org.apache.tools.ant.types.s1
    public boolean p2() {
        if (A2()) {
            return y2().p2();
        }
        return w2() != null;
    }

    @Override // org.apache.tools.ant.types.s1, org.apache.tools.ant.types.s
    public String toString() {
        return A2() ? y2().toString() : z2();
    }

    public Object w2() {
        if (Y1()) {
            return m2().w2();
        }
        Project projectB = b();
        if (projectB == null) {
            return null;
        }
        return p2.t(projectB, k2());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.tools.ant.types.s1
    /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
    public x0 m2() {
        return (x0) O1(x0.class);
    }

    protected org.apache.tools.ant.types.s1 y2() {
        if (Y1()) {
            return super.m2();
        }
        Object objW2 = w2();
        if (objW2 instanceof org.apache.tools.ant.types.s1) {
            return (org.apache.tools.ant.types.s1) objW2;
        }
        throw new IllegalStateException("This PropertyResource does not reference or proxy another Resource");
    }

    public String z2() {
        if (Y1()) {
            return m2().z2();
        }
        Project projectB = b();
        if (projectB == null) {
            return null;
        }
        return projectB.u0(k2());
    }
}
