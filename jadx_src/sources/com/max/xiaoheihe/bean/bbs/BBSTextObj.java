package com.max.xiaoheihe.bean.bbs;

import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.SourceInfoObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.model.Draft;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSTextObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private GameObj app_info;
    private String appid;
    private boolean checked;
    private String commentText;
    private String commentTextImageBgColor;
    private String duration;
    private String extra;
    private KeyDescObj extra_tag;
    private PictureLinkContentTagObj extra_tag_v2;
    private List<GameObj> games;
    private String height;
    private String image;
    private Draft imageEditDraft;
    private KeyDescObj post_guide_card;
    private String protocol;
    private SourceInfoObj source_info;
    private String text;
    private LinkToolCardObj tool_card;
    private String type;
    private String url;
    private String username;
    private String video_thumb;
    private String width;

    public GameObj getApp_info() {
        return this.app_info;
    }

    public String getAppid() {
        return this.appid;
    }

    public String getCommentText() {
        String str = this.commentText;
        return str == null ? "" : str;
    }

    public String getCommentTextImageBgColor() {
        String str = this.commentTextImageBgColor;
        return str == null ? "#FFFFFF" : str;
    }

    public String getDuration() {
        return this.duration;
    }

    public String getExtra() {
        return this.extra;
    }

    public KeyDescObj getExtra_tag() {
        return this.extra_tag;
    }

    public PictureLinkContentTagObj getExtra_tag_v2() {
        return this.extra_tag_v2;
    }

    public List<GameObj> getGames() {
        return this.games;
    }

    public String getHeight() {
        return this.height;
    }

    public String getImage() {
        return this.image;
    }

    public Draft getImageEditDraft() {
        return this.imageEditDraft;
    }

    public KeyDescObj getPost_guide_card() {
        return this.post_guide_card;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public SourceInfoObj getSource_info() {
        return this.source_info;
    }

    public String getText() {
        return this.text;
    }

    public LinkToolCardObj getTool_card() {
        return this.tool_card;
    }

    public String getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUsername() {
        return this.username;
    }

    public String getVideo_thumb() {
        return this.video_thumb;
    }

    public String getWidth() {
        return this.width;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public void setApp_info(GameObj gameObj) {
        this.app_info = gameObj;
    }

    public void setAppid(String str) {
        this.appid = str;
    }

    public void setChecked(boolean z10) {
        this.checked = z10;
    }

    public void setCommentText(String str) {
        this.commentText = str;
    }

    public void setCommentTextImageBgColor(String str) {
        this.commentTextImageBgColor = str;
    }

    public void setDuration(String str) {
        this.duration = str;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setExtra_tag(KeyDescObj keyDescObj) {
        this.extra_tag = keyDescObj;
    }

    public void setExtra_tag_v2(PictureLinkContentTagObj pictureLinkContentTagObj) {
        this.extra_tag_v2 = pictureLinkContentTagObj;
    }

    public void setGames(List<GameObj> list) {
        this.games = list;
    }

    public void setHeight(String str) {
        this.height = str;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setImageEditDraft(Draft draft) {
        this.imageEditDraft = draft;
    }

    public void setPost_guide_card(KeyDescObj keyDescObj) {
        this.post_guide_card = keyDescObj;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setSource_info(SourceInfoObj sourceInfoObj) {
        this.source_info = sourceInfoObj;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTool_card(LinkToolCardObj linkToolCardObj) {
        this.tool_card = linkToolCardObj;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setUsername(String str) {
        this.username = str;
    }

    public void setVideo_thumb(String str) {
        this.video_thumb = str;
    }

    public void setWidth(String str) {
        this.width = str;
    }

    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14192, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "BBSTextObj{url='" + this.url + "', text='" + this.text + "', type='" + this.type + "'}";
    }
}
