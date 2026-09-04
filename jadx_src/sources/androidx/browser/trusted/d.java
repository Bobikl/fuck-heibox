package androidx.browser.trusted;

import android.app.NotificationManager;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: NotificationApiHelperForM.java */
/* JADX INFO: loaded from: classes.dex */
@w0(23)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class d {
    private d() {
    }

    @n0
    static Parcelable[] a(NotificationManager notificationManager) {
        return notificationManager.getActiveNotifications();
    }
}
