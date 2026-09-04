package com.max.xiaoheihe.module.bbs.utils;

import android.content.Context;
import com.max.xiaoheihe.bean.bbs.BBSUserMsgObj;
import com.max.xiaoheihe.module.bbs.UserNotifyListActivity;
import com.max.xiaoheihe.module.bbs.p0;
import com.max.xiaoheihe.module.chat.MsgConversationActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: UserMessageUtils.java */
/* JADX INFO: loaded from: classes10.dex */
public class f {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void a(Context context, BBSUserMsgObj bBSUserMsgObj) {
        if (PatchProxy.proxy(new Object[]{context, bBSUserMsgObj}, null, changeQuickRedirect, true, 31339, new Class[]{Context.class, BBSUserMsgObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!com.max.hbcommon.utils.c.u(bBSUserMsgObj.getProtocol())) {
            com.max.xiaoheihe.base.router.b.k0(context, bBSUserMsgObj.getProtocol());
            return;
        }
        String entry = bBSUserMsgObj.getEntry();
        if ("comment".equalsIgnoreCase(entry)) {
            com.max.xiaoheihe.base.router.b.z0(com.max.xiaoheihe.base.router.b.x(context, "0", null));
            return;
        }
        if (p0.f81454v.equalsIgnoreCase(entry)) {
            com.max.xiaoheihe.base.router.b.z0(com.max.xiaoheihe.base.router.b.x(context, "1", null));
            return;
        }
        if ("notify".equalsIgnoreCase(entry)) {
            com.max.xiaoheihe.utils.d.G1(context, UserNotifyListActivity.N1(context));
            return;
        }
        if (p0.G.equalsIgnoreCase(entry)) {
            com.max.xiaoheihe.base.router.b.z0(com.max.xiaoheihe.base.router.b.x(context, "9", null));
            return;
        }
        if ("message".equalsIgnoreCase(entry)) {
            MsgConversationActivity.R1(context, bBSUserMsgObj.getUser_a().getUserid(), bBSUserMsgObj.getUser_a().getUsername());
            return;
        }
        if ("discount".equalsIgnoreCase(entry)) {
            com.max.xiaoheihe.base.router.b.z0(com.max.xiaoheihe.base.router.b.f(context, lb.d.W4));
            return;
        }
        if ("feedback".equalsIgnoreCase(entry)) {
            com.max.xiaoheihe.base.router.b.z0(com.max.xiaoheihe.base.router.b.G(context, 1));
            return;
        }
        if ("friends".equalsIgnoreCase(entry)) {
            com.max.xiaoheihe.base.router.b.z0(com.max.xiaoheihe.base.router.b.x(context, "2", "9"));
            return;
        }
        if ("follow".equalsIgnoreCase(entry)) {
            com.max.xiaoheihe.base.router.b.z0(com.max.xiaoheihe.base.router.b.x(context, "2", "4"));
            return;
        }
        if (p0.C.equals(entry)) {
            com.max.xiaoheihe.utils.d.G1(context, UserNotifyListActivity.Q1(context, "2", bBSUserMsgObj.getUser_a().getUsername(), bBSUserMsgObj.getUser_a().getSender_id(), bBSUserMsgObj.getSub_entry()));
            return;
        }
        if (p0.D.equals(entry)) {
            com.max.xiaoheihe.utils.d.G1(context, UserNotifyListActivity.Q1(context, "3", bBSUserMsgObj.getUser_a().getUsername(), bBSUserMsgObj.getUser_a().getSender_id(), bBSUserMsgObj.getSub_entry()));
            return;
        }
        if ("9".equals(bBSUserMsgObj.getMessage_type()) || "10".equals(bBSUserMsgObj.getMessage_type()) || "11".equals(bBSUserMsgObj.getMessage_type())) {
            com.max.xiaoheihe.base.router.b.z0(com.max.xiaoheihe.base.router.b.T(context, bBSUserMsgObj.getUserid_a()));
            return;
        }
        if ("4".equals(bBSUserMsgObj.getMessage_type())) {
            com.max.xiaoheihe.base.router.b.z0(com.max.xiaoheihe.base.router.b.T(context, bBSUserMsgObj.getUserid_a()));
            return;
        }
        if ("developer".equalsIgnoreCase(entry)) {
            com.max.xiaoheihe.utils.d.G1(context, UserNotifyListActivity.O1(context, "1"));
            return;
        }
        if ("at".equalsIgnoreCase(entry)) {
            com.max.xiaoheihe.base.router.b.z0(com.max.xiaoheihe.base.router.b.x(context, "2", "16"));
        } else {
            if (!p0.B.equalsIgnoreCase(entry) || com.max.hbcommon.utils.c.u(bBSUserMsgObj.getProtocol())) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(context, bBSUserMsgObj.getProtocol());
        }
    }
}
