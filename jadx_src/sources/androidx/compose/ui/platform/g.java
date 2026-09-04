package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import com.bytedance.bpea.entry.common.DataType;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidClipboardManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/platform/g;", "Landroidx/compose/ui/platform/k0;", "Landroidx/compose/ui/text/d;", "annotatedString", "Lkotlin/b2;", ak.av, "getText", "", "b", "Landroid/content/ClipboardManager;", "Landroid/content/ClipboardManager;", "clipboardManager", "<init>", "(Landroid/content/ClipboardManager;)V", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "(Landroid/content/Context;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class g implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final ClipboardManager clipboardManager;

    public g(@dl.d ClipboardManager clipboardManager) {
        kotlin.jvm.internal.f0.p(clipboardManager, "clipboardManager");
        this.clipboardManager = clipboardManager;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(@dl.d Context context) {
        kotlin.jvm.internal.f0.p(context, "context");
        Object systemService = context.getSystemService(DataType.CLIPBOARD);
        kotlin.jvm.internal.f0.n(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this((ClipboardManager) systemService);
    }

    @Override // androidx.compose.ui.platform.k0
    public void a(@dl.d androidx.compose.ui.text.d annotatedString) {
        kotlin.jvm.internal.f0.p(annotatedString, "annotatedString");
        this.clipboardManager.setPrimaryClip(ClipData.newPlainText("plain text", h.b(annotatedString)));
    }

    public final boolean b() {
        ClipDescription primaryClipDescription = this.clipboardManager.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/plain");
        }
        return false;
    }

    @Override // androidx.compose.ui.platform.k0
    @dl.e
    public androidx.compose.ui.text.d getText() {
        ClipData primaryClip = this.clipboardManager.getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        return h.a(itemAt != null ? itemAt.getText() : null);
    }
}
