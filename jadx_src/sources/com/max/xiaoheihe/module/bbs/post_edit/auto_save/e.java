package com.max.xiaoheihe.module.bbs.post_edit.auto_save;

import android.util.Log;
import androidx.annotation.k0;
import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.bbs.BBSTextObj;
import com.max.xiaoheihe.bean.bbs.PictureVideoLinkDraftObj;
import com.max.xiaoheihe.bean.bbs.PostDataObj;
import com.max.xiaoheihe.bean.bbs.PostEditAutoSaveData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: PostEditDataProvider.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nPostEditDataProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostEditDataProvider.kt\ncom/max/xiaoheihe/module/bbs/post_edit/auto_save/PicVideoPostEditSaveDataProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,196:1\n1855#2,2:197\n*S KotlinDebug\n*F\n+ 1 PostEditDataProvider.kt\ncom/max/xiaoheihe/module/bbs/post_edit/auto_save/PicVideoPostEditSaveDataProvider\n*L\n46#1:197,2\n*E\n"})
@o(parameters = 0)
public final class e implements c<PostEditAutoSaveData> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f82915g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f82916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f82917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final String f82918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private final HashMap<String, String> f82919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final yh.a<PictureVideoLinkDraftObj> f82920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final yh.a<PostDataObj> f82921f;

    public e(boolean z10, boolean z11, @dl.d String postTypEnumName, @dl.e HashMap<String, String> map, @dl.d yh.a<PictureVideoLinkDraftObj> onGetPicVideoLinkDraftObjCallback, @dl.d yh.a<PostDataObj> onGetPostDataObjCallback) {
        f0.p(postTypEnumName, "postTypEnumName");
        f0.p(onGetPicVideoLinkDraftObjCallback, "onGetPicVideoLinkDraftObjCallback");
        f0.p(onGetPostDataObjCallback, "onGetPostDataObjCallback");
        this.f82916a = z10;
        this.f82917b = z11;
        this.f82918c = postTypEnumName;
        this.f82919d = map;
        this.f82920e = onGetPicVideoLinkDraftObjCallback;
        this.f82921f = onGetPostDataObjCallback;
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.auto_save.c
    @dl.d
    public String a() {
        return this.f82918c;
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.auto_save.c
    @k0
    @dl.e
    public PostEditAutoSaveData b() {
        PictureVideoLinkDraftObj pictureVideoLinkDraftObjInvoke;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30883, new Class[0], PostEditAutoSaveData.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostEditAutoSaveData) patchProxyResultProxy.result;
        }
        PostDataObj postDataObjInvoke = this.f82921f.invoke();
        if (postDataObjInvoke == null || (pictureVideoLinkDraftObjInvoke = this.f82920e.invoke()) == null) {
            return null;
        }
        List<BBSTextObj> imgPathList = pictureVideoLinkDraftObjInvoke.getImgPathList();
        if (imgPathList != null) {
            for (BBSTextObj bBSTextObj : imgPathList) {
                String strB = PostEditAutoSaveManager.f82868h.b(bBSTextObj.getText());
                if (strB != null) {
                    bBSTextObj.setText(strB);
                }
            }
        }
        Log.d("PicVideoPostEditSaveDataProvider-dbg", "[collectEditData]\npostTypEnumName: " + this.f82918c + "\npostDataObj: " + postDataObjInvoke + "\npicVideoLinkDraftObj: " + pictureVideoLinkDraftObjInvoke);
        return new PostEditAutoSaveData.PicVideoLinkAutoSaveData(pictureVideoLinkDraftObjInvoke, postDataObjInvoke, this.f82919d);
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.auto_save.c
    public boolean c() {
        return this.f82916a;
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.auto_save.c
    public boolean d(@dl.e PostEditAutoSaveData postEditAutoSaveData, @dl.e PostEditAutoSaveData postEditAutoSaveData2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postEditAutoSaveData, postEditAutoSaveData2}, this, changeQuickRedirect, false, 30884, new Class[]{PostEditAutoSaveData.class, PostEditAutoSaveData.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (postEditAutoSaveData == null && postEditAutoSaveData2 == null) {
            return false;
        }
        if (postEditAutoSaveData == null || postEditAutoSaveData2 == null || !(postEditAutoSaveData instanceof PostEditAutoSaveData.PicVideoLinkAutoSaveData) || !(postEditAutoSaveData2 instanceof PostEditAutoSaveData.PicVideoLinkAutoSaveData)) {
            return true;
        }
        PostEditAutoSaveData.PicVideoLinkAutoSaveData picVideoLinkAutoSaveData = (PostEditAutoSaveData.PicVideoLinkAutoSaveData) postEditAutoSaveData;
        PostEditAutoSaveData.PicVideoLinkAutoSaveData picVideoLinkAutoSaveData2 = (PostEditAutoSaveData.PicVideoLinkAutoSaveData) postEditAutoSaveData2;
        return (f0.g(picVideoLinkAutoSaveData.getPostDataObj(), picVideoLinkAutoSaveData2.getPostDataObj()) && f0.g(picVideoLinkAutoSaveData.getPictureVideoLinkDraftObj(), picVideoLinkAutoSaveData2.getPictureVideoLinkDraftObj())) ? false : true;
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.auto_save.c
    public boolean e() {
        return this.f82917b;
    }
}
