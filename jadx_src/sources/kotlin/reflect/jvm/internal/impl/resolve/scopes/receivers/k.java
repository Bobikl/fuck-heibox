package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.types.d0;

/* JADX INFO: compiled from: TransientReceiver.java */
/* JADX INFO: loaded from: classes5.dex */
public class k extends a {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(@dl.d d0 d0Var) {
        this(d0Var, null);
        if (d0Var == null) {
            c(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private k(@dl.d d0 d0Var, @dl.e h hVar) {
        super(d0Var, hVar);
        if (d0Var == null) {
            c(1);
        }
    }

    private static /* synthetic */ void c(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i10 != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        return "{Transient} : " + getType();
    }
}
