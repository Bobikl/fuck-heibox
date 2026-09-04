package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes5.dex */
public class MutablePropertyReference2Impl extends MutablePropertyReference2 {
    @kotlin.u0(version = "1.4")
    public MutablePropertyReference2Impl(Class cls, String str, String str2, int i10) {
        super(cls, str, str2, i10);
    }

    public MutablePropertyReference2Impl(kotlin.reflect.h hVar, String str, String str2) {
        super(((r) hVar).i(), str, str2, !(hVar instanceof kotlin.reflect.d) ? 1 : 0);
    }

    @Override // kotlin.reflect.q
    public Object Y(Object obj, Object obj2) {
        return getGetter().call(obj, obj2);
    }

    @Override // kotlin.reflect.m
    public void u0(Object obj, Object obj2, Object obj3) {
        getSetter().call(obj, obj2, obj3);
    }
}
