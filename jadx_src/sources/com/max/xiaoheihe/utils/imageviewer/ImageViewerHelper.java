package com.max.xiaoheihe.utils.imageviewer;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.annotation.d0;
import androidx.compose.runtime.internal.o;
import com.heybox.imageviewer.core.h;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.utils.imageviewer.ui.HighResUICustomizer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.c;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.t0;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import xh.m;

/* JADX INFO: compiled from: ImageViewerHelper.kt */
/* JADX INFO: loaded from: classes13.dex */
@o(parameters = 0)
public final class ImageViewerHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final Companion f95500a = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f95501b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: ImageViewerHelper.kt */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @d
        @m
        public final a a(@d Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 49201, new Class[]{Context.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            return new a(context);
        }

        @d
        @m
        public final a b(@d Context context, @d b transformer) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, transformer}, this, changeQuickRedirect, false, 49202, new Class[]{Context.class, b.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            f0.p(transformer, "transformer");
            return new a(context, transformer);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0041  */
        /* JADX WARN: Code duplicated, block: B:35:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:38:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:40:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:50:0x0105  */
        /* JADX WARN: Instruction removed from duplicated block: B:35:0x00a4, please report this as an issue */
        @e
        @m
        public final Object c(@d Context context, @d String str, @d c<? super Boolean> cVar) {
            ImageViewerHelper$Companion$checkSSIV$1 imageViewerHelper$Companion$checkSSIV$1;
            Companion companion;
            Exception e10;
            String str2;
            int i10;
            Object obj;
            g gVarZ;
            File file;
            int i11;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, cVar}, this, changeQuickRedirect, false, 49204, new Class[]{Context.class, String.class, c.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            if (cVar instanceof ImageViewerHelper$Companion$checkSSIV$1) {
                imageViewerHelper$Companion$checkSSIV$1 = (ImageViewerHelper$Companion$checkSSIV$1) cVar;
                int i12 = imageViewerHelper$Companion$checkSSIV$1.f95508h;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    imageViewerHelper$Companion$checkSSIV$1.f95508h = i12 - Integer.MIN_VALUE;
                } else {
                    imageViewerHelper$Companion$checkSSIV$1 = new ImageViewerHelper$Companion$checkSSIV$1(this, cVar);
                }
            } else {
                imageViewerHelper$Companion$checkSSIV$1 = new ImageViewerHelper$Companion$checkSSIV$1(this, cVar);
            }
            Object obj2 = imageViewerHelper$Companion$checkSSIV$1.f95506f;
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i13 = imageViewerHelper$Companion$checkSSIV$1.f95508h;
            if (i13 == 0) {
                t0.n(obj2);
                try {
                    imageViewerHelper$Companion$checkSSIV$1.f95502b = this;
                    imageViewerHelper$Companion$checkSSIV$1.f95503c = context;
                    imageViewerHelper$Companion$checkSSIV$1.f95504d = str;
                    imageViewerHelper$Companion$checkSSIV$1.f95505e = 0;
                    imageViewerHelper$Companion$checkSSIV$1.f95508h = 1;
                    Object objE = e(context, str, imageViewerHelper$Companion$checkSSIV$1);
                    if (objE == objH) {
                        return objH;
                    }
                    companion = this;
                    obj = objE;
                    str2 = str;
                    i10 = 0;
                    file = (File) obj;
                } catch (Exception e11) {
                    companion = this;
                    e10 = e11;
                    str2 = str;
                    i10 = 0;
                    gVarZ = g.f74531b.z();
                    if (gVarZ != null) {
                        gVarZ.s0("get file from " + str2 + " failed: \n" + kotlin.o.i(e10));
                    }
                    file = null;
                    if (file != null) {
                        double dG = companion.g(context);
                        double dF = companion.f(context);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        BitmapFactory.decodeFile(file.getPath(), options);
                        i11 = options.outWidth;
                        int i14 = options.outHeight;
                        if (i11 > 0.0d) {
                            i10 = 1;
                        }
                    }
                    return kotlin.coroutines.jvm.internal.a.a(i10 != 0);
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i15 = imageViewerHelper$Companion$checkSSIV$1.f95505e;
                String str3 = (String) imageViewerHelper$Companion$checkSSIV$1.f95504d;
                Context context2 = (Context) imageViewerHelper$Companion$checkSSIV$1.f95503c;
                Companion companion2 = (Companion) imageViewerHelper$Companion$checkSSIV$1.f95502b;
                try {
                    t0.n(obj2);
                    i10 = i15;
                    context = context2;
                    companion = companion2;
                    obj = obj2;
                    str2 = str3;
                    try {
                        file = (File) obj;
                    } catch (Exception e12) {
                        e10 = e12;
                        gVarZ = g.f74531b.z();
                        if (gVarZ != null) {
                            gVarZ.s0("get file from " + str2 + " failed: \n" + kotlin.o.i(e10));
                        }
                        file = null;
                    }
                } catch (Exception e13) {
                    i10 = i15;
                    context = context2;
                    companion = companion2;
                    e10 = e13;
                    str2 = str3;
                    gVarZ = g.f74531b.z();
                    if (gVarZ != null) {
                        gVarZ.s0("get file from " + str2 + " failed: \n" + kotlin.o.i(e10));
                    }
                    file = null;
                    if (file != null) {
                        double dG2 = companion.g(context);
                        double dF2 = companion.f(context);
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        BitmapFactory.decodeFile(file.getPath(), options2);
                        i11 = options2.outWidth;
                        int i16 = options2.outHeight;
                        if (i11 > 0.0d) {
                            i10 = 1;
                        }
                    }
                    return kotlin.coroutines.jvm.internal.a.a(i10 != 0);
                }
            }
            if (file != null) {
                double dG3 = companion.g(context);
                double dF3 = companion.f(context);
                BitmapFactory.Options options3 = new BitmapFactory.Options();
                BitmapFactory.decodeFile(file.getPath(), options3);
                i11 = options3.outWidth;
                int i17 = options3.outHeight;
                if (i11 > 0.0d && i17 > 0.0d && dG3 > 0.0d && dF3 > 0.0d && i17 / i11 > (dF3 / dG3) + 0.2d) {
                    i10 = 1;
                }
            }
            return kotlin.coroutines.jvm.internal.a.a(i10 != 0);
        }

        @d
        @m
        public final ArrayList<View> d(@d View v10, int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{v10, new Integer(i10)}, this, changeQuickRedirect, false, 49203, new Class[]{View.class, Integer.TYPE}, ArrayList.class);
            if (patchProxyResultProxy.isSupported) {
                return (ArrayList) patchProxyResultProxy.result;
            }
            f0.p(v10, "v");
            ArrayList<View> arrayList = new ArrayList<>();
            int i11 = i10 + 1;
            for (int i12 = 0; i12 < i11; i12++) {
                if (i12 == i10) {
                    arrayList.add(v10);
                } else {
                    arrayList.add(null);
                }
            }
            return arrayList;
        }

        @e
        @m
        public final Object e(@d Context context, @d String str, @d c<? super File> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, cVar}, this, changeQuickRedirect, false, 49205, new Class[]{Context.class, String.class, c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : i.h(e1.c(), new ImageViewerHelper$Companion$getFileFromCache$2(context, str, null), cVar);
        }

        @m
        public final int f(@d Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 49207, new Class[]{Context.class}, Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            f0.p(context, "context");
            Object systemService = context.getSystemService("window");
            f0.n(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.heightPixels;
        }

        @m
        public final int g(@d Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 49206, new Class[]{Context.class}, Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            f0.p(context, "context");
            Object systemService = context.getSystemService("window");
            f0.n(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.widthPixels;
        }
    }

    /* JADX INFO: compiled from: ImageViewerHelper.kt */
    @kotlin.jvm.internal.t0({"SMAP\nImageViewerHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageViewerHelper.kt\ncom/max/xiaoheihe/utils/imageviewer/ImageViewerHelper$ImageViewerParamBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,392:1\n1#2:393\n*E\n"})
    @o(parameters = 0)
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f95512j = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @d
        private final q0 f95513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @d
        private final q0 f95514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private d2 f95515c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @d
        private final Context f95516d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @d
        private final b f95517e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @d
        private com.heybox.imageviewer.core.b f95518f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @d
        private com.heybox.imageviewer.core.i f95519g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @d
        private final ArrayList<MediaData> f95520h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f95521i;

        public a(@d Context ctx) {
            f0.p(ctx, "ctx");
            this.f95513a = r0.a(e1.c());
            this.f95514b = r0.a(e1.e());
            this.f95518f = new HBImageLoader();
            this.f95519g = new HighResUICustomizer();
            this.f95520h = new ArrayList<>();
            this.f95516d = ctx;
            this.f95517e = new b();
        }

        public a(@d Context ctx, @d b customTransformer) {
            f0.p(ctx, "ctx");
            f0.p(customTransformer, "customTransformer");
            this.f95513a = r0.a(e1.c());
            this.f95514b = r0.a(e1.e());
            this.f95518f = new HBImageLoader();
            this.f95519g = new HighResUICustomizer();
            this.f95520h = new ArrayList<>();
            this.f95516d = ctx;
            this.f95517e = customTransformer;
        }

        private final Activity b(Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 49227, new Class[]{Context.class}, Activity.class);
            if (patchProxyResultProxy.isSupported) {
                return (Activity) patchProxyResultProxy.result;
            }
            if (context == null) {
                return null;
            }
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (context instanceof ContextWrapper) {
                return b(((ContextWrapper) context).getBaseContext());
            }
            return null;
        }

        public static /* synthetic */ a o(a aVar, Context context, String[] strArr, String str, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, context, strArr, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 49216, new Class[]{a.class, Context.class, String[].class, String.class, Integer.TYPE, Object.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            if ((i10 & 4) != 0) {
                str = null;
            }
            return aVar.g(context, strArr, str);
        }

        @d
        public final a a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49225, new Class[0], a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            com.heybox.imageviewer.core.b bVar = this.f95518f;
            HBImageLoader hBImageLoader = bVar instanceof HBImageLoader ? (HBImageLoader) bVar : null;
            if (hBImageLoader != null) {
                hBImageLoader.m(true);
            }
            return this;
        }

        @d
        public final a c(@d com.heybox.imageviewer.core.b loader) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{loader}, this, changeQuickRedirect, false, 49223, new Class[]{com.heybox.imageviewer.core.b.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(loader, "loader");
            this.f95518f = loader;
            return this;
        }

        @d
        public final a d(int i10) {
            this.f95521i = i10;
            return this;
        }

        @d
        public final a e(@d com.heybox.imageviewer.core.i vhCustomizer) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{vhCustomizer}, this, changeQuickRedirect, false, 49224, new Class[]{com.heybox.imageviewer.core.i.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(vhCustomizer, "vhCustomizer");
            this.f95519g = vhCustomizer;
            return this;
        }

        @d
        public final a f(@d Context context, @d String url) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, url}, this, changeQuickRedirect, false, 49221, new Class[]{Context.class, String.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            f0.p(url, "url");
            this.f95520h.add(new MediaData(context, 0L, url));
            return this;
        }

        @d
        public final a g(@d Context context, @d String[] strArr, @e String str) {
            String[] urls = strArr;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, urls, str}, this, changeQuickRedirect, false, 49215, new Class[]{Context.class, String[].class, String.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            f0.p(urls, "urls");
            int length = urls.length;
            int i10 = 0;
            while (i10 < length) {
                String str2 = urls[i10];
                ArrayList<MediaData> arrayList = this.f95520h;
                long j10 = i10;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList.add(new MediaData(context, j10, str2, false, false, str, null, false, null, null, null, 2008, null));
                i10++;
                urls = strArr;
            }
            return this;
        }

        @d
        public final a h(@d View view, @d String url) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, url}, this, changeQuickRedirect, false, 49220, new Class[]{View.class, String.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(view, "view");
            f0.p(url, "url");
            this.f95520h.add(new MediaData(this.f95516d, 0L, url));
            if (view instanceof ImageView) {
                this.f95517e.d(0L, (ImageView) view);
            }
            return this;
        }

        @d
        public final a i(@d ViewGroup container, @d String url, @d0 int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{container, url, new Integer(i10)}, this, changeQuickRedirect, false, 49222, new Class[]{ViewGroup.class, String.class, Integer.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(container, "container");
            f0.p(url, "url");
            View viewFindViewById = container.findViewById(i10);
            this.f95520h.add(new MediaData(this.f95516d, 0L, url));
            if (viewFindViewById instanceof ImageView) {
                this.f95517e.d(0L, (ImageView) viewFindViewById);
            }
            return this;
        }

        @d
        public final a j(@d GridView container, @d String[] urls, @d0 int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{container, urls, new Integer(i10)}, this, changeQuickRedirect, false, 49218, new Class[]{GridView.class, String[].class, Integer.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(container, "container");
            f0.p(urls, "urls");
            int firstVisiblePosition = container.getFirstVisiblePosition();
            int length = urls.length;
            for (int i11 = 0; i11 < length; i11++) {
                String str = urls[i11];
                if (i11 >= firstVisiblePosition && i11 < this.f95520h.size()) {
                    View childAt = container.getChildAt(i11 - firstVisiblePosition);
                    f0.o(childAt, "container.getChildAt(ind…ompletelyVisiblePosition)");
                    View viewFindViewById = childAt.findViewById(i10);
                    ImageView imageView = viewFindViewById instanceof ImageView ? (ImageView) viewFindViewById : null;
                    if (imageView != null) {
                        this.f95517e.d(i11, imageView);
                    }
                }
                this.f95520h.add(new MediaData(this.f95516d, i11, str));
            }
            return this;
        }

        @d
        public final a k(@d ListView container, @d String[] urls, @d0 int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{container, urls, new Integer(i10)}, this, changeQuickRedirect, false, 49219, new Class[]{ListView.class, String[].class, Integer.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(container, "container");
            f0.p(urls, "urls");
            int firstVisiblePosition = container.getFirstVisiblePosition();
            int length = urls.length;
            for (int i11 = 0; i11 < length; i11++) {
                String str = urls[i11];
                if (i11 >= firstVisiblePosition && i11 < this.f95520h.size()) {
                    View childAt = container.getChildAt(i11 - firstVisiblePosition);
                    f0.o(childAt, "container.getChildAt(ind…ompletelyVisiblePosition)");
                    View viewFindViewById = childAt.findViewById(i10);
                    ImageView imageView = viewFindViewById instanceof ImageView ? (ImageView) viewFindViewById : null;
                    if (imageView != null) {
                        this.f95517e.d(i11, imageView);
                    }
                }
                this.f95520h.add(new MediaData(this.f95516d, i11, str));
            }
            return this;
        }

        @d
        public final a l(@e List<? extends View> list, @d List<MediaData> list2) {
            int i10 = 0;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, list2}, this, changeQuickRedirect, false, 49214, new Class[]{List.class, List.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(list2, "list");
            this.f95520h.addAll(list2);
            if (list != null) {
                for (View view : list) {
                    int i11 = i10 + 1;
                    if (i10 < list.size() && (list.get(i10) instanceof ImageView)) {
                        View view2 = list.get(i10);
                        f0.n(view2, "null cannot be cast to non-null type android.widget.ImageView");
                        this.f95517e.d(i10, (ImageView) view2);
                    }
                    i10 = i11;
                }
            }
            return this;
        }

        @d
        public final a m(@d List<? extends View> viewList, @d String[] urls) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewList, urls}, this, changeQuickRedirect, false, 49213, new Class[]{List.class, String[].class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(viewList, "viewList");
            f0.p(urls, "urls");
            int length = urls.length;
            for (int i10 = 0; i10 < length; i10++) {
                String str = urls[i10];
                ArrayList<MediaData> arrayList = this.f95520h;
                Context context = this.f95516d;
                long j10 = i10;
                if (str == null) {
                    str = "";
                }
                arrayList.add(new MediaData(context, j10, str));
                if (i10 < viewList.size() && (viewList.get(i10) instanceof ImageView)) {
                    b bVar = this.f95517e;
                    View view = viewList.get(i10);
                    f0.n(view, "null cannot be cast to non-null type android.widget.ImageView");
                    bVar.d(j10, (ImageView) view);
                }
            }
            return this;
        }

        @d
        public final a n(@d List<? extends ViewGroup> viewList, @d String[] urls, @d0 int i10) {
            int i11 = 0;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewList, urls, new Integer(i10)}, this, changeQuickRedirect, false, 49217, new Class[]{List.class, String[].class, Integer.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(viewList, "viewList");
            f0.p(urls, "urls");
            int length = urls.length;
            while (i11 < length) {
                String str = urls[i11];
                View viewFindViewById = i11 < viewList.size() ? viewList.get(i11).findViewById(i10) : null;
                ArrayList<MediaData> arrayList = this.f95520h;
                Context context = this.f95516d;
                long j10 = i11;
                if (str == null) {
                    str = "";
                }
                arrayList.add(new MediaData(context, j10, str));
                if (i11 < viewList.size() && (viewFindViewById instanceof ImageView)) {
                    this.f95517e.d(j10, (ImageView) viewFindViewById);
                }
                i11++;
            }
            return this;
        }

        public final void p() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49226, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            if (this.f95520h.isEmpty()) {
                g.f74531b.v("dataList is empty");
                return;
            }
            int i10 = this.f95521i;
            MediaData mediaData = this.f95520h.get((i10 < 0 || i10 >= this.f95520h.size()) ? 0 : this.f95521i);
            f0.o(mediaData, "dataList[index]");
            MediaData mediaData2 = mediaData;
            mediaData2.F(mediaData2.i() == 2);
            com.heybox.imageviewer.utils.c cVar = new com.heybox.imageviewer.utils.c(this.f95516d, this.f95518f, new com.heybox.imageviewer.core.g(mediaData2, this.f95520h), this.f95517e);
            this.f95519g.j(this.f95516d, cVar);
            cVar.g();
        }
    }

    /* JADX INFO: compiled from: ImageViewerHelper.kt */
    @kotlin.jvm.internal.t0({"SMAP\nImageViewerHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageViewerHelper.kt\ncom/max/xiaoheihe/utils/imageviewer/ImageViewerHelper$SimpleTransformer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,392:1\n1855#2,2:393\n*S KotlinDebug\n*F\n+ 1 ImageViewerHelper.kt\ncom/max/xiaoheihe/utils/imageviewer/ImageViewerHelper$SimpleTransformer\n*L\n384#1:393,2\n*E\n"})
    @o(parameters = 0)
    public static final class b implements h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f95522b = 8;
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @d
        private final HashMap<ImageView, Long> f95523a = new HashMap<>();

        /* JADX INFO: compiled from: ImageViewerHelper.kt */
        public static final class a implements View.OnAttachStateChangeListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ImageView f95525c;

            a(ImageView imageView) {
                this.f95525c = imageView;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@d View p10) {
                if (PatchProxy.proxy(new Object[]{p10}, this, changeQuickRedirect, false, 49231, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(p10, "p0");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@d View p10) {
                if (PatchProxy.proxy(new Object[]{p10}, this, changeQuickRedirect, false, 49232, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(p10, "p0");
                b.this.f95523a.remove(this.f95525c);
                this.f95525c.removeOnAttachStateChangeListener(this);
            }
        }

        private final ImageView c(long j10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 49230, new Class[]{Long.TYPE}, ImageView.class);
            if (patchProxyResultProxy.isSupported) {
                return (ImageView) patchProxyResultProxy.result;
            }
            Set<ImageView> setKeySet = this.f95523a.keySet();
            f0.o(setKeySet, "transition.keys");
            for (ImageView imageView : setKeySet) {
                Long l10 = this.f95523a.get(imageView);
                if (l10 != null && l10.longValue() == j10) {
                    return imageView;
                }
            }
            return null;
        }

        @Override // com.heybox.imageviewer.core.h
        @e
        public ImageView a(long j10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 49228, new Class[]{Long.TYPE}, ImageView.class);
            return patchProxyResultProxy.isSupported ? (ImageView) patchProxyResultProxy.result : c(j10);
        }

        public final void d(long j10, @d ImageView imageView) {
            if (PatchProxy.proxy(new Object[]{new Long(j10), imageView}, this, changeQuickRedirect, false, 49229, new Class[]{Long.TYPE, ImageView.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(imageView, "imageView");
            if (imageView.isAttachedToWindow()) {
                imageView.addOnAttachStateChangeListener(new a(imageView));
                this.f95523a.put(imageView, Long.valueOf(j10));
            }
        }
    }

    @d
    @m
    public static final a a(@d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 49194, new Class[]{Context.class}, a.class);
        return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : f95500a.a(context);
    }

    @d
    @m
    public static final a b(@d Context context, @d b bVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, bVar}, null, changeQuickRedirect, true, 49195, new Class[]{Context.class, b.class}, a.class);
        return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : f95500a.b(context, bVar);
    }

    @e
    @m
    public static final Object c(@d Context context, @d String str, @d c<? super Boolean> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, cVar}, null, changeQuickRedirect, true, 49197, new Class[]{Context.class, String.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : f95500a.c(context, str, cVar);
    }

    @d
    @m
    public static final ArrayList<View> d(@d View view, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, new Integer(i10)}, null, changeQuickRedirect, true, 49196, new Class[]{View.class, Integer.TYPE}, ArrayList.class);
        return patchProxyResultProxy.isSupported ? (ArrayList) patchProxyResultProxy.result : f95500a.d(view, i10);
    }

    @e
    @m
    public static final Object e(@d Context context, @d String str, @d c<? super File> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, cVar}, null, changeQuickRedirect, true, 49198, new Class[]{Context.class, String.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : f95500a.e(context, str, cVar);
    }

    @m
    public static final int f(@d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 49200, new Class[]{Context.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : f95500a.f(context);
    }

    @m
    public static final int g(@d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 49199, new Class[]{Context.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : f95500a.g(context);
    }
}
