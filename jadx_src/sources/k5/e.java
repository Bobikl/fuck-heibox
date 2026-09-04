package k5;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f124448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f124449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f124450c;

        public b() {
            this.f124448a = new int[256];
        }
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        b bVar = new b();
        for (int i10 = 0; i10 < 256; i10++) {
            bVar.f124448a[i10] = i10;
        }
        bVar.f124449b = 0;
        bVar.f124450c = 0;
        int length = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 256; i12++) {
            try {
                char cCharAt = str.charAt(length);
                int[] iArr = bVar.f124448a;
                int i13 = iArr[i12];
                i11 = ((cCharAt + i13) + i11) % 256;
                iArr[i12] = iArr[i11];
                iArr[i11] = i13;
                length = (length + 1) % str.length();
            } catch (Exception unused) {
                return null;
            }
        }
        return bVar;
    }

    public static byte[] b(byte[] bArr) {
        b bVarA;
        if (bArr == null || (bVarA = a("QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK")) == null) {
            return null;
        }
        return c(bArr, bVarA);
    }

    public static byte[] c(byte[] bArr, b bVar) {
        if (bArr == null || bVar == null) {
            return null;
        }
        int i10 = bVar.f124449b;
        int i11 = bVar.f124450c;
        for (int i12 = 0; i12 < bArr.length; i12++) {
            i10 = (i10 + 1) % 256;
            int[] iArr = bVar.f124448a;
            int i13 = iArr[i10];
            i11 = (i11 + i13) % 256;
            iArr[i10] = iArr[i11];
            iArr[i11] = i13;
            int i14 = (iArr[i10] + i13) % 256;
            bArr[i12] = (byte) (iArr[i14] ^ bArr[i12]);
        }
        bVar.f124449b = i10;
        bVar.f124450c = i11;
        return bArr;
    }
}
