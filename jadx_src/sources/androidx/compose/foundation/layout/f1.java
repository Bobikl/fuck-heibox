package androidx.compose.foundation.layout;

import androidx.compose.runtime.h2;
import androidx.compose.runtime.j2;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R+\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Landroidx/compose/foundation/layout/f1;", "Landroidx/compose/foundation/layout/h1;", "Ls1/e;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "b", ak.av, "d", ak.aF, "", "other", "", "equals", "hashCode", "", "toString", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "name", "Landroidx/compose/foundation/layout/a0;", "<set-?>", "Landroidx/compose/runtime/a1;", "f", "()Landroidx/compose/foundation/layout/a0;", "g", "(Landroidx/compose/foundation/layout/a0;)V", "value", "insets", "<init>", "(Landroidx/compose/foundation/layout/a0;Ljava/lang/String;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class f1 implements h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 value;

    public f1(@dl.d InsetsValues insets, @dl.d String name) {
        kotlin.jvm.internal.f0.p(insets, "insets");
        kotlin.jvm.internal.f0.p(name, "name");
        this.name = name;
        this.value = h2.g(insets, null, 2, null);
    }

    @Override // androidx.compose.foundation.layout.h1
    public int a(@dl.d s1.e density) {
        kotlin.jvm.internal.f0.p(density, "density");
        return f().getTop();
    }

    @Override // androidx.compose.foundation.layout.h1
    public int b(@dl.d s1.e density, @dl.d LayoutDirection layoutDirection) {
        kotlin.jvm.internal.f0.p(density, "density");
        kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
        return f().getLeft();
    }

    @Override // androidx.compose.foundation.layout.h1
    public int c(@dl.d s1.e density) {
        kotlin.jvm.internal.f0.p(density, "density");
        return f().getBottom();
    }

    @Override // androidx.compose.foundation.layout.h1
    public int d(@dl.d s1.e density, @dl.d LayoutDirection layoutDirection) {
        kotlin.jvm.internal.f0.p(density, "density");
        kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
        return f().getRight();
    }

    @dl.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(@dl.e Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof f1) {
            return kotlin.jvm.internal.f0.g(f(), ((f1) other).f());
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public final InsetsValues f() {
        return (InsetsValues) this.value.getValue();
    }

    public final void g(@dl.d InsetsValues insetsValues) {
        kotlin.jvm.internal.f0.p(insetsValues, "<set-?>");
        this.value.setValue(insetsValues);
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    @dl.d
    public String toString() {
        return this.name + "(left=" + f().getLeft() + ", top=" + f().getTop() + ", right=" + f().getRight() + ", bottom=" + f().getBottom() + ')';
    }
}
