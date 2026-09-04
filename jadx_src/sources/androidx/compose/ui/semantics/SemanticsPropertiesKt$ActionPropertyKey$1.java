package androidx.compose.ui.semantics;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f0;
import kotlin.u;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/u;", "", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/ui/semantics/a;", "parentValue", "childValue", ak.av, "(Landroidx/compose/ui/semantics/a;Landroidx/compose/ui/semantics/a;)Landroidx/compose/ui/semantics/a;"}, k = 3, mv = {1, 7, 1})
public final class SemanticsPropertiesKt$ActionPropertyKey$1<T> extends Lambda implements yh.p<AccessibilityAction<T>, AccessibilityAction<T>, AccessibilityAction<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SemanticsPropertiesKt$ActionPropertyKey$1 f16088b = new SemanticsPropertiesKt$ActionPropertyKey$1();

    public SemanticsPropertiesKt$ActionPropertyKey$1() {
        super(2);
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AccessibilityAction<T> invoke(@dl.e AccessibilityAction<T> accessibilityAction, @dl.d AccessibilityAction<T> childValue) {
        String label;
        u uVarA;
        f0.p(childValue, "childValue");
        if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
            label = childValue.getLabel();
        }
        if (accessibilityAction == null || (uVarA = accessibilityAction.a()) == null) {
            uVarA = childValue.a();
        }
        return new AccessibilityAction<>(label, uVarA);
    }
}
