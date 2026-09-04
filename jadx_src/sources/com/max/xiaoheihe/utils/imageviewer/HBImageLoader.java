package com.max.xiaoheihe.utils.imageviewer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import androidx.collection.z0;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.target.p;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.heybox.imageviewer.widgets.video.ExoVideoView2;
import com.max.hbimage.bean.common.BackimageObj;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import io.reactivex.b0;
import io.reactivex.c0;
import io.reactivex.z;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: HBImageLoader.kt */
/* JADX INFO: loaded from: classes13.dex */
@t0({"SMAP\nHBImageLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HBImageLoader.kt\ncom/max/xiaoheihe/utils/imageviewer/HBImageLoader\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,254:1\n49#2,4:255\n*S KotlinDebug\n*F\n+ 1 HBImageLoader.kt\ncom/max/xiaoheihe/utils/imageviewer/HBImageLoader\n*L\n43#1:255,4\n*E\n"})
@o(parameters = 0)
public final class HBImageLoader implements com.heybox.imageviewer.core.b, com.max.xiaoheihe.utils.imageviewer.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final a f95433e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f95434f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final z0<String, ImageSource> f95435g = new z0<>(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final l0 f95436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final q0 f95437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final ConcurrentHashMap<String, Boolean> f95438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f95439d;

    /* JADX INFO: compiled from: HBImageLoader.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final z0<String, ImageSource> a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49153, new Class[0], z0.class);
            return patchProxyResultProxy.isSupported ? (z0) patchProxyResultProxy.result : HBImageLoader.f95435g;
        }
    }

    /* JADX INFO: compiled from: HBImageLoader.kt */
    public static final class b<T> implements kh.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RecyclerView.ViewHolder f95441c;

        b(RecyclerView.ViewHolder viewHolder) {
            this.f95441c = viewHolder;
        }

        public final void a(io.reactivex.disposables.b bVar) {
            View viewF;
            if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 49168, new Class[]{io.reactivex.disposables.b.class}, Void.TYPE).isSupported || (viewF = HBImageLoader.f(HBImageLoader.this, this.f95441c)) == null) {
                return;
            }
            viewF.setVisibility(0);
        }

        @Override // kh.g
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 49169, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((io.reactivex.disposables.b) obj);
        }
    }

    /* JADX INFO: compiled from: HBImageLoader.kt */
    public static final class c implements kh.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RecyclerView.ViewHolder f95443c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f95444d;

        c(RecyclerView.ViewHolder viewHolder, String str) {
            this.f95443c = viewHolder;
            this.f95444d = str;
        }

        @Override // kh.a
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49170, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            View viewF = HBImageLoader.f(HBImageLoader.this, this.f95443c);
            if (viewF != null) {
                viewF.setVisibility(8);
            }
            HBImageLoader.this.f95438c.put(this.f95444d, Boolean.FALSE);
        }
    }

    /* JADX INFO: compiled from: HBImageLoader.kt */
    @t0({"SMAP\nHBImageLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HBImageLoader.kt\ncom/max/xiaoheihe/utils/imageviewer/HBImageLoader$load$6\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,254:1\n1#2:255\n*E\n"})
    public static final class d<T> implements kh.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageSource f95445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SubsamplingScaleImageView f95446c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ HBImageLoader f95447d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ MediaData f95448e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f95449f;

        d(ImageSource imageSource, SubsamplingScaleImageView subsamplingScaleImageView, HBImageLoader hBImageLoader, MediaData mediaData, String str) {
            this.f95445b = imageSource;
            this.f95446c = subsamplingScaleImageView;
            this.f95447d = hBImageLoader;
            this.f95448e = mediaData;
            this.f95449f = str;
        }

        public final void a(File file) {
            if (PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, 49171, new Class[]{File.class}, Void.TYPE).isSupported) {
                return;
            }
            if (this.f95445b == null) {
                SubsamplingScaleImageView subsamplingScaleImageView = this.f95446c;
                ImageSource source = ImageSource.uri(Uri.fromFile(file));
                String str = this.f95449f;
                z0<String, ImageSource> z0VarA = HBImageLoader.f95433e.a();
                f0.o(source, "source");
                z0VarA.j(str, source);
                subsamplingScaleImageView.setImage(source);
            }
            HBImageLoader hBImageLoader = this.f95447d;
            String path = file.getPath();
            f0.o(path, "it.path");
            hBImageLoader.c(path, this.f95448e);
        }

        @Override // kh.g
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 49172, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((File) obj);
        }
    }

    /* JADX INFO: compiled from: HBImageLoader.kt */
    public static final class e<T> implements kh.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e<T> f95450b = new e<>();
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        public final void a(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 49173, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.f74531b.v("ImageLoader doOnError");
        }

        @Override // kh.g
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 49174, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((Throwable) obj);
        }
    }

    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @t0({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 HBImageLoader.kt\ncom/max/xiaoheihe/utils/imageviewer/HBImageLoader\n*L\n1#1,110:1\n44#2,2:111\n*E\n"})
    public static final class f extends kotlin.coroutines.a implements l0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        public f(l0.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.l0
        public void C(@dl.d CoroutineContext coroutineContext, @dl.d Throwable th2) {
            com.max.heybox.hblog.g gVarZ;
            if (PatchProxy.proxy(new Object[]{coroutineContext, th2}, this, changeQuickRedirect, false, 49192, new Class[]{CoroutineContext.class, Throwable.class}, Void.TYPE).isSupported || (gVarZ = com.max.heybox.hblog.g.f74531b.z()) == null) {
                return;
            }
            gVarZ.s0(kotlin.o.i(th2));
        }
    }

    /* JADX INFO: compiled from: HBImageLoader.kt */
    public static final class g<T> implements c0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f95451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f95452b;

        g(View view, String str) {
            this.f95451a = view;
            this.f95452b = str;
        }

        @Override // io.reactivex.c0
        public final void a(@dl.d b0<File> it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 49193, new Class[]{b0.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            try {
                it.onNext(Glide.G(this.f95451a).u().load(this.f95452b).V1().get());
                it.onComplete();
            } catch (Throwable th2) {
                if (it.isDisposed()) {
                    return;
                }
                it.onError(th2);
            }
        }
    }

    public HBImageLoader() {
        f fVar = new f(l0.INSTANCE);
        this.f95436a = fVar;
        this.f95437b = r0.a(e1.c().I(fVar));
        this.f95438c = new ConcurrentHashMap<>();
    }

    public static final /* synthetic */ View f(HBImageLoader hBImageLoader, RecyclerView.ViewHolder viewHolder) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hBImageLoader, viewHolder}, null, changeQuickRedirect, true, 49152, new Class[]{HBImageLoader.class, RecyclerView.ViewHolder.class}, View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : hBImageLoader.i(viewHolder);
    }

    private final View i(RecyclerView.ViewHolder viewHolder) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewHolder}, this, changeQuickRedirect, false, 49151, new Class[]{RecyclerView.ViewHolder.class}, View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : viewHolder.itemView.findViewById(R.id.progress_indicator);
    }

    private final z<File> n(View view, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, str}, this, changeQuickRedirect, false, 49150, new Class[]{View.class, String.class}, z.class);
        if (patchProxyResultProxy.isSupported) {
            return (z) patchProxyResultProxy.result;
        }
        z<File> zVarQ1 = z.q1(new g(view, str));
        f0.o(zVarQ1, "view: View, url: String)…)\n            }\n        }");
        return zVarQ1;
    }

    @Override // com.heybox.imageviewer.core.b
    public void a(@dl.d ExoVideoView2 exoVideoView, @dl.d com.heybox.imageviewer.core.d data, @dl.d RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.proxy(new Object[]{exoVideoView, data, viewHolder}, this, changeQuickRedirect, false, 49147, new Class[]{ExoVideoView2.class, com.heybox.imageviewer.core.d.class, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(exoVideoView, "exoVideoView");
        f0.p(data, "data");
        f0.p(viewHolder, "viewHolder");
    }

    @Override // com.heybox.imageviewer.core.b
    public void b(@dl.d SubsamplingScaleImageView subsamplingView, @dl.d com.heybox.imageviewer.core.d data, @dl.d RecyclerView.ViewHolder viewHolder) {
        String strD;
        if (PatchProxy.proxy(new Object[]{subsamplingView, data, viewHolder}, this, changeQuickRedirect, false, 49149, new Class[]{SubsamplingScaleImageView.class, com.heybox.imageviewer.core.d.class, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(subsamplingView, "subsamplingView");
        f0.p(data, "data");
        f0.p(viewHolder, "viewHolder");
        MediaData mediaData = data instanceof MediaData ? (MediaData) data : null;
        if (mediaData == null || (strD = mediaData.D()) == null) {
            return;
        }
        Boolean bool = this.f95438c.get(strD);
        Boolean bool2 = Boolean.TRUE;
        if (!f0.g(bool, bool2)) {
            this.f95438c.put(strD, bool2);
            ImageSource imageSourceF = f95435g.f(strD);
            if (imageSourceF != null) {
                subsamplingView.setImage(imageSourceF);
            }
            n(subsamplingView, strD).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).Y1(new b(viewHolder)).P1(new c(viewHolder, strD)).X1(new d(imageSourceF, subsamplingView, this, mediaData, strD)).V1(e.f95450b).g(new ObserverAdapter(ExtentionsKt.d(subsamplingView).getLifecycle()));
            return;
        }
        com.max.heybox.hblog.g.f74531b.W("图片" + strD + " 已在加载中");
    }

    @Override // com.max.xiaoheihe.utils.imageviewer.a
    @dl.d
    public d2 c(@dl.d String path, @dl.d MediaData mediaData) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{path, mediaData}, this, changeQuickRedirect, false, 49143, new Class[]{String.class, MediaData.class}, d2.class);
        if (patchProxyResultProxy.isSupported) {
            return (d2) patchProxyResultProxy.result;
        }
        f0.p(path, "path");
        f0.p(mediaData, "mediaData");
        return k.f(this.f95437b, null, null, new HBImageLoader$parseQRCode$1(mediaData, path, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    @Override // com.heybox.imageviewer.core.b
    @dl.e
    public Object d(@dl.d Context context, @dl.d String str, @dl.d kotlin.coroutines.c<? super Boolean> cVar) throws Throwable {
        HBImageLoader$loadedCheck$1 hBImageLoader$loadedCheck$1;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, cVar}, this, changeQuickRedirect, false, 49148, new Class[]{Context.class, String.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (cVar instanceof HBImageLoader$loadedCheck$1) {
            hBImageLoader$loadedCheck$1 = (HBImageLoader$loadedCheck$1) cVar;
            int i10 = hBImageLoader$loadedCheck$1.f95489d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hBImageLoader$loadedCheck$1.f95489d = i10 - Integer.MIN_VALUE;
            } else {
                hBImageLoader$loadedCheck$1 = new HBImageLoader$loadedCheck$1(this, cVar);
            }
        } else {
            hBImageLoader$loadedCheck$1 = new HBImageLoader$loadedCheck$1(this, cVar);
        }
        Object objH = hBImageLoader$loadedCheck$1.f95487b;
        Object objH2 = kotlin.coroutines.intrinsics.b.h();
        int i11 = hBImageLoader$loadedCheck$1.f95489d;
        File file = null;
        try {
            if (i11 == 0) {
                kotlin.t0.n(objH);
                CoroutineDispatcher coroutineDispatcherC = e1.c();
                HBImageLoader$loadedCheck$file$1 hBImageLoader$loadedCheck$file$1 = new HBImageLoader$loadedCheck$file$1(context, str, null);
                hBImageLoader$loadedCheck$1.f95489d = 1;
                objH = i.h(coroutineDispatcherC, hBImageLoader$loadedCheck$file$1, hBImageLoader$loadedCheck$1);
                if (objH == objH2) {
                    return objH2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(objH);
            }
            file = (File) objH;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return kotlin.coroutines.jvm.internal.a.a(file != null);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v34, types: [T, java.lang.String] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.heybox.imageviewer.core.b
    public void e(@dl.d final ImageView view, @dl.d com.heybox.imageviewer.core.d data, @dl.d final RecyclerView.ViewHolder viewHolder) {
        ?? D;
        ?? normal;
        if (PatchProxy.proxy(new Object[]{view, data, viewHolder}, this, changeQuickRedirect, false, 49146, new Class[]{ImageView.class, com.heybox.imageviewer.core.d.class, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        f0.p(data, "data");
        f0.p(viewHolder, "viewHolder");
        final MediaData mediaData = data instanceof MediaData ? (MediaData) data : null;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (mediaData == null || (D = mediaData.D()) == 0) {
            return;
        }
        objectRef.f124891b = D;
        final BackimageObj backimageObjK = com.max.hbimage.b.k(D);
        if (backimageObjK != null && (normal = backimageObjK.getNormal()) != 0) {
            objectRef.f124891b = normal;
        }
        Boolean bool = this.f95438c.get(objectRef.f124891b);
        Boolean bool2 = Boolean.TRUE;
        if (f0.g(bool, bool2)) {
            com.max.heybox.hblog.g.f74531b.W("图片" + ((String) objectRef.f124891b) + " 已在加载中");
            return;
        }
        this.f95438c.put((String) objectRef.f124891b, bool2);
        View viewI = i(viewHolder);
        if (viewI != null) {
            viewI.setVisibility(0);
        }
        com.max.heybox.hblog.g.f74531b.q("加载图片: " + ((MediaData) data).A());
        final yh.a<b2> aVar = new yh.a<b2>() { // from class: com.max.xiaoheihe.utils.imageviewer.HBImageLoader$load$onLoadFailed$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49176, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49175, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                this.f95479b.f95438c.put(objectRef.f124891b, Boolean.FALSE);
                View viewF = HBImageLoader.f(this.f95479b, viewHolder);
                if (viewF == null) {
                    return;
                }
                viewF.setVisibility(8);
            }
        };
        final yh.a<d2> aVar2 = new yh.a<d2>() { // from class: com.max.xiaoheihe.utils.imageviewer.HBImageLoader$load$onResourceReady$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @d
            public final d2 a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49177, new Class[0], d2.class);
                if (patchProxyResultProxy.isSupported) {
                    return (d2) patchProxyResultProxy.result;
                }
                mediaData.H(objectRef.f124891b);
                this.f95438c.put(objectRef.f124891b, Boolean.FALSE);
                View viewF = HBImageLoader.f(this, viewHolder);
                if (viewF != null) {
                    viewF.setVisibility(8);
                }
                return this.k(view, mediaData);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlinx.coroutines.d2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ d2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49178, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        };
        final WeakReference weakReference = new WeakReference(view);
        if (this.f95439d) {
            Glide.G(view).l().load((String) objectRef.f124891b).F0(view.getDrawable()).E1(new com.bumptech.glide.request.g<Bitmap>() { // from class: com.max.xiaoheihe.utils.imageviewer.HBImageLoader$load$2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.bumptech.glide.request.g
                public boolean a(@e GlideException glideException, @e Object obj, @d p<Bitmap> target, boolean z10) {
                    Object[] objArr = {glideException, obj, target, new Byte(z10 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    Class cls = Boolean.TYPE;
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49154, new Class[]{GlideException.class, Object.class, p.class, cls}, cls);
                    if (patchProxyResultProxy.isSupported) {
                        return ((Boolean) patchProxyResultProxy.result).booleanValue();
                    }
                    f0.p(target, "target");
                    BackimageObj backimageObj = backimageObjK;
                    if ((backimageObj != null ? backimageObj.getBackup() : null) == null) {
                        aVar.invoke();
                    } else {
                        k.f(r0.a(e1.e()), null, null, new HBImageLoader$load$2$onLoadFailed$1(weakReference, backimageObjK, mediaData, this, viewHolder, null), 3, null);
                    }
                    return false;
                }

                @Override // com.bumptech.glide.request.g
                public /* bridge */ /* synthetic */ boolean b(Bitmap bitmap, Object obj, p<Bitmap> pVar, DataSource dataSource, boolean z10) {
                    Object[] objArr = {bitmap, obj, pVar, dataSource, new Byte(z10 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    Class cls = Boolean.TYPE;
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49156, new Class[]{Object.class, Object.class, p.class, DataSource.class, cls}, cls);
                    return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : c(bitmap, obj, pVar, dataSource, z10);
                }

                public boolean c(@d Bitmap resource, @d Object model, @e p<Bitmap> pVar, @d DataSource dataSource, boolean z10) {
                    Object[] objArr = {resource, model, pVar, dataSource, new Byte(z10 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    Class cls = Boolean.TYPE;
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49155, new Class[]{Bitmap.class, Object.class, p.class, DataSource.class, cls}, cls);
                    if (patchProxyResultProxy.isSupported) {
                        return ((Boolean) patchProxyResultProxy.result).booleanValue();
                    }
                    f0.p(resource, "resource");
                    f0.p(model, "model");
                    f0.p(dataSource, "dataSource");
                    aVar2.invoke();
                    return false;
                }
            }).C1(view);
        } else {
            Glide.G(view).load((String) objectRef.f124891b).F0(view.getDrawable()).E1(new com.bumptech.glide.request.g<Drawable>() { // from class: com.max.xiaoheihe.utils.imageviewer.HBImageLoader$load$3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.bumptech.glide.request.g
                public boolean a(@e GlideException glideException, @e Object obj, @d p<Drawable> target, boolean z10) {
                    Object[] objArr = {glideException, obj, target, new Byte(z10 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    Class cls = Boolean.TYPE;
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49161, new Class[]{GlideException.class, Object.class, p.class, cls}, cls);
                    if (patchProxyResultProxy.isSupported) {
                        return ((Boolean) patchProxyResultProxy.result).booleanValue();
                    }
                    f0.p(target, "target");
                    BackimageObj backimageObj = backimageObjK;
                    if ((backimageObj != null ? backimageObj.getBackup() : null) == null) {
                        aVar.invoke();
                    } else {
                        k.f(r0.a(e1.e()), null, null, new HBImageLoader$load$3$onLoadFailed$1(weakReference, backimageObjK, mediaData, this, viewHolder, null), 3, null);
                    }
                    return false;
                }

                @Override // com.bumptech.glide.request.g
                public /* bridge */ /* synthetic */ boolean b(Drawable drawable, Object obj, p<Drawable> pVar, DataSource dataSource, boolean z10) {
                    Object[] objArr = {drawable, obj, pVar, dataSource, new Byte(z10 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    Class cls = Boolean.TYPE;
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49163, new Class[]{Object.class, Object.class, p.class, DataSource.class, cls}, cls);
                    return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : c(drawable, obj, pVar, dataSource, z10);
                }

                public boolean c(@d Drawable resource, @d Object model, @e p<Drawable> pVar, @d DataSource dataSource, boolean z10) {
                    Object[] objArr = {resource, model, pVar, dataSource, new Byte(z10 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    Class cls = Boolean.TYPE;
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49162, new Class[]{Drawable.class, Object.class, p.class, DataSource.class, cls}, cls);
                    if (patchProxyResultProxy.isSupported) {
                        return ((Boolean) patchProxyResultProxy.result).booleanValue();
                    }
                    f0.p(resource, "resource");
                    f0.p(model, "model");
                    f0.p(dataSource, "dataSource");
                    aVar2.invoke();
                    return false;
                }
            }).C1(view);
        }
    }

    public final boolean j() {
        return this.f95439d;
    }

    @dl.d
    public final d2 k(@dl.d View view, @dl.d MediaData mediaData) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, mediaData}, this, changeQuickRedirect, false, 49144, new Class[]{View.class, MediaData.class}, d2.class);
        if (patchProxyResultProxy.isSupported) {
            return (d2) patchProxyResultProxy.result;
        }
        f0.p(view, "view");
        f0.p(mediaData, "mediaData");
        return k.f(this.f95437b, null, null, new HBImageLoader$parseCachedImgQRCode$1(view, mediaData, this, null), 3, null);
    }

    public final void l() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49145, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        r0.f(this.f95437b, null, 1, null);
    }

    public final void m(boolean z10) {
        this.f95439d = z10;
    }
}
