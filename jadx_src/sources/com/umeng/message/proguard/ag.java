package com.umeng.message.proguard;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import com.umeng.message.entity.UInAppMessage;
import com.umeng.message.inapp.IUmengInAppMsgCloseCallback;
import com.umeng.message.inapp.InAppMessageManager;
import com.umeng.message.inapp.UmengCardMessage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Calendar;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ag implements ad, af.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f105687a = "com.umeng.message.proguard.ag";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f105688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f105689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f105690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private UInAppMessage f105691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private IUmengInAppMsgCloseCallback f105692f;

    public ag(Activity activity, String str, IUmengInAppMsgCloseCallback iUmengInAppMsgCloseCallback) {
        this.f105688b = activity;
        this.f105689c = str;
        this.f105692f = iUmengInAppMsgCloseCallback;
    }

    private void a() {
        try {
            UmengCardMessage umengCardMessage = new UmengCardMessage();
            umengCardMessage.f105607a = this.f105692f;
            Bundle bundle = new Bundle();
            bundle.putString(BasePuzzleInfo.PUZZLE_TYPE_LABEL, this.f105689c);
            bundle.putString("msg", this.f105691e.getRaw().toString());
            umengCardMessage.setArguments(bundle);
            umengCardMessage.show(((Activity) this.f105688b).getFragmentManager(), this.f105689c);
            InAppMessageManager.getInstance(this.f105688b).a(this.f105691e.msg_id, 1);
            InAppMessageManager.getInstance(this.f105688b).b(this.f105689c);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static boolean a(JSONArray jSONArray, String str) {
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                if (jSONArray.getString(i10).equals(str)) {
                    return true;
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return false;
    }

    private boolean b(String str) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(InAppMessageManager.getInstance(this.f105688b).c(str));
        Calendar calendar2 = Calendar.getInstance();
        return calendar.get(6) == calendar2.get(6) && calendar.get(1) == calendar2.get(1);
    }

    @Override // com.umeng.message.proguard.ad
    public final void a(UInAppMessage uInAppMessage) {
    }

    @Override // com.umeng.message.proguard.af.a
    public final void a(Bitmap[] bitmapArr) {
        Bitmap bitmap;
        if (!this.f105690d && (bitmap = bitmapArr[0]) != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                UmengCardMessage umengCardMessage = new UmengCardMessage();
                umengCardMessage.f105607a = this.f105692f;
                Bundle bundle = new Bundle();
                bundle.putString(BasePuzzleInfo.PUZZLE_TYPE_LABEL, this.f105689c);
                bundle.putString("msg", this.f105691e.getRaw().toString());
                bundle.putByteArray("bitmapByte", byteArray);
                umengCardMessage.setArguments(bundle);
                umengCardMessage.show(((Activity) this.f105688b).getFragmentManager(), this.f105689c);
                InAppMessageManager.getInstance(this.f105688b).a(this.f105691e.msg_id, 1);
                InAppMessageManager.getInstance(this.f105688b).b(this.f105689c);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        InAppMessageManager.getInstance(this.f105688b).a(this.f105691e, this.f105689c);
    }

    public final boolean a(String str) {
        if (!d.a(this.f105688b).equals(InAppMessageManager.getInstance(this.f105688b).a("KEY_LAST_VERSION_CODE", ""))) {
            InAppMessageManager.getInstance(this.f105688b).b("KEY_CARD_LABEL_LIST", "");
        }
        InAppMessageManager.getInstance(this.f105688b).b("KEY_LAST_VERSION_CODE", d.a(this.f105688b));
        String strA = InAppMessageManager.getInstance(this.f105688b).a("KEY_CARD_LABEL_LIST", "");
        JSONArray jSONArray = null;
        if (!TextUtils.isEmpty(strA)) {
            try {
                jSONArray = new JSONArray(strA);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        if (jSONArray == null) {
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(str);
            InAppMessageManager.getInstance(this.f105688b).b("KEY_CARD_LABEL_LIST", jSONArray2.toString());
            return true;
        }
        if (a(jSONArray, str)) {
            return true;
        }
        if (jSONArray.length() >= 10) {
            return false;
        }
        jSONArray.put(str);
        InAppMessageManager.getInstance(this.f105688b).b("KEY_CARD_LABEL_LIST", jSONArray.toString());
        return true;
    }

    @Override // com.umeng.message.proguard.ad
    public final void b(UInAppMessage uInAppMessage) {
        UInAppMessage uInAppMessage2;
        String strA = InAppMessageManager.getInstance(this.f105688b).a(this.f105689c);
        if (TextUtils.isEmpty(strA)) {
            uInAppMessage2 = null;
        } else {
            try {
                uInAppMessage2 = new UInAppMessage(new JSONObject(strA));
            } catch (JSONException e10) {
                e10.printStackTrace();
                uInAppMessage2 = null;
            }
        }
        if (uInAppMessage != null) {
            if (uInAppMessage2 != null && !uInAppMessage.msg_id.equals(uInAppMessage2.msg_id)) {
                InAppMessageManager.getInstance(this.f105688b).a(new File(f.a(this.f105688b, uInAppMessage2.msg_id)));
            }
            this.f105691e = uInAppMessage;
        } else if (uInAppMessage2 == null) {
            return;
        } else {
            this.f105691e = uInAppMessage2;
        }
        if (this.f105691e.show_type == 1 && !b(this.f105689c)) {
            InAppMessageManager.getInstance(this.f105688b).a(this.f105691e.msg_id, 0);
        }
        InAppMessageManager.getInstance(this.f105688b);
        if (InAppMessageManager.b(this.f105691e) && InAppMessageManager.getInstance(this.f105688b).c(this.f105691e)) {
            int i10 = this.f105691e.msg_type;
            if (i10 == 5 || i10 == 6) {
                InAppMessageManager.getInstance(this.f105688b).a(this.f105691e, this.f105689c);
                a();
            } else {
                af afVar = new af(this.f105688b, this.f105691e);
                afVar.f105684a = this;
                afVar.execute(this.f105691e.image_url);
            }
        }
    }
}
