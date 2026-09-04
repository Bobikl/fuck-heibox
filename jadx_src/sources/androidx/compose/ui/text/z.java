package androidx.compose.ui.text;

import com.umeng.analytics.pro.ak;
import com.umeng.message.common.UPushNotificationChannel;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidTextStyle.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/z;", "", "other", "b", "", "equals", "", "hashCode", "", "toString", "<init>", "()V", ak.av, "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f17005b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final z f17006c = new z();

    /* JADX INFO: renamed from: androidx.compose.ui.text.z$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AndroidTextStyle.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/z$a;", "", "Landroidx/compose/ui/text/z;", UPushNotificationChannel.DEFAULT_NOTIFICATION_CHANNEL_NAME, "Landroidx/compose/ui/text/z;", ak.av, "()Landroidx/compose/ui/text/z;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final z a() {
            return z.f17006c;
        }
    }

    @dl.d
    public final z b(@dl.e z other) {
        return this;
    }

    public boolean equals(@dl.e Object other) {
        return this == other || (other instanceof z);
    }

    public int hashCode() {
        return super.hashCode();
    }

    @dl.d
    public String toString() {
        return "PlatformSpanStyle()";
    }
}
