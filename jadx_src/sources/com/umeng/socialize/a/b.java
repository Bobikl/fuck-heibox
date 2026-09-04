package com.umeng.socialize.a;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.socialize.utils.ContextUtil;
import java.util.Map;

/* JADX INFO: compiled from: DataStore.java */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile b f106074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f106075b = ContextUtil.getContext().getSharedPreferences("um_social_azx", 0);

    private b() {
    }

    public static b a() {
        if (f106074a == null) {
            synchronized (b.class) {
                if (f106074a == null) {
                    f106074a = new b();
                }
            }
        }
        return f106074a;
    }

    public int a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return 0;
        }
        SharedPreferences.Editor editorEdit = this.f106075b.edit();
        int i10 = 0;
        for (String str : strArr) {
            if (this.f106075b.contains(str)) {
                editorEdit.remove(str);
                i10++;
            }
        }
        if (i10 > 0) {
            editorEdit.apply();
        }
        return i10;
    }

    public void a(String str) {
        if (this.f106075b.contains(str)) {
            this.f106075b.edit().remove(str).apply();
        }
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f106075b.edit().putString(str, str2).apply();
    }

    public String b(String str, String str2) {
        return this.f106075b.getString(str, str2);
    }

    public Map<String, ?> b() {
        return this.f106075b.getAll();
    }
}
