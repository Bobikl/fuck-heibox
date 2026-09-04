package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes5.dex */
public class PropertyReference1Impl extends PropertyReference1 {
    @kotlin.u0(version = "1.4")
    public PropertyReference1Impl(Class cls, String str, String str2, int i10) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i10);
    }

    @kotlin.u0(version = "1.4")
    public PropertyReference1Impl(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    public PropertyReference1Impl(kotlin.reflect.h hVar, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((r) hVar).i(), str, str2, !(hVar instanceof kotlin.reflect.d) ? 1 : 0);
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }
}
