package androidx.compose.ui.platform;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AccessibilityManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J.\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/c;", "", "", "originalTimeoutMillis", "", "containsIcons", "containsText", "containsControls", ak.av, "ui_release"}, k = 1, mv = {1, 7, 1})
public interface c {

    /* JADX INFO: compiled from: AccessibilityManager.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
    }

    long a(long originalTimeoutMillis, boolean containsIcons, boolean containsText, boolean containsControls);
}
