package com.bytedance.sdk.open.aweme.base;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class UrlModel implements Serializable {

    @SerializedName("url_list")
    public List<String> urlList;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        List<String> list = this.urlList;
        List<String> list2 = ((UrlModel) obj).urlList;
        if (list != null) {
            return list.equals(list2);
        }
        return list2 == null;
    }

    public List<String> getUrlList() {
        return this.urlList;
    }

    public int hashCode() {
        List<String> list = this.urlList;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public void setUrlList(List<String> list) {
        this.urlList = list;
    }
}
