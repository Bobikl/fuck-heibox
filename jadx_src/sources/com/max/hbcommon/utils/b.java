package com.max.hbcommon.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.bumptech.glide.Glide;
import com.max.hbcommon.R;
import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbcommon.bean.TripleBannerPicObj;
import com.max.hbcommon.component.triplebanner.TripleBannerDecorationView;
import com.max.hbcommon.component.triplebanner.TripleBannerViewPager;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: BannerViewUtils.java */
/* JADX INFO: loaded from: classes9.dex */
public class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: BannerViewUtils.java */
    public class a extends com.max.hbcustomview.bannerview.d<AdsBannerObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f68184f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f68185g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f68186h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ g f68187i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f68188j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ AppCompatActivity f68189k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ List f68190l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ BannerViewPager f68191m;

        /* JADX INFO: renamed from: com.max.hbcommon.utils.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BannerViewUtils.java */
        public class C0550a implements f {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AdsBannerObj f68192a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.max.hbcustomview.bannerview.e f68193b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f68194c;

            /* JADX INFO: renamed from: com.max.hbcommon.utils.b$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: BannerViewUtils.java */
            public class RunnableC0551a implements Runnable {
                public static ChangeQuickRedirect changeQuickRedirect;

                RunnableC0551a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32410m, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    C0550a c0550a = C0550a.this;
                    b.k(c0550a.f68192a, c0550a.f68193b.itemView, a.this.f68188j, true);
                    try {
                        C0550a c0550a2 = C0550a.this;
                        int iC = xb.a.c(c0550a2.f68194c, a.this.f68190l.size());
                        C0550a c0550a3 = C0550a.this;
                        a.A(a.this, iC, c0550a3.f68192a.getSplit_imgs().getImg_front(), C0550a.this.f68192a.getSplit_imgs().getImg_back());
                        Log.d("downloadImages", "realIndex: " + iC);
                    } catch (Throwable unused) {
                    }
                }
            }

            C0550a(AdsBannerObj adsBannerObj, com.max.hbcustomview.bannerview.e eVar, int i10) {
                this.f68192a = adsBannerObj;
                this.f68193b = eVar;
                this.f68194c = i10;
            }

            @Override // com.max.hbcommon.utils.b.f
            public void onFinish() {
                AppCompatActivity appCompatActivity;
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32387l, new Class[0], Void.TYPE).isSupported || (appCompatActivity = a.this.f68189k) == null || appCompatActivity.isFinishing()) {
                    return;
                }
                a.this.f68189k.runOnUiThread(new RunnableC0551a());
            }
        }

        a(boolean z10, float f10, float f11, g gVar, boolean z11, AppCompatActivity appCompatActivity, List list, BannerViewPager bannerViewPager) {
            this.f68184f = z10;
            this.f68185g = f10;
            this.f68186h = f11;
            this.f68187i = gVar;
            this.f68188j = z11;
            this.f68189k = appCompatActivity;
            this.f68190l = list;
            this.f68191m = bannerViewPager;
        }

        static /* synthetic */ void A(a aVar, int i10, String str, String str2) {
            if (PatchProxy.proxy(new Object[]{aVar, new Integer(i10), str, str2}, null, changeQuickRedirect, true, bb.c.f.f32364k, new Class[]{a.class, Integer.TYPE, String.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            aVar.C(i10, str, str2);
        }

        private void C(int i10, String str, String str2) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10), str, str2}, this, changeQuickRedirect, false, bb.c.f.f32318i, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            BannerViewPager bannerViewPager = this.f68191m;
            if (bannerViewPager instanceof TripleBannerViewPager) {
                if (!com.max.hbcommon.utils.c.w(((TripleBannerViewPager) bannerViewPager).f67961w.getImageList())) {
                    ((TripleBannerViewPager) this.f68191m).f67961w.getImageList().remove(i10);
                    ((TripleBannerViewPager) this.f68191m).f67961w.getImageList().add(i10, str);
                    ((TripleBannerViewPager) this.f68191m).f67961w.s();
                }
                if (com.max.hbcommon.utils.c.w(((TripleBannerViewPager) this.f68191m).f67962x.getImageList())) {
                    return;
                }
                ((TripleBannerViewPager) this.f68191m).f67962x.getImageList().remove(i10);
                ((TripleBannerViewPager) this.f68191m).f67962x.getImageList().add(i10, str2);
                ((TripleBannerViewPager) this.f68191m).f67962x.s();
            }
        }

        public void B(com.max.hbcustomview.bannerview.e<AdsBannerObj> eVar, AdsBannerObj adsBannerObj, int i10, int i11) {
            Object[] objArr = {eVar, adsBannerObj, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32295h, new Class[]{com.max.hbcustomview.bannerview.e.class, AdsBannerObj.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            if (!this.f68184f) {
                b.e(adsBannerObj, eVar.itemView, this.f68185g, this.f68186h, this.f68187i);
                return;
            }
            if (!this.f68188j || adsBannerObj.getSplit_imgs() == null || com.max.hbcommon.utils.c.u(adsBannerObj.getSplit_imgs().getImg_mid())) {
                b.k(adsBannerObj, eVar.itemView, this.f68188j, true);
                return;
            }
            List<String> listC = b.c(adsBannerObj.getSplit_imgs());
            if (listC.size() > 0) {
                b.k(adsBannerObj, eVar.itemView, this.f68188j, false);
                b.a(listC, new C0550a(adsBannerObj, eVar, i10));
            } else {
                C(xb.a.c(i10, this.f68190l.size()), adsBannerObj.getSplit_imgs().getImg_front(), adsBannerObj.getSplit_imgs().getImg_back());
                b.k(adsBannerObj, eVar.itemView, this.f68188j, true);
            }
        }

        @Override // com.max.hbcustomview.bannerview.d
        public /* bridge */ /* synthetic */ void n(com.max.hbcustomview.bannerview.e<AdsBannerObj> eVar, AdsBannerObj adsBannerObj, int i10, int i11) {
            Object[] objArr = {eVar, adsBannerObj, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32341j, new Class[]{com.max.hbcustomview.bannerview.e.class, Object.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            B(eVar, adsBannerObj, i10, i11);
        }

        @Override // com.max.hbcustomview.bannerview.d
        public int q(int i10) {
            return !this.f68184f ? R.layout.layout_banner_img : R.layout.layout_banner_news;
        }
    }

    /* JADX INFO: renamed from: com.max.hbcommon.utils.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BannerViewUtils.java */
    public class C0552b extends ViewPager2.OnPageChangeCallback {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f68197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AppCompatActivity f68198b;

        C0552b(List list, AppCompatActivity appCompatActivity) {
            this.f68197a = list;
            this.f68198b = appCompatActivity;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32433n, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.onPageSelected(i10);
            if (i10 < 0 || i10 >= this.f68197a.size()) {
                return;
            }
            b.l(this.f68198b, (AdsBannerObj) this.f68197a.get(i10));
        }
    }

    /* JADX INFO: compiled from: BannerViewUtils.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f68199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdsBannerObj f68200c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g f68201d;

        c(Context context, AdsBannerObj adsBannerObj, g gVar) {
            this.f68199b = context;
            this.f68200c = adsBannerObj;
            this.f68201d = gVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.f32456o, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ob.a aVar = ob.a.f132240a;
            ob.a.p().c(this.f68199b, this.f68200c.getProtocol());
            k.b(this.f68200c.getAd_report());
            g gVar = this.f68201d;
            if (gVar != null) {
                gVar.a();
            }
        }
    }

    /* JADX INFO: compiled from: BannerViewUtils.java */
    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f68202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdsBannerObj f68203c;

        d(Context context, AdsBannerObj adsBannerObj) {
            this.f68202b = context;
            this.f68203c = adsBannerObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.f32479p, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ob.a aVar = ob.a.f132240a;
            ob.a.p().c(this.f68202b, this.f68203c.getProtocol());
            k.b(this.f68203c.getAd_report());
        }
    }

    /* JADX INFO: compiled from: BannerViewUtils.java */
    public class e implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f68204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f68205c;

        /* JADX INFO: compiled from: BannerViewUtils.java */
        public class a implements Callable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f68206b;

            /* JADX INFO: renamed from: com.max.hbcommon.utils.b$e$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: BannerViewUtils.java */
            public class C0553a extends com.max.hbimage.image.o {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean[] f68208b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0553a(String str, boolean[] zArr) {
                    super(str);
                    this.f68208b = zArr;
                }

                @Override // com.max.hbimage.image.o, com.bumptech.glide.request.target.p
                public void onLoadFailed(@p0 Drawable drawable) {
                    if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.f.f32590u, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    super.onLoadFailed(drawable);
                    this.f68208b[0] = true;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.max.hbimage.image.o
                public void onResourceReady(@n0 File file, @p0 com.bumptech.glide.request.transition.f<? super File> fVar) {
                    if (PatchProxy.proxy(new Object[]{file, fVar}, this, changeQuickRedirect, false, bb.c.f.f32568t, new Class[]{File.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    super.onResourceReady(file, fVar);
                    TripleBannerDecorationView.f67922v.a().put(a.this.f68206b, BitmapFactory.decodeFile(file.getAbsolutePath()));
                    this.f68208b[0] = true;
                }

                @Override // com.max.hbimage.image.o, com.bumptech.glide.request.target.p
                public /* bridge */ /* synthetic */ void onResourceReady(@n0 File file, @p0 com.bumptech.glide.request.transition.f<? super File> fVar) {
                    if (PatchProxy.proxy(new Object[]{file, fVar}, this, changeQuickRedirect, false, bb.c.f.f32612v, new Class[]{Object.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    onResourceReady(file, fVar);
                }
            }

            a(String str) {
                this.f68206b = str;
            }

            public String a() throws Exception {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32524r, new Class[0], String.class);
                if (patchProxyResultProxy.isSupported) {
                    return (String) patchProxyResultProxy.result;
                }
                boolean[] zArr = {false};
                Glide.F(com.max.hbimage.image.l.a()).u().load(this.f68206b).z1(new C0553a(this.f68206b, zArr));
                while (!zArr[0]) {
                    Thread.sleep(10L);
                }
                return null;
            }

            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ Object call() throws Exception {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32546s, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        }

        e(List list, f fVar) {
            this.f68204b = list;
            this.f68205c = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32502q, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            if (com.max.hbcommon.utils.c.w(this.f68204b)) {
                this.f68205c.onFinish();
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : this.f68204b) {
                if (!com.max.hbimage.b.f70376a.containsKey(str) && !TripleBannerDecorationView.f67922v.a().containsKey(str)) {
                    arrayList.add(str);
                }
            }
            if (com.max.hbcommon.utils.c.w(arrayList)) {
                this.f68205c.onFinish();
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                FutureTask futureTask = new FutureTask(new a((String) it.next()));
                new Thread(futureTask).start();
                arrayList2.add(futureTask);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                try {
                    ((FutureTask) it2.next()).get();
                } catch (Throwable unused) {
                }
            }
            this.f68205c.onFinish();
        }
    }

    /* JADX INFO: compiled from: BannerViewUtils.java */
    public interface f {
        void onFinish();
    }

    /* JADX INFO: compiled from: BannerViewUtils.java */
    public interface g {
        void a();
    }

    public static void a(List<String> list, f fVar) {
        if (PatchProxy.proxy(new Object[]{list, fVar}, null, changeQuickRedirect, true, bb.c.f.f32249f, new Class[]{List.class, f.class}, Void.TYPE).isSupported) {
            return;
        }
        new Thread(new e(list, fVar)).start();
    }

    public static Bitmap b(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.f32203d, new Class[]{String.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            return null;
        }
        try {
            File fileP = com.max.hbimage.b.p(str);
            if (fileP != null && fileP.isFile() && fileP.exists()) {
                return BitmapFactory.decodeFile(fileP.getAbsolutePath());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List<String> c(TripleBannerPicObj tripleBannerPicObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tripleBannerPicObj}, null, changeQuickRedirect, true, bb.c.f.f32226e, new Class[]{TripleBannerPicObj.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        if (tripleBannerPicObj != null) {
            if (b(tripleBannerPicObj.getImg_mid()) == null) {
                arrayList.add(tripleBannerPicObj.getImg_mid());
            }
            if (b(tripleBannerPicObj.getImg_front()) == null) {
                arrayList.add(tripleBannerPicObj.getImg_front());
            }
            if (b(tripleBannerPicObj.getImg_back()) == null) {
                arrayList.add(tripleBannerPicObj.getImg_back());
            }
        }
        return arrayList;
    }

    public static void d(String str, String str2, ImageView imageView, int i10, int i11) {
        Object[] objArr = {str, str2, imageView, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.f.f32272g, new Class[]{String.class, String.class, ImageView.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            com.max.hbimage.b.e0(str2, imageView, i10, i11);
        } else {
            com.max.hbimage.b.f0(str, imageView, i10, i11, str2);
        }
    }

    public static void e(AdsBannerObj adsBannerObj, View view, float f10, float f11, g gVar) {
        Object[] objArr = {adsBannerObj, view, new Float(f10), new Float(f11), gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.f.f32156b, new Class[]{AdsBannerObj.class, View.class, cls, cls, g.class}, Void.TYPE).isSupported) {
            return;
        }
        Context context = view.getContext();
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_banner_img);
        TextView textView = (TextView) view.findViewById(R.id.tv_internal_tag);
        View viewFindViewById = view.findViewById(R.id.tv_tag_ad);
        d(adsBannerObj.getImg_gif(), !com.max.hbcommon.utils.c.u(adsBannerObj.getImg()) ? adsBannerObj.getImg() : adsBannerObj.getImage_url(), imageView, ViewUtils.f(context, f10), -1);
        textView.setVisibility(8);
        ViewUtils.n0(imageView, ViewUtils.f(context, f11), 0, ViewUtils.f(context, f11), 0);
        if ("advertise".equals(adsBannerObj.getLabel())) {
            viewFindViewById.setVisibility(0);
        } else {
            viewFindViewById.setVisibility(8);
        }
        view.setOnClickListener(new c(context, adsBannerObj, gVar));
    }

    public static void f(BannerViewPager<AdsBannerObj> bannerViewPager, List<AdsBannerObj> list) {
        if (PatchProxy.proxy(new Object[]{bannerViewPager, list}, null, changeQuickRedirect, true, bb.c.e.Jf, new Class[]{BannerViewPager.class, List.class}, Void.TYPE).isSupported || bannerViewPager == null) {
            return;
        }
        g(bannerViewPager, list, ViewUtils.L(bannerViewPager.getContext()), 0.0f);
    }

    public static void g(BannerViewPager<AdsBannerObj> bannerViewPager, List<AdsBannerObj> list, int i10, float f10) {
        if (PatchProxy.proxy(new Object[]{bannerViewPager, list, new Integer(i10), new Float(f10)}, null, changeQuickRedirect, true, bb.c.e.Kf, new Class[]{BannerViewPager.class, List.class, Integer.TYPE, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        j(bannerViewPager, list, i10, f10, false);
    }

    public static void h(BannerViewPager<AdsBannerObj> bannerViewPager, List<AdsBannerObj> list, int i10, float f10, float f11, boolean z10) {
        Object[] objArr = {bannerViewPager, list, new Integer(i10), new Float(f10), new Float(f11), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.e.Mf, new Class[]{BannerViewPager.class, List.class, Integer.TYPE, cls, cls, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        i(bannerViewPager, list, i10, f10, f11, z10, -1.0f, null);
    }

    public static void i(BannerViewPager<AdsBannerObj> bannerViewPager, List<AdsBannerObj> list, int i10, float f10, float f11, boolean z10, float f12, g gVar) {
        Object[] objArr = {bannerViewPager, list, new Integer(i10), new Float(f10), new Float(f11), new Byte(z10 ? (byte) 1 : (byte) 0), new Float(f12), gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.e.Nf, new Class[]{BannerViewPager.class, List.class, Integer.TYPE, cls, cls, Boolean.TYPE, cls, g.class}, Void.TYPE).isSupported || bannerViewPager == null || !(bannerViewPager.getContext() instanceof AppCompatActivity)) {
            return;
        }
        AppCompatActivity appCompatActivity = (AppCompatActivity) bannerViewPager.getContext();
        if (com.max.hbcommon.utils.c.w(list)) {
            bannerViewPager.setVisibility(8);
            return;
        }
        bannerViewPager.setVisibility(0);
        if (bannerViewPager.getTag() == null || !com.max.hbcommon.utils.c.y(list, (List) bannerViewPager.getTag())) {
            bannerViewPager.setTag(list);
            ArrayList arrayList = new ArrayList();
            l(appCompatActivity, list.get(0));
            boolean z11 = bannerViewPager instanceof TripleBannerViewPager;
            if (z11) {
                ArrayList<String> arrayList2 = new ArrayList<>();
                ArrayList<String> arrayList3 = new ArrayList<>();
                for (AdsBannerObj adsBannerObj : list) {
                    if (adsBannerObj.getSplit_imgs() == null || c(adsBannerObj.getSplit_imgs()).size() != 0) {
                        arrayList2.add(null);
                        arrayList3.add(null);
                    } else {
                        arrayList2.add(adsBannerObj.getSplit_imgs().getImg_front());
                        arrayList3.add(adsBannerObj.getSplit_imgs().getImg_back());
                    }
                }
                TripleBannerViewPager tripleBannerViewPager = (TripleBannerViewPager) bannerViewPager;
                tripleBannerViewPager.f67961w.setImageList(arrayList2);
                tripleBannerViewPager.f67962x.setImageList(arrayList3);
            }
            bannerViewPager.J(list);
            if (f12 > 0.0f) {
                bannerViewPager.setLayoutHeight((int) (i10 / f12));
            } else {
                bannerViewPager.setLayoutHeight((int) (i10 * (!z10 ? 0.192f : 0.53333336f)));
            }
            bannerViewPager.V(ViewUtils.f(appCompatActivity, 2.0f));
            bannerViewPager.c0(ViewUtils.f(appCompatActivity, 8.0f));
            bannerViewPager.Z(ViewUtils.f(appCompatActivity, 6.0f));
            bannerViewPager.j0(appCompatActivity.getLifecycle()).R(new a(z10, f10, f11, gVar, z11, appCompatActivity, list, bannerViewPager)).k();
            if (list.size() == 1) {
                arrayList.add(Integer.valueOf(list.get(0).intDuration()));
            } else {
                bannerViewPager.L(new C0552b(list, appCompatActivity));
                Iterator<AdsBannerObj> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(it.next().intDuration()));
                }
            }
            bannerViewPager.i0(arrayList);
        }
    }

    public static void j(BannerViewPager<AdsBannerObj> bannerViewPager, List<AdsBannerObj> list, int i10, float f10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{bannerViewPager, list, new Integer(i10), new Float(f10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.Lf, new Class[]{BannerViewPager.class, List.class, Integer.TYPE, Float.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        h(bannerViewPager, list, i10, f10, 0.0f, z10);
    }

    public static void k(AdsBannerObj adsBannerObj, View view, boolean z10, boolean z11) {
        String img;
        Object[] objArr = {adsBannerObj, view, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.f.f32179c, new Class[]{AdsBannerObj.class, View.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        Context context = view.getContext();
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_img);
        View viewFindViewById = view.findViewById(R.id.tv_tag_ad);
        TextView textView = (TextView) view.findViewById(R.id.tv_title);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_internal_tag);
        boolean z12 = !com.max.hbcommon.utils.c.u(adsBannerObj.getImg_gif());
        boolean z13 = (!z10 || adsBannerObj.getSplit_imgs() == null || com.max.hbcommon.utils.c.u(adsBannerObj.getSplit_imgs().getImg_mid())) ? false : true;
        textView2.setVisibility(8);
        if (z12) {
            img = !com.max.hbcommon.utils.c.u(adsBannerObj.getImg()) ? adsBannerObj.getImg() : adsBannerObj.getImage_url();
        } else if (z13) {
            img = adsBannerObj.getSplit_imgs().getImg_mid();
        } else {
            img = !com.max.hbcommon.utils.c.u(adsBannerObj.getImg()) ? adsBannerObj.getImg() : adsBannerObj.getImage_url();
        }
        if (z12) {
            d(adsBannerObj.getImg_gif(), img, imageView, 0, -1);
        } else if (!z13) {
            com.max.hbimage.b.K(img, imageView);
        } else if (z11) {
            TripleBannerDecorationView.a aVar = TripleBannerDecorationView.f67922v;
            if (aVar.a().containsKey(img)) {
                imageView.setImageBitmap(aVar.a().get(img));
            } else {
                File fileP = com.max.hbimage.b.p(img);
                if (fileP != null && fileP.isFile() && fileP.exists()) {
                    try {
                        imageView.setImageBitmap(BitmapFactory.decodeFile(fileP.getAbsolutePath()));
                    } catch (Throwable unused) {
                        com.max.hbimage.b.K(img, imageView);
                    }
                } else {
                    com.max.hbimage.b.K(img, imageView);
                }
            }
        } else {
            imageView.setImageResource(R.drawable.common_default_placeholder_375x210);
        }
        if ("advertise".equals(adsBannerObj.getLabel())) {
            viewFindViewById.setVisibility(0);
        } else {
            viewFindViewById.setVisibility(8);
        }
        textView.setText(adsBannerObj.getTitle());
        view.setOnClickListener(new d(context, adsBannerObj));
    }

    public static void l(Context context, AdsBannerObj adsBannerObj) {
        if (PatchProxy.proxy(new Object[]{context, adsBannerObj}, null, changeQuickRedirect, true, bb.c.f.f32133a, new Class[]{Context.class, AdsBannerObj.class}, Void.TYPE).isSupported || "1".equals(adsBannerObj.getIsReported())) {
            return;
        }
        k.c(adsBannerObj.getAd_report());
        adsBannerObj.setIsReported("1");
    }
}
