package androidx.compose.ui.platform;

import androidx.compose.ui.semantics.ScrollAxisRange;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\t\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0015\u0010\u0013R$\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0003\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001f\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u0014\u0010!\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Landroidx/compose/ui/node/c1;", "", "b", "I", "e", "()I", "semanticsNodeId", "", ak.aF, "Ljava/util/List;", ak.av, "()Ljava/util/List;", "allScopes", "", "d", "Ljava/lang/Float;", "()Ljava/lang/Float;", RXScreenCaptureService.KEY_HEIGHT, "(Ljava/lang/Float;)V", "oldXValue", "i", "oldYValue", "Landroidx/compose/ui/semantics/h;", "f", "Landroidx/compose/ui/semantics/h;", "()Landroidx/compose/ui/semantics/h;", "g", "(Landroidx/compose/ui/semantics/h;)V", "horizontalScrollAxisRange", "j", "verticalScrollAxisRange", "", "isValid", "()Z", "<init>", "(ILjava/util/List;Ljava/lang/Float;Ljava/lang/Float;Landroidx/compose/ui/semantics/h;Landroidx/compose/ui/semantics/h;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class q1 implements androidx.compose.ui.node.c1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int semanticsNodeId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<q1> allScopes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Float oldXValue;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Float oldYValue;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private ScrollAxisRange horizontalScrollAxisRange;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private ScrollAxisRange verticalScrollAxisRange;

    public q1(int i10, @dl.d List<q1> allScopes, @dl.e Float f10, @dl.e Float f11, @dl.e ScrollAxisRange scrollAxisRange, @dl.e ScrollAxisRange scrollAxisRange2) {
        kotlin.jvm.internal.f0.p(allScopes, "allScopes");
        this.semanticsNodeId = i10;
        this.allScopes = allScopes;
        this.oldXValue = f10;
        this.oldYValue = f11;
        this.horizontalScrollAxisRange = scrollAxisRange;
        this.verticalScrollAxisRange = scrollAxisRange2;
    }

    @dl.d
    public final List<q1> a() {
        return this.allScopes;
    }

    @dl.e
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ScrollAxisRange getHorizontalScrollAxisRange() {
        return this.horizontalScrollAxisRange;
    }

    @dl.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Float getOldXValue() {
        return this.oldXValue;
    }

    @dl.e
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Float getOldYValue() {
        return this.oldYValue;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getSemanticsNodeId() {
        return this.semanticsNodeId;
    }

    @dl.e
    /* JADX INFO: renamed from: f, reason: from getter */
    public final ScrollAxisRange getVerticalScrollAxisRange() {
        return this.verticalScrollAxisRange;
    }

    public final void g(@dl.e ScrollAxisRange scrollAxisRange) {
        this.horizontalScrollAxisRange = scrollAxisRange;
    }

    public final void h(@dl.e Float f10) {
        this.oldXValue = f10;
    }

    public final void i(@dl.e Float f10) {
        this.oldYValue = f10;
    }

    @Override // androidx.compose.ui.node.c1
    public boolean isValid() {
        return this.allScopes.contains(this);
    }

    public final void j(@dl.e ScrollAxisRange scrollAxisRange) {
        this.verticalScrollAxisRange = scrollAxisRange;
    }
}
