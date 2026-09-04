package androidx.compose.material.ripple;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.R;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.x;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RippleContainer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J0\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0014J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0014J\n\u0010\b\u001a\u00020\u000f*\u00020\u000eJ\n\u0010\u0010\u001a\u00020\t*\u00020\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011¨\u0006#"}, d2 = {"Landroidx/compose/material/ripple/RippleContainer;", "Landroid/view/ViewGroup;", "", "changed", "", "l", "t", "r", "b", "Lkotlin/b2;", "onLayout", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroidx/compose/material/ripple/AndroidRippleIndicationInstance;", "Landroidx/compose/material/ripple/RippleHostView;", ak.av, "I", "MaxRippleHosts", "", ak.aF, "Ljava/util/List;", "rippleHosts", "d", "unusedRippleHosts", "Landroidx/compose/material/ripple/g;", "e", "Landroidx/compose/material/ripple/g;", "rippleHostMap", "f", "nextHostIndex", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "<init>", "(Landroid/content/Context;)V", "material-ripple_release"}, k = 1, mv = {1, 7, 1})
public final class RippleContainer extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int MaxRippleHosts;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<RippleHostView> rippleHosts;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<RippleHostView> unusedRippleHosts;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final g rippleHostMap;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int nextHostIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleContainer(@dl.d Context context) {
        super(context);
        f0.p(context, "context");
        this.MaxRippleHosts = 5;
        ArrayList arrayList = new ArrayList();
        this.rippleHosts = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.unusedRippleHosts = arrayList2;
        this.rippleHostMap = new g();
        setClipChildren(false);
        RippleHostView rippleHostView = new RippleHostView(context);
        addView(rippleHostView);
        arrayList.add(rippleHostView);
        arrayList2.add(rippleHostView);
        this.nextHostIndex = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(@dl.d AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        f0.p(androidRippleIndicationInstance, "<this>");
        androidRippleIndicationInstance.n();
        RippleHostView rippleHostViewB = this.rippleHostMap.b(androidRippleIndicationInstance);
        if (rippleHostViewB != null) {
            rippleHostViewB.d();
            this.rippleHostMap.c(androidRippleIndicationInstance);
            this.unusedRippleHosts.add(rippleHostViewB);
        }
    }

    @dl.d
    public final RippleHostView b(@dl.d AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        f0.p(androidRippleIndicationInstance, "<this>");
        RippleHostView rippleHostViewB = this.rippleHostMap.b(androidRippleIndicationInstance);
        if (rippleHostViewB != null) {
            return rippleHostViewB;
        }
        RippleHostView rippleHostView = (RippleHostView) x.K0(this.unusedRippleHosts);
        if (rippleHostView == null) {
            if (this.nextHostIndex > CollectionsKt__CollectionsKt.G(this.rippleHosts)) {
                Context context = getContext();
                f0.o(context, "context");
                rippleHostView = new RippleHostView(context);
                addView(rippleHostView);
                this.rippleHosts.add(rippleHostView);
            } else {
                rippleHostView = this.rippleHosts.get(this.nextHostIndex);
                AndroidRippleIndicationInstance androidRippleIndicationInstanceA = this.rippleHostMap.a(rippleHostView);
                if (androidRippleIndicationInstanceA != null) {
                    androidRippleIndicationInstanceA.n();
                    this.rippleHostMap.c(androidRippleIndicationInstanceA);
                    rippleHostView.d();
                }
            }
            int i10 = this.nextHostIndex;
            if (i10 < this.MaxRippleHosts - 1) {
                this.nextHostIndex = i10 + 1;
            } else {
                this.nextHostIndex = 0;
            }
        }
        this.rippleHostMap.d(androidRippleIndicationInstance, rippleHostView);
        return rippleHostView;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }
}
