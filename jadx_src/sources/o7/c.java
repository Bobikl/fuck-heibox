package o7;

import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes6.dex */
public class c {
    public static void a(View view, int i10) {
        if (view == null || view.getVisibility() == i10 || !b(i10)) {
            return;
        }
        view.setVisibility(i10);
    }

    private static boolean b(int i10) {
        return i10 == 0 || i10 == 8 || i10 == 4;
    }

    public static String[] c(String[] strArr) {
        if (strArr != null) {
            try {
                if (strArr.length > 0) {
                    return (String[]) new HashSet(new ArrayList(Arrays.asList(strArr))).toArray(new String[0]);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return strArr;
    }
}
