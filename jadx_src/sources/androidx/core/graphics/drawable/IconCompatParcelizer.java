package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f20664a = versionedParcel.M(iconCompat.f20664a, 1);
        iconCompat.f20666c = versionedParcel.t(iconCompat.f20666c, 2);
        iconCompat.f20667d = versionedParcel.W(iconCompat.f20667d, 3);
        iconCompat.f20668e = versionedParcel.M(iconCompat.f20668e, 4);
        iconCompat.f20669f = versionedParcel.M(iconCompat.f20669f, 5);
        iconCompat.f20670g = (ColorStateList) versionedParcel.W(iconCompat.f20670g, 6);
        iconCompat.f20672i = versionedParcel.d0(iconCompat.f20672i, 7);
        iconCompat.f20673j = versionedParcel.d0(iconCompat.f20673j, 8);
        iconCompat.a();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.j0(true, true);
        iconCompat.b(versionedParcel.i());
        int i10 = iconCompat.f20664a;
        if (-1 != i10) {
            versionedParcel.M0(i10, 1);
        }
        byte[] bArr = iconCompat.f20666c;
        if (bArr != null) {
            versionedParcel.u0(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f20667d;
        if (parcelable != null) {
            versionedParcel.X0(parcelable, 3);
        }
        int i11 = iconCompat.f20668e;
        if (i11 != 0) {
            versionedParcel.M0(i11, 4);
        }
        int i12 = iconCompat.f20669f;
        if (i12 != 0) {
            versionedParcel.M0(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f20670g;
        if (colorStateList != null) {
            versionedParcel.X0(colorStateList, 6);
        }
        String str = iconCompat.f20672i;
        if (str != null) {
            versionedParcel.f1(str, 7);
        }
        String str2 = iconCompat.f20673j;
        if (str2 != null) {
            versionedParcel.f1(str2, 8);
        }
    }
}
