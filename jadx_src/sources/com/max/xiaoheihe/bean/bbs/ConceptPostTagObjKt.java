package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;

/* JADX INFO: compiled from: ConceptPostTagObj.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConceptPostTagObjKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final boolean isNullOrEmpty(@e PostContentTagObj.TagSubLabel tagSubLabel) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tagSubLabel}, null, changeQuickRedirect, true, 14263, new Class[]{PostContentTagObj.TagSubLabel.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (tagSubLabel == null) {
            return true;
        }
        String sub_title = tagSubLabel.getSub_title();
        return sub_title == null || sub_title.length() == 0;
    }
}
