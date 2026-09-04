package com.bytedance.sdk.open.aweme.base;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import i7.a;

/* JADX INFO: loaded from: classes6.dex */
public class MicroAppInfo {

    @SerializedName("appId")
    private String appId;

    @SerializedName("appTitle")
    private String appTitle;

    @SerializedName("appUrl")
    private String appUrl;

    @SerializedName("description")
    private String description;

    public static MicroAppInfo unserialize(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString(a.f.f119292i);
        try {
            if (!TextUtils.isEmpty(string)) {
                return (MicroAppInfo) new Gson().fromJson(string, MicroAppInfo.class);
            }
        } catch (JsonSyntaxException e10) {
            e10.printStackTrace();
        }
        return null;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppTitle() {
        return this.appTitle;
    }

    public String getAppUrl() {
        return this.appUrl;
    }

    public String getDescription() {
        return this.description;
    }

    public void serialize(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.putString(a.f.f119292i, new Gson().toJson(this));
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAppTitle(String str) {
        this.appTitle = str;
    }

    public void setAppUrl(String str) {
        this.appUrl = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }
}
