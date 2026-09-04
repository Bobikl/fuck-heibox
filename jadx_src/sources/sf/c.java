package sf;

import android.text.SpannableString;
import com.max.xiaoheihe.bean.ShareWindowObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BuildDialogTitle.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    public static final SpannableString a(@dl.d ShareWindowObj windowInfo) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{windowInfo}, null, changeQuickRedirect, true, 41197, new Class[]{ShareWindowObj.class}, SpannableString.class);
        if (patchProxyResultProxy.isSupported) {
            return (SpannableString) patchProxyResultProxy.result;
        }
        f0.p(windowInfo, "windowInfo");
        SpannableString spannableString = new SpannableString(windowInfo.getTitle());
        e.a(spannableString, windowInfo.getTitle(), windowInfo.getTitle_highlight());
        return spannableString;
    }
}
