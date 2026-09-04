package com.max.hbexpression;

import com.max.hbexpression.bean.EmojiGroupObj;
import com.max.hbexpression.bean.EmojisListResultObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.t;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: ExpressionAssetManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nExpressionAssetManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpressionAssetManager.kt\ncom/max/hbexpression/ExpressionAssetManager$downloadEmojiAssets$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,300:1\n1855#2,2:301\n1549#2:303\n1620#2,3:304\n*S KotlinDebug\n*F\n+ 1 ExpressionAssetManager.kt\ncom/max/hbexpression/ExpressionAssetManager$downloadEmojiAssets$1\n*L\n42#1:301,2\n48#1:303\n48#1:304,3\n*E\n"})
@kotlin.coroutines.jvm.internal.d(c = "com.max.hbexpression.ExpressionAssetManager$downloadEmojiAssets$1", f = "ExpressionAssetManager.kt", i = {}, l = {43, 53}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionAssetManager$downloadEmojiAssets$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f69949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f69950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ EmojisListResultObj f69951d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExpressionAssetManager$downloadEmojiAssets$1(EmojisListResultObj emojisListResultObj, kotlin.coroutines.c<? super ExpressionAssetManager$downloadEmojiAssets$1> cVar) {
        super(2, cVar);
        this.f69951d = emojisListResultObj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.f.FC, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (kotlin.coroutines.c) patchProxyResultProxy.result;
        }
        ExpressionAssetManager$downloadEmojiAssets$1 expressionAssetManager$downloadEmojiAssets$1 = new ExpressionAssetManager$downloadEmojiAssets$1(this.f69951d, cVar);
        expressionAssetManager$downloadEmojiAssets$1.f69950c = obj;
        return expressionAssetManager$downloadEmojiAssets$1;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.f.HC, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.f.GC, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((ExpressionAssetManager$downloadEmojiAssets$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b4 A[Catch: Exception -> 0x0085, LOOP:1: B:30:0x00ae->B:32:0x00b4, LOOP_END, TryCatch #0 {Exception -> 0x0085, blocks: (B:21:0x006c, B:23:0x0072, B:29:0x0088, B:30:0x00ae, B:32:0x00b4, B:33:0x00c2), top: B:42:0x006c }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        ExpressionAssetManager$downloadEmojiAssets$1 expressionAssetManager$downloadEmojiAssets$1;
        Iterator it;
        ArrayList arrayList;
        Iterator<T> it2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.f.EC, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f69949b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    it = (Iterator) this.f69950c;
                    kotlin.t0.n(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.t0.n(obj);
                    expressionAssetManager$downloadEmojiAssets$1 = this;
                }
                com.max.hbcache.b.h("emoji_config_cache", expressionAssetManager$downloadEmojiAssets$1.f69951d);
                return b2.f124493a;
            }
            kotlin.t0.n(obj);
            q0 q0Var = (q0) this.f69950c;
            List<EmojiGroupObj> emoji_groups = this.f69951d.getEmoji_groups();
            if (emoji_groups != null) {
                kotlinx.coroutines.k.f(q0Var, ExpressionAssetManager.f69919a.q(), null, new ExpressionAssetManager$downloadEmojiAssets$1$1$1(emoji_groups, null), 2, null);
                it = emoji_groups.iterator();
            } else {
                expressionAssetManager$downloadEmojiAssets$1 = this;
            }
            com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ExpressionAssetManager, downloadEmojiAssets over group: ");
            List<EmojiGroupObj> emoji_groups2 = expressionAssetManager$downloadEmojiAssets$1.f69951d.getEmoji_groups();
            f0.o(emoji_groups2, "getEmoji_groups(...)");
            arrayList = new ArrayList(t.Y(emoji_groups2, 10));
            it2 = emoji_groups2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((EmojiGroupObj) it2.next()).getGroup_name());
            }
            sb2.append(CollectionsKt___CollectionsKt.h3(CollectionsKt___CollectionsKt.Q5(arrayList), ", ", null, null, 0, null, null, 62, null));
            aVar.q(sb2.toString());
            com.max.hbcache.b.h("emoji_config_cache", expressionAssetManager$downloadEmojiAssets$1.f69951d);
            return b2.f124493a;
            expressionAssetManager$downloadEmojiAssets$1 = this;
            while (it.hasNext()) {
                try {
                    EmojiGroupObj emojiGroupObj = (EmojiGroupObj) it.next();
                    ExpressionAssetManager expressionAssetManager = ExpressionAssetManager.f69919a;
                    expressionAssetManager$downloadEmojiAssets$1.f69950c = it;
                    expressionAssetManager$downloadEmojiAssets$1.f69949b = 1;
                    if (expressionAssetManager.f(emojiGroupObj, expressionAssetManager$downloadEmojiAssets$1) == objH) {
                        return objH;
                    }
                } catch (Exception e10) {
                    e = e10;
                    com.max.heybox.hblog.g.f74531b.q("ExpressionAssetManager, downloadEmojiAssets got " + e);
                    ExpressionAssetManager expressionAssetManager2 = ExpressionAssetManager.f69919a;
                    EmojisListResultObj emojisListResultObj = expressionAssetManager$downloadEmojiAssets$1.f69951d;
                    expressionAssetManager$downloadEmojiAssets$1.f69950c = null;
                    expressionAssetManager$downloadEmojiAssets$1.f69949b = 2;
                    if (expressionAssetManager2.d(emojisListResultObj, expressionAssetManager$downloadEmojiAssets$1) == objH) {
                        return objH;
                    }
                }
            }
            com.max.heybox.hblog.g.a aVar2 = com.max.heybox.hblog.g.f74531b;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("ExpressionAssetManager, downloadEmojiAssets over group: ");
            List<EmojiGroupObj> emoji_groups3 = expressionAssetManager$downloadEmojiAssets$1.f69951d.getEmoji_groups();
            f0.o(emoji_groups3, "getEmoji_groups(...)");
            arrayList = new ArrayList(t.Y(emoji_groups3, 10));
            it2 = emoji_groups3.iterator();
            while (it2.hasNext()) {
                arrayList.add(((EmojiGroupObj) it2.next()).getGroup_name());
            }
            sb3.append(CollectionsKt___CollectionsKt.h3(CollectionsKt___CollectionsKt.Q5(arrayList), ", ", null, null, 0, null, null, 62, null));
            aVar2.q(sb3.toString());
        } catch (Exception e11) {
            e = e11;
            expressionAssetManager$downloadEmojiAssets$1 = this;
        }
        com.max.hbcache.b.h("emoji_config_cache", expressionAssetManager$downloadEmojiAssets$1.f69951d);
        return b2.f124493a;
    }
}
