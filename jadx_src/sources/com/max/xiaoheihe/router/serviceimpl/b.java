package com.max.xiaoheihe.router.serviceimpl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.app.AppCompatActivity;
import com.max.hbcassette.bean.CassetteTagObj;
import com.max.hbcommon.bean.EncryptionParamsObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.card.CardParam;
import com.max.hbutils.bean.Result;
import com.max.hbutils.core.BaseApplication;
import com.max.hbutils.utils.u;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.SplashActivity;
import com.max.xiaoheihe.accelworld.AccelWorldScreenShotKt;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.SourceInfoObj;
import com.max.xiaoheihe.bean.account.CheckVersionObj;
import com.max.xiaoheihe.bean.account.TaskAwardInfo;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.ConceptPostTagObj;
import com.max.xiaoheihe.bean.bbs.HashtagObj;
import com.max.xiaoheihe.bean.bbs.WikiArticelObj;
import com.max.xiaoheihe.bean.rich.RichAttributeModelObj;
import com.max.xiaoheihe.module.bbs.post_edit.auto_save.PostEditAutoSaveManager;
import com.max.xiaoheihe.module.game.dota2.ImageCacheManager;
import com.max.xiaoheihe.module.search.pagev2.SearchType;
import com.max.xiaoheihe.utils.AppUpdateManager;
import com.max.xiaoheihe.utils.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.sankuai.waimai.router.annotation.RouterService;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: CommonServiceImpl.java */
/* JADX INFO: loaded from: classes13.dex */
@RouterService(interfaces = {pb.b.class}, key = {ob.b.f132251c})
public class b implements pb.b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: CommonServiceImpl.java */
    public class a extends com.max.hbcommon.network.d<Result<CheckVersionObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        public void onNext(Result<CheckVersionObj> result) {
            Activity activityN;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 48352, new Class[]{Result.class}, Void.TYPE).isSupported || (activityN = b.this.n()) == null || activityN.isFinishing() || result == null) {
                return;
            }
            CheckVersionObj result2 = result.getResult();
            if ("1".equals(result2.getNeed_update())) {
                AppUpdateManager.w((AppCompatActivity) activityN, result2, Boolean.FALSE);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 48353, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<CheckVersionObj>) obj);
        }
    }

    @Override // pb.b
    @n0
    public String A() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48342, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : com.max.hbcommon.utils.a.a();
    }

    @Override // pb.b
    @p0
    public String B(@p0 Context context, @p0 String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, 48329, new Class[]{Context.class, String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : com.max.xiaoheihe.utils.d.z(context, str);
    }

    @Override // pb.b
    @n0
    public String C() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48344, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : SearchType.GENERAL.getValue();
    }

    @Override // pb.b
    @p0
    public String D(@n0 String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 48326, new Class[]{String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : w.a(str);
    }

    @Override // pb.b
    @p0
    public com.max.hbcommon.component.card.a E(@p0 Object obj, @n0 CardParam<?> cardParam) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cardParam}, this, changeQuickRedirect, false, 48331, new Class[]{Object.class, CardParam.class}, com.max.hbcommon.component.card.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.hbcommon.component.card.a) patchProxyResultProxy.result;
        }
        if (obj instanceof String) {
            return cardParam.j() == CardParam.STYLE.RECOMMEND ? new com.max.xiaoheihe.view.card.g() : new com.max.xiaoheihe.view.card.f();
        }
        if (obj instanceof HashtagObj) {
            return new com.max.xiaoheihe.view.card.e();
        }
        if (obj instanceof WikiArticelObj) {
            return new com.max.xiaoheihe.view.card.k();
        }
        if (obj instanceof CassetteTagObj) {
            return new com.max.xiaoheihe.view.card.i();
        }
        if (obj instanceof BBSTopicObj) {
            return ((BBSTopicObj) obj).isGameComment() ? new com.max.xiaoheihe.view.card.d() : new com.max.xiaoheihe.view.card.j();
        }
        if (obj instanceof KeyDescObj) {
            return new com.max.xiaoheihe.view.card.c();
        }
        if (obj instanceof ConceptPostTagObj) {
            return new com.max.xiaoheihe.view.card.b();
        }
        if (obj instanceof RichAttributeModelObj) {
            return new com.max.xiaoheihe.view.card.h();
        }
        if (obj instanceof TaskAwardInfo) {
            return new com.max.xiaoheihe.view.card.a();
        }
        return null;
    }

    @Override // pb.b
    @n0
    public List<WeakReference<Activity>> a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48333, new Class[0], List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : com.max.xiaoheihe.module.analytics.a.c().b();
    }

    @Override // pb.b
    @p0
    public Bitmap b(@p0 String str, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Integer(i10)}, this, changeQuickRedirect, false, 48328, new Class[]{String.class, Integer.TYPE}, Bitmap.class);
        return patchProxyResultProxy.isSupported ? (Bitmap) patchProxyResultProxy.result : com.max.xiaoheihe.utils.d.q(str, i10);
    }

    @Override // pb.b
    @p0
    public String c(@p0 String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 48339, new Class[]{String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : com.max.hbshare.d.i(str);
    }

    @Override // pb.b
    @p0
    public <T> T d(@n0 EncryptionParamsObj encryptionParamsObj, @n0 Class<T> cls) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{encryptionParamsObj, cls}, this, changeQuickRedirect, false, 48330, new Class[]{EncryptionParamsObj.class, Class.class}, Object.class);
        return patchProxyResultProxy.isSupported ? (T) patchProxyResultProxy.result : (T) com.max.xiaoheihe.utils.d.u(encryptionParamsObj, cls);
    }

    @Override // pb.b
    @p0
    public String e(@p0 String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 48350, new Class[]{String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : com.max.hbutils.utils.a.a(str);
    }

    @Override // pb.b
    public boolean f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48341, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : HeyBoxApplication.S();
    }

    @Override // pb.b
    public void g(@p0 String str, @p0 String str2) {
        SourceInfoObj sourceInfoObjB;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 48345, new Class[]{String.class, String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.v(str, str2) || (sourceInfoObjB = AccelWorldScreenShotKt.b(str)) == null) {
            return;
        }
        AccelWorldScreenShotKt.d(str2, sourceInfoObjB);
    }

    @Override // pb.b
    @p0
    public Context getApplicationContext() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48323, new Class[0], Context.class);
        if (patchProxyResultProxy.isSupported) {
            return (Context) patchProxyResultProxy.result;
        }
        BaseApplication baseApplicationA = BaseApplication.a();
        if (baseApplicationA != null) {
            return baseApplicationA.getApplicationContext();
        }
        com.max.heybox.hblog.g.G("[CommonServiceImpl][getApplicationContext] app is null");
        return null;
    }

    @Override // pb.b
    public String h() {
        return com.max.xiaoheihe.a.f76425b;
    }

    @Override // pb.b
    public boolean i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48349, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : com.max.hbutils.utils.e.b().a() instanceof SplashActivity;
    }

    @Override // pb.b
    public void j(@p0 Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 48334, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.analytics.a.c().e(activity);
    }

    @Override // pb.b
    @n0
    public String k() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48340, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : com.max.xiaoheihe.utils.d.A();
    }

    @Override // pb.b
    @p0
    public Bitmap l(@p0 String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 48327, new Class[]{String.class}, Bitmap.class);
        return patchProxyResultProxy.isSupported ? (Bitmap) patchProxyResultProxy.result : com.max.xiaoheihe.utils.d.p(str);
    }

    @Override // pb.b
    public boolean m(@p0 Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 48337, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (context == null) {
            return false;
        }
        return u.b(context);
    }

    @Override // pb.b
    @p0
    public Activity n() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48325, new Class[0], Activity.class);
        return patchProxyResultProxy.isSupported ? (Activity) patchProxyResultProxy.result : HeyBoxApplication.C().E();
    }

    @Override // pb.b
    @n0
    public String o() {
        return com.max.xiaoheihe.a.f76430g;
    }

    @Override // pb.b
    public int p(@p0 String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 48351, new Class[]{String.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : com.max.hbutils.utils.a.d(str);
    }

    @Override // pb.b
    public void q(@n0 Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 48324, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.utils.d.W0(context);
    }

    @Override // pb.b
    @p0
    public String r(@p0 String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 48338, new Class[]{String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : ImageCacheManager.i().f(str);
    }

    @Override // pb.b
    public void s() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48348, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.utils.d.n1(BaseApplication.a());
    }

    @Override // pb.b
    public boolean t() {
        return false;
    }

    @Override // pb.b
    @n0
    public String u() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48343, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : com.max.hbcommon.utils.i.b(BaseApplication.a());
    }

    @Override // pb.b
    @n0
    public String v(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 48347, new Class[]{Boolean.TYPE}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : com.max.xiaoheihe.accelworld.b.k(z10);
    }

    @Override // pb.b
    public void w() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48336, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.utils.h.a();
    }

    @Override // pb.b
    @n0
    public Intent x(@n0 Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 48335, new Class[]{Context.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : new Intent(context, (Class<?>) MainActivity.class);
    }

    @Override // pb.b
    public void y(@p0 String str, @p0 String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 48346, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        PostEditAutoSaveManager.f82868h.d(str, str2);
    }

    @Override // pb.b
    public void z() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48332, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().Pb().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new a());
    }
}
