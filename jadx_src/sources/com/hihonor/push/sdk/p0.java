package com.hihonor.push.sdk;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class p0 implements Callable<List<HonorPushDataMsg>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f60067a;

    public p0(Context context) {
        this.f60067a = context;
    }

    @Override // java.util.concurrent.Callable
    public List<HonorPushDataMsg> call() throws Exception {
        ArrayList<ContentValues> parcelableArrayList;
        Bundle bundle = new Bundle();
        bundle.putString(Constants.PARAM_PKG_NAME, this.f60067a.getPackageName());
        Bundle bundleCall = this.f60067a.getContentResolver().call(Uri.parse("content://com.hihonor.android.pushagent.provider.MessageBoxProvider/"), "query_unread_msg", "", bundle);
        ArrayList arrayList = new ArrayList();
        if (bundleCall != null && (parcelableArrayList = bundleCall.getParcelableArrayList("messages")) != null) {
            for (ContentValues contentValues : parcelableArrayList) {
                JSONObject jSONObject = new JSONObject();
                for (String str : contentValues.keySet()) {
                    jSONObject.put(str, contentValues.get(str));
                }
                HonorPushDataMsg honorPushDataMsg = new HonorPushDataMsg();
                honorPushDataMsg.setData(jSONObject.toString());
                honorPushDataMsg.setType(1);
                arrayList.add(honorPushDataMsg);
            }
        }
        return arrayList;
    }
}
