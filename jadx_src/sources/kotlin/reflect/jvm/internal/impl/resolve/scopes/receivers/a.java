package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.types.d0;

/* JADX INFO: compiled from: AbstractReceiverValue.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final d0 f127642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f127643b;

    public a(@dl.d d0 d0Var, @dl.e h hVar) {
        if (d0Var == null) {
            c(0);
        }
        this.f127642a = d0Var;
        this.f127643b = hVar == null ? this : hVar;
    }

    private static /* synthetic */ void c(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i10 == 1) {
            objArr[1] = "getType";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 1 && i10 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h
    @dl.d
    public d0 getType() {
        d0 d0Var = this.f127642a;
        if (d0Var == null) {
            c(1);
        }
        return d0Var;
    }
}
