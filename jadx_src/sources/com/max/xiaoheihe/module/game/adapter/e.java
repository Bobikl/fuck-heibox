package com.max.xiaoheihe.module.game.adapter;

import android.content.Context;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

/* JADX INFO: compiled from: FilterAdapter.java */
/* JADX INFO: loaded from: classes11.dex */
public class e extends com.max.hbcommon.base.adapter.h<KeyDescObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f85674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f85675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CompoundButton f85676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f85677h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private KeyDescObj f85678i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f85679j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f85680k;

    /* JADX INFO: compiled from: FilterAdapter.java */
    public class a implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ KeyDescObj f85681b;

        a(KeyDescObj keyDescObj) {
            this.f85681b = keyDescObj;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 35537, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            e.d(e.this, compoundButton, z10);
            if (z10) {
                if (e.this.f85675f != null) {
                    e.this.f85675f.a(compoundButton, this.f85681b);
                }
                if (e.this.f85676g != null && e.this.f85676g != compoundButton) {
                    e.this.f85676g.setChecked(false);
                }
                e.this.f85676g = compoundButton;
            }
        }
    }

    /* JADX INFO: compiled from: FilterAdapter.java */
    public interface b {
        void a(CompoundButton compoundButton, KeyDescObj keyDescObj);
    }

    public e(Context context, List<KeyDescObj> list, KeyDescObj keyDescObj, b bVar) {
        this(context, list, keyDescObj, bVar, -1);
    }

    public e(Context context, List<KeyDescObj> list, KeyDescObj keyDescObj, b bVar, int i10) {
        this(context, list, keyDescObj, bVar, i10, R.layout.item_filter);
    }

    public e(Context context, List<KeyDescObj> list, KeyDescObj keyDescObj, b bVar, int i10, int i11) {
        super(context, list, i11);
        this.f85679j = -1;
        this.f85680k = false;
        this.f85680k = i11 == R.layout.item_filter_trans;
        this.f85674e = context;
        this.f85675f = bVar;
        if (keyDescObj != null || list.size() <= 0) {
            this.f85678i = keyDescObj;
        } else {
            this.f85678i = list.get(0);
        }
        this.f85677h = true;
        this.f85679j = i10;
    }

    public e(Context context, List<KeyDescObj> list, b bVar) {
        this(context, list, null, bVar);
    }

    static /* synthetic */ void d(e eVar, CompoundButton compoundButton, boolean z10) {
        if (PatchProxy.proxy(new Object[]{eVar, compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 35536, new Class[]{e.class, CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        eVar.i(compoundButton, z10);
    }

    private void i(CompoundButton compoundButton, boolean z10) {
        if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 35534, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            if (this.f85680k) {
                compoundButton.setTextColor(this.f85674e.getResources().getColor(R.color.black));
                return;
            } else {
                compoundButton.setTextColor(this.f85674e.getResources().getColor(R.color.white));
                return;
            }
        }
        if (this.f85680k) {
            compoundButton.setTextColor(this.f85674e.getResources().getColor(R.color.white_alpha30));
        } else {
            compoundButton.setTextColor(this.f85674e.getResources().getColor(R.color.text_primary_1_color));
        }
    }

    @Override // com.max.hbcommon.base.adapter.h
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.h.a aVar, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{aVar, keyDescObj}, this, changeQuickRedirect, false, 35535, new Class[]{com.max.hbcommon.base.adapter.h.a.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        h(aVar, keyDescObj);
    }

    public void h(com.max.hbcommon.base.adapter.h.a aVar, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{aVar, keyDescObj}, this, changeQuickRedirect, false, 35533, new Class[]{com.max.hbcommon.base.adapter.h.a.class, KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        RadioButton radioButton = (RadioButton) aVar.e(R.id.rb_filter);
        if (this.f85677h && this.f85678i != null && keyDescObj.getKey() != null && keyDescObj.getKey().equals(this.f85678i.getKey())) {
            radioButton.setChecked(true);
            i(radioButton, true);
            this.f85676g = radioButton;
            this.f85677h = false;
        }
        radioButton.setOnCheckedChangeListener(new a(keyDescObj));
        if (this.f85679j == 1) {
            radioButton.setText(keyDescObj.getValue());
        } else {
            radioButton.setText(keyDescObj.getDesc());
        }
    }
}
