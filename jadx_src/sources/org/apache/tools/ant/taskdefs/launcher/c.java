package org.apache.tools.ant.taskdefs.launcher;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.j1;
import org.apache.tools.ant.taskdefs.condition.z;
import org.apache.tools.ant.types.o;
import org.apache.tools.ant.util.j0;

/* JADX INFO: compiled from: CommandLauncher.java */
/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final j0 f134467a = j0.O();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static c f134468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f134469c;

    static {
        f134468b = null;
        f134469c = null;
        if (!z.b(z.f133971m)) {
            f134468b = new e();
        }
        if (z.b("mac") && !z.b(z.f133976r)) {
            f134469c = new f(new c());
            return;
        }
        if (z.b(z.f133971m)) {
            f134469c = new g(new c());
            return;
        }
        if (z.b("windows")) {
            c cVar = new c();
            if (z.b(z.f133969k)) {
                f134469c = new i("bin/antRun.bat", cVar);
                return;
            } else {
                f134469c = new l(cVar);
                return;
            }
        }
        if (z.b(z.f133972n)) {
            f134469c = new h("bin/antRun.pl", new c());
        } else if (z.b(z.f133977s)) {
            f134469c = new k();
        } else {
            f134469c = new i("bin/antRun", new c());
        }
    }

    private static c e(final String str, Project project) {
        return (c) Optional.ofNullable(project).map(new Function() { // from class: org.apache.tools.ant.taskdefs.launcher.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return c.i(str, (Project) obj);
            }
        }).orElseGet(new Supplier() { // from class: org.apache.tools.ant.taskdefs.launcher.b
            @Override // java.util.function.Supplier
            public final Object get() {
                return c.g(str);
            }
        });
    }

    public static c f(Project project) {
        c cVarE = e(j1.I, project);
        return cVarE == null ? f134469c : cVarE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c g(String str) {
        String property = System.getProperty(str);
        if (property == null) {
            return null;
        }
        try {
            return (c) Class.forName(property).asSubclass(c.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            System.err.println("Could not instantiate launcher class " + property + ": " + e10.getMessage());
            return null;
        }
    }

    public static c h(Project project) {
        c cVarE = e(j1.J, project);
        return cVarE == null ? f134468b : cVarE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c i(String str, Project project) {
        return (c) project.w0(str);
    }

    public static void k(Project project, c cVar) {
        if (project != null) {
            project.i(j1.I, cVar);
        }
    }

    public static void l(Project project, c cVar) {
        if (project != null) {
            project.i(j1.J, cVar);
        }
    }

    public Process c(Project project, String[] strArr, String[] strArr2) throws IOException {
        if (project != null) {
            project.M0("Execute:CommandLauncher: " + o.q(strArr), 4);
        }
        return Runtime.getRuntime().exec(strArr, strArr2);
    }

    public Process d(Project project, String[] strArr, String[] strArr2, File file) throws IOException {
        if (file == null) {
            return c(project, strArr, strArr2);
        }
        throw new IOException("Cannot execute a process in different directory under this JVM");
    }
}
