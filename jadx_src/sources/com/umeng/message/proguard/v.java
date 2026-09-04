package com.umeng.message.proguard;

import android.app.Application;
import android.content.ContentProviderOperation;
import android.content.Context;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.message.MessageSharedPrefs;
import com.umeng.message.MsgConstant;
import com.umeng.message.PushAgent;
import com.umeng.message.common.UPLog;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements UMLogDataProtocol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final UMLogDataProtocol f105904a = new v();

    private v() {
    }

    public static UMLogDataProtocol a() {
        return f105904a;
    }

    private static void a(Context context, JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() == 0) {
                    return;
                }
                ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.get(i10);
                    arrayList.add(ContentProviderOperation.newDelete(h.d(context)).withSelection("MsgId=? And ActionType=?", new String[]{jSONObject.optString("msg_id"), String.valueOf(jSONObject.optInt("action_type"))}).build());
                }
                context.getContentResolver().applyBatch(h.f(context), arrayList);
            } catch (Throwable th2) {
                UPLog.e("LogDataProtocol", "remove cache error:" + th2.getMessage());
            }
        }
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public final void removeCacheData(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(obj.toString()).optJSONObject("content");
            if (jSONObjectOptJSONObject == null) {
                return;
            }
            Application applicationA = x.a();
            ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("push");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    JSONObject jSONObject = (JSONObject) jSONArrayOptJSONArray.get(i10);
                    arrayList.add(ContentProviderOperation.newDelete(h.d(applicationA)).withSelection("MsgId=? And ActionType=?", new String[]{jSONObject.optString("msg_id"), String.valueOf(jSONObject.optInt("action_type"))}).build());
                }
            }
            applicationA.getContentResolver().applyBatch(h.f(applicationA), arrayList);
        } catch (Throwable th2) {
            UPLog.e("LogDataProtocol", th2);
        }
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public final JSONObject setupReportData(long j10) {
        return null;
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public final void workEvent(Object obj, int i10) {
        int i11;
        JSONObject jSONObjectBuildEnvelopeWithExtHeader;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectBuildEnvelopeWithExtHeader2;
        JSONObject jSONObjectBuildEnvelopeWithExtHeader3;
        JSONObject jSONObject;
        JSONObject jSONObjectBuildEnvelopeWithExtHeader4;
        JSONObject jSONObjectBuildEnvelopeWithExtHeader5;
        if (obj == null) {
        }
        int iOptInt = 0;
        try {
            switch (i10) {
                case 16385:
                    Application applicationA = x.a();
                    JSONObject jSONObject2 = new JSONObject(obj.toString());
                    JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("content");
                    if (jSONObjectOptJSONObject == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("push")) == null || jSONArrayOptJSONArray.length() <= 0) {
                        i11 = -1;
                    } else {
                        JSONObject jSONObject3 = (JSONObject) jSONArrayOptJSONArray.get(0);
                        int iOptInt2 = jSONObject3.optInt("action_type");
                        if (iOptInt2 != 70 && iOptInt2 != 71) {
                            if (iOptInt2 == 0) {
                                ((aj) PushAgent.getInstance(applicationA).getMessageNotifyApi()).a(jSONObject3);
                            }
                            ao.a(applicationA).a(jSONObject3.optString("msg_id"), iOptInt2, jSONObject3.optLong("ts"));
                        }
                        i11 = iOptInt2;
                    }
                    JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("header");
                    if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject != null && (jSONObjectBuildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(applicationA, jSONObjectOptJSONObject2, jSONObjectOptJSONObject, "umpx_push_logs", "p", MsgConstant.SDK_VERSION)) != null && !jSONObjectBuildEnvelopeWithExtHeader.has("exception") && i11 != 70 && i11 != 71) {
                        try {
                            removeCacheData(jSONObject2);
                        } catch (Throwable th2) {
                            th = th2;
                            th.printStackTrace();
                            return;
                        }
                    }
                    break;
                case androidx.core.view.o.f21766n /* 16386 */:
                    Application applicationA2 = x.a();
                    JSONObject jSONObject4 = new JSONObject(obj.toString());
                    JSONObject jSONObjectOptJSONObject3 = jSONObject4.optJSONObject("header");
                    JSONObject jSONObjectOptJSONObject4 = jSONObject4.optJSONObject("content");
                    if (jSONObjectOptJSONObject3 != null && jSONObjectOptJSONObject4 != null && (jSONObjectBuildEnvelopeWithExtHeader2 = UMEnvelopeBuild.buildEnvelopeWithExtHeader(applicationA2, jSONObjectOptJSONObject3, jSONObjectOptJSONObject4, "umpx_push_launch", "p", MsgConstant.SDK_VERSION)) != null && !jSONObjectBuildEnvelopeWithExtHeader2.has("exception")) {
                        MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(applicationA2);
                        messageSharedPrefs.f105562b.a(com.umeng.analytics.pro.d.f104709p, System.currentTimeMillis());
                        try {
                            int i12 = Integer.parseInt(UMEnvelopeBuild.imprintProperty(applicationA2, "launch_policy", "-1"));
                            UPLog.i("LogDataProtocol", "launch policy:", Integer.valueOf(i12));
                            if (i12 > 0) {
                                messageSharedPrefs.f105562b.a("launch_send_policy", i12);
                            }
                            break;
                        } catch (Throwable unused) {
                        }
                        try {
                            int i13 = Integer.parseInt(UMEnvelopeBuild.imprintProperty(applicationA2, "tag_policy", "-1"));
                            UPLog.i("LogDataProtocol", "tag policy:", Integer.valueOf(i13));
                            if (i13 > 0) {
                                messageSharedPrefs.f105562b.a("tag_send_policy", i13);
                            }
                            break;
                        } catch (Throwable unused2) {
                        }
                    }
                    y.f105908a = false;
                    break;
                case 16387:
                    Application applicationA3 = x.a();
                    JSONObject jSONObject5 = new JSONObject(obj.toString());
                    JSONObject jSONObjectOptJSONObject5 = jSONObject5.optJSONObject("header");
                    JSONObject jSONObjectOptJSONObject6 = jSONObject5.optJSONObject("content");
                    if (jSONObjectOptJSONObject5 != null && jSONObjectOptJSONObject6 != null && (jSONObjectBuildEnvelopeWithExtHeader3 = UMEnvelopeBuild.buildEnvelopeWithExtHeader(applicationA3, jSONObjectOptJSONObject5, jSONObjectOptJSONObject6, "umpx_push_register", "p", MsgConstant.SDK_VERSION)) != null && !jSONObjectBuildEnvelopeWithExtHeader3.has("exception")) {
                        MessageSharedPrefs.getInstance(applicationA3).f105562b.a("has_register", true);
                    }
                    y.f105909b = false;
                    break;
                case 16388:
                    Application applicationA4 = x.a();
                    JSONObject jSONObject6 = new JSONObject(obj.toString());
                    JSONObject jSONObjectOptJSONObject7 = jSONObject6.optJSONObject("jsonHeader");
                    JSONObject jSONObjectOptJSONObject8 = jSONObject6.optJSONObject("jsonBody");
                    String strOptString = jSONObject6.optString("um_px_path");
                    if (jSONObjectOptJSONObject7 != null && jSONObjectOptJSONObject8 != null) {
                        jSONObjectOptJSONObject7.put(com.umeng.analytics.pro.ak.aK, MsgConstant.SDK_VERSION);
                        jSONObjectOptJSONObject7.put("din", d.c(x.a()));
                        jSONObjectOptJSONObject7.put("push_switch", d.p(x.a()));
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject8.optJSONArray("push");
                        if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0 && (iOptInt = (jSONObject = (JSONObject) jSONArrayOptJSONArray2.get(0)).optInt("action_type")) == 0) {
                            ((aj) PushAgent.getInstance(applicationA4).getMessageNotifyApi()).a(jSONObject);
                        }
                        JSONObject jSONObjectBuildEnvelopeWithExtHeader6 = UMEnvelopeBuild.buildEnvelopeWithExtHeader(applicationA4, jSONObjectOptJSONObject7, jSONObjectOptJSONObject8, strOptString, "p", MsgConstant.SDK_VERSION);
                        if (jSONObjectBuildEnvelopeWithExtHeader6 != null && !jSONObjectBuildEnvelopeWithExtHeader6.has("exception") && iOptInt != 6 && iOptInt != 7) {
                            a(applicationA4, jSONObjectOptJSONObject8.getJSONArray("push"));
                            break;
                        }
                    }
                    break;
                case 16389:
                    Application applicationA5 = x.a();
                    JSONObject jSONObject7 = new JSONObject(obj.toString());
                    JSONObject jSONObjectOptJSONObject9 = jSONObject7.optJSONObject("header");
                    JSONObject jSONObjectOptJSONObject10 = jSONObject7.optJSONObject("content");
                    if (jSONObjectOptJSONObject9 != null && jSONObjectOptJSONObject10 != null && (jSONObjectBuildEnvelopeWithExtHeader4 = UMEnvelopeBuild.buildEnvelopeWithExtHeader(applicationA5, jSONObjectOptJSONObject9, jSONObjectOptJSONObject10, "umpx_push_logs", "p", MsgConstant.SDK_VERSION)) != null && !jSONObjectBuildEnvelopeWithExtHeader4.has("exception")) {
                        y.a();
                        y.a(jSONObjectOptJSONObject10.getJSONArray("push"));
                        break;
                    }
                    break;
                case 16390:
                    JSONObject jSONObject8 = new JSONObject(obj.toString());
                    Application applicationA6 = x.a();
                    JSONObject jSONObject9 = new JSONObject();
                    jSONObject9.put(com.umeng.analytics.pro.ak.aK, MsgConstant.SDK_VERSION);
                    jSONObject9.put("din", d.c(applicationA6));
                    jSONObject9.put("push_switch", d.p(applicationA6));
                    JSONObject jSONObject10 = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    jSONObject8.put(j5.b.f124286k, "");
                    jSONObject8.put(RemoteMessageConst.DEVICE_TOKEN, PushAgent.getInstance(applicationA6).getRegistrationId());
                    jSONObject8.put("msg_id", "");
                    jSONObject8.put("ts", System.currentTimeMillis());
                    jSONArray.put(jSONObject8);
                    jSONObject10.put("push", jSONArray);
                    JSONObject jSONObjectBuildEnvelopeWithExtHeader7 = UMEnvelopeBuild.buildEnvelopeWithExtHeader(applicationA6, jSONObject9, jSONObject10, "umpx_push_logs", "p", MsgConstant.SDK_VERSION);
                    if (jSONObjectBuildEnvelopeWithExtHeader7 != null) {
                        jSONObjectBuildEnvelopeWithExtHeader7.has("exception");
                    }
                    break;
                case 16391:
                case 16392:
                    Application applicationA7 = x.a();
                    JSONObject jSONObject11 = new JSONObject(obj.toString());
                    JSONObject jSONObjectOptJSONObject11 = jSONObject11.optJSONObject("content");
                    JSONObject jSONObjectOptJSONObject12 = jSONObject11.optJSONObject("header");
                    if (jSONObjectOptJSONObject12 != null && jSONObjectOptJSONObject11 != null && (jSONObjectBuildEnvelopeWithExtHeader5 = UMEnvelopeBuild.buildEnvelopeWithExtHeader(applicationA7, jSONObjectOptJSONObject12, jSONObjectOptJSONObject11, "umpx_push_logs", "p", MsgConstant.SDK_VERSION)) != null) {
                        jSONObjectBuildEnvelopeWithExtHeader5.has("exception");
                        break;
                    }
                default:
                    break;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
