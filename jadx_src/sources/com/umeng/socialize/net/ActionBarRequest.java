package com.umeng.socialize.net;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.socialize.Config;
import com.umeng.socialize.net.base.SocializeRequest;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import com.umeng.socialize.net.utils.URequest;
import com.umeng.socialize.utils.SocializeUtils;

/* JADX INFO: loaded from: classes4.dex */
public class ActionBarRequest extends SocializeRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f106278a = "/bar/get/";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f106279b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f106280c;

    /* JADX WARN: Illegal instructions before constructor call */
    public ActionBarRequest(Context context, boolean z10) {
        URequest.RequestMethod requestMethod = URequest.RequestMethod.GET;
        super(context, "", ActionBarResponse.class, 1, requestMethod);
        this.mContext = context;
        this.f106280c = z10 ? 1 : 0;
        this.mMethod = requestMethod;
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public String getEcryptString(String str) {
        return Base64.encodeToString(str.getBytes(), 2);
    }

    @Override // com.umeng.socialize.net.base.SocializeRequest
    protected String getPath() {
        return f106278a + SocializeUtils.getAppkey(this.mContext) + "/android";
    }

    @Override // com.umeng.socialize.net.base.SocializeRequest, com.umeng.socialize.net.utils.URequest
    public void onPrepareRequest() {
        addStringParams(SocializeProtocolConstants.PROTOCOL_KEY_DESCRIPTOR, Config.Descriptor);
        addStringParams(SocializeProtocolConstants.PROTOCOL_KEY_NEW_INSTALL, String.valueOf(this.f106280c));
        if (TextUtils.isEmpty(Config.EntityName)) {
            return;
        }
        addStringParams(SocializeProtocolConstants.PROTOCOL_KEY_ENTITY_NAME, Config.EntityName);
    }
}
