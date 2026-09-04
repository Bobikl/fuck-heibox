package androidx.compose.ui.input.pointer;

import com.umeng.analytics.pro.ak;
import com.umeng.message.common.UPushNotificationChannel;
import kotlin.Metadata;

/* JADX INFO: compiled from: PointerIcon.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.ui.g
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\n\u0010\u0005R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/input/pointer/u;", "", "Landroidx/compose/ui/input/pointer/t;", "b", "Landroidx/compose/ui/input/pointer/t;", "()Landroidx/compose/ui/input/pointer/t;", UPushNotificationChannel.DEFAULT_NOTIFICATION_CHANNEL_NAME, ak.aF, ak.av, "Crosshair", "d", "Text", "e", "Hand", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final u f14827a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final t Default = w.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final t Crosshair = w.c();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final t Text = w.f();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final t Hand = w.e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f14832f = 0;

    private u() {
    }

    @dl.d
    public final t a() {
        return Crosshair;
    }

    @dl.d
    public final t b() {
        return Default;
    }

    @dl.d
    public final t c() {
        return Hand;
    }

    @dl.d
    public final t d() {
        return Text;
    }
}
