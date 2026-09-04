package org.ahocorasick.trie;

/* JADX INFO: compiled from: MatchToken.java */
/* JADX INFO: loaded from: classes5.dex */
public class c extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f132788b;

    public c(String str, a aVar) {
        super(str);
        this.f132788b = aVar;
    }

    @Override // org.ahocorasick.trie.e
    public a a() {
        return this.f132788b;
    }

    @Override // org.ahocorasick.trie.e
    public boolean c() {
        return true;
    }
}
