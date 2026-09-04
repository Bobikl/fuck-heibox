package com.taobao.accs.utl;

import android.content.SharedPreferences;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class q {
    public static final int MAX_FAIL_TIMES = 3;

    public static void a() {
        try {
            int iC = c();
            if (iC > 0) {
                SharedPreferences.Editor editorEdit = GlobalClientInfo.getContext().getSharedPreferences(Constants.SP_LOAD_SO_FILE_NAME, 0).edit();
                editorEdit.clear();
                editorEdit.apply();
                ALog.i("LoadSoFailUtil", "loadSoSuccess", "fail times", Integer.valueOf(iC));
            }
        } catch (Throwable th2) {
            ALog.e("LoadSoFailUtil", "loadSoSuccess", th2, new Object[0]);
        }
    }

    public static void b() {
        try {
            SharedPreferences sharedPreferences = GlobalClientInfo.getContext().getSharedPreferences(Constants.SP_LOAD_SO_FILE_NAME, 0);
            int i10 = sharedPreferences.getInt(Constants.SP_KEY_LOAD_SO_TIMES, 0) + 1;
            if (i10 > 0) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putInt(Constants.SP_KEY_LOAD_SO_TIMES, i10);
                editorEdit.apply();
            }
            ALog.e("LoadSoFailUtil", "loadSoFail", Constants.KEY_TIMES, Integer.valueOf(i10));
        } catch (Throwable th2) {
            ALog.e("LoadSoFailUtil", "loadSoFail", th2, new Object[0]);
        }
    }

    public static int c() {
        int i10;
        try {
            i10 = GlobalClientInfo.getContext().getSharedPreferences(Constants.SP_LOAD_SO_FILE_NAME, 0).getInt(Constants.SP_KEY_LOAD_SO_TIMES, 0);
            try {
                ALog.i("LoadSoFailUtil", "getSoFailTimes", Constants.KEY_TIMES, Integer.valueOf(i10));
            } catch (Throwable th2) {
                th = th2;
                ALog.e("LoadSoFailUtil", "getSoFailTimes", th, new Object[0]);
            }
        } catch (Throwable th3) {
            th = th3;
            i10 = 0;
        }
        return i10;
    }
}
