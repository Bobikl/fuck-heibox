package com.umeng.message.proguard;

import android.app.Application;
import android.text.TextUtils;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.MessageSharedPrefs;
import com.umeng.message.common.inter.ITagManager;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ar implements ITagManager {
    @Override // com.umeng.message.common.inter.ITagManager
    public final ITagManager.Result addTags(JSONObject jSONObject, String... strArr) throws Exception {
        Application applicationA = x.a();
        ITagManager.Result result = new ITagManager.Result(g.a(jSONObject, "https://msg.umengcloud.com/v3/tag/add", UMUtils.getAppkey(applicationA)));
        if (TextUtils.equals(result.status, ITagManager.SUCCESS)) {
            MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(applicationA);
            messageSharedPrefs.a(strArr);
            messageSharedPrefs.a(result.remain);
            messageSharedPrefs.a("tag_add_", result.interval);
        }
        return result;
    }

    @Override // com.umeng.message.common.inter.ITagManager
    public final ITagManager.Result deleteTags(JSONObject jSONObject, String... strArr) throws Exception {
        Application applicationA = x.a();
        ITagManager.Result result = new ITagManager.Result(g.a(jSONObject, "https://msg.umengcloud.com/v3/tag/delete", UMUtils.getAppkey(applicationA)));
        if (TextUtils.equals(result.status, ITagManager.SUCCESS)) {
            MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(applicationA);
            if (strArr != null && strArr.length != 0) {
                Set<String> setB = messageSharedPrefs.f105562b.b("tags", new HashSet());
                for (String str : strArr) {
                    setB.remove(str);
                }
                messageSharedPrefs.f105562b.a("tags", setB);
            }
            messageSharedPrefs.a(result.remain);
            messageSharedPrefs.a("tag_del_", result.interval);
        }
        return result;
    }

    @Override // com.umeng.message.common.inter.ITagManager
    public final List<String> getTags(JSONObject jSONObject) throws Exception {
        Application applicationA = x.a();
        JSONObject jSONObjectA = g.a(jSONObject, "https://msg.umengcloud.com/v3/tag/get", UMUtils.getAppkey(applicationA));
        if (jSONObjectA == null) {
            return null;
        }
        ITagManager.Result result = new ITagManager.Result(jSONObjectA);
        if (!TextUtils.equals(result.status, ITagManager.SUCCESS)) {
            return null;
        }
        MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(applicationA);
        messageSharedPrefs.a(result.remain);
        messageSharedPrefs.a("tag_get_", result.interval);
        String strOptString = jSONObjectA.optString("tags");
        if (strOptString.length() <= 0) {
            return null;
        }
        String[] strArrSplit = strOptString.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        List<String> listAsList = Arrays.asList(strArrSplit);
        messageSharedPrefs.f105562b.a("tags");
        messageSharedPrefs.a(strArrSplit);
        return listAsList;
    }
}
