package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.platform.d2;
import androidx.core.app.o0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TextSelectionMouseDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0016\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0011\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/text/selection/b;", "", "Landroidx/compose/ui/input/pointer/p;", o0.I0, "Lkotlin/b2;", "g", "Landroidx/compose/ui/input/pointer/y;", "prevClick", "newClick", "", "f", ak.aF, "Landroidx/compose/ui/platform/d2;", ak.av, "Landroidx/compose/ui/platform/d2;", "viewConfiguration", "", "b", "I", "()I", "d", "(I)V", "clicks", "Landroidx/compose/ui/input/pointer/y;", "()Landroidx/compose/ui/input/pointer/y;", "e", "(Landroidx/compose/ui/input/pointer/y;)V", "<init>", "(Landroidx/compose/ui/platform/d2;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final d2 viewConfiguration;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int clicks;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private PointerInputChange prevClick;

    public b(@dl.d d2 viewConfiguration) {
        f0.p(viewConfiguration, "viewConfiguration");
        this.viewConfiguration = viewConfiguration;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getClicks() {
        return this.clicks;
    }

    @dl.e
    /* JADX INFO: renamed from: b, reason: from getter */
    public final PointerInputChange getPrevClick() {
        return this.prevClick;
    }

    public final boolean c(@dl.d PointerInputChange prevClick, @dl.d PointerInputChange newClick) {
        f0.p(prevClick, "prevClick");
        f0.p(newClick, "newClick");
        return ((double) b1.f.m(b1.f.u(newClick.getPosition(), prevClick.getPosition()))) < 100.0d;
    }

    public final void d(int i10) {
        this.clicks = i10;
    }

    public final void e(@dl.e PointerInputChange pointerInputChange) {
        this.prevClick = pointerInputChange;
    }

    public final boolean f(@dl.d PointerInputChange prevClick, @dl.d PointerInputChange newClick) {
        f0.p(prevClick, "prevClick");
        f0.p(newClick, "newClick");
        return newClick.getUptimeMillis() - prevClick.getUptimeMillis() < this.viewConfiguration.c();
    }

    public final void g(@dl.d androidx.compose.ui.input.pointer.p event) {
        f0.p(event, "event");
        PointerInputChange pointerInputChange = this.prevClick;
        PointerInputChange pointerInputChange2 = event.e().get(0);
        if (pointerInputChange != null && f(pointerInputChange, pointerInputChange2) && c(pointerInputChange, pointerInputChange2)) {
            this.clicks++;
        } else {
            this.clicks = 1;
        }
        this.prevClick = pointerInputChange2;
    }
}
