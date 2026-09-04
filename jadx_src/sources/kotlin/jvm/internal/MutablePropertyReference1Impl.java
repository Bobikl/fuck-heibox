package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes5.dex */
public class MutablePropertyReference1Impl extends MutablePropertyReference1 {
    @kotlin.u0(version = "1.4")
    public MutablePropertyReference1Impl(Class cls, String str, String str2, int i10) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i10);
    }

    @kotlin.u0(version = "1.4")
    public MutablePropertyReference1Impl(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    public MutablePropertyReference1Impl(kotlin.reflect.h hVar, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((r) hVar).i(), str, str2, !(hVar instanceof kotlin.reflect.d) ? 1 : 0);
    }

    public void Y0(Object obj, Object obj2) {
        getSetter().call(obj, obj2);
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }
}
