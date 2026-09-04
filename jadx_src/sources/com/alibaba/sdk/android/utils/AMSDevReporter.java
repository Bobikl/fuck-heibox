package com.alibaba.sdk.android.utils;

import android.content.Context;
import com.huawei.hms.hmsscankit.DetailRect;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class AMSDevReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConcurrentHashMap<AMSSdkTypeEnum, AMSReportStatusEnum> f38032a = new ConcurrentHashMap<>();

    public enum AMSReportStatusEnum {
        UNREPORTED,
        REPORTED
    }

    public enum AMSSdkExtInfoKeyEnum {
        AMS_EXTINFO_KEY_VERSION("SdkVersion"),
        AMS_EXTINFO_KEY_PACKAGE(DetailRect.CP_PACKAGE);

        private String description;

        AMSSdkExtInfoKeyEnum(String str) {
            this.description = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.description;
        }
    }

    public enum AMSSdkTypeEnum {
        AMS_MAN("MAN"),
        AMS_HTTPDNS("HTTPDNS"),
        AMS_MPUSH("MPUSH"),
        AMS_MAC("MAC"),
        AMS_API("API"),
        AMS_HOTFIX("HOTFIX"),
        AMS_FEEDBACK("FEEDBACK"),
        AMS_IM("IM");

        private String description;

        AMSSdkTypeEnum(String str) {
            this.description = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.description;
        }
    }

    static {
        for (AMSSdkTypeEnum aMSSdkTypeEnum : AMSSdkTypeEnum.values()) {
            f38032a.put(aMSSdkTypeEnum, AMSReportStatusEnum.REPORTED);
        }
    }

    public static void asyncReport(Context context, AMSSdkTypeEnum aMSSdkTypeEnum) {
        b.a("Utils:DataTracker", "no man, do nothing");
    }

    public static void asyncReport(Context context, AMSSdkTypeEnum aMSSdkTypeEnum, Map<String, Object> map) {
        b.a("Utils:DataTracker", "no man, do nothing");
    }

    public static AMSReportStatusEnum getReportStatus(AMSSdkTypeEnum aMSSdkTypeEnum) {
        return f38032a.get(aMSSdkTypeEnum);
    }

    public static void setLogEnabled(boolean z10) {
        b.setLogEnabled(z10);
    }
}
