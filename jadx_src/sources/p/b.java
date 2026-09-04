package p;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: compiled from: DesHttpDnsConfig.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends r.b {
    @Override // r.b
    public int a() {
        return 80;
    }

    @Override // r.b
    public String b(String str, String str2) {
        return TextUtils.isEmpty(str2) ? "" : String.format(Locale.US, "http://%s/d?%s&alg=des", str, str2);
    }
}
