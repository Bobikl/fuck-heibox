package com.max.hbexpression;

import android.text.TextUtils;
import com.max.hbcommon.utils.r;
import com.max.hbexpression.bean.EmojiGroupObj;
import com.max.hbexpression.bean.EmojiItemtObj;
import com.max.network.interfaces.ResultHandler;
import com.max.network.model.RemoteDataSource;
import com.max.network.utils.DownloadResultBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.t;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: ExpressionAssetManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nExpressionAssetManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpressionAssetManager.kt\ncom/max/hbexpression/ExpressionAssetManager$downloadEmojiAsset$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,300:1\n1549#2:301\n1620#2,3:302\n13309#3,2:305\n*S KotlinDebug\n*F\n+ 1 ExpressionAssetManager.kt\ncom/max/hbexpression/ExpressionAssetManager$downloadEmojiAsset$2\n*L\n94#1:301\n94#1:302,3\n98#1:305,2\n*E\n"})
@kotlin.coroutines.jvm.internal.d(c = "com.max.hbexpression.ExpressionAssetManager$downloadEmojiAsset$2", f = "ExpressionAssetManager.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionAssetManager$downloadEmojiAsset$2 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f69938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ EmojiGroupObj f69939c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExpressionAssetManager$downloadEmojiAsset$2(EmojiGroupObj emojiGroupObj, kotlin.coroutines.c<? super ExpressionAssetManager$downloadEmojiAsset$2> cVar) {
        super(2, cVar);
        this.f69939c = emojiGroupObj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.f.oC, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new ExpressionAssetManager$downloadEmojiAsset$2(this.f69939c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.f.qC, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.f.pC, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((ExpressionAssetManager$downloadEmojiAsset$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Exception {
        int i10 = 1;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.f.nC, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = this.f69938b;
        ResultHandler resultHandler = null;
        Object[] objArr = 0;
        if (i11 == 0) {
            kotlin.t0.n(obj);
            EmojiGroupObj emojiGroupObj = this.f69939c;
            if (emojiGroupObj == null) {
                return null;
            }
            final String group_code = emojiGroupObj.getGroup_code();
            ExpressionAssetManager expressionAssetManager = ExpressionAssetManager.f69919a;
            f0.m(group_code);
            final String strO = expressionAssetManager.o(group_code);
            File file = new File(strO);
            if (file.exists() && file.isDirectory()) {
                List<EmojiItemtObj> emojis = emojiGroupObj.getEmojis();
                f0.o(emojis, "getEmojis(...)");
                ArrayList arrayList = new ArrayList(t.Y(emojis, 10));
                Iterator<T> it = emojis.iterator();
                while (it.hasNext()) {
                    arrayList.add(((EmojiItemtObj) it.next()).getCode() + com.max.mediaselector.lib.config.f.f75141t);
                }
                List listT5 = CollectionsKt___CollectionsKt.T5(arrayList);
                listT5.add(group_code + com.max.mediaselector.lib.config.f.f75141t);
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        if (!listT5.contains(file2.getName())) {
                            com.max.heybox.hblog.g.f74531b.q("ExpressionAssetManager, delete " + file2.getAbsolutePath() + ", codes = " + listT5);
                            com.max.hbcommon.utils.f.a(file2);
                        }
                    }
                }
            }
            if (!file.exists() && !file.mkdirs()) {
                throw new Exception("emoji group dir not exist");
            }
            DownloadResultBuilder<String> downloadResultBuilder = new DownloadResultBuilder<>(null, 1, null);
            downloadResultBuilder.setOnSuccess(new yh.l<String, b2>() { // from class: com.max.hbexpression.ExpressionAssetManager$downloadEmojiAsset$2$1$listener$1$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: com.max.hbexpression.ExpressionAssetManager$downloadEmojiAsset$2$1$listener$1$1$1, reason: invalid class name */
                /* JADX INFO: compiled from: ExpressionAssetManager.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.max.hbexpression.ExpressionAssetManager$downloadEmojiAsset$2$1$listener$1$1$1", f = "ExpressionAssetManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                public static final class AnonymousClass1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f69944b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ String f69945c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ String f69946d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(String str, String str2, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.f69945c = str;
                        this.f69946d = str2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.d
                    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.f.yC, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f69945c, this.f69946d, cVar);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.f.AC, new Class[]{Object.class, Object.class}, Object.class);
                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                    }

                    @dl.e
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.f.zC, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.f.xC, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        kotlin.coroutines.intrinsics.b.h();
                        if (this.f69944b != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.t0.n(obj);
                        String str = this.f69945c;
                        if (str != null) {
                            r.f68262a.c(new File(str), this.f69946d, ExpressionAssetManager$downloadEmojiAsset$2$1$listener$1$1$1$1$1.f69947b);
                            com.max.hbcommon.utils.f.a(new File(str));
                        }
                        return b2.f124493a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(String str) {
                    PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.f.wC, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy2.isSupported) {
                        return patchProxyResultProxy2.result;
                    }
                    invoke2(str);
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@dl.e String str) {
                    if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.f.vC, new Class[]{String.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    com.max.heybox.hblog.g.f74531b.q("ExpressionAssetManager, download group " + group_code + " success on " + str);
                    kotlinx.coroutines.k.f(r0.a(e1.c()), null, null, new AnonymousClass1(str, strO, null), 3, null);
                }
            });
            downloadResultBuilder.setOnError(new yh.l<Throwable, b2>() { // from class: com.max.hbexpression.ExpressionAssetManager$downloadEmojiAsset$2$1$listener$1$2
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) throws Throwable {
                    PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.f.DC, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy2.isSupported) {
                        return patchProxyResultProxy2.result;
                    }
                    invoke2(th2);
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@dl.d Throwable it2) throws Throwable {
                    if (PatchProxy.proxy(new Object[]{it2}, this, changeQuickRedirect, false, bb.c.f.CC, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(it2, "it");
                    throw it2;
                }
            });
            if (!TextUtils.isEmpty(emojiGroupObj.getSource_url())) {
                RemoteDataSource remoteDataSource = new RemoteDataSource(resultHandler, i10, objArr == true ? 1 : 0);
                ExpressionAssetManager expressionAssetManager2 = ExpressionAssetManager.f69919a;
                String group_code2 = emojiGroupObj.getGroup_code();
                f0.o(group_code2, "getGroup_code(...)");
                String strM = expressionAssetManager2.m(group_code2);
                ExpressionAssetManager$downloadEmojiAsset$2$1$2 expressionAssetManager$downloadEmojiAsset$2$1$2 = new ExpressionAssetManager$downloadEmojiAsset$2$1$2(emojiGroupObj, null);
                this.f69938b = 1;
                if (remoteDataSource.downloadFile(strM, downloadResultBuilder, expressionAssetManager$downloadEmojiAsset$2$1$2, this) == objH) {
                    return objH;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        return b2.f124493a;
    }
}
