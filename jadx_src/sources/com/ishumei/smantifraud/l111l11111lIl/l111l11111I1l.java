package com.ishumei.smantifraud.l111l11111lIl;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes6.dex */
public final class l111l11111I1l {
    private static final String l1111l111111Il = "seq";
    private static l111l11111I1l l111l11111I1l;
    private SharedPreferences l111l11111Il;
    private int l111l11111lIl = 0;

    private l111l11111I1l() {
        Context contextL1111l111111Il = l111l1111l1Il.l1111l111111Il();
        if (contextL1111l111111Il != null) {
            this.l111l11111Il = contextL1111l111111Il.getSharedPreferences(l1111l111111Il, 0);
        }
    }

    public static synchronized l111l11111I1l l1111l111111Il() {
        if (l111l11111I1l == null) {
            l111l11111I1l = new l111l11111I1l();
        }
        return l111l11111I1l;
    }

    private String l111l11111I1l() {
        try {
            SharedPreferences sharedPreferences = this.l111l11111Il;
            if (sharedPreferences == null) {
                return null;
            }
            return sharedPreferences.getString(l1111l111111Il, null);
        } catch (Exception unused) {
            return null;
        }
    }

    private void l111l11111lIl(String str) {
        try {
            SharedPreferences sharedPreferences = this.l111l11111Il;
            if (sharedPreferences == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString(l1111l111111Il, str);
            editorEdit.apply();
        } catch (Exception unused) {
        }
    }

    public final int l1111l111111Il(String str) {
        SharedPreferences sharedPreferences = this.l111l11111Il;
        if (sharedPreferences == null) {
            return 0;
        }
        return sharedPreferences.getInt(str, 0);
    }

    public final void l1111l111111Il(String str, int i10) {
        SharedPreferences sharedPreferences = this.l111l11111Il;
        if (sharedPreferences == null) {
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putInt(str, i10);
            editorEdit.apply();
        } catch (Throwable unused) {
        }
    }

    public final synchronized String l111l11111lIl() {
        StringBuilder sb2;
        if (this.l111l11111lIl == 0) {
            String strL111l11111I1l = l111l11111I1l();
            if (!com.ishumei.smantifraud.l111l1111llIl.l111l11111Il.l1111l111111Il(strL111l11111I1l)) {
                try {
                    this.l111l11111lIl = Integer.parseInt(strL111l11111I1l);
                } catch (Exception unused) {
                }
            }
        }
        this.l111l11111lIl++;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.l111l11111lIl);
        String string = sb3.toString();
        try {
            SharedPreferences sharedPreferences = this.l111l11111Il;
            if (sharedPreferences != null) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(l1111l111111Il, string);
                editorEdit.apply();
            }
        } catch (Exception unused2) {
        }
        sb2 = new StringBuilder();
        sb2.append(this.l111l11111lIl);
        return sb2.toString();
    }
}
