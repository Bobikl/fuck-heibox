package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import com.umeng.analytics.pro.ak;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;

/* JADX INFO: compiled from: StaticLayoutFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/android/y;", "Landroidx/compose/ui/text/android/z;", "Landroidx/compose/ui/text/android/b0;", "params", "Landroid/text/StaticLayout;", ak.av, com.google.android.exoplayer2.text.ttml.d.f49813w, "", "useFallbackLineSpacing", "b", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class y implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f16360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private static Constructor<StaticLayout> f16361c;

    /* JADX INFO: renamed from: androidx.compose.ui.text.android.y$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: StaticLayoutFactory.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/android/y$a;", "", "Ljava/lang/reflect/Constructor;", "Landroid/text/StaticLayout;", "b", "", "isInitialized", "Z", "staticLayoutConstructor", "Ljava/lang/reflect/Constructor;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Constructor<StaticLayout> b() {
            if (y.f16360b) {
                return y.f16361c;
            }
            y.f16360b = true;
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                y.f16361c = StaticLayout.class.getConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            } catch (NoSuchMethodException unused) {
                y.f16361c = null;
                Log.e("StaticLayoutFactory", "unable to collect necessary constructor.");
            }
            return y.f16361c;
        }
    }

    @Override // androidx.compose.ui.text.android.z
    @androidx.annotation.u
    @dl.d
    public StaticLayout a(@dl.d b0 params) {
        kotlin.jvm.internal.f0.p(params, "params");
        Constructor constructorB = INSTANCE.b();
        StaticLayout staticLayout = null;
        if (constructorB != null) {
            try {
                staticLayout = (StaticLayout) constructorB.newInstance(params.getText(), Integer.valueOf(params.getCom.google.android.exoplayer2.text.ttml.d.o0 java.lang.String()), Integer.valueOf(params.getEnd()), params.getPaint(), Integer.valueOf(params.getWidth()), params.getAlignment(), params.getTextDir(), Float.valueOf(params.getLineSpacingMultiplier()), Float.valueOf(params.getLineSpacingExtra()), Boolean.valueOf(params.getIncludePadding()), params.getEllipsize(), Integer.valueOf(params.getEllipsizedWidth()), Integer.valueOf(params.getMaxLines()));
            } catch (IllegalAccessException unused) {
                f16361c = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InstantiationException unused2) {
                f16361c = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InvocationTargetException unused3) {
                f16361c = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            }
        }
        return staticLayout != null ? staticLayout : new StaticLayout(params.getText(), params.getCom.google.android.exoplayer2.text.ttml.d.o0 java.lang.String(), params.getEnd(), params.getPaint(), params.getWidth(), params.getAlignment(), params.getLineSpacingMultiplier(), params.getLineSpacingExtra(), params.getIncludePadding(), params.getEllipsize(), params.getEllipsizedWidth());
    }

    @Override // androidx.compose.ui.text.android.z
    public boolean b(@dl.d StaticLayout layout, boolean useFallbackLineSpacing) {
        kotlin.jvm.internal.f0.p(layout, "layout");
        return false;
    }
}
