package com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public abstract class l111l11111lIl extends l1111l111111Il {
    l111l11111lIl() {
    }

    private static SharedPreferences l111l11111I1l(String str) {
        Context context = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences(str, 0);
    }

    @Override // com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l1111l111111Il
    public String l1111l111111Il() {
        SharedPreferences sharedPreferencesL111l11111I1l;
        try {
            String strL111l11111I1l = l111l11111I1l();
            String strL111l11111Il = l111l11111Il();
            if (TextUtils.isEmpty(strL111l11111I1l) || TextUtils.isEmpty(strL111l11111Il) || (sharedPreferencesL111l11111I1l = l111l11111I1l(strL111l11111I1l)) == null) {
                return null;
            }
            return sharedPreferencesL111l11111I1l.getString(strL111l11111Il, "");
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l1111l111111Il
    public void l1111l111111Il(String str) {
        SharedPreferences sharedPreferencesL111l11111I1l;
        try {
            String strL111l11111I1l = l111l11111I1l();
            String strL111l11111Il = l111l11111Il();
            if (TextUtils.isEmpty(strL111l11111I1l) || TextUtils.isEmpty(strL111l11111Il) || (sharedPreferencesL111l11111I1l = l111l11111I1l(strL111l11111I1l)) == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferencesL111l11111I1l.edit();
            editorEdit.putString(strL111l11111Il, str);
            editorEdit.apply();
        } catch (Exception unused) {
        }
    }

    protected abstract String l111l11111I1l();

    protected abstract String l111l11111Il();
}
