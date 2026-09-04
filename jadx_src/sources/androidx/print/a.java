package androidx.print;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.PrintManager;
import android.print.pdf.PrintedPdfDocument;
import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PrintHelper.java */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f26677g = "PrintHelper";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f26678h = 3500;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final boolean f26679i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final boolean f26680j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f26681k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f26682l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f26683m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f26684n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f26685o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f26686p = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f26687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    BitmapFactory.Options f26688b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Object f26689c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f26690d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f26691e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f26692f = 1;

    /* JADX INFO: renamed from: androidx.print.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PrintHelper.java */
    public class AsyncTaskC0206a extends AsyncTask<Void, Void, Throwable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f26693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PrintAttributes f26694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bitmap f26695c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ PrintAttributes f26696d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f26697e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptor f26698f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ PrintDocumentAdapter.WriteResultCallback f26699g;

        AsyncTaskC0206a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, Bitmap bitmap, PrintAttributes printAttributes2, int i10, ParcelFileDescriptor parcelFileDescriptor, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            this.f26693a = cancellationSignal;
            this.f26694b = printAttributes;
            this.f26695c = bitmap;
            this.f26696d = printAttributes2;
            this.f26697e = i10;
            this.f26698f = parcelFileDescriptor;
            this.f26699g = writeResultCallback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Throwable doInBackground(Void... voidArr) {
            RectF rectF;
            try {
                if (this.f26693a.isCanceled()) {
                    return null;
                }
                PrintedPdfDocument printedPdfDocument = new PrintedPdfDocument(a.this.f26687a, this.f26694b);
                Bitmap bitmapA = a.a(this.f26695c, this.f26694b.getColorMode());
                if (this.f26693a.isCanceled()) {
                    return null;
                }
                try {
                    PdfDocument.Page pageStartPage = printedPdfDocument.startPage(1);
                    boolean z10 = a.f26680j;
                    if (z10) {
                        rectF = new RectF(pageStartPage.getInfo().getContentRect());
                    } else {
                        PrintedPdfDocument printedPdfDocument2 = new PrintedPdfDocument(a.this.f26687a, this.f26696d);
                        PdfDocument.Page pageStartPage2 = printedPdfDocument2.startPage(1);
                        RectF rectF2 = new RectF(pageStartPage2.getInfo().getContentRect());
                        printedPdfDocument2.finishPage(pageStartPage2);
                        printedPdfDocument2.close();
                        rectF = rectF2;
                    }
                    Matrix matrixD = a.d(bitmapA.getWidth(), bitmapA.getHeight(), rectF, this.f26697e);
                    if (!z10) {
                        matrixD.postTranslate(rectF.left, rectF.top);
                        pageStartPage.getCanvas().clipRect(rectF);
                    }
                    pageStartPage.getCanvas().drawBitmap(bitmapA, matrixD, null);
                    printedPdfDocument.finishPage(pageStartPage);
                    if (this.f26693a.isCanceled()) {
                        return null;
                    }
                    printedPdfDocument.writeTo(new FileOutputStream(this.f26698f.getFileDescriptor()));
                    return null;
                } finally {
                    printedPdfDocument.close();
                    ParcelFileDescriptor parcelFileDescriptor = this.f26698f;
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException unused) {
                        }
                    }
                    if (bitmapA != this.f26695c) {
                        bitmapA.recycle();
                    }
                }
            } catch (Throwable th2) {
                return th2;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Throwable th2) {
            if (this.f26693a.isCanceled()) {
                this.f26699g.onWriteCancelled();
            } else if (th2 == null) {
                this.f26699g.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
            } else {
                Log.e(a.f26677g, "Error writing printed content", th2);
                this.f26699g.onWriteFailed(null);
            }
        }
    }

    /* JADX INFO: compiled from: PrintHelper.java */
    public interface b {
        void onFinish();
    }

    /* JADX INFO: compiled from: PrintHelper.java */
    @w0(19)
    public class c extends PrintDocumentAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f26701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f26702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Bitmap f26703c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final b f26704d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private PrintAttributes f26705e;

        c(String str, int i10, Bitmap bitmap, b bVar) {
            this.f26701a = str;
            this.f26702b = i10;
            this.f26703c = bitmap;
            this.f26704d = bVar;
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            b bVar = this.f26704d;
            if (bVar != null) {
                bVar.onFinish();
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            this.f26705e = printAttributes2;
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f26701a).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            a.this.r(this.f26705e, this.f26702b, this.f26703c, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    /* JADX INFO: compiled from: PrintHelper.java */
    @w0(19)
    public class d extends PrintDocumentAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f26707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Uri f26708b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final b f26709c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f26710d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        PrintAttributes f26711e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        AsyncTask<Uri, Boolean, Bitmap> f26712f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Bitmap f26713g = null;

        /* JADX INFO: renamed from: androidx.print.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PrintHelper.java */
        public class AsyncTaskC0207a extends AsyncTask<Uri, Boolean, Bitmap> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CancellationSignal f26715a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PrintAttributes f26716b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ PrintAttributes f26717c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ PrintDocumentAdapter.LayoutResultCallback f26718d;

            /* JADX INFO: renamed from: androidx.print.a$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: PrintHelper.java */
            public class C0208a implements CancellationSignal.OnCancelListener {
                C0208a() {
                }

                @Override // android.os.CancellationSignal.OnCancelListener
                public void onCancel() {
                    d.this.a();
                    AsyncTaskC0207a.this.cancel(false);
                }
            }

            AsyncTaskC0207a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, PrintAttributes printAttributes2, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback) {
                this.f26715a = cancellationSignal;
                this.f26716b = printAttributes;
                this.f26717c = printAttributes2;
                this.f26718d = layoutResultCallback;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Bitmap doInBackground(Uri... uriArr) {
                try {
                    d dVar = d.this;
                    return a.this.i(dVar.f26708b);
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onCancelled(Bitmap bitmap) {
                this.f26718d.onLayoutCancelled();
                d.this.f26712f = null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Bitmap bitmap) {
                PrintAttributes.MediaSize mediaSize;
                super.onPostExecute(bitmap);
                if (bitmap != null && (!a.f26679i || a.this.f26692f == 0)) {
                    synchronized (this) {
                        mediaSize = d.this.f26711e.getMediaSize();
                    }
                    if (mediaSize != null && mediaSize.isPortrait() != a.g(bitmap)) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(90.0f);
                        bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    }
                }
                d.this.f26713g = bitmap;
                if (bitmap != null) {
                    this.f26718d.onLayoutFinished(new PrintDocumentInfo.Builder(d.this.f26707a).setContentType(1).setPageCount(1).build(), true ^ this.f26716b.equals(this.f26717c));
                } else {
                    this.f26718d.onLayoutFailed(null);
                }
                d.this.f26712f = null;
            }

            @Override // android.os.AsyncTask
            protected void onPreExecute() {
                this.f26715a.setOnCancelListener(new C0208a());
            }
        }

        d(String str, Uri uri, b bVar, int i10) {
            this.f26707a = str;
            this.f26708b = uri;
            this.f26709c = bVar;
            this.f26710d = i10;
        }

        void a() {
            synchronized (a.this.f26689c) {
                BitmapFactory.Options options = a.this.f26688b;
                if (options != null) {
                    if (Build.VERSION.SDK_INT < 24) {
                        options.requestCancelDecode();
                    }
                    a.this.f26688b = null;
                }
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            super.onFinish();
            a();
            AsyncTask<Uri, Boolean, Bitmap> asyncTask = this.f26712f;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            b bVar = this.f26709c;
            if (bVar != null) {
                bVar.onFinish();
            }
            Bitmap bitmap = this.f26713g;
            if (bitmap != null) {
                bitmap.recycle();
                this.f26713g = null;
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            synchronized (this) {
                this.f26711e = printAttributes2;
            }
            if (cancellationSignal.isCanceled()) {
                layoutResultCallback.onLayoutCancelled();
            } else if (this.f26713g != null) {
                layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f26707a).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
            } else {
                this.f26712f = new AsyncTaskC0207a(cancellationSignal, printAttributes2, printAttributes, layoutResultCallback).execute(new Uri[0]);
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            a.this.r(this.f26711e, this.f26710d, this.f26713g, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f26679i = i10 > 23;
        f26680j = i10 != 23;
    }

    public a(@n0 Context context) {
        this.f26687a = context;
    }

    static Bitmap a(Bitmap bitmap, int i10) {
        if (i10 != 1) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    @w0(19)
    private static PrintAttributes.Builder b(PrintAttributes printAttributes) {
        PrintAttributes.Builder minMargins = new PrintAttributes.Builder().setMediaSize(printAttributes.getMediaSize()).setResolution(printAttributes.getResolution()).setMinMargins(printAttributes.getMinMargins());
        if (printAttributes.getColorMode() != 0) {
            minMargins.setColorMode(printAttributes.getColorMode());
        }
        if (printAttributes.getDuplexMode() != 0) {
            minMargins.setDuplexMode(printAttributes.getDuplexMode());
        }
        return minMargins;
    }

    static Matrix d(int i10, int i11, RectF rectF, int i12) {
        Matrix matrix = new Matrix();
        float f10 = i10;
        float fWidth = rectF.width() / f10;
        float fMax = i12 == 2 ? Math.max(fWidth, rectF.height() / i11) : Math.min(fWidth, rectF.height() / i11);
        matrix.postScale(fMax, fMax);
        matrix.postTranslate((rectF.width() - (f10 * fMax)) / 2.0f, (rectF.height() - (i11 * fMax)) / 2.0f);
        return matrix;
    }

    static boolean g(Bitmap bitmap) {
        return bitmap.getWidth() <= bitmap.getHeight();
    }

    private Bitmap h(Uri uri, BitmapFactory.Options options) throws Throwable {
        Context context;
        if (uri == null || (context = this.f26687a) == null) {
            throw new IllegalArgumentException("bad argument to loadBitmap");
        }
        InputStream inputStream = null;
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException e10) {
                        Log.w(f26677g, "close fail ", e10);
                    }
                }
                return bitmapDecodeStream;
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStreamOpenInputStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e11) {
                        Log.w(f26677g, "close fail ", e11);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static boolean q() {
        return true;
    }

    public int c() {
        return this.f26691e;
    }

    public int e() {
        int i10 = this.f26692f;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public int f() {
        return this.f26690d;
    }

    Bitmap i(Uri uri) throws Throwable {
        BitmapFactory.Options options;
        if (uri == null || this.f26687a == null) {
            throw new IllegalArgumentException("bad argument to getScaledBitmap");
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        h(uri, options2);
        int i10 = options2.outWidth;
        int i11 = options2.outHeight;
        if (i10 > 0 && i11 > 0) {
            int iMax = Math.max(i10, i11);
            int i12 = 1;
            while (iMax > 3500) {
                iMax >>>= 1;
                i12 <<= 1;
            }
            if (i12 > 0 && Math.min(i10, i11) / i12 > 0) {
                synchronized (this.f26689c) {
                    options = new BitmapFactory.Options();
                    this.f26688b = options;
                    options.inMutable = true;
                    options.inSampleSize = i12;
                }
                try {
                    Bitmap bitmapH = h(uri, options);
                    synchronized (this.f26689c) {
                        this.f26688b = null;
                    }
                    return bitmapH;
                } catch (Throwable th2) {
                    synchronized (this.f26689c) {
                        this.f26688b = null;
                        throw th2;
                    }
                }
            }
        }
        return null;
    }

    public void j(@n0 String str, @n0 Bitmap bitmap) {
        k(str, bitmap, null);
    }

    public void k(@n0 String str, @n0 Bitmap bitmap, @p0 b bVar) {
        if (bitmap == null) {
            return;
        }
        ((PrintManager) this.f26687a.getSystemService("print")).print(str, new c(str, this.f26690d, bitmap, bVar), new PrintAttributes.Builder().setMediaSize(g(bitmap) ? PrintAttributes.MediaSize.UNKNOWN_PORTRAIT : PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE).setColorMode(this.f26691e).build());
    }

    public void l(@n0 String str, @n0 Uri uri) throws FileNotFoundException {
        m(str, uri, null);
    }

    public void m(@n0 String str, @n0 Uri uri, @p0 b bVar) throws FileNotFoundException {
        d dVar = new d(str, uri, bVar, this.f26690d);
        PrintManager printManager = (PrintManager) this.f26687a.getSystemService("print");
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        builder.setColorMode(this.f26691e);
        int i10 = this.f26692f;
        if (i10 == 1 || i10 == 0) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
        } else if (i10 == 2) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
        }
        printManager.print(str, dVar, builder.build());
    }

    public void n(int i10) {
        this.f26691e = i10;
    }

    public void o(int i10) {
        this.f26692f = i10;
    }

    public void p(int i10) {
        this.f26690d = i10;
    }

    @w0(19)
    void r(PrintAttributes printAttributes, int i10, Bitmap bitmap, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        new AsyncTaskC0206a(cancellationSignal, f26680j ? printAttributes : b(printAttributes).setMinMargins(new PrintAttributes.Margins(0, 0, 0, 0)).build(), bitmap, printAttributes, i10, parcelFileDescriptor, writeResultCallback).execute(new Void[0]);
    }
}
