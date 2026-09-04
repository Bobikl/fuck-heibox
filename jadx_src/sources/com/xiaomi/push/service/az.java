package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.xiaomi.push.is;
import com.xiaomi.push.it;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class az {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile az f107902a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    protected SharedPreferences f1028a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private HashSet<a> f1029a = new HashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected SharedPreferences f107903b;

    public static abstract class a implements Runnable {
        private String mDescription;
        private int mId;

        public a(int i10, String str) {
            this.mId = i10;
            this.mDescription = str;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && this.mId == ((a) obj).mId;
        }

        public int hashCode() {
            return this.mId;
        }

        protected abstract void onCallback();

        @Override // java.lang.Runnable
        public final void run() {
            onCallback();
        }
    }

    private az(Context context) {
        this.f1028a = context.getSharedPreferences("mipush_oc_normal", 0);
        this.f107903b = context.getSharedPreferences("mipush_oc_custom", 0);
    }

    public static az a(Context context) {
        if (f107902a == null) {
            synchronized (az.class) {
                if (f107902a == null) {
                    f107902a = new az(context);
                }
            }
        }
        return f107902a;
    }

    private String a(int i10) {
        return "oc_" + i10;
    }

    private String a(it itVar) {
        return "oc_version_" + itVar.a();
    }

    private void a(SharedPreferences.Editor editor, Pair<Integer, Object> pair, String str) {
        Object obj = pair.second;
        if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            editor.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (!(obj instanceof String)) {
            if (obj instanceof Boolean) {
                editor.putBoolean(str, ((Boolean) obj).booleanValue());
            }
        } else {
            String str2 = (String) obj;
            if (str.equals(a(is.AppIsInstalledList.a()))) {
                editor.putString(str, com.xiaomi.push.bm.a(str2));
            } else {
                editor.putString(str, str2);
            }
        }
    }

    public int a(int i10, int i11) {
        try {
            String strA = a(i10);
            if (this.f107903b.contains(strA)) {
                return this.f107903b.getInt(strA, 0);
            }
            return this.f1028a.contains(strA) ? this.f1028a.getInt(strA, 0) : i11;
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m62a(i10 + " oc int error " + e10);
            return i11;
        }
    }

    public int a(it itVar, int i10) {
        try {
            return this.f1028a.getInt(a(itVar), i10);
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m62a(itVar + " version error " + e10);
            return i10;
        }
    }

    public long a(int i10, long j10) {
        try {
            String strA = a(i10);
            if (this.f107903b.contains(strA)) {
                return this.f107903b.getLong(strA, 0L);
            }
            return this.f1028a.contains(strA) ? this.f1028a.getLong(strA, 0L) : j10;
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m62a(i10 + " oc long error " + e10);
            return j10;
        }
    }

    public String a(int i10, String str) {
        try {
            String strA = a(i10);
            if (this.f107903b.contains(strA)) {
                return this.f107903b.getString(strA, null);
            }
            return this.f1028a.contains(strA) ? this.f1028a.getString(strA, null) : str;
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m62a(i10 + " oc string error " + e10);
            return str;
        }
    }

    public synchronized void a() {
        this.f1029a.clear();
    }

    public synchronized void a(a aVar) {
        if (!this.f1029a.contains(aVar)) {
            this.f1029a.add(aVar);
        }
    }

    public void a(List<Pair<Integer, Object>> list) {
        if (com.xiaomi.push.ac.a(list)) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f107903b.edit();
        for (Pair<Integer, Object> pair : list) {
            Object obj = pair.first;
            if (obj != null) {
                String strA = a(((Integer) obj).intValue());
                if (pair.second == null) {
                    editorEdit.remove(strA);
                } else {
                    a(editorEdit, pair, strA);
                }
            }
        }
        editorEdit.apply();
    }

    public void a(List<Pair<it, Integer>> list, List<Pair<Integer, Object>> list2) {
        if (com.xiaomi.push.ac.a(list) || com.xiaomi.push.ac.a(list2)) {
            com.xiaomi.channel.commonutils.logger.b.m62a("not update oc, because versions or configs are empty");
            return;
        }
        SharedPreferences.Editor editorEdit = this.f1028a.edit();
        editorEdit.clear();
        for (Pair<it, Integer> pair : list) {
            Object obj = pair.first;
            if (obj != null && pair.second != null) {
                editorEdit.putInt(a((it) obj), ((Integer) pair.second).intValue());
            }
        }
        for (Pair<Integer, Object> pair2 : list2) {
            Object obj2 = pair2.first;
            if (obj2 != null && pair2.second != null) {
                a(editorEdit, pair2, a(((Integer) obj2).intValue()));
            }
        }
        editorEdit.apply();
    }

    public boolean a(int i10, boolean z10) {
        try {
            String strA = a(i10);
            if (this.f107903b.contains(strA)) {
                return this.f107903b.getBoolean(strA, false);
            }
            return this.f1028a.contains(strA) ? this.f1028a.getBoolean(strA, false) : z10;
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m62a(i10 + " oc boolean error " + e10);
            return z10;
        }
    }

    void b() {
        com.xiaomi.channel.commonutils.logger.b.c("OC_Callback : receive new oc data");
        HashSet<a> hashSet = new HashSet();
        synchronized (this) {
            hashSet.addAll(this.f1029a);
        }
        for (a aVar : hashSet) {
            if (aVar != null) {
                aVar.run();
            }
        }
        hashSet.clear();
    }
}
