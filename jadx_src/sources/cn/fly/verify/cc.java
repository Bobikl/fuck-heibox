package cn.fly.verify;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class cc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f35987a = eh.b("005Uckceeh!c0eh");

    private static HashMap<String, Object> a() {
        HashMap<String, Object> map;
        File file = new File(ax.g().getFilesDir().getAbsolutePath() + eh.b("005kBgbcjeePk"), f35987a);
        if (file.exists()) {
            map = (HashMap) gj.a(file.getAbsolutePath());
            bv.a().b("all_ds", map);
            file.delete();
        } else {
            map = null;
        }
        return (map == null || map.isEmpty()) ? (HashMap) bv.a().c("all_ds", null) : map;
    }

    public static synchronized HashMap<String, Object> a(Context context) {
        HashMap<String, Object> map = new HashMap<>();
        HashMap<String, Object> mapA = a();
        boolean z10 = mapA != null && mapA.size() > 0;
        if (z10) {
            HashMap map2 = new HashMap();
            if (mapA.containsKey(eh.b("004Pcfcbchcb"))) {
                mapA.put(eh.b("005cOcfcbchcb"), mapA.remove(eh.b("004$cfcbchcb")));
            }
            map2.putAll(mapA);
            map.put(eh.b("009<dechcbehdc9cbge"), map2);
        }
        String strAh = fc.a(context).d().ah();
        if (!z10 && TextUtils.isEmpty(strAh)) {
            return null;
        }
        map.put(eh.b("0049cj2c'chcb"), strAh);
        a(strAh);
        return map;
    }

    private static void a(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put(eh.b("004Fcj$c+chcb"), str);
        }
        bv.a().b("all_ds", map);
    }

    public static String b(Context context) {
        return cd.b(context);
    }
}
