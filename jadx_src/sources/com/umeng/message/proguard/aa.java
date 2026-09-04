package com.umeng.message.proguard;

import com.umeng.message.api.UPushAliasCallback;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class aa {
    aa() {
    }

    abstract void a() throws Exception;

    abstract void a(String str) throws Exception;

    abstract void a(String str, int i10) throws Exception;

    abstract void a(String str, int i10, String str2) throws Exception;

    abstract void a(String str, String str2, int i10) throws Exception;

    abstract void a(String str, String str2, JSONObject jSONObject, UPushAliasCallback uPushAliasCallback) throws Exception;

    abstract void b(String str, String str2, JSONObject jSONObject, UPushAliasCallback uPushAliasCallback) throws Exception;

    abstract void c(String str, String str2, JSONObject jSONObject, UPushAliasCallback uPushAliasCallback) throws Exception;
}
