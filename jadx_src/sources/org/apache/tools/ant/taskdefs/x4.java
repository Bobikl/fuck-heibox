package org.apache.tools.ant.taskdefs;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: ProjectHelperTask.java */
/* JADX INFO: loaded from: classes5.dex */
public class x4 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<org.apache.tools.ant.e2> f135933k = new ArrayList();

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        Stream map = this.f135933k.stream().map(new Function() { // from class: org.apache.tools.ant.taskdefs.v4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((org.apache.tools.ant.e2) obj).getClass();
            }
        });
        final org.apache.tools.ant.l2 l2VarG = org.apache.tools.ant.l2.g();
        Objects.requireNonNull(l2VarG);
        map.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.w4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                l2VarG.o((Class) obj);
            }
        });
    }

    public synchronized void i2(org.apache.tools.ant.e2 e2Var) {
        this.f135933k.add(e2Var);
    }
}
