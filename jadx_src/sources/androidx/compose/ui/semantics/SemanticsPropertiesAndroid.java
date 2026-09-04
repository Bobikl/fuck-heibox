package androidx.compose.ui.semantics;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: SemanticsProperties.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.ui.g
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\tR&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertiesAndroid;", "", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "b", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", ak.av, "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getTestTagsAsResourceId$annotations", "()V", "TestTagsAsResourceId", "<init>", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class SemanticsPropertiesAndroid {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final SemanticsPropertiesAndroid f16066a = new SemanticsPropertiesAndroid();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SemanticsPropertyKey<Boolean> TestTagsAsResourceId = new SemanticsPropertyKey<>("TestTagsAsResourceId", new yh.p<Boolean, Boolean, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesAndroid$TestTagsAsResourceId$1
        @dl.e
        public final Boolean a(@dl.e Boolean bool, boolean z10) {
            return bool;
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, Boolean bool2) {
            return a(bool, bool2.booleanValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16068c = 0;

    private SemanticsPropertiesAndroid() {
    }

    @androidx.compose.ui.g
    public static /* synthetic */ void b() {
    }

    @androidx.compose.ui.g
    @dl.d
    public final SemanticsPropertyKey<Boolean> a() {
        return TestTagsAsResourceId;
    }
}
