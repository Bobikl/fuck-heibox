package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: compiled from: Flags.java */
/* JADX INFO: loaded from: classes5.dex */
public class b {
    public static final C1167b A;
    public static final C1167b B;
    public static final C1167b C;
    public static final C1167b D;
    public static final C1167b E;
    public static final C1167b F;
    public static final C1167b G;
    public static final C1167b H;
    public static final C1167b I;
    public static final C1167b J;
    public static final C1167b K;
    public static final C1167b L;
    public static final C1167b M;
    public static final C1167b N;
    public static final C1167b O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1167b f127034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1167b f127035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1167b f127036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d<ProtoBuf.Visibility> f127037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d<ProtoBuf.Modality> f127038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d<ProtoBuf.Class.Kind> f127039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1167b f127040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C1167b f127041h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C1167b f127042i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C1167b f127043j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C1167b f127044k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C1167b f127045l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C1167b f127046m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C1167b f127047n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d<ProtoBuf.MemberKind> f127048o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C1167b f127049p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C1167b f127050q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C1167b f127051r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C1167b f127052s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C1167b f127053t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C1167b f127054u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C1167b f127055v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C1167b f127056w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C1167b f127057x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C1167b f127058y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C1167b f127059z;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Flags.java */
    public static class C1167b extends d<Boolean> {
        public C1167b(int i10) {
            super(i10, 1);
        }

        private static /* synthetic */ void f(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"));
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d
        @dl.d
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Boolean d(int i10) {
            Boolean boolValueOf = Boolean.valueOf((i10 & (1 << this.f127061a)) != 0);
            if (boolValueOf == null) {
                f(0);
            }
            return boolValueOf;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public int e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f127061a;
            }
            return 0;
        }
    }

    /* JADX INFO: compiled from: Flags.java */
    public static class c<E extends kotlin.reflect.jvm.internal.impl.protobuf.h.a> extends d<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final E[] f127060c;

        public c(int i10, E[] eArr) {
            super(i10, g(eArr));
            this.f127060c = eArr;
        }

        private static /* synthetic */ void f(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
        }

        private static <E> int g(@dl.d E[] eArr) {
            if (eArr == null) {
                f(0);
            }
            int length = eArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i10 = 31; i10 >= 0; i10--) {
                if (((1 << i10) & length) != 0) {
                    return i10 + 1;
                }
            }
            throw new IllegalStateException("Empty enum: " + eArr.getClass());
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d
        @dl.e
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public E d(int i10) {
            int i11 = (1 << this.f127062b) - 1;
            int i12 = this.f127061a;
            int i13 = (i10 & (i11 << i12)) >> i12;
            for (E e10 : this.f127060c) {
                if (e10.getNumber() == i13) {
                    return e10;
                }
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public int e(E e10) {
            return e10.getNumber() << this.f127061a;
        }
    }

    /* JADX INFO: compiled from: Flags.java */
    public static abstract class d<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f127061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f127062b;

        private d(int i10, int i11) {
            this.f127061a = i10;
            this.f127062b = i11;
        }

        /* JADX WARN: Incorrect types in method signature: <E::Lkotlin/reflect/jvm/internal/impl/protobuf/h$a;>(Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/b$d<*>;[TE;)Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/b$d<TE;>; */
        public static d a(d dVar, kotlin.reflect.jvm.internal.impl.protobuf.h.a[] aVarArr) {
            return new c(dVar.f127061a + dVar.f127062b, aVarArr);
        }

        public static C1167b b(d<?> dVar) {
            return new C1167b(dVar.f127061a + dVar.f127062b);
        }

        public static C1167b c() {
            return new C1167b(0);
        }

        public abstract E d(int i10);

        public abstract int e(E e10);
    }

    static {
        C1167b c1167bC = d.c();
        f127034a = c1167bC;
        f127035b = d.b(c1167bC);
        C1167b c1167bC2 = d.c();
        f127036c = c1167bC2;
        d<ProtoBuf.Visibility> dVarA = d.a(c1167bC2, ProtoBuf.Visibility.values());
        f127037d = dVarA;
        d<ProtoBuf.Modality> dVarA2 = d.a(dVarA, ProtoBuf.Modality.values());
        f127038e = dVarA2;
        d<ProtoBuf.Class.Kind> dVarA3 = d.a(dVarA2, ProtoBuf.Class.Kind.values());
        f127039f = dVarA3;
        C1167b c1167bB = d.b(dVarA3);
        f127040g = c1167bB;
        C1167b c1167bB2 = d.b(c1167bB);
        f127041h = c1167bB2;
        C1167b c1167bB3 = d.b(c1167bB2);
        f127042i = c1167bB3;
        C1167b c1167bB4 = d.b(c1167bB3);
        f127043j = c1167bB4;
        C1167b c1167bB5 = d.b(c1167bB4);
        f127044k = c1167bB5;
        f127045l = d.b(c1167bB5);
        C1167b c1167bB6 = d.b(dVarA);
        f127046m = c1167bB6;
        f127047n = d.b(c1167bB6);
        d<ProtoBuf.MemberKind> dVarA4 = d.a(dVarA2, ProtoBuf.MemberKind.values());
        f127048o = dVarA4;
        C1167b c1167bB7 = d.b(dVarA4);
        f127049p = c1167bB7;
        C1167b c1167bB8 = d.b(c1167bB7);
        f127050q = c1167bB8;
        C1167b c1167bB9 = d.b(c1167bB8);
        f127051r = c1167bB9;
        C1167b c1167bB10 = d.b(c1167bB9);
        f127052s = c1167bB10;
        C1167b c1167bB11 = d.b(c1167bB10);
        f127053t = c1167bB11;
        C1167b c1167bB12 = d.b(c1167bB11);
        f127054u = c1167bB12;
        C1167b c1167bB13 = d.b(c1167bB12);
        f127055v = c1167bB13;
        f127056w = d.b(c1167bB13);
        C1167b c1167bB14 = d.b(dVarA4);
        f127057x = c1167bB14;
        C1167b c1167bB15 = d.b(c1167bB14);
        f127058y = c1167bB15;
        C1167b c1167bB16 = d.b(c1167bB15);
        f127059z = c1167bB16;
        C1167b c1167bB17 = d.b(c1167bB16);
        A = c1167bB17;
        C1167b c1167bB18 = d.b(c1167bB17);
        B = c1167bB18;
        C1167b c1167bB19 = d.b(c1167bB18);
        C = c1167bB19;
        C1167b c1167bB20 = d.b(c1167bB19);
        D = c1167bB20;
        C1167b c1167bB21 = d.b(c1167bB20);
        E = c1167bB21;
        F = d.b(c1167bB21);
        C1167b c1167bB22 = d.b(c1167bC2);
        G = c1167bB22;
        C1167b c1167bB23 = d.b(c1167bB22);
        H = c1167bB23;
        I = d.b(c1167bB23);
        C1167b c1167bB24 = d.b(dVarA2);
        J = c1167bB24;
        C1167b c1167bB25 = d.b(c1167bB24);
        K = c1167bB25;
        L = d.b(c1167bB25);
        C1167b c1167bC3 = d.c();
        M = c1167bC3;
        N = d.b(c1167bC3);
        O = d.c();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    /* JADX WARN: Code duplicated, block: B:18:0x002b  */
    private static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "modality";
        } else if (i10 == 2) {
            objArr[0] = "kind";
        } else if (i10 == 5) {
            objArr[0] = "modality";
        } else if (i10 == 6) {
            objArr[0] = "memberKind";
        } else if (i10 == 8) {
            objArr[0] = "modality";
        } else if (i10 == 9) {
            objArr[0] = "memberKind";
        } else if (i10 != 11) {
            objArr[0] = "visibility";
        } else {
            objArr[0] = "modality";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
        switch (i10) {
            case 3:
                objArr[2] = "getConstructorFlags";
                break;
            case 4:
            case 5:
            case 6:
                objArr[2] = "getFunctionFlags";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "getPropertyFlags";
                break;
            case 10:
            case 11:
                objArr[2] = "getAccessorFlags";
                break;
            default:
                objArr[2] = "getClassFlags";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static int b(boolean z10, @dl.d ProtoBuf.Visibility visibility, @dl.d ProtoBuf.Modality modality, boolean z11, boolean z12, boolean z13) {
        if (visibility == null) {
            a(10);
        }
        if (modality == null) {
            a(11);
        }
        return f127036c.e(Boolean.valueOf(z10)) | f127038e.e(modality) | f127037d.e(visibility) | J.e(Boolean.valueOf(z11)) | K.e(Boolean.valueOf(z12)) | L.e(Boolean.valueOf(z13));
    }
}
