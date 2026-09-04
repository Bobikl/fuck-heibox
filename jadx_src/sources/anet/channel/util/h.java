package anet.channel.util;

import anet.channel.request.Request;
import anet.channel.thread.ThreadPoolExecutorFactory;
import com.max.xiaoheihe.bean.bbs.LinkDraftObj;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, Integer> f30016a;

    static {
        HashMap map = new HashMap();
        f30016a = map;
        map.put("tpatch", 3);
        f30016a.put("so", 3);
        f30016a.put("json", 3);
        f30016a.put(LinkDraftObj.DRAFT_TYPE_HTML, 4);
        f30016a.put("htm", 4);
        f30016a.put("css", 5);
        f30016a.put(WebviewFragment.f94378y4, 5);
        f30016a.put("webp", 6);
        f30016a.put("png", 6);
        f30016a.put("jpg", 6);
        f30016a.put("do", 6);
        f30016a.put("zip", Integer.valueOf(ThreadPoolExecutorFactory.Priority.LOW));
        f30016a.put("bin", Integer.valueOf(ThreadPoolExecutorFactory.Priority.LOW));
        f30016a.put("apk", Integer.valueOf(ThreadPoolExecutorFactory.Priority.LOW));
    }

    public static int a(Request request) {
        Integer num;
        if (request == null) {
            throw new NullPointerException("url is null!");
        }
        if (request.getHeaders().containsKey(HttpConstant.X_PV)) {
            return 1;
        }
        String strTrySolveFileExtFromUrlPath = HttpHelper.trySolveFileExtFromUrlPath(request.getHttpUrl().path());
        if (strTrySolveFileExtFromUrlPath == null || (num = f30016a.get(strTrySolveFileExtFromUrlPath)) == null) {
            return 6;
        }
        return num.intValue();
    }
}
