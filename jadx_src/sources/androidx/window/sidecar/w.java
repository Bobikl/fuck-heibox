package androidx.window.sidecar;

import android.graphics.Rect;
import androidx.annotation.RestrictTo;
import androidx.window.core.b;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WindowMetrics.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000e¨\u0006\u0013"}, d2 = {"Landroidx/window/layout/w;", "", "", "toString", "other", "", "equals", "", "hashCode", "Landroidx/window/core/b;", ak.av, "Landroidx/window/core/b;", "_bounds", "Landroid/graphics/Rect;", "()Landroid/graphics/Rect;", "bounds", "<init>", "(Landroidx/window/core/b;)V", "(Landroid/graphics/Rect;)V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d
    private final b _bounds;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.TESTS})
    public w(@d Rect bounds) {
        this(new b(bounds));
        f0.p(bounds, "bounds");
    }

    public w(@d b _bounds) {
        f0.p(_bounds, "_bounds");
        this._bounds = _bounds;
    }

    @d
    public final Rect a() {
        return this._bounds.i();
    }

    public boolean equals(@e Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !f0.g(w.class, other.getClass())) {
            return false;
        }
        return f0.g(this._bounds, ((w) other)._bounds);
    }

    public int hashCode() {
        return this._bounds.hashCode();
    }

    @d
    public String toString() {
        return "WindowMetrics { bounds: " + a() + " }";
    }
}
