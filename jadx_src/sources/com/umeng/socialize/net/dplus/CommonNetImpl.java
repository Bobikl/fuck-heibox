package com.umeng.socialize.net.dplus;

import android.content.Context;
import android.util.Base64;
import com.umeng.analytics.pro.ak;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.socialize.a.h;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.net.dplus.db.DBConfig;
import com.umeng.socialize.net.dplus.db.DBManager;
import com.umeng.socialize.utils.ContextUtil;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class CommonNetImpl implements UMLogDataProtocol {
    public static final String AID = "aid";
    public static final String AM = "am";
    public static final String AS = "as";
    public static final String AT = "at";
    public static final String AUTH = "auth";
    public static final String A_B = "a_b";
    public static final String CANCEL = "cancel";
    public static final String CONTENT = "content";
    public static final String CT = "ct";
    public static final String DAU = "dau";
    public static final String DURL = "durl";
    public static final String E_M = "e_m";
    public static final String FAIL = "fail";
    public static final int FLAG_AUTH = 268435456;
    public static final int FLAG_SHARE = 536870912;
    public static final int FLAG_SHARE_EDIT = 16777216;
    public static final int FLAG_SHARE_JUMP = 33554432;
    public static final String HEADER = "header";
    public static final String IMEI = "imei";
    public static final int MAX_FILE_SIZE_IN_KB = 65536;
    public static final int MAX_SEND_SIZE_IN_KB = 524288;
    public static final int MAX_SIZE_IN_KB = 5242880;
    public static final String MENUBG = "menubg";
    public static final String MOB_NUM = "pn";
    public static final String M_P = "m_p";
    public static final String M_U = "m_u";
    public static final String NAME = "name";
    public static final String PCV = "s_pcv";
    public static final String PF = "pf";
    public static final String PIC = "pic";
    public static final String PICURL = "picurl";
    public static final String POSITION = "position";
    public static final String REGION = "regn";
    public static final String RESULT = "result";
    public static final String SDKT = "sdkt";
    public static final String SDKVERSON = "s_sdk_v";
    public static final String SEX = "sex";
    public static final String SHARE = "share";
    public static final String SHARETYPE = "s_t";
    public static final String SM = "sm";
    public static final String STATS = "stats";
    public static final String STATS_TAG = "stats";
    public static final String STYPE = "stype";
    public static final String SUCCESS = "success";
    public static final String S_A_E = "s_a_e";
    public static final String S_A_S = "s_a_s";
    public static final String S_DAU = "s_dau";
    public static final String S_E = "s_e";
    public static final String S_I = "s_i";
    public static final String S_I_E = "s_i_e";
    public static final String S_I_S = "s_i_s";
    public static final String S_S_E = "s_s_e";
    public static final String S_S_S = "s_s_s";
    public static final String TAG = "tag";
    public static final String TITLE = "title";
    public static final String TS = "ts";
    public static final String UID = "uid";
    public static final String UMID = "umid";
    public static final String UN = "un";
    public static final String UNIONID = "unionid";
    public static final String UP = "up";
    public static final String URL = "url";
    public static final String USERINFO = "userinfo";
    public static final String U_C = "u_c";
    public static final String click_key = "at";
    private static boolean isSendStats = false;
    private static CommonNetImpl singleton;
    private Context mConetxt;
    private final int MAX_SIZE = 1048576;
    private ArrayList<Integer> shareList = new ArrayList<>();
    private ArrayList<Integer> authList = new ArrayList<>();
    private ArrayList<Integer> infoList = new ArrayList<>();
    private ArrayList<Integer> dauList = new ArrayList<>();
    private ArrayList<Integer> statsList = new ArrayList<>();

    private CommonNetImpl(Context context) {
        this.mConetxt = context;
    }

    private static double checkFile() {
        File dataFile = ContextUtil.getDataFile(DBConfig.DB_NAME);
        if (dataFile == null || !dataFile.exists()) {
            return 0.0d;
        }
        return dataFile.length();
    }

    private void clearAllList() {
        this.shareList.clear();
        this.authList.clear();
        this.infoList.clear();
        this.dauList.clear();
        this.statsList.clear();
    }

    private JSONObject constructHeader() {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("s_sdk_v", "7.3.2");
                jSONObject2.put(PCV, SocializeConstants.PROTOCOL_VERSON);
                return jSONObject2;
            } catch (Throwable unused) {
                jSONObject = jSONObject2;
                return jSONObject;
            }
        } catch (Throwable unused2) {
        }
    }

    public static CommonNetImpl get(Context context) {
        if (singleton == null) {
            singleton = new CommonNetImpl(context);
        }
        return singleton;
    }

    private void saveFile(Object obj, int i10) {
        if (obj != null && (obj instanceof JSONObject)) {
            JSONObject jSONObject = (JSONObject) obj;
            switch (i10) {
                case SocializeConstants.DAU_EVENT /* 24577 */:
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> Share: DAU_EVENT");
                    DBManager.get(this.mConetxt).insertDau(jSONObject);
                    break;
                case SocializeConstants.SHARE_EVENT /* 24578 */:
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> Share: SHARE_EVENT");
                    DBManager.get(this.mConetxt).insertS_E(jSONObject);
                    break;
                case SocializeConstants.AUTH_EVENT /* 24579 */:
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> Share: AUTH_EVENT");
                    DBManager.get(this.mConetxt).insertAuth(jSONObject);
                    break;
                case SocializeConstants.GET_EVENT /* 24580 */:
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> Share: GET_EVENT");
                    DBManager.get(this.mConetxt).insertUserInfo(jSONObject);
                    break;
                case SocializeConstants.SAVE_STATS_EVENT /* 24581 */:
                case SocializeConstants.SEND_DAU_STATS_EVENT /* 24583 */:
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> Share: SAVE_STATS_EVENT");
                    DBManager.get(this.mConetxt).insertStats(jSONObject);
                    break;
                case SocializeConstants.CHECK_STATS_EVENT /* 24582 */:
                default:
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> Share: default case.");
                    DBManager.get(this.mConetxt).insertStats(jSONObject);
                    break;
            }
            if (UMWorkDispatch.eventHasExist(SocializeConstants.BUILD_ENVELOPE)) {
                return;
            }
            UMWorkDispatch.sendEvent(this.mConetxt, SocializeConstants.BUILD_ENVELOPE, this, null);
        }
    }

    public void deleteData(Context context) {
        if (this.shareList.size() > 0) {
            DBManager.get(context).delete(this.shareList, "s_e");
            this.shareList.clear();
        }
        if (this.authList.size() > 0) {
            DBManager.get(context).delete(this.authList, "auth");
            this.authList.clear();
        }
        if (this.dauList.size() > 0) {
            DBManager.get(context).delete(this.dauList, "dau");
            this.dauList.clear();
        }
        if (this.infoList.size() > 0) {
            DBManager.get(context).delete(this.infoList, "userinfo");
            this.infoList.clear();
        }
        if (this.statsList.size() > 0) {
            DBManager.get(context).delete(this.statsList, "stats");
            this.statsList.clear();
        }
    }

    public JSONObject readData(Context context, int i10) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        JSONArray jSONArray4;
        String strOptString;
        double dCheckFile = checkFile();
        if (dCheckFile >= 5242880.0d) {
            DBManager.get(ContextUtil.getContext()).deleteTable("stats");
            return null;
        }
        boolean z10 = 1048576.0d <= dCheckFile + 24576.0d;
        JSONObject jSONObject = new JSONObject();
        try {
            new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArraySelect = DBManager.get(context).select("s_e", this.shareList, 1047552.0d, z10);
            double length = ((double) jSONArraySelect.toString().getBytes().length) + 1024.0d;
            JSONArray jSONArraySelect2 = DBManager.get(context).select("auth", this.authList, 1048576.0d - length, z10);
            double length2 = length + ((double) jSONArraySelect2.toString().getBytes().length);
            JSONArray jSONArraySelect3 = DBManager.get(context).select("userinfo", this.infoList, 1048576.0d - length2, z10);
            double length3 = length2 + ((double) jSONArraySelect3.toString().getBytes().length);
            JSONArray jSONArray5 = jSONArraySelect3;
            JSONArray jSONArraySelect4 = DBManager.get(context).select("dau", this.dauList, 1048576.0d - length3, z10);
            JSONArray jSONArraySelect5 = DBManager.get(context).select("stats", this.statsList, 1048576.0d - (length3 + ((double) jSONArraySelect4.toString().getBytes().length)), z10);
            int length4 = jSONArraySelect5.toString().getBytes().length;
            checkFile();
            if (jSONArraySelect4.length() != 0) {
                jSONArray = jSONArraySelect4;
                jSONObject2.put("dau", jSONArray);
            } else {
                jSONArray = jSONArraySelect4;
            }
            if (jSONArraySelect.length() != 0) {
                jSONArray2 = jSONArraySelect;
                jSONObject2.put("s_e", jSONArray2);
            } else {
                jSONArray2 = jSONArraySelect;
            }
            if (jSONArraySelect2.length() != 0) {
                jSONArray3 = jSONArraySelect2;
                jSONObject2.put("auth", jSONArray3);
            } else {
                jSONArray3 = jSONArraySelect2;
            }
            if (jSONArray5.length() != 0) {
                int i11 = 0;
                while (i11 < jSONArray5.length()) {
                    JSONArray jSONArray6 = jSONArray5;
                    JSONObject jSONObjectOptJSONObject = jSONArray6.optJSONObject(i11);
                    if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString("pn", null)) != null) {
                        jSONObjectOptJSONObject.put("pn", new String(Base64.decode(strOptString, 0)));
                    }
                    i11++;
                    jSONArray5 = jSONArray6;
                }
                jSONArray4 = jSONArray5;
                jSONObject2.put("userinfo", jSONArray4);
            } else {
                jSONArray4 = jSONArray5;
            }
            if (jSONArraySelect5.length() != 0) {
                jSONObject2.put("stats", jSONArraySelect5);
            }
            jSONObject.put("share", jSONObject2);
            if (jSONArray2.length() == 0 && jSONArray3.length() == 0 && jSONArray4.length() == 0 && jSONArray.length() == 0 && jSONArraySelect5.length() == 0) {
                jSONObject = null;
            }
        } catch (JSONException e10) {
            SLog.error(UmengText.CACHE.CACHEFILE, e10);
        }
        if (jSONObject == null || jSONObject.toString().getBytes().length <= 1048576.0d) {
            return jSONObject;
        }
        return null;
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void removeCacheData(Object obj) {
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public JSONObject setupReportData(long j10) {
        return null;
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void workEvent(Object obj, int i10) {
        switch (i10) {
            case SocializeConstants.REGIST_TO_WORK_QUEUE /* 24592 */:
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> Share: REGIST_TO_WORK_QUEUE");
                break;
            case SocializeConstants.BUILD_ENVELOPE /* 24593 */:
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> Share: BUILD_ENVELOPE");
                JSONObject jSONObjectConstructHeader = constructHeader();
                if (jSONObjectConstructHeader != null) {
                    JSONObject data = readData(this.mConetxt, i10);
                    if (data != null) {
                        JSONObject jSONObjectBuildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(this.mConetxt, jSONObjectConstructHeader, data, "umpx_share", ak.aB, "7.3.2");
                        if (jSONObjectBuildEnvelopeWithExtHeader != null) {
                            if (jSONObjectBuildEnvelopeWithExtHeader.has("exception")) {
                                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> Share: 构建信封失败!");
                                if (data.optInt("exception") != 101) {
                                    deleteData(this.mConetxt);
                                }
                            } else {
                                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> Share: 构建信封成功，删除本地数据!");
                                deleteData(this.mConetxt);
                            }
                        }
                    } else {
                        SLog.E(UmengText.NET.BODYNULL);
                    }
                    clearAllList();
                }
                break;
            case SocializeConstants.AZX_TRIGGER /* 24594 */:
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> Share: AZX_TRIGGER");
                try {
                    h.a();
                } catch (Throwable th2) {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> Share: AZX_TASK invoke exception!");
                    th2.printStackTrace();
                    return;
                }
                break;
            default:
                saveFile(obj, i10);
                break;
        }
    }
}
