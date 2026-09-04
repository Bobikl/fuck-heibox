package com.alipay.deviceid.module.x;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import org.json.JSONObject;

/* JADX INFO: compiled from: LogUploadManager.java */
/* JADX INFO: loaded from: classes6.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f38374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private q f38375b;

    public v(String str, q qVar) {
        this.f38374a = null;
        this.f38375b = null;
        this.f38374a = new File(str);
        this.f38375b = qVar;
    }

    private static String a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "id");
            jSONObject.put("error", str);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    final synchronized void a() {
        File file = this.f38374a;
        if (file == null) {
            return;
        }
        if (file.exists() && this.f38374a.isDirectory() && this.f38374a.list().length != 0) {
            ArrayList arrayList = new ArrayList();
            for (String str : this.f38374a.list()) {
                arrayList.add(str);
            }
            Collections.sort(arrayList);
            String str2 = (String) arrayList.get(arrayList.size() - 1);
            int size = arrayList.size();
            if (str2.equals(new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()) + ".log")) {
                if (arrayList.size() < 2) {
                    return;
                }
                str2 = (String) arrayList.get(arrayList.size() - 2);
                size--;
            }
            if (!this.f38375b.a(a(f.a(this.f38374a.getAbsolutePath(), str2)))) {
                size--;
            }
            for (int i10 = 0; i10 < size; i10++) {
                new File(this.f38374a, (String) arrayList.get(i10)).delete();
            }
        }
    }
}
