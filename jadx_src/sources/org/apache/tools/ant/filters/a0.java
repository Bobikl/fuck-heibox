package org.apache.tools.ant.filters;

/* JADX INFO: compiled from: UniqFilter.java */
/* JADX INFO: loaded from: classes5.dex */
public class a0 extends z.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f133148f = null;

    @Override // org.apache.tools.ant.filters.z.f
    public String A0(String str) {
        String str2 = this.f133148f;
        if (str2 != null && str2.equals(str)) {
            return null;
        }
        this.f133148f = str;
        return str;
    }
}
