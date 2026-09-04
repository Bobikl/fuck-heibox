package com.tencent.liteav.txcvodplayer.b;

import android.text.TextUtils;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.tencent.liteav.base.util.LiteavLog;
import com.umeng.socialize.common.SocializeConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f100039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f100040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f100041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f100042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f100043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f100044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    List<c.e> f100045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f100046h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    c.C0963c f100047i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    List<c.d> f100048j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private JSONObject f100049k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f100050l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<a> f100051m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f100052n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f100053o;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f100054a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f100055b;
    }

    public b(JSONObject jSONObject) {
        this.f100049k = jSONObject;
        c();
    }

    private void a(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        this.f100045g = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            c.e eVar = new c.e();
            int iOptInt = jSONObject.optInt("width");
            int iOptInt2 = jSONObject.optInt("height");
            eVar.f100088b = iOptInt;
            eVar.f100089c = iOptInt2;
            eVar.f100087a = jSONObject.optString("resolutionName");
            eVar.f100090d = jSONObject.optString("type");
            eVar.f100091e = jSONObject.optLong(UiKitSpanObj.TYPE_SIZE);
            eVar.f100092f = jSONObject.optString("url");
            this.f100045g.add(eVar);
        }
    }

    private void a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("keyFrameDescInfo");
        if (jSONObjectOptJSONObject != null) {
            this.f100048j = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("keyFrameDescList");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                return;
            }
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObject2 = null;
                try {
                    jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
                c.d dVar = new c.d();
                dVar.f100086b = jSONObject2.optLong("timeOffset");
                dVar.f100085a = jSONObject2.optString("content");
                this.f100048j.add(dVar);
            }
        }
    }

    private void c() {
        JSONObject jSONObjectOptJSONObject;
        try {
            JSONObject jSONObject = this.f100049k.getJSONObject(SocializeConstants.KEY_PLATFORM);
            if (jSONObject != null) {
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("basicInfo");
                if (jSONObjectOptJSONObject2 != null) {
                    this.f100039a = jSONObjectOptJSONObject2.optString("name");
                    String strOptString = jSONObjectOptJSONObject2.optString("description");
                    this.f100040b = strOptString;
                    if (TextUtils.isEmpty(strOptString)) {
                        this.f100040b = this.f100039a;
                    }
                    this.f100041c = jSONObjectOptJSONObject2.optString("coverUrl");
                    this.f100042d = jSONObjectOptJSONObject2.optInt("duration");
                    this.f100043e = jSONObjectOptJSONObject2.optLong(UiKitSpanObj.TYPE_SIZE);
                }
                String strOptString2 = jSONObject.optString("audioVideoType");
                if (TextUtils.equals(strOptString2, "AdaptiveDynamicStream")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("streamingInfo");
                    if (jSONObject2 != null) {
                        JSONObject jSONObjectOptJSONObject3 = jSONObject2.optJSONObject("plainOutput");
                        if (jSONObjectOptJSONObject3 != null) {
                            this.f100050l = jSONObjectOptJSONObject3.optString("url");
                            a(jSONObjectOptJSONObject3.optJSONArray("subStreams"));
                        }
                        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("drmOutput");
                        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                            this.f100051m = new ArrayList();
                            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                                JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray.optJSONObject(i10);
                                String strOptString3 = jSONObjectOptJSONObject4.optString("type");
                                String strOptString4 = jSONObjectOptJSONObject4.optString("url");
                                a aVar = new a();
                                aVar.f100054a = strOptString3;
                                aVar.f100055b = strOptString4;
                                if (strOptString3.equalsIgnoreCase("SimpleAES")) {
                                    this.f100046h = strOptString3;
                                }
                                this.f100051m.add(aVar);
                                a(jSONObjectOptJSONObject4.optJSONArray("subStreams"));
                            }
                        }
                        this.f100052n = jSONObject2.optString("drmToken");
                        String strOptString5 = jSONObject2.optString("widevineLicenseUrl");
                        this.f100053o = strOptString5;
                        if (!TextUtils.isEmpty(strOptString5)) {
                            this.f100046h = "Widevine";
                        }
                    }
                } else if (TextUtils.equals(strOptString2, "Transcode")) {
                    JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("transcodeInfo");
                    if (jSONObjectOptJSONObject5 != null) {
                        this.f100050l = jSONObjectOptJSONObject5.optString("url");
                    }
                } else if (TextUtils.equals(strOptString2, "Original") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("originalInfo")) != null) {
                    this.f100050l = jSONObjectOptJSONObject.optString("url");
                }
                JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("imageSpriteInfo");
                if (jSONObjectOptJSONObject6 != null) {
                    c.C0963c c0963c = new c.C0963c();
                    this.f100047i = c0963c;
                    c0963c.f100084b = jSONObjectOptJSONObject6.getString("webVttUrl");
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject6.optJSONArray("imageUrls");
                    if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                        ArrayList<String> arrayList = new ArrayList<>();
                        for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                            arrayList.add(jSONArrayOptJSONArray2.getString(i11));
                        }
                        this.f100047i.f100083a = arrayList;
                    }
                }
                a(jSONObject);
                JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("ghostWatermarkInfo");
                if (jSONObjectOptJSONObject7 != null) {
                    this.f100044f = jSONObjectOptJSONObject7.optString("text");
                }
            }
        } catch (JSONException e10) {
            LiteavLog.e("TXCPlayInfoParserV4", e10.getMessage());
        }
    }

    public final String a() {
        if (TextUtils.isEmpty(this.f100052n)) {
            return null;
        }
        return this.f100052n;
    }

    public final String a(String str) {
        if (org.apache.tools.ant.taskdefs.email.b.K.equalsIgnoreCase(str)) {
            return this.f100050l;
        }
        List<a> list = this.f100051m;
        if (list == null) {
            return null;
        }
        for (a aVar : list) {
            String str2 = aVar.f100054a;
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return aVar.f100055b;
            }
        }
        return null;
    }

    public final String b() {
        if (TextUtils.isEmpty(this.f100053o)) {
            return null;
        }
        return this.f100053o;
    }
}
