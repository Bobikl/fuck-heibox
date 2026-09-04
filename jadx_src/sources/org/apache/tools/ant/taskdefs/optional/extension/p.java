package org.apache.tools.ant.taskdefs.optional.extension;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.stream.Collectors;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.v0;

/* JADX INFO: compiled from: ExtensionUtil.java */
/* JADX INFO: loaded from: classes5.dex */
public final class p {
    private p() {
    }

    private static void a(List<j> list, j jVar, boolean z10, boolean z11) {
        if (!z11 && jVar.k() != null) {
            jVar = new j(jVar.j(), jVar.s().toString(), jVar.r(), jVar.n().toString(), jVar.l(), jVar.m(), null);
        }
        boolean z12 = (jVar.k() == null && jVar.n() == null && jVar.m() == null && jVar.l() == null) ? false : true;
        if (!z10 && z12) {
            jVar = new j(jVar.j(), jVar.s().toString(), jVar.r(), null, null, null, jVar.k());
        }
        list.add(jVar);
    }

    static void b(Project project, List<j> list, List<org.apache.tools.ant.types.b0> list2) throws BuildException {
        if (list2.isEmpty()) {
            return;
        }
        Collections.addAll(list, c(project, list2));
    }

    private static j[] c(Project project, List<org.apache.tools.ant.types.b0> list) throws BuildException {
        boolean zF3;
        ArrayList arrayList = new ArrayList();
        for (org.apache.tools.ant.types.b0 b0Var : list) {
            boolean zE3 = true;
            if (b0Var instanceof a0) {
                a0 a0Var = (a0) b0Var;
                zE3 = a0Var.e3();
                zF3 = a0Var.f3();
            } else {
                zF3 = true;
            }
            v0 v0VarB2 = b0Var.B2(project);
            File fileF = v0VarB2.f();
            for (String str : v0VarB2.m()) {
                e(new File(fileF, str), arrayList, zE3, zF3);
            }
        }
        return (j[]) arrayList.toArray(new j[arrayList.size()]);
    }

    static Manifest d(File file) throws BuildException {
        try {
            JarFile jarFile = new JarFile(file);
            try {
                Manifest manifest = jarFile.getManifest();
                if (manifest == null) {
                    throw new BuildException("%s doesn't have a MANIFEST", file);
                }
                jarFile.close();
                return manifest;
            } catch (Throwable th2) {
                try {
                    jarFile.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            throw new BuildException(e10.getMessage(), e10);
        }
        throw new BuildException(e10.getMessage(), e10);
    }

    private static void e(File file, List<j> list, boolean z10, boolean z11) throws BuildException {
        try {
            JarFile jarFile = new JarFile(file);
            try {
                for (j jVar : j.f(jarFile.getManifest())) {
                    a(list, jVar, z10, z11);
                }
                jarFile.close();
            } catch (Throwable th2) {
                try {
                    jarFile.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Exception e10) {
            throw new BuildException(e10.getMessage(), e10);
        }
    }

    static ArrayList<j> f(List<? extends k> list) throws BuildException {
        return (ArrayList) list.stream().map(new Function() { // from class: org.apache.tools.ant.taskdefs.optional.extension.n
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).m2();
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: org.apache.tools.ant.taskdefs.optional.extension.o
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }));
    }
}
