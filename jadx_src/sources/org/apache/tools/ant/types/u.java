package org.apache.tools.ant.types;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.t2;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.z2;

/* JADX INFO: compiled from: Description.java */
/* JADX INFO: loaded from: classes5.dex */
public class u extends s {
    private static void g2(Project project, t2 t2Var, StringBuilder sb2) {
        String string;
        if (t2Var == null) {
            return;
        }
        for (u2 u2Var : h2(t2Var, "description")) {
            if ((u2Var instanceof z2) && (string = ((z2) u2Var).N1().n().toString()) != null) {
                sb2.append(project.V0(string));
            }
        }
    }

    private static List<u2> h2(t2 t2Var, final String str) {
        return (List) Stream.of((Object[]) t2Var.m()).filter(new Predicate() { // from class: org.apache.tools.ant.types.t
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return u.j2(str, (u2) obj);
            }
        }).collect(Collectors.toList());
    }

    public static String i2(Project project) {
        List list = (List) project.w0(org.apache.tools.ant.helper.e.f133367o);
        if (list == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g2(project, (t2) it.next(), sb2);
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean j2(String str, u2 u2Var) {
        return str.equals(u2Var.K1());
    }

    public void f2(String str) {
        if (((org.apache.tools.ant.e2) b().w0("ant.projectHelper")) instanceof org.apache.tools.ant.helper.f) {
            String strJ0 = b().j0();
            if (strJ0 == null) {
                b().f1(str);
                return;
            }
            b().f1(strJ0 + str);
        }
    }
}
