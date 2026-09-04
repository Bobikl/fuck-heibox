package org.apache.tools.ant.util;

import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: compiled from: FirstMatchMapper.java */
/* JADX INFO: loaded from: classes5.dex */
public class n0 extends v {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] g(String str, g0 g0Var) {
        return g0Var.y0(str);
    }

    @Override // org.apache.tools.ant.util.g0
    public String[] y0(final String str) {
        return (String[]) e().stream().filter(new Predicate() { // from class: org.apache.tools.ant.util.k0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return com.google.auto.common.s.a((g0) obj);
            }
        }).map(new Function() { // from class: org.apache.tools.ant.util.l0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return n0.g(str, (g0) obj);
            }
        }).filter(new Predicate() { // from class: org.apache.tools.ant.util.m0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return com.google.auto.common.s.a((String[]) obj);
            }
        }).findFirst().orElse(null);
    }
}
