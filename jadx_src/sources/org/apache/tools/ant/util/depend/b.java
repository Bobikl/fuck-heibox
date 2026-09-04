package org.apache.tools.ant.util.depend;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import org.apache.tools.ant.types.o0;

/* JADX INFO: compiled from: DependencyAnalyzer.java */
/* JADX INFO: loaded from: classes5.dex */
public interface b {
    File a(String str) throws IOException;

    File b(String str) throws IOException;

    void c(boolean z10);

    void d(String str, Object obj);

    Enumeration<String> e();

    void f(String str);

    void g(o0 o0Var);

    void h(o0 o0Var);

    Enumeration<File> i();

    void reset();
}
