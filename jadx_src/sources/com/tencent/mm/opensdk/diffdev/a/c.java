package com.tencent.mm.opensdk.diffdev.a;

import android.os.AsyncTask;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.utils.Log;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class c extends AsyncTask<Void, Void, a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f100910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f100911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OAuthListener f100912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f100913d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public OAuthErrCode f100914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f100915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f100916c;

        a() {
        }
    }

    public c(String str, OAuthListener oAuthListener) {
        this.f100910a = str;
        this.f100912c = oAuthListener;
        this.f100911b = String.format("https://long.open.weixin.qq.com/connect/l/qrconnect?f=json&uuid=%s", str);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d4 A[Catch: Exception -> 0x00d9, TryCatch #1 {Exception -> 0x00d9, blocks: (B:20:0x008f, B:22:0x00a0, B:26:0x00b9, B:28:0x00bd, B:29:0x00cb, B:33:0x00d6, B:30:0x00ce, B:31:0x00d1, B:32:0x00d4), top: B:65:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0138  */
    /* JADX WARN: Code duplicated, block: B:68:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0144 A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    protected a doInBackground(Void[] voidArr) throws Throwable {
        a aVar;
        OAuthErrCode oAuthErrCode;
        String str;
        OAuthErrCode oAuthErrCode2;
        OAuthErrCode oAuthErrCode3;
        int i10;
        String str2;
        String str3;
        OAuthErrCode oAuthErrCode4;
        Thread.currentThread().setName("OpenSdkNoopingTask");
        String str4 = this.f100910a;
        if (str4 != null && str4.length() != 0) {
            Log.i("MicroMsg.SDK.NoopingTask", "doInBackground start " + isCancelled());
            while (true) {
                if (isCancelled()) {
                    Log.i("MicroMsg.SDK.NoopingTask", "IDiffDevOAuth.stopAuth / detach invoked");
                    aVar = new a();
                    oAuthErrCode = OAuthErrCode.WechatAuth_Err_Auth_Stopped;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f100911b);
                    if (this.f100913d == 0) {
                        str = "";
                    } else {
                        str = "&last=" + this.f100913d;
                    }
                    sb2.append(str);
                    String string = sb2.toString();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    byte[] bArrA = com.tencent.mm.opensdk.channel.a.a.a(string, 60000);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    aVar = new a();
                    Log.d("MicroMsg.SDK.NoopingResult", "star parse NoopingResult");
                    if (bArrA == null || bArrA.length == 0) {
                        Log.e("MicroMsg.SDK.NoopingResult", "parse fail, buf is null");
                        oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_NetworkErr;
                    } else {
                        try {
                            try {
                                JSONObject jSONObject = new JSONObject(new String(bArrA, "utf-8"));
                                int i11 = jSONObject.getInt("wx_errcode");
                                aVar.f100916c = i11;
                                Log.d("MicroMsg.SDK.NoopingResult", String.format("nooping uuidStatusCode = %d", Integer.valueOf(i11)));
                                int i12 = aVar.f100916c;
                                if (i12 == 408) {
                                    oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_OK;
                                    aVar.f100914a = oAuthErrCode4;
                                } else if (i12 != 500) {
                                    switch (i12) {
                                        case 402:
                                            oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_Timeout;
                                            aVar.f100914a = oAuthErrCode4;
                                            break;
                                        case 403:
                                            oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_Cancel;
                                            aVar.f100914a = oAuthErrCode4;
                                            break;
                                        case 404:
                                            oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_OK;
                                            aVar.f100914a = oAuthErrCode4;
                                            break;
                                        case 405:
                                            aVar.f100914a = OAuthErrCode.WechatAuth_Err_OK;
                                            aVar.f100915b = jSONObject.getString("wx_code");
                                            break;
                                        default:
                                            oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_NormalErr;
                                            aVar.f100914a = oAuthErrCode4;
                                            break;
                                    }
                                } else {
                                    oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_NormalErr;
                                    aVar.f100914a = oAuthErrCode4;
                                }
                            } catch (Exception e10) {
                                str3 = String.format("parse json fail, ex = %s", e10.getMessage());
                                Log.e("MicroMsg.SDK.NoopingResult", str3);
                                oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_NormalErr;
                                aVar.f100914a = oAuthErrCode2;
                            }
                        } catch (Exception e11) {
                            str3 = String.format("parse fail, build String fail, ex = %s", e11.getMessage());
                        }
                        Log.d("MicroMsg.SDK.NoopingTask", String.format("nooping, url = %s, errCode = %s, uuidStatusCode = %d, time consumed = %d(ms)", string, aVar.f100914a.toString(), Integer.valueOf(aVar.f100916c), Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis)));
                        oAuthErrCode3 = aVar.f100914a;
                        if (oAuthErrCode3 == OAuthErrCode.WechatAuth_Err_OK) {
                            i10 = aVar.f100916c;
                            this.f100913d = i10;
                            if (i10 == d.UUID_SCANED.a()) {
                                this.f100912c.onQrcodeScanned();
                            } else if (aVar.f100916c == d.UUID_KEEP_CONNECT.a() && aVar.f100916c == d.UUID_CONFIRM.a()) {
                                str2 = aVar.f100915b;
                                if (str2 != null || str2.length() == 0) {
                                    Log.e("MicroMsg.SDK.NoopingTask", "nooping fail, confirm with an empty code!!!");
                                }
                            }
                        } else {
                            Log.e("MicroMsg.SDK.NoopingTask", String.format("nooping fail, errCode = %s, uuidStatusCode = %d", oAuthErrCode3.toString(), Integer.valueOf(aVar.f100916c)));
                        }
                    }
                    aVar.f100914a = oAuthErrCode2;
                    Log.d("MicroMsg.SDK.NoopingTask", String.format("nooping, url = %s, errCode = %s, uuidStatusCode = %d, time consumed = %d(ms)", string, aVar.f100914a.toString(), Integer.valueOf(aVar.f100916c), Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis)));
                    oAuthErrCode3 = aVar.f100914a;
                    if (oAuthErrCode3 == OAuthErrCode.WechatAuth_Err_OK) {
                        i10 = aVar.f100916c;
                        this.f100913d = i10;
                        if (i10 == d.UUID_SCANED.a()) {
                            this.f100912c.onQrcodeScanned();
                        } else if (aVar.f100916c == d.UUID_KEEP_CONNECT.a()) {
                            continue;
                        } else {
                            str2 = aVar.f100915b;
                            if (str2 != null) {
                            }
                            Log.e("MicroMsg.SDK.NoopingTask", "nooping fail, confirm with an empty code!!!");
                        }
                    } else {
                        Log.e("MicroMsg.SDK.NoopingTask", String.format("nooping fail, errCode = %s, uuidStatusCode = %d", oAuthErrCode3.toString(), Integer.valueOf(aVar.f100916c)));
                    }
                }
                return aVar;
            }
            aVar.f100914a = oAuthErrCode;
            return aVar;
        }
        Log.e("MicroMsg.SDK.NoopingTask", "run fail, uuid is null");
        aVar = new a();
        oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
        aVar.f100914a = oAuthErrCode;
        return aVar;
    }

    @Override // android.os.AsyncTask
    protected void onPostExecute(a aVar) {
        a aVar2 = aVar;
        this.f100912c.onAuthFinish(aVar2.f100914a, aVar2.f100915b);
    }
}
