package com.max.hbexpression;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.Glide;
import com.max.hbexpression.bean.EmojiGroupObj;
import com.max.hbexpression.bean.EmojiItemtObj;
import com.max.hbexpression.bean.EmojisListResultObj;
import com.max.hbexpression.bean.ExpressionObj;
import com.max.hbutils.bean.Result;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: compiled from: ExpressionManager.java */
/* JADX INFO: loaded from: classes10.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static EmojisListResultObj f70195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashMap<String, String> f70196b = new HashMap<>();
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: ExpressionManager.java */
    public class a extends com.max.hbcommon.network.d<Result<EmojisListResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        public void onNext(Result<EmojisListResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.g.f32981n, new Class[]{Result.class}, Void.TYPE).isSupported || result == null || result.getResult() == null || com.max.hbcommon.utils.c.u(result.getResult().getEmoji_version())) {
                return;
            }
            f.j(result.getResult());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.g.f33001o, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<EmojisListResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: ExpressionManager.java */
    public class b extends com.max.hbcommon.network.d<EmojisListResultObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public void a(EmojisListResultObj emojisListResultObj) {
            if (PatchProxy.proxy(new Object[]{emojisListResultObj}, this, changeQuickRedirect, false, bb.c.g.f33021p, new Class[]{EmojisListResultObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f.f70195a = emojisListResultObj;
            f.g();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.g.f33041q, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((EmojisListResultObj) obj);
        }
    }

    @SuppressLint({"CheckResult"})
    public static void a() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.g.f32782d, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        EmojisListResultObj emojisListResultObj = f70195a;
        oc.b.a().a(emojisListResultObj != null ? emojisListResultObj.getEmoji_version() : null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a());
    }

    @p0
    public static String b(String str) {
        EmojisListResultObj emojisListResultObj;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.g.f32862h, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (!TextUtils.isEmpty(str)) {
            HashMap<String, String> map = f70196b;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        if (str == null || (emojisListResultObj = f70195a) == null || com.max.hbcommon.utils.c.w(emojisListResultObj.getEmoji_groups())) {
            return null;
        }
        for (EmojiGroupObj emojiGroupObj : f70195a.getEmoji_groups()) {
            for (EmojiItemtObj emojiItemtObj : emojiGroupObj.getEmojis()) {
                if (str.equals(d(emojiGroupObj.getGroup_code(), emojiItemtObj.getCode()))) {
                    f70196b.put(d(emojiGroupObj.getGroup_code(), emojiItemtObj.getCode()), emojiItemtObj.getImg());
                    return emojiItemtObj.getImg();
                }
            }
        }
        return null;
    }

    @n0
    public static ExpressionObj c(EmojiGroupObj emojiGroupObj, EmojiItemtObj emojiItemtObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{emojiGroupObj, emojiItemtObj}, null, changeQuickRedirect, true, bb.c.g.f32941l, new Class[]{EmojiGroupObj.class, EmojiItemtObj.class}, ExpressionObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ExpressionObj) patchProxyResultProxy.result;
        }
        ExpressionObj expressionObj = new ExpressionObj(d(emojiGroupObj.getGroup_code(), emojiItemtObj.getCode()), -1, emojiItemtObj.getImg());
        if ("2".equals(emojiGroupObj.getType())) {
            expressionObj.setType(0);
        } else {
            expressionObj.setType(1);
        }
        return expressionObj;
    }

    public static String d(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.g.f32882i, new Class[]{String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return Constants.ARRAY_TYPE + str + lg.a.f131412e + str2 + "]";
    }

    public static Set<String> e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.g.f32961m, new Class[0], Set.class);
        return patchProxyResultProxy.isSupported ? (Set) patchProxyResultProxy.result : f70196b.keySet();
    }

    @SuppressLint({"CheckResult"})
    public static void f() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.g.f32802e, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcache.b.a("emoji_config_cache", EmojisListResultObj.class).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.schedulers.b.d()).J5(new b());
    }

    public static void g() {
        EmojisListResultObj emojisListResultObj;
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.g.f32842g, new Class[0], Void.TYPE).isSupported || (emojisListResultObj = f70195a) == null || com.max.hbcommon.utils.c.w(emojisListResultObj.getEmoji_groups())) {
            return;
        }
        f70196b.clear();
        for (EmojiGroupObj emojiGroupObj : f70195a.getEmoji_groups()) {
            for (EmojiItemtObj emojiItemtObj : emojiGroupObj.getEmojis()) {
                f70196b.put(d(emojiGroupObj.getGroup_code(), emojiItemtObj.getCode()), emojiItemtObj.getImg());
            }
        }
    }

    public static void h(String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, null, changeQuickRedirect, true, bb.c.g.f32921k, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        ExpressionAssetManager.f69919a.c(str, str2, str3);
    }

    public static void i(ExpressionObj expressionObj, ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{expressionObj, imageView}, null, changeQuickRedirect, true, bb.c.g.f32901j, new Class[]{ExpressionObj.class, ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        if (expressionObj.getResId() >= 0) {
            imageView.setImageResource(expressionObj.getResId());
            return;
        }
        ExpressionAssetManager expressionAssetManager = ExpressionAssetManager.f69919a;
        if (expressionAssetManager.s(expressionObj)) {
            Glide.G(imageView).b(new File(expressionObj.getFilePath())).C1(imageView);
        } else {
            expressionAssetManager.a(expressionObj);
            com.max.hbimage.b.K(expressionObj.getUrl(), imageView);
        }
    }

    public static void j(EmojisListResultObj emojisListResultObj) {
        if (PatchProxy.proxy(new Object[]{emojisListResultObj}, null, changeQuickRedirect, true, bb.c.g.f32822f, new Class[]{EmojisListResultObj.class}, Void.TYPE).isSupported || emojisListResultObj == null || com.max.hbcommon.utils.c.w(emojisListResultObj.getEmoji_groups())) {
            return;
        }
        f70195a = emojisListResultObj;
        g();
        ExpressionAssetManager.f69919a.g(emojisListResultObj);
    }
}
