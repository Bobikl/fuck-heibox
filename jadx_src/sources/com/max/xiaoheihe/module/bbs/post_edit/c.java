package com.max.xiaoheihe.module.bbs.post_edit;

import android.content.Context;
import com.google.gson.Gson;
import com.max.xiaoheihe.bean.bbs.BBSTextObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.ConceptPostTagObj;
import com.max.xiaoheihe.bean.bbs.LinkImageObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.bbs.PictureVideoLinkDraftObj;
import com.max.xiaoheihe.bean.bbs.PostSettingObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: EditCommentPost.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.jvm.internal.t0({"SMAP\nEditCommentPost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditCommentPost.kt\ncom/max/xiaoheihe/module/bbs/post_edit/EditCommentPostKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1855#2,2:154\n*S KotlinDebug\n*F\n+ 1 EditCommentPost.kt\ncom/max/xiaoheihe/module/bbs/post_edit/EditCommentPostKt\n*L\n117#1:154,2\n*E\n"})
public final class c {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void a(@dl.d Context context, @dl.d String commentText) {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[]{context, commentText}, null, changeQuickRedirect, true, 29641, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(commentText, "commentText");
        List listL = CollectionsKt__CollectionsKt.L(new g("text", "给我呼呼呼呼呼呼", null, false, null, null, null, 116, null), new g(SocialConstants.PARAM_IMG_URL, null, null, false, com.max.xiaoheihe.module.account.mine.l.f79081d, com.max.xiaoheihe.module.account.mine.l.f79081d, commentText, 6, null), new g(SocialConstants.PARAM_IMG_URL, null, "https://imgheybox1.max-c.com/bbs/2023/10/23/0c4d7975543cfd488bf4dc270167410b/thumb.jpeg?imageMogr2/auto-orient/ignore-error/1/format/webp/thumbnail/850x1450%3E", false, "544", "544", null, 66, null), new g(SocialConstants.PARAM_IMG_URL, null, "https://imgheybox1.max-c.com/bbs/2023/10/23/425c0ca277cea8ba4d80eb5c30e0184a/thumb.jpeg?imageMogr2/auto-orient/ignore-error/1/format/webp/thumbnail/850x1450%3E", false, "544", "544", null, 66, null));
        LinkInfoObj linkInfoObj = new LinkInfoObj();
        linkInfoObj.setComment_num("0");
        linkInfoObj.setClick("0");
        linkInfoObj.setCreate_at(String.valueOf(System.currentTimeMillis()));
        linkInfoObj.setHas_video("0");
        linkInfoObj.setIs_article("0");
        linkInfoObj.setIs_award_link("0");
        linkInfoObj.setIs_favour("0");
        linkInfoObj.setIs_hot_post("0");
        linkInfoObj.setIs_support("0");
        linkInfoObj.setIs_web("1");
        linkInfoObj.setLink_award_num("0");
        linkInfoObj.setLink_tag("28");
        linkInfoObj.setModify_at(String.valueOf(System.currentTimeMillis()));
        linkInfoObj.setShare_url("https://api.xiaoheihe.cn/v3/bbs/app/api/web/share?link_id=110960945");
        linkInfoObj.setTitle("特使");
        linkInfoObj.setLinkid("110960945");
        linkInfoObj.setUserid("1");
        BBSUserInfoObj bBSUserInfoObj = new BBSUserInfoObj();
        bBSUserInfoObj.setAvartar("https://imgheybox.max-c.com/avatar/2023/11/02/60bb4e3ac88188d2b95d414923500858.jpeg");
        bBSUserInfoObj.setAvatar("https://imgheybox.max-c.com/avatar/2023/11/02/60bb4e3ac88188d2b95d414923500858.jpeg");
        bBSUserInfoObj.setUserid("57427669");
        bBSUserInfoObj.setUsername("玩家57427669");
        linkInfoObj.setUser(bBSUserInfoObj);
        linkInfoObj.setText(new Gson().toJson(listL));
        linkInfoObj.setVersion("1");
        linkInfoObj.setView_limit("1");
        linkInfoObj.setUse_concept_type("1");
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        List<BBSTextObj> listB = com.max.hbutils.utils.k.b(linkInfoObj.getText(), BBSTextObj.class);
        kotlin.jvm.internal.f0.o(listB, "deserializeList(linkInfo…, BBSTextObj::class.java)");
        if (!listB.isEmpty()) {
            for (BBSTextObj bBSTextObj : listB) {
                String type = bBSTextObj.getType();
                if (kotlin.jvm.internal.f0.g(type, "text")) {
                    if (sb2.length() > 0) {
                        sb2.append("\n");
                    }
                    sb2.append(bBSTextObj.getText());
                } else if (kotlin.jvm.internal.f0.g(type, SocialConstants.PARAM_IMG_URL)) {
                    bBSTextObj.setCommentTextImageBgColor("#203500");
                    arrayList.add(bBSTextObj);
                }
            }
        }
        PictureVideoLinkDraftObj pictureVideoLinkDraftObj = new PictureVideoLinkDraftObj();
        ArrayList<ConceptPostTagObj> hashtags = linkInfoObj.getHashtags();
        if (hashtags != null) {
            kotlin.jvm.internal.f0.o(hashtags, "hashtags");
            if (!hashtags.isEmpty()) {
                for (ConceptPostTagObj conceptPostTagObj : hashtags) {
                    List<String> hashtagList = pictureVideoLinkDraftObj.getHashtagList();
                    if (hashtagList != null) {
                        String name = conceptPostTagObj.getName();
                        if (name == null) {
                            name = "";
                        }
                        hashtagList.add(name);
                    }
                }
            }
        }
        pictureVideoLinkDraftObj.setContent(sb2.toString());
        pictureVideoLinkDraftObj.setTitle(linkInfoObj.getTitle());
        pictureVideoLinkDraftObj.setLink_id(linkInfoObj.getLinkid());
        List<BBSTextObj> imgPathList = pictureVideoLinkDraftObj.getImgPathList();
        if (imgPathList != null) {
            imgPathList.addAll(arrayList);
        }
        pictureVideoLinkDraftObj.setCheckedTopics(linkInfoObj.getTopics());
        pictureVideoLinkDraftObj.setVideo_local_path(linkInfoObj.getVideo_local_path());
        pictureVideoLinkDraftObj.setVideo_thumb(linkInfoObj.getVideo_thumb());
        pictureVideoLinkDraftObj.setVideo_url(linkInfoObj.getVideo_url());
        pictureVideoLinkDraftObj.setVideo_duration(linkInfoObj.getVideo_duration());
        PostSettingObj postSettingObj = new PostSettingObj(false, null, null, null, null, null, null, null, null, null, false, 0L, 4095, null);
        postSettingObj.setView_limit(linkInfoObj.getView_limit());
        postSettingObj.setHeadLine(com.max.hbcommon.utils.c.x(linkInfoObj.getIs_article()));
        String thumb = linkInfoObj.getThumb();
        if (thumb != null) {
            kotlin.jvm.internal.f0.o(thumb, "thumb");
            if (thumb.length() > 0) {
                z10 = true;
            }
        }
        if (z10) {
            LinkImageObj linkImageObj = new LinkImageObj();
            linkImageObj.setUrl(linkInfoObj.getThumb());
            postSettingObj.setThumbImageObj(linkImageObj);
        }
        pictureVideoLinkDraftObj.setPostSettingObj(postSettingObj);
        PictureVideoEditPostActivity.O1(context, null, pictureVideoLinkDraftObj, PictureVideoEditPostFragment.Y3, null, null, PictureVideoEditPostFragment.POST_EDIT_TYPE.POST_PICTURE, "");
    }
}
