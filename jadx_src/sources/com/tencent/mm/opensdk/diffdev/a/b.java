package com.tencent.mm.opensdk.diffdev.a;

import android.os.AsyncTask;
import android.util.Base64;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.utils.Log;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class b extends AsyncTask<Void, Void, a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f100898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f100899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f100900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f100901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f100902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private OAuthListener f100903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f100904g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public OAuthErrCode f100905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f100906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f100907c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f100908d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f100909e;

        private a() {
        }

        public static a a(byte[] bArr) {
            OAuthErrCode oAuthErrCode;
            String str;
            a aVar = new a();
            if (bArr == null || bArr.length == 0) {
                Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, buf is null");
                oAuthErrCode = OAuthErrCode.WechatAuth_Err_NetworkErr;
            } else {
                try {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(bArr, "utf-8"));
                        int i10 = jSONObject.getInt(com.huawei.hms.feature.dynamic.b.f60686h);
                        if (i10 != 0) {
                            Log.e("MicroMsg.SDK.GetQRCodeResult", String.format("resp errcode = %d", Integer.valueOf(i10)));
                            aVar.f100905a = OAuthErrCode.WechatAuth_Err_NormalErr;
                            jSONObject.optString("errmsg");
                            return aVar;
                        }
                        String string = jSONObject.getJSONObject("qrcode").getString("qrcodebase64");
                        if (string != null && string.length() != 0) {
                            byte[] bArrDecode = Base64.decode(string, 0);
                            if (bArrDecode != null && bArrDecode.length != 0) {
                                aVar.f100905a = OAuthErrCode.WechatAuth_Err_OK;
                                aVar.f100909e = bArrDecode;
                                aVar.f100906b = jSONObject.getString("uuid");
                                String string2 = jSONObject.getString("appname");
                                aVar.f100907c = string2;
                                Log.d("MicroMsg.SDK.GetQRCodeResult", String.format("parse succ, save in memory, uuid = %s, appname = %s, imgBufLength = %d", aVar.f100906b, string2, Integer.valueOf(aVar.f100909e.length)));
                                return aVar;
                            }
                            Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBuf is null");
                            aVar.f100905a = OAuthErrCode.WechatAuth_Err_JsonDecodeErr;
                            return aVar;
                        }
                        Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBase64 is null");
                        aVar.f100905a = OAuthErrCode.WechatAuth_Err_JsonDecodeErr;
                        return aVar;
                    } catch (Exception e10) {
                        str = String.format("parse json fail, ex = %s", e10.getMessage());
                        Log.e("MicroMsg.SDK.GetQRCodeResult", str);
                        oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                        aVar.f100905a = oAuthErrCode;
                        return aVar;
                    }
                } catch (Exception e11) {
                    str = String.format("parse fail, build String fail, ex = %s", e11.getMessage());
                }
            }
            aVar.f100905a = oAuthErrCode;
            return aVar;
        }
    }

    public b(String str, String str2, String str3, String str4, String str5, OAuthListener oAuthListener) {
        this.f100898a = str;
        this.f100899b = str2;
        this.f100900c = str3;
        this.f100901d = str4;
        this.f100902e = str5;
        this.f100903f = oAuthListener;
    }

    public boolean a() {
        Log.i("MicroMsg.SDK.GetQRCodeTask", "cancelTask");
        c cVar = this.f100904g;
        return cVar == null ? cancel(true) : cVar.cancel(true);
    }

    @Override // android.os.AsyncTask
    protected a doInBackground(Void[] voidArr) throws Throwable {
        Thread.currentThread().setName("OpenSdkGetQRCodeTask");
        Log.i("MicroMsg.SDK.GetQRCodeTask", "doInBackground");
        String str = String.format("https://open.weixin.qq.com/connect/sdk/qrconnect?appid=%s&noncestr=%s&timestamp=%s&scope=%s&signature=%s", this.f100898a, this.f100900c, this.f100901d, this.f100899b, this.f100902e);
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] bArrA = com.tencent.mm.opensdk.channel.a.a.a(str, 60000);
        Log.d("MicroMsg.SDK.GetQRCodeTask", String.format("doInBackground, url = %s, time consumed = %d(ms)", str, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
        return a.a(bArrA);
    }

    @Override // android.os.AsyncTask
    protected void onPostExecute(a aVar) {
        a aVar2 = aVar;
        OAuthErrCode oAuthErrCode = aVar2.f100905a;
        if (oAuthErrCode != OAuthErrCode.WechatAuth_Err_OK) {
            Log.e("MicroMsg.SDK.GetQRCodeTask", String.format("onPostExecute, get qrcode fail, OAuthErrCode = %s", oAuthErrCode));
            this.f100903f.onAuthFinish(aVar2.f100905a, null);
            return;
        }
        Log.d("MicroMsg.SDK.GetQRCodeTask", "onPostExecute, get qrcode success imgBufSize = " + aVar2.f100909e.length);
        this.f100903f.onAuthGotQrcode(aVar2.f100908d, aVar2.f100909e);
        c cVar = new c(aVar2.f100906b, this.f100903f);
        this.f100904g = cVar;
        cVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
