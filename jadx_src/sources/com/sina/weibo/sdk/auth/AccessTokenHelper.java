package com.sina.weibo.sdk.auth;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.sina.weibo.sdk.a.e;
import com.sina.weibo.sdk.net.c;

/* JADX INFO: loaded from: classes8.dex */
public class AccessTokenHelper {
    private static final String PREFERENCES_NAME = "com_weibo_sdk_android";

    public static void clearAccessToken(Context context) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREFERENCES_NAME, 0).edit();
        editorEdit.clear();
        editorEdit.apply();
    }

    public static Oauth2AccessToken readAccessToken(Context context) {
        if (context == null) {
            return null;
        }
        Oauth2AccessToken oauth2AccessToken = new Oauth2AccessToken();
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES_NAME, 0);
        oauth2AccessToken.setUid(sharedPreferences.getString("uid", ""));
        oauth2AccessToken.setScreenName(sharedPreferences.getString("userName", ""));
        oauth2AccessToken.setAccessToken(sharedPreferences.getString("access_token", ""));
        oauth2AccessToken.setRefreshToken(sharedPreferences.getString("refresh_token", ""));
        oauth2AccessToken.setExpiresTime(sharedPreferences.getLong("expires_in", 0L));
        return oauth2AccessToken;
    }

    public static void refreshAccessToken(final Context context, String str) {
        Oauth2AccessToken accessToken = readAccessToken(context);
        if (accessToken != null) {
            com.sina.weibo.sdk.a.b.a.K.a(new e(str, accessToken, new c<String>() { // from class: com.sina.weibo.sdk.auth.AccessTokenHelper.1
                @Override // com.sina.weibo.sdk.net.c
                public final /* synthetic */ void a(String str2) {
                    AccessTokenHelper.writeAccessToken(context, Oauth2AccessToken.parseAccessToken(str2));
                }

                @Override // com.sina.weibo.sdk.net.c
                public final void onError(Throwable th2) {
                }
            }));
        }
    }

    public static void writeAccessToken(Context context, Oauth2AccessToken oauth2AccessToken) {
        if (context == null || oauth2AccessToken == null || TextUtils.isEmpty(oauth2AccessToken.getAccessToken())) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREFERENCES_NAME, 0).edit();
        editorEdit.putString("uid", oauth2AccessToken.getUid());
        editorEdit.putString("userName", oauth2AccessToken.getScreenName());
        editorEdit.putString("access_token", oauth2AccessToken.getAccessToken());
        editorEdit.putString("refresh_token", oauth2AccessToken.getRefreshToken());
        editorEdit.putLong("expires_in", oauth2AccessToken.getExpiresTime());
        editorEdit.apply();
    }
}
