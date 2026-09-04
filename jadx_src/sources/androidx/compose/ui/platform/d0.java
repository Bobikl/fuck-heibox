package androidx.compose.ui.platform;

import android.view.ViewConfiguration;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidViewConfiguration.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/d0;", "Landroidx/compose/ui/platform/d2;", "Landroid/view/ViewConfiguration;", ak.av, "Landroid/view/ViewConfiguration;", "viewConfiguration", "", "d", "()J", "longPressTimeoutMillis", ak.aF, "doubleTapTimeoutMillis", "doubleTapMinTimeMillis", "", "b", "()F", "touchSlop", "<init>", "(Landroid/view/ViewConfiguration;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class d0 implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f15829b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final ViewConfiguration viewConfiguration;

    public d0(@dl.d ViewConfiguration viewConfiguration) {
        kotlin.jvm.internal.f0.p(viewConfiguration, "viewConfiguration");
        this.viewConfiguration = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.d2
    public long a() {
        return 40L;
    }

    @Override // androidx.compose.ui.platform.d2
    public float b() {
        return this.viewConfiguration.getScaledTouchSlop();
    }

    @Override // androidx.compose.ui.platform.d2
    public long c() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.ui.platform.d2
    public long d() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.ui.platform.d2
    public /* synthetic */ long e() {
        return c2.a(this);
    }
}
