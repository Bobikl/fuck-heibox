package org.android.agoo.control;

import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import org.android.agoo.common.Config;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes5.dex */
public class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f132821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f132822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AgooFactory f132823c;

    a(AgooFactory agooFactory, byte[] bArr, String str) {
        this.f132823c = agooFactory;
        this.f132821a = bArr;
        this.f132822b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            String str = new String(this.f132821a, "utf-8");
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            if (length == 1) {
                String string = null;
                String string2 = null;
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    if (jSONObject != null) {
                        string = jSONObject.getString("i");
                        string2 = jSONObject.getString("p");
                    }
                }
                if (ALog.isPrintLog(ALog.Level.I)) {
                    ALog.i("AgooFactory", "saveMsg msgId:" + string + ",message=" + str + ",currentPack=" + string2 + ",reportTimes=" + Config.f(AgooFactory.mContext), new Object[0]);
                }
                if (TextUtils.isEmpty(string2) || !TextUtils.equals(string2, AgooFactory.mContext.getPackageName())) {
                    return;
                }
                if (TextUtils.isEmpty(this.f132822b)) {
                    this.f132823c.messageService.a(string, str, "0");
                } else {
                    this.f132823c.messageService.a(string, str, this.f132822b);
                }
            }
        } catch (Throwable th2) {
            ALog.e("AgooFactory", "saveMsg fail:" + th2.toString(), new Object[0]);
        }
    }
}
