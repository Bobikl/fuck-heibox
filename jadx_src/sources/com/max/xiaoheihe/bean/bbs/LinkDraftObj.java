package com.max.xiaoheihe.bean.bbs;

import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.utils.c;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.bean.bbs.post_edit.PostCompilationItemObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class LinkDraftObj implements Serializable {
    public static final String DRAFT_TYPE_HTML = "html";
    public static final String DRAFT_TYPE_NATIVE = "native";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -8536594842373148802L;
    private String article_auth;
    private LinkImageObj article_img;
    private String article_reference;
    private String article_reprint_tips;
    private String article_type;
    private PostBtnObj btn;
    private List<String> checkedHashTags;
    private List<BBSTopicObj> checkedTopics;
    private String compilation_obj_id;
    private String content;
    private String creat_time;
    private Map<String, String> extraParam;
    private boolean isSynced;
    private String is_article;
    private String link_id;
    private String link_tag;
    private String local_link_id;
    private String origin_compilation_obj_id;
    private KeyDescObj post_plan;
    private String post_type;
    private PostCompilationItemObj save_draft_selected_compilation;
    private String tags;
    private String title;
    private String type;
    private String view_limit;
    private BBSLinkVoteObj voteInfo;

    public LinkDraftObj(String str) {
        this.isSynced = false;
        this.local_link_id = str;
        this.type = "native";
    }

    public LinkDraftObj(String str, String str2) {
        this.isSynced = false;
        this.local_link_id = str;
        this.type = str2;
    }

    public LinkDraftObj deepCopyByJson() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14324, new Class[0], LinkDraftObj.class);
        return patchProxyResultProxy.isSupported ? (LinkDraftObj) patchProxyResultProxy.result : (LinkDraftObj) k.a(k.p(this), LinkDraftObj.class);
    }

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14323, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LinkDraftObj linkDraftObj = (LinkDraftObj) obj;
        if (!Objects.equals(this.local_link_id, linkDraftObj.local_link_id) || !Objects.equals(this.link_tag, linkDraftObj.link_tag) || !getType().equals(linkDraftObj.type)) {
            return false;
        }
        String str = this.title;
        if (str == null ? linkDraftObj.title != null : !str.equals(linkDraftObj.title)) {
            return false;
        }
        String str2 = this.content;
        if (str2 == null ? linkDraftObj.content != null : !str2.equals(linkDraftObj.content)) {
            return false;
        }
        BBSLinkVoteObj bBSLinkVoteObj = this.voteInfo;
        if (bBSLinkVoteObj == null ? linkDraftObj.voteInfo != null : !bBSLinkVoteObj.equals(linkDraftObj.voteInfo)) {
            return false;
        }
        List<BBSTopicObj> list = this.checkedTopics;
        List<BBSTopicObj> list2 = linkDraftObj.checkedTopics;
        if (list != null) {
            return list.equals(list2);
        }
        return list2 == null;
    }

    public String getArticle_auth() {
        return this.article_auth;
    }

    public LinkImageObj getArticle_img() {
        return this.article_img;
    }

    public String getArticle_reference() {
        return this.article_reference;
    }

    public String getArticle_reprint_tips() {
        return this.article_reprint_tips;
    }

    public String getArticle_type() {
        return this.article_type;
    }

    public PostBtnObj getBtn() {
        return this.btn;
    }

    public List<String> getCheckedHashTags() {
        return this.checkedHashTags;
    }

    public List<BBSTopicObj> getCheckedTopics() {
        return this.checkedTopics;
    }

    public String getCompilation_obj_id() {
        return this.compilation_obj_id;
    }

    public String getContent() {
        return this.content;
    }

    public String getCreat_time() {
        return this.creat_time;
    }

    public Map<String, String> getExtraParam() {
        return this.extraParam;
    }

    public String getIs_article() {
        return this.is_article;
    }

    public String getLink_id() {
        return this.link_id;
    }

    public String getLink_tag() {
        return this.link_tag;
    }

    public String getLocal_link_id() {
        return this.local_link_id;
    }

    public String getOrigin_compilation_obj_id() {
        return this.origin_compilation_obj_id;
    }

    public KeyDescObj getPost_plan() {
        return this.post_plan;
    }

    public String getPost_type() {
        return this.post_type;
    }

    public PostCompilationItemObj getSave_draft_selected_compilation() {
        return this.save_draft_selected_compilation;
    }

    public String getTags() {
        return this.tags;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14322, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return c.u(this.type) ? "native" : this.type;
    }

    public String getView_limit() {
        return this.view_limit;
    }

    public BBSLinkVoteObj getVoteInfo() {
        return this.voteInfo;
    }

    public boolean isSynced() {
        return this.isSynced;
    }

    public void setArticle_auth(String str) {
        this.article_auth = str;
    }

    public void setArticle_img(LinkImageObj linkImageObj) {
        this.article_img = linkImageObj;
    }

    public void setArticle_reference(String str) {
        this.article_reference = str;
    }

    public void setArticle_reprint_tips(String str) {
        this.article_reprint_tips = str;
    }

    public void setArticle_type(String str) {
        this.article_type = str;
    }

    public void setBtn(PostBtnObj postBtnObj) {
        this.btn = postBtnObj;
    }

    public void setCheckedHashTags(List<String> list) {
        this.checkedHashTags = list;
    }

    public void setCheckedTopics(List<BBSTopicObj> list) {
        this.checkedTopics = list;
    }

    public void setCompilation_obj_id(String str) {
        this.compilation_obj_id = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setCreat_time(String str) {
        this.creat_time = str;
    }

    public void setExtraParam(Map<String, String> map) {
        this.extraParam = map;
    }

    public void setIs_article(String str) {
        this.is_article = str;
    }

    public void setLink_id(String str) {
        this.link_id = str;
    }

    public void setLink_tag(String str) {
        this.link_tag = str;
    }

    public void setLocal_link_id(String str) {
        this.local_link_id = str;
    }

    public void setOrigin_compilation_obj_id(String str) {
        this.origin_compilation_obj_id = str;
    }

    public void setPost_plan(KeyDescObj keyDescObj) {
        this.post_plan = keyDescObj;
    }

    public void setPost_type(String str) {
        this.post_type = str;
    }

    public void setSave_draft_selected_compilation(PostCompilationItemObj postCompilationItemObj) {
        this.save_draft_selected_compilation = postCompilationItemObj;
    }

    public void setSynced(boolean z10) {
        this.isSynced = z10;
    }

    public void setTags(String str) {
        this.tags = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setView_limit(String str) {
        this.view_limit = str;
    }

    public void setVoteInfo(BBSLinkVoteObj bBSLinkVoteObj) {
        this.voteInfo = bBSLinkVoteObj;
    }
}
