package com.max.xiaoheihe.module.bbs.post_edit.auto_save;

import android.util.Log;
import androidx.annotation.k0;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.bbs.LinkDraftObj;
import com.max.xiaoheihe.bean.bbs.PostEditAutoSaveData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PostEditDataProvider.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class a implements c<PostEditAutoSaveData> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f82906i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f82907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f82908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final String f82909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private final String f82910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final yh.a<Integer> f82911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final yh.a<LinkDraftObj> f82912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final yh.a<String> f82913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final yh.a<KeyDescObj> f82914h;

    /* JADX WARN: Multi-variable type inference failed */
    public a(boolean z10, boolean z11, @dl.e String str, @dl.e String str2, @dl.d yh.a<Integer> onGetPageTypeCallback, @dl.d yh.a<? extends LinkDraftObj> onGetLinkDraftObjCallback, @dl.d yh.a<String> onGetContentFirstImgPath, @dl.d yh.a<? extends KeyDescObj> onGetSelectedPostPlan) {
        f0.p(onGetPageTypeCallback, "onGetPageTypeCallback");
        f0.p(onGetLinkDraftObjCallback, "onGetLinkDraftObjCallback");
        f0.p(onGetContentFirstImgPath, "onGetContentFirstImgPath");
        f0.p(onGetSelectedPostPlan, "onGetSelectedPostPlan");
        this.f82907a = z10;
        this.f82908b = z11;
        this.f82909c = str;
        this.f82910d = str2;
        this.f82911e = onGetPageTypeCallback;
        this.f82912f = onGetLinkDraftObjCallback;
        this.f82913g = onGetContentFirstImgPath;
        this.f82914h = onGetSelectedPostPlan;
    }

    private final boolean f(PostEditAutoSaveData.ArticleLinkAutoSaveData articleLinkAutoSaveData, PostEditAutoSaveData.ArticleLinkAutoSaveData articleLinkAutoSaveData2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{articleLinkAutoSaveData, articleLinkAutoSaveData2}, this, changeQuickRedirect, false, 30859, new Class[]{PostEditAutoSaveData.ArticleLinkAutoSaveData.class, PostEditAutoSaveData.ArticleLinkAutoSaveData.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!f0.g(articleLinkAutoSaveData.getContentFirstImgPath(), articleLinkAutoSaveData2.getContentFirstImgPath()) || !f0.g(articleLinkAutoSaveData.getPageType(), articleLinkAutoSaveData2.getPageType()) || !f0.g(articleLinkAutoSaveData.getGames(), articleLinkAutoSaveData2.getGames()) || !f0.g(articleLinkAutoSaveData.getLinkTag(), articleLinkAutoSaveData2.getLinkTag()) || !f0.g(articleLinkAutoSaveData.getSelectedPostPlan(), articleLinkAutoSaveData2.getSelectedPostPlan())) {
            return true;
        }
        LinkDraftObj linkDraftObj = articleLinkAutoSaveData.getLinkDraftObj();
        LinkDraftObj linkDraftObj2 = articleLinkAutoSaveData2.getLinkDraftObj();
        if (!f0.g(linkDraftObj, linkDraftObj2)) {
            return true;
        }
        if (!f0.g(linkDraftObj != null ? linkDraftObj.getArticle_img() : null, linkDraftObj2 != null ? linkDraftObj2.getArticle_img() : null)) {
            return true;
        }
        if (!f0.g(linkDraftObj != null ? linkDraftObj.getArticle_type() : null, linkDraftObj2 != null ? linkDraftObj2.getArticle_type() : null)) {
            return true;
        }
        if (!f0.g(linkDraftObj != null ? linkDraftObj.getArticle_auth() : null, linkDraftObj2 != null ? linkDraftObj2.getArticle_auth() : null)) {
            return true;
        }
        if (f0.g(linkDraftObj != null ? linkDraftObj.getArticle_reprint_tips() : null, linkDraftObj2 != null ? linkDraftObj2.getArticle_reprint_tips() : null)) {
            return !f0.g(linkDraftObj != null ? linkDraftObj.getArticle_reference() : null, linkDraftObj2 != null ? linkDraftObj2.getArticle_reference() : null);
        }
        return true;
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.auto_save.c
    @dl.d
    public String a() {
        return "Article";
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.auto_save.c
    @k0
    @dl.e
    public PostEditAutoSaveData b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30857, new Class[0], PostEditAutoSaveData.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostEditAutoSaveData) patchProxyResultProxy.result;
        }
        LinkDraftObj linkDraftObjInvoke = this.f82912f.invoke();
        if (linkDraftObjInvoke == null) {
            return null;
        }
        LinkDraftObj linkDraftObjDeepCopyByJson = linkDraftObjInvoke.deepCopyByJson();
        String strInvoke = this.f82913g.invoke();
        int iIntValue = this.f82911e.invoke().intValue();
        KeyDescObj keyDescObjInvoke = this.f82914h.invoke();
        Log.d("ArticlePostEditSaveDataProvider-dbg", "[collectEditData]\ncheckedTopic: " + linkDraftObjDeepCopyByJson.getCheckedTopics() + "\ncontent: " + linkDraftObjDeepCopyByJson.getContent() + "\ngameStr: " + this.f82909c + ", pageType: " + iIntValue + ", imgPath: " + strInvoke + "\nselectedPostPlan: " + keyDescObjInvoke);
        return new PostEditAutoSaveData.ArticleLinkAutoSaveData(linkDraftObjDeepCopyByJson, strInvoke, Integer.valueOf(iIntValue), this.f82909c, this.f82910d, keyDescObjInvoke);
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.auto_save.c
    public boolean c() {
        return this.f82907a;
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.auto_save.c
    public boolean d(@dl.e PostEditAutoSaveData postEditAutoSaveData, @dl.e PostEditAutoSaveData postEditAutoSaveData2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postEditAutoSaveData, postEditAutoSaveData2}, this, changeQuickRedirect, false, 30858, new Class[]{PostEditAutoSaveData.class, PostEditAutoSaveData.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (postEditAutoSaveData == null && postEditAutoSaveData2 == null) {
            return false;
        }
        if (postEditAutoSaveData != null && postEditAutoSaveData2 != null && (postEditAutoSaveData instanceof PostEditAutoSaveData.ArticleLinkAutoSaveData) && (postEditAutoSaveData2 instanceof PostEditAutoSaveData.ArticleLinkAutoSaveData)) {
            return f((PostEditAutoSaveData.ArticleLinkAutoSaveData) postEditAutoSaveData, (PostEditAutoSaveData.ArticleLinkAutoSaveData) postEditAutoSaveData2);
        }
        return true;
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.auto_save.c
    public boolean e() {
        return this.f82908b;
    }
}
