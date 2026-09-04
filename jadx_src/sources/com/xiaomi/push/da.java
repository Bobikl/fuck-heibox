package com.xiaomi.push;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f106946a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final ArrayList<cz> f264a = new ArrayList<>();

    public da() {
    }

    public da(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the host is empty");
        }
        this.f106946a = str;
    }

    public synchronized cz a() {
        for (int size = this.f264a.size() - 1; size >= 0; size--) {
            cz czVar = this.f264a.get(size);
            if (czVar.m233a()) {
                dd.a().m244a(czVar.a());
                return czVar;
            }
        }
        return null;
    }

    public synchronized da a(JSONObject jSONObject) {
        this.f106946a = jSONObject.getString("host");
        JSONArray jSONArray = jSONObject.getJSONArray("fbs");
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            this.f264a.add(new cz(this.f106946a).a(jSONArray.getJSONObject(i10)));
        }
        return this;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m234a() {
        return this.f106946a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public ArrayList<cz> m235a() {
        return this.f264a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized JSONObject m236a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put("host", this.f106946a);
        JSONArray jSONArray = new JSONArray();
        Iterator<cz> it = this.f264a.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().m231a());
        }
        jSONObject.put("fbs", jSONArray);
        return jSONObject;
    }

    public synchronized void a(cz czVar) {
        int i10 = 0;
        while (i10 < this.f264a.size()) {
            if (this.f264a.get(i10).a(czVar)) {
                this.f264a.set(i10, czVar);
                break;
            }
            i10++;
        }
        if (i10 >= this.f264a.size()) {
            this.f264a.add(czVar);
        }
    }

    public synchronized void a(boolean z10) {
        for (int size = this.f264a.size() - 1; size >= 0; size--) {
            cz czVar = this.f264a.get(size);
            if (z10) {
                if (czVar.c()) {
                    this.f264a.remove(size);
                }
            } else if (!czVar.b()) {
                this.f264a.remove(size);
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f106946a);
        sb2.append("\n");
        Iterator<cz> it = this.f264a.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
        }
        return sb2.toString();
    }
}
