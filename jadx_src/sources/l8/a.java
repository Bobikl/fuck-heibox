package l8;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: ImageInfoExtractor.java */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f130909a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f130910b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f130911c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f130912d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f130913e = 2;

    private a() {
    }

    public static int a(File file) {
        int i10 = 0;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[21];
            int i11 = fileInputStream.read(bArr);
            if (i11 >= 3 && c(bArr)) {
                i10 = 1;
            } else if (i11 >= 12 && d(bArr)) {
                i10 = (i11 < 17 || !b(bArr) || (bArr[20] & 2) == 0) ? 3 : 2;
            }
            fileInputStream.close();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        return i10;
    }

    private static boolean b(byte[] bArr) {
        return bArr[12] == 86 && bArr[13] == 80 && bArr[14] == 56 && bArr[15] == 88;
    }

    private static boolean c(byte[] bArr) {
        return bArr[0] == 71 && bArr[1] == 73 && bArr[2] == 70;
    }

    private static boolean d(byte[] bArr) {
        return bArr[0] == 82 && bArr[1] == 73 && bArr[2] == 70 && bArr[3] == 70 && bArr[8] == 87 && bArr[9] == 69 && bArr[10] == 66 && bArr[11] == 80;
    }

    public static String e(int i10) {
        if (i10 == 1) {
            return "GIF";
        }
        if (i10 != 2) {
            return i10 != 3 ? "STILL_IMAGE" : "STILL_WEBP";
        }
        return "ANIMATED_WEBP";
    }
}
