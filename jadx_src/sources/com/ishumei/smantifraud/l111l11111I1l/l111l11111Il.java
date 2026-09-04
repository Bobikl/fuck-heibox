package com.ishumei.smantifraud.l111l11111I1l;

import android.os.Build;
import com.taobao.accs.common.Constants;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class l111l11111Il {
    public static HashMap<String, String> l1111l111111Il() {
        HashMap<String, String> map = new HashMap<>();
        try {
            map.put("board", Build.BOARD);
            map.put(Constants.KEY_MODEL, Build.MODEL);
            map.put("brand", Build.BRAND);
            map.put("manufacturer", Build.MANUFACTURER);
            map.put("fingerprint", Build.FINGERPRINT);
            map.put("cpu_abi", Build.CPU_ABI);
            map.put("cpu_abi2", Build.CPU_ABI2);
            map.put("radioVersion", Build.getRadioVersion());
        } catch (Exception unused) {
        }
        return map;
    }
}
