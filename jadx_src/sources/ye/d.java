package ye;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import androidx.core.content.res.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ShapeUtil.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final d f141796a = new d();
    public static ChangeQuickRedirect changeQuickRedirect;

    private d() {
    }

    @dl.d
    public final GradientDrawable a(@dl.d Context context, int i10, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10), new Float(f10)}, this, changeQuickRedirect, false, bb.c.m.Pp, new Class[]{Context.class, Integer.TYPE, Float.TYPE}, GradientDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (GradientDrawable) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(b.f141790a.a(context, f10));
        if (i10 != -1) {
            gradientDrawable.setColor(i.e(context.getResources(), i10, null));
        }
        return gradientDrawable;
    }
}
