package com.max.hbexpression;

import com.max.hbexpression.bean.EmojiGroupObj;
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
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: ExpressionAssetManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nExpressionAssetManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpressionAssetManager.kt\ncom/max/hbexpression/ExpressionAssetManager$deleteExcessEmojiGroup$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,300:1\n1549#2:301\n1620#2,3:302\n13309#3,2:305\n*S KotlinDebug\n*F\n+ 1 ExpressionAssetManager.kt\ncom/max/hbexpression/ExpressionAssetManager$deleteExcessEmojiGroup$2\n*L\n64#1:301\n64#1:302,3\n73#1:305,2\n*E\n"})
@kotlin.coroutines.jvm.internal.d(c = "com.max.hbexpression.ExpressionAssetManager$deleteExcessEmojiGroup$2", f = "ExpressionAssetManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionAssetManager$deleteExcessEmojiGroup$2 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f69936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ List<EmojiGroupObj> f69937c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ExpressionAssetManager$deleteExcessEmojiGroup$2(List<? extends EmojiGroupObj> list, kotlin.coroutines.c<? super ExpressionAssetManager$deleteExcessEmojiGroup$2> cVar) {
        super(2, cVar);
        this.f69937c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.f.kC, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new ExpressionAssetManager$deleteExcessEmojiGroup$2(this.f69937c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.f.mC, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.f.lC, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((ExpressionAssetManager$deleteExcessEmojiGroup$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.f.jC, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f69936b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        File file = new File(ExpressionAssetManager.f69919a.l());
        if (file.exists() && file.isDirectory()) {
            List<EmojiGroupObj> list = this.f69937c;
            ArrayList arrayList = new ArrayList(t.Y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((EmojiGroupObj) it.next()).getGroup_name());
            }
            List listQ5 = CollectionsKt___CollectionsKt.Q5(arrayList);
            com.max.heybox.hblog.g.f74531b.q("ExpressionAssetManager, deleteUnusedEmojiGroup, new groups: " + CollectionsKt___CollectionsKt.h3(listQ5, ", ", null, null, 0, null, null, 62, null));
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isDirectory() && !listQ5.contains(file2.getName())) {
                        com.max.heybox.hblog.g.f74531b.q("ExpressionAssetManager, deleteUnusedEmojiGroup, delete group: " + file2.getName());
                        com.max.hbcommon.utils.f.a(file2);
                        file2.delete();
                    }
                }
            }
        }
        File file3 = new File(ExpressionAssetManager.f69919a.r());
        if (file3.exists()) {
            com.max.hbcommon.utils.f.a(file3);
        }
        return b2.f124493a;
    }
}
