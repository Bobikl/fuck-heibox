package com.max.xiaoheihe.bean.account;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class BetaTestInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String md5;
    private String package_url;
    private String test_desc;
    private String version;

    public String getMd5() {
        return this.md5;
    }

    public String getPackage_url() {
        return this.package_url;
    }

    public String getTest_desc() {
        return this.test_desc;
    }

    public String getVersion() {
        return this.version;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setPackage_url(String str) {
        this.package_url = str;
    }

    public void setTest_desc(String str) {
        this.test_desc = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
