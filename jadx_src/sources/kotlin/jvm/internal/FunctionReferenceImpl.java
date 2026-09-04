package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes5.dex */
public class FunctionReferenceImpl extends FunctionReference {
    @kotlin.u0(version = "1.4")
    public FunctionReferenceImpl(int i10, Class cls, String str, String str2, int i11) {
        super(i10, CallableReference.NO_RECEIVER, cls, str, str2, i11);
    }

    @kotlin.u0(version = "1.4")
    public FunctionReferenceImpl(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(i10, obj, cls, str, str2, i11);
    }

    public FunctionReferenceImpl(int i10, kotlin.reflect.h hVar, String str, String str2) {
        super(i10, CallableReference.NO_RECEIVER, ((r) hVar).i(), str, str2, !(hVar instanceof kotlin.reflect.d) ? 1 : 0);
    }
}
