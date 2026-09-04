package androidx.compose.ui.text.style;

import androidx.compose.runtime.m0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.ak;
import com.umeng.message.common.UPushNotificationChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.u;

/* JADX INFO: renamed from: androidx.compose.ui.text.style.f, reason: from toString */
/* JADX INFO: compiled from: LineBreak.android.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0004\u0011\u0015\u0017\bB\"\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R \u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/text/style/f;", "", "Landroidx/compose/ui/text/style/f$b;", Constants.KEY_STRATEGY, "Landroidx/compose/ui/text/style/f$c;", "strictness", "Landroidx/compose/ui/text/style/f$d;", "wordBreak", "d", "(III)Landroidx/compose/ui/text/style/f;", "other", "", "equals", "", "hashCode", "", "toString", ak.av, "I", "f", "()I", "b", "g", ak.aF, RXScreenCaptureService.KEY_HEIGHT, "<init>", "(IIILkotlin/jvm/internal/u;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@androidx.compose.ui.text.g
public final class LineBreak {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final LineBreak f16897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final LineBreak f16898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final LineBreak f16899g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int strategy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int strictness;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int wordBreak;

    /* JADX INFO: renamed from: androidx.compose.ui.text.style.f$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: LineBreak.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/style/f$a;", "", "Landroidx/compose/ui/text/style/f;", "Simple", "Landroidx/compose/ui/text/style/f;", ak.aF, "()Landroidx/compose/ui/text/style/f;", "Heading", ak.av, "Paragraph", "b", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @dl.d
        public final LineBreak a() {
            return LineBreak.f16898f;
        }

        @dl.d
        public final LineBreak b() {
            return LineBreak.f16899g;
        }

        @dl.d
        public final LineBreak c() {
            return LineBreak.f16897e;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.style.f$b */
    /* JADX INFO: compiled from: LineBreak.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\fB\u0014\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u000e\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/style/f$b;", "", "", "i", "(I)Ljava/lang/String;", "", RXScreenCaptureService.KEY_HEIGHT, "(I)I", "other", "", "f", "(ILjava/lang/Object;)Z", ak.av, "I", "value", "e", "b", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    @xh.f
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f16904c = e(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f16905d = e(2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f16906e = e(3);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int value;

        /* JADX INFO: renamed from: androidx.compose.ui.text.style.f$b$a, reason: from kotlin metadata */
        /* JADX INFO: compiled from: LineBreak.android.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/style/f$b$a;", "", "Landroidx/compose/ui/text/style/f$b;", "Simple", "I", ak.aF, "()I", "HighQuality", "b", "Balanced", ak.av, "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final int a() {
                return b.f16906e;
            }

            public final int b() {
                return b.f16905d;
            }

            public final int c() {
                return b.f16904c;
            }
        }

        private /* synthetic */ b(int i10) {
            this.value = i10;
        }

        public static final /* synthetic */ b d(int i10) {
            return new b(i10);
        }

        private static int e(int i10) {
            return i10;
        }

        public static boolean f(int i10, Object obj) {
            return (obj instanceof b) && i10 == ((b) obj).getValue();
        }

        public static final boolean g(int i10, int i11) {
            return i10 == i11;
        }

        public static int h(int i10) {
            return i10;
        }

        @dl.d
        public static String i(int i10) {
            if (g(i10, f16904c)) {
                return "Strategy.Simple";
            }
            if (g(i10, f16905d)) {
                return "Strategy.HighQuality";
            }
            return g(i10, f16906e) ? "Strategy.Balanced" : "Invalid";
        }

        public boolean equals(Object obj) {
            return f(this.value, obj);
        }

        public int hashCode() {
            return h(this.value);
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }

        @dl.d
        public String toString() {
            return i(this.value);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.style.f$c */
    /* JADX INFO: compiled from: LineBreak.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\fB\u0014\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u000e\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/style/f$c;", "", "", "j", "(I)Ljava/lang/String;", "", "i", "(I)I", "other", "", "g", "(ILjava/lang/Object;)Z", ak.av, "I", "value", "f", "b", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    @xh.f
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f16909c = f(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f16910d = f(2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f16911e = f(3);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f16912f = f(4);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int value;

        /* JADX INFO: renamed from: androidx.compose.ui.text.style.f$c$a, reason: from kotlin metadata */
        /* JADX INFO: compiled from: LineBreak.android.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/style/f$c$a;", "", "Landroidx/compose/ui/text/style/f$c;", UPushNotificationChannel.DEFAULT_NOTIFICATION_CHANNEL_NAME, "I", ak.av, "()I", "Loose", "b", "Normal", ak.aF, "Strict", "d", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final int a() {
                return c.f16909c;
            }

            public final int b() {
                return c.f16910d;
            }

            public final int c() {
                return c.f16911e;
            }

            public final int d() {
                return c.f16912f;
            }
        }

        private /* synthetic */ c(int i10) {
            this.value = i10;
        }

        public static final /* synthetic */ c e(int i10) {
            return new c(i10);
        }

        private static int f(int i10) {
            return i10;
        }

        public static boolean g(int i10, Object obj) {
            return (obj instanceof c) && i10 == ((c) obj).getValue();
        }

        public static final boolean h(int i10, int i11) {
            return i10 == i11;
        }

        public static int i(int i10) {
            return i10;
        }

        @dl.d
        public static String j(int i10) {
            if (h(i10, f16909c)) {
                return "Strictness.None";
            }
            if (h(i10, f16910d)) {
                return "Strictness.Loose";
            }
            if (h(i10, f16911e)) {
                return "Strictness.Normal";
            }
            return h(i10, f16912f) ? "Strictness.Strict" : "Invalid";
        }

        public boolean equals(Object obj) {
            return g(this.value, obj);
        }

        public int hashCode() {
            return i(this.value);
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }

        @dl.d
        public String toString() {
            return j(this.value);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.style.f$d */
    /* JADX INFO: compiled from: LineBreak.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\fB\u0014\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u000e\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/style/f$d;", "", "", RXScreenCaptureService.KEY_HEIGHT, "(I)Ljava/lang/String;", "", "g", "(I)I", "other", "", "e", "(ILjava/lang/Object;)Z", ak.av, "I", "value", "d", "b", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    @xh.f
    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f16915c = d(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f16916d = d(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int value;

        /* JADX INFO: renamed from: androidx.compose.ui.text.style.f$d$a, reason: from kotlin metadata */
        /* JADX INFO: compiled from: LineBreak.android.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/style/f$d$a;", "", "Landroidx/compose/ui/text/style/f$d;", UPushNotificationChannel.DEFAULT_NOTIFICATION_CHANNEL_NAME, "I", ak.av, "()I", "Phrase", "b", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final int a() {
                return d.f16915c;
            }

            public final int b() {
                return d.f16916d;
            }
        }

        private /* synthetic */ d(int i10) {
            this.value = i10;
        }

        public static final /* synthetic */ d c(int i10) {
            return new d(i10);
        }

        private static int d(int i10) {
            return i10;
        }

        public static boolean e(int i10, Object obj) {
            return (obj instanceof d) && i10 == ((d) obj).getValue();
        }

        public static final boolean f(int i10, int i11) {
            return i10 == i11;
        }

        public static int g(int i10) {
            return i10;
        }

        @dl.d
        public static String h(int i10) {
            if (f(i10, f16915c)) {
                return "WordBreak.None";
            }
            return f(i10, f16916d) ? "WordBreak.Phrase" : "Invalid";
        }

        public boolean equals(Object obj) {
            return e(this.value, obj);
        }

        public int hashCode() {
            return g(this.value);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }

        @dl.d
        public String toString() {
            return h(this.value);
        }
    }

    static {
        u uVar = null;
        INSTANCE = new Companion(uVar);
        b.Companion companion = b.INSTANCE;
        int iC = companion.c();
        c.Companion companion2 = c.INSTANCE;
        int iC2 = companion2.c();
        d.Companion companion3 = d.INSTANCE;
        f16897e = new LineBreak(iC, iC2, companion3.a(), uVar);
        f16898f = new LineBreak(companion.a(), companion2.b(), companion3.b(), uVar);
        f16899g = new LineBreak(companion.b(), companion2.d(), companion3.a(), uVar);
    }

    private LineBreak(int i10, int i11, int i12) {
        this.strategy = i10;
        this.strictness = i11;
        this.wordBreak = i12;
    }

    public /* synthetic */ LineBreak(int i10, int i11, int i12, u uVar) {
        this(i10, i11, i12);
    }

    public static /* synthetic */ LineBreak e(LineBreak lineBreak, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = lineBreak.strategy;
        }
        if ((i13 & 2) != 0) {
            i11 = lineBreak.strictness;
        }
        if ((i13 & 4) != 0) {
            i12 = lineBreak.wordBreak;
        }
        return lineBreak.d(i10, i11, i12);
    }

    @dl.d
    public final LineBreak d(int strategy, int strictness, int wordBreak) {
        return new LineBreak(strategy, strictness, wordBreak, null);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LineBreak)) {
            return false;
        }
        LineBreak lineBreak = (LineBreak) other;
        return b.g(this.strategy, lineBreak.strategy) && c.h(this.strictness, lineBreak.strictness) && d.f(this.wordBreak, lineBreak.wordBreak);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getStrategy() {
        return this.strategy;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getStrictness() {
        return this.strictness;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getWordBreak() {
        return this.wordBreak;
    }

    public int hashCode() {
        return (((b.h(this.strategy) * 31) + c.i(this.strictness)) * 31) + d.g(this.wordBreak);
    }

    @dl.d
    public String toString() {
        return "LineBreak(strategy=" + ((Object) b.i(this.strategy)) + ", strictness=" + ((Object) c.j(this.strictness)) + ", wordBreak=" + ((Object) d.h(this.wordBreak)) + ')';
    }
}
