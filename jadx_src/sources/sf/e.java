package sf;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: BuildHighLightSpan.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class e {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void a(@dl.d SpannableString spannableString, @dl.e String str, @dl.e String str2) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{spannableString, str, str2}, null, changeQuickRedirect, true, 41199, new Class[]{SpannableString.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(spannableString, "<this>");
        if (str == null || str.length() == 0) {
            return;
        }
        if (str2 != null && str2.length() != 0) {
            z10 = false;
        }
        if (!z10 && StringsKt__StringsKt.W2(str, str2, false, 2, null)) {
            int iS3 = StringsKt__StringsKt.s3(str, str2, 0, false, 6, null);
            spannableString.setSpan(new ForegroundColorSpan(com.max.xiaoheihe.utils.d.E(R.color.coupon_orange)), iS3, str2.length() + iS3, 17);
        }
    }
}
