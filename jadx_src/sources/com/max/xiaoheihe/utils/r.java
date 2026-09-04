package com.max.xiaoheihe.utils;

import android.annotation.SuppressLint;
import android.util.Log;
import com.bumptech.glide.Glide;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.AnimationResultList;
import com.max.xiaoheihe.bean.AnimationResultObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: LottieUtils.java */
/* JADX INFO: loaded from: classes13.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f95724a = "LottieUtils-dbg";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f95725b = "refresh";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f95726c = "loading";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f95727d = "video_tutorial";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f95728e = "link_detail_fullscreen_award_guide";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f95729f = "story_mode_fullscreen_award_guide";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f95730g = "dota2_bg";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f95731h = "_lottie.json";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f95732i = "_lottie.lottie";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static HashSet<String> f95733j = new HashSet<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final com.airbnb.lottie.l<Throwable> f95734k = new com.airbnb.lottie.l() { // from class: com.max.xiaoheihe.utils.p
        @Override // com.airbnb.lottie.l
        public final void onResult(Object obj) {
            r.u((Throwable) obj);
        }
    };

    /* JADX INFO: compiled from: LottieUtils.java */
    public class a extends com.max.hbcommon.network.d<File> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AnimationResultObj f95735b;

        a(AnimationResultObj animationResultObj) {
            this.f95735b = animationResultObj;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48770, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            Log.d(r.f95724a, "[downloadLottie]" + this.f95735b.getType() + "动画下载完成,重新登录或重启App可使用");
            String strV = r.v(this.f95735b.getType(), this.f95735b.getSource_type());
            if ("".equals(com.max.hbcache.c.j(strV))) {
                com.max.hbcache.c.z(strV, "1");
            }
            if (Objects.equals(this.f95735b.getSource_type(), AnimationResultObj.SOURCE_TYPE_DOT_LOTTIE)) {
                r.f95733j.add(this.f95735b.getType());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
        }
    }

    /* JADX INFO: compiled from: LottieUtils.java */
    public class b implements kh.o<String, File> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f95736b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f95737c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f95738d;

        b(String str, String str2, String str3) {
            this.f95736b = str;
            this.f95737c = str2;
            this.f95738d = str3;
        }

        public File a(String str) throws Exception {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 48771, new Class[]{String.class}, File.class);
            if (patchProxyResultProxy.isSupported) {
                return (File) patchProxyResultProxy.result;
            }
            File file = Glide.F(HeyBoxApplication.C()).u().load(str).V1().get(60L, TimeUnit.SECONDS);
            if (file == null) {
                return null;
            }
            File file2 = new File(this.f95736b);
            if (!file2.exists() && !file2.mkdirs()) {
                return null;
            }
            File file3 = new File(file2, this.f95737c + r.c(this.f95738d));
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    fileInputStream.close();
                    fileOutputStream.close();
                    return file3;
                }
                fileOutputStream.write(bArr, 0, i10);
            }
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [java.io.File, java.lang.Object] */
        @Override // kh.o
        public /* bridge */ /* synthetic */ File apply(String str) throws Exception {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 48772, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(str);
        }
    }

    /* JADX INFO: compiled from: LottieUtils.java */
    public class c extends com.max.hbcommon.network.d<List<AnimationResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f95739b;

        c(f fVar) {
            this.f95739b = fVar;
        }

        public void a(List<AnimationResultObj> list) {
            if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 48774, new Class[]{List.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f95739b.a(list);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 48773, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f95739b.onError(th2);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 48775, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((List) obj);
        }
    }

    /* JADX INFO: compiled from: LottieUtils.java */
    public class d implements f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: LottieUtils.java */
        public class a extends com.max.hbcommon.network.d<Result<AnimationResultList>> {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            public void onNext(Result<AnimationResultList> result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 48778, new Class[]{Result.class}, Void.TYPE).isSupported || result == null || result.getResult() == null || result.getResult().getAnimations() == null || com.max.hbcommon.utils.c.w(result.getResult().getAnimations())) {
                    return;
                }
                for (int i10 = 0; i10 < result.getResult().getAnimations().size(); i10++) {
                    r.k(result.getResult().getAnimations().get(i10));
                }
                com.max.hbcache.b.k(com.max.hbcache.b.f66096c, result.getResult().getAnimations());
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 48779, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<AnimationResultList>) obj);
            }
        }

        d() {
        }

        @Override // com.max.xiaoheihe.utils.r.f
        public void a(List<AnimationResultObj> list) {
            if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 48776, new Class[]{List.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!com.max.hbcommon.utils.c.w(list)) {
                for (AnimationResultObj animationResultObj : list) {
                    if (animationResultObj != null) {
                        File file = new File(r.d(animationResultObj.getType(), animationResultObj.getSource_type()));
                        if (file.exists() && (com.max.hbcommon.utils.c.u(animationResultObj.getMd5()) || animationResultObj.getMd5().equals(com.max.hbutils.utils.s.b(file)))) {
                            com.max.hbcache.c.z(r.v(animationResultObj.getType(), animationResultObj.getSource_type()), "0");
                        }
                    }
                }
            }
            r.e(list);
        }

        @Override // com.max.xiaoheihe.utils.r.f
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 48777, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.network.i.a().I4().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a());
        }
    }

    /* JADX INFO: compiled from: LottieUtils.java */
    public class e extends com.max.hbcommon.network.d<Result<AnimationResultList>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f95741b;

        e(List list) {
            this.f95741b = list;
        }

        public void onNext(Result<AnimationResultList> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 48780, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            if (result == null || result.getResult() == null || result.getResult().getAnimations() == null || com.max.hbcommon.utils.c.w(result.getResult().getAnimations())) {
                com.max.heybox.hblog.g.G("[LottieUtils-dbg] [fetchAnimationsFromServer] invalid result: " + result);
                return;
            }
            if (com.max.hbcommon.utils.c.w(this.f95741b)) {
                Iterator<AnimationResultObj> it = result.getResult().getAnimations().iterator();
                while (it.hasNext()) {
                    r.k(it.next());
                }
            } else {
                for (AnimationResultObj animationResultObj : result.getResult().getAnimations()) {
                    if (!r.f(this.f95741b, animationResultObj)) {
                        r.k(animationResultObj);
                    }
                }
            }
            com.max.hbcache.b.k(com.max.hbcache.b.f66096c, result.getResult().getAnimations());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 48781, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<AnimationResultList>) obj);
        }
    }

    /* JADX INFO: compiled from: LottieUtils.java */
    public interface f {
        void a(List<AnimationResultObj> list);

        void onError(Throwable th2);
    }

    static /* synthetic */ String c(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48766, new Class[]{String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : s(str);
    }

    static /* synthetic */ String d(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 48767, new Class[]{String.class, String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : q(str, str2);
    }

    static /* synthetic */ void e(List list) {
        if (PatchProxy.proxy(new Object[]{list}, null, changeQuickRedirect, true, 48768, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        l(list);
    }

    static /* synthetic */ boolean f(List list, AnimationResultObj animationResultObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, animationResultObj}, null, changeQuickRedirect, true, 48769, new Class[]{List.class, AnimationResultObj.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : g(list, animationResultObj);
    }

    private static boolean g(@androidx.annotation.p0 List<AnimationResultObj> list, @androidx.annotation.p0 AnimationResultObj animationResultObj) {
        boolean z10 = false;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, animationResultObj}, null, changeQuickRedirect, true, 48761, new Class[]{List.class, AnimationResultObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (list != null && animationResultObj != null) {
            for (AnimationResultObj animationResultObj2 : list) {
                if (animationResultObj.equals(animationResultObj2) && h(animationResultObj.getType(), animationResultObj.getSource_type())) {
                    if (animationResultObj.getUrl() != null && !animationResultObj.getUrl().equals(animationResultObj2.getUrl())) {
                        k(animationResultObj);
                    }
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                try {
                    if (Objects.equals(animationResultObj.getSource_type(), AnimationResultObj.SOURCE_TYPE_DOT_LOTTIE) && new File(q(animationResultObj.getType(), AnimationResultObj.SOURCE_TYPE_DOT_LOTTIE)).exists()) {
                        f95733j.add(animationResultObj.getType());
                    }
                } catch (Exception e10) {
                    com.max.heybox.hblog.g.G("[checkContainSameAnim] error: " + e10);
                }
            }
        }
        return z10;
    }

    private static boolean h(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 48762, new Class[]{String.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            if (!Objects.equals(str2, AnimationResultObj.SOURCE_TYPE_DOT_LOTTIE) && new File(q(str, AnimationResultObj.SOURCE_TYPE_DOT_JSON)).exists()) {
                return true;
            }
            return new File(q(str, AnimationResultObj.SOURCE_TYPE_DOT_LOTTIE)).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    private static io.reactivex.z<Void> i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48763, new Class[0], io.reactivex.z.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.z) patchProxyResultProxy.result : io.reactivex.z.q1(new io.reactivex.c0() { // from class: com.max.xiaoheihe.utils.q
            @Override // io.reactivex.c0
            public final void a(io.reactivex.b0 b0Var) throws Exception {
                r.t(b0Var);
            }
        });
    }

    public static io.reactivex.z<File> j(@androidx.annotation.n0 String str, String str2, String str3, String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, null, changeQuickRedirect, true, 48757, new Class[]{String.class, String.class, String.class, String.class}, io.reactivex.z.class);
        if (patchProxyResultProxy.isSupported) {
            return (io.reactivex.z) patchProxyResultProxy.result;
        }
        Log.d(f95724a, "[downloadLottie]\ndir: " + str + "\nurl: " + str2 + "\ntype: " + str3 + ", sourceType: " + str4);
        return io.reactivex.z.I2(str2).z3(new b(str, str3, str4));
    }

    @SuppressLint({"CheckResult"})
    public static void k(@androidx.annotation.p0 AnimationResultObj animationResultObj) {
        if (PatchProxy.proxy(new Object[]{animationResultObj}, null, changeQuickRedirect, true, 48755, new Class[]{AnimationResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (animationResultObj == null) {
            com.max.heybox.hblog.g.G("[downloadLottie] invalid obj: null");
        } else {
            j(o(), animationResultObj.getUrl(), animationResultObj.getType(), animationResultObj.getSource_type()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a(animationResultObj));
        }
    }

    @SuppressLint({"CheckResult"})
    private static void l(List<AnimationResultObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, null, changeQuickRedirect, true, 48760, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().I4().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e(list));
    }

    public static void m() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48759, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        n(new d());
    }

    public static void n(f fVar) {
        if (PatchProxy.proxy(new Object[]{fVar}, null, changeQuickRedirect, true, 48758, new Class[]{f.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcache.b.f(com.max.hbcache.b.f66096c, AnimationResultObj.class).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c(fVar));
    }

    private static String o() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48751, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(HeyBoxApplication.C().getFilesDir());
        String str = File.separator;
        sb2.append(str);
        sb2.append(sd.b.f139389g);
        sb2.append(str);
        return sb2.toString();
    }

    @Deprecated
    public static String p(String str) {
        return q(str, AnimationResultObj.SOURCE_TYPE_DOT_JSON);
    }

    @androidx.annotation.n0
    private static String q(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 48753, new Class[]{String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return o() + str + s(str2);
    }

    @androidx.annotation.n0
    public static String r(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48752, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return f95733j.contains(str) ? q(str, AnimationResultObj.SOURCE_TYPE_DOT_LOTTIE) : q(str, AnimationResultObj.SOURCE_TYPE_DOT_JSON);
    }

    private static String s(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48754, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return AnimationResultObj.SOURCE_TYPE_DOT_LOTTIE.equals(str) ? f95732i : f95731h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(io.reactivex.b0 b0Var) throws Exception {
        if (PatchProxy.proxy(new Object[]{b0Var}, null, changeQuickRedirect, true, 48764, new Class[]{io.reactivex.b0.class}, Void.TYPE).isSupported) {
            return;
        }
        File file = new File(o());
        if (file.exists() && file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
            for (File file2 : fileArrListFiles) {
                if (file2.isFile() && file2.getName().contains("_lottie")) {
                    com.max.hbcommon.utils.f.a(file2);
                }
            }
        }
        com.max.hbcache.b.k(com.max.hbcache.b.f66096c, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(Throwable th2) {
        if (PatchProxy.proxy(new Object[]{th2}, null, changeQuickRedirect, true, 48765, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
            return;
        }
        i().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).C5();
        com.max.heybox.hblog.g.G("LottieUtils, " + th2);
    }

    public static String v(String str, @androidx.annotation.p0 String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 48756, new Class[]{String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (!AnimationResultObj.SOURCE_TYPE_DOT_LOTTIE.equals(str2)) {
            return com.max.hbcache.c.X + str;
        }
        return com.max.hbcache.c.X + str + lg.a.f131412e + str2;
    }
}
