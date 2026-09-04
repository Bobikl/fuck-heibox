package s1;

import android.content.Context;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AndroidDensity.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Ls1/e;", ak.av, "ui-unit_release"}, k = 2, mv = {1, 7, 1})
public final class a {
    @dl.d
    public static final e a(@dl.d Context context) {
        f0.p(context, "context");
        return g.a(context.getResources().getDisplayMetrics().density, context.getResources().getConfiguration().fontScale);
    }
}
