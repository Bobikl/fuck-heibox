package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.bbs.post.utils.PostUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.open.SocialConstants;
import dl.d;
import dl.e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: AutoSavaDataObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public abstract class PostEditAutoSaveData {
    public static final int $stable = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: AutoSavaDataObj.kt */
    @o(parameters = 0)
    public static final class ArticleLinkAutoSaveData extends PostEditAutoSaveData {
        public static final int $stable = 8;
        public static ChangeQuickRedirect changeQuickRedirect;

        @e
        private String contentFirstImgPath;

        @e
        private String games;

        @e
        private LinkDraftObj linkDraftObj;

        @e
        private String linkTag;

        @e
        private Integer pageType;

        @e
        private final KeyDescObj selectedPostPlan;

        public ArticleLinkAutoSaveData(@e LinkDraftObj linkDraftObj, @e String str, @e Integer num, @e String str2, @e String str3, @e KeyDescObj keyDescObj) {
            super(null);
            this.linkDraftObj = linkDraftObj;
            this.contentFirstImgPath = str;
            this.pageType = num;
            this.games = str2;
            this.linkTag = str3;
            this.selectedPostPlan = keyDescObj;
        }

        private final boolean checkContentEmpty(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14381, new Class[]{String.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (!(str == null || str.length() == 0)) {
                String strE = k.e(str, "content");
                String strE2 = k.e(str, SocialConstants.PARAM_APP_DESC);
                String strE3 = k.e(str, "text");
                String strE4 = k.e(str, "title");
                if (strE == null || strE.length() == 0) {
                    if (strE2 == null || strE2.length() == 0) {
                        if (strE3 == null || strE3.length() == 0) {
                            if (!(strE4 == null || strE4.length() == 0)) {
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ArticleLinkAutoSaveData copy$default(ArticleLinkAutoSaveData articleLinkAutoSaveData, LinkDraftObj linkDraftObj, String str, Integer num, String str2, String str3, KeyDescObj keyDescObj, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{articleLinkAutoSaveData, linkDraftObj, str, num, str2, str3, keyDescObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 14383, new Class[]{ArticleLinkAutoSaveData.class, LinkDraftObj.class, String.class, Integer.class, String.class, String.class, KeyDescObj.class, Integer.TYPE, Object.class}, ArticleLinkAutoSaveData.class);
            if (patchProxyResultProxy.isSupported) {
                return (ArticleLinkAutoSaveData) patchProxyResultProxy.result;
            }
            return articleLinkAutoSaveData.copy((i10 & 1) != 0 ? articleLinkAutoSaveData.linkDraftObj : linkDraftObj, (i10 & 2) != 0 ? articleLinkAutoSaveData.contentFirstImgPath : str, (i10 & 4) != 0 ? articleLinkAutoSaveData.pageType : num, (i10 & 8) != 0 ? articleLinkAutoSaveData.games : str2, (i10 & 16) != 0 ? articleLinkAutoSaveData.linkTag : str3, (i10 & 32) != 0 ? articleLinkAutoSaveData.selectedPostPlan : keyDescObj);
        }

        @Override // com.max.xiaoheihe.bean.bbs.PostEditAutoSaveData
        public boolean checkIsEmpty() {
            KeyDescObj keyDescObj;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14380, new Class[0], Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            String str = this.games;
            if (str == null || str.length() == 0) {
                String str2 = this.contentFirstImgPath;
                if (str2 == null || str2.length() == 0) {
                    PostUtils.Companion companion = PostUtils.f81983a;
                    Integer num = this.pageType;
                    if (companion.k(num != null ? num.intValue() : 0) && (keyDescObj = this.selectedPostPlan) != null && keyDescObj.isChecked()) {
                        return false;
                    }
                    LinkDraftObj linkDraftObj = this.linkDraftObj;
                    if (linkDraftObj != null) {
                        String title = linkDraftObj.getTitle();
                        if ((title == null || title.length() == 0) && checkContentEmpty(linkDraftObj.getContent())) {
                            List<BBSTopicObj> checkedTopics = linkDraftObj.getCheckedTopics();
                            if (checkedTopics == null || checkedTopics.isEmpty()) {
                                List<String> checkedHashTags = linkDraftObj.getCheckedHashTags();
                                if (checkedHashTags == null || checkedHashTags.isEmpty()) {
                                    String article_type = linkDraftObj.getArticle_type();
                                    if (article_type == null || article_type.length() == 0) {
                                        String article_auth = linkDraftObj.getArticle_auth();
                                        if ((article_auth == null || article_auth.length() == 0) && linkDraftObj.getArticle_img() == null) {
                                            String article_reference = linkDraftObj.getArticle_reference();
                                            if (article_reference == null || article_reference.length() == 0) {
                                                String article_reprint_tips = linkDraftObj.getArticle_reprint_tips();
                                                if (article_reprint_tips == null || article_reprint_tips.length() == 0) {
                                                    Map<String, String> extraParam = linkDraftObj.getExtraParam();
                                                    if ((extraParam == null || extraParam.isEmpty()) && linkDraftObj.getPost_plan() == null) {
                                                        String link_id = linkDraftObj.getLink_id();
                                                        if (!(link_id == null || link_id.length() == 0)) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }

        @e
        public final LinkDraftObj component1() {
            return this.linkDraftObj;
        }

        @e
        public final String component2() {
            return this.contentFirstImgPath;
        }

        @e
        public final Integer component3() {
            return this.pageType;
        }

        @e
        public final String component4() {
            return this.games;
        }

        @e
        public final String component5() {
            return this.linkTag;
        }

        @e
        public final KeyDescObj component6() {
            return this.selectedPostPlan;
        }

        @d
        public final ArticleLinkAutoSaveData copy(@e LinkDraftObj linkDraftObj, @e String str, @e Integer num, @e String str2, @e String str3, @e KeyDescObj keyDescObj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{linkDraftObj, str, num, str2, str3, keyDescObj}, this, changeQuickRedirect, false, 14382, new Class[]{LinkDraftObj.class, String.class, Integer.class, String.class, String.class, KeyDescObj.class}, ArticleLinkAutoSaveData.class);
            return patchProxyResultProxy.isSupported ? (ArticleLinkAutoSaveData) patchProxyResultProxy.result : new ArticleLinkAutoSaveData(linkDraftObj, str, num, str2, str3, keyDescObj);
        }

        public boolean equals(@e Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14386, new Class[]{Object.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArticleLinkAutoSaveData)) {
                return false;
            }
            ArticleLinkAutoSaveData articleLinkAutoSaveData = (ArticleLinkAutoSaveData) obj;
            return f0.g(this.linkDraftObj, articleLinkAutoSaveData.linkDraftObj) && f0.g(this.contentFirstImgPath, articleLinkAutoSaveData.contentFirstImgPath) && f0.g(this.pageType, articleLinkAutoSaveData.pageType) && f0.g(this.games, articleLinkAutoSaveData.games) && f0.g(this.linkTag, articleLinkAutoSaveData.linkTag) && f0.g(this.selectedPostPlan, articleLinkAutoSaveData.selectedPostPlan);
        }

        @e
        public final String getContentFirstImgPath() {
            return this.contentFirstImgPath;
        }

        @e
        public final String getGames() {
            return this.games;
        }

        @e
        public final LinkDraftObj getLinkDraftObj() {
            return this.linkDraftObj;
        }

        @e
        public final String getLinkTag() {
            return this.linkTag;
        }

        @e
        public final Integer getPageType() {
            return this.pageType;
        }

        @e
        public final KeyDescObj getSelectedPostPlan() {
            return this.selectedPostPlan;
        }

        public int hashCode() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14385, new Class[0], Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            LinkDraftObj linkDraftObj = this.linkDraftObj;
            int iHashCode = (linkDraftObj == null ? 0 : linkDraftObj.hashCode()) * 31;
            String str = this.contentFirstImgPath;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.pageType;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.games;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.linkTag;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            KeyDescObj keyDescObj = this.selectedPostPlan;
            return iHashCode5 + (keyDescObj != null ? keyDescObj.hashCode() : 0);
        }

        public final void setContentFirstImgPath(@e String str) {
            this.contentFirstImgPath = str;
        }

        public final void setGames(@e String str) {
            this.games = str;
        }

        public final void setLinkDraftObj(@e LinkDraftObj linkDraftObj) {
            this.linkDraftObj = linkDraftObj;
        }

        public final void setLinkTag(@e String str) {
            this.linkTag = str;
        }

        public final void setPageType(@e Integer num) {
            this.pageType = num;
        }

        @d
        public String toString() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14384, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            return "ArticleLinkAutoSaveData(linkDraftObj=" + this.linkDraftObj + ", contentFirstImgPath=" + this.contentFirstImgPath + ", pageType=" + this.pageType + ", games=" + this.games + ", linkTag=" + this.linkTag + ", selectedPostPlan=" + this.selectedPostPlan + ')';
        }
    }

    /* JADX INFO: compiled from: AutoSavaDataObj.kt */
    @o(parameters = 0)
    public static final class PicVideoLinkAutoSaveData extends PostEditAutoSaveData {
        public static final int $stable = 8;
        public static ChangeQuickRedirect changeQuickRedirect;

        @e
        private final HashMap<String, String> extraParams;

        @e
        private PictureVideoLinkDraftObj pictureVideoLinkDraftObj;

        @e
        private PostDataObj postDataObj;

        public PicVideoLinkAutoSaveData(@e PictureVideoLinkDraftObj pictureVideoLinkDraftObj, @e PostDataObj postDataObj, @e HashMap<String, String> map) {
            super(null);
            this.pictureVideoLinkDraftObj = pictureVideoLinkDraftObj;
            this.postDataObj = postDataObj;
            this.extraParams = map;
        }

        public static /* synthetic */ PicVideoLinkAutoSaveData copy$default(PicVideoLinkAutoSaveData picVideoLinkAutoSaveData, PictureVideoLinkDraftObj pictureVideoLinkDraftObj, PostDataObj postDataObj, HashMap map, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{picVideoLinkAutoSaveData, pictureVideoLinkDraftObj, postDataObj, map, new Integer(i10), obj}, null, changeQuickRedirect, true, 14389, new Class[]{PicVideoLinkAutoSaveData.class, PictureVideoLinkDraftObj.class, PostDataObj.class, HashMap.class, Integer.TYPE, Object.class}, PicVideoLinkAutoSaveData.class);
            if (patchProxyResultProxy.isSupported) {
                return (PicVideoLinkAutoSaveData) patchProxyResultProxy.result;
            }
            if ((i10 & 1) != 0) {
                pictureVideoLinkDraftObj = picVideoLinkAutoSaveData.pictureVideoLinkDraftObj;
            }
            if ((i10 & 2) != 0) {
                postDataObj = picVideoLinkAutoSaveData.postDataObj;
            }
            if ((i10 & 4) != 0) {
                map = picVideoLinkAutoSaveData.extraParams;
            }
            return picVideoLinkAutoSaveData.copy(pictureVideoLinkDraftObj, postDataObj, map);
        }

        @Override // com.max.xiaoheihe.bean.bbs.PostEditAutoSaveData
        public boolean checkIsEmpty() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14387, new Class[0], Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            PictureVideoLinkDraftObj pictureVideoLinkDraftObj = this.pictureVideoLinkDraftObj;
            if (pictureVideoLinkDraftObj == null) {
                return true;
            }
            String title = pictureVideoLinkDraftObj.getTitle();
            if (!(title == null || title.length() == 0)) {
                return false;
            }
            String content = pictureVideoLinkDraftObj.getContent();
            if (!(content == null || content.length() == 0)) {
                return false;
            }
            String link_id = pictureVideoLinkDraftObj.getLink_id();
            if (!(link_id == null || link_id.length() == 0)) {
                return false;
            }
            List<BBSTextObj> imgPathList = pictureVideoLinkDraftObj.getImgPathList();
            if (!(imgPathList == null || imgPathList.isEmpty())) {
                return false;
            }
            List<GameObj> gameList = pictureVideoLinkDraftObj.getGameList();
            if (!(gameList == null || gameList.isEmpty())) {
                return false;
            }
            List<String> hashtagList = pictureVideoLinkDraftObj.getHashtagList();
            if (hashtagList == null || hashtagList.isEmpty()) {
                List<BBSTopicObj> checkedTopics = pictureVideoLinkDraftObj.getCheckedTopics();
                if (checkedTopics == null || checkedTopics.isEmpty()) {
                    List<LinkToolCardObj> post_tool_cards = pictureVideoLinkDraftObj.getPost_tool_cards();
                    if (!(post_tool_cards == null || post_tool_cards.isEmpty())) {
                        return false;
                    }
                    String video_url = pictureVideoLinkDraftObj.getVideo_url();
                    if (video_url == null || video_url.length() == 0) {
                        String video_local_path = pictureVideoLinkDraftObj.getVideo_local_path();
                        if (video_local_path == null || video_local_path.length() == 0) {
                            String video_thumb = pictureVideoLinkDraftObj.getVideo_thumb();
                            if (!(video_thumb == null || video_thumb.length() == 0) || pictureVideoLinkDraftObj.getHighLikeComment() != null) {
                                return false;
                            }
                            PostSettingObj postSettingObj = pictureVideoLinkDraftObj.getPostSettingObj();
                            if (postSettingObj != null) {
                                if (postSettingObj.getHeadLine()) {
                                    return false;
                                }
                                String view_limit = postSettingObj.getView_limit();
                                if (!(view_limit == null || view_limit.length() == 0)) {
                                    return false;
                                }
                            }
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        @e
        public final PictureVideoLinkDraftObj component1() {
            return this.pictureVideoLinkDraftObj;
        }

        @e
        public final PostDataObj component2() {
            return this.postDataObj;
        }

        @e
        public final HashMap<String, String> component3() {
            return this.extraParams;
        }

        @d
        public final PicVideoLinkAutoSaveData copy(@e PictureVideoLinkDraftObj pictureVideoLinkDraftObj, @e PostDataObj postDataObj, @e HashMap<String, String> map) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pictureVideoLinkDraftObj, postDataObj, map}, this, changeQuickRedirect, false, 14388, new Class[]{PictureVideoLinkDraftObj.class, PostDataObj.class, HashMap.class}, PicVideoLinkAutoSaveData.class);
            return patchProxyResultProxy.isSupported ? (PicVideoLinkAutoSaveData) patchProxyResultProxy.result : new PicVideoLinkAutoSaveData(pictureVideoLinkDraftObj, postDataObj, map);
        }

        public boolean equals(@e Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14392, new Class[]{Object.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PicVideoLinkAutoSaveData)) {
                return false;
            }
            PicVideoLinkAutoSaveData picVideoLinkAutoSaveData = (PicVideoLinkAutoSaveData) obj;
            return f0.g(this.pictureVideoLinkDraftObj, picVideoLinkAutoSaveData.pictureVideoLinkDraftObj) && f0.g(this.postDataObj, picVideoLinkAutoSaveData.postDataObj) && f0.g(this.extraParams, picVideoLinkAutoSaveData.extraParams);
        }

        @e
        public final HashMap<String, String> getExtraParams() {
            return this.extraParams;
        }

        @e
        public final PictureVideoLinkDraftObj getPictureVideoLinkDraftObj() {
            return this.pictureVideoLinkDraftObj;
        }

        @e
        public final PostDataObj getPostDataObj() {
            return this.postDataObj;
        }

        public int hashCode() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14391, new Class[0], Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            PictureVideoLinkDraftObj pictureVideoLinkDraftObj = this.pictureVideoLinkDraftObj;
            int iHashCode = (pictureVideoLinkDraftObj == null ? 0 : pictureVideoLinkDraftObj.hashCode()) * 31;
            PostDataObj postDataObj = this.postDataObj;
            int iHashCode2 = (iHashCode + (postDataObj == null ? 0 : postDataObj.hashCode())) * 31;
            HashMap<String, String> map = this.extraParams;
            return iHashCode2 + (map != null ? map.hashCode() : 0);
        }

        public final void setPictureVideoLinkDraftObj(@e PictureVideoLinkDraftObj pictureVideoLinkDraftObj) {
            this.pictureVideoLinkDraftObj = pictureVideoLinkDraftObj;
        }

        public final void setPostDataObj(@e PostDataObj postDataObj) {
            this.postDataObj = postDataObj;
        }

        @d
        public String toString() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14390, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            return "PicVideoLinkAutoSaveData(pictureVideoLinkDraftObj=" + this.pictureVideoLinkDraftObj + ", postDataObj=" + this.postDataObj + ", extraParams=" + this.extraParams + ')';
        }
    }

    private PostEditAutoSaveData() {
    }

    public /* synthetic */ PostEditAutoSaveData(u uVar) {
        this();
    }

    public abstract boolean checkIsEmpty();
}
