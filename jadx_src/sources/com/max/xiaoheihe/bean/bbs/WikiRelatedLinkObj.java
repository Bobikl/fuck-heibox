package com.max.xiaoheihe.bean.bbs;

import com.max.hbshare.bean.HBShareProtocolData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class WikiRelatedLinkObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2810049099944931344L;
    private String description;
    private List<String> imgs;
    private String link_tag;
    private String linkid;
    private String share_url;
    private String title;
    private String url;

    public String getDescription() {
        return this.description;
    }

    public List<String> getImgs() {
        return this.imgs;
    }

    public String getLink_tag() {
        return this.link_tag;
    }

    public String getLinkid() {
        return this.linkid;
    }

    public String getShare_url() {
        return this.share_url;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setImgs(List<String> list) {
        this.imgs = list;
    }

    public void setLink_tag(String str) {
        this.link_tag = str;
    }

    public void setLinkid(String str) {
        this.linkid = str;
    }

    public void setShare_url(String str) {
        this.share_url = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public HBShareProtocolData toHBShareProtocolData() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14542, new Class[0], HBShareProtocolData.class);
        return patchProxyResultProxy.isSupported ? (HBShareProtocolData) patchProxyResultProxy.result : new HBShareProtocolData(this.title, this.description, this.share_url, null, null, null, null, null, null);
    }
}
