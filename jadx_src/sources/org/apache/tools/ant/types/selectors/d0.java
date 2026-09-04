package org.apache.tools.ant.types.selectors;

import java.io.File;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: compiled from: OrSelector.java */
/* JADX INFO: loaded from: classes5.dex */
public class d0 extends j {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean t2(File file, String str, File file2, v vVar) {
        return vVar.P0(file, str, file2);
    }

    @Override // org.apache.tools.ant.types.selectors.j, org.apache.tools.ant.types.selectors.h, org.apache.tools.ant.types.selectors.v
    public boolean P0(final File file, final String str, final File file2) {
        i2();
        return Stream.of((Object[]) N0(b())).anyMatch(new Predicate() { // from class: org.apache.tools.ant.types.selectors.c0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return d0.t2(file, str, file2, (v) obj);
            }
        });
    }

    @Override // org.apache.tools.ant.types.selectors.j, org.apache.tools.ant.types.s
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (S0()) {
            sb2.append("{orselect: ");
            sb2.append(super.toString());
            sb2.append(z5.g.f141884d);
        }
        return sb2.toString();
    }
}
