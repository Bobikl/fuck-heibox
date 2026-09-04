package com.max.xiaoheihe.module.upload;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import androidx.compose.runtime.internal.o;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.utils.k;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.okflutter.pigeon.IHybridMessage;
import com.max.xiaoheihe.utils.a0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: LocalMediaUpdateImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nLocalMediaUpdateImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalMediaUpdateImpl.kt\ncom/max/xiaoheihe/module/upload/LocalMediaUpdateImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n1#2:202\n*E\n"})
@o(parameters = 0)
public final class d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f93482j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private Context f93483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private String[] f93484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private String[] f93485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private List<Pair<Integer, Integer>> f93486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private ArrayList<String> f93487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private List<LocalMedia> f93488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private LoadingDialog f93489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private IHybridMessage.NullableResult<IHybridMessage.HybridMessageResponse> f93490h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private io.reactivex.disposables.a f93491i;

    /* JADX INFO: compiled from: LocalMediaUpdateImpl.kt */
    public static final class a implements a0.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList<String> f93493b;

        a(ArrayList<String> arrayList) {
            this.f93493b = arrayList;
        }

        @Override // com.max.xiaoheihe.utils.a0.a
        public final void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46132, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            d.b(d.this, this.f93493b, "bbs", e.f93498a);
        }
    }

    /* JADX INFO: compiled from: LocalMediaUpdateImpl.kt */
    public static final class b implements a0.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.xiaoheihe.utils.a0.a
        public final void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46133, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            d.a(d.this);
        }
    }

    /* JADX INFO: compiled from: LocalMediaUpdateImpl.kt */
    public static final class c implements g.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f93495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f93496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f93497c;

        c(String str, d dVar, String str2) {
            this.f93495a = str;
            this.f93496b = dVar;
            this.f93497c = str2;
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ void a(float f10) {
            h.b(this, f10);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean b() {
            return h.a(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void c(@dl.d String[] urls, @dl.e String str) {
            if (PatchProxy.proxy(new Object[]{urls, str}, this, changeQuickRedirect, false, 46134, new Class[]{String[].class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(urls, "urls");
            if (f0.g(this.f93495a, "video")) {
                this.f93496b.v(urls);
            } else {
                this.f93496b.q(urls);
            }
            a0.g().d(this.f93497c);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean d() {
            return h.c(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void e(@dl.d String error) {
            if (PatchProxy.proxy(new Object[]{error}, this, changeQuickRedirect, false, 46135, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(error, "error");
            if (this.f93496b.h() != null) {
                LoadingDialog loadingDialogH = this.f93496b.h();
                f0.m(loadingDialogH);
                loadingDialogH.c();
            }
            a0.g().d(this.f93497c);
        }
    }

    public d(@dl.d Context mContext) {
        f0.p(mContext, "mContext");
        this.f93483a = mContext;
        this.f93486d = new ArrayList();
        this.f93487e = new ArrayList<>();
        this.f93488f = new ArrayList();
    }

    public static final /* synthetic */ void a(d dVar) {
        if (PatchProxy.proxy(new Object[]{dVar}, null, changeQuickRedirect, true, 46131, new Class[]{d.class}, Void.TYPE).isSupported) {
            return;
        }
        dVar.o();
    }

    public static final /* synthetic */ void b(d dVar, List list, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{dVar, list, str, str2}, null, changeQuickRedirect, true, 46130, new Class[]{d.class, List.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        dVar.w(list, str, str2);
    }

    private final ArrayList<String> k(List<String> list, boolean z10) throws Throwable {
        byte[] bArr;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 46129, new Class[]{List.class, Boolean.TYPE}, ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (z10) {
            for (String str : list) {
                FileInputStream fileInputStream = null;
                try {
                    fileInputStream = com.max.mediaselector.lib.config.f.s(str) ? new FileInputStream(Uri.parse(str).getPath()) : new FileInputStream(str);
                } catch (FileNotFoundException e10) {
                    e10.printStackTrace();
                }
                if (fileInputStream != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        bArr = new byte[fileInputStream.available()];
                        while (true) {
                            try {
                                int i10 = fileInputStream.read(bArr);
                                if (i10 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i10);
                            } catch (IOException e11) {
                                e11.printStackTrace();
                            }
                        }
                    } catch (Exception e12) {
                        e12.printStackTrace();
                        bArr = new byte[2048];
                    }
                    String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                    if (strEncodeToString != null) {
                        arrayList.add(strEncodeToString);
                    }
                }
            }
        } else {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String strS = com.max.mediaselector.utils.c.u().s(it.next());
                if (strS != null) {
                    arrayList.add(strS);
                }
            }
        }
        return arrayList;
    }

    private final void l(ArrayList<String> arrayList) {
        int i10 = 1;
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 46124, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        a0.g().k(e.f93498a);
        if (com.max.hbcommon.utils.c.w(arrayList)) {
            i10 = 0;
        } else {
            this.f93487e = k(arrayList, true);
            a0.g().b(new a(arrayList), e.f93498a);
        }
        a0.g().b(new b(), e.f93498a);
        a0.g().o(e.f93498a, i10);
    }

    private final void o() {
        int i10 = 0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46125, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LoadingDialog loadingDialog = this.f93489g;
        if (loadingDialog != null) {
            f0.m(loadingDialog);
            if (loadingDialog.i()) {
                LoadingDialog loadingDialog2 = this.f93489g;
                f0.m(loadingDialog2);
                loadingDialog2.c();
            }
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = this.f93484b;
        if (strArr != null) {
            List[] listArr = new List[1];
            listArr[0] = strArr != null ? ArraysKt___ArraysKt.kz(strArr) : null;
            if (!com.max.hbcommon.utils.c.w(listArr) && !com.max.hbcommon.utils.c.w(this.f93487e)) {
                while (true) {
                    String[] strArr2 = this.f93484b;
                    f0.m(strArr2);
                    if (i10 >= strArr2.length || i10 >= this.f93487e.size()) {
                        break;
                    }
                    HashMap map = new HashMap();
                    String[] strArr3 = this.f93484b;
                    f0.m(strArr3);
                    map.put("url", strArr3[i10]);
                    if (this.f93486d.size() - 1 >= i10) {
                        map.put("width", this.f93486d.get(i10).e());
                        map.put("height", this.f93486d.get(i10).f());
                    }
                    map.put("type", "image");
                    map.put("thumb", this.f93487e.get(i10));
                    arrayList.add(map);
                    i10++;
                }
            }
        }
        IHybridMessage.NullableResult<IHybridMessage.HybridMessageResponse> nullableResult = this.f93490h;
        if (nullableResult != null) {
            nullableResult.success(new IHybridMessage.HybridMessageResponse.Builder().setResult(k.p(arrayList)).build());
        }
        this.f93487e.clear();
        this.f93488f.clear();
        this.f93484b = null;
        this.f93485c = null;
    }

    private final void w(List<String> list, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{list, str, str2}, this, changeQuickRedirect, false, 46126, new Class[]{List.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        g.h(this.f93483a, d(), list, str, new c(str, this, str2));
    }

    public final void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46128, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        io.reactivex.disposables.a aVar = this.f93491i;
        if (aVar != null) {
            aVar.dispose();
        }
        a0.g().k(e.f93498a);
    }

    @dl.e
    public final io.reactivex.disposables.a d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46127, new Class[0], io.reactivex.disposables.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (io.reactivex.disposables.a) patchProxyResultProxy.result;
        }
        if (this.f93491i == null) {
            this.f93491i = new io.reactivex.disposables.a();
        }
        return this.f93491i;
    }

    @dl.d
    public final List<Pair<Integer, Integer>> e() {
        return this.f93486d;
    }

    @dl.e
    public final String[] f() {
        return this.f93484b;
    }

    @dl.d
    public final Context g() {
        return this.f93483a;
    }

    @dl.e
    public final LoadingDialog h() {
        return this.f93489g;
    }

    @dl.d
    public final ArrayList<String> i() {
        return this.f93487e;
    }

    @dl.d
    public final List<LocalMedia> j() {
        return this.f93488f;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0037  */
    public final void m(@dl.e List<? extends LocalMedia> list, @dl.d IHybridMessage.NullableResult<IHybridMessage.HybridMessageResponse> callback) {
        if (PatchProxy.proxy(new Object[]{list, callback}, this, changeQuickRedirect, false, 46123, new Class[]{List.class, IHybridMessage.NullableResult.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(callback, "callback");
        LoadingDialog loadingDialog = this.f93489g;
        if (loadingDialog != null) {
            f0.m(loadingDialog);
            if (!loadingDialog.i()) {
                Context context = this.f93483a;
                this.f93489g = new LoadingDialog(context, context.getString(R.string.commiting), true).r();
            }
        } else {
            Context context2 = this.f93483a;
            this.f93489g = new LoadingDialog(context2, context2.getString(R.string.commiting), true).r();
        }
        this.f93490h = callback;
        if (list != null && list.size() > 0) {
            this.f93488f.addAll(list);
        }
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        for (LocalMedia localMedia : this.f93488f) {
            com.max.heybox.hblog.g.f74531b.q("LocalMediaUpdateImpl, getUploadUrl, localMedia = " + localMedia);
            if (com.max.mediaselector.lib.config.f.i(localMedia.A())) {
                arrayList2.add(localMedia.H());
            } else {
                arrayList.add(localMedia.G());
                this.f93486d.add(new Pair<>(Integer.valueOf(localMedia.getWidth()), Integer.valueOf(localMedia.getHeight())));
            }
        }
        l(arrayList);
    }

    @dl.e
    public final String[] n() {
        return this.f93485c;
    }

    public final void p(@dl.d List<Pair<Integer, Integer>> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 46120, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.f93486d = list;
    }

    public final void q(@dl.e String[] strArr) {
        this.f93484b = strArr;
    }

    public final void r(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 46119, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.f93483a = context;
    }

    public final void s(@dl.e LoadingDialog loadingDialog) {
        this.f93489g = loadingDialog;
    }

    public final void t(@dl.d ArrayList<String> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 46121, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(arrayList, "<set-?>");
        this.f93487e = arrayList;
    }

    public final void u(@dl.d List<LocalMedia> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 46122, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.f93488f = list;
    }

    public final void v(@dl.e String[] strArr) {
        this.f93485c = strArr;
    }
}
