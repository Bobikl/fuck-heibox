package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.browser.R;
import androidx.core.widget.q;
import com.bytedance.bpea.entry.common.DataType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: BrowserActionsFallbackMenuUi.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class d implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f3087g = "BrowserActionskMenuUi";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Context f3088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Uri f3089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<androidx.browser.browseractions.a> f3090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    InterfaceC0022d f3091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private androidx.browser.browseractions.c f3092f;

    /* JADX INFO: compiled from: BrowserActionsFallbackMenuUi.java */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((ClipboardManager) d.this.f3088b.getSystemService(DataType.CLIPBOARD)).setPrimaryClip(ClipData.newPlainText("url", d.this.f3089c.toString()));
            Toast.makeText(d.this.f3088b, d.this.f3088b.getString(R.string.copy_toast_msg), 0).show();
        }
    }

    /* JADX INFO: compiled from: BrowserActionsFallbackMenuUi.java */
    public class b implements DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f3094a;

        b(View view) {
            this.f3094a = view;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            InterfaceC0022d interfaceC0022d = d.this.f3091e;
            if (interfaceC0022d == null) {
                Log.e(d.f3087g, "Cannot trigger menu item listener, it is null");
            } else {
                interfaceC0022d.a(this.f3094a);
            }
        }
    }

    /* JADX INFO: compiled from: BrowserActionsFallbackMenuUi.java */
    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f3096b;

        c(TextView textView) {
            this.f3096b = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (q.k(this.f3096b) == Integer.MAX_VALUE) {
                this.f3096b.setMaxLines(1);
                this.f3096b.setEllipsize(TextUtils.TruncateAt.END);
            } else {
                this.f3096b.setMaxLines(Integer.MAX_VALUE);
                this.f3096b.setEllipsize(null);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.browser.browseractions.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BrowserActionsFallbackMenuUi.java */
    @j1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface InterfaceC0022d {
        void a(View view);
    }

    d(@n0 Context context, @n0 Uri uri, @n0 List<androidx.browser.browseractions.a> list) {
        this.f3088b = context;
        this.f3089c = uri;
        this.f3090d = b(list);
    }

    private Runnable a() {
        return new a();
    }

    @n0
    private List<androidx.browser.browseractions.a> b(List<androidx.browser.browseractions.a> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new androidx.browser.browseractions.a(this.f3088b.getString(R.string.fallback_menu_item_open_in_browser), c()));
        arrayList.add(new androidx.browser.browseractions.a(this.f3088b.getString(R.string.fallback_menu_item_copy_link), a()));
        arrayList.add(new androidx.browser.browseractions.a(this.f3088b.getString(R.string.fallback_menu_item_share_link), d()));
        arrayList.addAll(list);
        return arrayList;
    }

    private PendingIntent c() {
        return PendingIntent.getActivity(this.f3088b, 0, new Intent("android.intent.action.VIEW", this.f3089c), 67108864);
    }

    private PendingIntent d() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", this.f3089c.toString());
        intent.setType("text/plain");
        return PendingIntent.getActivity(this.f3088b, 0, intent, 67108864);
    }

    private BrowserActionsFallbackMenuView f(View view) {
        BrowserActionsFallbackMenuView browserActionsFallbackMenuView = (BrowserActionsFallbackMenuView) view.findViewById(R.id.browser_actions_menu_view);
        TextView textView = (TextView) view.findViewById(R.id.browser_actions_header_text);
        textView.setText(this.f3089c.toString());
        textView.setOnClickListener(new c(textView));
        ListView listView = (ListView) view.findViewById(R.id.browser_actions_menu_items);
        listView.setAdapter((ListAdapter) new androidx.browser.browseractions.b(this.f3090d, this.f3088b));
        listView.setOnItemClickListener(this);
        return browserActionsFallbackMenuView;
    }

    public void e() {
        View viewInflate = LayoutInflater.from(this.f3088b).inflate(R.layout.browser_actions_context_menu_page, (ViewGroup) null);
        androidx.browser.browseractions.c cVar = new androidx.browser.browseractions.c(this.f3088b, f(viewInflate));
        this.f3092f = cVar;
        cVar.setContentView(viewInflate);
        if (this.f3091e != null) {
            this.f3092f.setOnShowListener(new b(viewInflate));
        }
        this.f3092f.show();
    }

    @j1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    void g(@p0 InterfaceC0022d interfaceC0022d) {
        this.f3091e = interfaceC0022d;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        androidx.browser.browseractions.a aVar = this.f3090d.get(i10);
        if (aVar.a() != null) {
            try {
                aVar.a().send();
            } catch (PendingIntent.CanceledException e10) {
                Log.e(f3087g, "Failed to send custom item action", e10);
            }
        } else if (aVar.d() != null) {
            aVar.d().run();
        }
        androidx.browser.browseractions.c cVar = this.f3092f;
        if (cVar == null) {
            Log.e(f3087g, "Cannot dismiss dialog, it has already been dismissed.");
        } else {
            cVar.dismiss();
        }
    }
}
