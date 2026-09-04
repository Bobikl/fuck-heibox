package androidx.compose.material.ripple;

import com.umeng.analytics.pro.ak;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RippleContainer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0013\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\f¨\u0006\u0011"}, d2 = {"Landroidx/compose/material/ripple/g;", "", "Landroidx/compose/material/ripple/AndroidRippleIndicationInstance;", "indicationInstance", "Landroidx/compose/material/ripple/RippleHostView;", "rippleHostView", "Lkotlin/b2;", "d", "b", ak.av, ak.aF, "", "Ljava/util/Map;", "indicationToHostMap", "hostToIndicationMap", "<init>", "()V", "material-ripple_release"}, k = 1, mv = {1, 7, 1})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<AndroidRippleIndicationInstance, RippleHostView> indicationToHostMap = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<RippleHostView, AndroidRippleIndicationInstance> hostToIndicationMap = new LinkedHashMap();

    @dl.e
    public final AndroidRippleIndicationInstance a(@dl.d RippleHostView rippleHostView) {
        f0.p(rippleHostView, "rippleHostView");
        return this.hostToIndicationMap.get(rippleHostView);
    }

    @dl.e
    public final RippleHostView b(@dl.d AndroidRippleIndicationInstance indicationInstance) {
        f0.p(indicationInstance, "indicationInstance");
        return this.indicationToHostMap.get(indicationInstance);
    }

    public final void c(@dl.d AndroidRippleIndicationInstance indicationInstance) {
        f0.p(indicationInstance, "indicationInstance");
        RippleHostView rippleHostView = this.indicationToHostMap.get(indicationInstance);
        if (rippleHostView != null) {
            this.hostToIndicationMap.remove(rippleHostView);
        }
        this.indicationToHostMap.remove(indicationInstance);
    }

    public final void d(@dl.d AndroidRippleIndicationInstance indicationInstance, @dl.d RippleHostView rippleHostView) {
        f0.p(indicationInstance, "indicationInstance");
        f0.p(rippleHostView, "rippleHostView");
        this.indicationToHostMap.put(indicationInstance, rippleHostView);
        this.hostToIndicationMap.put(rippleHostView, indicationInstance);
    }
}
