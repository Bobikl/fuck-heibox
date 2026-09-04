package lj;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: DefaultEmitHandler.java */
/* JADX INFO: loaded from: classes5.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<org.ahocorasick.trie.a> f131429a = new ArrayList();

    @Override // lj.b
    public void a(org.ahocorasick.trie.a aVar) {
        this.f131429a.add(aVar);
    }

    public List<org.ahocorasick.trie.a> b() {
        return this.f131429a;
    }
}
