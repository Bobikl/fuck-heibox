package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.open.SocialConstants;
import dl.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: HighLikeCommentObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@t0({"SMAP\nHighLikeCommentObj.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HighLikeCommentObj.kt\ncom/max/xiaoheihe/bean/bbs/HighLikeCommentObjKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n1855#2,2:50\n*S KotlinDebug\n*F\n+ 1 HighLikeCommentObj.kt\ncom/max/xiaoheihe/bean/bbs/HighLikeCommentObjKt\n*L\n16#1:50,2\n*E\n"})
public final class HighLikeCommentObjKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    public static final ArrayList<BBSTextObj> getBBSTextObjList(@d HighLikeCommentObj highLikeCommentObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{highLikeCommentObj}, null, changeQuickRedirect, true, 14302, new Class[]{HighLikeCommentObj.class}, ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        f0.p(highLikeCommentObj, "<this>");
        List<String> thumb = highLikeCommentObj.getThumb();
        if (thumb == null) {
            return new ArrayList<>();
        }
        ArrayList<BBSTextObj> arrayList = new ArrayList<>();
        for (String str : thumb) {
            BBSTextObj bBSTextObj = new BBSTextObj();
            bBSTextObj.setUrl(str);
            bBSTextObj.setType(SocialConstants.PARAM_IMG_URL);
            arrayList.add(bBSTextObj);
        }
        return arrayList;
    }

    @d
    public static final BBSTextObj getCommentBBSTextObj(@d HighLikeCommentObj highLikeCommentObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{highLikeCommentObj}, null, changeQuickRedirect, true, 14303, new Class[]{HighLikeCommentObj.class}, BBSTextObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BBSTextObj) patchProxyResultProxy.result;
        }
        f0.p(highLikeCommentObj, "<this>");
        String text = highLikeCommentObj.getText();
        if (text == null) {
            return new BBSTextObj();
        }
        BBSTextObj bBSTextObj = new BBSTextObj();
        bBSTextObj.setCommentText(text);
        StringBuilder sb2 = new StringBuilder();
        sb2.append('#');
        String bg_color = highLikeCommentObj.getBg_color();
        if (bg_color == null) {
            bg_color = "#2A3AE7";
        }
        sb2.append(bg_color);
        bBSTextObj.setCommentTextImageBgColor(sb2.toString());
        return bBSTextObj;
    }

    @d
    public static final ArrayList<BBSTextObj> getCommentBBSTextObjList(@d HighLikeCommentObj highLikeCommentObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{highLikeCommentObj}, null, changeQuickRedirect, true, 14304, new Class[]{HighLikeCommentObj.class}, ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        f0.p(highLikeCommentObj, "<this>");
        return CollectionsKt__CollectionsKt.r(getCommentBBSTextObj(highLikeCommentObj));
    }

    public static final boolean hasPostContent(@d HighLikeCommentObj highLikeCommentObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{highLikeCommentObj}, null, changeQuickRedirect, true, 14307, new Class[]{HighLikeCommentObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(highLikeCommentObj, "<this>");
        String post_content = highLikeCommentObj.getPost_content();
        return !(post_content == null || post_content.length() == 0);
    }

    public static final boolean hasText(@d HighLikeCommentObj highLikeCommentObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{highLikeCommentObj}, null, changeQuickRedirect, true, 14306, new Class[]{HighLikeCommentObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(highLikeCommentObj, "<this>");
        String text = highLikeCommentObj.getText();
        return !(text == null || text.length() == 0);
    }

    public static final boolean hasThumb(@d HighLikeCommentObj highLikeCommentObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{highLikeCommentObj}, null, changeQuickRedirect, true, 14305, new Class[]{HighLikeCommentObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(highLikeCommentObj, "<this>");
        List<String> thumb = highLikeCommentObj.getThumb();
        return !(thumb == null || thumb.isEmpty());
    }
}
