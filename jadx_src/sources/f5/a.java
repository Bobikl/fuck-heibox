package f5;

import android.text.TextUtils;
import com.alipay.sdk.app.PayResultActivity;
import java.util.Collections;
import java.util.List;
import z5.l;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f118748a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l5.a.b f118749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l5.a.b f118750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static List<l5.a.b> f118751d;

    static {
        l5.a.b bVar = new l5.a.b(l.f141897b, 73, j5.a.f124260k);
        f118749b = bVar;
        f118750c = new l5.a.b(PayResultActivity.f39461e, 40, "e6b1bdcb890370f2f2419fe06d0fdf7628ad0083d52da1ecfe991164711bbf9297e75353de96f1740695d07610567b1240549af9cbd87d06919ac31c859ad37ab6907c311b4756e1e208775989a4f691bff4bbbc58174d2a96b1d0d970a05114d7ee57dfc33b1bafaf6e0d820e838427018b6435f903df04ba7fd34d73f843df9434b164e0220baabb10c8978c3f4c6b7da79d8220a968356d15090dea07df9606f665cbec14d218dd3d691cce2866a58840971b6a57b76af88b1a65fdffd2c080281a6ab20be5879e0330eb7ff70871ce684e7174ada5dc3159c461375a0796b17ce7beca83cf34f65976d237aee993db48d34a4e344f4d8b7e99119168bdd7");
        f118751d = Collections.singletonList(bVar);
    }

    public static String a() {
        return f118748a;
    }

    public static void b(String str) {
        f118748a = str;
        str.hashCode();
        if (str.equals("hk")) {
            f118751d = Collections.singletonList(f118750c);
        } else {
            f118751d = Collections.singletonList(f118749b);
        }
    }

    public static boolean c() {
        return TextUtils.isEmpty(f118748a) || TextUtils.equals("cn", f118748a);
    }
}
