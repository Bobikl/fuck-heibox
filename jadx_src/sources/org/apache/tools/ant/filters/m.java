package org.apache.tools.ant.filters;

import org.apache.tools.ant.util.c1;

/* JADX INFO: compiled from: Native2AsciiFilter.java */
/* JADX INFO: loaded from: classes5.dex */
public class m extends z.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f133230f;

    @Override // org.apache.tools.ant.filters.z.f
    public String A0(String str) {
        return this.f133230f ? c1.a(str) : c1.b(str);
    }

    public void D1(boolean z10) {
        this.f133230f = z10;
    }
}
