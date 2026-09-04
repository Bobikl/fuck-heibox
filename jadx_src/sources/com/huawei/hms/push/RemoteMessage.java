package com.huawei.hms.push;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.utils.DateUtil;
import com.huawei.hms.push.utils.JsonUtil;
import com.huawei.hms.support.api.push.PushException;
import com.huawei.hms.support.log.HMSLog;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class RemoteMessage implements Parcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f61204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f61205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long[] f61206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final HashMap<String, Object> f61207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final HashMap<String, Object> f61208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final HashMap<String, Object> f61209h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final HashMap<String, Object> f61210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final HashMap<String, Object> f61211j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bundle f61212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Notification f61213b;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bundle f61214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<String, String> f61215b;

        public Builder(String str) {
            Bundle bundle = new Bundle();
            this.f61214a = bundle;
            this.f61215b = new HashMap();
            bundle.putString("to", str);
        }

        public Builder addData(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("add data failed, key is null.");
            }
            this.f61215b.put(str, str2);
            return this;
        }

        public RemoteMessage build() {
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            try {
                for (Map.Entry<String, String> entry : this.f61215b.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                try {
                    String string = jSONObject.toString();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(RemoteMessageConst.COLLAPSE_KEY, this.f61214a.getString(RemoteMessageConst.COLLAPSE_KEY));
                    jSONObject2.put(RemoteMessageConst.TTL, this.f61214a.getInt(RemoteMessageConst.TTL));
                    jSONObject2.put(RemoteMessageConst.SEND_MODE, this.f61214a.getInt(RemoteMessageConst.SEND_MODE));
                    jSONObject2.put(RemoteMessageConst.RECEIPT_MODE, this.f61214a.getInt(RemoteMessageConst.RECEIPT_MODE));
                    JSONObject jSONObject3 = new JSONObject();
                    if (jSONObject.length() != 0) {
                        jSONObject3.put("data", string);
                    }
                    jSONObject3.put(RemoteMessageConst.MSGID, this.f61214a.getString(RemoteMessageConst.MSGID));
                    jSONObject2.put(RemoteMessageConst.MessageBody.MSG_CONTENT, jSONObject3);
                    bundle.putByteArray(RemoteMessageConst.MSGBODY, jSONObject2.toString().getBytes(k.f61252a));
                    bundle.putString("to", this.f61214a.getString("to"));
                    bundle.putString("message_type", this.f61214a.getString("message_type"));
                    return new RemoteMessage(bundle);
                } catch (JSONException unused) {
                    HMSLog.w("RemoteMessage", "JSONException: parse message body failed.");
                    throw new PushException(PushException.EXCEPTION_SEND_FAILED);
                }
            } catch (JSONException unused2) {
                HMSLog.w("RemoteMessage", "JSONException: parse data to json failed.");
                throw new PushException(PushException.EXCEPTION_SEND_FAILED);
            }
        }

        public Builder clearData() {
            this.f61215b.clear();
            return this;
        }

        public Builder setCollapseKey(String str) {
            this.f61214a.putString(RemoteMessageConst.COLLAPSE_KEY, str);
            return this;
        }

        public Builder setData(Map<String, String> map) {
            this.f61215b.clear();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.f61215b.put(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public Builder setMessageId(String str) {
            this.f61214a.putString(RemoteMessageConst.MSGID, str);
            return this;
        }

        public Builder setMessageType(String str) {
            this.f61214a.putString("message_type", str);
            return this;
        }

        public Builder setReceiptMode(int i10) {
            if (i10 != 1 && i10 != 0) {
                throw new IllegalArgumentException("receipt mode can only be 0 or 1.");
            }
            this.f61214a.putInt(RemoteMessageConst.RECEIPT_MODE, i10);
            return this;
        }

        public Builder setSendMode(int i10) {
            if (i10 != 0 && i10 != 1) {
                throw new IllegalArgumentException("send mode can only be 0 or 1.");
            }
            this.f61214a.putInt(RemoteMessageConst.SEND_MODE, i10);
            return this;
        }

        public Builder setTtl(int i10) {
            if (i10 < 1 || i10 > 1296000) {
                throw new IllegalArgumentException("ttl must be greater than or equal to 1 and less than or equal to 1296000");
            }
            this.f61214a.putInt(RemoteMessageConst.TTL, i10);
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MessagePriority {
    }

    public static class Notification implements Serializable {
        private final long[] A;
        private final String B;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f61216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f61217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String[] f61218c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f61219d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f61220e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String[] f61221f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f61222g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final String f61223h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String f61224i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final String f61225j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final String f61226k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final String f61227l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final String f61228m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Uri f61229n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final int f61230o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final String f61231p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final int f61232q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int f61233r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final int f61234s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int[] f61235t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final String f61236u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final int f61237v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final String f61238w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final int f61239x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final String f61240y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private final String f61241z;

        private Notification(Bundle bundle) {
            this.f61216a = bundle.getString(RemoteMessageConst.Notification.NOTIFY_TITLE);
            this.f61219d = bundle.getString("content");
            this.f61217b = bundle.getString(RemoteMessageConst.Notification.TITLE_LOC_KEY);
            this.f61220e = bundle.getString(RemoteMessageConst.Notification.BODY_LOC_KEY);
            this.f61218c = bundle.getStringArray(RemoteMessageConst.Notification.TITLE_LOC_ARGS);
            this.f61221f = bundle.getStringArray(RemoteMessageConst.Notification.BODY_LOC_ARGS);
            this.f61222g = bundle.getString("icon");
            this.f61225j = bundle.getString("color");
            this.f61223h = bundle.getString(RemoteMessageConst.Notification.SOUND);
            this.f61224i = bundle.getString("tag");
            this.f61228m = bundle.getString(RemoteMessageConst.Notification.CHANNEL_ID);
            this.f61226k = bundle.getString(RemoteMessageConst.Notification.CLICK_ACTION);
            this.f61227l = bundle.getString(RemoteMessageConst.Notification.INTENT_URI);
            this.f61230o = bundle.getInt(RemoteMessageConst.Notification.NOTIFY_ID);
            String string = bundle.getString("url");
            this.f61229n = !TextUtils.isEmpty(string) ? Uri.parse(string) : null;
            this.f61231p = bundle.getString(RemoteMessageConst.Notification.NOTIFY_ICON);
            this.f61232q = bundle.getInt(RemoteMessageConst.Notification.DEFAULT_LIGHT_SETTINGS);
            this.f61233r = bundle.getInt(RemoteMessageConst.Notification.DEFAULT_SOUND);
            this.f61234s = bundle.getInt(RemoteMessageConst.Notification.DEFAULT_VIBRATE_TIMINGS);
            this.f61235t = bundle.getIntArray(RemoteMessageConst.Notification.LIGHT_SETTINGS);
            this.f61236u = bundle.getString("when");
            this.f61237v = bundle.getInt(RemoteMessageConst.Notification.LOCAL_ONLY);
            this.f61238w = bundle.getString(RemoteMessageConst.Notification.BADGE_SET_NUM, null);
            this.f61239x = bundle.getInt(RemoteMessageConst.Notification.AUTO_CANCEL);
            this.f61240y = bundle.getString("priority", null);
            this.f61241z = bundle.getString(RemoteMessageConst.Notification.TICKER);
            this.A = bundle.getLongArray(RemoteMessageConst.Notification.VIBRATE_TIMINGS);
            this.B = bundle.getString("visibility", null);
        }

        /* synthetic */ Notification(Bundle bundle, a aVar) {
            this(bundle);
        }

        private Integer a(String str) {
            if (str != null) {
                try {
                    return Integer.valueOf(str);
                } catch (NumberFormatException unused) {
                    HMSLog.w("RemoteMessage", "NumberFormatException: get " + str + " failed.");
                }
            }
            return null;
        }

        public Integer getBadgeNumber() {
            return a(this.f61238w);
        }

        public String getBody() {
            return this.f61219d;
        }

        public String[] getBodyLocalizationArgs() {
            String[] strArr = this.f61221f;
            return strArr == null ? new String[0] : (String[]) strArr.clone();
        }

        public String getBodyLocalizationKey() {
            return this.f61220e;
        }

        public String getChannelId() {
            return this.f61228m;
        }

        public String getClickAction() {
            return this.f61226k;
        }

        public String getColor() {
            return this.f61225j;
        }

        public String getIcon() {
            return this.f61222g;
        }

        public Uri getImageUrl() {
            String str = this.f61231p;
            if (str == null) {
                return null;
            }
            return Uri.parse(str);
        }

        public Integer getImportance() {
            return a(this.f61240y);
        }

        public String getIntentUri() {
            return this.f61227l;
        }

        public int[] getLightSettings() {
            int[] iArr = this.f61235t;
            return iArr == null ? new int[0] : (int[]) iArr.clone();
        }

        public Uri getLink() {
            return this.f61229n;
        }

        public int getNotifyId() {
            return this.f61230o;
        }

        public String getSound() {
            return this.f61223h;
        }

        public String getTag() {
            return this.f61224i;
        }

        public String getTicker() {
            return this.f61241z;
        }

        public String getTitle() {
            return this.f61216a;
        }

        public String[] getTitleLocalizationArgs() {
            String[] strArr = this.f61218c;
            return strArr == null ? new String[0] : (String[]) strArr.clone();
        }

        public String getTitleLocalizationKey() {
            return this.f61217b;
        }

        public long[] getVibrateConfig() {
            long[] jArr = this.A;
            return jArr == null ? new long[0] : (long[]) jArr.clone();
        }

        public Integer getVisibility() {
            return a(this.B);
        }

        public Long getWhen() {
            if (!TextUtils.isEmpty(this.f61236u)) {
                try {
                    return Long.valueOf(DateUtil.parseUtcToMillisecond(this.f61236u));
                } catch (StringIndexOutOfBoundsException unused) {
                    HMSLog.w("RemoteMessage", "StringIndexOutOfBoundsException: parse when failed.");
                } catch (ParseException unused2) {
                    HMSLog.w("RemoteMessage", "ParseException: parse when failed.");
                }
            }
            return null;
        }

        public boolean isAutoCancel() {
            return this.f61239x == 1;
        }

        public boolean isDefaultLight() {
            return this.f61232q == 1;
        }

        public boolean isDefaultSound() {
            return this.f61233r == 1;
        }

        public boolean isDefaultVibrate() {
            return this.f61234s == 1;
        }

        public boolean isLocalOnly() {
            return this.f61237v == 1;
        }
    }

    public class a implements Parcelable.Creator<RemoteMessage> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RemoteMessage createFromParcel(Parcel parcel) {
            return new RemoteMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RemoteMessage[] newArray(int i10) {
            return new RemoteMessage[i10];
        }
    }

    static {
        String[] strArr = new String[0];
        f61204c = strArr;
        int[] iArr = new int[0];
        f61205d = iArr;
        long[] jArr = new long[0];
        f61206e = jArr;
        HashMap<String, Object> map = new HashMap<>(8);
        f61207f = map;
        map.put("from", "");
        map.put(RemoteMessageConst.COLLAPSE_KEY, "");
        map.put(RemoteMessageConst.SEND_TIME, "");
        map.put(RemoteMessageConst.TTL, 86400);
        map.put(RemoteMessageConst.URGENCY, 2);
        map.put(RemoteMessageConst.ORI_URGENCY, 2);
        map.put(RemoteMessageConst.SEND_MODE, 0);
        map.put(RemoteMessageConst.RECEIPT_MODE, 0);
        HashMap<String, Object> map2 = new HashMap<>(8);
        f61208g = map2;
        map2.put(RemoteMessageConst.Notification.TITLE_LOC_KEY, "");
        map2.put(RemoteMessageConst.Notification.BODY_LOC_KEY, "");
        map2.put(RemoteMessageConst.Notification.NOTIFY_ICON, "");
        map2.put(RemoteMessageConst.Notification.TITLE_LOC_ARGS, strArr);
        map2.put(RemoteMessageConst.Notification.BODY_LOC_ARGS, strArr);
        map2.put(RemoteMessageConst.Notification.TICKER, "");
        map2.put(RemoteMessageConst.Notification.NOTIFY_TITLE, "");
        map2.put("content", "");
        HashMap<String, Object> map3 = new HashMap<>(8);
        f61209h = map3;
        map3.put("icon", "");
        map3.put("color", "");
        map3.put(RemoteMessageConst.Notification.SOUND, "");
        map3.put(RemoteMessageConst.Notification.DEFAULT_LIGHT_SETTINGS, 1);
        map3.put(RemoteMessageConst.Notification.LIGHT_SETTINGS, iArr);
        map3.put(RemoteMessageConst.Notification.DEFAULT_SOUND, 1);
        map3.put(RemoteMessageConst.Notification.DEFAULT_VIBRATE_TIMINGS, 1);
        map3.put(RemoteMessageConst.Notification.VIBRATE_TIMINGS, jArr);
        HashMap<String, Object> map4 = new HashMap<>(8);
        f61210i = map4;
        map4.put("tag", "");
        map4.put("when", "");
        map4.put(RemoteMessageConst.Notification.LOCAL_ONLY, 1);
        map4.put(RemoteMessageConst.Notification.BADGE_SET_NUM, "");
        map4.put("priority", "");
        map4.put(RemoteMessageConst.Notification.AUTO_CANCEL, 1);
        map4.put("visibility", "");
        map4.put(RemoteMessageConst.Notification.CHANNEL_ID, "");
        HashMap<String, Object> map5 = new HashMap<>(3);
        f61211j = map5;
        map5.put(RemoteMessageConst.Notification.CLICK_ACTION, "");
        map5.put(RemoteMessageConst.Notification.INTENT_URI, "");
        map5.put("url", "");
        CREATOR = new a();
    }

    public RemoteMessage(Bundle bundle) {
        this.f61212a = a(bundle);
    }

    public RemoteMessage(Parcel parcel) {
        this.f61212a = parcel.readBundle();
        this.f61213b = (Notification) parcel.readSerializable();
    }

    private Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        JSONObject jSONObjectB = b(bundle);
        JSONObject jSONObjectA = a(jSONObjectB);
        String string = JsonUtil.getString(jSONObjectA, "data", null);
        bundle2.putString(RemoteMessageConst.ANALYTIC_INFO, JsonUtil.getString(jSONObjectA, RemoteMessageConst.ANALYTIC_INFO, null));
        bundle2.putString(RemoteMessageConst.DEVICE_TOKEN, bundle.getString(RemoteMessageConst.DEVICE_TOKEN));
        JSONObject jSONObjectD = d(jSONObjectA);
        JSONObject jSONObjectB2 = b(jSONObjectD);
        JSONObject jSONObjectC = c(jSONObjectD);
        if (bundle.getInt(RemoteMessageConst.INPUT_TYPE) == 1 && c.a(jSONObjectA, jSONObjectD, string)) {
            bundle2.putString("data", com.huawei.hms.push.a.a(bundle.getByteArray(RemoteMessageConst.MSGBODY)));
            return bundle2;
        }
        String string2 = bundle.getString("to");
        String string3 = bundle.getString("message_type");
        String string4 = JsonUtil.getString(jSONObjectA, RemoteMessageConst.MSGID, null);
        bundle2.putString("to", string2);
        bundle2.putString("data", string);
        bundle2.putString(RemoteMessageConst.MSGID, string4);
        bundle2.putString("message_type", string3);
        JsonUtil.transferJsonObjectToBundle(jSONObjectB, bundle2, f61207f);
        bundle2.putBundle("notification", a(jSONObjectB, jSONObjectA, jSONObjectD, jSONObjectB2, jSONObjectC));
        return bundle2;
    }

    private Bundle a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        Bundle bundle = new Bundle();
        JsonUtil.transferJsonObjectToBundle(jSONObject3, bundle, f61208g);
        JsonUtil.transferJsonObjectToBundle(jSONObject4, bundle, f61209h);
        JsonUtil.transferJsonObjectToBundle(jSONObject, bundle, f61210i);
        JsonUtil.transferJsonObjectToBundle(jSONObject5, bundle, f61211j);
        bundle.putInt(RemoteMessageConst.Notification.NOTIFY_ID, JsonUtil.getInt(jSONObject2, RemoteMessageConst.Notification.NOTIFY_ID, 0));
        return bundle;
    }

    private static JSONObject a(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(RemoteMessageConst.MessageBody.MSG_CONTENT);
        }
        return null;
    }

    private static JSONObject b(Bundle bundle) {
        try {
            return new JSONObject(com.huawei.hms.push.a.a(bundle.getByteArray(RemoteMessageConst.MSGBODY)));
        } catch (JSONException unused) {
            HMSLog.w("RemoteMessage", "JSONException:parse message body failed.");
            return null;
        }
    }

    private static JSONObject b(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(RemoteMessageConst.MessageBody.NOTIFY_DETAIL);
        }
        return null;
    }

    private static JSONObject c(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(RemoteMessageConst.MessageBody.PARAM);
        }
        return null;
    }

    private static JSONObject d(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(RemoteMessageConst.MessageBody.PS_CONTENT);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public String getAnalyticInfo() {
        return this.f61212a.getString(RemoteMessageConst.ANALYTIC_INFO);
    }

    public Map<String, String> getAnalyticInfoMap() {
        HashMap map = new HashMap();
        String string = this.f61212a.getString(RemoteMessageConst.ANALYTIC_INFO);
        if (string != null && !string.trim().isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String strValueOf = String.valueOf(itKeys.next());
                    map.put(strValueOf, String.valueOf(jSONObject.get(strValueOf)));
                }
            } catch (JSONException unused) {
                HMSLog.w("RemoteMessage", "JSONException: get analyticInfo from map failed.");
            }
        }
        return map;
    }

    public String getCollapseKey() {
        return this.f61212a.getString(RemoteMessageConst.COLLAPSE_KEY);
    }

    public String getData() {
        return this.f61212a.getString("data");
    }

    public Map<String, String> getDataOfMap() {
        HashMap map = new HashMap();
        String string = this.f61212a.getString("data");
        if (string != null && !string.trim().isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String strValueOf = String.valueOf(itKeys.next());
                    map.put(strValueOf, String.valueOf(jSONObject.get(strValueOf)));
                }
            } catch (JSONException unused) {
                HMSLog.w("RemoteMessage", "JSONException: get data from map failed");
            }
        }
        return map;
    }

    public String getFrom() {
        return this.f61212a.getString("from");
    }

    public String getMessageId() {
        return this.f61212a.getString(RemoteMessageConst.MSGID);
    }

    public String getMessageType() {
        return this.f61212a.getString("message_type");
    }

    public Notification getNotification() {
        Bundle bundle = this.f61212a.getBundle("notification");
        a aVar = null;
        if (this.f61213b == null && bundle != null) {
            this.f61213b = new Notification(bundle, aVar);
        }
        if (this.f61213b == null) {
            this.f61213b = new Notification(new Bundle(), aVar);
        }
        return this.f61213b;
    }

    public int getOriginalUrgency() {
        int i10 = this.f61212a.getInt(RemoteMessageConst.ORI_URGENCY);
        if (i10 == 1 || i10 == 2) {
            return i10;
        }
        return 0;
    }

    public int getReceiptMode() {
        return this.f61212a.getInt(RemoteMessageConst.RECEIPT_MODE);
    }

    public int getSendMode() {
        return this.f61212a.getInt(RemoteMessageConst.SEND_MODE);
    }

    public long getSentTime() {
        try {
            String string = this.f61212a.getString(RemoteMessageConst.SEND_TIME);
            if (TextUtils.isEmpty(string)) {
                return 0L;
            }
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            HMSLog.w("RemoteMessage", "NumberFormatException: get sendTime error.");
            return 0L;
        }
    }

    public String getTo() {
        return this.f61212a.getString("to");
    }

    public String getToken() {
        return this.f61212a.getString(RemoteMessageConst.DEVICE_TOKEN);
    }

    public int getTtl() {
        return this.f61212a.getInt(RemoteMessageConst.TTL);
    }

    public int getUrgency() {
        int i10 = this.f61212a.getInt(RemoteMessageConst.URGENCY);
        if (i10 == 1 || i10 == 2) {
            return i10;
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeBundle(this.f61212a);
        parcel.writeSerializable(this.f61213b);
    }
}
