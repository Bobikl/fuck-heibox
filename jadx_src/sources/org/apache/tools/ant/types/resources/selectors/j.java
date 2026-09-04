package org.apache.tools.ant.types.resources.selectors;

import java.util.function.Predicate;
import org.apache.tools.ant.types.s1;

/* JADX INFO: compiled from: None.java */
/* JADX INFO: loaded from: classes5.dex */
public class j extends o implements n {
    public j() {
    }

    public j(n... nVarArr) {
        super(nVarArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean j2(s1 s1Var, n nVar) {
        return nVar.a(s1Var);
    }

    @Override // org.apache.tools.ant.types.resources.selectors.n
    public boolean a(final s1 s1Var) {
        return g2().stream().noneMatch(new Predicate() { // from class: org.apache.tools.ant.types.resources.selectors.i
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return j.j2(s1Var, (n) obj);
            }
        });
    }
}
