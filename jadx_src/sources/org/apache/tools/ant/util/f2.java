package org.apache.tools.ant.util;

import java.io.File;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Stream;
import org.apache.tools.ant.taskdefs.r6;

/* JADX INFO: compiled from: SourceFileScanner.java */
/* JADX INFO: loaded from: classes5.dex */
public class f2 implements org.apache.tools.ant.types.v1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final j0 f136776d = j0.O();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected org.apache.tools.ant.u2 f136777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f136778c;

    /* JADX INFO: compiled from: SourceFileScanner.java */
    public class a extends org.apache.tools.ant.types.resources.z {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f136779t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(File file, String str, String str2) {
            super(file, str);
            this.f136779t = str2;
        }

        @Override // org.apache.tools.ant.types.resources.z, org.apache.tools.ant.types.s1
        public String k2() {
            return this.f136779t;
        }
    }

    public f2(org.apache.tools.ant.u2 u2Var) {
        this.f136777b = u2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ a f(File file, String str) {
        return new a(file, str, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ org.apache.tools.ant.types.s1[] g(int i10) {
        return new org.apache.tools.ant.types.s1[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] h(int i10) {
        return new String[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ File i(File file, String str) {
        return new File(file, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ File[] j(int i10) {
        return new File[i10];
    }

    public String[] k(String[] strArr, File file, File file2, g0 g0Var) {
        return l(strArr, file, file2, g0Var, f136776d.M());
    }

    public String[] l(String[] strArr, final File file, File file2, g0 g0Var, long j10) {
        this.f136778c = file2;
        return (String[]) Stream.of((Object[]) ResourceUtils.A(this.f136777b, (org.apache.tools.ant.types.s1[]) Stream.of((Object[]) strArr).map(new Function() { // from class: org.apache.tools.ant.util.a2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f136735a.f(file, (String) obj);
            }
        }).toArray(new IntFunction() { // from class: org.apache.tools.ant.util.b2
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return f2.g(i10);
            }
        }), g0Var, this, j10)).map(new r6()).toArray(new IntFunction() { // from class: org.apache.tools.ant.util.c2
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return f2.h(i10);
            }
        });
    }

    public File[] m(String[] strArr, File file, File file2, g0 g0Var) {
        return n(strArr, file, file2, g0Var, f136776d.M());
    }

    public File[] n(String[] strArr, final File file, File file2, g0 g0Var, long j10) {
        return (File[]) Stream.of((Object[]) l(strArr, file, file2, g0Var, j10)).map(new Function() { // from class: org.apache.tools.ant.util.d2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return f2.i(file, (String) obj);
            }
        }).toArray(new IntFunction() { // from class: org.apache.tools.ant.util.e2
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return f2.j(i10);
            }
        });
    }

    @Override // org.apache.tools.ant.types.v1
    public org.apache.tools.ant.types.s1 o(String str) {
        return new org.apache.tools.ant.types.resources.z(this.f136778c, str);
    }
}
