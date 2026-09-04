package com.tencent.cos.xml.common;

/* JADX INFO: loaded from: classes4.dex */
public enum Region {
    AP_Beijing_1("ap-beijing-1"),
    AP_Beijing("ap-beijing"),
    AP_Shanghai("ap-shanghai"),
    AP_Guangzhou("ap-guangzhou"),
    AP_Guangzhou_2("ap-guangzhou-2"),
    AP_Chengdu("ap-chengdu"),
    AP_Singapore("ap-singapore"),
    AP_Hongkong("ap-hongkong"),
    NA_Toronto("na-toronto"),
    EU_Frankfurt("eu-frankfurt"),
    CN_NORTH("cn-north"),
    CN_SOUTH("cn-south"),
    CN_EAST("cn-east"),
    CN_SOUTHWEST("cn-southwest"),
    SG("sg");

    private String region;

    Region(String str) {
        this.region = str;
    }

    public static Region fromValue(String str) {
        for (Region region : values()) {
            if (region.region.equalsIgnoreCase(str)) {
                return region;
            }
        }
        return null;
    }

    public String getRegion() {
        return this.region;
    }
}
