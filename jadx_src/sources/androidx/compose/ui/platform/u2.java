package androidx.compose.ui.platform;

import android.view.View;
import com.umeng.analytics.pro.ak;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: Wrapper.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(29)
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/u2;", "", "Landroid/view/View;", sd.b.f139384b, "", "", ak.av, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final u2 f15989a = new u2();

    private u2() {
    }

    @androidx.annotation.u
    @dl.d
    @androidx.annotation.w0(29)
    public final Map<Integer, Integer> a(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "view");
        Map<Integer, Integer> attributeSourceResourceMap = view.getAttributeSourceResourceMap();
        kotlin.jvm.internal.f0.o(attributeSourceResourceMap, "view.attributeSourceResourceMap");
        return attributeSourceResourceMap;
    }
}
