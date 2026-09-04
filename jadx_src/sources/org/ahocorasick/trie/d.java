package org.ahocorasick.trie;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: compiled from: State.java */
/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f132789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f132790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<Character, d> f132791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f132792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Set<String> f132793e;

    public d() {
        this(0);
    }

    public d(int i10) {
        this.f132791c = new HashMap();
        this.f132792d = null;
        this.f132793e = null;
        this.f132789a = i10;
        this.f132790b = i10 == 0 ? this : null;
    }

    private d j(Character ch2, boolean z10) {
        d dVar;
        d dVar2 = this.f132791c.get(ch2);
        return (z10 || dVar2 != null || (dVar = this.f132790b) == null) ? dVar2 : dVar;
    }

    public void a(String str) {
        if (this.f132793e == null) {
            this.f132793e = new TreeSet();
        }
        this.f132793e.add(str);
    }

    public void b(Collection<String> collection) {
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public d c(Character ch2) {
        d dVarK = k(ch2);
        if (dVarK != null) {
            return dVarK;
        }
        d dVar = new d(this.f132789a + 1);
        this.f132791c.put(ch2, dVar);
        return dVar;
    }

    public Collection<String> d() {
        Set<String> set = this.f132793e;
        return set == null ? Collections.emptyList() : set;
    }

    public d e() {
        return this.f132792d;
    }

    public int f() {
        return this.f132789a;
    }

    public Collection<d> g() {
        return this.f132791c.values();
    }

    public Collection<Character> h() {
        return this.f132791c.keySet();
    }

    public d i(Character ch2) {
        return j(ch2, false);
    }

    public d k(Character ch2) {
        return j(ch2, true);
    }

    public void l(d dVar) {
        this.f132792d = dVar;
    }
}
