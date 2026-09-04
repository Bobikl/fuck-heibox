package androidx.browser.browseractions;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.browser.R;
import androidx.core.content.res.i;
import com.google.common.util.concurrent.p0;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: BrowserActionsFallbackMenuAdapter.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class b extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<androidx.browser.browseractions.a> f3073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f3074c;

    /* JADX INFO: compiled from: BrowserActionsFallbackMenuAdapter.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f3075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f3076c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p0 f3077d;

        a(String str, c cVar, p0 p0Var) {
            this.f3075b = str;
            this.f3076c = cVar;
            this.f3077d = p0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmap;
            if (TextUtils.equals(this.f3075b, this.f3076c.f3081b.getText())) {
                try {
                    bitmap = (Bitmap) this.f3077d.get();
                } catch (InterruptedException | ExecutionException unused) {
                    bitmap = null;
                }
                if (bitmap != null) {
                    this.f3076c.f3080a.setVisibility(0);
                    this.f3076c.f3080a.setImageBitmap(bitmap);
                } else {
                    this.f3076c.f3080a.setVisibility(4);
                    this.f3076c.f3080a.setImageBitmap(null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.browser.browseractions.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BrowserActionsFallbackMenuAdapter.java */
    public class ExecutorC0021b implements Executor {
        ExecutorC0021b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@n0 Runnable runnable) {
            runnable.run();
        }
    }

    /* JADX INFO: compiled from: BrowserActionsFallbackMenuAdapter.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ImageView f3080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final TextView f3081b;

        c(ImageView imageView, TextView textView) {
            this.f3080a = imageView;
            this.f3081b = textView;
        }
    }

    b(List<androidx.browser.browseractions.a> list, Context context) {
        this.f3073b = list;
        this.f3074c = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f3073b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return this.f3073b.get(i10);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        c cVar;
        androidx.browser.browseractions.a aVar = this.f3073b.get(i10);
        if (view == null) {
            view = LayoutInflater.from(this.f3074c).inflate(R.layout.browser_actions_context_menu_row, (ViewGroup) null);
            ImageView imageView = (ImageView) view.findViewById(R.id.browser_actions_menu_item_icon);
            TextView textView = (TextView) view.findViewById(R.id.browser_actions_menu_item_text);
            if (imageView == null || textView == null) {
                throw new IllegalStateException("Browser Actions fallback UI does not contain necessary Views.");
            }
            cVar = new c(imageView, textView);
            view.setTag(cVar);
        } else {
            cVar = (c) view.getTag();
        }
        String strE = aVar.e();
        cVar.f3081b.setText(strE);
        if (aVar.b() != 0) {
            cVar.f3080a.setImageDrawable(i.g(this.f3074c.getResources(), aVar.b(), null));
        } else if (aVar.c() != null) {
            p0<Bitmap> p0VarL = BrowserServiceFileProvider.l(this.f3074c.getContentResolver(), aVar.c());
            p0VarL.V(new a(strE, cVar, p0VarL), new ExecutorC0021b());
        } else {
            cVar.f3080a.setImageBitmap(null);
            cVar.f3080a.setVisibility(4);
        }
        return view;
    }
}
