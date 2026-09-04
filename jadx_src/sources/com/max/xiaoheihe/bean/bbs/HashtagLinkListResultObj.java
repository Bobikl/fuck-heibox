package com.max.xiaoheihe.bean.bbs;

import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class HashtagLinkListResultObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -5793191372494663454L;
    private List<AdsBannerObj> ads_banner;
    private String color;
    private HashtagObj hashtag;
    private String lastval;
    private List<FeedsContentBaseObj> links;
    private MoreInspirationInfoObj more_inspiration_info;
    private KeyDescObj post_btn;
    private String protocol;
    private String publish_protocol;
    private RelatedActInfoObj related_act_info;
    private ShareInfoObj share_info;
    private List<KeyDescObj> sort_filter;
    private String use_waterfall_style;

    public static class MoreInspirationInfoObj implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String button_text;
        private String protocol;

        public String getButton_text() {
            return this.button_text;
        }

        public String getProtocol() {
            return this.protocol;
        }

        public void setButton_text(String str) {
            this.button_text = str;
        }

        public void setProtocol(String str) {
            this.protocol = str;
        }

        public String toString() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14298, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            return "MoreInspirationInfoObj{button_text='" + this.button_text + "', protocol='" + this.protocol + "'}";
        }
    }

    public static class RelatedActInfoObj implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String desc;
        private String label_text;
        private String protocol;
        private String title;

        public String getDesc() {
            return this.desc;
        }

        public String getLabel_text() {
            return this.label_text;
        }

        public String getProtocol() {
            return this.protocol;
        }

        public String getTitle() {
            return this.title;
        }

        public void setDesc(String str) {
            this.desc = str;
        }

        public void setLabel_text(String str) {
            this.label_text = str;
        }

        public void setProtocol(String str) {
            this.protocol = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public String toString() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14299, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            return "RelatedActInfoObj{title='" + this.title + "', desc='" + this.desc + "', label_text='" + this.label_text + "', protocol='" + this.protocol + "'}";
        }
    }

    public static class ShareInfoObj implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String desc;
        private String img;
        private String title;
        private String url;

        public String getDesc() {
            return this.desc;
        }

        public String getImg() {
            return this.img;
        }

        public String getTitle() {
            return this.title;
        }

        public String getUrl() {
            return this.url;
        }

        public void setDesc(String str) {
            this.desc = str;
        }

        public void setImg(String str) {
            this.img = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public String toString() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14300, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            return "ShareInfoObj{title='" + this.title + "', desc='" + this.desc + "', img='" + this.img + "', url='" + this.url + "'}";
        }
    }

    public List<AdsBannerObj> getAds_banner() {
        return this.ads_banner;
    }

    public String getColor() {
        return this.color;
    }

    public HashtagObj getHashtag() {
        return this.hashtag;
    }

    public String getLastval() {
        return this.lastval;
    }

    public List<FeedsContentBaseObj> getLinks() {
        return this.links;
    }

    public MoreInspirationInfoObj getMore_inspiration_info() {
        return this.more_inspiration_info;
    }

    public KeyDescObj getPost_btn() {
        return this.post_btn;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public String getPublish_protocol() {
        return this.publish_protocol;
    }

    public RelatedActInfoObj getRelated_act_info() {
        return this.related_act_info;
    }

    public ShareInfoObj getShare_info() {
        return this.share_info;
    }

    public List<KeyDescObj> getSort_filter() {
        return this.sort_filter;
    }

    public String getUse_waterfall_style() {
        return this.use_waterfall_style;
    }

    public void setAds_banner(List<AdsBannerObj> list) {
        this.ads_banner = list;
    }

    public void setColor(String str) {
        this.color = str;
    }

    public void setHashtag(HashtagObj hashtagObj) {
        this.hashtag = hashtagObj;
    }

    public void setLastval(String str) {
        this.lastval = str;
    }

    public void setLinks(List<FeedsContentBaseObj> list) {
        this.links = list;
    }

    public void setMore_inspiration_info(MoreInspirationInfoObj moreInspirationInfoObj) {
        this.more_inspiration_info = moreInspirationInfoObj;
    }

    public void setPost_btn(KeyDescObj keyDescObj) {
        this.post_btn = keyDescObj;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setPublish_protocol(String str) {
        this.publish_protocol = str;
    }

    public void setRelated_act_info(RelatedActInfoObj relatedActInfoObj) {
        this.related_act_info = relatedActInfoObj;
    }

    public void setShare_info(ShareInfoObj shareInfoObj) {
        this.share_info = shareInfoObj;
    }

    public void setSort_filter(List<KeyDescObj> list) {
        this.sort_filter = list;
    }

    public void setUse_waterfall_style(String str) {
        this.use_waterfall_style = str;
    }
}
