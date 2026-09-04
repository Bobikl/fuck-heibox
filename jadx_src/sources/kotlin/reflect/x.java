package kotlin.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.q
public final class x implements WildcardType, u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final a f128332d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final x f128333e = new x(null, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final Type f128334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final Type f128335c;

    /* JADX INFO: compiled from: TypesJVM.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final x a() {
            return x.f128333e;
        }
    }

    public x(@dl.e Type type, @dl.e Type type2) {
        this.f128334b = type;
        this.f128335c = type2;
    }

    public boolean equals(@dl.e Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    @dl.d
    public Type[] getLowerBounds() {
        Type type = this.f128335c;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.u
    @dl.d
    public String getTypeName() {
        if (this.f128335c != null) {
            return "? super " + TypesJVMKt.j(this.f128335c);
        }
        Type type = this.f128334b;
        if (type == null || f0.g(type, Object.class)) {
            return "?";
        }
        return "? extends " + TypesJVMKt.j(this.f128334b);
    }

    @Override // java.lang.reflect.WildcardType
    @dl.d
    public Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Type type = this.f128334b;
        if (type == null) {
            type = Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    @dl.d
    public String toString() {
        return getTypeName();
    }
}
