package org.apache.tools.ant.util;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: compiled from: CompositeMapper.java */
/* JADX INFO: loaded from: classes5.dex */
public class s extends v {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] h(String str, g0 g0Var) {
        return g0Var.y0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] i(int i10) {
        return new String[i10];
    }

    @Override // org.apache.tools.ant.util.g0
    public String[] y0(final String str) {
        String[] strArr = (String[]) e().stream().filter(new Predicate() { // from class: org.apache.tools.ant.util.o
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return com.google.auto.common.s.a((g0) obj);
            }
        }).map(new Function() { // from class: org.apache.tools.ant.util.p
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return s.h(str, (g0) obj);
            }
        }).filter(new Predicate() { // from class: org.apache.tools.ant.util.q
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return com.google.auto.common.s.a((String[]) obj);
            }
        }).flatMap(new org.apache.tools.ant.taskdefs.optional.o()).toArray(new IntFunction() { // from class: org.apache.tools.ant.util.r
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return s.i(i10);
            }
        });
        if (strArr.length == 0) {
            return null;
        }
        return strArr;
    }
}
