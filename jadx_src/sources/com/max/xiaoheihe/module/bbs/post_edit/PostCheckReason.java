package com.max.xiaoheihe.module.bbs.post_edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: PostTabActivity.kt */
/* JADX INFO: loaded from: classes10.dex */
public enum PostCheckReason {
    CHECK_PASS(0),
    TOAST_POST_LIMIT_NOT_ALLOW(1),
    NO_COVER(2),
    TOAST_NO_TOPIC(3),
    TOAST_POST_LIMIT_CHECK_FAIL(4),
    DIALOG_NO_TOPIC(5),
    TOAST_NO_VIDEO(6),
    TOAST_PIC_UPLOAD(7),
    TOAST_TITLE_CONTAIN_EMOJI(8),
    NO_ORIGINAL_CREATE_DECLARE(9);

    public static ChangeQuickRedirect changeQuickRedirect;
    private final int reasonCode;

    PostCheckReason(int i10) {
        this.reasonCode = i10;
    }

    public static PostCheckReason valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 30560, new Class[]{String.class}, PostCheckReason.class);
        return (PostCheckReason) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(PostCheckReason.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static PostCheckReason[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 30559, new Class[0], PostCheckReason[].class);
        return (PostCheckReason[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }

    public final int getReasonCode() {
        return this.reasonCode;
    }
}
