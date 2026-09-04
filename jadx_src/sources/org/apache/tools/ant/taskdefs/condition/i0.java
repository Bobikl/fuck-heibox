package org.apache.tools.ant.taskdefs.condition;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.util.h2;

/* JADX INFO: compiled from: Xor.java */
/* JADX INFO: loaded from: classes5.dex */
public class i0 extends e implements d {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean f2(Boolean bool, Boolean bool2) {
        return Boolean.valueOf(bool.booleanValue() ^ bool2.booleanValue());
    }

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() throws BuildException {
        return ((Boolean) h2.a(b2()).map(new Function() { // from class: org.apache.tools.ant.taskdefs.condition.g0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((d) obj).e());
            }
        }).reduce(new BinaryOperator() { // from class: org.apache.tools.ant.taskdefs.condition.h0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return i0.f2((Boolean) obj, (Boolean) obj2);
            }
        }).orElse(Boolean.FALSE)).booleanValue();
    }
}
