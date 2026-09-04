package com.max.hbexpression;

import android.text.TextUtils;
import com.max.hbexpression.bean.EmojiGroupObj;
import com.max.hbexpression.bean.EmojisListResultObj;
import com.max.hbexpression.bean.ExpressionObj;
import com.max.hbutils.core.BaseApplication;
import com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.Regex;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: ExpressionAssetManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nExpressionAssetManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpressionAssetManager.kt\ncom/max/hbexpression/ExpressionAssetManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,300:1\n1#2:301\n731#3,9:302\n37#4,2:311\n49#5,4:313\n*S KotlinDebug\n*F\n+ 1 ExpressionAssetManager.kt\ncom/max/hbexpression/ExpressionAssetManager\n*L\n265#1:302,9\n266#1:311,2\n31#1:313,4\n*E\n"})
public final class ExpressionAssetManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final ExpressionAssetManager f69919a = new ExpressionAssetManager();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final l0 f69920b = new a(l0.INSTANCE);
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @t0({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 ExpressionAssetManager.kt\ncom/max/hbexpression/ExpressionAssetManager\n*L\n1#1,110:1\n32#2,2:111\n*E\n"})
    public static final class a extends kotlin.coroutines.a implements l0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        public a(l0.Companion bVar) {
            super(bVar);
        }

        @Override // kotlinx.coroutines.l0
        public void C(@dl.d CoroutineContext coroutineContext, @dl.d Throwable th2) {
            if (PatchProxy.proxy(new Object[]{coroutineContext, th2}, this, changeQuickRedirect, false, bb.c.f.TC, new Class[]{CoroutineContext.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ExpressionAssetManager, CoroutineExceptionHandler got ");
            sb2.append(th2);
            sb2.append(" with suppressed ");
            String string = Arrays.toString(th2.getSuppressed());
            f0.o(string, "toString(...)");
            sb2.append(string);
            aVar.q(sb2.toString());
        }
    }

    private ExpressionAssetManager() {
    }

    public final void a(@dl.d ExpressionObj data) {
        if (PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, bb.c.f.DB, new Class[]{ExpressionObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(data, "data");
        kotlinx.coroutines.k.f(r0.a(e1.a()), f69920b, null, new ExpressionAssetManager$cacheEmoji$1(data, null), 2, null);
    }

    public final void b(@dl.d String emojiKey, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{emojiKey, str}, this, changeQuickRedirect, false, bb.c.f.EB, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(emojiKey, "emojiKey");
        kotlinx.coroutines.k.f(r0.a(e1.a()), f69920b, null, new ExpressionAssetManager$cacheEmoji$2(emojiKey, str, null), 2, null);
    }

    public final void c(@dl.d String groupCode, @dl.d String code, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{groupCode, code, str}, this, changeQuickRedirect, false, bb.c.f.FB, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(groupCode, "groupCode");
        f0.p(code, "code");
        kotlinx.coroutines.k.f(r0.a(e1.a()), f69920b, null, new ExpressionAssetManager$cacheEmoji$3(groupCode, code, str, null), 2, null);
    }

    @dl.e
    public final Object d(@dl.d EmojisListResultObj emojisListResultObj, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{emojisListResultObj, cVar}, this, changeQuickRedirect, false, bb.c.f.CB, new Class[]{EmojisListResultObj.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : kotlinx.coroutines.i.h(e1.c(), new ExpressionAssetManager$cacheEmojis$2(emojisListResultObj, null), cVar);
    }

    @dl.e
    public final Object e(@dl.d List<? extends EmojiGroupObj> list, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, cVar}, this, changeQuickRedirect, false, bb.c.f.AB, new Class[]{List.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlinx.coroutines.i.h(e1.c(), new ExpressionAssetManager$deleteExcessEmojiGroup$2(list, null), cVar);
        return objH == kotlin.coroutines.intrinsics.b.h() ? objH : b2.f124493a;
    }

    @dl.e
    public final Object f(@dl.e EmojiGroupObj emojiGroupObj, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{emojiGroupObj, cVar}, this, changeQuickRedirect, false, bb.c.f.BB, new Class[]{EmojiGroupObj.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : kotlinx.coroutines.i.h(e1.c(), new ExpressionAssetManager$downloadEmojiAsset$2(emojiGroupObj, null), cVar);
    }

    public final void g(@dl.d EmojisListResultObj resultObj) {
        if (PatchProxy.proxy(new Object[]{resultObj}, this, changeQuickRedirect, false, bb.c.f.zB, new Class[]{EmojisListResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(resultObj, "resultObj");
        kotlinx.coroutines.k.f(r0.a(e1.c()), f69920b, null, new ExpressionAssetManager$downloadEmojiAssets$1(resultObj, null), 2, null);
    }

    @dl.e
    public final Object h(@dl.d String str, @dl.d String str2, @dl.e String str3, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, cVar}, this, changeQuickRedirect, false, bb.c.f.GB, new Class[]{String.class, String.class, String.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlinx.coroutines.i.h(e1.c(), new ExpressionAssetManager$downloadEmojiFile$2(str, str2, str3, null), cVar);
        return objH == kotlin.coroutines.intrinsics.b.h() ? objH : b2.f124493a;
    }

    @dl.e
    public final File i(@dl.e String str, @dl.e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, bb.c.f.OB, new Class[]{String.class, String.class}, File.class);
        if (patchProxyResultProxy.isSupported) {
            return (File) patchProxyResultProxy.result;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        f0.m(str);
        f0.m(str2);
        return new File(j(str, str2));
    }

    @dl.d
    public final String j(@dl.d String groupCode, @dl.d String code) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{groupCode, code}, this, changeQuickRedirect, false, bb.c.f.PB, new Class[]{String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(groupCode, "groupCode");
        f0.p(code, "code");
        return o(groupCode) + code + com.max.mediaselector.lib.config.f.f75141t;
    }

    @dl.e
    public final String k(@dl.d String key) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{key}, this, changeQuickRedirect, false, bb.c.f.KB, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(key, "key");
        String[] strArrN = n(key);
        if (strArrN != null && strArrN.length == 2) {
            return j(strArrN[0], strArrN[1]);
        }
        return null;
    }

    @dl.d
    public final String l() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.RB, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(BaseApplication.a().getFilesDir().toString());
        String str = File.separator;
        sb2.append(str);
        sb2.append("emojis");
        sb2.append(str);
        return sb2.toString();
    }

    @dl.d
    public final String m(@dl.d String groupCode) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{groupCode}, this, changeQuickRedirect, false, bb.c.f.NB, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(groupCode, "groupCode");
        return o(groupCode) + groupCode + DynamicSoManager.f77249d;
    }

    @dl.e
    public final String[] n(@dl.d String emojiKey) {
        List listE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{emojiKey}, this, changeQuickRedirect, false, bb.c.f.MB, new Class[]{String.class}, String[].class);
        if (patchProxyResultProxy.isSupported) {
            return (String[]) patchProxyResultProxy.result;
        }
        f0.p(emojiKey, "emojiKey");
        if (!new Regex("\\[(.*?)]").k(emojiKey)) {
            return null;
        }
        List<String> listP = new Regex(lg.a.f131412e).p(StringsKt___StringsKt.D6(StringsKt___StringsKt.B6(emojiKey, 1), 1), 0);
        if (listP.isEmpty()) {
            listE = CollectionsKt__CollectionsKt.E();
        } else {
            ListIterator<String> listIterator = listP.listIterator(listP.size());
            while (listIterator.hasPrevious()) {
                if (!(listIterator.previous().length() == 0)) {
                    listE = CollectionsKt___CollectionsKt.E5(listP, listIterator.nextIndex() + 1);
                }
            }
            listE = CollectionsKt__CollectionsKt.E();
        }
        return (String[]) listE.toArray(new String[0]);
    }

    @dl.d
    public final String o(@dl.d String groupCode) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{groupCode}, this, changeQuickRedirect, false, bb.c.f.QB, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(groupCode, "groupCode");
        if (TextUtils.isEmpty(groupCode)) {
            return l();
        }
        return l() + groupCode + File.separator;
    }

    @dl.e
    public final String p(@dl.d String emojiKey) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{emojiKey}, this, changeQuickRedirect, false, bb.c.f.LB, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(emojiKey, "emojiKey");
        String[] strArrN = n(emojiKey);
        if (strArrN == null || strArrN.length != 2) {
            return null;
        }
        return strArrN[1];
    }

    @dl.d
    public final l0 q() {
        return f69920b;
    }

    @dl.d
    public final String r() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.SB, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(BaseApplication.a().getFilesDir().toString());
        String str = File.separator;
        sb2.append(str);
        sb2.append("emoji");
        sb2.append(str);
        return sb2.toString();
    }

    public final boolean s(@dl.d ExpressionObj expressionObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{expressionObj}, this, changeQuickRedirect, false, bb.c.f.JB, new Class[]{ExpressionObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(expressionObj, "expressionObj");
        String filePath = expressionObj.getFilePath();
        File file = filePath != null ? new File(filePath) : null;
        if (file != null) {
            return file.exists();
        }
        return false;
    }

    public final boolean t(@dl.d String emojiKey) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{emojiKey}, this, changeQuickRedirect, false, bb.c.f.HB, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(emojiKey, "emojiKey");
        String[] strArrN = n(emojiKey);
        if (strArrN != null && strArrN.length == 2) {
            return u(strArrN[0], strArrN[1]);
        }
        return false;
    }

    public final boolean u(@dl.e String str, @dl.e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, bb.c.f.IB, new Class[]{String.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        File fileI = i(str, str2);
        if (fileI != null) {
            return fileI.exists();
        }
        return false;
    }
}
