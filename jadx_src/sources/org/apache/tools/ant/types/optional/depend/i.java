package org.apache.tools.ant.types.optional.depend;

import java.io.File;
import java.util.Set;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.util.h2;
import org.apache.tools.ant.v0;

/* JADX INFO: compiled from: DependScanner.java */
/* JADX INFO: loaded from: classes5.dex */
public class i extends v0 {
    public static final String P = "org.apache.tools.ant.util.depend.bcel.FullAnalyzer";
    private Vector<String> L;
    private Vector<String> M;
    private Vector<File> N = new Vector<>();
    private v0 O;

    public i(v0 v0Var) {
        this.O = v0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o0 U0(String str) {
        return new o0(null, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String V0(String str) {
        return str.replace(lg.a.f131414g, File.separatorChar) + ".class";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean W0(Set set, String str) {
        return new File(this.f137052b, str).exists() && set.contains(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X0(String str) {
        this.M.addElement(str);
    }

    public void T0(File file) {
        this.N.addElement(file);
    }

    @Override // org.apache.tools.ant.v0
    public int W() {
        return 0;
    }

    @Override // org.apache.tools.ant.v0
    public synchronized int X() {
        Vector<String> vector;
        vector = this.M;
        if (vector == null) {
            throw new IllegalStateException();
        }
        return vector.size();
    }

    public synchronized void Y0(Vector<String> vector) {
        this.L = vector;
    }

    @Override // org.apache.tools.ant.v0, org.apache.tools.ant.h1
    public String[] a() {
        return null;
    }

    @Override // org.apache.tools.ant.v0, org.apache.tools.ant.h1
    public synchronized void e() throws IllegalStateException {
        this.M = new Vector<>();
        try {
            final org.apache.tools.ant.util.depend.b bVar = (org.apache.tools.ant.util.depend.b) Class.forName("org.apache.tools.ant.util.depend.bcel.FullAnalyzer").asSubclass(org.apache.tools.ant.util.depend.b.class).newInstance();
            bVar.g(new o0(null, this.f137052b.getPath()));
            this.N.stream().map(new Function() { // from class: org.apache.tools.ant.types.optional.depend.b
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((File) obj).getPath();
                }
            }).map(new Function() { // from class: org.apache.tools.ant.types.optional.depend.c
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return i.U0((String) obj);
                }
            }).forEach(new Consumer() { // from class: org.apache.tools.ant.types.optional.depend.d
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    bVar.g((o0) obj);
                }
            });
            this.L.forEach(new Consumer() { // from class: org.apache.tools.ant.types.optional.depend.e
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    bVar.f((String) obj);
                }
            });
            final Set set = (Set) Stream.of((Object[]) this.O.m()).collect(Collectors.toSet());
            h2.a(bVar.e()).map(new Function() { // from class: org.apache.tools.ant.types.optional.depend.f
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return i.V0((String) obj);
                }
            }).filter(new Predicate() { // from class: org.apache.tools.ant.types.optional.depend.g
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return this.f136262a.W0(set, (String) obj);
                }
            }).forEach(new Consumer() { // from class: org.apache.tools.ant.types.optional.depend.h
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f136264b.X0((String) obj);
                }
            });
        } catch (Exception e10) {
            throw new BuildException("Unable to load dependency analyzer: org.apache.tools.ant.util.depend.bcel.FullAnalyzer", e10);
        }
    }

    @Override // org.apache.tools.ant.v0, org.apache.tools.ant.h1
    public String[] g() {
        return null;
    }

    @Override // org.apache.tools.ant.v0, org.apache.tools.ant.h1
    public void h(String[] strArr) {
    }

    @Override // org.apache.tools.ant.v0, org.apache.tools.ant.h1
    public String[] i() {
        return null;
    }

    @Override // org.apache.tools.ant.v0, org.apache.tools.ant.h1
    public String[] j() {
        return new String[0];
    }

    @Override // org.apache.tools.ant.v0, org.apache.tools.ant.h1
    public void k(String[] strArr) {
    }

    @Override // org.apache.tools.ant.v0, org.apache.tools.ant.h1
    public void l(boolean z10) {
    }

    @Override // org.apache.tools.ant.v0, org.apache.tools.ant.h1
    public String[] m() {
        return (String[]) this.M.toArray(new String[X()]);
    }

    @Override // org.apache.tools.ant.v0, org.apache.tools.ant.h1
    public String[] q() {
        return null;
    }

    @Override // org.apache.tools.ant.v0, org.apache.tools.ant.h1
    public void r() {
    }
}
