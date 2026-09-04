package com.max.xiaoheihe.router.interceptors;

import android.net.Uri;
import android.util.Log;
import com.max.basebbs.bean.video.VideoInfoObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.module.bbs.post.PostPageFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BBSLinkInterceptor.kt */
/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class a implements com.sankuai.waimai.router.core.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f94959b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94960a = a.class.getSimpleName();

    @Override // com.sankuai.waimai.router.core.h
    public void a(@dl.d com.sankuai.waimai.router.core.i request, @dl.d com.sankuai.waimai.router.core.f callback) {
        if (PatchProxy.proxy(new Object[]{request, callback}, this, changeQuickRedirect, false, 48111, new Class[]{com.sankuai.waimai.router.core.i.class, com.sankuai.waimai.router.core.f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(request, "request");
        f0.p(callback, "callback");
        Uri uriM = request.m();
        f0.o(uriM, "request.uri");
        String path = uriM.getPath();
        String strI = m.i(request, "link_id", 0, 2, null);
        String strI2 = m.i(request, "link_tag", 0, 2, null);
        String strG = m.g(request, PostPageFactory.f81483s);
        String strH = m.h(request, PostPageFactory.f81484t, 0);
        boolean zB = m.b(request, PostPageFactory.f81485u, false);
        String strI3 = m.i(request, PostPageFactory.f81471g, 0, 2, null);
        String strI4 = m.i(request, "comment_id", 0, 2, null);
        Log.d(this.f94960a, "Path: " + path);
        if (!f0.g(path, lb.d.S)) {
            callback.a();
            return;
        }
        BBSLinkObj bBSLinkObj = new BBSLinkObj();
        bBSLinkObj.setLinkid(strI);
        bBSLinkObj.setLink_tag(strI2);
        bBSLinkObj.setPage_url(strG);
        bBSLinkObj.setHas_video(strH);
        bBSLinkObj.setNeed_story_mode_report(zB);
        bBSLinkObj.setRoot_comment_id(strI3);
        bBSLinkObj.setComment_id(strI4);
        if (com.max.hbcommon.utils.c.x(strH)) {
            Serializable serializableF = m.f(request, "video_info");
            if (serializableF != null) {
                bBSLinkObj.setVideo_info((VideoInfoObj) com.max.hbutils.utils.k.a(com.max.hbutils.utils.k.p(serializableF), VideoInfoObj.class));
            }
            com.max.xiaoheihe.module.bbs.utils.b.C(request.b(), bBSLinkObj);
        } else {
            com.sankuai.waimai.router.core.i iVarJ = com.max.xiaoheihe.module.bbs.utils.b.j(request.b(), bBSLinkObj);
            f0.o(iVarJ, "getLinkRequest(request.context, bbsLink)");
            com.max.xiaoheihe.base.router.b.z0(iVarJ);
        }
        callback.onComplete(200);
    }

    public final String b() {
        return this.f94960a;
    }
}
