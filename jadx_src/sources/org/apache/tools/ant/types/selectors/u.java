package org.apache.tools.ant.types.selectors;

import java.io.File;
import java.util.function.Function;
import org.apache.tools.ant.taskdefs.f2;
import org.apache.tools.ant.types.s1;

/* JADX INFO: compiled from: FileSelector.java */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u {
    public static boolean a(final v vVar, s1 s1Var) {
        return ((Boolean) s1Var.f2(org.apache.tools.ant.types.resources.y.class).map(new f2()).map(new Function() { // from class: org.apache.tools.ant.types.selectors.t
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(vVar.P0(null, null, (File) obj));
            }
        }).orElse(Boolean.FALSE)).booleanValue();
    }
}
