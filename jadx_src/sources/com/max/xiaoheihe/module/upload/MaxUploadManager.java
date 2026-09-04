package com.max.xiaoheihe.module.upload;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.o;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: MaxUploadManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public abstract class MaxUploadManager {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f93430l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    @xh.e
    protected Context f93431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    @xh.e
    protected g.e f93432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    @xh.e
    protected g.d f93433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    @xh.e
    protected List<? extends File> f93434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    @xh.e
    protected List<? extends Uri> f93435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    @xh.e
    protected String f93436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    @xh.e
    protected io.reactivex.disposables.a f93437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    @xh.e
    protected Map<Integer, String> f93438h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @xh.e
    protected int f93439i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    @xh.e
    protected LoadingDialog f93440j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final q0 f93441k = r0.a(e1.c());

    @dl.d
    public final q0 a() {
        return this.f93441k;
    }

    public abstract void b();

    public final void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46139, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        k.f(this.f93441k, null, null, new MaxUploadManager$hideLoading$1(this, null), 3, null);
    }

    public final void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46138, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        k.f(this.f93441k, null, null, new MaxUploadManager$showLoading$1(this, null), 3, null);
    }

    public final void e(@dl.e io.reactivex.disposables.a aVar, @dl.d List<File> files, @dl.e String str, @dl.d g.e callBack, @dl.e g.d dVar) {
        if (PatchProxy.proxy(new Object[]{aVar, files, str, callBack, dVar}, this, changeQuickRedirect, false, 46136, new Class[]{io.reactivex.disposables.a.class, List.class, String.class, g.e.class, g.d.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(files, "files");
        f0.p(callBack, "callBack");
        this.f93434d = files;
        this.f93432b = callBack;
        this.f93433c = dVar;
        this.f93436f = str;
        this.f93438h = new HashMap(16);
        this.f93437g = aVar;
        this.f93439i = 0;
        k.f(this.f93441k, null, null, new MaxUploadManager$upload$1(this, files, callBack, "tencent", str, null), 3, null);
    }

    public final void f(@dl.e io.reactivex.disposables.a aVar, @dl.d List<Uri> uris, @dl.e String str, @dl.d g.e callBack, @dl.e g.d dVar) {
        if (PatchProxy.proxy(new Object[]{aVar, uris, str, callBack, dVar}, this, changeQuickRedirect, false, 46137, new Class[]{io.reactivex.disposables.a.class, List.class, String.class, g.e.class, g.d.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(uris, "uris");
        f0.p(callBack, "callBack");
        this.f93435e = uris;
        this.f93432b = callBack;
        this.f93433c = dVar;
        this.f93436f = str;
        this.f93437g = aVar;
        this.f93439i = uris.size();
        b();
    }
}
