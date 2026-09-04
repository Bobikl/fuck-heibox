package com.max.xiaoheihe.bean.bbs;

import ac.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSCommentObj extends a implements Serializable {
    public static final String COMMENT_TYPE_COMMENT_COMMENT = "1";
    public static final String COMMENT_TYPE_POST_COMMENT = "2";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -5478107507380968581L;
    private String child_num;
    private String comment_num;
    private String commentid;
    private String create_at;
    private String desc_extra;
    private String description;
    private String floor_num;
    private String has_imgs;
    private String has_more;
    private List<PostImageObj> imgs;
    private String ip_location;
    private String is_author_award;
    private String is_cy;
    private String is_link_owner;
    private boolean is_loaded;
    private boolean is_local;
    private String is_support;
    private String is_top;
    private String linkid;
    private String qalink_id;
    private String qalink_title;
    private String recommend_state;
    private String replyid;
    private BBSUserInfoObj replyuser;
    private String text;
    private String top_comment;
    private String up;
    private BBSUserInfoObj user;
    private String username;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14167, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.commentid;
        String str2 = ((BBSCommentObj) obj).commentid;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    @Override // ac.a
    public String getChildNum() {
        return this.child_num;
    }

    public String getChild_num() {
        return this.child_num;
    }

    public String getComment_num() {
        return this.comment_num;
    }

    public String getCommentid() {
        return this.commentid;
    }

    public String getCreate_at() {
        return this.create_at;
    }

    public String getDesc_extra() {
        return this.desc_extra;
    }

    public String getDescription() {
        return this.description;
    }

    public String getFloor_num() {
        return this.floor_num;
    }

    public String getHas_imgs() {
        return this.has_imgs;
    }

    public String getHas_more() {
        return this.has_more;
    }

    public List<PostImageObj> getImgs() {
        return this.imgs;
    }

    public String getIp_location() {
        return this.ip_location;
    }

    public String getIs_author_award() {
        return this.is_author_award;
    }

    public String getIs_cy() {
        return this.is_cy;
    }

    public String getIs_link_owner() {
        return this.is_link_owner;
    }

    public String getIs_support() {
        return this.is_support;
    }

    public String getIs_top() {
        return this.is_top;
    }

    public String getLinkid() {
        return this.linkid;
    }

    public String getQalink_id() {
        return this.qalink_id;
    }

    public String getQalink_title() {
        return this.qalink_title;
    }

    public String getRecommend_state() {
        return this.recommend_state;
    }

    public String getReplyid() {
        return this.replyid;
    }

    public BBSUserInfoObj getReplyuser() {
        return this.replyuser;
    }

    public String getText() {
        return this.text;
    }

    public String getTop_comment() {
        return this.top_comment;
    }

    public String getUp() {
        return this.up;
    }

    public BBSUserInfoObj getUser() {
        return this.user;
    }

    public String getUsername() {
        return this.username;
    }

    @Override // ac.a
    public String hasMoreComment() {
        return this.has_more;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14168, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.commentid;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean isIs_loaded() {
        return this.is_loaded;
    }

    public boolean isIs_local() {
        return this.is_local;
    }

    public void setChild_num(String str) {
        this.child_num = str;
    }

    public void setComment_num(String str) {
        this.comment_num = str;
    }

    public void setCommentid(String str) {
        this.commentid = str;
    }

    public void setCreate_at(String str) {
        this.create_at = str;
    }

    public void setDesc_extra(String str) {
        this.desc_extra = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setFloor_num(String str) {
        this.floor_num = str;
    }

    public void setHas_imgs(String str) {
        this.has_imgs = str;
    }

    public void setHas_more(String str) {
        this.has_more = str;
    }

    public void setImgs(List<PostImageObj> list) {
        this.imgs = list;
    }

    public void setIp_location(String str) {
        this.ip_location = str;
    }

    public void setIs_author_award(String str) {
        this.is_author_award = str;
    }

    public void setIs_cy(String str) {
        this.is_cy = str;
    }

    public void setIs_link_owner(String str) {
        this.is_link_owner = str;
    }

    public void setIs_loaded(boolean z10) {
        this.is_loaded = z10;
    }

    public void setIs_local(boolean z10) {
        this.is_local = z10;
    }

    public void setIs_support(String str) {
        this.is_support = str;
    }

    public void setIs_top(String str) {
        this.is_top = str;
    }

    public void setLinkid(String str) {
        this.linkid = str;
    }

    public void setQalink_id(String str) {
        this.qalink_id = str;
    }

    public void setQalink_title(String str) {
        this.qalink_title = str;
    }

    public void setRecommend_state(String str) {
        this.recommend_state = str;
    }

    public void setReplyid(String str) {
        this.replyid = str;
    }

    public void setReplyuser(BBSUserInfoObj bBSUserInfoObj) {
        this.replyuser = bBSUserInfoObj;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTop_comment(String str) {
        this.top_comment = str;
    }

    public void setUp(String str) {
        this.up = str;
    }

    public void setUser(BBSUserInfoObj bBSUserInfoObj) {
        this.user = bBSUserInfoObj;
    }

    public void setUsername(String str) {
        this.username = str;
    }
}
