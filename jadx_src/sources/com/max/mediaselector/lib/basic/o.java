package com.max.mediaselector.lib.basic;

import android.app.Activity;
import android.text.TextUtils;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.mediaselector.lib.entity.LocalMediaFolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PictureSelectionQueryModel.java */
/* JADX INFO: loaded from: classes2.dex */
public class o {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PictureSelectionConfig f74963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f74964b;

    /* JADX INFO: compiled from: PictureSelectionQueryModel.java */
    public class a implements oe.m<LocalMediaFolder> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ oe.o f74965a;

        a(oe.o oVar) {
            this.f74965a = oVar;
        }

        @Override // oe.m
        public void a(List<LocalMediaFolder> list) {
            if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.l.Ak, new Class[]{List.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f74965a.a(list);
        }
    }

    /* JADX INFO: compiled from: PictureSelectionQueryModel.java */
    public class b implements oe.m<LocalMediaFolder> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.max.mediaselector.lib.loader.a f74967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ oe.o f74968b;

        /* JADX INFO: compiled from: PictureSelectionQueryModel.java */
        public class a extends oe.n<LocalMedia> {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // oe.n
            public void a(ArrayList<LocalMedia> arrayList, boolean z10) {
                if (PatchProxy.proxy(new Object[]{arrayList, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.Ck, new Class[]{ArrayList.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                b.this.f74968b.a(arrayList);
            }
        }

        b(com.max.mediaselector.lib.loader.a aVar, oe.o oVar) {
            this.f74967a = aVar;
            this.f74968b = oVar;
        }

        @Override // oe.m
        public void a(List<LocalMediaFolder> list) {
            if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.l.Bk, new Class[]{List.class}, Void.TYPE).isSupported || list == null || list.size() <= 0) {
                return;
            }
            LocalMediaFolder localMediaFolder = list.get(0);
            if (o.this.f74963a.f75046p1) {
                this.f74967a.i(localMediaFolder.a(), o.this.f74963a.f75032c0, new a());
            } else {
                this.f74968b.a(localMediaFolder.c());
            }
        }
    }

    public o(q qVar, int i10) {
        this.f74964b = qVar;
        PictureSelectionConfig pictureSelectionConfigB = PictureSelectionConfig.b();
        this.f74963a = pictureSelectionConfigB;
        pictureSelectionConfigB.f75029b = i10;
    }

    public com.max.mediaselector.lib.loader.a b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34551xk, new Class[0], com.max.mediaselector.lib.loader.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.mediaselector.lib.loader.a) patchProxyResultProxy.result;
        }
        Activity activityE = this.f74964b.e();
        if (activityE != null) {
            return this.f74963a.f75046p1 ? new com.max.mediaselector.lib.loader.d(activityE, this.f74963a) : new com.max.mediaselector.lib.loader.b(activityE, this.f74963a);
        }
        throw new NullPointerException("Activity cannot be null");
    }

    public o c(boolean z10) {
        this.f74963a.G = z10;
        return this;
    }

    public o d(boolean z10) {
        this.f74963a.E = z10;
        return this;
    }

    public o e(boolean z10) {
        this.f74963a.f75046p1 = z10;
        return this;
    }

    public o f(boolean z10, int i10) {
        PictureSelectionConfig pictureSelectionConfig = this.f74963a;
        pictureSelectionConfig.f75046p1 = z10;
        if (i10 < 10) {
            i10 = 60;
        }
        pictureSelectionConfig.f75032c0 = i10;
        return this;
    }

    public o g(boolean z10, int i10, boolean z11) {
        PictureSelectionConfig pictureSelectionConfig = this.f74963a;
        pictureSelectionConfig.f75046p1 = z10;
        if (i10 < 10) {
            i10 = 60;
        }
        pictureSelectionConfig.f75032c0 = i10;
        pictureSelectionConfig.f75057x1 = z11;
        return this;
    }

    public o h(boolean z10) {
        this.f74963a.F = z10;
        return this;
    }

    public void i(oe.o<LocalMediaFolder> oVar) {
        if (PatchProxy.proxy(new Object[]{oVar}, this, changeQuickRedirect, false, bb.c.l.f34573yk, new Class[]{oe.o.class}, Void.TYPE).isSupported) {
            return;
        }
        Activity activityE = this.f74964b.e();
        if (activityE == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        if (oVar == null) {
            throw new NullPointerException("OnQueryDataSourceListener cannot be null");
        }
        (this.f74963a.f75046p1 ? new com.max.mediaselector.lib.loader.d(activityE, this.f74963a) : new com.max.mediaselector.lib.loader.b(activityE, this.f74963a)).h(new a(oVar));
    }

    public void j(oe.o<LocalMedia> oVar) {
        if (PatchProxy.proxy(new Object[]{oVar}, this, changeQuickRedirect, false, bb.c.l.f34595zk, new Class[]{oe.o.class}, Void.TYPE).isSupported) {
            return;
        }
        Activity activityE = this.f74964b.e();
        if (activityE == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        if (oVar == null) {
            throw new NullPointerException("OnQueryDataSourceListener cannot be null");
        }
        com.max.mediaselector.lib.loader.a dVar = this.f74963a.f75046p1 ? new com.max.mediaselector.lib.loader.d(activityE, this.f74963a) : new com.max.mediaselector.lib.loader.b(activityE, this.f74963a);
        dVar.h(new b(dVar, oVar));
    }

    public o k(long j10) {
        if (j10 >= 1048576) {
            this.f74963a.f75059y = j10;
        } else {
            this.f74963a.f75059y = j10 * 1024;
        }
        return this;
    }

    public o l(long j10) {
        if (j10 >= 1048576) {
            this.f74963a.f75062z = j10;
        } else {
            this.f74963a.f75062z = j10 * 1024;
        }
        return this;
    }

    public o m(int i10) {
        this.f74963a.f75050r = i10 * 1000;
        return this;
    }

    public o n(int i10) {
        this.f74963a.f75051s = i10 * 1000;
        return this;
    }

    public o o(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.l.f34529wk, new Class[]{String.class}, o.class);
        if (patchProxyResultProxy.isSupported) {
            return (o) patchProxyResultProxy.result;
        }
        if (!TextUtils.isEmpty(str)) {
            this.f74963a.f75030b0 = str;
        }
        return this;
    }
}
