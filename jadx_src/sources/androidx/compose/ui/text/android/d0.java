package androidx.compose.ui.text.android;

import android.text.Layout;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/android/d0;", "", "", "value", "Landroid/text/Layout$Alignment;", ak.av, "b", "Landroid/text/Layout$Alignment;", "ALIGN_LEFT_FRAMEWORK", ak.aF, "ALIGN_RIGHT_FRAMEWORK", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final d0 f16304a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final Layout.Alignment ALIGN_LEFT_FRAMEWORK;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final Layout.Alignment ALIGN_RIGHT_FRAMEWORK;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (kotlin.jvm.internal.f0.g(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (kotlin.jvm.internal.f0.g(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        ALIGN_LEFT_FRAMEWORK = alignment;
        ALIGN_RIGHT_FRAMEWORK = alignment2;
    }

    private d0() {
    }

    @dl.d
    public final Layout.Alignment a(int value) {
        if (value == 0) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (value == 1) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (value == 2) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (value != 3) {
            return value != 4 ? Layout.Alignment.ALIGN_NORMAL : ALIGN_RIGHT_FRAMEWORK;
        }
        return ALIGN_LEFT_FRAMEWORK;
    }
}
