package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: LazyField.java */
/* JADX INFO: loaded from: classes5.dex */
public class i extends j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n f127355e;

    /* JADX INFO: compiled from: LazyField.java */
    public static class b<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map.Entry<K, i> f127356b;

        private b(Map.Entry<K, i> entry) {
            this.f127356b = entry;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f127356b.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            i value = this.f127356b.getValue();
            if (value == null) {
                return null;
            }
            return value.e();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof n) {
                return this.f127356b.getValue().d((n) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* JADX INFO: compiled from: LazyField.java */
    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f127357b;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f127357b = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f127357b.next();
            return next.getValue() instanceof i ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f127357b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f127357b.remove();
        }
    }

    public n e() {
        return c(this.f127355e);
    }

    public boolean equals(Object obj) {
        return e().equals(obj);
    }

    public int hashCode() {
        return e().hashCode();
    }

    public String toString() {
        return e().toString();
    }
}
