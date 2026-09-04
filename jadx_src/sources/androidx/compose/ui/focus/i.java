package androidx.compose.ui.focus;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FocusOrderModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.k(message = "Use FocusProperties instead")
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b \u0010!B\t\b\u0016¢\u0006\u0004\b \u0010\"R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\t\"\u0004\b\u0013\u0010\u000bR$\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u000bR$\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\t\"\u0004\b\u0019\u0010\u000bR$\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\t\"\u0004\b\u001c\u0010\u000bR$\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\t\"\u0004\b\u001f\u0010\u000b¨\u0006#"}, d2 = {"Landroidx/compose/ui/focus/i;", "", "Landroidx/compose/ui/focus/p;", ak.av, "Landroidx/compose/ui/focus/p;", "focusProperties", "Landroidx/compose/ui/focus/FocusRequester;", "next", "d", "()Landroidx/compose/ui/focus/FocusRequester;", "l", "(Landroidx/compose/ui/focus/FocusRequester;)V", "previous", "e", "m", CommonNetImpl.UP, RXScreenCaptureService.KEY_HEIGHT, "p", "down", "i", com.google.android.exoplayer2.text.ttml.d.f49793l0, ak.aF, "k", com.google.android.exoplayer2.text.ttml.d.f49796n0, "f", "n", com.google.android.exoplayer2.text.ttml.d.f49798o0, "g", "o", com.google.android.exoplayer2.text.ttml.d.f49800p0, "b", "j", "<init>", "(Landroidx/compose/ui/focus/p;)V", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f13590b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final p focusProperties;

    public i() {
        this(new FocusPropertiesImpl());
    }

    public i(@dl.d p focusProperties) {
        f0.p(focusProperties, "focusProperties");
        this.focusProperties = focusProperties;
    }

    @dl.d
    public final FocusRequester a() {
        return this.focusProperties.getDown();
    }

    @dl.d
    public final FocusRequester b() {
        return this.focusProperties.getEnd();
    }

    @dl.d
    public final FocusRequester c() {
        return this.focusProperties.getLeft();
    }

    @dl.d
    public final FocusRequester d() {
        return this.focusProperties.getNext();
    }

    @dl.d
    public final FocusRequester e() {
        return this.focusProperties.getPrevious();
    }

    @dl.d
    public final FocusRequester f() {
        return this.focusProperties.getRight();
    }

    @dl.d
    public final FocusRequester g() {
        return this.focusProperties.getStart();
    }

    @dl.d
    public final FocusRequester h() {
        return this.focusProperties.getUp();
    }

    public final void i(@dl.d FocusRequester down) {
        f0.p(down, "down");
        this.focusProperties.M(down);
    }

    public final void j(@dl.d FocusRequester end) {
        f0.p(end, "end");
        this.focusProperties.T(end);
    }

    public final void k(@dl.d FocusRequester left) {
        f0.p(left, "left");
        this.focusProperties.U(left);
    }

    public final void l(@dl.d FocusRequester next) {
        f0.p(next, "next");
        this.focusProperties.X(next);
    }

    public final void m(@dl.d FocusRequester previous) {
        f0.p(previous, "previous");
        this.focusProperties.Q(previous);
    }

    public final void n(@dl.d FocusRequester right) {
        f0.p(right, "right");
        this.focusProperties.V(right);
    }

    public final void o(@dl.d FocusRequester start) {
        f0.p(start, "start");
        this.focusProperties.O(start);
    }

    public final void p(@dl.d FocusRequester up) {
        f0.p(up, "up");
        this.focusProperties.J(up);
    }
}
