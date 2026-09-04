package androidx.compose.foundation;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.w0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: EdgeEffectCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@w0(31)
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J \u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0007J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0007¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/d;", "", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroid/util/AttributeSet;", "attrs", "Landroid/widget/EdgeEffect;", ak.av, "edgeEffect", "", "deltaDistance", "displacement", ak.aF, "b", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final d f5093a = new d();

    private d() {
    }

    @androidx.annotation.u
    @dl.d
    public final EdgeEffect a(@dl.d Context context, @dl.e AttributeSet attrs) {
        kotlin.jvm.internal.f0.p(context, "context");
        try {
            return new EdgeEffect(context, attrs);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    @androidx.annotation.u
    public final float b(@dl.d EdgeEffect edgeEffect) {
        kotlin.jvm.internal.f0.p(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    @androidx.annotation.u
    public final float c(@dl.d EdgeEffect edgeEffect, float deltaDistance, float displacement) {
        kotlin.jvm.internal.f0.p(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.onPullDistance(deltaDistance, displacement);
        } catch (Throwable unused) {
            edgeEffect.onPull(deltaDistance, displacement);
            return 0.0f;
        }
    }
}
