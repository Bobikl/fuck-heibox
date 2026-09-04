package com.vivo.push.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: BaseSharePreference.java */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f106657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f106658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile SharedPreferences f106659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HashMap<String, String> f106660d = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private HashMap<String, Long> f106661e = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private HashMap<String, Integer> f106662f = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private HashMap<String, Boolean> f106663g = new HashMap<>();

    public static void a(SharedPreferences.Editor editor) {
        if (editor == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            editor.apply();
        } else {
            editor.commit();
        }
    }

    private void a(Map<String, String> map) {
        if (map.size() > 0) {
            b();
            if (this.f106659c != null) {
                SharedPreferences.Editor editorEdit = this.f106659c.edit();
                for (String str : map.keySet()) {
                    String str2 = map.get(str);
                    this.f106660d.put(str, str2);
                    editorEdit.putString(str, str2);
                }
                a(editorEdit);
            }
        }
    }

    private void b() {
        if (this.f106659c == null) {
            Context context = this.f106657a;
            if (context == null) {
                throw new RuntimeException("SharedPreferences is not init", new Throwable());
            }
            this.f106659c = context.getSharedPreferences(this.f106658b, 0);
        }
    }

    private List<String> c(String str) {
        String[] strArrSplit;
        if (this.f106657a == null) {
            p.c("BaseSharePreference", " parsLocalIv error mContext is null ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            Context context = this.f106657a;
            Object objA = z.a(context, context.getPackageName(), str);
            if (objA == null) {
                return null;
            }
            String str2 = new String(Base64.decode(objA.toString(), 2));
            if (!TextUtils.isEmpty(str2) && (strArrSplit = str2.split(",#@")) != null && strArrSplit.length >= 4) {
                for (String str3 : strArrSplit) {
                    arrayList.add(str3.replace(",#@", ""));
                }
                if (arrayList.size() < 4) {
                }
            }
            return null;
        } catch (Exception e10) {
            p.c("BaseSharePreference", " parsLocalIv error e =" + e10.getMessage());
            e10.printStackTrace();
        }
        return arrayList;
    }

    public final int a(String str) {
        Integer numValueOf = this.f106662f.get(str);
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        b();
        if (this.f106659c != null) {
            numValueOf = Integer.valueOf(this.f106659c.getInt(str, 0));
            if (!numValueOf.equals(0)) {
                this.f106662f.put(str, numValueOf);
            }
        }
        return numValueOf.intValue();
    }

    public final void a() {
        this.f106661e.clear();
        this.f106662f.clear();
        this.f106663g.clear();
        this.f106660d.clear();
        b();
        if (this.f106659c != null) {
            SharedPreferences.Editor editorEdit = this.f106659c.edit();
            editorEdit.clear();
            a(editorEdit);
        }
    }

    public final void a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("sharedFileName can't be null");
        }
        this.f106658b = str;
        this.f106659c = context.getSharedPreferences(str, 0);
        this.f106657a = context;
        List<String> listC = c("local_iv");
        if (listC == null || listC.size() < 4) {
            p.a("BaseSharePreference", " initSecureCode error list is null ");
            return;
        }
        HashMap map = new HashMap();
        map.put("com.vivo.push.secure_sub_iv", listC.get(1));
        map.put("com.vivo.push.secure_sub_key", listC.get(2));
        map.put("com.vivo.push.secure_cache_iv", listC.get(3));
        map.put("com.vivo.push.secure_cache_key", listC.get(0));
        a(map);
    }

    public final void a(String str, int i10) {
        this.f106662f.put(str, Integer.valueOf(i10));
        b();
        if (this.f106659c != null) {
            SharedPreferences.Editor editorEdit = this.f106659c.edit();
            editorEdit.putInt(str, i10);
            a(editorEdit);
        }
    }

    public final void a(String str, long j10) {
        this.f106661e.put(str, Long.valueOf(j10));
        b();
        if (this.f106659c != null) {
            SharedPreferences.Editor editorEdit = this.f106659c.edit();
            editorEdit.putLong(str, j10);
            a(editorEdit);
        }
    }

    public final void a(String str, String str2) {
        this.f106660d.put(str, str2);
        b();
        if (this.f106659c != null) {
            SharedPreferences.Editor editorEdit = this.f106659c.edit();
            editorEdit.putString(str, str2);
            a(editorEdit);
        }
    }

    public final long b(String str, long j10) {
        Long lValueOf = this.f106661e.get(str);
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        b();
        if (this.f106659c != null) {
            lValueOf = Long.valueOf(this.f106659c.getLong(str, j10));
            if (!lValueOf.equals(Long.valueOf(j10))) {
                this.f106661e.put(str, lValueOf);
            }
        }
        return lValueOf.longValue();
    }

    public final String b(String str, String str2) {
        String string = this.f106660d.get(str);
        if (string != null) {
            return string;
        }
        b();
        if (this.f106659c != null) {
            string = this.f106659c.getString(str, str2);
            if (!TextUtils.isEmpty(string) && !string.equals(str2)) {
                this.f106660d.put(str, string);
            }
        }
        return string;
    }

    public final void b(String str) {
        this.f106661e.remove(str);
        this.f106662f.remove(str);
        this.f106663g.remove(str);
        this.f106660d.remove(str);
        b();
        if (this.f106659c != null) {
            SharedPreferences.Editor editorEdit = this.f106659c.edit();
            if (this.f106659c.contains(str)) {
                editorEdit.remove(str);
                a(editorEdit);
            }
        }
    }
}
