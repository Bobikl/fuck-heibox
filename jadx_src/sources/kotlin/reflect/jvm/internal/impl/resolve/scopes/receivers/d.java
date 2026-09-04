package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.types.d0;

/* JADX INFO: compiled from: ExtensionReceiver.java */
/* JADX INFO: loaded from: classes5.dex */
public class d extends a implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.a f127648c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @dl.d d0 d0Var, @dl.e h hVar) {
        super(d0Var, hVar);
        if (aVar == null) {
            c(0);
        }
        if (d0Var == null) {
            c(1);
        }
        this.f127648c = aVar;
    }

    private static /* synthetic */ void c(int i10) {
        String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 2 ? 3 : 2];
        if (i10 == 1) {
            objArr[0] = "receiverType";
        } else if (i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i10 != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 == 2) {
            throw new IllegalStateException(str2);
        }
    }

    public String toString() {
        return getType() + ": Ext {" + this.f127648c + z5.g.f141884d;
    }
}
