package com.max.xiaoheihe.module.bbs.utils;

import android.content.Context;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.bean.ResultVerifyInfoObj;
import com.max.xiaoheihe.bean.bbs.BBSTextObj;
import com.max.xiaoheihe.bean.bbs.HighLikeCommentObj;
import com.max.xiaoheihe.bean.bbs.PictureVideoLinkDraftObj;
import com.max.xiaoheihe.bean.bbs.PostDataObj;
import com.max.xiaoheihe.module.upload.g;
import com.max.xiaoheihe.module.upload.h;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.open.SocialConstants;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: DraftUtilsEx.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DraftUtilsExKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: DraftUtilsEx.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<ResultVerifyInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<Boolean> f83380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c.h f83381c;

        a(yh.a<Boolean> aVar, c.h hVar) {
            this.f83380b = aVar;
            this.f83381c = hVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 31318, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (this.f83380b.invoke().booleanValue()) {
                super.onError(e10);
                this.f83381c.onFinish(false);
            }
        }

        public void onNext(@dl.d Result<ResultVerifyInfoObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31319, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (this.f83380b.invoke().booleanValue()) {
                super.onNext(result);
                this.f83381c.onFinish(true);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31320, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ResultVerifyInfoObj>) obj);
        }
    }

    /* JADX INFO: compiled from: DraftUtilsEx.kt */
    public static final class b implements g.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<BBSTextObj> f83382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<Boolean, b2> f83383b;

        /* JADX WARN: Multi-variable type inference failed */
        b(List<? extends BBSTextObj> list, l<? super Boolean, b2> lVar) {
            this.f83382a = list;
            this.f83383b = lVar;
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ void a(float f10) {
            h.b(this, f10);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean b() {
            return h.a(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void c(@dl.d String[] urls, @dl.d String extra) {
            if (PatchProxy.proxy(new Object[]{urls, extra}, this, changeQuickRedirect, false, 31323, new Class[]{String[].class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(urls, "urls");
            f0.p(extra, "extra");
            int size = this.f83382a.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                if (com.max.hbcommon.utils.c.u(this.f83382a.get(i11).getUrl())) {
                    this.f83382a.get(i11).setUrl(urls[i10]);
                    i10++;
                }
            }
            this.f83383b.invoke(Boolean.TRUE);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean d() {
            return h.c(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void e(@dl.d String error) {
            if (PatchProxy.proxy(new Object[]{error}, this, changeQuickRedirect, false, 31324, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(error, "error");
            this.f83383b.invoke(Boolean.FALSE);
        }
    }

    public static final /* synthetic */ void a(HashMap map, PostDataObj postDataObj, PictureVideoLinkDraftObj pictureVideoLinkDraftObj, boolean z10, io.reactivex.disposables.a aVar, yh.a aVar2, c.h hVar) {
        if (PatchProxy.proxy(new Object[]{map, postDataObj, pictureVideoLinkDraftObj, new Byte(z10 ? (byte) 1 : (byte) 0), aVar, aVar2, hVar}, null, changeQuickRedirect, true, 31317, new Class[]{HashMap.class, PostDataObj.class, PictureVideoLinkDraftObj.class, Boolean.TYPE, io.reactivex.disposables.a.class, yh.a.class, c.h.class}, Void.TYPE).isSupported) {
            return;
        }
        b(map, postDataObj, pictureVideoLinkDraftObj, z10, aVar, aVar2, hVar);
    }

    private static final void b(HashMap<String, String> map, PostDataObj postDataObj, PictureVideoLinkDraftObj pictureVideoLinkDraftObj, boolean z10, io.reactivex.disposables.a aVar, yh.a<Boolean> aVar2, c.h hVar) {
        z<Result<ResultVerifyInfoObj>> zVarBa;
        Map<String, String> paramsMap;
        if (PatchProxy.proxy(new Object[]{map, postDataObj, pictureVideoLinkDraftObj, new Byte(z10 ? (byte) 1 : (byte) 0), aVar, aVar2, hVar}, null, changeQuickRedirect, true, 31315, new Class[]{HashMap.class, PostDataObj.class, PictureVideoLinkDraftObj.class, Boolean.TYPE, io.reactivex.disposables.a.class, yh.a.class, c.h.class}, Void.TYPE).isSupported) {
            return;
        }
        if (map != null && (paramsMap = postDataObj.getParamsMap()) != null) {
            paramsMap.putAll(map);
        }
        HighLikeCommentObj highLikeComment = pictureVideoLinkDraftObj.getHighLikeComment();
        if (highLikeComment != null) {
            String strValueOf = String.valueOf((int) highLikeComment.getComment_id());
            Map<String, String> paramsMap2 = postDataObj.getParamsMap();
            if (paramsMap2 != null) {
                paramsMap2.put("relate_comment_id", strValueOf);
            }
        }
        if (z10) {
            zVarBa = i.a().c5(postDataObj.getCookieHeaders(), null, postDataObj.isDraft(), postDataObj.getParamsMap());
            f0.o(zVarBa, "{\n        ServiceGenerat…postData.paramsMap)\n    }");
        } else {
            zVarBa = i.a().Ba(postDataObj.getCookieHeaders(), null, postDataObj.isDraft(), postDataObj.getParamsMap());
            f0.o(zVarBa, "{\n        ServiceGenerat…postData.paramsMap)\n    }");
        }
        aVar.c((io.reactivex.disposables.b) zVarBa.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a(aVar2, hVar)));
    }

    public static final void c(@dl.d final io.reactivex.disposables.a composeDisposable, @dl.d Context context, @dl.d final PostDataObj postData, @dl.d final PictureVideoLinkDraftObj picVideoLinkDraftObj, @dl.e final HashMap<String, String> map, boolean z10, @dl.d final yh.a<Boolean> onCheckIsActive, @dl.d final c.h saveListener) {
        if (PatchProxy.proxy(new Object[]{composeDisposable, context, postData, picVideoLinkDraftObj, map, new Byte(z10 ? (byte) 1 : (byte) 0), onCheckIsActive, saveListener}, null, changeQuickRedirect, true, 31314, new Class[]{io.reactivex.disposables.a.class, Context.class, PostDataObj.class, PictureVideoLinkDraftObj.class, HashMap.class, Boolean.TYPE, yh.a.class, c.h.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(composeDisposable, "composeDisposable");
        f0.p(context, "context");
        f0.p(postData, "postData");
        f0.p(picVideoLinkDraftObj, "picVideoLinkDraftObj");
        f0.p(onCheckIsActive, "onCheckIsActive");
        f0.p(saveListener, "saveListener");
        if (z10) {
            b(map, postData, picVideoLinkDraftObj, true, composeDisposable, onCheckIsActive, saveListener);
        } else {
            d(picVideoLinkDraftObj.getImgPathList(), context, composeDisposable, new l<Boolean, b2>() { // from class: com.max.xiaoheihe.module.bbs.utils.DraftUtilsExKt$savePicVideoDraft$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Code duplicated, block: B:38:0x009c  */
                /* JADX WARN: Multi-variable type inference failed */
                public final void a(boolean z11) {
                    List<BBSTextObj> imgPathList;
                    Object next;
                    Object[] objArr;
                    String str;
                    if (PatchProxy.proxy(new Object[]{new Byte(z11 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 31321, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    if (!z11) {
                        saveListener.onFinish(false);
                        return;
                    }
                    Map<String, String> paramsMap = postData.getParamsMap();
                    List<BBSTextObj> listB = (paramsMap == null || (str = paramsMap.get("text")) == null) ? null : k.b(str, BBSTextObj.class);
                    if (listB != null) {
                        PictureVideoLinkDraftObj pictureVideoLinkDraftObj = picVideoLinkDraftObj;
                        for (BBSTextObj bBSTextObj : listB) {
                            if (f0.g(bBSTextObj != null ? bBSTextObj.getType() : null, SocialConstants.PARAM_IMG_URL) && (imgPathList = pictureVideoLinkDraftObj.getImgPathList()) != null) {
                                Iterator<T> it = imgPathList.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    if (f0.g(((BBSTextObj) next).getText(), bBSTextObj.getText())) {
                                        String url = bBSTextObj.getUrl();
                                        if ((url == null || url.length() == 0) == true) {
                                            objArr = true;
                                        } else {
                                            objArr = false;
                                        }
                                    } else {
                                        objArr = false;
                                    }
                                } while (objArr == false);
                                BBSTextObj bBSTextObj2 = (BBSTextObj) next;
                                if (bBSTextObj2 != null) {
                                    bBSTextObj.setUrl(bBSTextObj2.getUrl());
                                }
                            }
                        }
                    }
                    Map<String, String> paramsMap2 = postData.getParamsMap();
                    if (paramsMap2 != null) {
                        paramsMap2.put("text", k.p(listB));
                    }
                    DraftUtilsExKt.a(map, postData, picVideoLinkDraftObj, false, composeDisposable, onCheckIsActive, saveListener);
                }

                /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Boolean bool) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 31322, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    a(bool.booleanValue());
                    return b2.f124493a;
                }
            });
        }
    }

    private static final void d(List<? extends BBSTextObj> list, Context context, io.reactivex.disposables.a aVar, l<? super Boolean, b2> lVar) {
        if (PatchProxy.proxy(new Object[]{list, context, aVar, lVar}, null, changeQuickRedirect, true, 31316, new Class[]{List.class, Context.class, io.reactivex.disposables.a.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        if (list == null) {
            lVar.invoke(Boolean.TRUE);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (BBSTextObj bBSTextObj : list) {
            if (com.max.hbcommon.utils.c.u(bBSTextObj.getUrl())) {
                arrayList.add(bBSTextObj.getText());
            }
        }
        if (com.max.hbcommon.utils.c.w(arrayList)) {
            lVar.invoke(Boolean.TRUE);
        } else {
            g.h(context, aVar, arrayList, "bbs", new b(list, lVar));
        }
    }
}
