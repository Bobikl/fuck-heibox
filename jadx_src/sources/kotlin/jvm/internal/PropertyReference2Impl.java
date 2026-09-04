package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes5.dex */
public class PropertyReference2Impl extends PropertyReference2 {
    @kotlin.u0(version = "1.4")
    public PropertyReference2Impl(Class cls, String str, String str2, int i10) {
        super(cls, str, str2, i10);
    }

    public PropertyReference2Impl(kotlin.reflect.h hVar, String str, String str2) {
        super(((r) hVar).i(), str, str2, !(hVar instanceof kotlin.reflect.d) ? 1 : 0);
    }

    @Override // kotlin.reflect.q
    public Object Y(Object obj, Object obj2) {
        return getGetter().call(obj, obj2);
    }
}
