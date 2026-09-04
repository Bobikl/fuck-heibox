package androidx.core.app;

import android.app.Notification;
import android.app.Notification$BubbleMetadata;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: NotificationCompatBuilder.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class q1 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Notification.Builder f20361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o0.n f20362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RemoteViews f20363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RemoteViews f20364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<Bundle> f20365f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f20366g = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f20367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private RemoteViews f20368i;

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    @androidx.annotation.w0(16)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static Notification a(Notification.Builder builder) {
            return builder.build();
        }

        @androidx.annotation.u
        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setPriority(i10);
        }

        @androidx.annotation.u
        static Notification.Builder c(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSubText(charSequence);
        }

        @androidx.annotation.u
        static Notification.Builder d(Notification.Builder builder, boolean z10) {
            return builder.setUsesChronometer(z10);
        }
    }

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    @androidx.annotation.w0(17)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setShowWhen(z10);
        }
    }

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    @androidx.annotation.w0(19)
    public static class c {
        private c() {
        }

        @androidx.annotation.u
        static Notification.Builder a(Notification.Builder builder, Bundle bundle) {
            return builder.setExtras(bundle);
        }
    }

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    @androidx.annotation.w0(20)
    public static class d {
        private d() {
        }

        @androidx.annotation.u
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        @androidx.annotation.u
        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        @androidx.annotation.u
        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        @androidx.annotation.u
        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        @androidx.annotation.u
        static Notification.Action.Builder e(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i10, charSequence, pendingIntent);
        }

        @androidx.annotation.u
        static String f(Notification notification) {
            return notification.getGroup();
        }

        @androidx.annotation.u
        static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        @androidx.annotation.u
        static Notification.Builder h(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        @androidx.annotation.u
        static Notification.Builder i(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        @androidx.annotation.u
        static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    @androidx.annotation.w0(21)
    public static class e {
        private e() {
        }

        @androidx.annotation.u
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        @androidx.annotation.u
        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        @androidx.annotation.u
        static Notification.Builder c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        @androidx.annotation.u
        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        @androidx.annotation.u
        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        @androidx.annotation.u
        static Notification.Builder f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    @androidx.annotation.w0(23)
    public static class f {
        private f() {
        }

        @androidx.annotation.u
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        @androidx.annotation.u
        static Notification.Builder b(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    @androidx.annotation.w0(24)
    public static class g {
        private g() {
        }

        @androidx.annotation.u
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        @androidx.annotation.u
        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        @androidx.annotation.u
        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        @androidx.annotation.u
        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        @androidx.annotation.u
        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    @androidx.annotation.w0(26)
    public static class h {
        private h() {
        }

        @androidx.annotation.u
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        @androidx.annotation.u
        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        @androidx.annotation.u
        static Notification.Builder c(Notification.Builder builder, boolean z10) {
            return builder.setColorized(z10);
        }

        @androidx.annotation.u
        static Notification.Builder d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        @androidx.annotation.u
        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        @androidx.annotation.u
        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        @androidx.annotation.u
        static Notification.Builder g(Notification.Builder builder, long j10) {
            return builder.setTimeoutAfter(j10);
        }
    }

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    @androidx.annotation.w0(28)
    public static class i {
        private i() {
        }

        @androidx.annotation.u
        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        @androidx.annotation.u
        static Notification.Action.Builder b(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    @androidx.annotation.w0(29)
    public static class j {
        private j() {
        }

        @androidx.annotation.u
        static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setAllowSystemGeneratedContextualActions(z10);
        }

        @androidx.annotation.u
        static Notification.Builder b(Notification.Builder builder, Notification$BubbleMetadata notification$BubbleMetadata) {
            return builder.setBubbleMetadata(notification$BubbleMetadata);
        }

        @androidx.annotation.u
        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
            return builder.setContextual(z10);
        }

        @androidx.annotation.u
        static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    @androidx.annotation.w0(31)
    public static class k {
        private k() {
        }

        @androidx.annotation.u
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        @androidx.annotation.u
        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    q1(o0.n nVar) {
        int i10;
        this.f20362c = nVar;
        Context context = nVar.f20208a;
        this.f20360a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f20361b = h.a(context, nVar.L);
        } else {
            this.f20361b = new Notification.Builder(nVar.f20208a);
        }
        Notification notification = nVar.U;
        this.f20361b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, nVar.f20216i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(nVar.f20212e).setContentText(nVar.f20213f).setContentInfo(nVar.f20218k).setContentIntent(nVar.f20214g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(nVar.f20215h, (notification.flags & 128) != 0).setLargeIcon(nVar.f20217j).setNumber(nVar.f20219l).setProgress(nVar.f20228u, nVar.f20229v, nVar.f20230w);
        a.b(a.d(a.c(this.f20361b, nVar.f20225r), nVar.f20222o), nVar.f20220m);
        Iterator<o0.b> it = nVar.f20209b.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
        Bundle bundle = nVar.E;
        if (bundle != null) {
            this.f20366g.putAll(bundle);
        }
        int i11 = Build.VERSION.SDK_INT;
        this.f20363d = nVar.I;
        this.f20364e = nVar.J;
        b.a(this.f20361b, nVar.f20221n);
        d.i(this.f20361b, nVar.A);
        d.g(this.f20361b, nVar.f20231x);
        d.j(this.f20361b, nVar.f20233z);
        d.h(this.f20361b, nVar.f20232y);
        this.f20367h = nVar.Q;
        e.b(this.f20361b, nVar.D);
        e.c(this.f20361b, nVar.F);
        e.f(this.f20361b, nVar.G);
        e.d(this.f20361b, nVar.H);
        e.e(this.f20361b, notification.sound, notification.audioAttributes);
        List listE = i11 < 28 ? e(g(nVar.f20210c), nVar.X) : nVar.X;
        if (listE != null && !listE.isEmpty()) {
            Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                e.a(this.f20361b, (String) it2.next());
            }
        }
        this.f20368i = nVar.K;
        if (nVar.f20211d.size() > 0) {
            Bundle bundle2 = nVar.t().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i12 = 0; i12 < nVar.f20211d.size(); i12++) {
                bundle4.putBundle(Integer.toString(i12), i2.j(nVar.f20211d.get(i12)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            nVar.t().putBundle("android.car.EXTENSIONS", bundle2);
            this.f20366g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i13 = Build.VERSION.SDK_INT;
        Object obj = nVar.W;
        if (obj != null) {
            f.b(this.f20361b, obj);
        }
        if (i13 >= 24) {
            c.a(this.f20361b, nVar.E);
            g.e(this.f20361b, nVar.f20227t);
            RemoteViews remoteViews = nVar.I;
            if (remoteViews != null) {
                g.c(this.f20361b, remoteViews);
            }
            RemoteViews remoteViews2 = nVar.J;
            if (remoteViews2 != null) {
                g.b(this.f20361b, remoteViews2);
            }
            RemoteViews remoteViews3 = nVar.K;
            if (remoteViews3 != null) {
                g.d(this.f20361b, remoteViews3);
            }
        }
        if (i13 >= 26) {
            h.b(this.f20361b, nVar.M);
            h.e(this.f20361b, nVar.f20226s);
            h.f(this.f20361b, nVar.N);
            h.g(this.f20361b, nVar.P);
            h.d(this.f20361b, nVar.Q);
            if (nVar.C) {
                h.c(this.f20361b, nVar.B);
            }
            if (!TextUtils.isEmpty(nVar.L)) {
                this.f20361b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i13 >= 28) {
            Iterator<a3> it3 = nVar.f20210c.iterator();
            while (it3.hasNext()) {
                i.a(this.f20361b, it3.next().k());
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 29) {
            j.a(this.f20361b, nVar.S);
            j.b(this.f20361b, o0.m.k(nVar.T));
            androidx.core.content.m0 m0Var = nVar.O;
            if (m0Var != null) {
                j.d(this.f20361b, m0Var.c());
            }
        }
        if (i14 >= 31 && (i10 = nVar.R) != 0) {
            k.b(this.f20361b, i10);
        }
        if (nVar.V) {
            if (this.f20362c.f20232y) {
                this.f20367h = 2;
            } else {
                this.f20367h = 1;
            }
            this.f20361b.setVibrate(null);
            this.f20361b.setSound(null);
            int i15 = notification.defaults & (-2) & (-3);
            notification.defaults = i15;
            this.f20361b.setDefaults(i15);
            if (i14 >= 26) {
                if (TextUtils.isEmpty(this.f20362c.f20231x)) {
                    d.g(this.f20361b, o0.f20090e1);
                }
                h.d(this.f20361b, this.f20367h);
            }
        }
    }

    private void b(o0.b bVar) {
        IconCompat iconCompatF = bVar.f();
        Notification.Action.Builder builderA = f.a(iconCompatF != null ? iconCompatF.K() : null, bVar.j(), bVar.a());
        if (bVar.g() != null) {
            for (RemoteInput remoteInput : e3.d(bVar.g())) {
                d.c(builderA, remoteInput);
            }
        }
        Bundle bundle = bVar.d() != null ? new Bundle(bVar.d()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", bVar.b());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            g.a(builderA, bVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", bVar.h());
        if (i10 >= 28) {
            i.b(builderA, bVar.h());
        }
        if (i10 >= 29) {
            j.c(builderA, bVar.l());
        }
        if (i10 >= 31) {
            k.a(builderA, bVar.k());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", bVar.i());
        d.b(builderA, bundle);
        d.a(this.f20361b, d.d(builderA));
    }

    @androidx.annotation.p0
    private static List<String> e(@androidx.annotation.p0 List<String> list, @androidx.annotation.p0 List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        androidx.collection.c cVar = new androidx.collection.c(list.size() + list2.size());
        cVar.addAll(list);
        cVar.addAll(list2);
        return new ArrayList(cVar);
    }

    @androidx.annotation.p0
    private static List<String> g(@androidx.annotation.p0 List<a3> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<a3> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().j());
        }
        return arrayList;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & (-2) & (-3);
    }

    @Override // androidx.core.app.d0
    public Notification.Builder a() {
        return this.f20361b;
    }

    public Notification c() {
        Bundle bundleN;
        RemoteViews remoteViewsX;
        RemoteViews remoteViewsV;
        o0.y yVar = this.f20362c.f20224q;
        if (yVar != null) {
            yVar.b(this);
        }
        RemoteViews remoteViewsW = yVar != null ? yVar.w(this) : null;
        Notification notificationD = d();
        if (remoteViewsW != null) {
            notificationD.contentView = remoteViewsW;
        } else {
            RemoteViews remoteViews = this.f20362c.I;
            if (remoteViews != null) {
                notificationD.contentView = remoteViews;
            }
        }
        if (yVar != null && (remoteViewsV = yVar.v(this)) != null) {
            notificationD.bigContentView = remoteViewsV;
        }
        if (yVar != null && (remoteViewsX = this.f20362c.f20224q.x(this)) != null) {
            notificationD.headsUpContentView = remoteViewsX;
        }
        if (yVar != null && (bundleN = o0.n(notificationD)) != null) {
            yVar.a(bundleN);
        }
        return notificationD;
    }

    protected Notification d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            return a.a(this.f20361b);
        }
        if (i10 >= 24) {
            Notification notificationA = a.a(this.f20361b);
            if (this.f20367h != 0) {
                if (d.f(notificationA) != null && (notificationA.flags & 512) != 0 && this.f20367h == 2) {
                    h(notificationA);
                }
                if (d.f(notificationA) != null && (notificationA.flags & 512) == 0 && this.f20367h == 1) {
                    h(notificationA);
                }
            }
            return notificationA;
        }
        c.a(this.f20361b, this.f20366g);
        Notification notificationA2 = a.a(this.f20361b);
        RemoteViews remoteViews = this.f20363d;
        if (remoteViews != null) {
            notificationA2.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f20364e;
        if (remoteViews2 != null) {
            notificationA2.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f20368i;
        if (remoteViews3 != null) {
            notificationA2.headsUpContentView = remoteViews3;
        }
        if (this.f20367h != 0) {
            if (d.f(notificationA2) != null && (notificationA2.flags & 512) != 0 && this.f20367h == 2) {
                h(notificationA2);
            }
            if (d.f(notificationA2) != null && (notificationA2.flags & 512) == 0 && this.f20367h == 1) {
                h(notificationA2);
            }
        }
        return notificationA2;
    }

    Context f() {
        return this.f20360a;
    }
}
