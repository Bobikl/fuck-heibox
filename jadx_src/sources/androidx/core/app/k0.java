package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: NotificationChannelGroupCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f19998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    CharSequence f19999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f20000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<e0> f20002e;

    /* JADX INFO: compiled from: NotificationChannelGroupCompat.java */
    @androidx.annotation.w0(26)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static NotificationChannelGroup a(String str, CharSequence charSequence) {
            return new NotificationChannelGroup(str, charSequence);
        }

        @androidx.annotation.u
        static List<NotificationChannel> b(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getChannels();
        }

        @androidx.annotation.u
        static String c(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        @androidx.annotation.u
        static String d(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        @androidx.annotation.u
        static CharSequence e(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getName();
        }
    }

    /* JADX INFO: compiled from: NotificationChannelGroupCompat.java */
    @androidx.annotation.w0(28)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static String a(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getDescription();
        }

        @androidx.annotation.u
        static boolean b(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.isBlocked();
        }

        @androidx.annotation.u
        static void c(NotificationChannelGroup notificationChannelGroup, String str) {
            notificationChannelGroup.setDescription(str);
        }
    }

    /* JADX INFO: compiled from: NotificationChannelGroupCompat.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final k0 f20003a;

        public c(@androidx.annotation.n0 String str) {
            this.f20003a = new k0(str);
        }

        @androidx.annotation.n0
        public k0 a() {
            return this.f20003a;
        }

        @androidx.annotation.n0
        public c b(@androidx.annotation.p0 String str) {
            this.f20003a.f20000c = str;
            return this;
        }

        @androidx.annotation.n0
        public c c(@androidx.annotation.p0 CharSequence charSequence) {
            this.f20003a.f19999b = charSequence;
            return this;
        }
    }

    @androidx.annotation.w0(28)
    k0(@androidx.annotation.n0 NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.emptyList());
    }

    @androidx.annotation.w0(26)
    k0(@androidx.annotation.n0 NotificationChannelGroup notificationChannelGroup, @androidx.annotation.n0 List<NotificationChannel> list) {
        this(a.d(notificationChannelGroup));
        this.f19999b = a.e(notificationChannelGroup);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f20000c = b.a(notificationChannelGroup);
        }
        if (i10 < 28) {
            this.f20002e = b(list);
        } else {
            this.f20001d = b.b(notificationChannelGroup);
            this.f20002e = b(a.b(notificationChannelGroup));
        }
    }

    k0(@androidx.annotation.n0 String str) {
        this.f20002e = Collections.emptyList();
        this.f19998a = (String) androidx.core.util.o.l(str);
    }

    @androidx.annotation.w0(26)
    private List<e0> b(List<NotificationChannel> list) {
        ArrayList arrayList = new ArrayList();
        for (NotificationChannel notificationChannel : list) {
            if (this.f19998a.equals(a.c(notificationChannel))) {
                arrayList.add(new e0(notificationChannel));
            }
        }
        return arrayList;
    }

    @androidx.annotation.n0
    public List<e0> a() {
        return this.f20002e;
    }

    @androidx.annotation.p0
    public String c() {
        return this.f20000c;
    }

    @androidx.annotation.n0
    public String d() {
        return this.f19998a;
    }

    @androidx.annotation.p0
    public CharSequence e() {
        return this.f19999b;
    }

    NotificationChannelGroup f() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return null;
        }
        NotificationChannelGroup notificationChannelGroupA = a.a(this.f19998a, this.f19999b);
        if (i10 >= 28) {
            b.c(notificationChannelGroupA, this.f20000c);
        }
        return notificationChannelGroupA;
    }

    public boolean g() {
        return this.f20001d;
    }

    @androidx.annotation.n0
    public c h() {
        return new c(this.f19998a).c(this.f19999b).b(this.f20000c);
    }
}
