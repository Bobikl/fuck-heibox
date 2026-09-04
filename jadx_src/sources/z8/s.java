package z8;

import androidx.annotation.n0;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public class s {
    @v8.a
    public static void a(@n0 StringBuilder sb2, @n0 HashMap<String, String> map) {
        sb2.append("{");
        boolean z10 = true;
        for (String str : map.keySet()) {
            if (!z10) {
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            String str2 = map.get(str);
            sb2.append("\"");
            sb2.append(str);
            sb2.append("\":");
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append("\"");
                sb2.append(str2);
                sb2.append("\"");
            }
            z10 = false;
        }
        sb2.append(z5.g.f141884d);
    }
}
