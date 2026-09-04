package org.jsoup.select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: Elements.java */
/* JADX INFO: loaded from: classes5.dex */
public class c implements List<org.jsoup.nodes.f>, Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<org.jsoup.nodes.f> f138003b;

    public c() {
        this.f138003b = new ArrayList();
    }

    public c(int i10) {
        this.f138003b = new ArrayList(i10);
    }

    public c(Collection<org.jsoup.nodes.f> collection) {
        this.f138003b = new ArrayList(collection);
    }

    public c(List<org.jsoup.nodes.f> list) {
        this.f138003b = list;
    }

    public c(org.jsoup.nodes.f... fVarArr) {
        this((List<org.jsoup.nodes.f>) Arrays.asList(fVarArr));
    }

    public boolean B(String str) {
        return !T(str).isEmpty();
    }

    public org.jsoup.nodes.f D() {
        if (this.f138003b.isEmpty()) {
            return null;
        }
        List<org.jsoup.nodes.f> list = this.f138003b;
        return list.get(list.size() - 1);
    }

    public c E(String str) {
        return Selector.a(this, Selector.c(str, this));
    }

    public String F() {
        StringBuilder sb2 = new StringBuilder();
        for (org.jsoup.nodes.f fVar : this.f138003b) {
            if (sb2.length() != 0) {
                sb2.append("\n");
            }
            sb2.append(fVar.z());
        }
        return sb2.toString();
    }

    public c G() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<org.jsoup.nodes.f> it = this.f138003b.iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(it.next().t1());
        }
        return new c(linkedHashSet);
    }

    public c H(String str) {
        Iterator<org.jsoup.nodes.f> it = this.f138003b.iterator();
        while (it.hasNext()) {
            it.next().u1(str);
        }
        return this;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public org.jsoup.nodes.f remove(int i10) {
        return this.f138003b.remove(i10);
    }

    public c Q() {
        Iterator<org.jsoup.nodes.f> it = this.f138003b.iterator();
        while (it.hasNext()) {
            it.next().J();
        }
        return this;
    }

    public c R(String str) {
        Iterator<org.jsoup.nodes.f> it = this.f138003b.iterator();
        while (it.hasNext()) {
            it.next().K(str);
        }
        return this;
    }

    public c S(String str) {
        Iterator<org.jsoup.nodes.f> it = this.f138003b.iterator();
        while (it.hasNext()) {
            it.next().B1(str);
        }
        return this;
    }

    public c T(String str) {
        return Selector.c(str, this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public org.jsoup.nodes.f set(int i10, org.jsoup.nodes.f fVar) {
        return this.f138003b.set(i10, fVar);
    }

    public c V(String str) {
        Iterator<org.jsoup.nodes.f> it = this.f138003b.iterator();
        while (it.hasNext()) {
            it.next().G1(str);
        }
        return this;
    }

    public String X() {
        StringBuilder sb2 = new StringBuilder();
        for (org.jsoup.nodes.f fVar : this.f138003b) {
            if (sb2.length() != 0) {
                sb2.append(" ");
            }
            sb2.append(fVar.H1());
        }
        return sb2.toString();
    }

    public c Y(String str) {
        Iterator<org.jsoup.nodes.f> it = this.f138003b.iterator();
        while (it.hasNext()) {
            it.next().K1(str);
        }
        return this;
    }

    public c Z(f fVar) {
        org.jsoup.helper.d.j(fVar);
        e eVar = new e(fVar);
        Iterator<org.jsoup.nodes.f> it = this.f138003b.iterator();
        while (it.hasNext()) {
            eVar.a(it.next());
        }
        return this;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(int i10, org.jsoup.nodes.f fVar) {
        this.f138003b.add(i10, fVar);
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends org.jsoup.nodes.f> collection) {
        return this.f138003b.addAll(i10, collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends org.jsoup.nodes.f> collection) {
        return this.f138003b.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean add(org.jsoup.nodes.f fVar) {
        return this.f138003b.add(fVar);
    }

    public c b0() {
        Iterator<org.jsoup.nodes.f> it = this.f138003b.iterator();
        while (it.hasNext()) {
            it.next().Y();
        }
        return this;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f138003b.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f138003b.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f138003b.containsAll(collection);
    }

    public String d0() {
        return size() > 0 ? s().L1() : "";
    }

    public c e(String str) {
        Iterator<org.jsoup.nodes.f> it = this.f138003b.iterator();
        while (it.hasNext()) {
            it.next().e0(str);
        }
        return this;
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return this.f138003b.equals(obj);
    }

    public c g(String str) {
        Iterator<org.jsoup.nodes.f> it = this.f138003b.iterator();
        while (it.hasNext()) {
            it.next().e(str);
        }
        return this;
    }

    public c h(String str) {
        Iterator<org.jsoup.nodes.f> it = this.f138003b.iterator();
        while (it.hasNext()) {
            it.next().h0(str);
        }
        return this;
    }

    public c h0(String str) {
        Iterator<org.jsoup.nodes.f> it = this.f138003b.iterator();
        while (it.hasNext()) {
            it.next().N1(str);
        }
        return this;
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f138003b.hashCode();
    }

    public String i(String str) {
        for (org.jsoup.nodes.f fVar : this.f138003b) {
            if (fVar.v(str)) {
                return fVar.g(str);
            }
        }
        return "";
    }

    public c i0(String str) {
        org.jsoup.helper.d.h(str);
        Iterator<org.jsoup.nodes.f> it = this.f138003b.iterator();
        while (it.hasNext()) {
            it.next().Z(str);
        }
        return this;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f138003b.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f138003b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<org.jsoup.nodes.f> iterator() {
        return this.f138003b.iterator();
    }

    public c j(String str, String str2) {
        Iterator<org.jsoup.nodes.f> it = this.f138003b.iterator();
        while (it.hasNext()) {
            it.next().h(str, str2);
        }
        return this;
    }

    public c l(String str) {
        Iterator<org.jsoup.nodes.f> it = this.f138003b.iterator();
        while (it.hasNext()) {
            it.next().k(str);
        }
        return this;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f138003b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<org.jsoup.nodes.f> listIterator() {
        return this.f138003b.listIterator();
    }

    @Override // java.util.List
    public ListIterator<org.jsoup.nodes.f> listIterator(int i10) {
        return this.f138003b.listIterator(i10);
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public c clone() {
        ArrayList arrayList = new ArrayList();
        Iterator<org.jsoup.nodes.f> it = this.f138003b.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().v0());
        }
        return new c((List<org.jsoup.nodes.f>) arrayList);
    }

    public c o() {
        Iterator<org.jsoup.nodes.f> it = this.f138003b.iterator();
        while (it.hasNext()) {
            it.next().A0();
        }
        return this;
    }

    public c q(int i10) {
        return this.f138003b.size() > i10 ? new c(get(i10)) : new c();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.f138003b.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.f138003b.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.f138003b.retainAll(collection);
    }

    public org.jsoup.nodes.f s() {
        if (this.f138003b.isEmpty()) {
            return null;
        }
        return this.f138003b.get(0);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f138003b.size();
    }

    @Override // java.util.List
    public List<org.jsoup.nodes.f> subList(int i10, int i11) {
        return this.f138003b.subList(i10, i11);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public org.jsoup.nodes.f get(int i10) {
        return this.f138003b.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f138003b.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f138003b.toArray(tArr);
    }

    public String toString() {
        return F();
    }

    public boolean u(String str) {
        Iterator<org.jsoup.nodes.f> it = this.f138003b.iterator();
        while (it.hasNext()) {
            if (it.next().v(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean v(String str) {
        Iterator<org.jsoup.nodes.f> it = this.f138003b.iterator();
        while (it.hasNext()) {
            if (it.next().d1(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean w() {
        Iterator<org.jsoup.nodes.f> it = this.f138003b.iterator();
        while (it.hasNext()) {
            if (it.next().e1()) {
                return true;
            }
        }
        return false;
    }

    public String x() {
        StringBuilder sb2 = new StringBuilder();
        for (org.jsoup.nodes.f fVar : this.f138003b) {
            if (sb2.length() != 0) {
                sb2.append("\n");
            }
            sb2.append(fVar.g1());
        }
        return sb2.toString();
    }

    public c y(String str) {
        Iterator<org.jsoup.nodes.f> it = this.f138003b.iterator();
        while (it.hasNext()) {
            it.next().i1(str);
        }
        return this;
    }
}
