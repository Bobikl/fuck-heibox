package com.max.component.componentactivities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import bb.c;
import com.max.component.HBComponentActivity;
import com.max.component.componentactivities.ComponentDetailActivity;
import com.max.component.f;
import com.max.component.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ComponentDetailActivity.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ComponentDetailActivity extends AppCompatActivity {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    public static final a f65484e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    public static final String f65485f = "ARG_COMPONENT_NAME";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sa.a f65486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private final ArrayList<Method> f65487c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private com.max.component.adapter.d f65488d;

    /* JADX INFO: compiled from: ComponentDetailActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @d
        public final Intent a(@d Context context, @e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, c.b.nm, new Class[]{Context.class, String.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) ComponentDetailActivity.class);
            intent.putExtra(ComponentDetailActivity.f65485f, str);
            return intent;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R0(ComponentDetailActivity this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, c.b.mm, new Class[]{ComponentDetailActivity.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        this$0.onBackPressed();
    }

    @e
    public final com.max.component.adapter.d O0() {
        return this.f65488d;
    }

    @d
    public final sa.a P0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.jm, new Class[0], sa.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (sa.a) patchProxyResultProxy.result;
        }
        sa.a aVar = this.f65486b;
        if (aVar != null) {
            return aVar;
        }
        f0.S("binding");
        return null;
    }

    @d
    public final ArrayList<Method> Q0() {
        return this.f65487c;
    }

    public final void S0(@e com.max.component.adapter.d dVar) {
        this.f65488d = dVar;
    }

    public final void T0(@d sa.a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, c.b.km, new Class[]{sa.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(aVar, "<set-?>");
        this.f65486b = aVar;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@e Bundle bundle) {
        View viewA;
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, c.b.lm, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        HBComponentActivity.f65381h.a(this);
        sa.a aVarC = sa.a.c(getLayoutInflater());
        f0.o(aVarC, "inflate(...)");
        T0(aVarC);
        setContentView(P0().b());
        String stringExtra = getIntent().getStringExtra(f65485f);
        P0().f139349b.setOnClickListener(new View.OnClickListener() { // from class: ra.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComponentDetailActivity.R0(this.f138866b, view);
            }
        });
        P0().f139352e.setText(stringExtra);
        g gVarD = f.f65491a.a().d(stringExtra);
        if (gVarD == null || (viewA = gVarD.a(this)) == null) {
            return;
        }
        this.f65488d = new com.max.component.adapter.d(this, this.f65487c, viewA);
        P0().f139351d.setLayoutManager(new LinearLayoutManager(this));
        P0().f139351d.setAdapter(this.f65488d);
        P0().f139350c.addView(viewA);
        Iterator<Method> it = com.max.component.c.d(viewA.getClass()).values().iterator();
        while (it.hasNext()) {
            this.f65487c.add(it.next());
        }
        com.max.component.adapter.d dVar = this.f65488d;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }
}
