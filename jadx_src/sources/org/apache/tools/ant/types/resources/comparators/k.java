package org.apache.tools.ant.types.resources.comparators;

import java.io.File;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.tools.ant.types.resources.y;
import org.apache.tools.ant.types.s1;
import org.apache.tools.ant.util.j0;

/* JADX INFO: compiled from: FileSystem.java */
/* JADX INFO: loaded from: classes5.dex */
public class k extends m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final j0 f136340g = j0.O();

    private int i2(File file, File file2) {
        if (Objects.equals(file, file2)) {
            return 0;
        }
        final j0 j0Var = f136340g;
        if (j0Var.Y(file, file2)) {
            return -1;
        }
        if (j0Var.Y(file2, file)) {
            return 1;
        }
        org.apache.tools.ant.taskdefs.compilers.e eVar = new org.apache.tools.ant.taskdefs.compilers.e();
        Objects.requireNonNull(j0Var);
        return Comparator.comparing(eVar.andThen(new Function() { // from class: org.apache.tools.ant.types.resources.comparators.i
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return j0Var.i0((String) obj);
            }
        })).compare(file, file2);
    }

    private File j2(final s1 s1Var) {
        return ((y) s1Var.f2(y.class).orElseThrow(new Supplier() { // from class: org.apache.tools.ant.types.resources.comparators.j
            @Override // java.util.function.Supplier
            public final Object get() {
                return k.k2(s1Var);
            }
        })).l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ClassCastException k2(s1 s1Var) {
        return new ClassCastException(s1Var.getClass() + " doesn't provide files");
    }

    @Override // org.apache.tools.ant.types.resources.comparators.m
    protected int g2(s1 s1Var, s1 s1Var2) {
        return i2(j2(s1Var), j2(s1Var2));
    }
}
