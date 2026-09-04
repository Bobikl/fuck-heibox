package com.tencent.liteav.txcvodplayer.b;

import com.lzy.okgo.model.Progress;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.tencent.liteav.base.util.LiteavLog;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected JSONObject f100111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    g f100112b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f100113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f100114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<Integer> f100115c;
    }

    public f(JSONObject jSONObject) {
        this.f100111a = jSONObject;
    }

    private static List<c.d> a(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("keyFrameDescList");
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getJSONObject(i10).getString("content");
            float f10 = (float) (jSONArray.getJSONObject(i10).getLong("timeOffset") / 1000.0d);
            c.d dVar = new c.d();
            try {
                dVar.f100085a = URLDecoder.decode(string, "UTF-8");
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
                dVar.f100085a = "";
            }
            dVar.f100086b = f10;
            arrayList.add(dVar);
        }
        return arrayList;
    }

    private g l() {
        try {
            JSONObject jSONObject = this.f100111a.getJSONObject("videoInfo").getJSONObject("masterPlayList");
            g gVar = new g();
            gVar.f100116a = jSONObject.getString("url");
            return gVar;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private String m() {
        try {
            return this.f100111a.getJSONObject("playerInfo").getString("defaultVideoClassification");
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private List<Integer> n() {
        List<a> listK = k();
        String strM = m();
        if (strM == null || listK == null) {
            return null;
        }
        for (a aVar : listK) {
            if (aVar.f100113a.equals(strM)) {
                return aVar.f100115c;
            }
        }
        return null;
    }

    public final String a() {
        if (this.f100112b == null) {
            this.f100112b = c();
        }
        g gVar = this.f100112b;
        if (gVar != null) {
            return gVar.f100116a;
        }
        return null;
    }

    public final int b() {
        if (this.f100112b == null) {
            this.f100112b = c();
        }
        g gVar = this.f100112b;
        if (gVar != null) {
            return gVar.f100120e;
        }
        return -1;
    }

    final g c() {
        if (l() != null) {
            return l();
        }
        if (e().size() == 0) {
            return f();
        }
        List<Integer> listN = n();
        if (listN != null) {
            for (g gVar : e()) {
                if (listN.contains(Integer.valueOf(gVar.f100124i))) {
                    return gVar;
                }
            }
        }
        return e().get(0);
    }

    public final String d() {
        try {
            JSONObject jSONObject = this.f100111a.getJSONObject("coverInfo");
            if (jSONObject != null) {
                return jSONObject.getString("coverUrl");
            }
            return null;
        } catch (JSONException e10) {
            LiteavLog.e("TXPlayInfoResponse", "get cover url failed.", e10);
            return null;
        }
    }

    public final List<g> e() {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = this.f100111a.getJSONObject("videoInfo").getJSONArray("transcodeList");
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    g gVar = new g();
                    gVar.f100116a = jSONObject.getString("url");
                    gVar.f100120e = jSONObject.getInt("duration");
                    gVar.f100118c = jSONObject.getInt("width");
                    gVar.f100117b = jSONObject.getInt("height");
                    gVar.f100119d = Math.max(jSONObject.getLong(Progress.H), jSONObject.getLong(UiKitSpanObj.TYPE_SIZE));
                    gVar.f100121f = jSONObject.getInt("bitrate");
                    gVar.f100124i = jSONObject.getInt("definition");
                    gVar.f100122g = jSONObject.getString(com.google.android.exoplayer2.text.ttml.d.W);
                    gVar.f100123h = jSONObject.getString("templateName");
                    arrayList.add(gVar);
                }
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return arrayList;
    }

    public final g f() {
        try {
            JSONObject jSONObject = this.f100111a.getJSONObject("videoInfo").getJSONObject("sourceVideo");
            g gVar = new g();
            gVar.f100116a = jSONObject.getString("url");
            gVar.f100120e = jSONObject.getInt("duration");
            gVar.f100118c = jSONObject.getInt("width");
            gVar.f100117b = jSONObject.getInt("height");
            gVar.f100119d = Math.max(jSONObject.getLong(UiKitSpanObj.TYPE_SIZE), jSONObject.getLong(Progress.H));
            gVar.f100121f = jSONObject.getInt("bitrate");
            return gVar;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final String g() {
        try {
            JSONObject jSONObject = this.f100111a.getJSONObject("videoInfo").getJSONObject("basicInfo");
            if (jSONObject != null) {
                return jSONObject.getString("name");
            }
            return null;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final String h() {
        try {
            JSONObject jSONObject = this.f100111a.getJSONObject("videoInfo").getJSONObject("basicInfo");
            if (jSONObject != null) {
                return jSONObject.getString("description");
            }
            return null;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final c.C0963c i() {
        JSONObject jSONObjectOptJSONObject = this.f100111a.optJSONObject("imageSpriteInfo");
        if (jSONObjectOptJSONObject != null) {
            try {
                JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("imageSpriteList");
                if (jSONArray == null) {
                    return null;
                }
                JSONObject jSONObject = jSONArray.getJSONObject(jSONArray.length() - 1);
                c.C0963c c0963c = new c.C0963c();
                c0963c.f100084b = jSONObject.getString("webVttUrl");
                JSONArray jSONArray2 = jSONObject.getJSONArray("imageUrls");
                ArrayList<String> arrayList = new ArrayList<>();
                for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                    arrayList.add(jSONArray2.getString(i10));
                }
                c0963c.f100083a = arrayList;
                return c0963c;
            } catch (JSONException unused) {
                LiteavLog.e("TXPlayInfoResponse", "v2 getImageSpriteInfo exception");
            }
        }
        return null;
    }

    public final List<c.d> j() {
        JSONObject jSONObjectOptJSONObject = this.f100111a.optJSONObject("keyFrameDescInfo");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        try {
            return a(jSONObjectOptJSONObject);
        } catch (JSONException unused) {
            LiteavLog.e("TXPlayInfoResponse", "v2 parseKeyFrameDescInfo exception");
            return null;
        }
    }

    public final List<a> k() {
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = this.f100111a.getJSONObject("playerInfo").getJSONArray("videoClassification");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                a aVar = new a();
                aVar.f100113a = jSONArray.getJSONObject(i10).getString("id");
                aVar.f100114b = jSONArray.getJSONObject(i10).getString("name");
                aVar.f100115c = new ArrayList();
                JSONArray jSONArray2 = jSONArray.getJSONObject(i10).getJSONArray("definitionList");
                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                    aVar.f100115c.add(Integer.valueOf(jSONArray2.getInt(i11)));
                }
                arrayList.add(aVar);
            }
            return arrayList;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
