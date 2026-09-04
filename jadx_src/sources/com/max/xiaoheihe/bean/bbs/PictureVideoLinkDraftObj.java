package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.bbs.post_edit.PostCompilationItemObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: PictureVideoLinkDraftObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PictureVideoLinkDraftObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private Boolean can_modify_post_plan;

    @e
    private List<BBSTopicObj> checkedTopics;

    @e
    private String content;

    @e
    private String default_content;

    @e
    private List<GameObj> gameList;

    @e
    private List<String> hashtagList;

    @e
    private HighLikeCommentObj highLikeComment;

    @e
    private List<BBSTextObj> imgPathList;

    @e
    private String link_id;

    @e
    private String originCompilationId;

    @e
    private PostSettingObj postSettingObj;

    @e
    private List<LinkToolCardObj> post_tool_cards;

    @e
    private PostCompilationItemObj selectedDraftCompilation;

    @e
    private String title;

    @e
    private String video_duration;

    @e
    private String video_local_path;

    @e
    private String video_thumb;

    @e
    private String video_url;

    public PictureVideoLinkDraftObj() {
        this(null, null, null, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), null, null, null, null, null, null, null, null, null, null, 258048, null);
    }

    public PictureVideoLinkDraftObj(@e String str, @e String str2, @e String str3, @e List<BBSTextObj> list, @e List<GameObj> list2, @e List<String> list3, @e List<BBSTopicObj> list4, @e List<LinkToolCardObj> list5, @e String str4, @e String str5, @e String str6, @e String str7, @e PostSettingObj postSettingObj, @e String str8, @e HighLikeCommentObj highLikeCommentObj, @e Boolean bool, @e String str9, @e PostCompilationItemObj postCompilationItemObj) {
        this.title = str;
        this.content = str2;
        this.link_id = str3;
        this.imgPathList = list;
        this.gameList = list2;
        this.hashtagList = list3;
        this.checkedTopics = list4;
        this.post_tool_cards = list5;
        this.video_url = str4;
        this.video_duration = str5;
        this.video_local_path = str6;
        this.video_thumb = str7;
        this.postSettingObj = postSettingObj;
        this.default_content = str8;
        this.highLikeComment = highLikeCommentObj;
        this.can_modify_post_plan = bool;
        this.originCompilationId = str9;
        this.selectedDraftCompilation = postCompilationItemObj;
    }

    public /* synthetic */ PictureVideoLinkDraftObj(String str, String str2, String str3, List list, List list2, List list3, List list4, List list5, String str4, String str5, String str6, String str7, PostSettingObj postSettingObj, String str8, HighLikeCommentObj highLikeCommentObj, Boolean bool, String str9, PostCompilationItemObj postCompilationItemObj, int i10, u uVar) {
        this(str, str2, str3, list, list2, list3, list4, (i10 & 128) != 0 ? new ArrayList() : list5, (i10 & 256) != 0 ? null : str4, (i10 & 512) != 0 ? null : str5, (i10 & 1024) != 0 ? null : str6, (i10 & 2048) != 0 ? null : str7, (i10 & 4096) != 0 ? null : postSettingObj, (i10 & 8192) != 0 ? null : str8, (i10 & 16384) != 0 ? null : highLikeCommentObj, (32768 & i10) != 0 ? Boolean.FALSE : bool, (65536 & i10) != 0 ? null : str9, (i10 & 131072) != 0 ? null : postCompilationItemObj);
    }

    public static /* synthetic */ PictureVideoLinkDraftObj copy$default(PictureVideoLinkDraftObj pictureVideoLinkDraftObj, String str, String str2, String str3, List list, List list2, List list3, List list4, List list5, String str4, String str5, String str6, String str7, PostSettingObj postSettingObj, String str8, HighLikeCommentObj highLikeCommentObj, Boolean bool, String str9, PostCompilationItemObj postCompilationItemObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pictureVideoLinkDraftObj, str, str2, str3, list, list2, list3, list4, list5, str4, str5, str6, str7, postSettingObj, str8, highLikeCommentObj, bool, str9, postCompilationItemObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 14356, new Class[]{PictureVideoLinkDraftObj.class, String.class, String.class, String.class, List.class, List.class, List.class, List.class, List.class, String.class, String.class, String.class, String.class, PostSettingObj.class, String.class, HighLikeCommentObj.class, Boolean.class, String.class, PostCompilationItemObj.class, Integer.TYPE, Object.class}, PictureVideoLinkDraftObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PictureVideoLinkDraftObj) patchProxyResultProxy.result;
        }
        return pictureVideoLinkDraftObj.copy((i10 & 1) != 0 ? pictureVideoLinkDraftObj.title : str, (i10 & 2) != 0 ? pictureVideoLinkDraftObj.content : str2, (i10 & 4) != 0 ? pictureVideoLinkDraftObj.link_id : str3, (i10 & 8) != 0 ? pictureVideoLinkDraftObj.imgPathList : list, (i10 & 16) != 0 ? pictureVideoLinkDraftObj.gameList : list2, (i10 & 32) != 0 ? pictureVideoLinkDraftObj.hashtagList : list3, (i10 & 64) != 0 ? pictureVideoLinkDraftObj.checkedTopics : list4, (i10 & 128) != 0 ? pictureVideoLinkDraftObj.post_tool_cards : list5, (i10 & 256) != 0 ? pictureVideoLinkDraftObj.video_url : str4, (i10 & 512) != 0 ? pictureVideoLinkDraftObj.video_duration : str5, (i10 & 1024) != 0 ? pictureVideoLinkDraftObj.video_local_path : str6, (i10 & 2048) != 0 ? pictureVideoLinkDraftObj.video_thumb : str7, (i10 & 4096) != 0 ? pictureVideoLinkDraftObj.postSettingObj : postSettingObj, (i10 & 8192) != 0 ? pictureVideoLinkDraftObj.default_content : str8, (i10 & 16384) != 0 ? pictureVideoLinkDraftObj.highLikeComment : highLikeCommentObj, (i10 & 32768) != 0 ? pictureVideoLinkDraftObj.can_modify_post_plan : bool, (i10 & 65536) != 0 ? pictureVideoLinkDraftObj.originCompilationId : str9, (i10 & 131072) != 0 ? pictureVideoLinkDraftObj.selectedDraftCompilation : postCompilationItemObj);
    }

    @e
    public final String component1() {
        return this.title;
    }

    @e
    public final String component10() {
        return this.video_duration;
    }

    @e
    public final String component11() {
        return this.video_local_path;
    }

    @e
    public final String component12() {
        return this.video_thumb;
    }

    @e
    public final PostSettingObj component13() {
        return this.postSettingObj;
    }

    @e
    public final String component14() {
        return this.default_content;
    }

    @e
    public final HighLikeCommentObj component15() {
        return this.highLikeComment;
    }

    @e
    public final Boolean component16() {
        return this.can_modify_post_plan;
    }

    @e
    public final String component17() {
        return this.originCompilationId;
    }

    @e
    public final PostCompilationItemObj component18() {
        return this.selectedDraftCompilation;
    }

    @e
    public final String component2() {
        return this.content;
    }

    @e
    public final String component3() {
        return this.link_id;
    }

    @e
    public final List<BBSTextObj> component4() {
        return this.imgPathList;
    }

    @e
    public final List<GameObj> component5() {
        return this.gameList;
    }

    @e
    public final List<String> component6() {
        return this.hashtagList;
    }

    @e
    public final List<BBSTopicObj> component7() {
        return this.checkedTopics;
    }

    @e
    public final List<LinkToolCardObj> component8() {
        return this.post_tool_cards;
    }

    @e
    public final String component9() {
        return this.video_url;
    }

    @d
    public final PictureVideoLinkDraftObj copy(@e String str, @e String str2, @e String str3, @e List<BBSTextObj> list, @e List<GameObj> list2, @e List<String> list3, @e List<BBSTopicObj> list4, @e List<LinkToolCardObj> list5, @e String str4, @e String str5, @e String str6, @e String str7, @e PostSettingObj postSettingObj, @e String str8, @e HighLikeCommentObj highLikeCommentObj, @e Boolean bool, @e String str9, @e PostCompilationItemObj postCompilationItemObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, list, list2, list3, list4, list5, str4, str5, str6, str7, postSettingObj, str8, highLikeCommentObj, bool, str9, postCompilationItemObj}, this, changeQuickRedirect, false, 14355, new Class[]{String.class, String.class, String.class, List.class, List.class, List.class, List.class, List.class, String.class, String.class, String.class, String.class, PostSettingObj.class, String.class, HighLikeCommentObj.class, Boolean.class, String.class, PostCompilationItemObj.class}, PictureVideoLinkDraftObj.class);
        return patchProxyResultProxy.isSupported ? (PictureVideoLinkDraftObj) patchProxyResultProxy.result : new PictureVideoLinkDraftObj(str, str2, str3, list, list2, list3, list4, list5, str4, str5, str6, str7, postSettingObj, str8, highLikeCommentObj, bool, str9, postCompilationItemObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14359, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PictureVideoLinkDraftObj)) {
            return false;
        }
        PictureVideoLinkDraftObj pictureVideoLinkDraftObj = (PictureVideoLinkDraftObj) obj;
        return f0.g(this.title, pictureVideoLinkDraftObj.title) && f0.g(this.content, pictureVideoLinkDraftObj.content) && f0.g(this.link_id, pictureVideoLinkDraftObj.link_id) && f0.g(this.imgPathList, pictureVideoLinkDraftObj.imgPathList) && f0.g(this.gameList, pictureVideoLinkDraftObj.gameList) && f0.g(this.hashtagList, pictureVideoLinkDraftObj.hashtagList) && f0.g(this.checkedTopics, pictureVideoLinkDraftObj.checkedTopics) && f0.g(this.post_tool_cards, pictureVideoLinkDraftObj.post_tool_cards) && f0.g(this.video_url, pictureVideoLinkDraftObj.video_url) && f0.g(this.video_duration, pictureVideoLinkDraftObj.video_duration) && f0.g(this.video_local_path, pictureVideoLinkDraftObj.video_local_path) && f0.g(this.video_thumb, pictureVideoLinkDraftObj.video_thumb) && f0.g(this.postSettingObj, pictureVideoLinkDraftObj.postSettingObj) && f0.g(this.default_content, pictureVideoLinkDraftObj.default_content) && f0.g(this.highLikeComment, pictureVideoLinkDraftObj.highLikeComment) && f0.g(this.can_modify_post_plan, pictureVideoLinkDraftObj.can_modify_post_plan) && f0.g(this.originCompilationId, pictureVideoLinkDraftObj.originCompilationId) && f0.g(this.selectedDraftCompilation, pictureVideoLinkDraftObj.selectedDraftCompilation);
    }

    @e
    public final Boolean getCan_modify_post_plan() {
        return this.can_modify_post_plan;
    }

    @e
    public final List<BBSTopicObj> getCheckedTopics() {
        return this.checkedTopics;
    }

    @e
    public final String getContent() {
        return this.content;
    }

    @e
    public final String getDefault_content() {
        return this.default_content;
    }

    @e
    public final List<GameObj> getGameList() {
        return this.gameList;
    }

    @e
    public final List<String> getHashtagList() {
        return this.hashtagList;
    }

    @e
    public final HighLikeCommentObj getHighLikeComment() {
        return this.highLikeComment;
    }

    @e
    public final List<BBSTextObj> getImgPathList() {
        return this.imgPathList;
    }

    @e
    public final String getLink_id() {
        return this.link_id;
    }

    @e
    public final String getOriginCompilationId() {
        return this.originCompilationId;
    }

    @e
    public final PostSettingObj getPostSettingObj() {
        return this.postSettingObj;
    }

    @e
    public final List<LinkToolCardObj> getPost_tool_cards() {
        return this.post_tool_cards;
    }

    @e
    public final PostCompilationItemObj getSelectedDraftCompilation() {
        return this.selectedDraftCompilation;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    @e
    public final String getVideo_duration() {
        return this.video_duration;
    }

    @e
    public final String getVideo_local_path() {
        return this.video_local_path;
    }

    @e
    public final String getVideo_thumb() {
        return this.video_thumb;
    }

    @e
    public final String getVideo_url() {
        return this.video_url;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14358, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.link_id;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<BBSTextObj> list = this.imgPathList;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<GameObj> list2 = this.gameList;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.hashtagList;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<BBSTopicObj> list4 = this.checkedTopics;
        int iHashCode7 = (iHashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<LinkToolCardObj> list5 = this.post_tool_cards;
        int iHashCode8 = (iHashCode7 + (list5 == null ? 0 : list5.hashCode())) * 31;
        String str4 = this.video_url;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.video_duration;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.video_local_path;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.video_thumb;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        PostSettingObj postSettingObj = this.postSettingObj;
        int iHashCode13 = (iHashCode12 + (postSettingObj == null ? 0 : postSettingObj.hashCode())) * 31;
        String str8 = this.default_content;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        HighLikeCommentObj highLikeCommentObj = this.highLikeComment;
        int iHashCode15 = (iHashCode14 + (highLikeCommentObj == null ? 0 : highLikeCommentObj.hashCode())) * 31;
        Boolean bool = this.can_modify_post_plan;
        int iHashCode16 = (iHashCode15 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str9 = this.originCompilationId;
        int iHashCode17 = (iHashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
        PostCompilationItemObj postCompilationItemObj = this.selectedDraftCompilation;
        return iHashCode17 + (postCompilationItemObj != null ? postCompilationItemObj.hashCode() : 0);
    }

    public final void setCan_modify_post_plan(@e Boolean bool) {
        this.can_modify_post_plan = bool;
    }

    public final void setCheckedTopics(@e List<BBSTopicObj> list) {
        this.checkedTopics = list;
    }

    public final void setContent(@e String str) {
        this.content = str;
    }

    public final void setDefault_content(@e String str) {
        this.default_content = str;
    }

    public final void setGameList(@e List<GameObj> list) {
        this.gameList = list;
    }

    public final void setHashtagList(@e List<String> list) {
        this.hashtagList = list;
    }

    public final void setHighLikeComment(@e HighLikeCommentObj highLikeCommentObj) {
        this.highLikeComment = highLikeCommentObj;
    }

    public final void setImgPathList(@e List<BBSTextObj> list) {
        this.imgPathList = list;
    }

    public final void setLink_id(@e String str) {
        this.link_id = str;
    }

    public final void setOriginCompilationId(@e String str) {
        this.originCompilationId = str;
    }

    public final void setPostSettingObj(@e PostSettingObj postSettingObj) {
        this.postSettingObj = postSettingObj;
    }

    public final void setPost_tool_cards(@e List<LinkToolCardObj> list) {
        this.post_tool_cards = list;
    }

    public final void setSelectedDraftCompilation(@e PostCompilationItemObj postCompilationItemObj) {
        this.selectedDraftCompilation = postCompilationItemObj;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    public final void setVideo_duration(@e String str) {
        this.video_duration = str;
    }

    public final void setVideo_local_path(@e String str) {
        this.video_local_path = str;
    }

    public final void setVideo_thumb(@e String str) {
        this.video_thumb = str;
    }

    public final void setVideo_url(@e String str) {
        this.video_url = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14357, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PictureVideoLinkDraftObj(title=" + this.title + ", content=" + this.content + ", link_id=" + this.link_id + ", imgPathList=" + this.imgPathList + ", gameList=" + this.gameList + ", hashtagList=" + this.hashtagList + ", checkedTopics=" + this.checkedTopics + ", post_tool_cards=" + this.post_tool_cards + ", video_url=" + this.video_url + ", video_duration=" + this.video_duration + ", video_local_path=" + this.video_local_path + ", video_thumb=" + this.video_thumb + ", postSettingObj=" + this.postSettingObj + ", default_content=" + this.default_content + ", highLikeComment=" + this.highLikeComment + ", can_modify_post_plan=" + this.can_modify_post_plan + ", originCompilationId=" + this.originCompilationId + ", selectedDraftCompilation=" + this.selectedDraftCompilation + ')';
    }
}
