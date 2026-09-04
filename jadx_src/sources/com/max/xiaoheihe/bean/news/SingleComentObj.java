package com.max.xiaoheihe.bean.news;

import ac.a;
import com.max.xiaoheihe.bean.LevelInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class SingleComentObj extends a implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5814786848318350862L;
    private String avartar;
    private String child_num;
    private String commentid;
    private String create_at;
    private String down;
    private String has_more;
    private String is_author;
    private String is_dislike;
    private String is_offical;
    private String is_svip;
    private String is_vip;
    private String issupport;
    private String level;
    private LevelInfoObj level_info;
    private String replyavartar;
    private String replyid;
    private String replyuserid;
    private String replyusername;
    private String text;
    private String top;
    private String up;
    private String userid;
    private String username;

    public String getAvartar() {
        return this.avartar;
    }

    @Override // ac.a
    public String getChildNum() {
        return this.child_num;
    }

    public String getChild_num() {
        return this.child_num;
    }

    public String getCommentid() {
        return this.commentid;
    }

    public String getCreate_at() {
        return this.create_at;
    }

    public String getDown() {
        return this.down;
    }

    public String getHas_more() {
        return this.has_more;
    }

    public String getIs_author() {
        return this.is_author;
    }

    public String getIs_dislike() {
        return this.is_dislike;
    }

    public String getIs_offical() {
        return this.is_offical;
    }

    public String getIs_svip() {
        return this.is_svip;
    }

    public String getIs_vip() {
        return this.is_vip;
    }

    public String getIssupport() {
        return this.issupport;
    }

    public String getLevel() {
        return this.level;
    }

    public LevelInfoObj getLevel_info() {
        return this.level_info;
    }

    public String getReplyavartar() {
        return this.replyavartar;
    }

    public String getReplyid() {
        return this.replyid;
    }

    public String getReplyuserid() {
        return this.replyuserid;
    }

    public String getReplyusername() {
        return this.replyusername;
    }

    public String getText() {
        return this.text;
    }

    public String getTop() {
        return this.top;
    }

    public String getUp() {
        return this.up;
    }

    public String getUserid() {
        return this.userid;
    }

    public String getUsername() {
        return this.username;
    }

    @Override // ac.a
    public String hasMoreComment() {
        return this.has_more;
    }

    public void setAvartar(String str) {
        this.avartar = str;
    }

    public void setChild_num(String str) {
        this.child_num = str;
    }

    public void setCommentid(String str) {
        this.commentid = str;
    }

    public void setCreate_at(String str) {
        this.create_at = str;
    }

    public void setDown(String str) {
        this.down = str;
    }

    public void setHas_more(String str) {
        this.has_more = str;
    }

    public void setIs_author(String str) {
        this.is_author = str;
    }

    public void setIs_dislike(String str) {
        this.is_dislike = str;
    }

    public void setIs_offical(String str) {
        this.is_offical = str;
    }

    public void setIs_svip(String str) {
        this.is_svip = str;
    }

    public void setIs_vip(String str) {
        this.is_vip = str;
    }

    public void setIssupport(String str) {
        this.issupport = str;
    }

    public void setLevel(String str) {
        this.level = str;
    }

    public void setLevel_info(LevelInfoObj levelInfoObj) {
        this.level_info = levelInfoObj;
    }

    public void setReplyavartar(String str) {
        this.replyavartar = str;
    }

    public void setReplyid(String str) {
        this.replyid = str;
    }

    public void setReplyuserid(String str) {
        this.replyuserid = str;
    }

    public void setReplyusername(String str) {
        this.replyusername = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTop(String str) {
        this.top = str;
    }

    public void setUp(String str) {
        this.up = str;
    }

    public void setUserid(String str) {
        this.userid = str;
    }

    public void setUsername(String str) {
        this.username = str;
    }
}
