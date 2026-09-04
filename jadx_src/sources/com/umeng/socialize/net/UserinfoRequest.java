package com.umeng.socialize.net;

import com.umeng.socialize.net.utils.URequest;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class UserinfoRequest extends URequest {
    private static final String REQUEST_USERINFO = "https://api.weibo.com/2/users/show.json";

    public UserinfoRequest(String str, String str2, String str3) {
        super(REQUEST_USERINFO);
        this.mMethod = URequest.RequestMethod.GET;
        this.mResponseClz = UserinfoResponse.class;
        addStringParams("uid", str);
        addStringParams("appkey", str3);
        addStringParams("access_token", str2);
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public Map<String, Object> buildParams() {
        HashMap map = new HashMap();
        map.putAll(this.mParams);
        return map;
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public String toGetUrl() {
        return generateGetURL(getBaseUrl(), buildParams());
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public JSONObject toJson() {
        return null;
    }
}
