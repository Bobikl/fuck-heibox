package n7;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class d {
    public static List<String> a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            ArrayList arrayList = new ArrayList();
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null) {
                for (Signature signature : signatureArr) {
                    arrayList.add(c.b(signature.toByteArray()));
                }
                return arrayList;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    public static String b(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (i10 != 0) {
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb2.append(list.get(i10));
        }
        return sb2.toString();
    }

    public static boolean c(Context context, String str, String str2) {
        List<String> listA;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && context != null && (listA = a(context, str)) != null && listA.size() > 0) {
            Iterator<String> it = listA.iterator();
            while (it.hasNext()) {
                if (str2.equalsIgnoreCase(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }
}
