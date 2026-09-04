package org.jsoup.nodes;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: Attributes.java */
/* JADX INFO: loaded from: classes5.dex */
public class b implements Iterable<org.jsoup.nodes.a>, Cloneable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final String f137881c = "data-";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinkedHashMap<String, org.jsoup.nodes.a> f137882b = null;

    /* JADX INFO: renamed from: org.jsoup.nodes.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Attributes.java */
    public class C1244b extends AbstractMap<String, String> {

        /* JADX INFO: renamed from: org.jsoup.nodes.b$b$a */
        /* JADX INFO: compiled from: Attributes.java */
        public class a implements Iterator<Map.Entry<String, String>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Iterator<org.jsoup.nodes.a> f137884b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private org.jsoup.nodes.a f137885c;

            private a() {
                this.f137884b = b.this.f137882b.values().iterator();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<String, String> next() {
                return new org.jsoup.nodes.a(this.f137885c.getKey().substring(5), this.f137885c.getValue());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                while (this.f137884b.hasNext()) {
                    org.jsoup.nodes.a next = this.f137884b.next();
                    this.f137885c = next;
                    if (next.g()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // java.util.Iterator
            public void remove() {
                b.this.f137882b.remove(this.f137885c.getKey());
            }
        }

        /* JADX INFO: renamed from: org.jsoup.nodes.b$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Attributes.java */
        public class C1245b extends AbstractSet<Map.Entry<String, String>> {
            private C1245b() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<String, String>> iterator() {
                return new a();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                int i10 = 0;
                while (new a().hasNext()) {
                    i10++;
                }
                return i10;
            }
        }

        private C1244b() {
            if (b.this.f137882b == null) {
                b.this.f137882b = new LinkedHashMap(2);
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String put(String str, String str2) {
            String strJ = b.j(str);
            String value = b.this.o(strJ) ? ((org.jsoup.nodes.a) b.this.f137882b.get(strJ)).getValue() : null;
            b.this.f137882b.put(strJ, new org.jsoup.nodes.a(strJ, str2));
            return value;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<String, String>> entrySet() {
            return new C1245b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String j(String str) {
        return f137881c + str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        LinkedHashMap<String, org.jsoup.nodes.a> linkedHashMap = this.f137882b;
        LinkedHashMap<String, org.jsoup.nodes.a> linkedHashMap2 = ((b) obj).f137882b;
        return linkedHashMap == null ? linkedHashMap2 == null : linkedHashMap.equals(linkedHashMap2);
    }

    public void g(b bVar) {
        if (bVar.size() == 0) {
            return;
        }
        if (this.f137882b == null) {
            this.f137882b = new LinkedHashMap<>(bVar.size());
        }
        this.f137882b.putAll(bVar.f137882b);
    }

    public List<org.jsoup.nodes.a> h() {
        if (this.f137882b == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.f137882b.size());
        Iterator<Map.Entry<String, org.jsoup.nodes.a>> it = this.f137882b.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int hashCode() {
        LinkedHashMap<String, org.jsoup.nodes.a> linkedHashMap = this.f137882b;
        if (linkedHashMap != null) {
            return linkedHashMap.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public b clone() {
        if (this.f137882b == null) {
            return new b();
        }
        try {
            b bVar = (b) super.clone();
            bVar.f137882b = new LinkedHashMap<>(this.f137882b.size());
            for (org.jsoup.nodes.a aVar : this) {
                bVar.f137882b.put(aVar.getKey(), aVar.clone());
            }
            return bVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<org.jsoup.nodes.a> iterator() {
        return h().iterator();
    }

    public Map<String, String> l() {
        return new C1244b();
    }

    public String m(String str) {
        org.jsoup.nodes.a aVar;
        org.jsoup.helper.d.h(str);
        LinkedHashMap<String, org.jsoup.nodes.a> linkedHashMap = this.f137882b;
        return (linkedHashMap == null || (aVar = linkedHashMap.get(str.toLowerCase())) == null) ? "" : aVar.getValue();
    }

    public boolean o(String str) {
        LinkedHashMap<String, org.jsoup.nodes.a> linkedHashMap = this.f137882b;
        return linkedHashMap != null && linkedHashMap.containsKey(str.toLowerCase());
    }

    public String q() {
        StringBuilder sb2 = new StringBuilder();
        s(sb2, new Document("").Z1());
        return sb2.toString();
    }

    void s(StringBuilder sb2, Document.a aVar) {
        LinkedHashMap<String, org.jsoup.nodes.a> linkedHashMap = this.f137882b;
        if (linkedHashMap == null) {
            return;
        }
        Iterator<Map.Entry<String, org.jsoup.nodes.a>> it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            org.jsoup.nodes.a value = it.next().getValue();
            sb2.append(" ");
            value.f(sb2, aVar);
        }
    }

    public int size() {
        LinkedHashMap<String, org.jsoup.nodes.a> linkedHashMap = this.f137882b;
        if (linkedHashMap == null) {
            return 0;
        }
        return linkedHashMap.size();
    }

    public void t(String str, String str2) {
        u(new org.jsoup.nodes.a(str, str2));
    }

    public String toString() {
        return q();
    }

    public void u(org.jsoup.nodes.a aVar) {
        org.jsoup.helper.d.j(aVar);
        if (this.f137882b == null) {
            this.f137882b = new LinkedHashMap<>(2);
        }
        this.f137882b.put(aVar.getKey(), aVar);
    }

    public void v(String str) {
        org.jsoup.helper.d.h(str);
        LinkedHashMap<String, org.jsoup.nodes.a> linkedHashMap = this.f137882b;
        if (linkedHashMap == null) {
            return;
        }
        linkedHashMap.remove(str.toLowerCase());
    }
}
