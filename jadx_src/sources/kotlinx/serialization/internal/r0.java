package kotlinx.serialization.internal;

import java.util.Locale;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: Platform.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.t0({"SMAP\nPlatform.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.common.kt\nkotlinx/serialization/internal/InternalHexConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final r0 f130751a = new r0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final String f130752b = "0123456789ABCDEF";

    private r0() {
    }

    private final int a(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        char c11 = 'A';
        if (!('A' <= c10 && c10 < 'G')) {
            c11 = 'a';
            if (!('a' <= c10 && c10 < 'g')) {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    public static /* synthetic */ String d(r0 r0Var, byte[] bArr, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return r0Var.c(bArr, z10);
    }

    @dl.d
    public final byte[] b(@dl.d String s10) {
        kotlin.jvm.internal.f0.p(s10, "s");
        int length = s10.length();
        if (!(length % 2 == 0)) {
            throw new IllegalArgumentException("HexBinary string must be even length".toString());
        }
        byte[] bArr = new byte[length / 2];
        for (int i10 = 0; i10 < length; i10 += 2) {
            int iA = a(s10.charAt(i10));
            int i11 = i10 + 1;
            int iA2 = a(s10.charAt(i11));
            if (!((iA == -1 || iA2 == -1) ? false : true)) {
                throw new IllegalArgumentException(("Invalid hex chars: " + s10.charAt(i10) + s10.charAt(i11)).toString());
            }
            bArr[i10 / 2] = (byte) ((iA << 4) + iA2);
        }
        return bArr;
    }

    @dl.d
    public final String c(@dl.d byte[] data, boolean z10) {
        kotlin.jvm.internal.f0.p(data, "data");
        StringBuilder sb2 = new StringBuilder(data.length * 2);
        for (byte b10 : data) {
            sb2.append(f130752b.charAt((b10 >> 4) & 15));
            sb2.append(f130752b.charAt(b10 & 15));
        }
        if (!z10) {
            String string = sb2.toString();
            kotlin.jvm.internal.f0.o(string, "toString(...)");
            return string;
        }
        String string2 = sb2.toString();
        kotlin.jvm.internal.f0.o(string2, "toString(...)");
        String lowerCase = string2.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.f0.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @dl.d
    public final String e(int i10) {
        byte[] bArr = new byte[4];
        for (int i11 = 0; i11 < 4; i11++) {
            bArr[i11] = (byte) (i10 >> (24 - (i11 * 8)));
        }
        String strW5 = StringsKt__StringsKt.W5(c(bArr, true), '0');
        if (!(strW5.length() > 0)) {
            strW5 = null;
        }
        return strW5 == null ? "0" : strW5;
    }
}
