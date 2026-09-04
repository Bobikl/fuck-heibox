package org.apache.tools.ant.attribute;

import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.apache.tools.ant.b2;
import org.apache.tools.ant.z2;

/* JADX INFO: compiled from: BaseIfAttribute.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class f extends b2 implements g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f133081e = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean N1(Map.Entry entry) {
        return ((String) entry.getKey()).startsWith("ant-attribute:param");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String O1(Map.Entry entry) {
        return ((String) entry.getKey()).substring(((String) entry.getKey()).lastIndexOf(58) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String Q1(z2 z2Var, Map.Entry entry) {
        return z2Var.b().V0((String) entry.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String R1(String str, String str2) {
        return str2;
    }

    protected boolean I1(boolean z10) {
        return this.f133081e == z10;
    }

    protected Map<String, String> K1(final z2 z2Var) {
        return (Map) z2Var.N1().f().entrySet().stream().filter(new Predicate() { // from class: org.apache.tools.ant.attribute.b
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return f.N1((Map.Entry) obj);
            }
        }).collect(Collectors.toMap(new Function() { // from class: org.apache.tools.ant.attribute.c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return f.O1((Map.Entry) obj);
            }
        }, new Function() { // from class: org.apache.tools.ant.attribute.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return f.Q1(z2Var, (Map.Entry) obj);
            }
        }, new BinaryOperator() { // from class: org.apache.tools.ant.attribute.e
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return f.R1((String) obj, (String) obj2);
            }
        }));
    }

    protected boolean L1() {
        return this.f133081e;
    }

    protected void S1(boolean z10) {
        this.f133081e = z10;
    }
}
