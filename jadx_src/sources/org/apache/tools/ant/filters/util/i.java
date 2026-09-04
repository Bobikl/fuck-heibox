package org.apache.tools.ant.filters.util;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.c0;
import org.apache.tools.ant.types.j;
import org.apache.tools.ant.types.n0;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.util.j0;

/* JADX INFO: compiled from: ChainReaderHelper.java */
/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f133263e = 8192;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Reader f133264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f133265b = 8192;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Vector<c0> f133266c = new Vector<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Project f133267d = null;

    /* JADX INFO: compiled from: ChainReaderHelper.java */
    public class b extends FilterReader {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<org.apache.tools.ant.g> f133268b;

        private b(Reader reader, List<org.apache.tools.ant.g> list) {
            super(reader);
            this.f133268b = list;
        }

        public String a() throws IOException {
            return i.this.j(this);
        }

        @Override // java.io.FilterReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            i.d(this.f133268b);
            super.close();
        }

        protected void finalize() throws Throwable {
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    public i() {
    }

    public i(Project project, Reader reader, Iterable<c0> iterable) {
        t(project).s(reader).r(iterable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(List<org.apache.tools.ant.g> list) {
        list.forEach(new Consumer() { // from class: org.apache.tools.ant.filters.util.h
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((org.apache.tools.ant.g) obj).n();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Class, java.lang.Class<org.apache.tools.ant.types.n0>] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object[]] */
    private Reader e(j jVar, Reader reader, List<org.apache.tools.ant.g> list) {
        Class clsAsSubclass;
        final ?? G2 = jVar.g2();
        o0 o0VarH2 = jVar.h2();
        if (G2 == 0) {
            return reader;
        }
        try {
            try {
                if (o0VarH2 == null) {
                    clsAsSubclass = Class.forName(G2).asSubclass(FilterReader.class);
                } else {
                    org.apache.tools.ant.g gVarZ = jVar.b().z(o0VarH2);
                    list.add(gVarZ);
                    clsAsSubclass = Class.forName(G2, true, gVarZ).asSubclass(FilterReader.class);
                }
                Object objNewInstance = ((Constructor) Stream.of((Object[]) clsAsSubclass.getConstructors()).filter(new Predicate() { // from class: org.apache.tools.ant.filters.util.e
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return i.h((Constructor) obj);
                    }
                }).findFirst().orElseThrow(new Supplier() { // from class: org.apache.tools.ant.filters.util.f
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return i.i(G2);
                    }
                })).newInstance(reader);
                o(objNewInstance);
                G2 = n0.class;
                if (G2.isAssignableFrom(clsAsSubclass)) {
                    ((n0) objNewInstance).H0(jVar.i2());
                }
                return (Reader) objNewInstance;
            } catch (ClassCastException unused) {
                throw new BuildException("%s does not extend %s", (Object[]) new Object[]{G2, FilterReader.class.getName()});
            }
        } catch (ClassNotFoundException e10) {
            e = e10;
            throw new BuildException(e);
        } catch (IllegalAccessException e11) {
            e = e11;
            throw new BuildException(e);
        } catch (InstantiationException e12) {
            e = e12;
            throw new BuildException(e);
        } catch (InvocationTargetException e13) {
            e = e13;
            throw new BuildException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean h(Constructor constructor) {
        return constructor.getParameterCount() == 1 && constructor.getParameterTypes()[0].isAssignableFrom(Reader.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ BuildException i(String str) {
        return new BuildException("%s does not define a public constructor that takes in a %s as its single argument.", str, Reader.class.getSimpleName());
    }

    private void o(Object obj) {
        Project project = this.f133267d;
        if (project == null) {
            return;
        }
        if (obj instanceof org.apache.tools.ant.filters.a) {
            ((org.apache.tools.ant.filters.a) obj).f(project);
        } else {
            project.o1(obj);
        }
    }

    public b f() throws BuildException {
        Reader readerE = this.f133264a;
        if (readerE == null) {
            throw new BuildException("primaryReader must not be null.");
        }
        ArrayList arrayList = new ArrayList();
        List list = (List) this.f133266c.stream().map(new Function() { // from class: org.apache.tools.ant.filters.util.c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((c0) obj).B2();
            }
        }).flatMap(new Function() { // from class: org.apache.tools.ant.filters.util.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Vector) obj).stream();
            }
        }).collect(Collectors.toList());
        if (!list.isEmpty()) {
            try {
                for (Object obj : list) {
                    if (obj instanceof j) {
                        readerE = e((j) obj, readerE, arrayList);
                    } else if (obj instanceof org.apache.tools.ant.filters.c) {
                        o(obj);
                        readerE = ((org.apache.tools.ant.filters.c) obj).t0(readerE);
                        o(readerE);
                    }
                }
            } catch (Throwable th2) {
                if (!arrayList.isEmpty()) {
                    d(arrayList);
                }
                throw th2;
            }
        }
        return new b(readerE, arrayList);
    }

    public Project g() {
        return this.f133267d;
    }

    public String j(Reader reader) throws IOException {
        return j0.k0(reader, this.f133265b);
    }

    public void k(int i10) {
        this.f133265b = i10;
    }

    public void l(Vector<c0> vector) {
        this.f133266c = vector;
    }

    public void m(Reader reader) {
        this.f133264a = reader;
    }

    public void n(Project project) {
        this.f133267d = project;
    }

    public i p(Consumer<i> consumer) {
        consumer.accept(this);
        return this;
    }

    public i q(int i10) {
        k(i10);
        return this;
    }

    public i r(Iterable<c0> iterable) {
        Vector<c0> vector;
        if (iterable instanceof Vector) {
            vector = (Vector) iterable;
        } else {
            final Vector<c0> vector2 = new Vector<>();
            iterable.forEach(new Consumer() { // from class: org.apache.tools.ant.filters.util.g
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    vector2.add((c0) obj);
                }
            });
            vector = vector2;
        }
        l(vector);
        return this;
    }

    public i s(Reader reader) {
        m(reader);
        return this;
    }

    public i t(Project project) {
        n(project);
        return this;
    }
}
