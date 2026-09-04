package androidx.compose.ui.semantics;

import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.u;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.a, reason: from toString */
/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 1)
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000*\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0004B\u001b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0012\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/semantics/a;", "Lkotlin/u;", "", androidx.exifinterface.media.a.f23244d5, "", "other", "equals", "", "hashCode", "", "toString", ak.av, "Ljava/lang/String;", "b", "()Ljava/lang/String;", BasePuzzleInfo.PUZZLE_TYPE_LABEL, "Lkotlin/u;", "()Lkotlin/u;", "action", "<init>", "(Ljava/lang/String;Lkotlin/u;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class AccessibilityAction<T extends u<? extends Boolean>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16093c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final String label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final T action;

    public AccessibilityAction(@dl.e String str, @dl.e T t10) {
        this.label = str;
        this.action = t10;
    }

    @dl.e
    public final T a() {
        return this.action;
    }

    @dl.e
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction = (AccessibilityAction) other;
        return f0.g(this.label, accessibilityAction.label) && f0.g(this.action, accessibilityAction.action);
    }

    public int hashCode() {
        String str = this.label;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        T t10 = this.action;
        return iHashCode + (t10 != null ? t10.hashCode() : 0);
    }

    @dl.d
    public String toString() {
        return "AccessibilityAction(label=" + this.label + ", action=" + this.action + ')';
    }
}
