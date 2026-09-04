package androidx.p001datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: LazyField.java */
/* JADX INFO: loaded from: classes6.dex */
public class k1 extends l1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final z1 f22496f;

    /* JADX INFO: compiled from: LazyField.java */
    public static class b<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map.Entry<K, k1> f22497b;

        private b(Map.Entry<K, k1> entry) {
            this.f22497b = entry;
        }

        public k1 a() {
            return this.f22497b.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f22497b.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            k1 value = this.f22497b.getValue();
            if (value == null) {
                return null;
            }
            return value.p();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof z1) {
                return this.f22497b.getValue().m((z1) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* JADX INFO: compiled from: LazyField.java */
    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f22498b;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f22498b = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f22498b.next();
            return next.getValue() instanceof k1 ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22498b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f22498b.remove();
        }
    }

    public k1(z1 z1Var, p0 p0Var, ByteString byteString) {
        super(p0Var, byteString);
        this.f22496f = z1Var;
    }

    @Override // androidx.p001datastore.preferences.protobuf.l1
    public boolean c() {
        return super.c() || this.f22509c == this.f22496f;
    }

    @Override // androidx.p001datastore.preferences.protobuf.l1
    public boolean equals(Object obj) {
        return p().equals(obj);
    }

    @Override // androidx.p001datastore.preferences.protobuf.l1
    public int hashCode() {
        return p().hashCode();
    }

    public z1 p() {
        return g(this.f22496f);
    }

    public String toString() {
        return p().toString();
    }
}
