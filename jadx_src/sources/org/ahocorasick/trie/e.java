package org.ahocorasick.trie;

/* JADX INFO: compiled from: Token.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f132794a;

    public e(String str) {
        this.f132794a = str;
    }

    public abstract a a();

    public String b() {
        return this.f132794a;
    }

    public abstract boolean c();
}
