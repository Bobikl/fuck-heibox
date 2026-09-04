package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

/* JADX INFO: compiled from: NotificationChannelCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class e0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f19918s = "miscellaneous";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final boolean f19919t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f19920u = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    final String f19921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    CharSequence f19922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f19923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f19924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f19925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f19926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Uri f19927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    AudioAttributes f19928h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f19929i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f19930j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f19931k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    long[] f19932l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    String f19933m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f19934n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f19935o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f19936p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f19937q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f19938r;

    /* JADX INFO: compiled from: NotificationChannelCompat.java */
    @androidx.annotation.w0(26)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static boolean a(NotificationChannel notificationChannel) {
            return notificationChannel.canBypassDnd();
        }

        @androidx.annotation.u
        static boolean b(NotificationChannel notificationChannel) {
            return notificationChannel.canShowBadge();
        }

        @androidx.annotation.u
        static NotificationChannel c(String str, CharSequence charSequence, int i10) {
            return new NotificationChannel(str, charSequence, i10);
        }

        @androidx.annotation.u
        static void d(NotificationChannel notificationChannel, boolean z10) {
            notificationChannel.enableLights(z10);
        }

        @androidx.annotation.u
        static void e(NotificationChannel notificationChannel, boolean z10) {
            notificationChannel.enableVibration(z10);
        }

        @androidx.annotation.u
        static AudioAttributes f(NotificationChannel notificationChannel) {
            return notificationChannel.getAudioAttributes();
        }

        @androidx.annotation.u
        static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getDescription();
        }

        @androidx.annotation.u
        static String h(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        @androidx.annotation.u
        static String i(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        @androidx.annotation.u
        static int j(NotificationChannel notificationChannel) {
            return notificationChannel.getImportance();
        }

        @androidx.annotation.u
        static int k(NotificationChannel notificationChannel) {
            return notificationChannel.getLightColor();
        }

        @androidx.annotation.u
        static int l(NotificationChannel notificationChannel) {
            return notificationChannel.getLockscreenVisibility();
        }

        @androidx.annotation.u
        static CharSequence m(NotificationChannel notificationChannel) {
            return notificationChannel.getName();
        }

        @androidx.annotation.u
        static Uri n(NotificationChannel notificationChannel) {
            return notificationChannel.getSound();
        }

        @androidx.annotation.u
        static long[] o(NotificationChannel notificationChannel) {
            return notificationChannel.getVibrationPattern();
        }

        @androidx.annotation.u
        static void p(NotificationChannel notificationChannel, String str) {
            notificationChannel.setDescription(str);
        }

        @androidx.annotation.u
        static void q(NotificationChannel notificationChannel, String str) {
            notificationChannel.setGroup(str);
        }

        @androidx.annotation.u
        static void r(NotificationChannel notificationChannel, int i10) {
            notificationChannel.setLightColor(i10);
        }

        @androidx.annotation.u
        static void s(NotificationChannel notificationChannel, boolean z10) {
            notificationChannel.setShowBadge(z10);
        }

        @androidx.annotation.u
        static void t(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
            notificationChannel.setSound(uri, audioAttributes);
        }

        @androidx.annotation.u
        static void u(NotificationChannel notificationChannel, long[] jArr) {
            notificationChannel.setVibrationPattern(jArr);
        }

        @androidx.annotation.u
        static boolean v(NotificationChannel notificationChannel) {
            return notificationChannel.shouldShowLights();
        }

        @androidx.annotation.u
        static boolean w(NotificationChannel notificationChannel) {
            return notificationChannel.shouldVibrate();
        }
    }

    /* JADX INFO: compiled from: NotificationChannelCompat.java */
    @androidx.annotation.w0(29)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static boolean a(NotificationChannel notificationChannel) {
            return notificationChannel.canBubble();
        }
    }

    /* JADX INFO: compiled from: NotificationChannelCompat.java */
    @androidx.annotation.w0(30)
    public static class c {
        private c() {
        }

        @androidx.annotation.u
        static String a(NotificationChannel notificationChannel) {
            return notificationChannel.getConversationId();
        }

        @androidx.annotation.u
        static String b(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }

        @androidx.annotation.u
        static boolean c(NotificationChannel notificationChannel) {
            return notificationChannel.isImportantConversation();
        }

        @androidx.annotation.u
        static void d(NotificationChannel notificationChannel, String str, String str2) {
            notificationChannel.setConversationId(str, str2);
        }
    }

    /* JADX INFO: compiled from: NotificationChannelCompat.java */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e0 f19939a;

        public d(@androidx.annotation.n0 String str, int i10) {
            this.f19939a = new e0(str, i10);
        }

        @androidx.annotation.n0
        public e0 a() {
            return this.f19939a;
        }

        @androidx.annotation.n0
        public d b(@androidx.annotation.n0 String str, @androidx.annotation.n0 String str2) {
            if (Build.VERSION.SDK_INT >= 30) {
                e0 e0Var = this.f19939a;
                e0Var.f19933m = str;
                e0Var.f19934n = str2;
            }
            return this;
        }

        @androidx.annotation.n0
        public d c(@androidx.annotation.p0 String str) {
            this.f19939a.f19924d = str;
            return this;
        }

        @androidx.annotation.n0
        public d d(@androidx.annotation.p0 String str) {
            this.f19939a.f19925e = str;
            return this;
        }

        @androidx.annotation.n0
        public d e(int i10) {
            this.f19939a.f19923c = i10;
            return this;
        }

        @androidx.annotation.n0
        public d f(int i10) {
            this.f19939a.f19930j = i10;
            return this;
        }

        @androidx.annotation.n0
        public d g(boolean z10) {
            this.f19939a.f19929i = z10;
            return this;
        }

        @androidx.annotation.n0
        public d h(@androidx.annotation.p0 CharSequence charSequence) {
            this.f19939a.f19922b = charSequence;
            return this;
        }

        @androidx.annotation.n0
        public d i(boolean z10) {
            this.f19939a.f19926f = z10;
            return this;
        }

        @androidx.annotation.n0
        public d j(@androidx.annotation.p0 Uri uri, @androidx.annotation.p0 AudioAttributes audioAttributes) {
            e0 e0Var = this.f19939a;
            e0Var.f19927g = uri;
            e0Var.f19928h = audioAttributes;
            return this;
        }

        @androidx.annotation.n0
        public d k(boolean z10) {
            this.f19939a.f19931k = z10;
            return this;
        }

        @androidx.annotation.n0
        public d l(@androidx.annotation.p0 long[] jArr) {
            e0 e0Var = this.f19939a;
            e0Var.f19931k = jArr != null && jArr.length > 0;
            e0Var.f19932l = jArr;
            return this;
        }
    }

    @androidx.annotation.w0(26)
    e0(@androidx.annotation.n0 NotificationChannel notificationChannel) {
        this(a.i(notificationChannel), a.j(notificationChannel));
        this.f19922b = a.m(notificationChannel);
        this.f19924d = a.g(notificationChannel);
        this.f19925e = a.h(notificationChannel);
        this.f19926f = a.b(notificationChannel);
        this.f19927g = a.n(notificationChannel);
        this.f19928h = a.f(notificationChannel);
        this.f19929i = a.v(notificationChannel);
        this.f19930j = a.k(notificationChannel);
        this.f19931k = a.w(notificationChannel);
        this.f19932l = a.o(notificationChannel);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f19933m = c.b(notificationChannel);
            this.f19934n = c.a(notificationChannel);
        }
        this.f19935o = a.a(notificationChannel);
        this.f19936p = a.l(notificationChannel);
        if (i10 >= 29) {
            this.f19937q = b.a(notificationChannel);
        }
        if (i10 >= 30) {
            this.f19938r = c.c(notificationChannel);
        }
    }

    e0(@androidx.annotation.n0 String str, int i10) {
        this.f19926f = true;
        this.f19927g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.f19930j = 0;
        this.f19921a = (String) androidx.core.util.o.l(str);
        this.f19923c = i10;
        this.f19928h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    public boolean a() {
        return this.f19937q;
    }

    public boolean b() {
        return this.f19935o;
    }

    public boolean c() {
        return this.f19926f;
    }

    @androidx.annotation.p0
    public AudioAttributes d() {
        return this.f19928h;
    }

    @androidx.annotation.p0
    public String e() {
        return this.f19934n;
    }

    @androidx.annotation.p0
    public String f() {
        return this.f19924d;
    }

    @androidx.annotation.p0
    public String g() {
        return this.f19925e;
    }

    @androidx.annotation.n0
    public String h() {
        return this.f19921a;
    }

    public int i() {
        return this.f19923c;
    }

    public int j() {
        return this.f19930j;
    }

    public int k() {
        return this.f19936p;
    }

    @androidx.annotation.p0
    public CharSequence l() {
        return this.f19922b;
    }

    NotificationChannel m() {
        String str;
        String str2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return null;
        }
        NotificationChannel notificationChannelC = a.c(this.f19921a, this.f19922b, this.f19923c);
        a.p(notificationChannelC, this.f19924d);
        a.q(notificationChannelC, this.f19925e);
        a.s(notificationChannelC, this.f19926f);
        a.t(notificationChannelC, this.f19927g, this.f19928h);
        a.d(notificationChannelC, this.f19929i);
        a.r(notificationChannelC, this.f19930j);
        a.u(notificationChannelC, this.f19932l);
        a.e(notificationChannelC, this.f19931k);
        if (i10 >= 30 && (str = this.f19933m) != null && (str2 = this.f19934n) != null) {
            c.d(notificationChannelC, str, str2);
        }
        return notificationChannelC;
    }

    @androidx.annotation.p0
    public String n() {
        return this.f19933m;
    }

    @androidx.annotation.p0
    public Uri o() {
        return this.f19927g;
    }

    @androidx.annotation.p0
    public long[] p() {
        return this.f19932l;
    }

    public boolean q() {
        return this.f19938r;
    }

    public boolean r() {
        return this.f19929i;
    }

    public boolean s() {
        return this.f19931k;
    }

    @androidx.annotation.n0
    public d t() {
        return new d(this.f19921a, this.f19923c).h(this.f19922b).c(this.f19924d).d(this.f19925e).i(this.f19926f).j(this.f19927g, this.f19928h).g(this.f19929i).f(this.f19930j).k(this.f19931k).l(this.f19932l).b(this.f19933m, this.f19934n);
    }
}
