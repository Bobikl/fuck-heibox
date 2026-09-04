package com.tekartik.sqflite;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: DatabaseWorkerPool.java */
/* JADX INFO: loaded from: classes4.dex */
public class s implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f98703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f98704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f98705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedList<l> f98706d = new LinkedList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<n> f98707e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set<n> f98708f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<Integer, n> f98709g = new HashMap();

    s(String str, int i10, int i11) {
        this.f98703a = str;
        this.f98704b = i10;
        this.f98705c = i11;
    }

    private synchronized l f(n nVar) {
        l next;
        n nVar2;
        ListIterator<l> listIterator = this.f98706d.listIterator();
        do {
            if (!listIterator.hasNext()) {
                return null;
            }
            next = listIterator.next();
            nVar2 = next.a() != null ? this.f98709g.get(next.a()) : null;
            if (nVar2 == null) {
                break;
            }
        } while (nVar2 != nVar);
        listIterator.remove();
        return next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public synchronized void g(n nVar) {
        HashSet hashSet = new HashSet(this.f98707e);
        this.f98708f.remove(nVar);
        this.f98707e.add(nVar);
        if (!nVar.b() && nVar.d() != null) {
            this.f98709g.remove(nVar.d());
        }
        i(nVar);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            i((n) it.next());
        }
    }

    private synchronized void i(n nVar) {
        l lVarF = f(nVar);
        if (lVarF != null) {
            this.f98708f.add(nVar);
            this.f98707e.remove(nVar);
            if (lVarF.a() != null) {
                this.f98709g.put(lVarF.a(), nVar);
            }
            nVar.e(lVarF);
        }
    }

    @Override // com.tekartik.sqflite.p
    public synchronized void a(l lVar) {
        this.f98706d.add(lVar);
        Iterator it = new HashSet(this.f98707e).iterator();
        while (it.hasNext()) {
            i((n) it.next());
        }
    }

    @Override // com.tekartik.sqflite.p
    public synchronized void b() {
        Iterator<n> it = this.f98707e.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
        Iterator<n> it2 = this.f98708f.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
    }

    @Override // com.tekartik.sqflite.p
    public /* synthetic */ void c(j jVar, Runnable runnable) {
        o.a(this, jVar, runnable);
    }

    protected n e(String str, int i10) {
        return new n(str, i10);
    }

    @Override // com.tekartik.sqflite.p
    public synchronized void start() {
        for (int i10 = 0; i10 < this.f98704b; i10++) {
            final n nVarE = e(this.f98703a + i10, this.f98705c);
            nVarE.g(new Runnable() { // from class: com.tekartik.sqflite.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f98701b.g(nVarE);
                }
            });
            this.f98707e.add(nVarE);
        }
    }
}
