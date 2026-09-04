package com.max.xiaoheihe.bean.news;

import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FeedsContentRecNewsObj extends FeedsContentBaseObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<BBSLinkObj> links;
    private String protocol;
    private String topic_id;

    public List<BBSLinkObj> getLinks() {
        return this.links;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public String getTopic_id() {
        return this.topic_id;
    }

    public void setLinks(List<BBSLinkObj> list) {
        this.links = list;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setTopic_id(String str) {
        this.topic_id = str;
    }
}
