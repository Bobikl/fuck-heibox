package org.apache.tools.ant.types.selectors;

import java.io.File;

/* JADX INFO: compiled from: TypeSelector.java */
/* JADX INFO: loaded from: classes5.dex */
public class s0 extends g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f136625k = "type";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f136626j = null;

    /* JADX INFO: compiled from: TypeSelector.java */
    public static class a extends org.apache.tools.ant.types.w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f136627c = "file";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f136628d = "dir";

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{"file", "dir"};
        }
    }

    @Override // org.apache.tools.ant.types.selectors.g, org.apache.tools.ant.types.n0
    public void H0(org.apache.tools.ant.types.m0... m0VarArr) {
        super.H0(m0VarArr);
        if (m0VarArr != null) {
            for (org.apache.tools.ant.types.m0 m0Var : m0VarArr) {
                String strA = m0Var.a();
                if ("type".equalsIgnoreCase(strA)) {
                    a aVar = new a();
                    aVar.g(m0Var.c());
                    l2(aVar);
                } else {
                    g2("Invalid parameter " + strA);
                }
            }
        }
    }

    @Override // org.apache.tools.ant.types.selectors.g, org.apache.tools.ant.types.selectors.h, org.apache.tools.ant.types.selectors.v
    public boolean P0(File file, String str, File file2) {
        i2();
        return file2.isDirectory() ? this.f136626j.equals("dir") : this.f136626j.equals("file");
    }

    @Override // org.apache.tools.ant.types.selectors.h
    public void j2() {
        if (this.f136626j == null) {
            g2("The type attribute is required");
        }
    }

    public void l2(a aVar) {
        this.f136626j = aVar.d();
    }

    @Override // org.apache.tools.ant.types.s
    public String toString() {
        return "{typeselector type: " + this.f136626j + z5.g.f141884d;
    }
}
