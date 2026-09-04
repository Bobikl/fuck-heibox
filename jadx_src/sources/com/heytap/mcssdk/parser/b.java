package com.heytap.mcssdk.parser;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.heytap.mcssdk.utils.e;
import com.heytap.msp.push.mode.BaseMode;
import com.heytap.msp.push.mode.DataMessage;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DataMessageParser.java */
/* JADX INFO: loaded from: classes7.dex */
public class b extends c {
    @Override // com.heytap.mcssdk.parser.d
    public BaseMode a(Context context, int i10, Intent intent) {
        if (4103 != i10 && 4098 != i10 && 4108 != i10) {
            return null;
        }
        BaseMode baseModeC = c(intent, i10);
        z9.a.b(context, x9.c.a.f141163t1, (DataMessage) baseModeC);
        return baseModeC;
    }

    @Override // com.heytap.mcssdk.parser.c
    public BaseMode c(Intent intent, int i10) {
        try {
            DataMessage dataMessage = new DataMessage();
            dataMessage.setMessageID(com.heytap.mcssdk.utils.b.e(intent.getStringExtra(x9.b.f141138c)));
            dataMessage.setTaskID(com.heytap.mcssdk.utils.b.e(intent.getStringExtra(x9.b.f141139d)));
            dataMessage.setGlobalId(com.heytap.mcssdk.utils.b.e(intent.getStringExtra(x9.b.f141143h)));
            dataMessage.setAppPackage(com.heytap.mcssdk.utils.b.e(intent.getStringExtra(x9.b.f141140e)));
            dataMessage.setTitle(com.heytap.mcssdk.utils.b.e(intent.getStringExtra("title")));
            dataMessage.setContent(com.heytap.mcssdk.utils.b.e(intent.getStringExtra("content")));
            dataMessage.setDescription(com.heytap.mcssdk.utils.b.e(intent.getStringExtra("description")));
            String strE = com.heytap.mcssdk.utils.b.e(intent.getStringExtra(x9.b.f141145j));
            int i11 = 0;
            dataMessage.setNotifyID(TextUtils.isEmpty(strE) ? 0 : Integer.parseInt(strE));
            dataMessage.setMiniProgramPkg(com.heytap.mcssdk.utils.b.e(intent.getStringExtra(x9.b.f141158w)));
            dataMessage.setMessageType(i10);
            dataMessage.setEventId(com.heytap.mcssdk.utils.b.e(intent.getStringExtra(x9.b.f141146k)));
            dataMessage.setStatisticsExtra(com.heytap.mcssdk.utils.b.e(intent.getStringExtra(x9.b.f141147l)));
            String strE2 = com.heytap.mcssdk.utils.b.e(intent.getStringExtra(x9.b.f141148m));
            dataMessage.setDataExtra(strE2);
            String strD = d(strE2);
            if (!TextUtils.isEmpty(strD)) {
                i11 = Integer.parseInt(strD);
            }
            dataMessage.setMsgCommand(i11);
            dataMessage.setBalanceTime(com.heytap.mcssdk.utils.b.e(intent.getStringExtra(x9.b.f141149n)));
            dataMessage.setStartDate(com.heytap.mcssdk.utils.b.e(intent.getStringExtra(x9.b.f141154s)));
            dataMessage.setEndDate(com.heytap.mcssdk.utils.b.e(intent.getStringExtra(x9.b.f141155t)));
            dataMessage.setTimeRanges(com.heytap.mcssdk.utils.b.e(intent.getStringExtra(x9.b.f141150o)));
            dataMessage.setRule(com.heytap.mcssdk.utils.b.e(intent.getStringExtra(x9.b.f141151p)));
            dataMessage.setForcedDelivery(com.heytap.mcssdk.utils.b.e(intent.getStringExtra(x9.b.f141152q)));
            dataMessage.setDistinctContent(com.heytap.mcssdk.utils.b.e(intent.getStringExtra(x9.b.f141153r)));
            dataMessage.setAppId(com.heytap.mcssdk.utils.b.e(intent.getStringExtra(x9.b.f141156u)));
            return dataMessage;
        } catch (Exception e10) {
            e.a("OnHandleIntent--" + e10.getMessage());
            return null;
        }
    }

    public String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new JSONObject(str).optString(x9.b.f141157v);
        } catch (JSONException e10) {
            e.a(e10.getMessage());
            return "";
        }
    }
}
