package com.max.xiaoheihe.module.bbs.post_edit;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.igexin.sdk.PushConsts;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.LinkImageObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.n2;

/* JADX INFO: compiled from: NewLinkEditFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.jvm.internal.t0({"SMAP\nNewLinkEditFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewLinkEditFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/NewLinkEditFragment$onImagesPicked$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,3759:1\n1002#2,2:3760\n1002#2,2:3762\n*S KotlinDebug\n*F\n+ 1 NewLinkEditFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/NewLinkEditFragment$onImagesPicked$1\n*L\n3347#1:3760,2\n3350#1:3762,2\n*E\n"})
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment$onImagesPicked$1", f = "NewLinkEditFragment.kt", i = {0, 0, 1, 1}, l = {bb.c.d.bn, bb.c.d.po}, m = "invokeSuspend", n = {"imgPathList", "params", "imgPathList", "params"}, s = {"L$0", "L$1", "L$0", "L$1"})
public final class NewLinkEditFragment$onImagesPicked$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f82210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f82211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f82212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ NewLinkEditFragment f82213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f82214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ ArrayList<Uri> f82215g;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment$onImagesPicked$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment$onImagesPicked$1$1", f = "NewLinkEditFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f82216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f82217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList<Uri> f82218d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList<LinkImageObj> f82219e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<LinkImageObj> f82220f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ NewLinkEditFragment f82221g;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment$onImagesPicked$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: NewLinkEditFragment.kt */
        @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment$onImagesPicked$1$1$1", f = "NewLinkEditFragment.kt", i = {0}, l = {bb.c.d.mn}, m = "invokeSuspend", n = {"linkImageObj"}, s = {"L$0"})
        public static final class C07091 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f82222b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f82223c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Uri f82224d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ ArrayList<Uri> f82225e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ ArrayList<LinkImageObj> f82226f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ List<LinkImageObj> f82227g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ NewLinkEditFragment f82228h;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment$onImagesPicked$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: NewLinkEditFragment.kt */
            @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment$onImagesPicked$1$1$1$1", f = "NewLinkEditFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C07101 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f82229b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ NewLinkEditFragment f82230c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C07101(NewLinkEditFragment newLinkEditFragment, kotlin.coroutines.c<? super C07101> cVar) {
                    super(2, cVar);
                    this.f82230c = newLinkEditFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 29996, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                    return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new C07101(this.f82230c, cVar);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 29998, new Class[]{Object.class, Object.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                }

                @dl.e
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 29997, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C07101) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                }

                /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29995, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    kotlin.coroutines.intrinsics.b.h();
                    if (this.f82229b != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.t0.n(obj);
                    if (this.f82230c.f82091c4 != null) {
                        LoadingDialog loadingDialog = this.f82230c.f82091c4;
                        kotlin.jvm.internal.f0.m(loadingDialog);
                        if (!loadingDialog.i()) {
                            NewLinkEditFragment newLinkEditFragment = this.f82230c;
                            Activity mContext = ((com.max.hbcommon.base.d) newLinkEditFragment).mContext;
                            kotlin.jvm.internal.f0.o(mContext, "mContext");
                            newLinkEditFragment.f82091c4 = new LoadingDialog(mContext, com.max.xiaoheihe.utils.d.n0(R.string.loading_picture)).r();
                        }
                    } else {
                        NewLinkEditFragment newLinkEditFragment2 = this.f82230c;
                        Activity mContext2 = ((com.max.hbcommon.base.d) newLinkEditFragment2).mContext;
                        kotlin.jvm.internal.f0.o(mContext2, "mContext");
                        newLinkEditFragment2.f82091c4 = new LoadingDialog(mContext2, com.max.xiaoheihe.utils.d.n0(R.string.loading_picture)).r();
                    }
                    return b2.f124493a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C07091(Uri uri, ArrayList<Uri> arrayList, ArrayList<LinkImageObj> arrayList2, List<LinkImageObj> list, NewLinkEditFragment newLinkEditFragment, kotlin.coroutines.c<? super C07091> cVar) {
                super(2, cVar);
                this.f82224d = uri;
                this.f82225e = arrayList;
                this.f82226f = arrayList2;
                this.f82227g = list;
                this.f82228h = newLinkEditFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 29992, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new C07091(this.f82224d, this.f82225e, this.f82226f, this.f82227g, this.f82228h, cVar);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 29994, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
            }

            @dl.e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 29993, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C07091) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                LinkImageObj linkImageObj;
                LinkImageObj linkImageObj2;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29991, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                Object objH = kotlin.coroutines.intrinsics.b.h();
                int i10 = this.f82223c;
                if (i10 == 0) {
                    kotlin.t0.n(obj);
                    linkImageObj = new LinkImageObj();
                    linkImageObj.setPath(this.f82224d.getPath());
                    linkImageObj.setDegree(String.valueOf(com.max.hbimage.b.v(this.f82224d.getPath())));
                    if (com.max.hbutils.utils.n.q(linkImageObj.getDegree()) == 0) {
                        int[] iArrX = com.max.hbimage.b.x(linkImageObj.getPath());
                        linkImageObj.setWidth(String.valueOf(iArrX[0]));
                        linkImageObj.setHeight(String.valueOf(iArrX[1]));
                    } else {
                        n2 n2VarE = e1.e();
                        C07101 c07101 = new C07101(this.f82228h, null);
                        this.f82222b = linkImageObj;
                        this.f82223c = 1;
                        if (kotlinx.coroutines.i.h(n2VarE, c07101, this) == objH) {
                            return objH;
                        }
                        linkImageObj2 = linkImageObj;
                    }
                    LinkImageObj linkImageObj3 = new LinkImageObj();
                    linkImageObj3.setHeight(linkImageObj.getHeight());
                    linkImageObj3.setWidth(linkImageObj.getWidth());
                    linkImageObj3.setPath(linkImageObj.getPath());
                    linkImageObj3.setIndex(this.f82225e.indexOf(this.f82224d));
                    String string = UUID.randomUUID().toString();
                    kotlin.jvm.internal.f0.o(string, "randomUUID().toString()");
                    linkImageObj3.setId(string);
                    this.f82226f.add(linkImageObj3);
                    LinkImageObj linkImageObj4 = new LinkImageObj();
                    linkImageObj4.setId(string);
                    linkImageObj4.setHeight(linkImageObj.getHeight());
                    linkImageObj4.setWidth(linkImageObj.getWidth());
                    linkImageObj4.setIndex(this.f82225e.indexOf(this.f82224d));
                    this.f82227g.add(linkImageObj4);
                    return b2.f124493a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                linkImageObj2 = (LinkImageObj) this.f82222b;
                kotlin.t0.n(obj);
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(linkImageObj2.getPath());
                Bitmap bitmapN0 = bitmapDecodeFile != null ? com.max.hbimage.b.n0(bitmapDecodeFile, com.max.hbutils.utils.n.q(linkImageObj2.getDegree())) : null;
                if (bitmapN0 == null) {
                    int[] iArrX2 = com.max.hbimage.b.x(linkImageObj2.getPath());
                    linkImageObj2.setWidth(String.valueOf(iArrX2[0]));
                    linkImageObj2.setHeight(String.valueOf(iArrX2[1]));
                } else {
                    kotlin.jvm.internal.f0.m(bitmapDecodeFile);
                    bitmapDecodeFile.recycle();
                    File file = new File(com.max.xiaoheihe.utils.d.Q());
                    if (file.exists() || file.mkdirs()) {
                        File file2 = new File(file, com.max.hbutils.utils.s.d(linkImageObj2.getPath()) + ".jpg");
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        bitmapN0.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                        fileOutputStream.close();
                        linkImageObj2.setPath(file2.getPath());
                        linkImageObj2.setWidth(String.valueOf(bitmapN0.getWidth()));
                        linkImageObj2.setHeight(String.valueOf(bitmapN0.getHeight()));
                    }
                }
                linkImageObj = linkImageObj2;
                LinkImageObj linkImageObj5 = new LinkImageObj();
                linkImageObj5.setHeight(linkImageObj.getHeight());
                linkImageObj5.setWidth(linkImageObj.getWidth());
                linkImageObj5.setPath(linkImageObj.getPath());
                linkImageObj5.setIndex(this.f82225e.indexOf(this.f82224d));
                String string2 = UUID.randomUUID().toString();
                kotlin.jvm.internal.f0.o(string2, "randomUUID().toString()");
                linkImageObj5.setId(string2);
                this.f82226f.add(linkImageObj5);
                LinkImageObj linkImageObj6 = new LinkImageObj();
                linkImageObj6.setId(string2);
                linkImageObj6.setHeight(linkImageObj.getHeight());
                linkImageObj6.setWidth(linkImageObj.getWidth());
                linkImageObj6.setIndex(this.f82225e.indexOf(this.f82224d));
                this.f82227g.add(linkImageObj6);
                return b2.f124493a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ArrayList<Uri> arrayList, ArrayList<LinkImageObj> arrayList2, List<LinkImageObj> list, NewLinkEditFragment newLinkEditFragment, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f82218d = arrayList;
            this.f82219e = arrayList2;
            this.f82220f = list;
            this.f82221g = newLinkEditFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 29988, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            if (patchProxyResultProxy.isSupported) {
                return (kotlin.coroutines.c) patchProxyResultProxy.result;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f82218d, this.f82219e, this.f82220f, this.f82221g, cVar);
            anonymousClass1.f82217c = obj;
            return anonymousClass1;
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 29990, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 29989, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29987, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.f82216b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) this.f82217c;
            Iterator<Uri> it = this.f82218d.iterator();
            while (it.hasNext()) {
                kotlinx.coroutines.k.f(q0Var, null, null, new C07091(it.next(), this.f82218d, this.f82219e, this.f82220f, this.f82221g, null), 3, null);
            }
            return b2.f124493a;
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment$onImagesPicked$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: NewLinkEditFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment$onImagesPicked$1$2", f = "NewLinkEditFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super LoadingDialog>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f82231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ NewLinkEditFragment f82232c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(NewLinkEditFragment newLinkEditFragment, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.f82232c = newLinkEditFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 30000, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass2(this.f82232c, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super LoadingDialog> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, PushConsts.ALIAS_OPERATE_PARAM_ERROR, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super LoadingDialog> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, PushConsts.ALIAS_ERROR_FREQUENCY, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29999, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.f82231b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            LoadingDialog loadingDialog = this.f82232c.f82091c4;
            if (loadingDialog != null) {
                return loadingDialog.c();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: Comparisons.kt */
    @kotlin.jvm.internal.t0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 NewLinkEditFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/NewLinkEditFragment$onImagesPicked$1\n*L\n1#1,328:1\n3348#2:329\n*E\n"})
    public static final class a<T> implements Comparator {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{t10, t11}, this, changeQuickRedirect, false, PushConsts.ALIAS_REQUEST_FILTER, new Class[]{Object.class, Object.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : kotlin.comparisons.g.l(Integer.valueOf(((LinkImageObj) t10).getIndex()), Integer.valueOf(((LinkImageObj) t11).getIndex()));
        }
    }

    /* JADX INFO: compiled from: Comparisons.kt */
    @kotlin.jvm.internal.t0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 NewLinkEditFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/NewLinkEditFragment$onImagesPicked$1\n*L\n1#1,328:1\n3351#2:329\n*E\n"})
    public static final class b<T> implements Comparator {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{t10, t11}, this, changeQuickRedirect, false, PushConsts.ALIAS_OPERATE_ALIAS_FAILED, new Class[]{Object.class, Object.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : kotlin.comparisons.g.l(Integer.valueOf(((LinkImageObj) t10).getIndex()), Integer.valueOf(((LinkImageObj) t11).getIndex()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NewLinkEditFragment$onImagesPicked$1(NewLinkEditFragment newLinkEditFragment, boolean z10, ArrayList<Uri> arrayList, kotlin.coroutines.c<? super NewLinkEditFragment$onImagesPicked$1> cVar) {
        super(2, cVar);
        this.f82213e = newLinkEditFragment;
        this.f82214f = z10;
        this.f82215g = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 29984, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new NewLinkEditFragment$onImagesPicked$1(this.f82213e, this.f82214f, this.f82215g, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 29986, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 29985, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((NewLinkEditFragment$onImagesPicked$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009c A[Catch: all -> 0x00ca, TryCatch #0 {all -> 0x00ca, blocks: (B:11:0x0037, B:27:0x0096, B:29:0x009c, B:30:0x00a4, B:32:0x00aa, B:33:0x00b2, B:35:0x00c4, B:16:0x004b, B:23:0x007b, B:19:0x0052), top: B:41:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00aa A[Catch: all -> 0x00ca, TryCatch #0 {all -> 0x00ca, blocks: (B:11:0x0037, B:27:0x0096, B:29:0x009c, B:30:0x00a4, B:32:0x00aa, B:33:0x00b2, B:35:0x00c4, B:16:0x004b, B:23:0x007b, B:19:0x0052), top: B:41:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c4 A[Catch: all -> 0x00ca, TRY_LEAVE, TryCatch #0 {all -> 0x00ca, blocks: (B:11:0x0037, B:27:0x0096, B:29:0x009c, B:30:0x00a4, B:32:0x00aa, B:33:0x00b2, B:35:0x00c4, B:16:0x004b, B:23:0x007b, B:19:0x0052), top: B:41:0x0029 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        ArrayList arrayList;
        List list;
        List list2;
        ArrayList arrayList2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29983, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f82212d;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    list = (List) this.f82211c;
                    arrayList = (ArrayList) this.f82210b;
                    kotlin.t0.n(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list2 = (List) this.f82211c;
                    arrayList2 = (ArrayList) this.f82210b;
                    kotlin.t0.n(obj);
                }
                if (list2.size() > 1) {
                    kotlin.collections.w.m0(list2, new a());
                }
                if (arrayList2.size() > 1) {
                    kotlin.collections.w.m0(arrayList2, new b());
                }
                NewLinkEditFragment.k5(this.f82213e, com.max.hbutils.utils.k.p(list2));
                NewLinkEditFragment.j5(this.f82213e, arrayList2, false);
                if (this.f82214f) {
                    NewLinkEditFragment.H5(this.f82213e);
                }
                return b2.f124493a;
            }
            kotlin.t0.n(obj);
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f82215g, arrayList3, arrayList4, this.f82213e, null);
            this.f82210b = arrayList3;
            this.f82211c = arrayList4;
            this.f82212d = 1;
            if (kotlinx.coroutines.r0.g(anonymousClass1, this) == objH) {
                return objH;
            }
            arrayList = arrayList3;
            list = arrayList4;
            n2 n2VarE = e1.e();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f82213e, null);
            this.f82210b = arrayList;
            this.f82211c = list;
            this.f82212d = 2;
            if (kotlinx.coroutines.i.h(n2VarE, anonymousClass2, this) == objH) {
                return objH;
            }
            list2 = list;
            arrayList2 = arrayList;
            if (list2.size() > 1) {
                kotlin.collections.w.m0(list2, new a());
            }
            if (arrayList2.size() > 1) {
                kotlin.collections.w.m0(arrayList2, new b());
            }
            NewLinkEditFragment.k5(this.f82213e, com.max.hbutils.utils.k.p(list2));
            NewLinkEditFragment.j5(this.f82213e, arrayList2, false);
            if (this.f82214f) {
                NewLinkEditFragment.H5(this.f82213e);
            }
            return b2.f124493a;
        } catch (Throwable th2) {
            com.max.hbutils.utils.c.f(this.f82213e.getString(R.string.fail) + ": " + th2.getMessage());
        }
    }
}
