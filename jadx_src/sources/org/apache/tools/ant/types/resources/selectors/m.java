package org.apache.tools.ant.types.resources.selectors;

import java.util.function.Predicate;
import org.apache.tools.ant.types.s1;

/* JADX INFO: compiled from: Or.java */
/* JADX INFO: loaded from: classes5.dex */
public class m extends o implements n {
    public m() {
    }

    public m(n... nVarArr) {
        super(nVarArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean j2(s1 s1Var, n nVar) {
        return nVar.a(s1Var);
    }

    @Override // org.apache.tools.ant.types.resources.selectors.n
    public boolean a(final s1 s1Var) {
        return g2().stream().anyMatch(new Predicate() { // from class: org.apache.tools.ant.types.resources.selectors.l
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return m.j2(s1Var, (n) obj);
            }
        });
    }
}
