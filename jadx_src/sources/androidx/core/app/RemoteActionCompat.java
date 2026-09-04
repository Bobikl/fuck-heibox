package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public final class RemoteActionCompat implements androidx.versionedparcelable.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public IconCompat f19882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CharSequence f19883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CharSequence f19884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PendingIntent f19885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean f19886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean f19887f;

    @androidx.annotation.w0(26)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static RemoteAction a(Icon icon, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
            return new RemoteAction(icon, charSequence, charSequence2, pendingIntent);
        }

        @androidx.annotation.u
        static PendingIntent b(RemoteAction remoteAction) {
            return remoteAction.getActionIntent();
        }

        @androidx.annotation.u
        static CharSequence c(RemoteAction remoteAction) {
            return remoteAction.getContentDescription();
        }

        @androidx.annotation.u
        static Icon d(RemoteAction remoteAction) {
            return remoteAction.getIcon();
        }

        @androidx.annotation.u
        static CharSequence e(RemoteAction remoteAction) {
            return remoteAction.getTitle();
        }

        @androidx.annotation.u
        static boolean f(RemoteAction remoteAction) {
            return remoteAction.isEnabled();
        }

        @androidx.annotation.u
        static void g(RemoteAction remoteAction, boolean z10) {
            remoteAction.setEnabled(z10);
        }
    }

    @androidx.annotation.w0(28)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static void a(RemoteAction remoteAction, boolean z10) {
            remoteAction.setShouldShowIcon(z10);
        }

        @androidx.annotation.u
        static boolean b(RemoteAction remoteAction) {
            return remoteAction.shouldShowIcon();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public RemoteActionCompat() {
    }

    public RemoteActionCompat(@androidx.annotation.n0 RemoteActionCompat remoteActionCompat) {
        androidx.core.util.o.l(remoteActionCompat);
        this.f19882a = remoteActionCompat.f19882a;
        this.f19883b = remoteActionCompat.f19883b;
        this.f19884c = remoteActionCompat.f19884c;
        this.f19885d = remoteActionCompat.f19885d;
        this.f19886e = remoteActionCompat.f19886e;
        this.f19887f = remoteActionCompat.f19887f;
    }

    public RemoteActionCompat(@androidx.annotation.n0 IconCompat iconCompat, @androidx.annotation.n0 CharSequence charSequence, @androidx.annotation.n0 CharSequence charSequence2, @androidx.annotation.n0 PendingIntent pendingIntent) {
        this.f19882a = (IconCompat) androidx.core.util.o.l(iconCompat);
        this.f19883b = (CharSequence) androidx.core.util.o.l(charSequence);
        this.f19884c = (CharSequence) androidx.core.util.o.l(charSequence2);
        this.f19885d = (PendingIntent) androidx.core.util.o.l(pendingIntent);
        this.f19886e = true;
        this.f19887f = true;
    }

    @androidx.annotation.n0
    @androidx.annotation.w0(26)
    public static RemoteActionCompat a(@androidx.annotation.n0 RemoteAction remoteAction) {
        androidx.core.util.o.l(remoteAction);
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat(IconCompat.g(a.d(remoteAction)), a.e(remoteAction), a.c(remoteAction), a.b(remoteAction));
        remoteActionCompat.g(a.f(remoteAction));
        if (Build.VERSION.SDK_INT >= 28) {
            remoteActionCompat.h(b.b(remoteAction));
        }
        return remoteActionCompat;
    }

    @androidx.annotation.n0
    public PendingIntent b() {
        return this.f19885d;
    }

    @androidx.annotation.n0
    public CharSequence c() {
        return this.f19884c;
    }

    @androidx.annotation.n0
    public IconCompat d() {
        return this.f19882a;
    }

    @androidx.annotation.n0
    public CharSequence e() {
        return this.f19883b;
    }

    public boolean f() {
        return this.f19886e;
    }

    public void g(boolean z10) {
        this.f19886e = z10;
    }

    public void h(boolean z10) {
        this.f19887f = z10;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public boolean n() {
        return this.f19887f;
    }

    @androidx.annotation.n0
    @androidx.annotation.w0(26)
    public RemoteAction o() {
        RemoteAction remoteActionA = a.a(this.f19882a.K(), this.f19883b, this.f19884c, this.f19885d);
        a.g(remoteActionA, f());
        if (Build.VERSION.SDK_INT >= 28) {
            b.a(remoteActionA, n());
        }
        return remoteActionA;
    }
}
