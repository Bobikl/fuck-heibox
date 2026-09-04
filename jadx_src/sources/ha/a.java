package ha;

import android.content.Context;
import com.umeng.analytics.pro.ak;
import dl.d;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ContextExt.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0000¨\u0006\u0007"}, d2 = {"Landroid/content/Context;", "", "dpValue", "", ak.av, "pxValue", "b", "date_time_picker_release"}, k = 2, mv = {1, 5, 1})
public final class a {
    public static final int a(@d Context context, float f10) {
        f0.p(context, "<this>");
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static final int b(@d Context context, float f10) {
        f0.p(context, "<this>");
        return (int) ((f10 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
