package androidx.media.app;

import android.app.Notification;
import android.app.Notification$DecoratedMediaCustomViewStyle;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.annotation.RestrictTo;
import androidx.annotation.u;
import androidx.annotation.w0;
import androidx.core.app.d0;
import androidx.core.app.o0;
import androidx.media.R;

/* JADX INFO: compiled from: NotificationCompat.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: androidx.media.app.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: NotificationCompat.java */
    @w0(15)
    public static class C0183a {
        private C0183a() {
        }

        @u
        static void a(RemoteViews remoteViews, int i10, CharSequence charSequence) {
            remoteViews.setContentDescription(i10, charSequence);
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    @w0(21)
    public static class b {
        private b() {
        }

        @u
        static Notification.MediaStyle a() {
            return new Notification.MediaStyle();
        }

        @u
        static Notification.MediaStyle b(Notification.MediaStyle mediaStyle, int[] iArr, MediaSessionCompat.Token token) {
            if (iArr != null) {
                e(mediaStyle, iArr);
            }
            if (token != null) {
                c(mediaStyle, (MediaSession.Token) token.getToken());
            }
            return mediaStyle;
        }

        @u
        static void c(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
            mediaStyle.setMediaSession(token);
        }

        @u
        static void d(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
            builder.setStyle(mediaStyle);
        }

        @u
        static void e(Notification.MediaStyle mediaStyle, int... iArr) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    @w0(24)
    public static class c {
        private c() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.app.Notification$DecoratedMediaCustomViewStyle] */
        @u
        static Notification$DecoratedMediaCustomViewStyle a() {
            return new Notification.MediaStyle() { // from class: android.app.Notification$DecoratedMediaCustomViewStyle
                static {
                    throw new NoClassDefFoundError();
                }
            };
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class d extends e {
        private void K(RemoteViews remoteViews) {
            remoteViews.setInt(R.id.status_bar_latest_event_content, "setBackgroundColor", this.f20303a.r() != 0 ? this.f20303a.r() : this.f20303a.f20208a.getResources().getColor(R.color.notification_material_background_media_default_color));
        }

        @Override // androidx.media.app.a.e
        int D(int i10) {
            return i10 <= 3 ? R.layout.notification_template_big_media_narrow_custom : R.layout.notification_template_big_media_custom;
        }

        @Override // androidx.media.app.a.e
        int E() {
            return this.f20303a.s() != null ? R.layout.notification_template_media_custom : super.E();
        }

        @Override // androidx.media.app.a.e, androidx.core.app.o0.y
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public void b(d0 d0Var) {
            if (Build.VERSION.SDK_INT >= 24) {
                b.d(d0Var.a(), b.b(c.a(), this.f24568e, this.f24569f));
            } else {
                super.b(d0Var);
            }
        }

        @Override // androidx.media.app.a.e, androidx.core.app.o0.y
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public RemoteViews v(d0 d0Var) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews remoteViewsP = this.f20303a.p() != null ? this.f20303a.p() : this.f20303a.s();
            if (remoteViewsP == null) {
                return null;
            }
            RemoteViews remoteViewsA = A();
            e(remoteViewsA, remoteViewsP);
            K(remoteViewsA);
            return remoteViewsA;
        }

        @Override // androidx.media.app.a.e, androidx.core.app.o0.y
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public RemoteViews w(d0 d0Var) {
            RemoteViews remoteViewsB = null;
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            boolean z10 = true;
            boolean z11 = this.f20303a.s() != null;
            if (!z11 && this.f20303a.p() == null) {
                z10 = false;
            }
            if (z10) {
                remoteViewsB = B();
                if (z11) {
                    e(remoteViewsB, this.f20303a.s());
                }
                K(remoteViewsB);
            }
            return remoteViewsB;
        }

        @Override // androidx.core.app.o0.y
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public RemoteViews x(d0 d0Var) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews remoteViewsW = this.f20303a.w() != null ? this.f20303a.w() : this.f20303a.s();
            if (remoteViewsW == null) {
                return null;
            }
            RemoteViews remoteViewsA = A();
            e(remoteViewsA, remoteViewsW);
            K(remoteViewsA);
            return remoteViewsA;
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class e extends o0.y {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f24566i = 3;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f24567j = 5;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int[] f24568e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        MediaSessionCompat.Token f24569f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f24570g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PendingIntent f24571h;

        public e() {
        }

        public e(o0.n nVar) {
            z(nVar);
        }

        private RemoteViews C(o0.b bVar) {
            boolean z10 = bVar.a() == null;
            RemoteViews remoteViews = new RemoteViews(this.f20303a.f20208a.getPackageName(), R.layout.notification_media_action);
            int i10 = R.id.action0;
            remoteViews.setImageViewResource(i10, bVar.e());
            if (!z10) {
                remoteViews.setOnClickPendingIntent(i10, bVar.a());
            }
            C0183a.a(remoteViews, i10, bVar.j());
            return remoteViews;
        }

        public static MediaSessionCompat.Token F(Notification notification) {
            Parcelable parcelable;
            Bundle bundleN = o0.n(notification);
            if (bundleN == null || (parcelable = bundleN.getParcelable(o0.f20086d0)) == null) {
                return null;
            }
            return MediaSessionCompat.Token.fromToken(parcelable);
        }

        RemoteViews A() {
            int iMin = Math.min(this.f20303a.f20209b.size(), 5);
            RemoteViews remoteViewsC = c(false, D(iMin), false);
            remoteViewsC.removeAllViews(R.id.media_actions);
            if (iMin > 0) {
                for (int i10 = 0; i10 < iMin; i10++) {
                    remoteViewsC.addView(R.id.media_actions, C(this.f20303a.f20209b.get(i10)));
                }
            }
            if (this.f24570g) {
                int i11 = R.id.cancel_action;
                remoteViewsC.setViewVisibility(i11, 0);
                remoteViewsC.setInt(i11, "setAlpha", this.f20303a.f20208a.getResources().getInteger(R.integer.cancel_button_image_alpha));
                remoteViewsC.setOnClickPendingIntent(i11, this.f24571h);
            } else {
                remoteViewsC.setViewVisibility(R.id.cancel_action, 8);
            }
            return remoteViewsC;
        }

        RemoteViews B() {
            RemoteViews remoteViewsC = c(false, E(), true);
            int size = this.f20303a.f20209b.size();
            int[] iArr = this.f24568e;
            int iMin = iArr == null ? 0 : Math.min(iArr.length, 3);
            remoteViewsC.removeAllViews(R.id.media_actions);
            if (iMin > 0) {
                for (int i10 = 0; i10 < iMin; i10++) {
                    if (i10 >= size) {
                        throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", Integer.valueOf(i10), Integer.valueOf(size - 1)));
                    }
                    remoteViewsC.addView(R.id.media_actions, C(this.f20303a.f20209b.get(this.f24568e[i10])));
                }
            }
            if (this.f24570g) {
                remoteViewsC.setViewVisibility(R.id.end_padder, 8);
                int i11 = R.id.cancel_action;
                remoteViewsC.setViewVisibility(i11, 0);
                remoteViewsC.setOnClickPendingIntent(i11, this.f24571h);
                remoteViewsC.setInt(i11, "setAlpha", this.f20303a.f20208a.getResources().getInteger(R.integer.cancel_button_image_alpha));
            } else {
                remoteViewsC.setViewVisibility(R.id.end_padder, 0);
                remoteViewsC.setViewVisibility(R.id.cancel_action, 8);
            }
            return remoteViewsC;
        }

        int D(int i10) {
            return i10 <= 3 ? R.layout.notification_template_big_media_narrow : R.layout.notification_template_big_media;
        }

        int E() {
            return R.layout.notification_template_media;
        }

        public e G(PendingIntent pendingIntent) {
            this.f24571h = pendingIntent;
            return this;
        }

        public e H(MediaSessionCompat.Token token) {
            this.f24569f = token;
            return this;
        }

        public e I(int... iArr) {
            this.f24568e = iArr;
            return this;
        }

        public e J(boolean z10) {
            return this;
        }

        @Override // androidx.core.app.o0.y
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public void b(d0 d0Var) {
            b.d(d0Var.a(), b.b(b.a(), this.f24568e, this.f24569f));
        }

        @Override // androidx.core.app.o0.y
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public RemoteViews v(d0 d0Var) {
            return null;
        }

        @Override // androidx.core.app.o0.y
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public RemoteViews w(d0 d0Var) {
            return null;
        }
    }

    private a() {
    }
}
