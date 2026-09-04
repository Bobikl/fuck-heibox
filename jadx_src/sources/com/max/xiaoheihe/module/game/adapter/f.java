package com.max.xiaoheihe.module.game.adapter;

import android.content.Context;
import android.widget.CompoundButton;
import androidx.annotation.i0;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

/* JADX INFO: compiled from: FilterRVAdapter.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class f extends com.max.hbcommon.base.adapter.s<KeyDescObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f85683h = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f85684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private KeyDescObj f85685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private final a f85686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f85687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private CompoundButton f85688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f85689g;

    /* JADX INFO: compiled from: FilterRVAdapter.kt */
    public interface a {
        void a(@dl.d CompoundButton compoundButton, @dl.d KeyDescObj keyDescObj);
    }

    /* JADX INFO: compiled from: FilterRVAdapter.kt */
    public static final class b implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ KeyDescObj f85691c;

        b(KeyDescObj keyDescObj) {
            this.f85691c = keyDescObj;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton buttonView, boolean z10) {
            if (PatchProxy.proxy(new Object[]{buttonView, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 35542, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f fVar = f.this;
            kotlin.jvm.internal.f0.o(buttonView, "buttonView");
            f.p(fVar, buttonView, z10);
            if (z10) {
                a aVar = f.this.f85686d;
                if (aVar != null) {
                    aVar.a(buttonView, this.f85691c);
                }
                if (f.this.f85688f != null && !kotlin.jvm.internal.f0.g(f.this.f85688f, buttonView)) {
                    CompoundButton compoundButton = f.this.f85688f;
                    kotlin.jvm.internal.f0.m(compoundButton);
                    compoundButton.setChecked(false);
                }
                f.this.f85688f = buttonView;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(@dl.d Context context, @dl.d List<KeyDescObj> data, @dl.d KeyDescObj defaultCheckedItem) {
        this(context, data, defaultCheckedItem, null, 0, 16, null);
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(data, "data");
        kotlin.jvm.internal.f0.p(defaultCheckedItem, "defaultCheckedItem");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(@dl.d Context context, @dl.d List<KeyDescObj> data, @dl.d KeyDescObj defaultCheckedItem, @i0 int i10) {
        this(context, data, defaultCheckedItem, null, i10);
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(data, "data");
        kotlin.jvm.internal.f0.p(defaultCheckedItem, "defaultCheckedItem");
    }

    public /* synthetic */ f(Context context, List list, KeyDescObj keyDescObj, int i10, int i11, kotlin.jvm.internal.u uVar) {
        this(context, list, keyDescObj, (i11 & 8) != 0 ? R.layout.layout_filter_rv : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@dl.d Context context, @dl.d List<KeyDescObj> data, @dl.e KeyDescObj keyDescObj, @dl.e a aVar, @i0 int i10) {
        super(context, data, i10);
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(data, "data");
        this.f85684b = context;
        this.f85685c = keyDescObj;
        this.f85686d = aVar;
        this.f85687e = i10;
        if (keyDescObj == null && (!data.isEmpty())) {
            this.f85685c = data.get(0);
        }
        this.f85689g = false;
    }

    public /* synthetic */ f(Context context, List list, KeyDescObj keyDescObj, a aVar, int i10, int i11, kotlin.jvm.internal.u uVar) {
        this(context, list, keyDescObj, aVar, (i11 & 16) != 0 ? R.layout.layout_filter_rv : i10);
    }

    public static final /* synthetic */ void p(f fVar, CompoundButton compoundButton, boolean z10) {
        if (PatchProxy.proxy(new Object[]{fVar, compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 35541, new Class[]{f.class, CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        fVar.r(compoundButton, z10);
    }

    private final void r(CompoundButton compoundButton, boolean z10) {
        if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 35539, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            compoundButton.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            compoundButton.setTextColor(androidx.core.content.res.i.e(this.f85684b.getResources(), R.color.white, null));
        } else {
            compoundButton.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
            compoundButton.setTextColor(androidx.core.content.res.i.e(this.f85684b.getResources(), R.color.white_alpha40, null));
        }
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 35540, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        q(eVar, keyDescObj);
    }

    public void q(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d KeyDescObj data) {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35538, new Class[]{com.max.hbcommon.base.adapter.s.e.class, KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        CompoundButton rbFilter = (CompoundButton) viewHolder.i(R.id.rb_filter);
        if (!this.f85689g && this.f85685c != null) {
            String key = data.getKey();
            if (key != null) {
                KeyDescObj keyDescObj = this.f85685c;
                if (key.equals(keyDescObj != null ? keyDescObj.getKey() : null)) {
                    z10 = true;
                }
            }
            if (z10) {
                rbFilter.setChecked(true);
                kotlin.jvm.internal.f0.o(rbFilter, "rbFilter");
                r(rbFilter, true);
                this.f85688f = rbFilter;
                this.f85689g = true;
            }
        }
        rbFilter.setOnCheckedChangeListener(new b(data));
        rbFilter.setText(data.getValue());
    }
}
