package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.widget.MediaController;
import androidx.annotation.f0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u0;
import androidx.annotation.v;
import androidx.annotation.x;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: GifDrawable.java */
/* JADX INFO: loaded from: classes5.dex */
public class d extends Drawable implements Animatable, MediaController.MediaPlayerControl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ScheduledThreadPoolExecutor f138339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile boolean f138340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f138341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f138342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final Paint f138343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Bitmap f138344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final GifInfoHandle f138345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final ConcurrentLinkedQueue<pl.droidsonroids.gif.a> f138346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ColorStateList f138347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PorterDuffColorFilter f138348k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private PorterDuff.Mode f138349l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final boolean f138350m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final l f138351n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final p f138352o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Rect f138353p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ScheduledFuture<?> f138354q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f138355r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f138356s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private kl.b f138357t;

    /* JADX INFO: compiled from: GifDrawable.java */
    public class a extends q {
        a(d dVar) {
            super(dVar);
        }

        @Override // pl.droidsonroids.gif.q
        public void a() {
            if (d.this.f138345h.C()) {
                d.this.start();
            }
        }
    }

    /* JADX INFO: compiled from: GifDrawable.java */
    public class b extends q {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f138359c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d dVar, int i10) {
            super(dVar);
            this.f138359c = i10;
        }

        @Override // pl.droidsonroids.gif.q
        public void a() {
            d dVar = d.this;
            dVar.f138345h.I(this.f138359c, dVar.f138344g);
            this.f138397b.f138351n.sendEmptyMessageAtTime(-1, 0L);
        }
    }

    /* JADX INFO: compiled from: GifDrawable.java */
    public class c extends q {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f138361c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(d dVar, int i10) {
            super(dVar);
            this.f138361c = i10;
        }

        @Override // pl.droidsonroids.gif.q
        public void a() {
            d dVar = d.this;
            dVar.f138345h.G(this.f138361c, dVar.f138344g);
            d.this.f138351n.sendEmptyMessageAtTime(-1, 0L);
        }
    }

    public d(@p0 ContentResolver contentResolver, @n0 Uri uri) throws IOException {
        this(GifInfoHandle.y(contentResolver, uri), null, null, true);
    }

    public d(@n0 AssetFileDescriptor assetFileDescriptor) throws IOException {
        this(new GifInfoHandle(assetFileDescriptor), null, null, true);
    }

    public d(@n0 AssetManager assetManager, @n0 String str) throws IOException {
        this(assetManager.openFd(str));
    }

    public d(@n0 Resources resources, @u0 @v int i10) throws Resources.NotFoundException, IOException {
        this(resources.openRawResourceFd(i10));
        float fB = j.b(resources, i10);
        this.f138356s = (int) (this.f138345h.i() * fB);
        this.f138355r = (int) (this.f138345h.q() * fB);
    }

    public d(@n0 File file) throws IOException {
        this(file.getPath());
    }

    public d(@n0 FileDescriptor fileDescriptor) throws IOException {
        this(new GifInfoHandle(fileDescriptor), null, null, true);
    }

    public d(@n0 InputStream inputStream) throws IOException {
        this(new GifInfoHandle(inputStream), null, null, true);
    }

    public d(@n0 String str) throws IOException {
        this(new GifInfoHandle(str), null, null, true);
    }

    public d(@n0 ByteBuffer byteBuffer) throws IOException {
        this(new GifInfoHandle(byteBuffer), null, null, true);
    }

    d(GifInfoHandle gifInfoHandle, d dVar, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, boolean z10) {
        this.f138340c = true;
        this.f138341d = Long.MIN_VALUE;
        this.f138342e = new Rect();
        this.f138343f = new Paint(6);
        this.f138346i = new ConcurrentLinkedQueue<>();
        p pVar = new p(this);
        this.f138352o = pVar;
        this.f138350m = z10;
        this.f138339b = scheduledThreadPoolExecutor == null ? h.a() : scheduledThreadPoolExecutor;
        this.f138345h = gifInfoHandle;
        Bitmap bitmap = null;
        if (dVar != null) {
            synchronized (dVar.f138345h) {
                if (!dVar.f138345h.w() && dVar.f138345h.i() >= gifInfoHandle.i() && dVar.f138345h.q() >= gifInfoHandle.q()) {
                    dVar.K();
                    Bitmap bitmap2 = dVar.f138344g;
                    bitmap2.eraseColor(0);
                    bitmap = bitmap2;
                }
            }
        }
        if (bitmap == null) {
            this.f138344g = Bitmap.createBitmap(gifInfoHandle.q(), gifInfoHandle.i(), Bitmap.Config.ARGB_8888);
        } else {
            this.f138344g = bitmap;
        }
        this.f138344g.setHasAlpha(!gifInfoHandle.v());
        this.f138353p = new Rect(0, 0, gifInfoHandle.q(), gifInfoHandle.i());
        this.f138351n = new l(this);
        pVar.a();
        this.f138355r = gifInfoHandle.q();
        this.f138356s = gifInfoHandle.i();
    }

    protected d(@n0 k kVar, @p0 d dVar, @p0 ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, boolean z10, @n0 g gVar) throws IOException {
        this(kVar.b(gVar), dVar, scheduledThreadPoolExecutor, z10);
    }

    public d(@n0 byte[] bArr) throws IOException {
        this(new GifInfoHandle(bArr), null, null, true);
    }

    private void B() {
        if (this.f138350m && this.f138340c) {
            long j10 = this.f138341d;
            if (j10 != Long.MIN_VALUE) {
                long jMax = Math.max(0L, j10 - SystemClock.uptimeMillis());
                this.f138341d = Long.MIN_VALUE;
                this.f138339b.remove(this.f138352o);
                this.f138354q = this.f138339b.schedule(this.f138352o, jMax, TimeUnit.MILLISECONDS);
            }
        }
    }

    private void K() {
        this.f138340c = false;
        this.f138351n.removeMessages(-1);
        this.f138345h.A();
    }

    private PorterDuffColorFilter M(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void d() {
        ScheduledFuture<?> scheduledFuture = this.f138354q;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f138351n.removeMessages(-1);
    }

    @p0
    public static d e(@n0 Resources resources, @u0 @v int i10) {
        try {
            return new d(resources, i10);
        } catch (IOException unused) {
            return null;
        }
    }

    public void A() {
        this.f138339b.execute(new a(this));
    }

    public void C(@f0(from = 0, to = 2147483647L) int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Position is not positive");
        }
        synchronized (this.f138345h) {
            this.f138345h.I(i10, this.f138344g);
        }
        this.f138351n.sendEmptyMessageAtTime(-1, 0L);
    }

    public void D(@f0(from = 0, to = 2147483647L) int i10) {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Frame index is not positive");
        }
        this.f138339b.execute(new c(this, i10));
    }

    public Bitmap E(@f0(from = 0, to = 2147483647L) int i10) {
        Bitmap bitmapI;
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Frame index is not positive");
        }
        synchronized (this.f138345h) {
            this.f138345h.G(i10, this.f138344g);
            bitmapI = i();
        }
        this.f138351n.sendEmptyMessageAtTime(-1, 0L);
        return bitmapI;
    }

    public Bitmap F(@f0(from = 0, to = 2147483647L) int i10) {
        Bitmap bitmapI;
        if (i10 < 0) {
            throw new IllegalArgumentException("Position is not positive");
        }
        synchronized (this.f138345h) {
            this.f138345h.I(i10, this.f138344g);
            bitmapI = i();
        }
        this.f138351n.sendEmptyMessageAtTime(-1, 0L);
        return bitmapI;
    }

    public void G(@x(from = 0.0d) float f10) {
        kl.a aVar = new kl.a(f10);
        this.f138357t = aVar;
        aVar.b(this.f138342e);
    }

    public void H(@f0(from = 0, to = WebSocketProtocol.PAYLOAD_SHORT_MAX) int i10) {
        this.f138345h.J(i10);
    }

    public void I(@x(from = 0.0d, fromInclusive = false) float f10) {
        this.f138345h.L(f10);
    }

    public void J(@p0 kl.b bVar) {
        this.f138357t = bVar;
        if (bVar != null) {
            bVar.b(this.f138342e);
        }
    }

    void L(long j10) {
        if (this.f138350m) {
            this.f138341d = 0L;
            this.f138351n.sendEmptyMessageAtTime(-1, 0L);
        } else {
            d();
            this.f138354q = this.f138339b.schedule(this.f138352o, Math.max(j10, 0L), TimeUnit.MILLISECONDS);
        }
    }

    public void a(@n0 pl.droidsonroids.gif.a aVar) {
        this.f138346i.add(aVar);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return r() > 1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return r() > 1;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@n0 Canvas canvas) {
        boolean z10;
        if (this.f138348k == null || this.f138343f.getColorFilter() != null) {
            z10 = false;
        } else {
            this.f138343f.setColorFilter(this.f138348k);
            z10 = true;
        }
        kl.b bVar = this.f138357t;
        if (bVar == null) {
            canvas.drawBitmap(this.f138344g, this.f138353p, this.f138342e, this.f138343f);
        } else {
            bVar.a(canvas, this.f138343f, this.f138344g);
        }
        if (z10) {
            this.f138343f.setColorFilter(null);
        }
    }

    public long f() {
        return this.f138345h.b() + ((long) this.f138344g.getAllocationByteCount());
    }

    @p0
    public String g() {
        return this.f138345h.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f138343f.getAlpha();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        return 100;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f138343f.getColorFilter();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        return this.f138345h.f();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        return this.f138345h.g();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f138356s;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f138355r;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return (!this.f138345h.v() || this.f138343f.getAlpha() < 255) ? -2 : -1;
    }

    @x(from = 0.0d)
    public float h() {
        kl.b bVar = this.f138357t;
        if (bVar instanceof kl.a) {
            return ((kl.a) bVar).d();
        }
        return 0.0f;
    }

    public Bitmap i() {
        Bitmap bitmap = this.f138344g;
        Bitmap bitmapCopy = bitmap.copy(bitmap.getConfig(), this.f138344g.isMutable());
        bitmapCopy.setHasAlpha(this.f138344g.hasAlpha());
        return bitmapCopy;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        B();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        return this.f138340c;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f138340c;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        return super.isStateful() || ((colorStateList = this.f138347j) != null && colorStateList.isStateful());
    }

    public int j() {
        return this.f138345h.d();
    }

    public int k() {
        int iE = this.f138345h.e();
        return (iE == 0 || iE < this.f138345h.j()) ? iE : iE - 1;
    }

    @n0
    public GifError l() {
        return GifError.fromCode(this.f138345h.l());
    }

    public int m() {
        return this.f138344g.getRowBytes() * this.f138344g.getHeight();
    }

    public int n(@f0(from = 0) int i10) {
        return this.f138345h.h(i10);
    }

    public long o() {
        return this.f138345h.p();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f138342e.set(rect);
        kl.b bVar = this.f138357t;
        if (bVar != null) {
            bVar.b(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f138347j;
        if (colorStateList == null || (mode = this.f138349l) == null) {
            return false;
        }
        this.f138348k = M(colorStateList, mode);
        return true;
    }

    public int p() {
        return this.f138345h.j();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        stop();
    }

    public long q() {
        return this.f138345h.k();
    }

    public int r() {
        return this.f138345h.n();
    }

    @n0
    public final Paint s() {
        return this.f138343f;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(@f0(from = 0, to = 2147483647L) int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Position is not positive");
        }
        this.f138339b.execute(new b(this, i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@f0(from = 0, to = 255) int i10) {
        this.f138343f.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@p0 ColorFilter colorFilter) {
        this.f138343f.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f138343f.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f138343f.setFilterBitmap(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f138347j = colorStateList;
        this.f138348k = M(colorStateList, this.f138349l);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@p0 PorterDuff.Mode mode) {
        this.f138349l = mode;
        this.f138348k = M(this.f138347j, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (!this.f138350m) {
            if (z10) {
                if (z11) {
                    A();
                }
                if (visible) {
                    start();
                }
            } else if (visible) {
                stop();
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable, android.widget.MediaController.MediaPlayerControl
    public void start() {
        synchronized (this) {
            if (this.f138340c) {
                return;
            }
            this.f138340c = true;
            L(this.f138345h.D());
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        synchronized (this) {
            if (this.f138340c) {
                this.f138340c = false;
                d();
                this.f138345h.F();
            }
        }
    }

    public int t(@f0(from = 0) int i10, @f0(from = 0) int i11) {
        if (i10 >= this.f138345h.q()) {
            throw new IllegalArgumentException("x must be < width");
        }
        if (i11 < this.f138345h.i()) {
            return this.f138344g.getPixel(i10, i11);
        }
        throw new IllegalArgumentException("y must be < height");
    }

    @n0
    public String toString() {
        return String.format(Locale.ENGLISH, "GIF: size: %dx%d, frames: %d, error: %d", Integer.valueOf(this.f138345h.q()), Integer.valueOf(this.f138345h.i()), Integer.valueOf(this.f138345h.n()), Integer.valueOf(this.f138345h.l()));
    }

    public void u(@n0 int[] iArr) {
        this.f138344g.getPixels(iArr, 0, this.f138345h.q(), 0, 0, this.f138345h.q(), this.f138345h.i());
    }

    @p0
    public kl.b v() {
        return this.f138357t;
    }

    public boolean w() {
        return this.f138345h.u();
    }

    public boolean x() {
        return this.f138345h.w();
    }

    public void y() {
        K();
        this.f138344g.recycle();
    }

    public boolean z(pl.droidsonroids.gif.a aVar) {
        return this.f138346i.remove(aVar);
    }
}
