package androidx.p001datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: compiled from: MapFieldSchemaLite.java */
/* JADX INFO: loaded from: classes6.dex */
public class v1 implements u1 {
    v1() {
    }

    private static <K, V> int i(int i10, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        t1 t1Var = (t1) obj2;
        int iA = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : mapFieldLite.entrySet()) {
            iA += t1Var.a(i10, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    private static <K, V> MapFieldLite<K, V> j(Object obj, Object obj2) {
        MapFieldLite<K, V> mapFieldLiteN = (MapFieldLite) obj;
        MapFieldLite<K, V> mapFieldLite = (MapFieldLite) obj2;
        if (!mapFieldLite.isEmpty()) {
            if (!mapFieldLiteN.j()) {
                mapFieldLiteN = mapFieldLiteN.n();
            }
            mapFieldLiteN.l(mapFieldLite);
        }
        return mapFieldLiteN;
    }

    @Override // androidx.p001datastore.preferences.protobuf.u1
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // androidx.p001datastore.preferences.protobuf.u1
    public t1.b<?, ?> b(Object obj) {
        return ((t1) obj).d();
    }

    @Override // androidx.p001datastore.preferences.protobuf.u1
    public Object c(Object obj) {
        ((MapFieldLite) obj).k();
        return obj;
    }

    @Override // androidx.p001datastore.preferences.protobuf.u1
    public int d(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }

    @Override // androidx.p001datastore.preferences.protobuf.u1
    public Map<?, ?> e(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.p001datastore.preferences.protobuf.u1
    public Object f(Object obj) {
        return MapFieldLite.f().n();
    }

    @Override // androidx.p001datastore.preferences.protobuf.u1
    public Map<?, ?> g(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.p001datastore.preferences.protobuf.u1
    public boolean h(Object obj) {
        return !((MapFieldLite) obj).j();
    }
}
