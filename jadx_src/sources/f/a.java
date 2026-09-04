package f;

import android.os.Build;
import android.util.Log;
import com.tencent.msdk.dns.base.log.ILogNode;

/* JADX INFO: compiled from: AndroidLogNode.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ILogNode {
    @Override // com.tencent.msdk.dns.base.log.ILogNode
    public void println(int i10, String str, String str2, Throwable th2) {
        int iMin;
        if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6) {
            if (str == null) {
                str = "";
            }
            int i11 = 0;
            if (23 < str.length() && 24 > Build.VERSION.SDK_INT) {
                str = str.substring(0, 23);
            }
            if (str2 == null) {
                str2 = "";
            }
            if (th2 != null) {
                str2 = str2 + "\n" + Log.getStackTraceString(th2);
            }
            if (4000 >= str2.length()) {
                Log.println(i10, str, str2);
                return;
            }
            int length = str2.length();
            while (i11 < length) {
                int iIndexOf = str2.indexOf(10, i11);
                if (-1 == iIndexOf) {
                    iIndexOf = length;
                }
                while (true) {
                    iMin = Math.min(iIndexOf, i11 + 4000);
                    Log.println(i10, str, str2.substring(i11, iMin));
                    if (iMin >= iIndexOf) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
            }
        }
    }
}
