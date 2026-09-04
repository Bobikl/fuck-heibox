package com.umeng.socialize.handler;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class SinaPreferences {
    private static final String FOLLOW = "isfollow";
    private static final String KEY_ACCESS_KEY = "access_key";
    private static final String KEY_ACCESS_SECRET = "access_secret";
    private static final String KEY_ACCESS_TOKEN = "access_token";
    private static final String KEY_REFRESH_TOKEN = "refresh_token";
    private static final String KEY_SSO_TTL = "expires_in";
    private static final String KEY_SSO_UID = "uid";
    private static final String KEY_TTL = "expires_in";
    private static final String KEY_UID = "uid";
    private static final String KEY_USER_NAME = "userName";
    private boolean isfollow;
    private String mAccessKey;
    private String mAccessSecret;
    private String mAccessToken;
    private String mRefreshToken;
    private long mTTL;
    private String mUID;
    private String mUserName = null;
    private SharedPreferences sharedPreferences;

    public SinaPreferences(Context context, String str) {
        this.mAccessKey = null;
        this.mAccessSecret = null;
        this.mUID = null;
        this.mTTL = 0L;
        this.mAccessToken = null;
        this.mRefreshToken = null;
        this.isfollow = false;
        this.sharedPreferences = null;
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        this.sharedPreferences = sharedPreferences;
        this.mAccessKey = sharedPreferences.getString(KEY_ACCESS_KEY, null);
        this.mRefreshToken = this.sharedPreferences.getString(KEY_REFRESH_TOKEN, null);
        this.mAccessSecret = this.sharedPreferences.getString(KEY_ACCESS_SECRET, null);
        this.mAccessToken = this.sharedPreferences.getString("access_token", null);
        this.mUID = this.sharedPreferences.getString("uid", null);
        this.mTTL = this.sharedPreferences.getLong("expires_in", 0L);
        this.isfollow = this.sharedPreferences.getBoolean(FOLLOW, false);
    }

    public void commit() {
        this.sharedPreferences.edit().putString(KEY_ACCESS_KEY, this.mAccessKey).putString(KEY_ACCESS_SECRET, this.mAccessSecret).putString("access_token", this.mAccessToken).putString(KEY_REFRESH_TOKEN, this.mRefreshToken).putString("uid", this.mUID).putLong("expires_in", this.mTTL).commit();
    }

    public void delete() {
        this.mAccessKey = null;
        this.mAccessSecret = null;
        this.mAccessToken = null;
        this.mUID = null;
        this.mTTL = 0L;
        this.sharedPreferences.edit().clear().commit();
    }

    public Map<String, String> getAuthData() {
        HashMap map = new HashMap();
        map.put(KEY_ACCESS_KEY, this.mAccessKey);
        map.put(KEY_ACCESS_SECRET, this.mAccessSecret);
        map.put("uid", this.mUID);
        map.put("expires_in", String.valueOf(this.mTTL));
        return map;
    }

    public String getUID() {
        return this.mUID;
    }

    public String getmAccessToken() {
        return this.mAccessToken;
    }

    public String getmRefreshToken() {
        return this.mRefreshToken;
    }

    public long getmTTL() {
        return this.mTTL;
    }

    public boolean isAuthValid() {
        return isAuthorized() && !(((this.mTTL - System.currentTimeMillis()) > 0L ? 1 : ((this.mTTL - System.currentTimeMillis()) == 0L ? 0 : -1)) <= 0);
    }

    public boolean isAuthorized() {
        return !TextUtils.isEmpty(this.mAccessToken);
    }

    public SinaPreferences setAuthData(Bundle bundle) {
        this.mAccessToken = bundle.getString("access_token");
        this.mRefreshToken = bundle.getString(KEY_REFRESH_TOKEN);
        this.mUID = bundle.getString("uid");
        if (!TextUtils.isEmpty(bundle.getString("expires_in"))) {
            this.mTTL = (Long.valueOf(bundle.getString("expires_in")).longValue() * 1000) + System.currentTimeMillis();
        }
        return this;
    }

    public SinaPreferences setAuthData(Map<String, String> map) {
        this.mAccessKey = map.get(KEY_ACCESS_KEY);
        this.mAccessSecret = map.get(KEY_ACCESS_SECRET);
        this.mAccessToken = map.get("access_token");
        this.mRefreshToken = map.get(KEY_REFRESH_TOKEN);
        this.mUID = map.get("uid");
        if (!TextUtils.isEmpty(map.get("expires_in"))) {
            this.mTTL = (Long.valueOf(map.get("expires_in")).longValue() * 1000) + System.currentTimeMillis();
        }
        return this;
    }
}
