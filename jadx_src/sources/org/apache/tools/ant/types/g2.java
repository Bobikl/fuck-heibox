package org.apache.tools.ant.types;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.zip.ZipException;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.util.h2;

/* JADX INFO: compiled from: ZipScanner.java */
/* JADX INFO: loaded from: classes5.dex */
public class g2 extends l {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ BuildException c1() {
        return new BuildException("Only file provider resources are supported");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d1(File file, String str, Map map, Map map2, Map map3, Map map4, org.apache.tools.zip.t tVar) {
        org.apache.tools.ant.types.resources.x1 x1Var = new org.apache.tools.ant.types.resources.x1(file, str, tVar);
        String name = tVar.getName();
        if (!tVar.isDirectory()) {
            map3.put(name, x1Var);
            if (T0(name)) {
                map4.put(name, x1Var);
                return;
            }
            return;
        }
        String strZ0 = l.Z0(name);
        map.put(strZ0, x1Var);
        if (T0(strZ0)) {
            map2.put(strZ0, x1Var);
        }
    }

    @Override // org.apache.tools.ant.types.l
    protected void P0(s1 s1Var, final String str, final Map<String, s1> map, final Map<String, s1> map2, final Map<String, s1> map3, final Map<String, s1> map4) {
        final File file = (File) s1Var.f2(org.apache.tools.ant.types.resources.y.class).map(new org.apache.tools.ant.taskdefs.f2()).orElseThrow(new Supplier() { // from class: org.apache.tools.ant.types.e2
            @Override // java.util.function.Supplier
            public final Object get() {
                return g2.c1();
            }
        });
        try {
            org.apache.tools.zip.x xVar = new org.apache.tools.zip.x(file, str);
            try {
                h2.a(xVar.i()).forEach(new Consumer() { // from class: org.apache.tools.ant.types.f2
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        this.f136154b.d1(file, str, map3, map4, map, map2, (org.apache.tools.zip.t) obj);
                    }
                });
                xVar.close();
            } catch (Throwable th2) {
                try {
                    xVar.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (ZipException e10) {
            throw new BuildException("Problem reading " + file, e10);
        } catch (IOException e11) {
            throw new BuildException("Problem opening " + file, e11);
        }
    }
}
