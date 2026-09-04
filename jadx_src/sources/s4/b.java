package s4;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f139272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a5.a f139273b;

    public b(String str, a5.a aVar) {
        this.f139272a = null;
        this.f139273b = null;
        this.f139272a = new File(str);
        this.f139273b = aVar;
    }

    public static String a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "id");
            jSONObject.put("error", str);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        File file = this.f139272a;
        if (file == null) {
            return;
        }
        if (file.exists() && this.f139272a.isDirectory() && this.f139272a.list().length != 0) {
            ArrayList arrayList = new ArrayList();
            for (String str : this.f139272a.list()) {
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
            if (!this.f139273b.logCollect(a(e6.b.a(this.f139272a.getAbsolutePath(), str2)))) {
                size--;
            }
            for (int i10 = 0; i10 < size; i10++) {
                new File(this.f139272a, (String) arrayList.get(i10)).delete();
            }
        }
    }

    public final void b() {
        new Thread(new c(this)).start();
    }
}
