package androidx.work;

import android.app.Notification;
import androidx.annotation.n0;

/* JADX INFO: compiled from: ForegroundInfo.java */
/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f28781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Notification f28783c;

    public h(int i10, @n0 Notification notification) {
        this(i10, notification, 0);
    }

    public h(int i10, @n0 Notification notification, int i11) {
        this.f28781a = i10;
        this.f28783c = notification;
        this.f28782b = i11;
    }

    public int a() {
        return this.f28782b;
    }

    @n0
    public Notification b() {
        return this.f28783c;
    }

    public int c() {
        return this.f28781a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f28781a == hVar.f28781a && this.f28782b == hVar.f28782b) {
            return this.f28783c.equals(hVar.f28783c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f28781a * 31) + this.f28782b) * 31) + this.f28783c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f28781a + ", mForegroundServiceType=" + this.f28782b + ", mNotification=" + this.f28783c + '}';
    }
}
