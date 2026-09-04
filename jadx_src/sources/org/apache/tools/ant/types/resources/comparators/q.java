package org.apache.tools.ant.types.resources.comparators;

import java.util.Comparator;
import java.util.function.ToLongFunction;
import org.apache.tools.ant.types.s1;

/* JADX INFO: compiled from: Size.java */
/* JADX INFO: loaded from: classes5.dex */
public class q extends m {
    @Override // org.apache.tools.ant.types.resources.comparators.m
    protected int g2(s1 s1Var, s1 s1Var2) {
        return Comparator.comparingLong(new ToLongFunction() { // from class: org.apache.tools.ant.types.resources.comparators.p
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                return ((s1) obj).n2();
            }
        }).compare(s1Var, s1Var2);
    }
}
