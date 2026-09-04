package org.apache.tools.ant.types.resources;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: compiled from: JavaResource.java */
/* JADX INFO: loaded from: classes5.dex */
public class l0 extends a implements p1 {
    public l0() {
    }

    public l0(String str, org.apache.tools.ant.types.o0 o0Var) {
        t2(str);
        C2(o0Var);
    }

    @Override // org.apache.tools.ant.types.resources.a
    protected InputStream B2(ClassLoader classLoader) throws IOException {
        if (classLoader == null) {
            InputStream systemResourceAsStream = ClassLoader.getSystemResourceAsStream(k2());
            if (systemResourceAsStream != null) {
                return systemResourceAsStream;
            }
            throw new FileNotFoundException("No resource " + k2() + " on Ant's classpath");
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(k2());
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        throw new FileNotFoundException("No resource " + k2() + " on the classpath " + classLoader);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.tools.ant.types.resources.a, org.apache.tools.ant.types.s1
    /* JADX INFO: renamed from: G2, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public l0 m2() {
        return (l0) O1(l0.class);
    }

    @Override // org.apache.tools.ant.types.s1, java.lang.Comparable
    /* JADX INFO: renamed from: g2 */
    public int compareTo(org.apache.tools.ant.types.s1 s1Var) {
        if (Y1()) {
            return A2().compareTo(s1Var);
        }
        if (!s1Var.getClass().equals(getClass())) {
            return super.compareTo(s1Var);
        }
        l0 l0Var = (l0) s1Var;
        if (!k2().equals(l0Var.k2())) {
            return k2().compareTo(l0Var.k2());
        }
        if (z2() != l0Var.z2()) {
            if (z2() == null) {
                return -1;
            }
            if (l0Var.z2() == null) {
                return 1;
            }
            return z2().b().compareTo(l0Var.z2().b());
        }
        org.apache.tools.ant.types.o0 o0VarY2 = y2();
        org.apache.tools.ant.types.o0 o0VarY3 = l0Var.y2();
        if (o0VarY2 == o0VarY3) {
            return 0;
        }
        if (o0VarY2 == null) {
            return -1;
        }
        if (o0VarY3 == null) {
            return 1;
        }
        return o0VarY2.toString().compareTo(o0VarY3.toString());
    }

    @Override // org.apache.tools.ant.types.resources.p1
    public URL getURL() {
        if (Y1()) {
            return A2().getURL();
        }
        a.b bVarX2 = x2();
        if (bVarX2.b() == null) {
            return ClassLoader.getSystemResource(k2());
        }
        try {
            return bVarX2.b().getResource(k2());
        } finally {
            bVarX2.a();
        }
    }
}
