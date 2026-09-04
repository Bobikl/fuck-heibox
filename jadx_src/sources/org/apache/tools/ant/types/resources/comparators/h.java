package org.apache.tools.ant.types.resources.comparators;

import java.util.Comparator;
import java.util.function.Function;
import org.apache.tools.ant.types.s1;

/* JADX INFO: compiled from: Exists.java */
/* JADX INFO: loaded from: classes5.dex */
public class h extends m {
    @Override // org.apache.tools.ant.types.resources.comparators.m
    protected int g2(s1 s1Var, s1 s1Var2) {
        return Comparator.comparing(new Function() { // from class: org.apache.tools.ant.types.resources.comparators.g
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((s1) obj).p2());
            }
        }).compare(s1Var, s1Var2);
    }
}
