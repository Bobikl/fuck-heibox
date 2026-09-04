package androidx.window.sidecar;

import androidx.annotation.RestrictTo;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WindowLayoutInfo.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0017\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/window/layout/v;", "", "", "toString", "other", "", "equals", "", "hashCode", "", "Landroidx/window/layout/h;", ak.av, "Ljava/util/List;", "()Ljava/util/List;", "displayFeatures", "<init>", "(Ljava/util/List;)V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d
    private final List<h> displayFeatures;

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.TESTS})
    public v(@d List<? extends h> displayFeatures) {
        f0.p(displayFeatures, "displayFeatures");
        this.displayFeatures = displayFeatures;
    }

    @d
    public final List<h> a() {
        return this.displayFeatures;
    }

    public boolean equals(@e Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !f0.g(v.class, other.getClass())) {
            return false;
        }
        return f0.g(this.displayFeatures, ((v) other).displayFeatures);
    }

    public int hashCode() {
        return this.displayFeatures.hashCode();
    }

    @d
    public String toString() {
        return CollectionsKt___CollectionsKt.h3(this.displayFeatures, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }
}
