package org.apache.tools.ant.types.resources;

import java.util.Collection;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: Union.java */
/* JADX INFO: loaded from: classes5.dex */
public class w1 extends q {
    public w1() {
    }

    public w1(Project project) {
        super(project);
    }

    public w1(Project project, org.apache.tools.ant.types.u1 u1Var) {
        super(project);
        f2(u1Var);
    }

    public w1(org.apache.tools.ant.types.u1 u1Var) {
        this(Project.s0(u1Var), u1Var);
    }

    private <T> Stream<? extends T> A2(Function<? super org.apache.tools.ant.types.s1, ? extends T> function) {
        return k2().stream().flatMap(new b1()).map(function).distinct();
    }

    public static w1 t2(org.apache.tools.ant.types.u1 u1Var) {
        return u1Var instanceof w1 ? (w1) u1Var : new w1(u1Var);
    }

    private w1 u2() {
        return (w1) O1(w1.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] v2(int i10) {
        return new String[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ org.apache.tools.ant.types.s1[] w2(int i10) {
        return new org.apache.tools.ant.types.s1[i10];
    }

    private Stream<? extends org.apache.tools.ant.types.s1> z2() {
        return A2(Function.identity());
    }

    @Override // org.apache.tools.ant.types.resources.q
    protected Collection<org.apache.tools.ant.types.s1> i2() {
        return q2();
    }

    protected Set<org.apache.tools.ant.types.s1> q2() {
        return (Set) z2().collect(Collectors.toCollection(new u1()));
    }

    protected Collection<String> r2() {
        return (Collection) A2(new b()).collect(Collectors.toCollection(new u1()));
    }

    @Deprecated
    protected <T> Collection<T> s2(boolean z10) {
        return z10 ? (Collection<T>) r2() : q2();
    }

    public String[] x2() {
        return Y1() ? u2().x2() : (String[]) z2().map(new b()).toArray(new IntFunction() { // from class: org.apache.tools.ant.types.resources.v1
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return w1.v2(i10);
            }
        });
    }

    public org.apache.tools.ant.types.s1[] y2() {
        return Y1() ? u2().y2() : (org.apache.tools.ant.types.s1[]) z2().toArray(new IntFunction() { // from class: org.apache.tools.ant.types.resources.t1
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return w1.w2(i10);
            }
        });
    }
}
