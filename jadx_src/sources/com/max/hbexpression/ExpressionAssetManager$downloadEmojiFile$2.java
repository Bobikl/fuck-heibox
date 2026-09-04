package com.max.hbexpression;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: ExpressionAssetManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nExpressionAssetManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpressionAssetManager.kt\ncom/max/hbexpression/ExpressionAssetManager$downloadEmojiFile$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n1#2:301\n*E\n"})
@kotlin.coroutines.jvm.internal.d(c = "com.max.hbexpression.ExpressionAssetManager$downloadEmojiFile$2", f = "ExpressionAssetManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionAssetManager$downloadEmojiFile$2 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f69954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f69955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f69956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f69957e;

    /* JADX INFO: compiled from: ExpressionAssetManager.kt */
    public static final class a implements com.bumptech.glide.request.g<File> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.bumptech.glide.request.g
        public boolean a(@dl.e GlideException glideException, @dl.e Object obj, @dl.d com.bumptech.glide.request.target.p<File> target, boolean z10) {
            Object[] objArr = {glideException, obj, target, new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.QC, new Class[]{GlideException.class, Object.class, com.bumptech.glide.request.target.p.class, cls}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(target, "target");
            return false;
        }

        @Override // com.bumptech.glide.request.g
        public /* bridge */ /* synthetic */ boolean b(File file, Object obj, com.bumptech.glide.request.target.p<File> pVar, DataSource dataSource, boolean z10) {
            Object[] objArr = {file, obj, pVar, dataSource, new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.SC, new Class[]{Object.class, Object.class, com.bumptech.glide.request.target.p.class, DataSource.class, cls}, cls);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : c(file, obj, pVar, dataSource, z10);
        }

        public boolean c(@dl.d File resource, @dl.d Object model, @dl.e com.bumptech.glide.request.target.p<File> pVar, @dl.d DataSource dataSource, boolean z10) {
            Object[] objArr = {resource, model, pVar, dataSource, new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.RC, new Class[]{File.class, Object.class, com.bumptech.glide.request.target.p.class, DataSource.class, cls}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(resource, "resource");
            f0.p(model, "model");
            f0.p(dataSource, "dataSource");
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExpressionAssetManager$downloadEmojiFile$2(String str, String str2, String str3, kotlin.coroutines.c<? super ExpressionAssetManager$downloadEmojiFile$2> cVar) {
        super(2, cVar);
        this.f69955c = str;
        this.f69956d = str2;
        this.f69957e = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.f.NC, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new ExpressionAssetManager$downloadEmojiFile$2(this.f69955c, this.f69956d, this.f69957e, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.f.PC, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.f.OC, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((ExpressionAssetManager$downloadEmojiFile$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.f.MC, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f69954b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        ExpressionAssetManager expressionAssetManager = ExpressionAssetManager.f69919a;
        if (expressionAssetManager.u(this.f69955c, this.f69956d)) {
            return b2.f124493a;
        }
        com.bumptech.glide.request.d<File> dVarV1 = Glide.F(com.max.hbimage.image.l.a()).u().e1(new a()).load(this.f69957e).V1();
        f0.o(dVarV1, "submit(...)");
        File file = dVarV1.get(60L, TimeUnit.SECONDS);
        if (file != null) {
            File file2 = new File(expressionAssetManager.o(this.f69955c));
            if (file2.exists() || file2.mkdirs()) {
                File file3 = new File(file2, this.f69956d + com.max.mediaselector.lib.config.f.f75141t);
                FileInputStream fileInputStream = new FileInputStream(file);
                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = fileInputStream.read(bArr);
                    if (i10 <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i10);
                }
                fileInputStream.close();
                fileOutputStream.close();
            }
        }
        return b2.f124493a;
    }
}
