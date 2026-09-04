package com.umeng.analytics;

import java.util.Locale;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Male' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public class Gender {
    public static final Gender Female;
    public static final Gender Male;
    public static final Gender Unknown;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ Gender[] f104331a;
    public int value;

    /* JADX INFO: renamed from: com.umeng.analytics.Gender$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f104332a;

        static {
            int[] iArr = new int[Gender.values().length];
            f104332a = iArr;
            try {
                iArr[Gender.Male.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f104332a[Gender.Female.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f104332a[Gender.Unknown.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        int i10 = 0;
        int i11 = 1;
        Gender gender = new Gender("Male", i10, i11) { // from class: com.umeng.analytics.Gender.1
            @Override // java.lang.Enum
            public String toString() {
                return String.format(Locale.US, "Male:%d", Integer.valueOf(this.value));
            }
        };
        Male = gender;
        int i12 = 2;
        Gender gender2 = new Gender("Female", i11, i12) { // from class: com.umeng.analytics.Gender.2
            @Override // java.lang.Enum
            public String toString() {
                return String.format(Locale.US, "Female:%d", Integer.valueOf(this.value));
            }
        };
        Female = gender2;
        Gender gender3 = new Gender("Unknown", i12, i10) { // from class: com.umeng.analytics.Gender.3
            @Override // java.lang.Enum
            public String toString() {
                return String.format(Locale.US, "Unknown:%d", Integer.valueOf(this.value));
            }
        };
        Unknown = gender3;
        f104331a = new Gender[]{gender, gender2, gender3};
    }

    private Gender(String str, int i10, int i11) {
        super(str, i10);
        this.value = i11;
    }

    public static Gender getGender(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? Unknown : Female;
        }
        return Male;
    }

    public static com.umeng.commonsdk.statistics.proto.Gender transGender(Gender gender) {
        int i10 = AnonymousClass4.f104332a[gender.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? com.umeng.commonsdk.statistics.proto.Gender.UNKNOWN : com.umeng.commonsdk.statistics.proto.Gender.FEMALE;
        }
        return com.umeng.commonsdk.statistics.proto.Gender.MALE;
    }

    public static Gender valueOf(String str) {
        return (Gender) Enum.valueOf(Gender.class, str);
    }

    public static Gender[] values() {
        return (Gender[]) f104331a.clone();
    }

    public int value() {
        return this.value;
    }
}
