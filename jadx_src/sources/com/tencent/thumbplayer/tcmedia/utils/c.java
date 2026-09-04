package com.tencent.thumbplayer.tcmedia.utils;

import android.content.Context;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f103138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f103139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<String> f103140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f103141d;

    public c(Context context, String str) {
        this.f103138a = null;
        this.f103139b = null;
        this.f103140c = null;
        this.f103141d = null;
        this.f103138a = a.a(context, str);
        String str2 = str + "_key";
        this.f103141d = str2;
        a aVarA = a.a(context, str2);
        this.f103139b = aVarA;
        ArrayList<String> arrayList = (ArrayList) aVarA.b(this.f103141d);
        this.f103140c = arrayList;
        if (arrayList == null) {
            this.f103140c = new ArrayList<>();
        }
    }

    public synchronized Object a() {
        Object objB;
        ArrayList arrayList = (ArrayList) this.f103139b.b(this.f103141d);
        ArrayList arrayList2 = null;
        if (arrayList != null && arrayList.size() > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                String str = (String) arrayList.get(i10);
                if (!TextUtils.isEmpty(str) && (objB = this.f103138a.b(str)) != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(objB);
                }
            }
            this.f103138a.a();
            this.f103139b.a();
            this.f103140c.clear();
            return arrayList2;
        }
        return null;
    }

    public synchronized void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f103138a.c(str);
        this.f103140c.remove(str);
        this.f103139b.c(this.f103141d);
        if (!this.f103140c.isEmpty()) {
            this.f103139b.a(this.f103141d, this.f103140c);
        }
    }

    public synchronized void a(String str, Serializable serializable) {
        if (serializable != null) {
            if (!TextUtils.isEmpty(str)) {
                this.f103138a.c(str);
                this.f103138a.a(str, serializable);
                this.f103140c.remove(str);
                this.f103140c.add(str);
                this.f103139b.c(this.f103141d);
                this.f103139b.a(this.f103141d, this.f103140c);
            }
        }
    }

    public synchronized Object b(String str) {
        return this.f103138a.b(str);
    }

    public synchronized ArrayList<String> b() {
        return (ArrayList) this.f103140c.clone();
    }

    public synchronized void c() {
        this.f103138a.a();
        this.f103139b.a();
        this.f103140c.clear();
    }
}
