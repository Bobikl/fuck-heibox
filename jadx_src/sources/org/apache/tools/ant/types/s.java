package org.apache.tools.ant.types;

import java.util.Stack;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.util.IdentityStack;

/* JADX INFO: compiled from: DataType.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class s extends org.apache.tools.ant.b2 implements Cloneable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    protected q1 f136487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    protected boolean f136488f = true;

    private String L1(Class<?> cls) {
        return cls.getName() + " (loaded via " + cls.getClassLoader() + ")";
    }

    public static void W1(s sVar, Stack<Object> stack, Project project) {
        sVar.I1(stack, project);
    }

    public static void a2(s sVar, Stack<Object> stack, Project project) {
        stack.push(sVar);
        sVar.I1(stack, project);
        stack.pop();
    }

    protected void B1() {
        if (Y1()) {
            throw d2();
        }
    }

    protected void D1() {
        if (Y1()) {
            throw Z1();
        }
    }

    protected BuildException G1() {
        return new BuildException("This data type contains a circular reference.");
    }

    protected void H1() {
        K1(b());
    }

    protected void I1(Stack<Object> stack, Project project) throws BuildException {
        if (this.f136488f || !Y1()) {
            return;
        }
        Object objD = this.f136487e.d(project);
        if (objD instanceof s) {
            IdentityStack identityStackA = IdentityStack.a(stack);
            if (identityStackA.contains(objD)) {
                throw G1();
            }
            identityStackA.push(objD);
            ((s) objD).I1(identityStackA, project);
            identityStackA.pop();
        }
        this.f136488f = true;
    }

    protected void K1(Project project) {
        if (this.f136488f || !Y1()) {
            return;
        }
        I1(new IdentityStack(this), project);
    }

    @Deprecated
    protected <T> T N1() {
        return (T) S1(b());
    }

    protected <T> T O1(Class<T> cls) {
        return (T) R1(cls, U1(), b());
    }

    protected <T> T Q1(Class<T> cls, String str) {
        return (T) R1(cls, str, b());
    }

    protected <T> T R1(Class<T> cls, String str, Project project) {
        if (project == null) {
            throw new BuildException("No Project specified");
        }
        K1(project);
        T t10 = (T) this.f136487e.d(project);
        if (cls.isAssignableFrom(t10.getClass())) {
            return t10;
        }
        x1("Class " + L1(t10.getClass()) + " is not a subclass of " + L1(cls), 3);
        throw new BuildException(this.f136487e.b() + " doesn't denote a " + str);
    }

    @Deprecated
    protected <T> T S1(Project project) {
        return (T) R1(getClass(), U1(), project);
    }

    protected String U1() {
        return org.apache.tools.ant.u.F(b(), this, true);
    }

    public q1 V1() {
        return this.f136487e;
    }

    protected boolean X1() {
        return this.f136488f;
    }

    public boolean Y1() {
        return this.f136487e != null;
    }

    protected BuildException Z1() {
        return new BuildException("You must not specify nested elements when using refid");
    }

    protected void b2(boolean z10) {
        this.f136488f = z10;
    }

    public void c2(q1 q1Var) {
        this.f136487e = q1Var;
        this.f136488f = false;
    }

    @Override // org.apache.tools.ant.b2
    public Object clone() throws CloneNotSupportedException {
        s sVar = (s) super.clone();
        sVar.z1(u1());
        if (V1() != null) {
            sVar.c2(V1());
        }
        sVar.b2(X1());
        return sVar;
    }

    protected BuildException d2() {
        return new BuildException("You must not specify more than one attribute when using refid");
    }

    public String toString() {
        String strU1 = u1();
        if (strU1 == null) {
            return U1();
        }
        return U1() + " " + strU1;
    }
}
