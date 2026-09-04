package org.apache.tools.ant.util;

import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: SplitClassLoader.java */
/* JADX INFO: loaded from: classes5.dex */
public final class g2 extends org.apache.tools.ant.g {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final String[] f136784u;

    public g2(ClassLoader classLoader, org.apache.tools.ant.types.o0 o0Var, Project project, String[] strArr) {
        super(classLoader, project, o0Var, true);
        this.f136784u = strArr;
    }

    private boolean x0(String str) {
        String strSubstring = str.substring(str.lastIndexOf(46) + 1);
        for (String str2 : this.f136784u) {
            if (!strSubstring.equals(str2)) {
                if (!strSubstring.startsWith(str2 + kotlin.text.y.f128594c)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // org.apache.tools.ant.g, java.lang.ClassLoader
    protected synchronized Class<?> loadClass(String str, boolean z10) throws ClassNotFoundException {
        Class<?> clsFindLoadedClass = findLoadedClass(str);
        if (clsFindLoadedClass != null) {
            return clsFindLoadedClass;
        }
        if (!x0(str)) {
            return super.loadClass(str, z10);
        }
        Class<?> clsFindClass = findClass(str);
        if (z10) {
            resolveClass(clsFindClass);
        }
        return clsFindClass;
    }
}
