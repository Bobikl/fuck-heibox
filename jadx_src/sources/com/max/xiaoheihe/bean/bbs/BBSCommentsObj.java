package com.max.xiaoheihe.bean.bbs;

import android.text.TextUtils;
import com.max.hbcommon.utils.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSCommentsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -4909525056304328793L;
    private List<BBSCommentObj> comment;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14171, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BBSCommentsObj bBSCommentsObj = (BBSCommentsObj) obj;
        List<BBSCommentObj> list = this.comment;
        if (list != null && bBSCommentsObj.comment != null && list.size() > 0 && bBSCommentsObj.comment.size() > 0 && !TextUtils.isEmpty(this.comment.get(0).getCommentid()) && this.comment.get(0).getCommentid().equals(bBSCommentsObj.comment.get(0).getCommentid())) {
            return !c.u(this.comment.get(0).getIs_top()) ? this.comment.get(0).getIs_top().equals(bBSCommentsObj.comment.get(0).getIs_top()) : c.u(bBSCommentsObj.comment.get(0).getIs_top());
        }
        List<BBSCommentObj> list2 = this.comment;
        List<BBSCommentObj> list3 = bBSCommentsObj.comment;
        if (list2 != null) {
            return list2.equals(list3);
        }
        return list3 == null;
    }

    public List<BBSCommentObj> getComment() {
        return this.comment;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14172, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<BBSCommentObj> list = this.comment;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public void setComment(List<BBSCommentObj> list) {
        this.comment = list;
    }

    public boolean setRecommendExtraForResult(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 14170, new Class[]{String.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            if (c.w(this.comment) || !str.equals(this.comment.get(0).getUser().getUserid())) {
                return false;
            }
            this.comment.get(0).setDesc_extra(str2);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean setRecommendStateForResult(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 14169, new Class[]{String.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            if (c.w(this.comment) || !str.equals(this.comment.get(0).getUser().getUserid())) {
                return false;
            }
            this.comment.get(0).setRecommend_state(str2);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
