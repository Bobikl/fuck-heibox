package org.jsoup.select;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public class Selector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f137997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final org.jsoup.nodes.f f137998b;

    public static class SelectorParseException extends IllegalStateException {
        public SelectorParseException(String str, Object... objArr) {
            super(String.format(str, objArr));
        }
    }

    private Selector(String str, org.jsoup.nodes.f fVar) {
        org.jsoup.helper.d.j(str);
        String strTrim = str.trim();
        org.jsoup.helper.d.h(strTrim);
        org.jsoup.helper.d.j(fVar);
        this.f137997a = g.s(strTrim);
        this.f137998b = fVar;
    }

    static c a(Collection<org.jsoup.nodes.f> collection, Collection<org.jsoup.nodes.f> collection2) {
        c cVar = new c();
        for (org.jsoup.nodes.f fVar : collection) {
            boolean z10 = false;
            Iterator<org.jsoup.nodes.f> it = collection2.iterator();
            while (it.hasNext()) {
                if (fVar.equals(it.next())) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                cVar.add(fVar);
            }
        }
        return cVar;
    }

    private c b() {
        return a.a(this.f137997a, this.f137998b);
    }

    public static c c(String str, Iterable<org.jsoup.nodes.f> iterable) {
        org.jsoup.helper.d.h(str);
        org.jsoup.helper.d.j(iterable);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<org.jsoup.nodes.f> it = iterable.iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(d(str, it.next()));
        }
        return new c(linkedHashSet);
    }

    public static c d(String str, org.jsoup.nodes.f fVar) {
        return new Selector(str, fVar).b();
    }
}
