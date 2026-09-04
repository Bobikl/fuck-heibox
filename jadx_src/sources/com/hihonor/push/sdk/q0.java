package com.hihonor.push.sdk;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class q0 implements Callable<HonorPushDataMsg> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f60069a;

    public q0(Intent intent) {
        this.f60069a = intent;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX WARN: Code duplicated, block: B:39:0x0096  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    public HonorPushDataMsg call() throws Exception {
        byte[] byteArrayExtra;
        String string;
        String strOptString;
        Intent intent = this.f60069a;
        if (intent == null) {
            return null;
        }
        long longExtra = 0;
        try {
            longExtra = intent.getLongExtra("msg_id", 0L);
        } catch (Exception e10) {
            c.a("PassByMsgIntentParser", "parserMsgId", e10);
        }
        try {
            byteArrayExtra = this.f60069a.getByteArrayExtra("msg_content");
        } catch (Exception e11) {
            c.a("PassByMsgIntentParser", "parseMsgContent", e11);
            byteArrayExtra = null;
        }
        if (byteArrayExtra != null && byteArrayExtra.length != 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayExtra);
            InflaterInputStream inflaterInputStream = new InflaterInputStream(byteArrayInputStream, new Inflater());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                try {
                    byte[] bArr = new byte[256];
                    while (true) {
                        int i10 = inflaterInputStream.read(bArr);
                        if (i10 <= 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i10);
                    }
                    string = byteArrayOutputStream.toString("UTF-8");
                    b.a(byteArrayInputStream);
                    b.a(inflaterInputStream);
                    b.a(byteArrayOutputStream);
                } catch (Throwable th2) {
                    b.a(byteArrayInputStream);
                    b.a(inflaterInputStream);
                    b.a(byteArrayOutputStream);
                    throw th2;
                }
            } catch (IOException e12) {
                c.a("DeflateUtil", "unZipString", e12);
                b.a(byteArrayInputStream);
                b.a(inflaterInputStream);
                b.a(byteArrayOutputStream);
                string = null;
            }
            if (string != null) {
                return null;
            }
            strOptString = new JSONObject(string).optString("data");
            if (!TextUtils.isEmpty(strOptString)) {
                return null;
            }
            HonorPushDataMsg honorPushDataMsg = new HonorPushDataMsg();
            honorPushDataMsg.setMsgId(longExtra);
            honorPushDataMsg.setData(strOptString);
            return honorPushDataMsg;
        }
        Log.w("DeflateUtil", "un zip data is empty");
        string = null;
        if (string != null) {
            return null;
        }
        strOptString = new JSONObject(string).optString("data");
        if (!TextUtils.isEmpty(strOptString)) {
            return null;
        }
        HonorPushDataMsg honorPushDataMsg2 = new HonorPushDataMsg();
        honorPushDataMsg2.setMsgId(longExtra);
        honorPushDataMsg2.setData(strOptString);
        return honorPushDataMsg2;
    }
}
