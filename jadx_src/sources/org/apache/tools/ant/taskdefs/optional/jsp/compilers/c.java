package org.apache.tools.ant.taskdefs.optional.jsp.compilers;

import com.umeng.analytics.pro.ak;
import java.io.File;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.CommandlineJava;

/* JADX INFO: compiled from: DefaultJspCompilerAdapter.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected org.apache.tools.ant.taskdefs.optional.jsp.b f135270a;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(CommandlineJava commandlineJava, String str) {
        commandlineJava.g().O1(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String l(String str) {
        return String.format("    %s%n", str);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.jsp.compilers.e
    public void a(org.apache.tools.ant.taskdefs.optional.jsp.b bVar) {
        this.f135270a = bVar;
    }

    @Override // org.apache.tools.ant.taskdefs.optional.jsp.compilers.e
    public boolean b() {
        return false;
    }

    protected void f(CommandlineJava commandlineJava, String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        commandlineJava.g().O1(str);
    }

    protected void g(CommandlineJava commandlineJava, String str, File file) {
        if (file != null) {
            commandlineJava.g().O1(str);
            commandlineJava.g().G1(file);
        }
    }

    protected void h(CommandlineJava commandlineJava, String str, String str2) {
        if (str2 != null) {
            commandlineJava.g().O1(str);
            commandlineJava.g().O1(str2);
        }
    }

    public org.apache.tools.ant.taskdefs.optional.jsp.b i() {
        return this.f135270a;
    }

    public Project j() {
        return i().b();
    }

    protected void m(org.apache.tools.ant.taskdefs.optional.jsp.b bVar, Vector<String> vector, final CommandlineJava commandlineJava) {
        bVar.x1("Compilation " + commandlineJava.o(), 3);
        String str = (String) vector.stream().peek(new Consumer() { // from class: org.apache.tools.ant.taskdefs.optional.jsp.compilers.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                c.k(commandlineJava, (String) obj);
            }
        }).map(new Function() { // from class: org.apache.tools.ant.taskdefs.optional.jsp.compilers.b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return c.l((String) obj);
            }
        }).collect(Collectors.joining(""));
        Object[] objArr = new Object[2];
        objArr[0] = vector.size() != 1 ? ak.aB : "";
        objArr[1] = str;
        bVar.x1(String.format("File%s to be compiled:%n%s", objArr), 3);
    }
}
