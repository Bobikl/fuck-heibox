package androidx.compose.ui.input.pointer;

import android.view.PointerIcon;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.a, reason: from toString */
/* JADX INFO: compiled from: PointerIcon.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/input/pointer/a;", "Landroidx/compose/ui/input/pointer/t;", "", "other", "", "equals", "", "hashCode", "", "toString", "Landroid/view/PointerIcon;", ak.av, "Landroid/view/PointerIcon;", "()Landroid/view/PointerIcon;", "pointerIcon", "<init>", "(Landroid/view/PointerIcon;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class AndroidPointerIcon implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final PointerIcon pointerIcon;

    public AndroidPointerIcon(@dl.d PointerIcon pointerIcon) {
        kotlin.jvm.internal.f0.p(pointerIcon, "pointerIcon");
        this.pointerIcon = pointerIcon;
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final PointerIcon getPointerIcon() {
        return this.pointerIcon;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.f0.g(AndroidPointerIcon.class, other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.f0.n(other, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
        return kotlin.jvm.internal.f0.g(this.pointerIcon, ((AndroidPointerIcon) other).pointerIcon);
    }

    public int hashCode() {
        return this.pointerIcon.hashCode();
    }

    @dl.d
    public String toString() {
        return "AndroidPointerIcon(pointerIcon=" + this.pointerIcon + ')';
    }
}
