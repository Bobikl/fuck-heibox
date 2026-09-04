package com.alipay.face.log;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.umeng.analytics.pro.ak;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes6.dex */
public class RecordBase {
    public String magic = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String logTime = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String clientId = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String clientVersion = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String logVersion = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String deviceId = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String sessionId = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String userId = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String actionId = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String abTestId = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String refer = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String appId = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String pageStartTime = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String xPath = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String entityId = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String actionName = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String logLevel = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String bizType = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String logType = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String extParam1 = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String extParma2 = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String extParam3 = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String extParam4 = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String pageId = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String prevViewId = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String viewId = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String curAid = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String curAToken = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String sampleRatio = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String phoneType = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String osVersion = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String netType = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String internalVersion = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String channel = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String language = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String hotPatchVersion = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String coreNum = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String maxFreq = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String totalMem = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String baseExt = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String enableSPM = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    public String screenMetrix = Constants.ACCEPT_TIME_SEPARATOR_SERVER;

    public String getAbTestId() {
        return this.abTestId;
    }

    public String getActionId() {
        return this.actionId;
    }

    public String getActionName() {
        return this.actionName;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getBaseExt() {
        return this.baseExt;
    }

    public String getBizType() {
        return this.bizType;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getClientId() {
        return this.clientId;
    }

    public String getClientVersion() {
        return this.clientVersion;
    }

    public String getCoreNum() {
        return this.coreNum;
    }

    public String getCurAToken() {
        return this.curAToken;
    }

    public String getCurAid() {
        return this.curAid;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getEnableSPM() {
        return this.enableSPM;
    }

    public String getEntityId() {
        return this.entityId;
    }

    public String getExtParam1() {
        return this.extParam1;
    }

    public String getExtParam3() {
        return this.extParam3;
    }

    public String getExtParam4() {
        return this.extParam4;
    }

    public String getExtParma2() {
        return this.extParma2;
    }

    public String getHotPatchVersion() {
        return this.hotPatchVersion;
    }

    public String getInternalVersion() {
        return this.internalVersion;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getLogLevel() {
        return this.logLevel;
    }

    public String getLogTime() {
        return this.logTime;
    }

    public String getLogType() {
        return this.logType;
    }

    public String getLogVersion() {
        return this.logVersion;
    }

    public String getMagic() {
        return this.magic;
    }

    public String getMaxFreq() {
        return this.maxFreq;
    }

    public String getNetType() {
        return this.netType;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public String getPageId() {
        return this.pageId;
    }

    public String getPageStartTime() {
        return this.pageStartTime;
    }

    public String getPhoneType() {
        return this.phoneType;
    }

    public String getPrevViewId() {
        return this.prevViewId;
    }

    public String getRefer() {
        return this.refer;
    }

    public String getSampleRatio() {
        return this.sampleRatio;
    }

    public String getScreenMetrix() {
        return this.screenMetrix;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public String getTotalMem() {
        return this.totalMem;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getViewId() {
        return this.viewId;
    }

    public String getxPath() {
        return this.xPath;
    }

    public void setAbTestId(String str) {
        this.abTestId = str;
    }

    public void setActionId(String str) {
        this.actionId = str;
    }

    public void setActionName(String str) {
        this.actionName = str;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setBaseExt(String str) {
        this.baseExt = str;
    }

    public void setBizType(String str) {
        this.bizType = str;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setClientId(String str) {
        this.clientId = str;
    }

    public void setClientVersion(String str) {
        this.clientVersion = str;
    }

    public void setCoreNum(String str) {
        this.coreNum = str;
    }

    public void setCurAToken(String str) {
        this.curAToken = str;
    }

    public void setCurAid(String str) {
        this.curAid = str;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setEnableSPM(String str) {
        this.enableSPM = str;
    }

    public void setEntityId(String str) {
        this.entityId = str;
    }

    public void setExtParam1(String str) {
        this.extParam1 = str;
    }

    public void setExtParam3(String str) {
        this.extParam3 = str;
    }

    public void setExtParam4(String str) {
        this.extParam4 = str;
    }

    public void setExtParma2(String str) {
        this.extParma2 = str;
    }

    public void setHotPatchVersion(String str) {
        this.hotPatchVersion = str;
    }

    public void setInternalVersion(String str) {
        this.internalVersion = str;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setLogLevel(String str) {
        this.logLevel = str;
    }

    public void setLogTime(String str) {
        this.logTime = str;
    }

    public void setLogType(String str) {
        this.logType = str;
    }

    public void setLogVersion(String str) {
        this.logVersion = str;
    }

    public void setMagic(String str) {
        this.magic = str;
    }

    public void setMaxFreq(String str) {
        this.maxFreq = str;
    }

    public void setNetType(String str) {
        this.netType = str;
    }

    public void setOsVersion(String str) {
        this.osVersion = str;
    }

    public void setPageId(String str) {
        this.pageId = str;
    }

    public void setPageStartTime(String str) {
        this.pageStartTime = str;
    }

    public void setPhoneType(String str) {
        this.phoneType = str;
    }

    public void setPrevViewId(String str) {
        this.prevViewId = str;
    }

    public void setRefer(String str) {
        this.refer = str;
    }

    public void setSampleRatio(String str) {
        this.sampleRatio = str;
    }

    public void setScreenMetrix(String str) {
        this.screenMetrix = str;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public void setTotalMem(String str) {
        this.totalMem = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void setViewId(String str) {
        this.viewId = str;
    }

    public void setxPath(String str) {
        this.xPath = str;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String[] strArr = {"magic", "logTime", "clientId", "clientVersion", "logVersion", "deviceId", "sessionId", "userId", "actionId", "abTestId", "refer", "appId", "pageStartTime", "xPath", "entityId", "actionName", "logLevel", "bizType", "logType", "extParam1", "extParma2", "extParam3", "extParam4", "pageId", "prevViewId", "viewId", "curAid", "curAToken", "sampleRatio", HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, "osVersion", DispatchConstants.NET_TYPE, "internalVersion", "channel", ak.N, "hotPatchVersion", "coreNum", "maxFreq", "totalMem", "baseExt", "enableSPM", "screenMetrix"};
        for (int i10 = 0; i10 < 42; i10++) {
            try {
                Field declaredField = RecordBase.class.getDeclaredField(strArr[i10]);
                declaredField.setAccessible(true);
                try {
                    str = (String) declaredField.get(this);
                } catch (Exception e10) {
                    e = e10;
                    e.printStackTrace();
                    str = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
                }
            } catch (Exception e11) {
                e = e11;
            }
            sb2.append(str);
            if (i10 != 41) {
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
        }
        sb2.append("$$");
        return sb2.toString();
    }
}
