package androidx.core.app;

import android.app.PendingIntent;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f19882a = (IconCompat) versionedParcel.h0(remoteActionCompat.f19882a, 1);
        remoteActionCompat.f19883b = versionedParcel.w(remoteActionCompat.f19883b, 2);
        remoteActionCompat.f19884c = versionedParcel.w(remoteActionCompat.f19884c, 3);
        remoteActionCompat.f19885d = (PendingIntent) versionedParcel.W(remoteActionCompat.f19885d, 4);
        remoteActionCompat.f19886e = versionedParcel.m(remoteActionCompat.f19886e, 5);
        remoteActionCompat.f19887f = versionedParcel.m(remoteActionCompat.f19887f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.j0(false, false);
        versionedParcel.m1(remoteActionCompat.f19882a, 1);
        versionedParcel.z0(remoteActionCompat.f19883b, 2);
        versionedParcel.z0(remoteActionCompat.f19884c, 3);
        versionedParcel.X0(remoteActionCompat.f19885d, 4);
        versionedParcel.n0(remoteActionCompat.f19886e, 5);
        versionedParcel.n0(remoteActionCompat.f19887f, 6);
    }
}
