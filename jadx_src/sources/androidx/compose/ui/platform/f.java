package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidAccessibilityManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/platform/f;", "Landroidx/compose/ui/platform/c;", "", "originalTimeoutMillis", "", "containsIcons", "containsText", "containsControls", ak.av, "Landroid/view/accessibility/AccessibilityManager;", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "<init>", "(Landroid/content/Context;)V", "b", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class f implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final a f15849b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f15850c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f15851d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f15852e = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AccessibilityManager accessibilityManager;

    /* JADX INFO: compiled from: AndroidAccessibilityManager.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/f$a;", "", "", "FlagContentControls", "I", "FlagContentIcons", "FlagContentText", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    public f(@dl.d Context context) {
        kotlin.jvm.internal.f0.p(context, "context");
        Object systemService = context.getSystemService("accessibility");
        kotlin.jvm.internal.f0.n(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.accessibilityManager = (AccessibilityManager) systemService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.compose.ui.platform.c
    public long a(long originalTimeoutMillis, boolean containsIcons, boolean containsText, boolean containsControls) {
        int i10;
        int i11 = containsIcons;
        if (originalTimeoutMillis >= 2147483647L) {
            return originalTimeoutMillis;
        }
        if (containsText) {
            i10 = (containsIcons ? 1 : 0) | 2;
        }
        if (containsControls) {
            i11 = i10;
            i11 = (i11 == true ? 1 : 0) | 4;
        }
        i11 = i10;
        if (Build.VERSION.SDK_INT >= 29) {
            int iA = f0.f15854a.a(this.accessibilityManager, (int) originalTimeoutMillis, i11);
            if (iA != Integer.MAX_VALUE) {
                return iA;
            }
        } else if (!containsControls || !this.accessibilityManager.isTouchExplorationEnabled()) {
            return originalTimeoutMillis;
        }
        return Long.MAX_VALUE;
    }
}
