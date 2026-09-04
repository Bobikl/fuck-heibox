package org.apache.tools.ant.property;

import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import org.apache.tools.ant.p2;

/* JADX INFO: compiled from: LocalPropertyStack.java */
/* JADX INFO: loaded from: classes5.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Deque<Map<String, Object>> f133578a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f133579b = new Object();

    private Map<String, Object> i(String str) {
        synchronized (this.f133579b) {
            for (Map<String, Object> map : this.f133578a) {
                if (map.get(str) != null) {
                    return map;
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ HashSet k() {
        return new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ HashSet m(HashSet hashSet, HashSet hashSet2) {
        hashSet.addAll(hashSet2);
        return hashSet;
    }

    public void d(String str) {
        synchronized (this.f133579b) {
            Map<String, Object> mapPeek = this.f133578a.peek();
            if (mapPeek != null) {
                mapPeek.put(str, i.f133580a);
            }
        }
    }

    public h e() {
        h hVar;
        synchronized (this.f133579b) {
            hVar = new h();
            hVar.f133578a.addAll(this.f133578a);
        }
        return hVar;
    }

    public void f() {
        synchronized (this.f133579b) {
            this.f133578a.addFirst(new ConcurrentHashMap());
        }
    }

    public Object g(String str, p2 p2Var) {
        synchronized (this.f133579b) {
            Iterator<Map<String, Object>> it = this.f133578a.iterator();
            while (it.hasNext()) {
                Object obj = it.next().get(str);
                if (obj != null) {
                    return obj;
                }
            }
            return null;
        }
    }

    public void h() {
        synchronized (this.f133579b) {
            this.f133578a.removeFirst().clear();
        }
    }

    public Set<String> j() {
        return Collections.unmodifiableSet((Set) this.f133578a.stream().map(new Function() { // from class: org.apache.tools.ant.property.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Map) obj).keySet();
            }
        }).collect(Collector.of(new Supplier() { // from class: org.apache.tools.ant.property.e
            @Override // java.util.function.Supplier
            public final Object get() {
                return h.k();
            }
        }, new BiConsumer() { // from class: org.apache.tools.ant.property.f
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((HashSet) obj).addAll((Set) obj2);
            }
        }, new BinaryOperator() { // from class: org.apache.tools.ant.property.g
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return h.m((HashSet) obj, (HashSet) obj2);
            }
        }, Collector.Characteristics.UNORDERED, Collector.Characteristics.IDENTITY_FINISH)));
    }

    public boolean n(String str, Object obj, p2 p2Var) {
        Map<String, Object> mapI = i(str);
        if (mapI == null) {
            return false;
        }
        mapI.put(str, obj);
        return true;
    }

    public boolean o(String str, Object obj, p2 p2Var) {
        Map<String, Object> mapI = i(str);
        if (mapI == null) {
            return false;
        }
        if (mapI.get(str) != i.f133580a) {
            return true;
        }
        mapI.put(str, obj);
        return true;
    }
}
