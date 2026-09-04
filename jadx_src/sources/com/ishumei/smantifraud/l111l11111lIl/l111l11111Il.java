package com.ishumei.smantifraud.l111l11111lIl;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class l111l11111Il {
    private static l111l11111Il l1111l111111Il = null;
    private static final String l111l11111I1l = "l";
    private static final int l111l11111Il = 2880;
    private static final String l111l11111lIl = "fc_times";
    private static final String l111l1111l1Il = "ttl";
    private static final String l111l1111lI1l = "cnt";
    private static final String l111l1111lIl = "t";
    private static final int l111l1111llIl = 100;
    private SharedPreferences.Editor l11l1111I11l;
    private List<String> l11l1111I1l = null;
    private SharedPreferences l11l1111lIIl;

    private l111l11111Il() {
        try {
            Context contextL1111l111111Il = l111l1111l1Il.l1111l111111Il();
            if (contextL1111l111111Il != null) {
                SharedPreferences sharedPreferences = contextL1111l111111Il.getSharedPreferences(l111l11111lIl, 0);
                this.l11l1111lIIl = sharedPreferences;
                this.l11l1111I11l = sharedPreferences.edit();
            }
        } catch (Throwable unused) {
        }
    }

    public static synchronized l111l11111Il l1111l111111Il() {
        if (l1111l111111Il == null) {
            l1111l111111Il = new l111l11111Il();
        }
        return l1111l111111Il;
    }

    private void l111l11111Il() {
        HashSet hashSet = new HashSet(this.l11l1111lIIl.getStringSet("t", new HashSet()));
        hashSet.add(String.valueOf(System.currentTimeMillis()));
        this.l11l1111I11l.putStringSet("t", hashSet);
        this.l11l1111I11l.apply();
    }

    private void l111l1111l1Il() {
        this.l11l1111I1l = new ArrayList(this.l11l1111lIIl.getStringSet("t", new HashSet()));
        this.l11l1111I11l.putLong(l111l11111I1l, System.currentTimeMillis());
        this.l11l1111I11l.putStringSet("t", new HashSet());
        this.l11l1111I11l.apply();
    }

    public final synchronized void l1111l111111Il(int i10, int i11) {
        SharedPreferences.Editor editor = this.l11l1111I11l;
        if (editor != null) {
            if (i10 > 0) {
                editor.putInt("ttl", i10);
            }
            if (i11 > 0) {
                this.l11l1111I11l.putInt(l111l1111lI1l, i11);
            }
            this.l11l1111I11l.apply();
        }
    }

    public final synchronized List<String> l111l11111I1l() {
        ArrayList arrayList = new ArrayList();
        List<String> list = this.l11l1111I1l;
        if (list == null) {
            return arrayList;
        }
        arrayList.addAll(list);
        this.l11l1111I1l = null;
        return arrayList;
    }

    public final synchronized boolean l111l11111lIl() {
        try {
            try {
                SharedPreferences sharedPreferences = this.l11l1111lIIl;
                if (sharedPreferences != null && this.l11l1111I11l != null) {
                    int iMin = Math.min(sharedPreferences.getInt("ttl", 0), 2880);
                    if (iMin == 0) {
                        l111l1111l1Il();
                        return true;
                    }
                    if (((long) iMin) * 60000 < Math.abs(System.currentTimeMillis() - this.l11l1111lIIl.getLong(l111l11111I1l, 0L))) {
                        l111l1111l1Il();
                        return true;
                    }
                    if (this.l11l1111lIIl.getStringSet("t", new HashSet()).size() >= Math.min(this.l11l1111lIIl.getInt(l111l1111lI1l, 0), 100)) {
                        l111l1111l1Il();
                        return true;
                    }
                    HashSet hashSet = new HashSet(this.l11l1111lIIl.getStringSet("t", new HashSet()));
                    hashSet.add(String.valueOf(System.currentTimeMillis()));
                    this.l11l1111I11l.putStringSet("t", hashSet);
                    this.l11l1111I11l.apply();
                    return false;
                }
                return true;
            } catch (Throwable unused) {
                l111l1111l1Il();
                return true;
            }
        } catch (Throwable unused2) {
            return true;
        }
    }
}
