package rc;

import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.provider.MediaStore;
import android.util.Size;
import androidx.annotation.w0;
import bb.c;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.max.hbimage.bean.common.HBLocalThumbModel;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Result;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.t0;

/* JADX INFO: compiled from: HBLocalThumbDataFetcher.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements d<InputStream> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    public static final a f138873i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final String f138874j = "HBLocalThumbDataFetcher-dbg";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f138875k = 400;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private final HBLocalThumbModel f138876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f138877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f138878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private CancellationSignal f138879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e
    private Long f138880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @e
    private ByteArrayOutputStream f138881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @e
    private InputStream f138882h;

    /* JADX INFO: compiled from: HBLocalThumbDataFetcher.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    public b(@e HBLocalThumbModel hBLocalThumbModel, int i10, int i11) {
        this.f138876b = hBLocalThumbModel;
        this.f138877c = i10;
        this.f138878d = i11;
    }

    private final Bitmap e(String str, Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, context}, this, changeQuickRedirect, false, c.g.f33076re, new Class[]{String.class, Context.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        long id2 = ContentUris.parseId(Uri.parse(str));
        Bitmap thumbnail = MediaStore.Images.Thumbnails.getThumbnail(context.getContentResolver(), id2, Math.max(this.f138877c, this.f138878d) < 8192 ? 3 : 2, null);
        this.f138880f = Long.valueOf(id2);
        return thumbnail;
    }

    @w0(29)
    private final Bitmap f(String str, Context context) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, context}, this, changeQuickRedirect, false, c.g.f33056qe, new Class[]{String.class, Context.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        Uri uri = Uri.parse(str);
        Size size = new Size(fi.u.u(this.f138877c, 400), fi.u.u(this.f138878d, 400));
        this.f138879e = new CancellationSignal();
        Bitmap bitmapLoadThumbnail = context.getContentResolver().loadThumbnail(uri, size, this.f138879e);
        f0.o(bitmapLoadThumbnail, "loadThumbnail(...)");
        return bitmapLoadThumbnail;
    }

    private final void g(String str, Context context, d.a<? super InputStream> aVar) {
        b2 b2Var;
        if (PatchProxy.proxy(new Object[]{str, context, aVar}, this, changeQuickRedirect, false, c.g.f33036pe, new Class[]{String.class, Context.class, d.a.class}, Void.TYPE).isSupported) {
            return;
        }
        if (context == null) {
            aVar.f(new Exception("[performLoadThumb] no context provide"));
            return;
        }
        Bitmap bitmapF = Build.VERSION.SDK_INT >= 29 ? f(str, context) : e(str, context);
        if (bitmapF != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapF.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            this.f138882h = byteArrayInputStream;
            this.f138881g = byteArrayOutputStream;
            aVar.e(byteArrayInputStream);
            b2Var = b2.f124493a;
        } else {
            b2Var = null;
        }
        if (b2Var == null) {
            aVar.f(new Exception("[performLoadThumb] no bitmap loaded for " + this.f138876b + ", with size(" + this.f138877c + " * " + this.f138878d + ')'));
            g.a aVar2 = g.f74531b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[HBLocalThumbDataFetcher-dbg][performLoadThumb] no bitmap loaded for ");
            sb2.append(this.f138876b);
            aVar2.v(sb2.toString());
        }
    }

    @Override // com.bumptech.glide.load.data.d
    @dl.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        Object objB;
        b2 b2Var;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.g.f33096se, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        try {
            Result.a aVar = Result.f124476c;
            ByteArrayOutputStream byteArrayOutputStream = this.f138881g;
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            InputStream inputStream = this.f138882h;
            if (inputStream != null) {
                inputStream.close();
                b2Var = b2.f124493a;
            } else {
                b2Var = null;
            }
            objB = Result.b(b2Var);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(t0.a(th2));
        }
        Throwable thE = Result.e(objB);
        if (thE != null) {
            g.f74531b.v("[HBLocalThumbDataFetcher-dbg][cleanup] failed close input stream for " + this.f138876b + ", cause:\n" + thE);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    @dl.d
    public DataSource c() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        Object objB;
        b2 b2Var;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.g.f33116te, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        try {
            Result.a aVar = Result.f124476c;
            Long l10 = this.f138880f;
            if (l10 != null) {
                long jLongValue = l10.longValue();
                Context applicationContext = ob.a.b().getApplicationContext();
                if (applicationContext != null) {
                    MediaStore.Images.Thumbnails.cancelThumbnailRequest(applicationContext.getContentResolver(), jLongValue);
                }
            }
            CancellationSignal cancellationSignal = this.f138879e;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
                b2Var = b2.f124493a;
            } else {
                b2Var = null;
            }
            objB = Result.b(b2Var);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(t0.a(th2));
        }
        Throwable thE = Result.e(objB);
        if (thE != null) {
            g.f74531b.v("[HBLocalThumbDataFetcher-dbg][cancel] error: " + thE);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void d(@dl.d Priority priority, @dl.d d.a<? super InputStream> callback) {
        Object objB;
        if (PatchProxy.proxy(new Object[]{priority, callback}, this, changeQuickRedirect, false, c.g.f33016oe, new Class[]{Priority.class, d.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(priority, "priority");
        f0.p(callback, "callback");
        HBLocalThumbModel hBLocalThumbModel = this.f138876b;
        String localMediaUrl = hBLocalThumbModel != null ? hBLocalThumbModel.getLocalMediaUrl() : null;
        if (localMediaUrl == null) {
            callback.f(new IllegalArgumentException("invalid model: " + this.f138876b));
            g.f74531b.v("[HBLocalThumbDataFetcher-dbg][loadData] invalid model: " + this.f138876b);
            return;
        }
        try {
            Result.a aVar = Result.f124476c;
            g(localMediaUrl, ob.a.b().getApplicationContext(), callback);
            objB = Result.b(b2.f124493a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(t0.a(th2));
        }
        Throwable thE = Result.e(objB);
        if (thE != null) {
            callback.f(new Exception("[loadData] fail loadData for " + this.f138876b + ", cause:\n" + thE));
            g.f74531b.v("[HBLocalThumbDataFetcher-dbg][loadData] load fail for " + this.f138876b + ", error: " + thE);
        }
    }
}
