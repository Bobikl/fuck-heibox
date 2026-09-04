package com.xiaomi.push;

import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class di implements Comparable<di> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f106956a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private long f278a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    String f279a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final LinkedList<cy> f280a;

    public di() {
        this(null, 0);
    }

    public di(String str) {
        this(str, 0);
    }

    public di(String str, int i10) {
        this.f280a = new LinkedList<>();
        this.f278a = 0L;
        this.f279a = str;
        this.f106956a = i10;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(di diVar) {
        if (diVar == null) {
            return 1;
        }
        return diVar.f106956a - this.f106956a;
    }

    public synchronized di a(JSONObject jSONObject) {
        this.f278a = jSONObject.getLong(com.google.android.exoplayer2.text.ttml.d.f49795n);
        this.f106956a = jSONObject.getInt("wt");
        this.f279a = jSONObject.getString("host");
        JSONArray jSONArray = jSONObject.getJSONArray("ah");
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            this.f280a.add(new cy().a(jSONArray.getJSONObject(i10)));
        }
        return this;
    }

    public synchronized JSONObject a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put(com.google.android.exoplayer2.text.ttml.d.f49795n, this.f278a);
        jSONObject.put("wt", this.f106956a);
        jSONObject.put("host", this.f279a);
        JSONArray jSONArray = new JSONArray();
        Iterator<cy> it = this.f280a.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().m229a());
        }
        jSONObject.put("ah", jSONArray);
        return jSONObject;
    }

    protected synchronized void a(cy cyVar) {
        if (cyVar != null) {
            this.f280a.add(cyVar);
            int iA = cyVar.a();
            if (iA > 0) {
                this.f106956a += cyVar.a();
            } else {
                int i10 = 0;
                for (int size = this.f280a.size() - 1; size >= 0 && this.f280a.get(size).a() < 0; size--) {
                    i10++;
                }
                this.f106956a += iA * i10;
            }
            if (this.f280a.size() > 30) {
                this.f106956a -= this.f280a.remove().a();
            }
        }
    }

    public String toString() {
        return this.f279a + ":" + this.f106956a;
    }
}
