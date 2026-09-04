package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.Notification$BubbleMetadata;
import android.app.Notification$CallStyle;
import android.app.Notification$DecoratedCustomViewStyle;
import android.app.Notification$MessagingStyle;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.annotation.RestrictTo;
import androidx.core.R;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: NotificationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class o0 {
    public static final int A = 2;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int A0 = 3;

    @SuppressLint({"ActionValue"})
    public static final String B = "android.title";
    public static final int B0 = 1;

    @SuppressLint({"ActionValue"})
    public static final String C = "android.title.big";
    public static final int C0 = 0;

    @SuppressLint({"ActionValue"})
    public static final String D = "android.text";
    public static final int D0 = -1;

    @SuppressLint({"ActionValue"})
    public static final String E = "android.subText";
    public static final String E0 = "call";

    @SuppressLint({"ActionValue"})
    public static final String F = "android.remoteInputHistory";
    public static final String F0 = "navigation";

    @SuppressLint({"ActionValue"})
    public static final String G = "android.infoText";
    public static final String G0 = "msg";

    @SuppressLint({"ActionValue"})
    public static final String H = "android.summaryText";
    public static final String H0 = "email";

    @SuppressLint({"ActionValue"})
    public static final String I = "android.bigText";
    public static final String I0 = "event";

    @SuppressLint({"ActionValue"})
    public static final String J = "android.icon";
    public static final String J0 = "promo";

    @SuppressLint({"ActionValue"})
    public static final String K = "android.largeIcon";
    public static final String K0 = "alarm";

    @SuppressLint({"ActionValue"})
    public static final String L = "android.largeIcon.big";
    public static final String L0 = "progress";

    @SuppressLint({"ActionValue"})
    public static final String M = "android.progress";
    public static final String M0 = "social";

    @SuppressLint({"ActionValue"})
    public static final String N = "android.progressMax";
    public static final String N0 = "err";

    @SuppressLint({"ActionValue"})
    public static final String O = "android.progressIndeterminate";
    public static final String O0 = "transport";

    @SuppressLint({"ActionValue"})
    public static final String P = "android.showChronometer";
    public static final String P0 = "sys";

    @SuppressLint({"ActionValue"})
    public static final String Q = "android.chronometerCountDown";
    public static final String Q0 = "service";

    @SuppressLint({"ActionValue"})
    public static final String R = "android.colorized";
    public static final String R0 = "reminder";

    @SuppressLint({"ActionValue"})
    public static final String S = "android.showWhen";
    public static final String S0 = "recommendation";

    @SuppressLint({"ActionValue"})
    public static final String T = "android.picture";
    public static final String T0 = "status";

    @SuppressLint({"ActionValue"})
    public static final String U = "android.pictureIcon";
    public static final String U0 = "workout";

    @SuppressLint({"ActionValue"})
    public static final String V = "android.pictureContentDescription";
    public static final String V0 = "location_sharing";

    @SuppressLint({"ActionValue"})
    public static final String W = "android.showBigPictureWhenCollapsed";
    public static final String W0 = "stopwatch";

    @SuppressLint({"ActionValue"})
    public static final String X = "android.textLines";
    public static final String X0 = "missed_call";

    @SuppressLint({"ActionValue"})
    public static final String Y = "android.template";
    public static final int Y0 = 0;
    public static final String Z = "androidx.core.app.extra.COMPAT_TEMPLATE";
    public static final int Z0 = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f20076a = "NotifCompat";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    @Deprecated
    public static final String f20077a0 = "android.people";

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final int f20078a1 = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20079b = "android.intent.category.NOTIFICATION_PREFERENCES";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20080b0 = "android.people.list";

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final int f20081b1 = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20082c = "android.intent.extra.CHANNEL_ID";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20083c0 = "android.backgroundImageUri";

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final int f20084c1 = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20085d = "android.intent.extra.CHANNEL_GROUP_ID";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20086d0 = "android.mediaSession";

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final int f20087d1 = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20088e = "android.intent.extra.NOTIFICATION_TAG";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20089e0 = "android.compactActions";

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final String f20090e1 = "silent";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20091f = "android.intent.extra.NOTIFICATION_ID";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20092f0 = "android.selfDisplayName";

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final int f20093f1 = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f20094g = -1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20095g0 = "android.messagingStyleUser";

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final int f20096g1 = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f20097h = 1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20098h0 = "android.conversationTitle";

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final int f20099h1 = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f20100i = 2;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20101i0 = "android.messages";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f20102j = 4;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20103j0 = "android.messages.historic";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f20104k = -1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20105k0 = "android.isGroupConversation";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f20106l = 1;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20107l0 = "android.callType";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f20108m = 2;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20109m0 = "android.callIsVideo";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f20110n = 4;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20111n0 = "android.callPerson";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f20112o = 8;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20113o0 = "android.callPersonCompat";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f20114p = 16;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20115p0 = "android.verificationIcon";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f20116q = 32;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20117q0 = "android.verificationIconCompat";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f20118r = 64;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20119r0 = "android.verificationText";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final int f20120s = 128;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20121s0 = "android.answerIntent";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f20122t = 256;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20123t0 = "android.declineIntent";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f20124u = 512;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20125u0 = "android.hangUpIntent";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f20126v = 4096;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20127v0 = "android.answerColor";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f20128w = 0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20129w0 = "android.declineColor";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f20130x = -1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20131x0 = "android.hiddenConversationTitle";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f20132y = -2;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20133y0 = "android.audioContents";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f20134z = 1;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    @androidx.annotation.l
    public static final int f20135z0 = 0;

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f20136m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f20137n = 1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f20138o = 2;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f20139p = 3;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f20140q = 4;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f20141r = 5;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f20142s = 6;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f20143t = 7;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f20144u = 8;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f20145v = 9;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f20146w = 10;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        static final String f20147x = "android.support.action.showsUserInterface";

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        static final String f20148y = "android.support.action.semanticAction";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Bundle f20149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private IconCompat f20150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e3[] f20151c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final e3[] f20152d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f20153e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f20154f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f20155g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f20156h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Deprecated
        public int f20157i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CharSequence f20158j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @androidx.annotation.p0
        public PendingIntent f20159k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f20160l;

        /* JADX INFO: compiled from: NotificationCompat.java */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final IconCompat f20161a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final CharSequence f20162b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final PendingIntent f20163c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f20164d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final Bundle f20165e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private ArrayList<e3> f20166f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f20167g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f20168h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f20169i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private boolean f20170j;

            /* JADX INFO: renamed from: androidx.core.app.o0$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: NotificationCompat.java */
            @androidx.annotation.w0(20)
            public static class C0119a {
                private C0119a() {
                }

                @androidx.annotation.u
                static RemoteInput[] a(Notification.Action action) {
                    return action.getRemoteInputs();
                }
            }

            /* JADX INFO: renamed from: androidx.core.app.o0$b$a$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: NotificationCompat.java */
            @androidx.annotation.w0(23)
            public static class C0120b {
                private C0120b() {
                }

                @androidx.annotation.u
                static Icon a(Notification.Action action) {
                    return action.getIcon();
                }
            }

            /* JADX INFO: compiled from: NotificationCompat.java */
            @androidx.annotation.w0(24)
            public static class c {
                private c() {
                }

                @androidx.annotation.u
                static boolean a(Notification.Action action) {
                    return action.getAllowGeneratedReplies();
                }
            }

            /* JADX INFO: compiled from: NotificationCompat.java */
            @androidx.annotation.w0(28)
            public static class d {
                private d() {
                }

                @androidx.annotation.u
                static int a(Notification.Action action) {
                    return action.getSemanticAction();
                }
            }

            /* JADX INFO: compiled from: NotificationCompat.java */
            @androidx.annotation.w0(29)
            public static class e {
                private e() {
                }

                @androidx.annotation.u
                static boolean a(Notification.Action action) {
                    return action.isContextual();
                }
            }

            /* JADX INFO: compiled from: NotificationCompat.java */
            @androidx.annotation.w0(31)
            public static class f {
                private f() {
                }

                @androidx.annotation.u
                static boolean a(Notification.Action action) {
                    return action.isAuthenticationRequired();
                }
            }

            public a(int i10, @androidx.annotation.p0 CharSequence charSequence, @androidx.annotation.p0 PendingIntent pendingIntent) {
                this(i10 != 0 ? IconCompat.w(null, "", i10) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public a(@androidx.annotation.n0 b bVar) {
                this(bVar.f(), bVar.f20158j, bVar.f20159k, new Bundle(bVar.f20149a), bVar.g(), bVar.b(), bVar.h(), bVar.f20154f, bVar.l(), bVar.k());
            }

            public a(@androidx.annotation.p0 IconCompat iconCompat, @androidx.annotation.p0 CharSequence charSequence, @androidx.annotation.p0 PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private a(@androidx.annotation.p0 IconCompat iconCompat, @androidx.annotation.p0 CharSequence charSequence, @androidx.annotation.p0 PendingIntent pendingIntent, @androidx.annotation.n0 Bundle bundle, @androidx.annotation.p0 e3[] e3VarArr, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
                this.f20164d = true;
                this.f20168h = true;
                this.f20161a = iconCompat;
                this.f20162b = n.A(charSequence);
                this.f20163c = pendingIntent;
                this.f20165e = bundle;
                this.f20166f = e3VarArr == null ? null : new ArrayList<>(Arrays.asList(e3VarArr));
                this.f20164d = z10;
                this.f20167g = i10;
                this.f20168h = z11;
                this.f20169i = z12;
                this.f20170j = z13;
            }

            private void d() {
                if (this.f20169i && this.f20163c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            @androidx.annotation.n0
            @androidx.annotation.w0(19)
            @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
            public static a f(@androidx.annotation.n0 Notification.Action action) {
                a aVar = C0120b.a(action) != null ? new a(IconCompat.h(C0120b.a(action)), action.title, action.actionIntent) : new a(action.icon, action.title, action.actionIntent);
                RemoteInput[] remoteInputArrA = C0119a.a(action);
                if (remoteInputArrA != null && remoteInputArrA.length != 0) {
                    for (RemoteInput remoteInput : remoteInputArrA) {
                        aVar.b(e3.e(remoteInput));
                    }
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 24) {
                    aVar.f20164d = c.a(action);
                }
                if (i10 >= 28) {
                    aVar.k(d.a(action));
                }
                if (i10 >= 29) {
                    aVar.j(e.a(action));
                }
                if (i10 >= 31) {
                    aVar.i(f.a(action));
                }
                return aVar;
            }

            @androidx.annotation.n0
            public a a(@androidx.annotation.p0 Bundle bundle) {
                if (bundle != null) {
                    this.f20165e.putAll(bundle);
                }
                return this;
            }

            @androidx.annotation.n0
            public a b(@androidx.annotation.p0 e3 e3Var) {
                if (this.f20166f == null) {
                    this.f20166f = new ArrayList<>();
                }
                if (e3Var != null) {
                    this.f20166f.add(e3Var);
                }
                return this;
            }

            @androidx.annotation.n0
            public b c() {
                d();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<e3> arrayList3 = this.f20166f;
                if (arrayList3 != null) {
                    for (e3 e3Var : arrayList3) {
                        if (e3Var.r()) {
                            arrayList.add(e3Var);
                        } else {
                            arrayList2.add(e3Var);
                        }
                    }
                }
                e3[] e3VarArr = arrayList.isEmpty() ? null : (e3[]) arrayList.toArray(new e3[arrayList.size()]);
                return new b(this.f20161a, this.f20162b, this.f20163c, this.f20165e, arrayList2.isEmpty() ? null : (e3[]) arrayList2.toArray(new e3[arrayList2.size()]), e3VarArr, this.f20164d, this.f20167g, this.f20168h, this.f20169i, this.f20170j);
            }

            @androidx.annotation.n0
            public a e(@androidx.annotation.n0 InterfaceC0121b interfaceC0121b) {
                interfaceC0121b.a(this);
                return this;
            }

            @androidx.annotation.n0
            public Bundle g() {
                return this.f20165e;
            }

            @androidx.annotation.n0
            public a h(boolean z10) {
                this.f20164d = z10;
                return this;
            }

            @androidx.annotation.n0
            public a i(boolean z10) {
                this.f20170j = z10;
                return this;
            }

            @androidx.annotation.n0
            public a j(boolean z10) {
                this.f20169i = z10;
                return this;
            }

            @androidx.annotation.n0
            public a k(int i10) {
                this.f20167g = i10;
                return this;
            }

            @androidx.annotation.n0
            public a l(boolean z10) {
                this.f20168h = z10;
                return this;
            }
        }

        /* JADX INFO: renamed from: androidx.core.app.o0$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: NotificationCompat.java */
        public interface InterfaceC0121b {
            @androidx.annotation.n0
            a a(@androidx.annotation.n0 a aVar);
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        @Retention(RetentionPolicy.SOURCE)
        public @interface c {
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        public static final class d implements InterfaceC0121b {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static final String f20171e = "android.wearable.EXTENSIONS";

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static final String f20172f = "flags";

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static final String f20173g = "inProgressLabel";

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final String f20174h = "confirmLabel";

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static final String f20175i = "cancelLabel";

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static final int f20176j = 1;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private static final int f20177k = 2;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private static final int f20178l = 4;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private static final int f20179m = 1;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f20180a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private CharSequence f20181b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private CharSequence f20182c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private CharSequence f20183d;

            public d() {
                this.f20180a = 1;
            }

            public d(@androidx.annotation.n0 b bVar) {
                this.f20180a = 1;
                Bundle bundle = bVar.d().getBundle(f20171e);
                if (bundle != null) {
                    this.f20180a = bundle.getInt("flags", 1);
                    this.f20181b = bundle.getCharSequence(f20173g);
                    this.f20182c = bundle.getCharSequence(f20174h);
                    this.f20183d = bundle.getCharSequence(f20175i);
                }
            }

            private void l(int i10, boolean z10) {
                if (z10) {
                    this.f20180a = i10 | this.f20180a;
                } else {
                    this.f20180a = (~i10) & this.f20180a;
                }
            }

            @Override // androidx.core.app.o0.b.InterfaceC0121b
            @androidx.annotation.n0
            public a a(@androidx.annotation.n0 a aVar) {
                Bundle bundle = new Bundle();
                int i10 = this.f20180a;
                if (i10 != 1) {
                    bundle.putInt("flags", i10);
                }
                CharSequence charSequence = this.f20181b;
                if (charSequence != null) {
                    bundle.putCharSequence(f20173g, charSequence);
                }
                CharSequence charSequence2 = this.f20182c;
                if (charSequence2 != null) {
                    bundle.putCharSequence(f20174h, charSequence2);
                }
                CharSequence charSequence3 = this.f20183d;
                if (charSequence3 != null) {
                    bundle.putCharSequence(f20175i, charSequence3);
                }
                aVar.g().putBundle(f20171e, bundle);
                return aVar;
            }

            @androidx.annotation.n0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d clone() {
                d dVar = new d();
                dVar.f20180a = this.f20180a;
                dVar.f20181b = this.f20181b;
                dVar.f20182c = this.f20182c;
                dVar.f20183d = this.f20183d;
                return dVar;
            }

            @androidx.annotation.p0
            @Deprecated
            public CharSequence c() {
                return this.f20183d;
            }

            @androidx.annotation.p0
            @Deprecated
            public CharSequence d() {
                return this.f20182c;
            }

            public boolean e() {
                return (this.f20180a & 4) != 0;
            }

            public boolean f() {
                return (this.f20180a & 2) != 0;
            }

            @androidx.annotation.p0
            @Deprecated
            public CharSequence g() {
                return this.f20181b;
            }

            public boolean h() {
                return (this.f20180a & 1) != 0;
            }

            @androidx.annotation.n0
            public d i(boolean z10) {
                l(1, z10);
                return this;
            }

            @androidx.annotation.n0
            @Deprecated
            public d j(@androidx.annotation.p0 CharSequence charSequence) {
                this.f20183d = charSequence;
                return this;
            }

            @androidx.annotation.n0
            @Deprecated
            public d k(@androidx.annotation.p0 CharSequence charSequence) {
                this.f20182c = charSequence;
                return this;
            }

            @androidx.annotation.n0
            public d m(boolean z10) {
                l(4, z10);
                return this;
            }

            @androidx.annotation.n0
            public d n(boolean z10) {
                l(2, z10);
                return this;
            }

            @androidx.annotation.n0
            @Deprecated
            public d o(@androidx.annotation.p0 CharSequence charSequence) {
                this.f20181b = charSequence;
                return this;
            }
        }

        public b(int i10, @androidx.annotation.p0 CharSequence charSequence, @androidx.annotation.p0 PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.w(null, "", i10) : null, charSequence, pendingIntent);
        }

        b(int i10, @androidx.annotation.p0 CharSequence charSequence, @androidx.annotation.p0 PendingIntent pendingIntent, @androidx.annotation.p0 Bundle bundle, @androidx.annotation.p0 e3[] e3VarArr, @androidx.annotation.p0 e3[] e3VarArr2, boolean z10, int i11, boolean z11, boolean z12, boolean z13) {
            this(i10 != 0 ? IconCompat.w(null, "", i10) : null, charSequence, pendingIntent, bundle, e3VarArr, e3VarArr2, z10, i11, z11, z12, z13);
        }

        public b(@androidx.annotation.p0 IconCompat iconCompat, @androidx.annotation.p0 CharSequence charSequence, @androidx.annotation.p0 PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (e3[]) null, (e3[]) null, true, 0, true, false, false);
        }

        b(@androidx.annotation.p0 IconCompat iconCompat, @androidx.annotation.p0 CharSequence charSequence, @androidx.annotation.p0 PendingIntent pendingIntent, @androidx.annotation.p0 Bundle bundle, @androidx.annotation.p0 e3[] e3VarArr, @androidx.annotation.p0 e3[] e3VarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f20154f = true;
            this.f20150b = iconCompat;
            if (iconCompat != null && iconCompat.B() == 2) {
                this.f20157i = iconCompat.y();
            }
            this.f20158j = n.A(charSequence);
            this.f20159k = pendingIntent;
            this.f20149a = bundle == null ? new Bundle() : bundle;
            this.f20151c = e3VarArr;
            this.f20152d = e3VarArr2;
            this.f20153e = z10;
            this.f20155g = i10;
            this.f20154f = z11;
            this.f20156h = z12;
            this.f20160l = z13;
        }

        @androidx.annotation.p0
        public PendingIntent a() {
            return this.f20159k;
        }

        public boolean b() {
            return this.f20153e;
        }

        @androidx.annotation.p0
        public e3[] c() {
            return this.f20152d;
        }

        @androidx.annotation.n0
        public Bundle d() {
            return this.f20149a;
        }

        @Deprecated
        public int e() {
            return this.f20157i;
        }

        @androidx.annotation.p0
        public IconCompat f() {
            int i10;
            if (this.f20150b == null && (i10 = this.f20157i) != 0) {
                this.f20150b = IconCompat.w(null, "", i10);
            }
            return this.f20150b;
        }

        @androidx.annotation.p0
        public e3[] g() {
            return this.f20151c;
        }

        public int h() {
            return this.f20155g;
        }

        public boolean i() {
            return this.f20154f;
        }

        @androidx.annotation.p0
        public CharSequence j() {
            return this.f20158j;
        }

        public boolean k() {
            return this.f20160l;
        }

        public boolean l() {
            return this.f20156h;
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    @androidx.annotation.w0(20)
    public static class c {
        private c() {
        }

        @androidx.annotation.u
        static boolean a(RemoteInput remoteInput) {
            return remoteInput.getAllowFreeFormInput();
        }

        @androidx.annotation.u
        static CharSequence[] b(RemoteInput remoteInput) {
            return remoteInput.getChoices();
        }

        @androidx.annotation.u
        static Bundle c(Notification.Action action) {
            return action.getExtras();
        }

        @androidx.annotation.u
        static Bundle d(RemoteInput remoteInput) {
            return remoteInput.getExtras();
        }

        @androidx.annotation.u
        static String e(Notification notification) {
            return notification.getGroup();
        }

        @androidx.annotation.u
        static CharSequence f(RemoteInput remoteInput) {
            return remoteInput.getLabel();
        }

        @androidx.annotation.u
        static RemoteInput[] g(Notification.Action action) {
            return action.getRemoteInputs();
        }

        @androidx.annotation.u
        static String h(RemoteInput remoteInput) {
            return remoteInput.getResultKey();
        }

        @androidx.annotation.u
        static String i(Notification notification) {
            return notification.getSortKey();
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    @androidx.annotation.w0(23)
    public static class d {
        private d() {
        }

        @androidx.annotation.u
        static Icon a(Notification.Action action) {
            return action.getIcon();
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    @androidx.annotation.w0(24)
    public static class e {
        private e() {
        }

        @androidx.annotation.u
        static boolean a(Notification.Action action) {
            return action.getAllowGeneratedReplies();
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    @androidx.annotation.w0(26)
    public static class f {
        private f() {
        }

        @androidx.annotation.u
        static int a(Notification notification) {
            return notification.getBadgeIconType();
        }

        @androidx.annotation.u
        static String b(Notification notification) {
            return notification.getChannelId();
        }

        @androidx.annotation.u
        static int c(Notification notification) {
            return notification.getGroupAlertBehavior();
        }

        @androidx.annotation.u
        static CharSequence d(Notification notification) {
            return notification.getSettingsText();
        }

        @androidx.annotation.u
        static String e(Notification notification) {
            return notification.getShortcutId();
        }

        @androidx.annotation.u
        static long f(Notification notification) {
            return notification.getTimeoutAfter();
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    @androidx.annotation.w0(28)
    public static class g {
        private g() {
        }

        @androidx.annotation.u
        static int a(Notification.Action action) {
            return action.getSemanticAction();
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    @androidx.annotation.w0(29)
    public static class h {
        private h() {
        }

        @androidx.annotation.u
        static boolean a(Notification notification) {
            return notification.getAllowSystemGeneratedContextualActions();
        }

        @androidx.annotation.u
        static Notification$BubbleMetadata b(Notification notification) {
            return notification.getBubbleMetadata();
        }

        @androidx.annotation.u
        static int c(RemoteInput remoteInput) {
            return remoteInput.getEditChoicesBeforeSending();
        }

        @androidx.annotation.u
        static LocusId d(Notification notification) {
            return notification.getLocusId();
        }

        @androidx.annotation.u
        static boolean e(Notification.Action action) {
            return action.isContextual();
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    @androidx.annotation.w0(31)
    public static class i {
        private i() {
        }

        @androidx.annotation.u
        static boolean a(Notification.Action action) {
            return action.isAuthenticationRequired();
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface j {
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class k extends y {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f20184j = "androidx.core.app.NotificationCompat$BigPictureStyle";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private IconCompat f20185e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private IconCompat f20186f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f20187g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private CharSequence f20188h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f20189i;

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(16)
        public static class a {
            private a() {
            }

            @androidx.annotation.u
            static Notification.BigPictureStyle a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                return bigPictureStyle.bigPicture(bitmap);
            }

            @androidx.annotation.u
            static Notification.BigPictureStyle b(Notification.Builder builder) {
                return new Notification.BigPictureStyle(builder);
            }

            @androidx.annotation.u
            static Notification.BigPictureStyle c(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                return bigPictureStyle.setBigContentTitle(charSequence);
            }

            @androidx.annotation.w0(16)
            static void d(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            @androidx.annotation.w0(16)
            static void e(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(23)
        public static class b {
            private b() {
            }

            @androidx.annotation.w0(23)
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(31)
        public static class c {
            private c() {
            }

            @androidx.annotation.w0(31)
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            @androidx.annotation.w0(31)
            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            @androidx.annotation.w0(31)
            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        public k() {
        }

        public k(@androidx.annotation.p0 n nVar) {
            z(nVar);
        }

        @androidx.annotation.p0
        private static IconCompat A(@androidx.annotation.p0 Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (parcelable instanceof Icon) {
                return IconCompat.g((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.r((Bitmap) parcelable);
            }
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @androidx.annotation.p0
        public static IconCompat F(@androidx.annotation.p0 Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable(o0.T);
            return parcelable != null ? A(parcelable) : A(bundle.getParcelable(o0.U));
        }

        @androidx.annotation.n0
        public k B(@androidx.annotation.p0 Bitmap bitmap) {
            this.f20186f = bitmap == null ? null : IconCompat.r(bitmap);
            this.f20187g = true;
            return this;
        }

        @androidx.annotation.n0
        @androidx.annotation.w0(23)
        public k C(@androidx.annotation.p0 Icon icon) {
            this.f20186f = icon == null ? null : IconCompat.g(icon);
            this.f20187g = true;
            return this;
        }

        @androidx.annotation.n0
        public k D(@androidx.annotation.p0 Bitmap bitmap) {
            this.f20185e = bitmap == null ? null : IconCompat.r(bitmap);
            return this;
        }

        @androidx.annotation.n0
        @androidx.annotation.w0(31)
        public k E(@androidx.annotation.p0 Icon icon) {
            this.f20185e = IconCompat.g(icon);
            return this;
        }

        @androidx.annotation.n0
        public k G(@androidx.annotation.p0 CharSequence charSequence) {
            this.f20304b = n.A(charSequence);
            return this;
        }

        @androidx.annotation.n0
        @androidx.annotation.w0(31)
        public k H(@androidx.annotation.p0 CharSequence charSequence) {
            this.f20188h = charSequence;
            return this;
        }

        @androidx.annotation.n0
        public k I(@androidx.annotation.p0 CharSequence charSequence) {
            this.f20305c = n.A(charSequence);
            this.f20306d = true;
            return this;
        }

        @androidx.annotation.n0
        @androidx.annotation.w0(31)
        public k J(boolean z10) {
            this.f20189i = z10;
            return this;
        }

        @Override // androidx.core.app.o0.y
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void b(d0 d0Var) {
            int i10 = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle bigPictureStyleC = a.c(a.b(d0Var.a()), this.f20304b);
            IconCompat iconCompat = this.f20185e;
            if (iconCompat != null) {
                if (i10 >= 31) {
                    c.a(bigPictureStyleC, this.f20185e.L(d0Var instanceof q1 ? ((q1) d0Var).f() : null));
                } else if (iconCompat.B() == 1) {
                    bigPictureStyleC = a.a(bigPictureStyleC, this.f20185e.x());
                }
            }
            if (this.f20187g) {
                if (this.f20186f == null) {
                    a.d(bigPictureStyleC, null);
                } else {
                    b.a(bigPictureStyleC, this.f20186f.L(d0Var instanceof q1 ? ((q1) d0Var).f() : null));
                }
            }
            if (this.f20306d) {
                a.e(bigPictureStyleC, this.f20305c);
            }
            if (i10 >= 31) {
                c.c(bigPictureStyleC, this.f20189i);
                c.b(bigPictureStyleC, this.f20188h);
            }
        }

        @Override // androidx.core.app.o0.y
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected void g(@androidx.annotation.n0 Bundle bundle) {
            super.g(bundle);
            bundle.remove(o0.L);
            bundle.remove(o0.T);
            bundle.remove(o0.U);
            bundle.remove(o0.W);
        }

        @Override // androidx.core.app.o0.y
        @androidx.annotation.n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected String t() {
            return f20184j;
        }

        @Override // androidx.core.app.o0.y
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected void y(@androidx.annotation.n0 Bundle bundle) {
            super.y(bundle);
            if (bundle.containsKey(o0.L)) {
                this.f20186f = A(bundle.getParcelable(o0.L));
                this.f20187g = true;
            }
            this.f20185e = F(bundle);
            this.f20189i = bundle.getBoolean(o0.W);
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class l extends y {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f20190f = "androidx.core.app.NotificationCompat$BigTextStyle";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CharSequence f20191e;

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(16)
        public static class a {
            private a() {
            }

            @androidx.annotation.u
            static Notification.BigTextStyle a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            @androidx.annotation.u
            static Notification.BigTextStyle b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            @androidx.annotation.u
            static Notification.BigTextStyle c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            @androidx.annotation.u
            static Notification.BigTextStyle d(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setSummaryText(charSequence);
            }
        }

        public l() {
        }

        public l(@androidx.annotation.p0 n nVar) {
            z(nVar);
        }

        @androidx.annotation.n0
        public l A(@androidx.annotation.p0 CharSequence charSequence) {
            this.f20191e = n.A(charSequence);
            return this;
        }

        @androidx.annotation.n0
        public l B(@androidx.annotation.p0 CharSequence charSequence) {
            this.f20304b = n.A(charSequence);
            return this;
        }

        @androidx.annotation.n0
        public l C(@androidx.annotation.p0 CharSequence charSequence) {
            this.f20305c = n.A(charSequence);
            this.f20306d = true;
            return this;
        }

        @Override // androidx.core.app.o0.y
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void a(@androidx.annotation.n0 Bundle bundle) {
            super.a(bundle);
        }

        @Override // androidx.core.app.o0.y
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void b(d0 d0Var) {
            Notification.BigTextStyle bigTextStyleA = a.a(a.c(a.b(d0Var.a()), this.f20304b), this.f20191e);
            if (this.f20306d) {
                a.d(bigTextStyleA, this.f20305c);
            }
        }

        @Override // androidx.core.app.o0.y
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected void g(@androidx.annotation.n0 Bundle bundle) {
            super.g(bundle);
            bundle.remove(o0.I);
        }

        @Override // androidx.core.app.o0.y
        @androidx.annotation.n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected String t() {
            return f20190f;
        }

        @Override // androidx.core.app.o0.y
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected void y(@androidx.annotation.n0 Bundle bundle) {
            super.y(bundle);
            this.f20191e = bundle.getCharSequence(o0.I);
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static final class m {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f20192h = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f20193i = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private PendingIntent f20194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private PendingIntent f20195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private IconCompat f20196c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f20197d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.q
        private int f20198e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f20199f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f20200g;

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(29)
        public static class a {
            private a() {
            }

            @androidx.annotation.w0(29)
            @androidx.annotation.p0
            static m a(@androidx.annotation.p0 Notification$BubbleMetadata notification$BubbleMetadata) {
                if (notification$BubbleMetadata == null || notification$BubbleMetadata.getIntent() == null) {
                    return null;
                }
                c cVarI = new c(notification$BubbleMetadata.getIntent(), IconCompat.g(notification$BubbleMetadata.getIcon())).b(notification$BubbleMetadata.getAutoExpandBubble()).c(notification$BubbleMetadata.getDeleteIntent()).i(notification$BubbleMetadata.isNotificationSuppressed());
                if (notification$BubbleMetadata.getDesiredHeight() != 0) {
                    cVarI.d(notification$BubbleMetadata.getDesiredHeight());
                }
                if (notification$BubbleMetadata.getDesiredHeightResId() != 0) {
                    cVarI.e(notification$BubbleMetadata.getDesiredHeightResId());
                }
                return cVarI.a();
            }

            @androidx.annotation.w0(29)
            @androidx.annotation.p0
            static Notification$BubbleMetadata b(@androidx.annotation.p0 m mVar) {
                if (mVar == null || mVar.g() == null) {
                    return null;
                }
                Notification$BubbleMetadata.Builder suppressNotification = new Notification$BubbleMetadata.Builder().setIcon(mVar.f().K()).setIntent(mVar.g()).setDeleteIntent(mVar.c()).setAutoExpandBubble(mVar.b()).setSuppressNotification(mVar.i());
                if (mVar.d() != 0) {
                    suppressNotification.setDesiredHeight(mVar.d());
                }
                if (mVar.e() != 0) {
                    suppressNotification.setDesiredHeightResId(mVar.e());
                }
                return suppressNotification.build();
            }
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(30)
        public static class b {
            private b() {
            }

            @androidx.annotation.w0(30)
            @androidx.annotation.p0
            static m a(@androidx.annotation.p0 Notification$BubbleMetadata notification$BubbleMetadata) {
                if (notification$BubbleMetadata == null) {
                    return null;
                }
                c cVar = notification$BubbleMetadata.getShortcutId() != null ? new c(notification$BubbleMetadata.getShortcutId()) : new c(notification$BubbleMetadata.getIntent(), IconCompat.g(notification$BubbleMetadata.getIcon()));
                cVar.b(notification$BubbleMetadata.getAutoExpandBubble()).c(notification$BubbleMetadata.getDeleteIntent()).i(notification$BubbleMetadata.isNotificationSuppressed());
                if (notification$BubbleMetadata.getDesiredHeight() != 0) {
                    cVar.d(notification$BubbleMetadata.getDesiredHeight());
                }
                if (notification$BubbleMetadata.getDesiredHeightResId() != 0) {
                    cVar.e(notification$BubbleMetadata.getDesiredHeightResId());
                }
                return cVar.a();
            }

            @androidx.annotation.w0(30)
            @androidx.annotation.p0
            static Notification$BubbleMetadata b(@androidx.annotation.p0 m mVar) {
                if (mVar == null) {
                    return null;
                }
                Notification$BubbleMetadata.Builder builder = mVar.h() != null ? new Notification$BubbleMetadata.Builder(mVar.h()) : new Notification$BubbleMetadata.Builder(mVar.g(), mVar.f().K());
                builder.setDeleteIntent(mVar.c()).setAutoExpandBubble(mVar.b()).setSuppressNotification(mVar.i());
                if (mVar.d() != 0) {
                    builder.setDesiredHeight(mVar.d());
                }
                if (mVar.e() != 0) {
                    builder.setDesiredHeightResId(mVar.e());
                }
                return builder.build();
            }
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        public static final class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private PendingIntent f20201a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IconCompat f20202b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f20203c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @androidx.annotation.q
            private int f20204d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f20205e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private PendingIntent f20206f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private String f20207g;

            @Deprecated
            public c() {
            }

            public c(@androidx.annotation.n0 PendingIntent pendingIntent, @androidx.annotation.n0 IconCompat iconCompat) {
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                if (iconCompat == null) {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
                this.f20201a = pendingIntent;
                this.f20202b = iconCompat;
            }

            @androidx.annotation.w0(30)
            public c(@androidx.annotation.n0 String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new NullPointerException("Bubble requires a non-null shortcut id");
                }
                this.f20207g = str;
            }

            @androidx.annotation.n0
            private c f(int i10, boolean z10) {
                if (z10) {
                    this.f20205e = i10 | this.f20205e;
                } else {
                    this.f20205e = (~i10) & this.f20205e;
                }
                return this;
            }

            @androidx.annotation.n0
            @SuppressLint({"SyntheticAccessor"})
            public m a() {
                String str = this.f20207g;
                if (str == null && this.f20201a == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                }
                if (str == null && this.f20202b == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                }
                m mVar = new m(this.f20201a, this.f20206f, this.f20202b, this.f20203c, this.f20204d, this.f20205e, str);
                mVar.j(this.f20205e);
                return mVar;
            }

            @androidx.annotation.n0
            public c b(boolean z10) {
                f(1, z10);
                return this;
            }

            @androidx.annotation.n0
            public c c(@androidx.annotation.p0 PendingIntent pendingIntent) {
                this.f20206f = pendingIntent;
                return this;
            }

            @androidx.annotation.n0
            public c d(@androidx.annotation.r(unit = 0) int i10) {
                this.f20203c = Math.max(i10, 0);
                this.f20204d = 0;
                return this;
            }

            @androidx.annotation.n0
            public c e(@androidx.annotation.q int i10) {
                this.f20204d = i10;
                this.f20203c = 0;
                return this;
            }

            @androidx.annotation.n0
            public c g(@androidx.annotation.n0 IconCompat iconCompat) {
                if (this.f20207g != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                }
                if (iconCompat == null) {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
                this.f20202b = iconCompat;
                return this;
            }

            @androidx.annotation.n0
            public c h(@androidx.annotation.n0 PendingIntent pendingIntent) {
                if (this.f20207g != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                }
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                this.f20201a = pendingIntent;
                return this;
            }

            @androidx.annotation.n0
            public c i(boolean z10) {
                f(2, z10);
                return this;
            }
        }

        private m(@androidx.annotation.p0 PendingIntent pendingIntent, @androidx.annotation.p0 PendingIntent pendingIntent2, @androidx.annotation.p0 IconCompat iconCompat, int i10, @androidx.annotation.q int i11, int i12, @androidx.annotation.p0 String str) {
            this.f20194a = pendingIntent;
            this.f20196c = iconCompat;
            this.f20197d = i10;
            this.f20198e = i11;
            this.f20195b = pendingIntent2;
            this.f20199f = i12;
            this.f20200g = str;
        }

        @androidx.annotation.p0
        public static m a(@androidx.annotation.p0 Notification$BubbleMetadata notification$BubbleMetadata) {
            if (notification$BubbleMetadata == null) {
                return null;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                return b.a(notification$BubbleMetadata);
            }
            if (i10 == 29) {
                return a.a(notification$BubbleMetadata);
            }
            return null;
        }

        @androidx.annotation.p0
        public static Notification$BubbleMetadata k(@androidx.annotation.p0 m mVar) {
            if (mVar == null) {
                return null;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                return b.b(mVar);
            }
            if (i10 == 29) {
                return a.b(mVar);
            }
            return null;
        }

        public boolean b() {
            return (this.f20199f & 1) != 0;
        }

        @androidx.annotation.p0
        public PendingIntent c() {
            return this.f20195b;
        }

        @androidx.annotation.r(unit = 0)
        public int d() {
            return this.f20197d;
        }

        @androidx.annotation.q
        public int e() {
            return this.f20198e;
        }

        @SuppressLint({"InvalidNullConversion"})
        @androidx.annotation.p0
        public IconCompat f() {
            return this.f20196c;
        }

        @SuppressLint({"InvalidNullConversion"})
        @androidx.annotation.p0
        public PendingIntent g() {
            return this.f20194a;
        }

        @androidx.annotation.p0
        public String h() {
            return this.f20200g;
        }

        public boolean i() {
            return (this.f20199f & 2) != 0;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void j(int i10) {
            this.f20199f = i10;
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class n {
        private static final int Y = 5120;
        boolean A;
        boolean B;
        boolean C;
        String D;
        Bundle E;
        int F;
        int G;
        Notification H;
        RemoteViews I;
        RemoteViews J;
        RemoteViews K;
        String L;
        int M;
        String N;
        androidx.core.content.m0 O;
        long P;
        int Q;
        int R;
        boolean S;
        m T;
        Notification U;
        boolean V;
        Object W;

        @Deprecated
        public ArrayList<String> X;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Context f20208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public ArrayList<b> f20209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public ArrayList<a3> f20210c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList<b> f20211d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        CharSequence f20212e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        CharSequence f20213f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        PendingIntent f20214g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PendingIntent f20215h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        RemoteViews f20216i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Bitmap f20217j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        CharSequence f20218k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f20219l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f20220m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f20221n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f20222o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f20223p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        y f20224q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        CharSequence f20225r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        CharSequence f20226s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        CharSequence[] f20227t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f20228u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f20229v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        boolean f20230w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        String f20231x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        boolean f20232y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        String f20233z;

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(21)
        public static class a {
            private a() {
            }

            @androidx.annotation.u
            static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            @androidx.annotation.u
            static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            @androidx.annotation.u
            static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i10) {
                return builder.setContentType(i10);
            }

            @androidx.annotation.u
            static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i10) {
                return builder.setLegacyStreamType(i10);
            }

            @androidx.annotation.u
            static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i10) {
                return builder.setUsage(i10);
            }
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(23)
        public static class b {
            private b() {
            }

            @androidx.annotation.u
            static Icon a(Notification notification) {
                return notification.getSmallIcon();
            }
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(24)
        public static class c {
            private c() {
            }

            @androidx.annotation.u
            static RemoteViews a(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }

            @androidx.annotation.u
            static RemoteViews b(Notification.Builder builder) {
                return builder.createContentView();
            }

            @androidx.annotation.u
            static RemoteViews c(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }

            @androidx.annotation.u
            static Notification.Builder d(Context context, Notification notification) {
                return Notification.Builder.recoverBuilder(context, notification);
            }
        }

        @Deprecated
        public n(@androidx.annotation.n0 Context context) {
            this(context, (String) null);
        }

        @androidx.annotation.w0(19)
        public n(@androidx.annotation.n0 Context context, @androidx.annotation.n0 Notification notification) {
            ArrayList parcelableArrayList;
            this(context, o0.i(notification));
            Bundle bundle = notification.extras;
            y yVarS = y.s(notification);
            P(o0.m(notification)).O(o0.l(notification)).M(o0.k(notification)).A0(o0.D(notification)).o0(o0.z(notification)).z0(yVarS).N(notification.contentIntent).Z(o0.o(notification)).b0(o0.H(notification)).f0(o0.t(notification)).H0(notification.when).r0(o0.B(notification)).E0(o0.F(notification)).D(o0.e(notification)).j0(o0.w(notification)).i0(o0.v(notification)).e0(o0.s(notification)).c0(notification.largeIcon).E(o0.f(notification)).G(o0.h(notification)).F(o0.g(notification)).h0(notification.number).B0(notification.tickerText).N(notification.contentIntent).U(notification.deleteIntent).Y(notification.fullScreenIntent, o0.q(notification)).y0(notification.sound, notification.audioStreamType).F0(notification.vibrate).d0(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).T(notification.defaults).k0(notification.priority).J(o0.j(notification)).G0(o0.G(notification)).m0(o0.y(notification)).w0(o0.C(notification)).D0(o0.E(notification)).p0(o0.A(notification)).l0(bundle.getInt(o0.N), bundle.getInt(o0.M), bundle.getBoolean(o0.O)).C(o0.d(notification)).u0(notification.icon, notification.iconLevel).c(u(notification, yVarS));
            this.W = b.a(notification);
            Notification.Action[] actionArr = notification.actions;
            if (actionArr != null && actionArr.length != 0) {
                for (Notification.Action action : actionArr) {
                    b(b.a.f(action).c());
                }
            }
            List<b> listR = o0.r(notification);
            if (!listR.isEmpty()) {
                Iterator<b> it = listR.iterator();
                while (it.hasNext()) {
                    e(it.next());
                }
            }
            String[] stringArray = notification.extras.getStringArray(o0.f20077a0);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    g(str);
                }
            }
            if (Build.VERSION.SDK_INT >= 28 && (parcelableArrayList = notification.extras.getParcelableArrayList(o0.f20080b0)) != null && !parcelableArrayList.isEmpty()) {
                Iterator it2 = parcelableArrayList.iterator();
                while (it2.hasNext()) {
                    f(a3.a((Person) it2.next()));
                }
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24 && bundle.containsKey(o0.Q)) {
                I(bundle.getBoolean(o0.Q));
            }
            if (i10 < 26 || !bundle.containsKey(o0.R)) {
                return;
            }
            K(bundle.getBoolean(o0.R));
        }

        public n(@androidx.annotation.n0 Context context, @androidx.annotation.n0 String str) {
            this.f20209b = new ArrayList<>();
            this.f20210c = new ArrayList<>();
            this.f20211d = new ArrayList<>();
            this.f20221n = true;
            this.A = false;
            this.F = 0;
            this.G = 0;
            this.M = 0;
            this.Q = 0;
            this.R = 0;
            Notification notification = new Notification();
            this.U = notification;
            this.f20208a = context;
            this.L = str;
            notification.when = System.currentTimeMillis();
            this.U.audioStreamType = -1;
            this.f20220m = 0;
            this.X = new ArrayList<>();
            this.S = true;
        }

        @androidx.annotation.p0
        protected static CharSequence A(@androidx.annotation.p0 CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        @androidx.annotation.p0
        private Bitmap B(@androidx.annotation.p0 Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f20208a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
        }

        private boolean I0() {
            y yVar = this.f20224q;
            return yVar == null || !yVar.r();
        }

        private void W(int i10, boolean z10) {
            if (z10) {
                Notification notification = this.U;
                notification.flags = i10 | notification.flags;
            } else {
                Notification notification2 = this.U;
                notification2.flags = (~i10) & notification2.flags;
            }
        }

        @androidx.annotation.w0(19)
        @androidx.annotation.p0
        private static Bundle u(@androidx.annotation.n0 Notification notification, @androidx.annotation.p0 y yVar) {
            if (notification.extras == null) {
                return null;
            }
            Bundle bundle = new Bundle(notification.extras);
            bundle.remove(o0.B);
            bundle.remove(o0.D);
            bundle.remove(o0.G);
            bundle.remove(o0.E);
            bundle.remove(o0.f20082c);
            bundle.remove(o0.f20085d);
            bundle.remove(o0.S);
            bundle.remove(o0.M);
            bundle.remove(o0.N);
            bundle.remove(o0.O);
            bundle.remove(o0.Q);
            bundle.remove(o0.R);
            bundle.remove(o0.f20080b0);
            bundle.remove(o0.f20077a0);
            bundle.remove(h2.f19967d);
            bundle.remove(h2.f19965b);
            bundle.remove(h2.f19966c);
            bundle.remove(h2.f19964a);
            bundle.remove(h2.f19968e);
            Bundle bundle2 = bundle.getBundle("android.car.EXTENSIONS");
            if (bundle2 != null) {
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.remove("invisible_actions");
                bundle.putBundle("android.car.EXTENSIONS", bundle3);
            }
            if (yVar != null) {
                yVar.g(bundle);
            }
            return bundle;
        }

        @androidx.annotation.n0
        public n A0(@androidx.annotation.p0 CharSequence charSequence) {
            this.f20225r = A(charSequence);
            return this;
        }

        @androidx.annotation.n0
        public n B0(@androidx.annotation.p0 CharSequence charSequence) {
            this.U.tickerText = A(charSequence);
            return this;
        }

        @androidx.annotation.n0
        public n C(boolean z10) {
            this.S = z10;
            return this;
        }

        @androidx.annotation.n0
        @Deprecated
        public n C0(@androidx.annotation.p0 CharSequence charSequence, @androidx.annotation.p0 RemoteViews remoteViews) {
            this.U.tickerText = A(charSequence);
            this.f20216i = remoteViews;
            return this;
        }

        @androidx.annotation.n0
        public n D(boolean z10) {
            W(16, z10);
            return this;
        }

        @androidx.annotation.n0
        public n D0(long j10) {
            this.P = j10;
            return this;
        }

        @androidx.annotation.n0
        public n E(int i10) {
            this.M = i10;
            return this;
        }

        @androidx.annotation.n0
        public n E0(boolean z10) {
            this.f20222o = z10;
            return this;
        }

        @androidx.annotation.n0
        public n F(@androidx.annotation.p0 m mVar) {
            this.T = mVar;
            return this;
        }

        @androidx.annotation.n0
        public n F0(@androidx.annotation.p0 long[] jArr) {
            this.U.vibrate = jArr;
            return this;
        }

        @androidx.annotation.n0
        public n G(@androidx.annotation.p0 String str) {
            this.D = str;
            return this;
        }

        @androidx.annotation.n0
        public n G0(int i10) {
            this.G = i10;
            return this;
        }

        @androidx.annotation.n0
        public n H(@androidx.annotation.n0 String str) {
            this.L = str;
            return this;
        }

        @androidx.annotation.n0
        public n H0(long j10) {
            this.U.when = j10;
            return this;
        }

        @androidx.annotation.n0
        @androidx.annotation.w0(24)
        public n I(boolean z10) {
            this.f20223p = z10;
            t().putBoolean(o0.Q, z10);
            return this;
        }

        @androidx.annotation.n0
        public n J(@androidx.annotation.l int i10) {
            this.F = i10;
            return this;
        }

        @androidx.annotation.n0
        public n K(boolean z10) {
            this.B = z10;
            this.C = true;
            return this;
        }

        @androidx.annotation.n0
        public n L(@androidx.annotation.p0 RemoteViews remoteViews) {
            this.U.contentView = remoteViews;
            return this;
        }

        @androidx.annotation.n0
        public n M(@androidx.annotation.p0 CharSequence charSequence) {
            this.f20218k = A(charSequence);
            return this;
        }

        @androidx.annotation.n0
        public n N(@androidx.annotation.p0 PendingIntent pendingIntent) {
            this.f20214g = pendingIntent;
            return this;
        }

        @androidx.annotation.n0
        public n O(@androidx.annotation.p0 CharSequence charSequence) {
            this.f20213f = A(charSequence);
            return this;
        }

        @androidx.annotation.n0
        public n P(@androidx.annotation.p0 CharSequence charSequence) {
            this.f20212e = A(charSequence);
            return this;
        }

        @androidx.annotation.n0
        public n Q(@androidx.annotation.p0 RemoteViews remoteViews) {
            this.J = remoteViews;
            return this;
        }

        @androidx.annotation.n0
        public n R(@androidx.annotation.p0 RemoteViews remoteViews) {
            this.I = remoteViews;
            return this;
        }

        @androidx.annotation.n0
        public n S(@androidx.annotation.p0 RemoteViews remoteViews) {
            this.K = remoteViews;
            return this;
        }

        @androidx.annotation.n0
        public n T(int i10) {
            Notification notification = this.U;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        @androidx.annotation.n0
        public n U(@androidx.annotation.p0 PendingIntent pendingIntent) {
            this.U.deleteIntent = pendingIntent;
            return this;
        }

        @androidx.annotation.n0
        public n V(@androidx.annotation.p0 Bundle bundle) {
            this.E = bundle;
            return this;
        }

        @androidx.annotation.n0
        public n X(int i10) {
            this.R = i10;
            return this;
        }

        @androidx.annotation.n0
        public n Y(@androidx.annotation.p0 PendingIntent pendingIntent, boolean z10) {
            this.f20215h = pendingIntent;
            W(128, z10);
            return this;
        }

        @androidx.annotation.n0
        public n Z(@androidx.annotation.p0 String str) {
            this.f20231x = str;
            return this;
        }

        @androidx.annotation.n0
        public n a(int i10, @androidx.annotation.p0 CharSequence charSequence, @androidx.annotation.p0 PendingIntent pendingIntent) {
            this.f20209b.add(new b(i10, charSequence, pendingIntent));
            return this;
        }

        @androidx.annotation.n0
        public n a0(int i10) {
            this.Q = i10;
            return this;
        }

        @androidx.annotation.n0
        public n b(@androidx.annotation.p0 b bVar) {
            if (bVar != null) {
                this.f20209b.add(bVar);
            }
            return this;
        }

        @androidx.annotation.n0
        public n b0(boolean z10) {
            this.f20232y = z10;
            return this;
        }

        @androidx.annotation.n0
        public n c(@androidx.annotation.p0 Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.E;
                if (bundle2 == null) {
                    this.E = new Bundle(bundle);
                } else {
                    bundle2.putAll(bundle);
                }
            }
            return this;
        }

        @androidx.annotation.n0
        public n c0(@androidx.annotation.p0 Bitmap bitmap) {
            this.f20217j = B(bitmap);
            return this;
        }

        @androidx.annotation.n0
        @androidx.annotation.w0(21)
        public n d(int i10, @androidx.annotation.p0 CharSequence charSequence, @androidx.annotation.p0 PendingIntent pendingIntent) {
            this.f20211d.add(new b(i10, charSequence, pendingIntent));
            return this;
        }

        @androidx.annotation.n0
        public n d0(@androidx.annotation.l int i10, int i11, int i12) {
            Notification notification = this.U;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        @androidx.annotation.n0
        @androidx.annotation.w0(21)
        public n e(@androidx.annotation.p0 b bVar) {
            if (bVar != null) {
                this.f20211d.add(bVar);
            }
            return this;
        }

        @androidx.annotation.n0
        public n e0(boolean z10) {
            this.A = z10;
            return this;
        }

        @androidx.annotation.n0
        public n f(@androidx.annotation.p0 a3 a3Var) {
            if (a3Var != null) {
                this.f20210c.add(a3Var);
            }
            return this;
        }

        @androidx.annotation.n0
        public n f0(@androidx.annotation.p0 androidx.core.content.m0 m0Var) {
            this.O = m0Var;
            return this;
        }

        @androidx.annotation.n0
        @Deprecated
        public n g(@androidx.annotation.p0 String str) {
            if (str != null && !str.isEmpty()) {
                this.X.add(str);
            }
            return this;
        }

        @androidx.annotation.n0
        @Deprecated
        public n g0() {
            this.V = true;
            return this;
        }

        @androidx.annotation.n0
        public Notification h() {
            return new q1(this).c();
        }

        @androidx.annotation.n0
        public n h0(int i10) {
            this.f20219l = i10;
            return this;
        }

        @androidx.annotation.n0
        public n i() {
            this.f20209b.clear();
            return this;
        }

        @androidx.annotation.n0
        public n i0(boolean z10) {
            W(2, z10);
            return this;
        }

        @androidx.annotation.n0
        public n j() {
            this.f20211d.clear();
            Bundle bundle = this.E.getBundle("android.car.EXTENSIONS");
            if (bundle != null) {
                Bundle bundle2 = new Bundle(bundle);
                bundle2.remove("invisible_actions");
                this.E.putBundle("android.car.EXTENSIONS", bundle2);
            }
            return this;
        }

        @androidx.annotation.n0
        public n j0(boolean z10) {
            W(8, z10);
            return this;
        }

        @androidx.annotation.n0
        public n k() {
            this.f20210c.clear();
            this.X.clear();
            return this;
        }

        @androidx.annotation.n0
        public n k0(int i10) {
            this.f20220m = i10;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @androidx.annotation.p0
        public RemoteViews l() {
            RemoteViews remoteViewsV;
            int i10 = Build.VERSION.SDK_INT;
            if (this.J != null && I0()) {
                return this.J;
            }
            q1 q1Var = new q1(this);
            y yVar = this.f20224q;
            if (yVar != null && (remoteViewsV = yVar.v(q1Var)) != null) {
                return remoteViewsV;
            }
            Notification notificationC = q1Var.c();
            return i10 >= 24 ? c.a(c.d(this.f20208a, notificationC)) : notificationC.bigContentView;
        }

        @androidx.annotation.n0
        public n l0(int i10, int i11, boolean z10) {
            this.f20228u = i10;
            this.f20229v = i11;
            this.f20230w = z10;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @androidx.annotation.p0
        public RemoteViews m() {
            RemoteViews remoteViewsW;
            if (this.I != null && I0()) {
                return this.I;
            }
            q1 q1Var = new q1(this);
            y yVar = this.f20224q;
            if (yVar != null && (remoteViewsW = yVar.w(q1Var)) != null) {
                return remoteViewsW;
            }
            Notification notificationC = q1Var.c();
            return Build.VERSION.SDK_INT >= 24 ? c.b(c.d(this.f20208a, notificationC)) : notificationC.contentView;
        }

        @androidx.annotation.n0
        public n m0(@androidx.annotation.p0 Notification notification) {
            this.H = notification;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @androidx.annotation.p0
        public RemoteViews n() {
            RemoteViews remoteViewsX;
            int i10 = Build.VERSION.SDK_INT;
            if (this.K != null && I0()) {
                return this.K;
            }
            q1 q1Var = new q1(this);
            y yVar = this.f20224q;
            if (yVar != null && (remoteViewsX = yVar.x(q1Var)) != null) {
                return remoteViewsX;
            }
            Notification notificationC = q1Var.c();
            return i10 >= 24 ? c.c(c.d(this.f20208a, notificationC)) : notificationC.headsUpContentView;
        }

        @androidx.annotation.n0
        public n n0(@androidx.annotation.p0 CharSequence[] charSequenceArr) {
            this.f20227t = charSequenceArr;
            return this;
        }

        @androidx.annotation.n0
        public n o(@androidx.annotation.n0 r rVar) {
            rVar.a(this);
            return this;
        }

        @androidx.annotation.n0
        public n o0(@androidx.annotation.p0 CharSequence charSequence) {
            this.f20226s = A(charSequence);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews p() {
            return this.J;
        }

        @androidx.annotation.n0
        public n p0(@androidx.annotation.p0 String str) {
            this.N = str;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @androidx.annotation.p0
        public m q() {
            return this.T;
        }

        @androidx.annotation.n0
        public n q0(@androidx.annotation.p0 androidx.core.content.pm.l lVar) {
            if (lVar == null) {
                return this;
            }
            this.N = lVar.k();
            if (this.O == null) {
                if (lVar.o() != null) {
                    this.O = lVar.o();
                } else if (lVar.k() != null) {
                    this.O = new androidx.core.content.m0(lVar.k());
                }
            }
            if (this.f20212e == null) {
                P(lVar.w());
            }
            return this;
        }

        @androidx.annotation.l
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public int r() {
            return this.F;
        }

        @androidx.annotation.n0
        public n r0(boolean z10) {
            this.f20221n = z10;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews s() {
            return this.I;
        }

        @androidx.annotation.n0
        public n s0(boolean z10) {
            this.V = z10;
            return this;
        }

        @androidx.annotation.n0
        public Bundle t() {
            if (this.E == null) {
                this.E = new Bundle();
            }
            return this.E;
        }

        @androidx.annotation.n0
        public n t0(int i10) {
            this.U.icon = i10;
            return this;
        }

        @androidx.annotation.n0
        public n u0(int i10, int i11) {
            Notification notification = this.U;
            notification.icon = i10;
            notification.iconLevel = i11;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public int v() {
            return this.R;
        }

        @androidx.annotation.n0
        @androidx.annotation.w0(23)
        public n v0(@androidx.annotation.n0 IconCompat iconCompat) {
            this.W = iconCompat.L(this.f20208a);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews w() {
            return this.K;
        }

        @androidx.annotation.n0
        public n w0(@androidx.annotation.p0 String str) {
            this.f20233z = str;
            return this;
        }

        @androidx.annotation.n0
        @Deprecated
        public Notification x() {
            return h();
        }

        @androidx.annotation.n0
        public n x0(@androidx.annotation.p0 Uri uri) {
            Notification notification = this.U;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder builderE = a.e(a.c(a.b(), 4), 5);
            this.U.audioAttributes = a.a(builderE);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public int y() {
            return this.f20220m;
        }

        @androidx.annotation.n0
        public n y0(@androidx.annotation.p0 Uri uri, int i10) {
            Notification notification = this.U;
            notification.sound = uri;
            notification.audioStreamType = i10;
            AudioAttributes.Builder builderD = a.d(a.c(a.b(), 4), i10);
            this.U.audioAttributes = a.a(builderD);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public long z() {
            if (this.f20221n) {
                return this.U.when;
            }
            return 0L;
        }

        @androidx.annotation.n0
        public n z0(@androidx.annotation.p0 y yVar) {
            if (this.f20224q != yVar) {
                this.f20224q = yVar;
                if (yVar != null) {
                    yVar.z(this);
                }
            }
            return this;
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class o extends y {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f20234o = "androidx.core.app.NotificationCompat$CallStyle";

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f20235p = 0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f20236q = 1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f20237r = 2;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f20238s = 3;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final String f20239t = "key_action_priority";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f20240e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private a3 f20241f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private PendingIntent f20242g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private PendingIntent f20243h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private PendingIntent f20244i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f20245j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Integer f20246k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Integer f20247l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private IconCompat f20248m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private CharSequence f20249n;

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(16)
        public static class a {
            private a() {
            }

            @androidx.annotation.u
            static void a(Notification$CallStyle notification$CallStyle, Notification.Builder builder) {
                notification$CallStyle.setBuilder(builder);
            }
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(20)
        public static class b {
            private b() {
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
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(21)
        public static class c {
            private c() {
            }

            @androidx.annotation.u
            static Notification.Builder a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            @androidx.annotation.u
            static Notification.Builder b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(23)
        public static class d {
            private d() {
            }

            @androidx.annotation.u
            static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }

            @androidx.annotation.u
            static void b(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(24)
        public static class e {
            private e() {
            }

            @androidx.annotation.u
            static Notification.Builder a(Notification.Builder builder) {
                return builder.setActions(new Notification.Action[0]);
            }

            @androidx.annotation.u
            static Notification.Action.Builder b(Notification.Action.Builder builder, boolean z10) {
                return builder.setAllowGeneratedReplies(z10);
            }
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(28)
        public static class f {
            private f() {
            }

            @androidx.annotation.u
            static Notification.Builder a(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(31)
        public static class g {
            private g() {
            }

            @androidx.annotation.u
            static Notification$CallStyle a(@androidx.annotation.n0 Person person, @androidx.annotation.n0 PendingIntent pendingIntent, @androidx.annotation.n0 PendingIntent pendingIntent2) {
                return Notification$CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            @androidx.annotation.u
            static Notification$CallStyle b(@androidx.annotation.n0 Person person, @androidx.annotation.n0 PendingIntent pendingIntent) {
                return Notification$CallStyle.forOngoingCall(person, pendingIntent);
            }

            @androidx.annotation.u
            static Notification$CallStyle c(@androidx.annotation.n0 Person person, @androidx.annotation.n0 PendingIntent pendingIntent, @androidx.annotation.n0 PendingIntent pendingIntent2) {
                return Notification$CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            @androidx.annotation.u
            static Notification$CallStyle d(Notification$CallStyle notification$CallStyle, @androidx.annotation.l int i10) {
                return notification$CallStyle.setAnswerButtonColorHint(i10);
            }

            @androidx.annotation.u
            static Notification.Action.Builder e(Notification.Action.Builder builder, boolean z10) {
                return builder.setAuthenticationRequired(z10);
            }

            @androidx.annotation.u
            static Notification$CallStyle f(Notification$CallStyle notification$CallStyle, @androidx.annotation.l int i10) {
                return notification$CallStyle.setDeclineButtonColorHint(i10);
            }

            @androidx.annotation.u
            static Notification$CallStyle g(Notification$CallStyle notification$CallStyle, boolean z10) {
                return notification$CallStyle.setIsVideo(z10);
            }

            @androidx.annotation.u
            static Notification$CallStyle h(Notification$CallStyle notification$CallStyle, @androidx.annotation.p0 Icon icon) {
                return notification$CallStyle.setVerificationIcon(icon);
            }

            @androidx.annotation.u
            static Notification$CallStyle i(Notification$CallStyle notification$CallStyle, @androidx.annotation.p0 CharSequence charSequence) {
                return notification$CallStyle.setVerificationText(charSequence);
            }
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public @interface h {
        }

        public o() {
        }

        private o(int i10, @androidx.annotation.n0 a3 a3Var, @androidx.annotation.p0 PendingIntent pendingIntent, @androidx.annotation.p0 PendingIntent pendingIntent2, @androidx.annotation.p0 PendingIntent pendingIntent3) {
            if (a3Var == null || TextUtils.isEmpty(a3Var.f())) {
                throw new IllegalArgumentException("person must have a non-empty a name");
            }
            this.f20240e = i10;
            this.f20241f = a3Var;
            this.f20242g = pendingIntent3;
            this.f20243h = pendingIntent2;
            this.f20244i = pendingIntent;
        }

        public o(@androidx.annotation.p0 n nVar) {
            z(nVar);
        }

        @androidx.annotation.n0
        public static o A(@androidx.annotation.n0 a3 a3Var, @androidx.annotation.n0 PendingIntent pendingIntent, @androidx.annotation.n0 PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "declineIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new o(1, a3Var, null, pendingIntent, pendingIntent2);
        }

        @androidx.annotation.n0
        public static o B(@androidx.annotation.n0 a3 a3Var, @androidx.annotation.n0 PendingIntent pendingIntent) {
            Objects.requireNonNull(pendingIntent, "hangUpIntent is required");
            return new o(2, a3Var, pendingIntent, null, null);
        }

        @androidx.annotation.n0
        public static o C(@androidx.annotation.n0 a3 a3Var, @androidx.annotation.n0 PendingIntent pendingIntent, @androidx.annotation.n0 PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "hangUpIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new o(3, a3Var, pendingIntent, null, pendingIntent2);
        }

        @androidx.annotation.w0(20)
        private static Notification.Action D(b bVar) {
            int i10 = Build.VERSION.SDK_INT;
            IconCompat iconCompatF = bVar.f();
            Notification.Action.Builder builderA = d.a(iconCompatF == null ? null : iconCompatF.K(), bVar.j(), bVar.a());
            Bundle bundle = bVar.d() != null ? new Bundle(bVar.d()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", bVar.b());
            if (i10 >= 24) {
                e.b(builderA, bVar.b());
            }
            if (i10 >= 31) {
                g.e(builderA, bVar.k());
            }
            b.b(builderA, bundle);
            e3[] e3VarArrG = bVar.g();
            if (e3VarArrG != null) {
                for (RemoteInput remoteInput : e3.d(e3VarArrG)) {
                    b.c(builderA, remoteInput);
                }
            }
            return b.d(builderA);
        }

        @androidx.annotation.p0
        private String F() {
            int i10 = this.f20240e;
            if (i10 == 1) {
                return this.f20303a.f20208a.getResources().getString(R.string.call_notification_incoming_text);
            }
            if (i10 == 2) {
                return this.f20303a.f20208a.getResources().getString(R.string.call_notification_ongoing_text);
            }
            if (i10 != 3) {
                return null;
            }
            return this.f20303a.f20208a.getResources().getString(R.string.call_notification_screening_text);
        }

        private boolean G(b bVar) {
            return bVar != null && bVar.d().getBoolean(f20239t);
        }

        @androidx.annotation.n0
        @androidx.annotation.w0(20)
        private b H(int i10, int i11, Integer num, int i12, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(androidx.core.content.d.f(this.f20303a.f20208a, i12));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f20303a.f20208a.getResources().getString(i11));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            b bVarC = new b.a(IconCompat.v(this.f20303a.f20208a, i10), spannableStringBuilder, pendingIntent).c();
            bVarC.d().putBoolean(f20239t, true);
            return bVarC;
        }

        @androidx.annotation.w0(20)
        @androidx.annotation.p0
        private b I() {
            int i10 = R.drawable.ic_call_answer_video;
            int i11 = R.drawable.ic_call_answer;
            PendingIntent pendingIntent = this.f20242g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z10 = this.f20245j;
            return H(z10 ? i10 : i11, z10 ? R.string.call_notification_answer_video_action : R.string.call_notification_answer_action, this.f20246k, R.color.call_notification_answer_color, pendingIntent);
        }

        @androidx.annotation.n0
        @androidx.annotation.w0(20)
        private b J() {
            int i10 = R.drawable.ic_call_decline;
            PendingIntent pendingIntent = this.f20243h;
            return pendingIntent == null ? H(i10, R.string.call_notification_hang_up_action, this.f20247l, R.color.call_notification_decline_color, this.f20244i) : H(i10, R.string.call_notification_decline_action, this.f20247l, R.color.call_notification_decline_color, pendingIntent);
        }

        @androidx.annotation.n0
        @androidx.annotation.w0(20)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public ArrayList<b> E() {
            b bVarJ = J();
            b bVarI = I();
            ArrayList<b> arrayList = new ArrayList<>(3);
            arrayList.add(bVarJ);
            int i10 = 2;
            ArrayList<b> arrayList2 = this.f20303a.f20209b;
            if (arrayList2 != null) {
                for (b bVar : arrayList2) {
                    if (bVar.l()) {
                        arrayList.add(bVar);
                    } else if (!G(bVar) && i10 > 1) {
                        arrayList.add(bVar);
                        i10--;
                    }
                    if (bVarI != null && i10 == 1) {
                        arrayList.add(bVarI);
                        i10--;
                    }
                }
            }
            if (bVarI != null && i10 >= 1) {
                arrayList.add(bVarI);
            }
            return arrayList;
        }

        @androidx.annotation.n0
        public o K(@androidx.annotation.l int i10) {
            this.f20246k = Integer.valueOf(i10);
            return this;
        }

        @androidx.annotation.n0
        public o L(@androidx.annotation.l int i10) {
            this.f20247l = Integer.valueOf(i10);
            return this;
        }

        @androidx.annotation.n0
        public o M(boolean z10) {
            this.f20245j = z10;
            return this;
        }

        @androidx.annotation.n0
        public o N(@androidx.annotation.p0 Bitmap bitmap) {
            this.f20248m = IconCompat.r(bitmap);
            return this;
        }

        @androidx.annotation.n0
        @androidx.annotation.w0(23)
        public o O(@androidx.annotation.p0 Icon icon) {
            this.f20248m = icon == null ? null : IconCompat.g(icon);
            return this;
        }

        @androidx.annotation.n0
        public o P(@androidx.annotation.p0 CharSequence charSequence) {
            this.f20249n = charSequence;
            return this;
        }

        @Override // androidx.core.app.o0.y
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void a(@androidx.annotation.n0 Bundle bundle) {
            super.a(bundle);
            bundle.putInt(o0.f20107l0, this.f20240e);
            bundle.putBoolean(o0.f20109m0, this.f20245j);
            a3 a3Var = this.f20241f;
            if (a3Var != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable(o0.f20111n0, a3Var.k());
                } else {
                    bundle.putParcelable(o0.f20113o0, a3Var.m());
                }
            }
            IconCompat iconCompat = this.f20248m;
            if (iconCompat != null) {
                bundle.putParcelable(o0.f20115p0, iconCompat.L(this.f20303a.f20208a));
            }
            bundle.putCharSequence(o0.f20119r0, this.f20249n);
            bundle.putParcelable(o0.f20121s0, this.f20242g);
            bundle.putParcelable(o0.f20123t0, this.f20243h);
            bundle.putParcelable(o0.f20125u0, this.f20244i);
            Integer num = this.f20246k;
            if (num != null) {
                bundle.putInt(o0.f20127v0, num.intValue());
            }
            Integer num2 = this.f20247l;
            if (num2 != null) {
                bundle.putInt(o0.f20129w0, num2.intValue());
            }
        }

        @Override // androidx.core.app.o0.y
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void b(d0 d0Var) {
            int i10 = Build.VERSION.SDK_INT;
            CharSequence charSequenceF = null;
            notification$CallStyleA = null;
            Notification$CallStyle notification$CallStyleA = null;
            charSequenceF = null;
            if (i10 < 31) {
                Notification.Builder builderA = d0Var.a();
                a3 a3Var = this.f20241f;
                builderA.setContentTitle(a3Var != null ? a3Var.f() : null);
                Bundle bundle = this.f20303a.E;
                if (bundle != null && bundle.containsKey(o0.D)) {
                    charSequenceF = this.f20303a.E.getCharSequence(o0.D);
                }
                if (charSequenceF == null) {
                    charSequenceF = F();
                }
                builderA.setContentText(charSequenceF);
                a3 a3Var2 = this.f20241f;
                if (a3Var2 != null) {
                    if (a3Var2.d() != null) {
                        d.b(builderA, this.f20241f.d().L(this.f20303a.f20208a));
                    }
                    if (i10 >= 28) {
                        f.a(builderA, this.f20241f.k());
                    } else {
                        c.a(builderA, this.f20241f.g());
                    }
                }
                ArrayList<b> arrayListE = E();
                if (i10 >= 24) {
                    e.a(builderA);
                }
                Iterator<b> it = arrayListE.iterator();
                while (it.hasNext()) {
                    b.a(builderA, D(it.next()));
                }
                c.b(builderA, "call");
                return;
            }
            int i11 = this.f20240e;
            if (i11 == 1) {
                notification$CallStyleA = g.a(this.f20241f.k(), this.f20243h, this.f20242g);
            } else if (i11 == 2) {
                notification$CallStyleA = g.b(this.f20241f.k(), this.f20244i);
            } else if (i11 == 3) {
                notification$CallStyleA = g.c(this.f20241f.k(), this.f20244i, this.f20242g);
            } else if (Log.isLoggable(o0.f20076a, 3)) {
                Log.d(o0.f20076a, "Unrecognized call type in CallStyle: " + String.valueOf(this.f20240e));
            }
            if (notification$CallStyleA != null) {
                e.a(d0Var.a());
                a.a(notification$CallStyleA, d0Var.a());
                Integer num = this.f20246k;
                if (num != null) {
                    g.d(notification$CallStyleA, num.intValue());
                }
                Integer num2 = this.f20247l;
                if (num2 != null) {
                    g.f(notification$CallStyleA, num2.intValue());
                }
                g.i(notification$CallStyleA, this.f20249n);
                IconCompat iconCompat = this.f20248m;
                if (iconCompat != null) {
                    g.h(notification$CallStyleA, iconCompat.L(this.f20303a.f20208a));
                }
                g.g(notification$CallStyleA, this.f20245j);
            }
        }

        @Override // androidx.core.app.o0.y
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean r() {
            return true;
        }

        @Override // androidx.core.app.o0.y
        @androidx.annotation.n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected String t() {
            return f20234o;
        }

        @Override // androidx.core.app.o0.y
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected void y(@androidx.annotation.n0 Bundle bundle) {
            super.y(bundle);
            this.f20240e = bundle.getInt(o0.f20107l0);
            this.f20245j = bundle.getBoolean(o0.f20109m0);
            if (Build.VERSION.SDK_INT >= 28 && bundle.containsKey(o0.f20111n0)) {
                this.f20241f = a3.a((Person) bundle.getParcelable(o0.f20111n0));
            } else if (bundle.containsKey(o0.f20113o0)) {
                this.f20241f = a3.b(bundle.getBundle(o0.f20113o0));
            }
            if (bundle.containsKey(o0.f20115p0)) {
                this.f20248m = IconCompat.g((Icon) bundle.getParcelable(o0.f20115p0));
            } else if (bundle.containsKey(o0.f20117q0)) {
                this.f20248m = IconCompat.e(bundle.getBundle(o0.f20117q0));
            }
            this.f20249n = bundle.getCharSequence(o0.f20119r0);
            this.f20242g = (PendingIntent) bundle.getParcelable(o0.f20121s0);
            this.f20243h = (PendingIntent) bundle.getParcelable(o0.f20123t0);
            this.f20244i = (PendingIntent) bundle.getParcelable(o0.f20125u0);
            this.f20246k = bundle.containsKey(o0.f20127v0) ? Integer.valueOf(bundle.getInt(o0.f20127v0)) : null;
            this.f20247l = bundle.containsKey(o0.f20129w0) ? Integer.valueOf(bundle.getInt(o0.f20129w0)) : null;
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static final class p implements r {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        static final String f20250d = "android.car.EXTENSIONS";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f20251e = "large_icon";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f20252f = "car_conversation";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f20253g = "app_color";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        static final String f20254h = "invisible_actions";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f20255i = "author";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f20256j = "text";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f20257k = "messages";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f20258l = "remote_input";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f20259m = "on_reply";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f20260n = "on_read";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f20261o = "participants";

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f20262p = "timestamp";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Bitmap f20263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f20264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f20265c;

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(20)
        public static class a {
            private a() {
            }

            @androidx.annotation.u
            static RemoteInput.Builder a(RemoteInput.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            @androidx.annotation.u
            static RemoteInput b(RemoteInput.Builder builder) {
                return builder.build();
            }

            @androidx.annotation.u
            static RemoteInput.Builder c(String str) {
                return new RemoteInput.Builder(str);
            }

            @androidx.annotation.u
            static boolean d(RemoteInput remoteInput) {
                return remoteInput.getAllowFreeFormInput();
            }

            @androidx.annotation.u
            static CharSequence[] e(RemoteInput remoteInput) {
                return remoteInput.getChoices();
            }

            @androidx.annotation.u
            static Bundle f(RemoteInput remoteInput) {
                return remoteInput.getExtras();
            }

            @androidx.annotation.u
            static CharSequence g(RemoteInput remoteInput) {
                return remoteInput.getLabel();
            }

            @androidx.annotation.u
            static String h(RemoteInput remoteInput) {
                return remoteInput.getResultKey();
            }

            @androidx.annotation.u
            static RemoteInput.Builder i(RemoteInput.Builder builder, boolean z10) {
                return builder.setAllowFreeFormInput(z10);
            }

            @androidx.annotation.u
            static RemoteInput.Builder j(RemoteInput.Builder builder, CharSequence[] charSequenceArr) {
                return builder.setChoices(charSequenceArr);
            }

            @androidx.annotation.u
            static RemoteInput.Builder k(RemoteInput.Builder builder, CharSequence charSequence) {
                return builder.setLabel(charSequence);
            }
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(29)
        public static class b {
            private b() {
            }

            @androidx.annotation.u
            static int a(RemoteInput remoteInput) {
                return remoteInput.getEditChoicesBeforeSending();
            }
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        @Deprecated
        public static class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String[] f20266a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final e3 f20267b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final PendingIntent f20268c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final PendingIntent f20269d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final String[] f20270e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final long f20271f;

            /* JADX INFO: compiled from: NotificationCompat.java */
            public static class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final List<String> f20272a = new ArrayList();

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final String f20273b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private e3 f20274c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private PendingIntent f20275d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private PendingIntent f20276e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private long f20277f;

                public a(@androidx.annotation.n0 String str) {
                    this.f20273b = str;
                }

                @androidx.annotation.n0
                public a a(@androidx.annotation.p0 String str) {
                    if (str != null) {
                        this.f20272a.add(str);
                    }
                    return this;
                }

                @androidx.annotation.n0
                public c b() {
                    List<String> list = this.f20272a;
                    return new c((String[]) list.toArray(new String[list.size()]), this.f20274c, this.f20276e, this.f20275d, new String[]{this.f20273b}, this.f20277f);
                }

                @androidx.annotation.n0
                public a c(long j10) {
                    this.f20277f = j10;
                    return this;
                }

                @androidx.annotation.n0
                public a d(@androidx.annotation.p0 PendingIntent pendingIntent) {
                    this.f20275d = pendingIntent;
                    return this;
                }

                @androidx.annotation.n0
                public a e(@androidx.annotation.p0 PendingIntent pendingIntent, @androidx.annotation.p0 e3 e3Var) {
                    this.f20274c = e3Var;
                    this.f20276e = pendingIntent;
                    return this;
                }
            }

            c(@androidx.annotation.p0 String[] strArr, @androidx.annotation.p0 e3 e3Var, @androidx.annotation.p0 PendingIntent pendingIntent, @androidx.annotation.p0 PendingIntent pendingIntent2, @androidx.annotation.p0 String[] strArr2, long j10) {
                this.f20266a = strArr;
                this.f20267b = e3Var;
                this.f20269d = pendingIntent2;
                this.f20268c = pendingIntent;
                this.f20270e = strArr2;
                this.f20271f = j10;
            }

            public long a() {
                return this.f20271f;
            }

            @androidx.annotation.p0
            public String[] b() {
                return this.f20266a;
            }

            @androidx.annotation.p0
            public String c() {
                String[] strArr = this.f20270e;
                if (strArr.length > 0) {
                    return strArr[0];
                }
                return null;
            }

            @androidx.annotation.p0
            public String[] d() {
                return this.f20270e;
            }

            @androidx.annotation.p0
            public PendingIntent e() {
                return this.f20269d;
            }

            @androidx.annotation.p0
            public e3 f() {
                return this.f20267b;
            }

            @androidx.annotation.p0
            public PendingIntent g() {
                return this.f20268c;
            }
        }

        public p() {
            this.f20265c = 0;
        }

        public p(@androidx.annotation.n0 Notification notification) {
            this.f20265c = 0;
            Bundle bundle = o0.n(notification) == null ? null : o0.n(notification).getBundle(f20250d);
            if (bundle != null) {
                this.f20263a = (Bitmap) bundle.getParcelable(f20251e);
                this.f20265c = bundle.getInt(f20253g, 0);
                this.f20264b = f(bundle.getBundle(f20252f));
            }
        }

        @androidx.annotation.w0(21)
        private static Bundle b(@androidx.annotation.n0 c cVar) {
            Bundle bundle = new Bundle();
            String str = (cVar.d() == null || cVar.d().length <= 1) ? null : cVar.d()[0];
            int length = cVar.b().length;
            Parcelable[] parcelableArr = new Parcelable[length];
            for (int i10 = 0; i10 < length; i10++) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("text", cVar.b()[i10]);
                bundle2.putString("author", str);
                parcelableArr[i10] = bundle2;
            }
            bundle.putParcelableArray(f20257k, parcelableArr);
            e3 e3VarF = cVar.f();
            if (e3VarF != null) {
                RemoteInput.Builder builderC = a.c(e3VarF.o());
                a.k(builderC, e3VarF.n());
                a.j(builderC, e3VarF.h());
                a.i(builderC, e3VarF.f());
                a.a(builderC, e3VarF.m());
                bundle.putParcelable(f20258l, a.b(builderC));
            }
            bundle.putParcelable(f20259m, cVar.g());
            bundle.putParcelable(f20260n, cVar.e());
            bundle.putStringArray(f20261o, cVar.d());
            bundle.putLong("timestamp", cVar.a());
            return bundle;
        }

        @androidx.annotation.w0(21)
        private static c f(@androidx.annotation.p0 Bundle bundle) {
            String[] strArr;
            boolean z10;
            e3 e3Var = null;
            if (bundle == null) {
                return null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(f20257k);
            if (parcelableArray != null) {
                int length = parcelableArray.length;
                String[] strArr2 = new String[length];
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        z10 = true;
                        break;
                    }
                    Parcelable parcelable = parcelableArray[i10];
                    if (parcelable instanceof Bundle) {
                        String string = ((Bundle) parcelable).getString("text");
                        strArr2[i10] = string;
                        if (string != null) {
                            i10++;
                        }
                    }
                    z10 = false;
                    break;
                }
                if (!z10) {
                    return null;
                }
                strArr = strArr2;
            } else {
                strArr = null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(f20260n);
            PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable(f20259m);
            RemoteInput remoteInput = (RemoteInput) bundle.getParcelable(f20258l);
            String[] stringArray = bundle.getStringArray(f20261o);
            if (stringArray == null || stringArray.length != 1) {
                return null;
            }
            if (remoteInput != null) {
                e3Var = new e3(a.h(remoteInput), a.g(remoteInput), a.e(remoteInput), a.d(remoteInput), Build.VERSION.SDK_INT >= 29 ? b.a(remoteInput) : 0, a.f(remoteInput), null);
            }
            return new c(strArr, e3Var, pendingIntent2, pendingIntent, stringArray, bundle.getLong("timestamp"));
        }

        @Override // androidx.core.app.o0.r
        @androidx.annotation.n0
        public n a(@androidx.annotation.n0 n nVar) {
            Bundle bundle = new Bundle();
            Bitmap bitmap = this.f20263a;
            if (bitmap != null) {
                bundle.putParcelable(f20251e, bitmap);
            }
            int i10 = this.f20265c;
            if (i10 != 0) {
                bundle.putInt(f20253g, i10);
            }
            c cVar = this.f20264b;
            if (cVar != null) {
                bundle.putBundle(f20252f, b(cVar));
            }
            nVar.t().putBundle(f20250d, bundle);
            return nVar;
        }

        @androidx.annotation.l
        public int c() {
            return this.f20265c;
        }

        @androidx.annotation.p0
        public Bitmap d() {
            return this.f20263a;
        }

        @androidx.annotation.p0
        @Deprecated
        public c e() {
            return this.f20264b;
        }

        @androidx.annotation.n0
        public p g(@androidx.annotation.l int i10) {
            this.f20265c = i10;
            return this;
        }

        @androidx.annotation.n0
        public p h(@androidx.annotation.p0 Bitmap bitmap) {
            this.f20263a = bitmap;
            return this;
        }

        @androidx.annotation.n0
        @Deprecated
        public p i(@androidx.annotation.p0 c cVar) {
            this.f20264b = cVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class q extends y {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f20278e = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f20279f = 3;

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(15)
        public static class a {
            private a() {
            }

            @androidx.annotation.u
            static void a(RemoteViews remoteViews, int i10, CharSequence charSequence) {
                remoteViews.setContentDescription(i10, charSequence);
            }
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(16)
        public static class b {
            private b() {
            }

            @androidx.annotation.u
            static Notification.Builder a(Notification.Builder builder, Object obj) {
                return builder.setStyle((Notification.Style) obj);
            }
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(24)
        public static class c {
            private c() {
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [android.app.Notification$DecoratedCustomViewStyle] */
            @androidx.annotation.u
            static Notification$DecoratedCustomViewStyle a() {
                return new Notification.Style() { // from class: android.app.Notification$DecoratedCustomViewStyle
                    static {
                        throw new NoClassDefFoundError();
                    }
                };
            }
        }

        private RemoteViews A(RemoteViews remoteViews, boolean z10) {
            int iMin;
            boolean z11 = true;
            RemoteViews remoteViewsC = c(true, R.layout.notification_template_custom_big, false);
            remoteViewsC.removeAllViews(R.id.actions);
            List<b> listC = C(this.f20303a.f20209b);
            if (!z10 || listC == null || (iMin = Math.min(listC.size(), 3)) <= 0) {
                z11 = false;
            } else {
                for (int i10 = 0; i10 < iMin; i10++) {
                    remoteViewsC.addView(R.id.actions, B(listC.get(i10)));
                }
            }
            int i11 = z11 ? 0 : 8;
            remoteViewsC.setViewVisibility(R.id.actions, i11);
            remoteViewsC.setViewVisibility(R.id.action_divider, i11);
            e(remoteViewsC, remoteViews);
            return remoteViewsC;
        }

        private RemoteViews B(b bVar) {
            boolean z10 = bVar.f20159k == null;
            RemoteViews remoteViews = new RemoteViews(this.f20303a.f20208a.getPackageName(), z10 ? R.layout.notification_action_tombstone : R.layout.notification_action);
            IconCompat iconCompatF = bVar.f();
            if (iconCompatF != null) {
                remoteViews.setImageViewBitmap(R.id.action_image, o(iconCompatF, R.color.notification_action_color_filter));
            }
            remoteViews.setTextViewText(R.id.action_text, bVar.f20158j);
            if (!z10) {
                remoteViews.setOnClickPendingIntent(R.id.action_container, bVar.f20159k);
            }
            a.a(remoteViews, R.id.action_container, bVar.f20158j);
            return remoteViews;
        }

        private static List<b> C(List<b> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (b bVar : list) {
                if (!bVar.l()) {
                    arrayList.add(bVar);
                }
            }
            return arrayList;
        }

        @Override // androidx.core.app.o0.y
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void b(d0 d0Var) {
            if (Build.VERSION.SDK_INT >= 24) {
                b.a(d0Var.a(), c.a());
            }
        }

        @Override // androidx.core.app.o0.y
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean r() {
            return true;
        }

        @Override // androidx.core.app.o0.y
        @androidx.annotation.n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected String t() {
            return f20278e;
        }

        @Override // androidx.core.app.o0.y
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews v(d0 d0Var) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews remoteViewsP = this.f20303a.p();
            if (remoteViewsP == null) {
                remoteViewsP = this.f20303a.s();
            }
            if (remoteViewsP == null) {
                return null;
            }
            return A(remoteViewsP, true);
        }

        @Override // androidx.core.app.o0.y
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews w(d0 d0Var) {
            if (Build.VERSION.SDK_INT < 24 && this.f20303a.s() != null) {
                return A(this.f20303a.s(), false);
            }
            return null;
        }

        @Override // androidx.core.app.o0.y
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews x(d0 d0Var) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews remoteViewsW = this.f20303a.w();
            RemoteViews remoteViewsS = remoteViewsW != null ? remoteViewsW : this.f20303a.s();
            if (remoteViewsW == null) {
                return null;
            }
            return A(remoteViewsS, true);
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public interface r {
        @androidx.annotation.n0
        n a(@androidx.annotation.n0 n nVar);
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface s {
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class t extends y {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f20280f = "androidx.core.app.NotificationCompat$InboxStyle";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ArrayList<CharSequence> f20281e = new ArrayList<>();

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(16)
        public static class a {
            private a() {
            }

            @androidx.annotation.u
            static Notification.InboxStyle a(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.addLine(charSequence);
            }

            @androidx.annotation.u
            static Notification.InboxStyle b(Notification.Builder builder) {
                return new Notification.InboxStyle(builder);
            }

            @androidx.annotation.u
            static Notification.InboxStyle c(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.setBigContentTitle(charSequence);
            }

            @androidx.annotation.u
            static Notification.InboxStyle d(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.setSummaryText(charSequence);
            }
        }

        public t() {
        }

        public t(@androidx.annotation.p0 n nVar) {
            z(nVar);
        }

        @androidx.annotation.n0
        public t A(@androidx.annotation.p0 CharSequence charSequence) {
            if (charSequence != null) {
                this.f20281e.add(n.A(charSequence));
            }
            return this;
        }

        @androidx.annotation.n0
        public t B(@androidx.annotation.p0 CharSequence charSequence) {
            this.f20304b = n.A(charSequence);
            return this;
        }

        @androidx.annotation.n0
        public t C(@androidx.annotation.p0 CharSequence charSequence) {
            this.f20305c = n.A(charSequence);
            this.f20306d = true;
            return this;
        }

        @Override // androidx.core.app.o0.y
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void b(d0 d0Var) {
            Notification.InboxStyle inboxStyleC = a.c(a.b(d0Var.a()), this.f20304b);
            if (this.f20306d) {
                a.d(inboxStyleC, this.f20305c);
            }
            Iterator<CharSequence> it = this.f20281e.iterator();
            while (it.hasNext()) {
                a.a(inboxStyleC, it.next());
            }
        }

        @Override // androidx.core.app.o0.y
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected void g(@androidx.annotation.n0 Bundle bundle) {
            super.g(bundle);
            bundle.remove(o0.X);
        }

        @Override // androidx.core.app.o0.y
        @androidx.annotation.n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected String t() {
            return f20280f;
        }

        @Override // androidx.core.app.o0.y
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected void y(@androidx.annotation.n0 Bundle bundle) {
            super.y(bundle);
            this.f20281e.clear();
            if (bundle.containsKey(o0.X)) {
                Collections.addAll(this.f20281e, bundle.getCharSequenceArray(o0.X));
            }
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class u extends y {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f20282j = "androidx.core.app.NotificationCompat$MessagingStyle";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f20283k = 25;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List<e> f20284e = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List<e> f20285f = new ArrayList();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private a3 f20286g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @androidx.annotation.p0
        private CharSequence f20287h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @androidx.annotation.p0
        private Boolean f20288i;

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(16)
        public static class a {
            private a() {
            }

            @androidx.annotation.u
            static Notification.BigTextStyle a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            @androidx.annotation.u
            static Notification.BigTextStyle b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            @androidx.annotation.u
            static Notification.BigTextStyle c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            @androidx.annotation.u
            static void d(Notification.Style style, Notification.Builder builder) {
                style.setBuilder(builder);
            }
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(24)
        public static class b {
            private b() {
            }

            @androidx.annotation.u
            static Notification$MessagingStyle a(Notification$MessagingStyle notification$MessagingStyle, Notification$MessagingStyle.Message message) {
                return notification$MessagingStyle.addMessage(message);
            }

            @androidx.annotation.u
            static Notification$MessagingStyle b(CharSequence charSequence) {
                return new Notification$MessagingStyle(charSequence);
            }

            @androidx.annotation.u
            static Notification$MessagingStyle c(Notification$MessagingStyle notification$MessagingStyle, CharSequence charSequence) {
                return notification$MessagingStyle.setConversationTitle(charSequence);
            }
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(26)
        public static class c {
            private c() {
            }

            @androidx.annotation.u
            static Notification$MessagingStyle a(Notification$MessagingStyle notification$MessagingStyle, Notification$MessagingStyle.Message message) {
                return notification$MessagingStyle.addHistoricMessage(message);
            }
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(28)
        public static class d {
            private d() {
            }

            @androidx.annotation.u
            static Notification$MessagingStyle a(Person person) {
                return new Notification$MessagingStyle(person);
            }

            @androidx.annotation.u
            static Notification$MessagingStyle b(Notification$MessagingStyle notification$MessagingStyle, boolean z10) {
                return notification$MessagingStyle.setGroupConversation(z10);
            }
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        public static final class e {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            static final String f20289g = "text";

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            static final String f20290h = "time";

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            static final String f20291i = "sender";

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            static final String f20292j = "type";

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            static final String f20293k = "uri";

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            static final String f20294l = "extras";

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            static final String f20295m = "person";

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            static final String f20296n = "sender_person";

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CharSequence f20297a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final long f20298b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @androidx.annotation.p0
            private final a3 f20299c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private Bundle f20300d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @androidx.annotation.p0
            private String f20301e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @androidx.annotation.p0
            private Uri f20302f;

            /* JADX INFO: compiled from: NotificationCompat.java */
            @androidx.annotation.w0(24)
            public static class a {
                private a() {
                }

                @androidx.annotation.u
                static Notification$MessagingStyle.Message a(CharSequence charSequence, long j10, CharSequence charSequence2) {
                    return new Notification$MessagingStyle.Message(charSequence, j10, charSequence2);
                }

                @androidx.annotation.u
                static Notification$MessagingStyle.Message b(Notification$MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            /* JADX INFO: compiled from: NotificationCompat.java */
            @androidx.annotation.w0(28)
            public static class b {
                private b() {
                }

                @androidx.annotation.u
                static Notification$MessagingStyle.Message a(CharSequence charSequence, long j10, Person person) {
                    return new Notification$MessagingStyle.Message(charSequence, j10, person);
                }
            }

            public e(@androidx.annotation.p0 CharSequence charSequence, long j10, @androidx.annotation.p0 a3 a3Var) {
                this.f20300d = new Bundle();
                this.f20297a = charSequence;
                this.f20298b = j10;
                this.f20299c = a3Var;
            }

            @Deprecated
            public e(@androidx.annotation.p0 CharSequence charSequence, long j10, @androidx.annotation.p0 CharSequence charSequence2) {
                this(charSequence, j10, new a3.c().f(charSequence2).a());
            }

            @androidx.annotation.n0
            static Bundle[] a(@androidx.annotation.n0 List<e> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    bundleArr[i10] = list.get(i10).m();
                }
                return bundleArr;
            }

            @androidx.annotation.p0
            static e e(@androidx.annotation.n0 Bundle bundle) {
                a3 a3VarA;
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        if (bundle.containsKey(f20295m)) {
                            a3VarA = a3.b(bundle.getBundle(f20295m));
                        } else if (!bundle.containsKey(f20296n) || Build.VERSION.SDK_INT < 28) {
                            a3VarA = bundle.containsKey(f20291i) ? new a3.c().f(bundle.getCharSequence(f20291i)).a() : null;
                        } else {
                            a3VarA = a3.a((Person) bundle.getParcelable(f20296n));
                        }
                        e eVar = new e(bundle.getCharSequence("text"), bundle.getLong("time"), a3VarA);
                        if (bundle.containsKey("type") && bundle.containsKey(f20293k)) {
                            eVar.k(bundle.getString("type"), (Uri) bundle.getParcelable(f20293k));
                        }
                        if (bundle.containsKey(f20294l)) {
                            eVar.d().putAll(bundle.getBundle(f20294l));
                        }
                        return eVar;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            @androidx.annotation.n0
            static List<e> f(@androidx.annotation.n0 Parcelable[] parcelableArr) {
                e eVarE;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Parcelable parcelable : parcelableArr) {
                    if ((parcelable instanceof Bundle) && (eVarE = e((Bundle) parcelable)) != null) {
                        arrayList.add(eVarE);
                    }
                }
                return arrayList;
            }

            @androidx.annotation.n0
            private Bundle m() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f20297a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f20298b);
                a3 a3Var = this.f20299c;
                if (a3Var != null) {
                    bundle.putCharSequence(f20291i, a3Var.f());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable(f20296n, this.f20299c.k());
                    } else {
                        bundle.putBundle(f20295m, this.f20299c.m());
                    }
                }
                String str = this.f20301e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f20302f;
                if (uri != null) {
                    bundle.putParcelable(f20293k, uri);
                }
                Bundle bundle2 = this.f20300d;
                if (bundle2 != null) {
                    bundle.putBundle(f20294l, bundle2);
                }
                return bundle;
            }

            @androidx.annotation.p0
            public String b() {
                return this.f20301e;
            }

            @androidx.annotation.p0
            public Uri c() {
                return this.f20302f;
            }

            @androidx.annotation.n0
            public Bundle d() {
                return this.f20300d;
            }

            @androidx.annotation.p0
            public a3 g() {
                return this.f20299c;
            }

            @androidx.annotation.p0
            @Deprecated
            public CharSequence h() {
                a3 a3Var = this.f20299c;
                if (a3Var == null) {
                    return null;
                }
                return a3Var.f();
            }

            @androidx.annotation.p0
            public CharSequence i() {
                return this.f20297a;
            }

            public long j() {
                return this.f20298b;
            }

            @androidx.annotation.n0
            public e k(@androidx.annotation.p0 String str, @androidx.annotation.p0 Uri uri) {
                this.f20301e = str;
                this.f20302f = uri;
                return this;
            }

            @androidx.annotation.n0
            @androidx.annotation.w0(24)
            @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
            Notification$MessagingStyle.Message l() {
                Notification$MessagingStyle.Message messageA;
                a3 a3VarG = g();
                if (Build.VERSION.SDK_INT >= 28) {
                    messageA = b.a(i(), j(), a3VarG != null ? a3VarG.k() : null);
                } else {
                    messageA = a.a(i(), j(), a3VarG != null ? a3VarG.f() : null);
                }
                if (b() != null) {
                    a.b(messageA, b(), c());
                }
                return messageA;
            }
        }

        u() {
        }

        public u(@androidx.annotation.n0 a3 a3Var) {
            if (TextUtils.isEmpty(a3Var.f())) {
                throw new IllegalArgumentException("User's name must not be empty.");
            }
            this.f20286g = a3Var;
        }

        @Deprecated
        public u(@androidx.annotation.n0 CharSequence charSequence) {
            this.f20286g = new a3.c().f(charSequence).a();
        }

        @androidx.annotation.p0
        public static u E(@androidx.annotation.n0 Notification notification) {
            y yVarS = y.s(notification);
            if (yVarS instanceof u) {
                return (u) yVarS;
            }
            return null;
        }

        @androidx.annotation.p0
        private e F() {
            for (int size = this.f20284e.size() - 1; size >= 0; size--) {
                e eVar = this.f20284e.get(size);
                if (eVar.g() != null && !TextUtils.isEmpty(eVar.g().f())) {
                    return eVar;
                }
            }
            if (this.f20284e.isEmpty()) {
                return null;
            }
            List<e> list = this.f20284e;
            return list.get(list.size() - 1);
        }

        private boolean L() {
            for (int size = this.f20284e.size() - 1; size >= 0; size--) {
                e eVar = this.f20284e.get(size);
                if (eVar.g() != null && eVar.g().f() == null) {
                    return true;
                }
            }
            return false;
        }

        @androidx.annotation.n0
        private TextAppearanceSpan N(int i10) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i10), null);
        }

        private CharSequence O(@androidx.annotation.n0 e eVar) {
            androidx.core.text.a aVarC = androidx.core.text.a.c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int iR = androidx.core.view.j1.f21601t;
            CharSequence charSequenceF = eVar.g() == null ? "" : eVar.g().f();
            if (TextUtils.isEmpty(charSequenceF)) {
                charSequenceF = this.f20286g.f();
                if (this.f20303a.r() != 0) {
                    iR = this.f20303a.r();
                }
            }
            CharSequence charSequenceM = aVarC.m(charSequenceF);
            spannableStringBuilder.append(charSequenceM);
            spannableStringBuilder.setSpan(N(iR), spannableStringBuilder.length() - charSequenceM.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "  ").append(aVarC.m(eVar.i() != null ? eVar.i() : ""));
            return spannableStringBuilder;
        }

        @androidx.annotation.n0
        public u A(@androidx.annotation.p0 e eVar) {
            if (eVar != null) {
                this.f20285f.add(eVar);
                if (this.f20285f.size() > 25) {
                    this.f20285f.remove(0);
                }
            }
            return this;
        }

        @androidx.annotation.n0
        public u B(@androidx.annotation.p0 e eVar) {
            if (eVar != null) {
                this.f20284e.add(eVar);
                if (this.f20284e.size() > 25) {
                    this.f20284e.remove(0);
                }
            }
            return this;
        }

        @androidx.annotation.n0
        public u C(@androidx.annotation.p0 CharSequence charSequence, long j10, @androidx.annotation.p0 a3 a3Var) {
            B(new e(charSequence, j10, a3Var));
            return this;
        }

        @androidx.annotation.n0
        @Deprecated
        public u D(@androidx.annotation.p0 CharSequence charSequence, long j10, @androidx.annotation.p0 CharSequence charSequence2) {
            this.f20284e.add(new e(charSequence, j10, new a3.c().f(charSequence2).a()));
            if (this.f20284e.size() > 25) {
                this.f20284e.remove(0);
            }
            return this;
        }

        @androidx.annotation.p0
        public CharSequence G() {
            return this.f20287h;
        }

        @androidx.annotation.n0
        public List<e> H() {
            return this.f20285f;
        }

        @androidx.annotation.n0
        public List<e> I() {
            return this.f20284e;
        }

        @androidx.annotation.n0
        public a3 J() {
            return this.f20286g;
        }

        @androidx.annotation.p0
        @Deprecated
        public CharSequence K() {
            return this.f20286g.f();
        }

        public boolean M() {
            n nVar = this.f20303a;
            if (nVar != null && nVar.f20208a.getApplicationInfo().targetSdkVersion < 28 && this.f20288i == null) {
                return this.f20287h != null;
            }
            Boolean bool = this.f20288i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        @androidx.annotation.n0
        public u P(@androidx.annotation.p0 CharSequence charSequence) {
            this.f20287h = charSequence;
            return this;
        }

        @androidx.annotation.n0
        public u Q(boolean z10) {
            this.f20288i = Boolean.valueOf(z10);
            return this;
        }

        @Override // androidx.core.app.o0.y
        public void a(@androidx.annotation.n0 Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence(o0.f20092f0, this.f20286g.f());
            bundle.putBundle(o0.f20095g0, this.f20286g.m());
            bundle.putCharSequence(o0.f20131x0, this.f20287h);
            if (this.f20287h != null && this.f20288i.booleanValue()) {
                bundle.putCharSequence(o0.f20098h0, this.f20287h);
            }
            if (!this.f20284e.isEmpty()) {
                bundle.putParcelableArray(o0.f20101i0, e.a(this.f20284e));
            }
            if (!this.f20285f.isEmpty()) {
                bundle.putParcelableArray(o0.f20103j0, e.a(this.f20285f));
            }
            Boolean bool = this.f20288i;
            if (bool != null) {
                bundle.putBoolean(o0.f20105k0, bool.booleanValue());
            }
        }

        @Override // androidx.core.app.o0.y
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void b(d0 d0Var) {
            Q(M());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                Notification$MessagingStyle notification$MessagingStyleA = i10 >= 28 ? d.a(this.f20286g.k()) : b.b(this.f20286g.f());
                Iterator<e> it = this.f20284e.iterator();
                while (it.hasNext()) {
                    b.a(notification$MessagingStyleA, it.next().l());
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    Iterator<e> it2 = this.f20285f.iterator();
                    while (it2.hasNext()) {
                        c.a(notification$MessagingStyleA, it2.next().l());
                    }
                }
                if (this.f20288i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                    b.c(notification$MessagingStyleA, this.f20287h);
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    d.b(notification$MessagingStyleA, this.f20288i.booleanValue());
                }
                a.d(notification$MessagingStyleA, d0Var.a());
                return;
            }
            e eVarF = F();
            if (this.f20287h != null && this.f20288i.booleanValue()) {
                d0Var.a().setContentTitle(this.f20287h);
            } else if (eVarF != null) {
                d0Var.a().setContentTitle("");
                if (eVarF.g() != null) {
                    d0Var.a().setContentTitle(eVarF.g().f());
                }
            }
            if (eVarF != null) {
                d0Var.a().setContentText(this.f20287h != null ? O(eVarF) : eVarF.i());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            boolean z10 = this.f20287h != null || L();
            for (int size = this.f20284e.size() - 1; size >= 0; size--) {
                e eVar = this.f20284e.get(size);
                CharSequence charSequenceO = z10 ? O(eVar) : eVar.i();
                if (size != this.f20284e.size() - 1) {
                    spannableStringBuilder.insert(0, (CharSequence) "\n");
                }
                spannableStringBuilder.insert(0, charSequenceO);
            }
            a.a(a.c(a.b(d0Var.a()), null), spannableStringBuilder);
        }

        @Override // androidx.core.app.o0.y
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected void g(@androidx.annotation.n0 Bundle bundle) {
            super.g(bundle);
            bundle.remove(o0.f20095g0);
            bundle.remove(o0.f20092f0);
            bundle.remove(o0.f20098h0);
            bundle.remove(o0.f20131x0);
            bundle.remove(o0.f20101i0);
            bundle.remove(o0.f20103j0);
            bundle.remove(o0.f20105k0);
        }

        @Override // androidx.core.app.o0.y
        @androidx.annotation.n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected String t() {
            return f20282j;
        }

        @Override // androidx.core.app.o0.y
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected void y(@androidx.annotation.n0 Bundle bundle) {
            super.y(bundle);
            this.f20284e.clear();
            if (bundle.containsKey(o0.f20095g0)) {
                this.f20286g = a3.b(bundle.getBundle(o0.f20095g0));
            } else {
                this.f20286g = new a3.c().f(bundle.getString(o0.f20092f0)).a();
            }
            CharSequence charSequence = bundle.getCharSequence(o0.f20098h0);
            this.f20287h = charSequence;
            if (charSequence == null) {
                this.f20287h = bundle.getCharSequence(o0.f20131x0);
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(o0.f20101i0);
            if (parcelableArray != null) {
                this.f20284e.addAll(e.f(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray(o0.f20103j0);
            if (parcelableArray2 != null) {
                this.f20285f.addAll(e.f(parcelableArray2));
            }
            if (bundle.containsKey(o0.f20105k0)) {
                this.f20288i = Boolean.valueOf(bundle.getBoolean(o0.f20105k0));
            }
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface v {
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface w {
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface x {
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static abstract class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected n f20303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        CharSequence f20304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        CharSequence f20305c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f20306d = false;

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(16)
        public static class a {
            private a() {
            }

            @androidx.annotation.u
            static void a(RemoteViews remoteViews, int i10, int i11, float f10) {
                remoteViews.setTextViewTextSize(i10, i11, f10);
            }

            @androidx.annotation.u
            static void b(RemoteViews remoteViews, int i10, int i11, int i12, int i13, int i14) {
                remoteViews.setViewPadding(i10, i11, i12, i13, i14);
            }
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(24)
        public static class b {
            private b() {
            }

            @androidx.annotation.u
            static void a(RemoteViews remoteViews, int i10, boolean z10) {
                remoteViews.setChronometerCountDown(i10, z10);
            }
        }

        private int f() {
            Resources resources = this.f20303a.f20208a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_top_pad);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.notification_top_pad_large_text);
            float fH = (h(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - fH) * dimensionPixelSize) + (fH * dimensionPixelSize2));
        }

        private static float h(float f10, float f11, float f12) {
            if (f10 < f11) {
                return f11;
            }
            return f10 > f12 ? f12 : f10;
        }

        @androidx.annotation.p0
        static y i(@androidx.annotation.p0 String str) {
            if (str == null) {
                return null;
            }
            switch (str) {
                case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle":
                    return new q();
                case "androidx.core.app.NotificationCompat$BigPictureStyle":
                    return new k();
                case "androidx.core.app.NotificationCompat$CallStyle":
                    return new o();
                case "androidx.core.app.NotificationCompat$InboxStyle":
                    return new t();
                case "androidx.core.app.NotificationCompat$BigTextStyle":
                    return new l();
                case "androidx.core.app.NotificationCompat$MessagingStyle":
                    return new u();
                default:
                    return null;
            }
        }

        @androidx.annotation.p0
        private static y j(@androidx.annotation.p0 String str) {
            if (str == null) {
                return null;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new k();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new l();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new t();
            }
            if (i10 >= 24) {
                if (str.equals(Notification$MessagingStyle.class.getName())) {
                    return new u();
                }
                if (str.equals(Notification$DecoratedCustomViewStyle.class.getName())) {
                    return new q();
                }
            }
            return null;
        }

        @androidx.annotation.p0
        static y k(@androidx.annotation.n0 Bundle bundle) {
            y yVarI = i(bundle.getString(o0.Z));
            if (yVarI != null) {
                return yVarI;
            }
            if (bundle.containsKey(o0.f20092f0) || bundle.containsKey(o0.f20095g0)) {
                return new u();
            }
            if (bundle.containsKey(o0.T) || bundle.containsKey(o0.U)) {
                return new k();
            }
            if (bundle.containsKey(o0.I)) {
                return new l();
            }
            if (bundle.containsKey(o0.X)) {
                return new t();
            }
            return bundle.containsKey(o0.f20107l0) ? new o() : j(bundle.getString(o0.Y));
        }

        @androidx.annotation.p0
        static y l(@androidx.annotation.n0 Bundle bundle) {
            y yVarK = k(bundle);
            if (yVarK == null) {
                return null;
            }
            try {
                yVarK.y(bundle);
                return yVarK;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        private Bitmap n(int i10, int i11, int i12) {
            return p(IconCompat.v(this.f20303a.f20208a, i10), i11, i12);
        }

        private Bitmap p(@androidx.annotation.n0 IconCompat iconCompat, int i10, int i11) {
            Drawable drawableE = iconCompat.E(this.f20303a.f20208a);
            int intrinsicWidth = i11 == 0 ? drawableE.getIntrinsicWidth() : i11;
            if (i11 == 0) {
                i11 = drawableE.getIntrinsicHeight();
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, i11, Bitmap.Config.ARGB_8888);
            drawableE.setBounds(0, 0, intrinsicWidth, i11);
            if (i10 != 0) {
                drawableE.mutate().setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            drawableE.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        }

        private Bitmap q(int i10, int i11, int i12, int i13) {
            int i14 = R.drawable.notification_icon_background;
            if (i13 == 0) {
                i13 = 0;
            }
            Bitmap bitmapN = n(i14, i13, i11);
            Canvas canvas = new Canvas(bitmapN);
            Drawable drawableMutate = this.f20303a.f20208a.getResources().getDrawable(i10).mutate();
            drawableMutate.setFilterBitmap(true);
            int i15 = (i11 - i12) / 2;
            int i16 = i12 + i15;
            drawableMutate.setBounds(i15, i15, i16, i16);
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            drawableMutate.draw(canvas);
            return bitmapN;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @androidx.annotation.p0
        public static y s(@androidx.annotation.n0 Notification notification) {
            Bundle bundleN = o0.n(notification);
            if (bundleN == null) {
                return null;
            }
            return l(bundleN);
        }

        private void u(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(R.id.title, 8);
            remoteViews.setViewVisibility(R.id.text2, 8);
            remoteViews.setViewVisibility(R.id.text, 8);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void a(@androidx.annotation.n0 Bundle bundle) {
            if (this.f20306d) {
                bundle.putCharSequence(o0.H, this.f20305c);
            }
            CharSequence charSequence = this.f20304b;
            if (charSequence != null) {
                bundle.putCharSequence(o0.C, charSequence);
            }
            String strT = t();
            if (strT != null) {
                bundle.putString(o0.Z, strT);
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void b(d0 d0Var) {
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:36:0x0109  */
        /* JADX WARN: Code duplicated, block: B:37:0x0113  */
        /* JADX WARN: Code duplicated, block: B:38:0x0118  */
        /* JADX WARN: Code duplicated, block: B:40:0x011b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:41:0x011d  */
        /* JADX WARN: Code duplicated, block: B:45:0x013f  */
        /* JADX WARN: Code duplicated, block: B:47:0x0145  */
        /* JADX WARN: Code duplicated, block: B:52:0x0172  */
        /* JADX WARN: Code duplicated, block: B:53:0x0183  */
        /* JADX WARN: Code duplicated, block: B:56:0x0188  */
        /* JADX WARN: Code duplicated, block: B:57:0x018a  */
        /* JADX WARN: Code duplicated, block: B:61:0x0193  */
        @androidx.annotation.n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews c(boolean z10, int i10, boolean z11) {
            boolean z12;
            boolean z13;
            CharSequence charSequence;
            boolean z14;
            int i11;
            int i12;
            boolean z15;
            CharSequence charSequence2;
            Resources resources = this.f20303a.f20208a.getResources();
            RemoteViews remoteViews = new RemoteViews(this.f20303a.f20208a.getPackageName(), i10);
            this.f20303a.y();
            int i13 = Build.VERSION.SDK_INT;
            n nVar = this.f20303a;
            if (nVar.f20217j != null) {
                int i14 = R.id.icon;
                remoteViews.setViewVisibility(i14, 0);
                remoteViews.setImageViewBitmap(i14, this.f20303a.f20217j);
                if (z10 && this.f20303a.U.icon != 0) {
                    int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_right_icon_size);
                    int dimensionPixelSize2 = dimensionPixelSize - (resources.getDimensionPixelSize(R.dimen.notification_small_icon_background_padding) * 2);
                    n nVar2 = this.f20303a;
                    Bitmap bitmapQ = q(nVar2.U.icon, dimensionPixelSize, dimensionPixelSize2, nVar2.r());
                    int i15 = R.id.right_icon;
                    remoteViews.setImageViewBitmap(i15, bitmapQ);
                    remoteViews.setViewVisibility(i15, 0);
                }
            } else if (z10 && nVar.U.icon != 0) {
                int i16 = R.id.icon;
                remoteViews.setViewVisibility(i16, 0);
                int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.notification_large_icon_width) - resources.getDimensionPixelSize(R.dimen.notification_big_circle_margin);
                int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.notification_small_icon_size_as_large);
                n nVar3 = this.f20303a;
                remoteViews.setImageViewBitmap(i16, q(nVar3.U.icon, dimensionPixelSize3, dimensionPixelSize4, nVar3.r()));
            }
            CharSequence charSequence3 = this.f20303a.f20212e;
            if (charSequence3 != null) {
                remoteViews.setTextViewText(R.id.title, charSequence3);
            }
            CharSequence charSequence4 = this.f20303a.f20213f;
            boolean z16 = true;
            if (charSequence4 != null) {
                remoteViews.setTextViewText(R.id.text, charSequence4);
                z12 = true;
            } else {
                z12 = false;
            }
            n nVar4 = this.f20303a;
            CharSequence charSequence5 = nVar4.f20218k;
            if (charSequence5 == null) {
                if (nVar4.f20219l > 0) {
                    if (this.f20303a.f20219l > resources.getInteger(R.integer.status_bar_notification_info_maxnum)) {
                        remoteViews.setTextViewText(R.id.info, resources.getString(R.string.status_bar_notification_info_overflow));
                    } else {
                        remoteViews.setTextViewText(R.id.info, NumberFormat.getIntegerInstance().format(this.f20303a.f20219l));
                    }
                    remoteViews.setViewVisibility(R.id.info, 0);
                } else {
                    remoteViews.setViewVisibility(R.id.info, 8);
                    z13 = false;
                }
                charSequence = this.f20303a.f20225r;
                if (charSequence != null) {
                    remoteViews.setTextViewText(R.id.text, charSequence);
                    charSequence2 = this.f20303a.f20213f;
                    if (charSequence2 != null) {
                        int i17 = R.id.text2;
                        remoteViews.setTextViewText(i17, charSequence2);
                        remoteViews.setViewVisibility(i17, 0);
                        z14 = true;
                    } else {
                        remoteViews.setViewVisibility(R.id.text2, 8);
                        z14 = false;
                    }
                } else {
                    z14 = false;
                }
                if (z14) {
                    if (z11) {
                        a.a(remoteViews, R.id.text, 0, resources.getDimensionPixelSize(R.dimen.notification_subtext_size));
                    }
                    a.b(remoteViews, R.id.line1, 0, 0, 0, 0);
                }
                if (this.f20303a.z() != 0) {
                    z16 = z13;
                } else if (this.f20303a.f20222o) {
                    i12 = R.id.chronometer;
                    remoteViews.setViewVisibility(i12, 0);
                    remoteViews.setLong(i12, "setBase", this.f20303a.z() + (SystemClock.elapsedRealtime() - System.currentTimeMillis()));
                    remoteViews.setBoolean(i12, "setStarted", true);
                    z15 = this.f20303a.f20223p;
                    if (z15 && i13 >= 24) {
                        b.a(remoteViews, i12, z15);
                    }
                } else {
                    int i18 = R.id.time;
                    remoteViews.setViewVisibility(i18, 0);
                    remoteViews.setLong(i18, "setTime", this.f20303a.z());
                }
                int i19 = R.id.right_side;
                if (z16) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                remoteViews.setViewVisibility(i19, i11);
                remoteViews.setViewVisibility(R.id.line3, z12 ? 0 : 8);
                return remoteViews;
            }
            int i20 = R.id.info;
            remoteViews.setTextViewText(i20, charSequence5);
            remoteViews.setViewVisibility(i20, 0);
            z12 = true;
            z13 = true;
            charSequence = this.f20303a.f20225r;
            if (charSequence != null) {
                remoteViews.setTextViewText(R.id.text, charSequence);
                charSequence2 = this.f20303a.f20213f;
                if (charSequence2 != null) {
                    int i110 = R.id.text2;
                    remoteViews.setTextViewText(i110, charSequence2);
                    remoteViews.setViewVisibility(i110, 0);
                    z14 = true;
                } else {
                    remoteViews.setViewVisibility(R.id.text2, 8);
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            if (z14) {
                if (z11) {
                    a.a(remoteViews, R.id.text, 0, resources.getDimensionPixelSize(R.dimen.notification_subtext_size));
                }
                a.b(remoteViews, R.id.line1, 0, 0, 0, 0);
            }
            if (this.f20303a.z() != 0) {
                z16 = z13;
            } else if (this.f20303a.f20222o) {
                i12 = R.id.chronometer;
                remoteViews.setViewVisibility(i12, 0);
                remoteViews.setLong(i12, "setBase", this.f20303a.z() + (SystemClock.elapsedRealtime() - System.currentTimeMillis()));
                remoteViews.setBoolean(i12, "setStarted", true);
                z15 = this.f20303a.f20223p;
                if (z15) {
                    b.a(remoteViews, i12, z15);
                }
            } else {
                int i111 = R.id.time;
                remoteViews.setViewVisibility(i111, 0);
                remoteViews.setLong(i111, "setTime", this.f20303a.z());
            }
            int i112 = R.id.right_side;
            if (z16) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            remoteViews.setViewVisibility(i112, i11);
            remoteViews.setViewVisibility(R.id.line3, z12 ? 0 : 8);
            return remoteViews;
        }

        @androidx.annotation.p0
        public Notification d() {
            n nVar = this.f20303a;
            if (nVar != null) {
                return nVar.h();
            }
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void e(RemoteViews remoteViews, RemoteViews remoteViews2) {
            u(remoteViews);
            int i10 = R.id.notification_main_column;
            remoteViews.removeAllViews(i10);
            remoteViews.addView(i10, remoteViews2.clone());
            remoteViews.setViewVisibility(i10, 0);
            a.b(remoteViews, R.id.notification_main_column_container, 0, f(), 0, 0);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected void g(@androidx.annotation.n0 Bundle bundle) {
            bundle.remove(o0.H);
            bundle.remove(o0.C);
            bundle.remove(o0.Z);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Bitmap m(int i10, int i11) {
            return n(i10, i11, 0);
        }

        Bitmap o(@androidx.annotation.n0 IconCompat iconCompat, int i10) {
            return p(iconCompat, i10, 0);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean r() {
            return false;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @androidx.annotation.p0
        protected String t() {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews v(d0 d0Var) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews w(d0 d0Var) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews x(d0 d0Var) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected void y(@androidx.annotation.n0 Bundle bundle) {
            if (bundle.containsKey(o0.H)) {
                this.f20305c = bundle.getCharSequence(o0.H);
                this.f20306d = true;
            }
            this.f20304b = bundle.getCharSequence(o0.C);
        }

        public void z(@androidx.annotation.p0 n nVar) {
            if (this.f20303a != nVar) {
                this.f20303a = nVar;
                if (nVar != null) {
                    nVar.z0(this);
                }
            }
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static final class z implements r {
        private static final String A = "displayIntent";
        private static final String B = "pages";
        private static final String C = "background";
        private static final String D = "contentIcon";
        private static final String E = "contentIconGravity";
        private static final String F = "contentActionIndex";
        private static final String G = "customSizePreset";
        private static final String H = "customContentHeight";
        private static final String I = "gravity";
        private static final String J = "hintScreenTimeout";
        private static final String K = "dismissalId";
        private static final String L = "bridgeTag";
        private static final int M = 1;
        private static final int N = 2;
        private static final int O = 4;
        private static final int P = 8;
        private static final int Q = 16;
        private static final int R = 32;
        private static final int S = 64;
        private static final int T = 1;
        private static final int U = 8388613;
        private static final int V = 80;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f20307o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @Deprecated
        public static final int f20308p = 0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @Deprecated
        public static final int f20309q = 1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @Deprecated
        public static final int f20310r = 2;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Deprecated
        public static final int f20311s = 3;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @Deprecated
        public static final int f20312t = 4;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @Deprecated
        public static final int f20313u = 5;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @Deprecated
        public static final int f20314v = 0;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @Deprecated
        public static final int f20315w = -1;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final String f20316x = "android.wearable.EXTENSIONS";

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final String f20317y = "actions";

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final String f20318z = "flags";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ArrayList<b> f20319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f20320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private PendingIntent f20321c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ArrayList<Notification> f20322d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Bitmap f20323e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f20324f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f20325g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f20326h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f20327i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f20328j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f20329k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f20330l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f20331m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f20332n;

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(20)
        public static class a {
            private a() {
            }

            @androidx.annotation.u
            static Notification.Action.Builder a(Notification.Action.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            @androidx.annotation.u
            static Notification.Action.Builder b(Notification.Action.Builder builder, RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
            }

            @androidx.annotation.u
            static Notification.Action c(Notification.Action.Builder builder) {
                return builder.build();
            }

            @androidx.annotation.u
            static Notification.Action.Builder d(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(i10, charSequence, pendingIntent);
            }

            @androidx.annotation.u
            public static b e(ArrayList<Parcelable> arrayList, int i10) {
                return o0.b((Notification.Action) arrayList.get(i10));
            }
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(23)
        public static class b {
            private b() {
            }

            @androidx.annotation.u
            static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(24)
        public static class c {
            private c() {
            }

            @androidx.annotation.u
            static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
                return builder.setAllowGeneratedReplies(z10);
            }
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        @androidx.annotation.w0(31)
        public static class d {
            private d() {
            }

            @androidx.annotation.u
            static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
                return builder.setAuthenticationRequired(z10);
            }
        }

        public z() {
            this.f20319a = new ArrayList<>();
            this.f20320b = 1;
            this.f20322d = new ArrayList<>();
            this.f20325g = 8388613;
            this.f20326h = -1;
            this.f20327i = 0;
            this.f20329k = 80;
        }

        public z(@androidx.annotation.n0 Notification notification) {
            this.f20319a = new ArrayList<>();
            this.f20320b = 1;
            this.f20322d = new ArrayList<>();
            this.f20325g = 8388613;
            this.f20326h = -1;
            this.f20327i = 0;
            this.f20329k = 80;
            Bundle bundleN = o0.n(notification);
            Bundle bundle = bundleN != null ? bundleN.getBundle(f20316x) : null;
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("actions");
                if (parcelableArrayList != null) {
                    int size = parcelableArrayList.size();
                    b[] bVarArr = new b[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        bVarArr[i10] = a.e(parcelableArrayList, i10);
                    }
                    Collections.addAll(this.f20319a, bVarArr);
                }
                this.f20320b = bundle.getInt("flags", 1);
                this.f20321c = (PendingIntent) bundle.getParcelable(A);
                Notification[] notificationArrU = o0.u(bundle, "pages");
                if (notificationArrU != null) {
                    Collections.addAll(this.f20322d, notificationArrU);
                }
                this.f20323e = (Bitmap) bundle.getParcelable("background");
                this.f20324f = bundle.getInt(D);
                this.f20325g = bundle.getInt(E, 8388613);
                this.f20326h = bundle.getInt(F, -1);
                this.f20327i = bundle.getInt(G, 0);
                this.f20328j = bundle.getInt(H);
                this.f20329k = bundle.getInt(I, 80);
                this.f20330l = bundle.getInt(J);
                this.f20331m = bundle.getString(K);
                this.f20332n = bundle.getString(L);
            }
        }

        private void N(int i10, boolean z10) {
            if (z10) {
                this.f20320b = i10 | this.f20320b;
            } else {
                this.f20320b = (~i10) & this.f20320b;
            }
        }

        @androidx.annotation.w0(20)
        private static Notification.Action i(b bVar) {
            int i10 = Build.VERSION.SDK_INT;
            IconCompat iconCompatF = bVar.f();
            Notification.Action.Builder builderA = b.a(iconCompatF == null ? null : iconCompatF.K(), bVar.j(), bVar.a());
            Bundle bundle = bVar.d() != null ? new Bundle(bVar.d()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", bVar.b());
            if (i10 >= 24) {
                c.a(builderA, bVar.b());
            }
            if (i10 >= 31) {
                d.a(builderA, bVar.k());
            }
            a.a(builderA, bundle);
            e3[] e3VarArrG = bVar.g();
            if (e3VarArrG != null) {
                for (RemoteInput remoteInput : e3.d(e3VarArrG)) {
                    a.b(builderA, remoteInput);
                }
            }
            return a.c(builderA);
        }

        @Deprecated
        public boolean A() {
            return (this.f20320b & 4) != 0;
        }

        @androidx.annotation.n0
        @Deprecated
        public List<Notification> B() {
            return this.f20322d;
        }

        public boolean C() {
            return (this.f20320b & 8) != 0;
        }

        @androidx.annotation.n0
        @Deprecated
        public z D(@androidx.annotation.p0 Bitmap bitmap) {
            this.f20323e = bitmap;
            return this;
        }

        @androidx.annotation.n0
        public z E(@androidx.annotation.p0 String str) {
            this.f20332n = str;
            return this;
        }

        @androidx.annotation.n0
        public z F(int i10) {
            this.f20326h = i10;
            return this;
        }

        @androidx.annotation.n0
        @Deprecated
        public z G(int i10) {
            this.f20324f = i10;
            return this;
        }

        @androidx.annotation.n0
        @Deprecated
        public z H(int i10) {
            this.f20325g = i10;
            return this;
        }

        @androidx.annotation.n0
        public z I(boolean z10) {
            N(1, z10);
            return this;
        }

        @androidx.annotation.n0
        @Deprecated
        public z J(int i10) {
            this.f20328j = i10;
            return this;
        }

        @androidx.annotation.n0
        @Deprecated
        public z K(int i10) {
            this.f20327i = i10;
            return this;
        }

        @androidx.annotation.n0
        public z L(@androidx.annotation.p0 String str) {
            this.f20331m = str;
            return this;
        }

        @androidx.annotation.n0
        @Deprecated
        public z M(@androidx.annotation.p0 PendingIntent pendingIntent) {
            this.f20321c = pendingIntent;
            return this;
        }

        @androidx.annotation.n0
        @Deprecated
        public z O(int i10) {
            this.f20329k = i10;
            return this;
        }

        @androidx.annotation.n0
        @Deprecated
        public z P(boolean z10) {
            N(32, z10);
            return this;
        }

        @androidx.annotation.n0
        @Deprecated
        public z Q(boolean z10) {
            N(16, z10);
            return this;
        }

        @androidx.annotation.n0
        public z R(boolean z10) {
            N(64, z10);
            return this;
        }

        @androidx.annotation.n0
        @Deprecated
        public z S(boolean z10) {
            N(2, z10);
            return this;
        }

        @androidx.annotation.n0
        @Deprecated
        public z T(int i10) {
            this.f20330l = i10;
            return this;
        }

        @androidx.annotation.n0
        @Deprecated
        public z U(boolean z10) {
            N(4, z10);
            return this;
        }

        @androidx.annotation.n0
        public z V(boolean z10) {
            N(8, z10);
            return this;
        }

        @Override // androidx.core.app.o0.r
        @androidx.annotation.n0
        public n a(@androidx.annotation.n0 n nVar) {
            Bundle bundle = new Bundle();
            if (!this.f20319a.isEmpty()) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f20319a.size());
                Iterator<b> it = this.f20319a.iterator();
                while (it.hasNext()) {
                    arrayList.add(i(it.next()));
                }
                bundle.putParcelableArrayList("actions", arrayList);
            }
            int i10 = this.f20320b;
            if (i10 != 1) {
                bundle.putInt("flags", i10);
            }
            PendingIntent pendingIntent = this.f20321c;
            if (pendingIntent != null) {
                bundle.putParcelable(A, pendingIntent);
            }
            if (!this.f20322d.isEmpty()) {
                ArrayList<Notification> arrayList2 = this.f20322d;
                bundle.putParcelableArray("pages", (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
            }
            Bitmap bitmap = this.f20323e;
            if (bitmap != null) {
                bundle.putParcelable("background", bitmap);
            }
            int i11 = this.f20324f;
            if (i11 != 0) {
                bundle.putInt(D, i11);
            }
            int i12 = this.f20325g;
            if (i12 != 8388613) {
                bundle.putInt(E, i12);
            }
            int i13 = this.f20326h;
            if (i13 != -1) {
                bundle.putInt(F, i13);
            }
            int i14 = this.f20327i;
            if (i14 != 0) {
                bundle.putInt(G, i14);
            }
            int i15 = this.f20328j;
            if (i15 != 0) {
                bundle.putInt(H, i15);
            }
            int i16 = this.f20329k;
            if (i16 != 80) {
                bundle.putInt(I, i16);
            }
            int i17 = this.f20330l;
            if (i17 != 0) {
                bundle.putInt(J, i17);
            }
            String str = this.f20331m;
            if (str != null) {
                bundle.putString(K, str);
            }
            String str2 = this.f20332n;
            if (str2 != null) {
                bundle.putString(L, str2);
            }
            nVar.t().putBundle(f20316x, bundle);
            return nVar;
        }

        @androidx.annotation.n0
        public z b(@androidx.annotation.n0 b bVar) {
            this.f20319a.add(bVar);
            return this;
        }

        @androidx.annotation.n0
        public z c(@androidx.annotation.n0 List<b> list) {
            this.f20319a.addAll(list);
            return this;
        }

        @androidx.annotation.n0
        @Deprecated
        public z d(@androidx.annotation.n0 Notification notification) {
            this.f20322d.add(notification);
            return this;
        }

        @androidx.annotation.n0
        @Deprecated
        public z e(@androidx.annotation.n0 List<Notification> list) {
            this.f20322d.addAll(list);
            return this;
        }

        @androidx.annotation.n0
        public z f() {
            this.f20319a.clear();
            return this;
        }

        @androidx.annotation.n0
        @Deprecated
        public z g() {
            this.f20322d.clear();
            return this;
        }

        @androidx.annotation.n0
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public z clone() {
            z zVar = new z();
            zVar.f20319a = new ArrayList<>(this.f20319a);
            zVar.f20320b = this.f20320b;
            zVar.f20321c = this.f20321c;
            zVar.f20322d = new ArrayList<>(this.f20322d);
            zVar.f20323e = this.f20323e;
            zVar.f20324f = this.f20324f;
            zVar.f20325g = this.f20325g;
            zVar.f20326h = this.f20326h;
            zVar.f20327i = this.f20327i;
            zVar.f20328j = this.f20328j;
            zVar.f20329k = this.f20329k;
            zVar.f20330l = this.f20330l;
            zVar.f20331m = this.f20331m;
            zVar.f20332n = this.f20332n;
            return zVar;
        }

        @androidx.annotation.n0
        public List<b> j() {
            return this.f20319a;
        }

        @androidx.annotation.p0
        @Deprecated
        public Bitmap k() {
            return this.f20323e;
        }

        @androidx.annotation.p0
        public String l() {
            return this.f20332n;
        }

        public int m() {
            return this.f20326h;
        }

        @Deprecated
        public int n() {
            return this.f20324f;
        }

        @Deprecated
        public int o() {
            return this.f20325g;
        }

        public boolean p() {
            return (this.f20320b & 1) != 0;
        }

        @Deprecated
        public int q() {
            return this.f20328j;
        }

        @Deprecated
        public int r() {
            return this.f20327i;
        }

        @androidx.annotation.p0
        public String s() {
            return this.f20331m;
        }

        @androidx.annotation.p0
        @Deprecated
        public PendingIntent t() {
            return this.f20321c;
        }

        @Deprecated
        public int u() {
            return this.f20329k;
        }

        @Deprecated
        public boolean v() {
            return (this.f20320b & 32) != 0;
        }

        @Deprecated
        public boolean w() {
            return (this.f20320b & 16) != 0;
        }

        public boolean x() {
            return (this.f20320b & 64) != 0;
        }

        @Deprecated
        public boolean y() {
            return (this.f20320b & 2) != 0;
        }

        @Deprecated
        public int z() {
            return this.f20330l;
        }
    }

    @Deprecated
    public o0() {
    }

    @androidx.annotation.p0
    public static String A(@androidx.annotation.n0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return f.e(notification);
        }
        return null;
    }

    @androidx.annotation.w0(19)
    public static boolean B(@androidx.annotation.n0 Notification notification) {
        return notification.extras.getBoolean(S);
    }

    @androidx.annotation.p0
    public static String C(@androidx.annotation.n0 Notification notification) {
        return c.i(notification);
    }

    @androidx.annotation.w0(19)
    @androidx.annotation.p0
    public static CharSequence D(@androidx.annotation.n0 Notification notification) {
        return notification.extras.getCharSequence(E);
    }

    public static long E(@androidx.annotation.n0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return f.f(notification);
        }
        return 0L;
    }

    @androidx.annotation.w0(19)
    public static boolean F(@androidx.annotation.n0 Notification notification) {
        return notification.extras.getBoolean(P);
    }

    public static int G(@androidx.annotation.n0 Notification notification) {
        return notification.visibility;
    }

    public static boolean H(@androidx.annotation.n0 Notification notification) {
        return (notification.flags & 512) != 0;
    }

    @androidx.annotation.p0
    public static b a(@androidx.annotation.n0 Notification notification, int i10) {
        return b(notification.actions[i10]);
    }

    @androidx.annotation.n0
    @androidx.annotation.w0(20)
    static b b(@androidx.annotation.n0 Notification.Action action) {
        e3[] e3VarArr;
        int i10;
        RemoteInput[] remoteInputArrG = c.g(action);
        if (remoteInputArrG == null) {
            e3VarArr = null;
        } else {
            e3[] e3VarArr2 = new e3[remoteInputArrG.length];
            for (int i11 = 0; i11 < remoteInputArrG.length; i11++) {
                RemoteInput remoteInput = remoteInputArrG[i11];
                e3VarArr2[i11] = new e3(c.h(remoteInput), c.f(remoteInput), c.b(remoteInput), c.a(remoteInput), Build.VERSION.SDK_INT >= 29 ? h.c(remoteInput) : 0, c.d(remoteInput), null);
            }
            e3VarArr = e3VarArr2;
        }
        int i12 = Build.VERSION.SDK_INT;
        boolean z10 = i12 >= 24 ? c.c(action).getBoolean("android.support.allowGeneratedReplies") || e.a(action) : c.c(action).getBoolean("android.support.allowGeneratedReplies");
        boolean z11 = c.c(action).getBoolean("android.support.action.showsUserInterface", true);
        int iA = i12 >= 28 ? g.a(action) : c.c(action).getInt("android.support.action.semanticAction", 0);
        boolean zE = i12 >= 29 ? h.e(action) : false;
        boolean zA = i12 >= 31 ? i.a(action) : false;
        if (d.a(action) != null || (i10 = action.icon) == 0) {
            return new b(d.a(action) != null ? IconCompat.h(d.a(action)) : null, action.title, action.actionIntent, c.c(action), e3VarArr, (e3[]) null, z10, iA, z11, zE, zA);
        }
        return new b(i10, action.title, action.actionIntent, c.c(action), e3VarArr, (e3[]) null, z10, iA, z11, zE, zA);
    }

    public static int c(@androidx.annotation.n0 Notification notification) {
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr.length;
        }
        return 0;
    }

    public static boolean d(@androidx.annotation.n0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return h.a(notification);
        }
        return false;
    }

    public static boolean e(@androidx.annotation.n0 Notification notification) {
        return (notification.flags & 16) != 0;
    }

    public static int f(@androidx.annotation.n0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return f.a(notification);
        }
        return 0;
    }

    @androidx.annotation.p0
    public static m g(@androidx.annotation.n0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return m.a(h.b(notification));
        }
        return null;
    }

    @androidx.annotation.p0
    public static String h(@androidx.annotation.n0 Notification notification) {
        return notification.category;
    }

    @androidx.annotation.p0
    public static String i(@androidx.annotation.n0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return f.b(notification);
        }
        return null;
    }

    public static int j(@androidx.annotation.n0 Notification notification) {
        return notification.color;
    }

    @androidx.annotation.w0(19)
    @androidx.annotation.p0
    public static CharSequence k(@androidx.annotation.n0 Notification notification) {
        return notification.extras.getCharSequence(G);
    }

    @androidx.annotation.w0(19)
    @androidx.annotation.p0
    public static CharSequence l(@androidx.annotation.n0 Notification notification) {
        return notification.extras.getCharSequence(D);
    }

    @androidx.annotation.w0(19)
    @androidx.annotation.p0
    public static CharSequence m(@androidx.annotation.n0 Notification notification) {
        return notification.extras.getCharSequence(B);
    }

    @androidx.annotation.p0
    public static Bundle n(@androidx.annotation.n0 Notification notification) {
        return notification.extras;
    }

    @androidx.annotation.p0
    public static String o(@androidx.annotation.n0 Notification notification) {
        return c.e(notification);
    }

    public static int p(@androidx.annotation.n0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return f.c(notification);
        }
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    static boolean q(@androidx.annotation.n0 Notification notification) {
        return (notification.flags & 128) != 0;
    }

    @androidx.annotation.n0
    @androidx.annotation.w0(21)
    public static List<b> r(@androidx.annotation.n0 Notification notification) {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle2 != null && (bundle = bundle2.getBundle("invisible_actions")) != null) {
            for (int i10 = 0; i10 < bundle.size(); i10++) {
                arrayList.add(i2.g(bundle.getBundle(Integer.toString(i10))));
            }
        }
        return arrayList;
    }

    public static boolean s(@androidx.annotation.n0 Notification notification) {
        return (notification.flags & 256) != 0;
    }

    @androidx.annotation.p0
    public static androidx.core.content.m0 t(@androidx.annotation.n0 Notification notification) {
        LocusId locusIdD;
        if (Build.VERSION.SDK_INT < 29 || (locusIdD = h.d(notification)) == null) {
            return null;
        }
        return androidx.core.content.m0.d(locusIdD);
    }

    @androidx.annotation.n0
    static Notification[] u(@androidx.annotation.n0 Bundle bundle, @androidx.annotation.n0 String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        for (int i10 = 0; i10 < parcelableArray.length; i10++) {
            notificationArr[i10] = (Notification) parcelableArray[i10];
        }
        bundle.putParcelableArray(str, notificationArr);
        return notificationArr;
    }

    public static boolean v(@androidx.annotation.n0 Notification notification) {
        return (notification.flags & 2) != 0;
    }

    public static boolean w(@androidx.annotation.n0 Notification notification) {
        return (notification.flags & 8) != 0;
    }

    @androidx.annotation.n0
    public static List<a3> x(@androidx.annotation.n0 Notification notification) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(f20080b0);
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(a3.a((Person) it.next()));
                }
            }
        } else {
            String[] stringArray = notification.extras.getStringArray(f20077a0);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    arrayList.add(new a3.c().g(str).a());
                }
            }
        }
        return arrayList;
    }

    @androidx.annotation.p0
    public static Notification y(@androidx.annotation.n0 Notification notification) {
        return notification.publicVersion;
    }

    @androidx.annotation.p0
    public static CharSequence z(@androidx.annotation.n0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return f.d(notification);
        }
        return null;
    }
}
