package com.google.android.gms.internal.common;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import org.jspecify.nullness.NullMarked;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@NullMarked
public final class z {
    @s9.a
    public static int a(int i10, int i11, String str) {
        String strA;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            strA = f0.a("%s (%s) must not be negative", UCropPlusActivity.ARG_INDEX, Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                throw new IllegalArgumentException("negative size: " + i11);
            }
            strA = f0.a("%s (%s) must be less than size (%s)", UCropPlusActivity.ARG_INDEX, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(strA);
    }

    @s9.a
    public static int b(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(d(i10, i11, UCropPlusActivity.ARG_INDEX));
        }
        return i10;
    }

    public static void c(int i10, int i11, int i12) {
        String strD;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strD = d(i10, i12, "start index");
            } else {
                strD = (i11 < 0 || i11 > i12) ? d(i11, i12, "end index") : f0.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strD);
        }
    }

    private static String d(int i10, int i11, String str) {
        if (i10 < 0) {
            return f0.a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return f0.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }
}
