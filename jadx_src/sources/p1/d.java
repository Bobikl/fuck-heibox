package p1;

import android.os.Build;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidPlatformLocale.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000¨\u0006\u0002"}, d2 = {"Lp1/h;", ak.av, "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class d {
    @dl.d
    public static final h a() {
        return Build.VERSION.SDK_INT >= 24 ? new c() : new b();
    }
}
