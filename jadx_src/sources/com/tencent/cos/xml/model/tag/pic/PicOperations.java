package com.tencent.cos.xml.model.tag.pic;

import com.tencent.cos.xml.BeaconService;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class PicOperations {
    private static final String TAG = "PicOperations";
    private boolean isPicInfo;
    private List<PicOperationRule> rules;

    public PicOperations(boolean z10, List<PicOperationRule> list) {
        this.isPicInfo = z10;
        this.rules = list;
    }

    public String toJsonStr() {
        List<PicOperationRule> list = this.rules;
        if (list != null && !list.isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("is_pic_info", this.isPicInfo ? 1 : 0);
                JSONArray jSONArray = new JSONArray();
                Iterator<PicOperationRule> it = this.rules.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().toJsonObject());
                }
                jSONObject.put("rules", jSONArray);
                return jSONObject.toString();
            } catch (JSONException e10) {
                BeaconService.getInstance().reportError(TAG, e10);
                e10.printStackTrace();
            }
        }
        return "{}";
    }
}
