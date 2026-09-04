package com.max.xiaoheihe.bean.bbs;

import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.utils.c;
import com.max.xiaoheihe.bean.bbs.webwithnative.RecommendStateObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSLinkTreeObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 8164675698028158535L;
    private KeyDescObj bottom_toast;
    private String comment_num;
    private List<BBSCommentsObj> comments;
    private BBSCommentsObj current_comment;
    private String cy_control;
    private GameCommentsObj game_comment_share_info;
    private GameObj game_info;
    private String has_more_floors;
    private String is_commented;
    private String like_lottie_key;
    private LinkInfoObj link;
    private String post_comment_auto_filled_text;
    private BBSNoCommentTipObj post_comment_no_more_info;
    private String post_comment_tips;
    private List<KeyDescObj> sort_filter;

    public KeyDescObj getBottom_toast() {
        return this.bottom_toast;
    }

    public String getComment_num() {
        return this.comment_num;
    }

    public List<BBSCommentsObj> getComments() {
        return this.comments;
    }

    public BBSCommentsObj getCurrent_comment() {
        return this.current_comment;
    }

    public String getCy_control() {
        return this.cy_control;
    }

    public GameCommentsObj getGame_comment_share_info() {
        return this.game_comment_share_info;
    }

    public GameObj getGame_info() {
        return this.game_info;
    }

    public String getHas_more_floors() {
        return this.has_more_floors;
    }

    public String getIs_commented() {
        return this.is_commented;
    }

    public String getLike_lottie_key() {
        return this.like_lottie_key;
    }

    public LinkInfoObj getLink() {
        return this.link;
    }

    public List<String> getNoStateIds(List<RecommendStateObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 14183, new Class[]{List.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        if (!c.w(this.comments)) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<RecommendStateObj> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().getUser_id());
            }
            Iterator<BBSCommentsObj> it2 = this.comments.iterator();
            while (it2.hasNext()) {
                try {
                    String userid = it2.next().getComment().get(0).getUser().getUserid();
                    if (!arrayList2.contains(userid) && !arrayList.contains(userid)) {
                        arrayList.add(userid);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return arrayList;
    }

    public String getPost_comment_auto_filled_text() {
        return this.post_comment_auto_filled_text;
    }

    public BBSNoCommentTipObj getPost_comment_no_more_info() {
        return this.post_comment_no_more_info;
    }

    public String getPost_comment_tips() {
        return this.post_comment_tips;
    }

    public List<KeyDescObj> getSort_filter() {
        return this.sort_filter;
    }

    public void setBottom_toast(KeyDescObj keyDescObj) {
        this.bottom_toast = keyDescObj;
    }

    public void setComment_num(String str) {
        this.comment_num = str;
    }

    public void setComments(List<BBSCommentsObj> list) {
        this.comments = list;
    }

    public void setCurrent_comment(BBSCommentsObj bBSCommentsObj) {
        this.current_comment = bBSCommentsObj;
    }

    public void setCy_control(String str) {
        this.cy_control = str;
    }

    public void setGame_comment_share_info(GameCommentsObj gameCommentsObj) {
        this.game_comment_share_info = gameCommentsObj;
    }

    public void setGame_info(GameObj gameObj) {
        this.game_info = gameObj;
    }

    public void setHas_more_floors(String str) {
        this.has_more_floors = str;
    }

    public void setIs_commented(String str) {
        this.is_commented = str;
    }

    public void setLike_lottie_key(String str) {
        this.like_lottie_key = str;
    }

    public void setLink(LinkInfoObj linkInfoObj) {
        this.link = linkInfoObj;
    }

    public void setPost_comment_auto_filled_text(String str) {
        this.post_comment_auto_filled_text = str;
    }

    public void setPost_comment_no_more_info(BBSNoCommentTipObj bBSNoCommentTipObj) {
        this.post_comment_no_more_info = bBSNoCommentTipObj;
    }

    public void setPost_comment_tips(String str) {
        this.post_comment_tips = str;
    }

    public void setSort_filter(List<KeyDescObj> list) {
        this.sort_filter = list;
    }

    public void setStateList(List<RecommendStateObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 14184, new Class[]{List.class}, Void.TYPE).isSupported || c.w(list, this.comments)) {
            return;
        }
        Iterator<BBSCommentsObj> it = this.comments.iterator();
        while (it.hasNext()) {
            try {
                BBSCommentObj bBSCommentObj = it.next().getComment().get(0);
                String userid = bBSCommentObj.getUser().getUserid();
                if (userid != null) {
                    for (RecommendStateObj recommendStateObj : list) {
                        if (userid.equals(recommendStateObj.getUser_id())) {
                            bBSCommentObj.setRecommend_state(recommendStateObj.getState());
                            bBSCommentObj.setDesc_extra(recommendStateObj.getExtra());
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
