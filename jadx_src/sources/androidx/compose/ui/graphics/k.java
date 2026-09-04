package androidx.compose.ui.graphics;

import android.graphics.PathEffect;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidPathEffect.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/k;", "Landroidx/compose/ui/graphics/m1;", "Landroid/graphics/PathEffect;", "b", "Landroid/graphics/PathEffect;", ak.av, "()Landroid/graphics/PathEffect;", "nativePathEffect", "<init>", "(Landroid/graphics/PathEffect;)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class k implements m1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final PathEffect nativePathEffect;

    public k(@dl.d PathEffect nativePathEffect) {
        kotlin.jvm.internal.f0.p(nativePathEffect, "nativePathEffect");
        this.nativePathEffect = nativePathEffect;
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final PathEffect getNativePathEffect() {
        return this.nativePathEffect;
    }
}
