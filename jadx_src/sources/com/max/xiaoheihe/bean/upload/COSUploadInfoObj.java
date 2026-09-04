package com.max.xiaoheihe.bean.upload;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class COSUploadInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -4376425567692097120L;
    private String bucket;
    private String host;
    private List<String> keys;

    public String getBucket() {
        return this.bucket;
    }

    public String getHost() {
        return this.host;
    }

    public List<String> getKeys() {
        return this.keys;
    }

    public void setBucket(String str) {
        this.bucket = str;
    }

    public void setHost(String str) {
        this.host = str;
    }

    public void setKeys(List<String> list) {
        this.keys = list;
    }
}
