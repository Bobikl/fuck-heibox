package com.google.android.play.core.splitinstall.internal;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ClassLoader f56287a = h1.class.getClassLoader();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f56288b = 0;

    private h1() {
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + iDataAvail);
    }

    public static void c(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
