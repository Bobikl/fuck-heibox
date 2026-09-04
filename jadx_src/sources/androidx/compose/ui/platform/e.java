package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityNodeInfo;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(26)
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/e;", "", "Landroid/view/accessibility/AccessibilityNodeInfo;", "node", "", "", "data", "Lkotlin/b2;", ak.av, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final e f15845a = new e();

    private e() {
    }

    @androidx.annotation.u
    @androidx.annotation.w0(26)
    public final void a(@dl.d AccessibilityNodeInfo node, @dl.d List<String> data) {
        kotlin.jvm.internal.f0.p(node, "node");
        kotlin.jvm.internal.f0.p(data, "data");
        node.setAvailableExtraData(data);
    }
}
