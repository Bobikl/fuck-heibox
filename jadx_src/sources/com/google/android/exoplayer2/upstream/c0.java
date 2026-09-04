package com.google.android.exoplayer2.upstream;

import android.text.TextUtils;
import com.max.xiaoheihe.bean.bbs.LinkDraftObj;

/* JADX INFO: compiled from: HttpDataSource.java */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c0 {
    static {
        com.google.common.base.x<String> xVar = HttpDataSource.f50864a;
    }

    public static /* synthetic */ boolean a(String str) {
        if (str == null) {
            return false;
        }
        String strG = com.google.common.base.a.g(str);
        if (TextUtils.isEmpty(strG)) {
            return false;
        }
        return ((strG.contains("text") && !strG.contains("text/vtt")) || strG.contains(LinkDraftObj.DRAFT_TYPE_HTML) || strG.contains("xml")) ? false : true;
    }
}
