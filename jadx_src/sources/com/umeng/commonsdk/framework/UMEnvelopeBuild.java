package com.umeng.commonsdk.framework;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.ak;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.ao;
import com.umeng.analytics.pro.i;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.b;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class UMEnvelopeBuild {
    public static boolean transmissionSendFlag = false;

    private static JSONObject add2CacheTable(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3) {
        if (jSONObject == null || jSONObject2 == null) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]构建信封传入 header 或 body 字段为空，直接返回");
            return null;
        }
        i iVarA = i.a(context);
        long jCurrentTimeMillis = System.currentTimeMillis();
        UUID uuidRandomUUID = UUID.randomUUID();
        ContentValues contentValues = new ContentValues();
        contentValues.put(ao.f104523e, str2);
        contentValues.put(ao.f104524f, iVarA.c(jSONObject.toString()));
        contentValues.put(ao.f104525g, iVarA.c(jSONObject2.toString()));
        contentValues.put(ao.f104526h, String.valueOf(jCurrentTimeMillis));
        contentValues.put(ao.f104527i, uuidRandomUUID.toString());
        contentValues.put(ao.f104528j, str);
        contentValues.put(ao.f104529k, str3);
        am.a(context).a(ao.f104521c, contentValues);
        if ("i".equalsIgnoreCase(str2)) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]inner业务，返回空 JSONObject。");
        } else if (ak.aB.equalsIgnoreCase(str2)) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]分享业务 返回body。");
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("header", new JSONObject());
                jSONObject3.put("share", jSONObject2.getJSONObject("share"));
                return jSONObject3;
            } catch (JSONException unused) {
            }
        } else if (!"p".equalsIgnoreCase(str2)) {
            try {
                if ("st".equalsIgnoreCase(str2)) {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]统计业务 半开报文，返回body。");
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("header", new JSONObject());
                    jSONObject4.put("analytics", jSONObject2.getJSONObject("analytics"));
                    return jSONObject4;
                }
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]统计业务 闭合报文，返回body。");
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("header", new JSONObject());
                jSONObject5.put("analytics", jSONObject2.getJSONObject("analytics"));
                return jSONObject5;
            } catch (JSONException unused2) {
                return jSONObject2;
            }
        }
        return new JSONObject();
    }

    public static JSONObject buildEnvelopeWithExtHeader(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        if (jSONObject.has("st")) {
            str = "t";
        } else {
            str = jSONObject2.has(ak.au) ? "i" : ak.av;
        }
        return buildEnvelopeWithExtHeader(context, jSONObject, jSONObject2, UMServerURL.PATH_ANALYTICS, str, "9.4.4+000");
    }

    public static JSONObject buildEnvelopeWithExtHeader(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3) {
        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]业务发起构建普通有状态信封请求。");
        JSONObject jSONObject3 = null;
        if (TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("exception", 121);
                    return jSONObject4;
                } catch (JSONException unused) {
                    jSONObject3 = jSONObject4;
                    return jSONObject3;
                }
            } catch (JSONException unused2) {
            }
        } else {
            if (UMUtils.isMainProgress(context)) {
                if (UMConfigure.needSendZcfgEnv(context)) {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]零号报文应答数据 未获取到，写入二级缓存");
                    return add2CacheTable(context, jSONObject, jSONObject2, str, str2, str3);
                }
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]零号报文应答数据 已获取到，判断二级缓存是否为空");
                if (am.a(context).c()) {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存为空，直接打信封");
                    return new b().a(context.getApplicationContext(), jSONObject, jSONObject2, str, str2, str3);
                }
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存不为空，写入二级缓存");
                JSONObject jSONObjectAdd2CacheTable = add2CacheTable(context, jSONObject, jSONObject2, str, str2, str3);
                if (!UMWorkDispatch.eventHasExist(com.umeng.commonsdk.internal.a.f105210t)) {
                    UMWorkDispatch.sendEvent(context, com.umeng.commonsdk.internal.a.f105210t, com.umeng.commonsdk.internal.b.a(context).a(), null);
                }
                return jSONObjectAdd2CacheTable;
            }
            try {
                JSONObject jSONObject5 = new JSONObject();
                try {
                    jSONObject5.put("exception", 120);
                    return jSONObject5;
                } catch (JSONException unused3) {
                    jSONObject3 = jSONObject5;
                    return jSONObject3;
                }
            } catch (JSONException unused4) {
            }
        }
    }

    public static JSONObject buildZeroEnvelopeWithExtHeader(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        if (UMUtils.isMainProgress(context)) {
            return new b().a(context.getApplicationContext(), jSONObject, jSONObject2, str);
        }
        JSONObject jSONObject3 = null;
        try {
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("exception", 120);
                return jSONObject4;
            } catch (JSONException unused) {
                jSONObject3 = jSONObject4;
                return jSONObject3;
            }
        } catch (JSONException unused2) {
        }
    }

    public static long getLastInstantBuildTime(Context context) {
        if (context == null) {
            return 0L;
        }
        return UMFrUtils.getLastInstantBuildTime(context.getApplicationContext());
    }

    public static long getLastSuccessfulBuildTime(Context context) {
        if (context == null) {
            return 0L;
        }
        return UMFrUtils.getLastSuccessfulBuildTime(context.getApplicationContext());
    }

    public static synchronized boolean getTransmissionSendFlag() {
        return transmissionSendFlag;
    }

    public static String imprintProperty(Context context, String str, String str2) {
        return context == null ? str2 : ImprintHandler.getImprintService(context.getApplicationContext()).c().a(str, str2);
    }

    public static boolean isOnline(Context context) {
        return UMFrUtils.isOnline(context) && (UMConfigure.needSendZcfgEnv(context) ^ true);
    }

    public static boolean isReadyBuild(Context context, UMLogDataProtocol.UMBusinessType uMBusinessType) {
        return isRet(context, uMBusinessType, false);
    }

    public static boolean isReadyBuildNew(Context context, UMLogDataProtocol.UMBusinessType uMBusinessType) {
        if (getTransmissionSendFlag()) {
            return isRet(context, uMBusinessType, false);
        }
        return false;
    }

    public static boolean isReadyBuildStateless() {
        return getTransmissionSendFlag();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    private static boolean isRet(Context context, UMLogDataProtocol.UMBusinessType uMBusinessType, boolean z10) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            boolean zIsOnline = UMFrUtils.isOnline(applicationContext);
            int iEnvelopeFileNumber = UMFrUtils.envelopeFileNumber(applicationContext);
            if (zIsOnline) {
                if (uMBusinessType != UMLogDataProtocol.UMBusinessType.U_INTERNAL) {
                    if (a.a()) {
                        UMWorkDispatch.sendDelayProcessMsg(a.b());
                    } else if (!UMFrUtils.hasEnvelopeFile(applicationContext, uMBusinessType) && !UMConfigure.needSendZcfgEnv(context)) {
                        z10 = true;
                    }
                    z10 = false;
                } else if (UMFrUtils.hasEnvelopeFile(applicationContext, uMBusinessType)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            }
            if (zIsOnline && iEnvelopeFileNumber > 0) {
                a.d();
            }
        }
        return z10;
    }

    public static long maxDataSpace(Context context) {
        if (context == null) {
            return 0L;
        }
        return b.a(context.getApplicationContext());
    }

    public static synchronized void setTransmissionSendFlag(boolean z10) {
        transmissionSendFlag = z10;
    }
}
