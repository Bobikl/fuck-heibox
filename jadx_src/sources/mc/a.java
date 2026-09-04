package mc;

import com.max.hbexpression.ExpressionAssetManager;
import com.max.hbexpression.bean.EmojiGroupObj;
import com.max.hbexpression.bean.EmojiItemtObj;
import com.max.hbexpression.bean.EmojisListResultObj;
import com.max.hbexpression.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.HashMap;

/* JADX INFO: compiled from: ExpressionCache.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String[] f131842a = new String[21];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String[] f131843b;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static HashMap<String, String> a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.g.f33144v2, new Class[0], HashMap.class);
        if (patchProxyResultProxy.isSupported) {
            return (HashMap) patchProxyResultProxy.result;
        }
        HashMap<String, String> map = new HashMap<>();
        EmojisListResultObj emojisListResultObj = f.f70195a;
        if (emojisListResultObj != null && emojisListResultObj.getEmoji_groups() != null) {
            for (EmojiGroupObj emojiGroupObj : f.f70195a.getEmoji_groups()) {
                if (!com.max.hbcommon.utils.c.w(emojiGroupObj.getEmojis()) && "2".equals(emojiGroupObj.getType())) {
                    for (EmojiItemtObj emojiItemtObj : emojiGroupObj.getEmojis()) {
                        map.put(ExpressionAssetManager.f69919a.j(emojiGroupObj.getGroup_code(), emojiItemtObj.getCode()), emojiItemtObj.getImg());
                    }
                }
            }
        }
        return map;
    }

    public static String[] b() {
        if (f131843b == null) {
            f131843b = new String[]{"最近", "表情", "表二"};
        }
        return f131843b;
    }

    public static String[] c() {
        return f131842a;
    }
}
