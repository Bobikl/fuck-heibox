package org.apache.tools.ant.util;

import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: compiled from: ChainedMapper.java */
/* JADX INFO: loaded from: classes5.dex */
public class h extends v {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] i(int i10) {
        return new String[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] j(String[] strArr, final g0 g0Var) {
        Stream streamOf = Stream.of((Object[]) strArr);
        Objects.requireNonNull(g0Var);
        return (String[]) streamOf.map(new Function() { // from class: org.apache.tools.ant.util.b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return g0Var.y0((String) obj);
            }
        }).filter(new Predicate() { // from class: org.apache.tools.ant.util.c
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return com.google.auto.common.s.a((String[]) obj);
            }
        }).flatMap(new org.apache.tools.ant.taskdefs.optional.o()).toArray(new IntFunction() { // from class: org.apache.tools.ant.util.d
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return h.i(i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] k(String[] strArr, String[] strArr2) {
        return strArr2;
    }

    @Override // org.apache.tools.ant.util.g0
    public String[] y0(String str) {
        String[] strArr = (String[]) e().stream().filter(new Predicate() { // from class: org.apache.tools.ant.util.e
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return com.google.auto.common.s.a((g0) obj);
            }
        }).reduce(new String[]{str}, new BiFunction() { // from class: org.apache.tools.ant.util.f
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return h.j((String[]) obj, (g0) obj2);
            }
        }, new BinaryOperator() { // from class: org.apache.tools.ant.util.g
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return h.k((String[]) obj, (String[]) obj2);
            }
        });
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        return strArr;
    }
}
