package androidx.compose.ui.text;

import com.umeng.analytics.pro.ak;
import com.umeng.message.common.UPushNotificationChannel;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.text.y, reason: from toString */
/* JADX INFO: compiled from: AndroidTextStyle.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\nB\u0013\b\u0017\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012B\t\b\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000R \u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/y;", "", "other", "", "equals", "", "hashCode", "", "toString", "d", ak.av, "Z", "b", "()Z", "getIncludeFontPadding$annotations", "()V", "includeFontPadding", "<init>", "(Z)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class PlatformParagraphStyle {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f17001c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean includeFontPadding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final PlatformParagraphStyle f17002d = new PlatformParagraphStyle();

    /* JADX INFO: renamed from: androidx.compose.ui.text.y$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AndroidTextStyle.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/y$a;", "", "Landroidx/compose/ui/text/y;", UPushNotificationChannel.DEFAULT_NOTIFICATION_CHANNEL_NAME, "Landroidx/compose/ui/text/y;", ak.av, "()Landroidx/compose/ui/text/y;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final PlatformParagraphStyle a() {
            return PlatformParagraphStyle.f17002d;
        }
    }

    public PlatformParagraphStyle() {
        this(true);
    }

    @kotlin.k(message = "Provides configuration options for behavior compatibility.")
    public PlatformParagraphStyle(boolean z10) {
        this.includeFontPadding = z10;
    }

    public /* synthetic */ PlatformParagraphStyle(boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? true : z10);
    }

    @kotlin.k(message = "Sets includeFontPadding parameter for transitioning. Will be removed.")
    public static /* synthetic */ void c() {
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIncludeFontPadding() {
        return this.includeFontPadding;
    }

    @dl.d
    public final PlatformParagraphStyle d(@dl.e PlatformParagraphStyle other) {
        return other == null ? this : other;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PlatformParagraphStyle) && this.includeFontPadding == ((PlatformParagraphStyle) other).includeFontPadding;
    }

    public int hashCode() {
        return androidx.compose.foundation.b0.a(this.includeFontPadding);
    }

    @dl.d
    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.includeFontPadding + ')';
    }
}
