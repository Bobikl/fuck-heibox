package q;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: compiled from: HttpsDnsConfig.java */
/* JADX INFO: loaded from: classes.dex */
public class b extends r.b {
    @Override // r.b
    public int a() {
        return 443;
    }

    @Override // r.b
    public String b(String str, String str2) {
        return TextUtils.isEmpty(str2) ? "" : String.format(Locale.US, "https://%s/d?%s", str, str2);
    }
}
