package androidx.compose.ui.semantics;

import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.d, reason: from toString */
/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\t\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/semantics/d;", "", "other", "", "equals", "", "hashCode", "", "toString", ak.av, "Ljava/lang/String;", "b", "()Ljava/lang/String;", BasePuzzleInfo.PUZZLE_TYPE_LABEL, "Lkotlin/Function0;", "action", "Lyh/a;", "()Lyh/a;", "<init>", "(Ljava/lang/String;Lyh/a;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class CustomAccessibilityAction {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16104c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final String label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @dl.d
    private final yh.a<Boolean> action;

    public CustomAccessibilityAction(@dl.d String label, @dl.d yh.a<Boolean> action) {
        f0.p(label, "label");
        f0.p(action, "action");
        this.label = label;
        this.action = action;
    }

    @dl.d
    public final yh.a<Boolean> a() {
        return this.action;
    }

    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomAccessibilityAction)) {
            return false;
        }
        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) other;
        return f0.g(this.label, customAccessibilityAction.label) && f0.g(this.action, customAccessibilityAction.action);
    }

    public int hashCode() {
        return (this.label.hashCode() * 31) + this.action.hashCode();
    }

    @dl.d
    public String toString() {
        return "CustomAccessibilityAction(label=" + this.label + ", action=" + this.action + ')';
    }
}
