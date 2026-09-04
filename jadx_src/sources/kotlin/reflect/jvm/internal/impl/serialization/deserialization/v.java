package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: compiled from: ProtoEnumFlagsUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class v {

    /* JADX INFO: compiled from: ProtoEnumFlagsUtils.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f127916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f127917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f127918c;

        static {
            int[] iArr = new int[ProtoBuf.MemberKind.values().length];
            try {
                iArr[ProtoBuf.MemberKind.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.MemberKind.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.MemberKind.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProtoBuf.MemberKind.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f127916a = iArr;
            int[] iArr2 = new int[CallableMemberDescriptor.Kind.values().length];
            try {
                iArr2[CallableMemberDescriptor.Kind.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CallableMemberDescriptor.Kind.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CallableMemberDescriptor.Kind.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CallableMemberDescriptor.Kind.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f127917b = iArr2;
            int[] iArr3 = new int[ProtoBuf.Visibility.values().length];
            try {
                iArr3[ProtoBuf.Visibility.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ProtoBuf.Visibility.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[ProtoBuf.Visibility.PRIVATE_TO_THIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[ProtoBuf.Visibility.PROTECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[ProtoBuf.Visibility.PUBLIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[ProtoBuf.Visibility.LOCAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            f127918c = iArr3;
        }
    }

    @dl.d
    public static final kotlin.reflect.jvm.internal.impl.descriptors.s a(@dl.d u uVar, @dl.e ProtoBuf.Visibility visibility) {
        f0.p(uVar, "<this>");
        switch (visibility == null ? -1 : a.f127918c[visibility.ordinal()]) {
            case 1:
                kotlin.reflect.jvm.internal.impl.descriptors.s INTERNAL = kotlin.reflect.jvm.internal.impl.descriptors.r.f125867d;
                f0.o(INTERNAL, "INTERNAL");
                return INTERNAL;
            case 2:
                kotlin.reflect.jvm.internal.impl.descriptors.s PRIVATE = kotlin.reflect.jvm.internal.impl.descriptors.r.f125864a;
                f0.o(PRIVATE, "PRIVATE");
                return PRIVATE;
            case 3:
                kotlin.reflect.jvm.internal.impl.descriptors.s PRIVATE_TO_THIS = kotlin.reflect.jvm.internal.impl.descriptors.r.f125865b;
                f0.o(PRIVATE_TO_THIS, "PRIVATE_TO_THIS");
                return PRIVATE_TO_THIS;
            case 4:
                kotlin.reflect.jvm.internal.impl.descriptors.s PROTECTED = kotlin.reflect.jvm.internal.impl.descriptors.r.f125866c;
                f0.o(PROTECTED, "PROTECTED");
                return PROTECTED;
            case 5:
                kotlin.reflect.jvm.internal.impl.descriptors.s PUBLIC = kotlin.reflect.jvm.internal.impl.descriptors.r.f125868e;
                f0.o(PUBLIC, "PUBLIC");
                return PUBLIC;
            case 6:
                kotlin.reflect.jvm.internal.impl.descriptors.s LOCAL = kotlin.reflect.jvm.internal.impl.descriptors.r.f125869f;
                f0.o(LOCAL, "LOCAL");
                return LOCAL;
            default:
                kotlin.reflect.jvm.internal.impl.descriptors.s PRIVATE2 = kotlin.reflect.jvm.internal.impl.descriptors.r.f125864a;
                f0.o(PRIVATE2, "PRIVATE");
                return PRIVATE2;
        }
    }

    @dl.d
    public static final CallableMemberDescriptor.Kind b(@dl.d u uVar, @dl.e ProtoBuf.MemberKind memberKind) {
        f0.p(uVar, "<this>");
        int i10 = memberKind == null ? -1 : a.f127916a[memberKind.ordinal()];
        if (i10 == 1) {
            return CallableMemberDescriptor.Kind.DECLARATION;
        }
        if (i10 == 2) {
            return CallableMemberDescriptor.Kind.FAKE_OVERRIDE;
        }
        if (i10 != 3) {
            return i10 != 4 ? CallableMemberDescriptor.Kind.DECLARATION : CallableMemberDescriptor.Kind.SYNTHESIZED;
        }
        return CallableMemberDescriptor.Kind.DELEGATION;
    }
}
