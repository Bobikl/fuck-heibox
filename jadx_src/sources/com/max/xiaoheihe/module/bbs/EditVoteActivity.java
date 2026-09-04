package com.max.xiaoheihe.module.bbs;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbpermission.PermissionManager;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkVoteObj;
import com.max.xiaoheihe.bean.bbs.BBSVoteOptionObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class EditVoteActivity extends BaseActivity {
    public static final String R = "vote_info";
    public static ChangeQuickRedirect changeQuickRedirect;
    private BBSLinkVoteObj L;
    private com.max.hbcommon.base.adapter.s<BBSVoteOptionObj> M;
    private LoadingDialog N;
    private int O = 2;
    private List<BBSVoteOptionObj> P = new ArrayList();
    private df.t Q;

    public class a implements com.max.xiaoheihe.module.upload.g.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ void a(float f10) {
            com.max.xiaoheihe.module.upload.h.b(this, f10);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean b() {
            return com.max.xiaoheihe.module.upload.h.a(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void c(String[] strArr, String str) {
            if (PatchProxy.proxy(new Object[]{strArr, str}, this, changeQuickRedirect, false, 26261, new Class[]{String[].class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < EditVoteActivity.this.P.size(); i11++) {
                if (com.max.hbcommon.utils.c.u(((BBSVoteOptionObj) EditVoteActivity.this.P.get(i11)).getImgurl())) {
                    ((BBSVoteOptionObj) EditVoteActivity.this.P.get(i11)).setImgurl(strArr[i10]);
                    i10++;
                }
            }
            EditVoteActivity.W1(EditVoteActivity.this);
            if (EditVoteActivity.this.N != null) {
                EditVoteActivity.this.N.c();
            }
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean d() {
            return com.max.xiaoheihe.module.upload.h.c(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void e(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 26262, new Class[]{String.class}, Void.TYPE).isSupported || EditVoteActivity.this.N == null) {
                return;
            }
            EditVoteActivity.this.N.c();
        }
    }

    public class b implements com.max.hbpermission.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f79790a;

        b(int i10) {
            this.f79790a = i10;
        }

        @Override // com.max.hbpermission.c
        public void onResult() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26263, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.mediaselector.e.g(((BaseActivity) EditVoteActivity.this).f66601b, 1, this.f79790a);
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26260, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            EditVoteActivity.M1(EditVoteActivity.this);
        }
    }

    public class d extends com.max.hbcommon.base.adapter.s<BBSVoteOptionObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f79794b;

            a(int i10) {
                this.f79794b = i10;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26266, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                EditVoteActivity.b2(EditVoteActivity.this, this.f79794b);
            }
        }

        public class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BBSVoteOptionObj f79796b;

            b(BBSVoteOptionObj bBSVoteOptionObj) {
                this.f79796b = bBSVoteOptionObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26267, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                EditVoteActivity.this.P.remove(this.f79796b);
                EditVoteActivity.this.M.notifyDataSetChanged();
                if (EditVoteActivity.this.L.getVote_num() > EditVoteActivity.this.P.size()) {
                    EditVoteActivity.this.L.setVote_num(EditVoteActivity.this.P.size());
                    EditVoteActivity.f2(EditVoteActivity.this);
                }
            }
        }

        public class c implements TextWatcher {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BBSVoteOptionObj f79798b;

            c(BBSVoteOptionObj bBSVoteOptionObj) {
                this.f79798b = bBSVoteOptionObj;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (!PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 26268, new Class[]{Editable.class}, Void.TYPE).isSupported && editable.length() > 0) {
                    this.f79798b.setText(editable.toString());
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }
        }

        d(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, BBSVoteOptionObj bBSVoteOptionObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSVoteOptionObj}, this, changeQuickRedirect, false, 26264, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSVoteOptionObj.class}, Void.TYPE).isSupported) {
                return;
            }
            eVar.setIsRecyclable(false);
            ImageView imageView = (ImageView) eVar.i(R.id.iv_option_icon);
            ImageView imageView2 = (ImageView) eVar.i(R.id.iv_del);
            TextView textView = (TextView) eVar.i(R.id.tv_option_num);
            EditText editText = (EditText) eVar.i(R.id.et_option);
            int adapterPosition = eVar.getAdapterPosition();
            if (EditVoteActivity.this.L.getOption_mode() == 0) {
                imageView.setVisibility(8);
                textView.setVisibility(0);
                textView.setText((eVar.getAdapterPosition() + 1) + "");
            } else {
                imageView.setVisibility(0);
                textView.setVisibility(8);
                if (!com.max.hbcommon.utils.c.u(bBSVoteOptionObj.getImgpath())) {
                    com.max.mediaselector.utils.c.u().q(bBSVoteOptionObj.getImgpath(), imageView, ViewUtils.f(((BaseActivity) EditVoteActivity.this).f66601b, 30.0f), ViewUtils.f(((BaseActivity) EditVoteActivity.this).f66601b, 30.0f));
                } else if (com.max.hbcommon.utils.c.u(bBSVoteOptionObj.getImgurl())) {
                    imageView.setImageResource(R.drawable.bbs_add_80x80);
                } else {
                    com.max.hbimage.b.K(bBSVoteOptionObj.getImgurl(), imageView);
                }
                imageView.setOnClickListener(new a(adapterPosition));
            }
            imageView2.setOnClickListener(new b(bBSVoteOptionObj));
            editText.setText(bBSVoteOptionObj.getText());
            if (!com.max.hbcommon.utils.c.u(bBSVoteOptionObj.getText())) {
                editText.setSelection(bBSVoteOptionObj.getText().length());
            }
            editText.addTextChangedListener(new c(bBSVoteOptionObj));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, BBSVoteOptionObj bBSVoteOptionObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSVoteOptionObj}, this, changeQuickRedirect, false, 26265, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, bBSVoteOptionObj);
        }
    }

    public class e implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (!PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 26269, new Class[]{Editable.class}, Void.TYPE).isSupported && editable.length() > 0) {
                EditVoteActivity.this.L.setVote_title(editable.toString());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class f implements RadioGroup.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i10) {
            if (PatchProxy.proxy(new Object[]{radioGroup, new Integer(i10)}, this, changeQuickRedirect, false, 26270, new Class[]{RadioGroup.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (i10 == R.id.rb_text) {
                EditVoteActivity.this.L.setOption_mode(0);
            } else {
                EditVoteActivity.this.L.setOption_mode(1);
            }
            EditVoteActivity.this.M.notifyDataSetChanged();
        }
    }

    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26271, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            EditVoteActivity.this.P.add(new BBSVoteOptionObj());
            EditVoteActivity.this.M.notifyItemInserted(EditVoteActivity.this.P.size() - 1);
        }
    }

    public class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 26273, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        public class b implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 26274, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                EditVoteActivity.this.setResult(-1, new Intent());
                EditVoteActivity.this.finish();
                dialogInterface.dismiss();
            }
        }

        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26272, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(((BaseActivity) EditVoteActivity.this).f66601b);
            fVar.y("是否删除该投票").u(EditVoteActivity.this.getString(R.string.confirm), new b()).o(EditVoteActivity.this.getString(R.string.cancel), new a());
            fVar.F();
        }
    }

    public class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Calendar f79806b;

        public class a implements DatePickerDialog.OnDateSetListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.EditVoteActivity$i$a$a, reason: collision with other inner class name */
            public class C0668a implements TimePickerDialog.OnTimeSetListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                C0668a() {
                }

                @Override // android.app.TimePickerDialog.OnTimeSetListener
                public void onTimeSet(TimePicker timePicker, int i10, int i11) {
                    Object[] objArr = {timePicker, new Integer(i10), new Integer(i11)};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    Class cls = Integer.TYPE;
                    if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 26277, new Class[]{TimePicker.class, cls, cls}, Void.TYPE).isSupported) {
                        return;
                    }
                    EditVoteActivity.this.L.getVote_end_date().set(11, i10);
                    EditVoteActivity.this.L.getVote_end_date().set(12, i11);
                    EditVoteActivity.O1(EditVoteActivity.this);
                }
            }

            a() {
            }

            @Override // android.app.DatePickerDialog.OnDateSetListener
            public void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
                Object[] objArr = {datePicker, new Integer(i10), new Integer(i11), new Integer(i12)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 26276, new Class[]{DatePicker.class, cls, cls, cls}, Void.TYPE).isSupported) {
                    return;
                }
                EditVoteActivity.this.L.getVote_end_date().set(i10, i11, i12);
                EditVoteActivity.O1(EditVoteActivity.this);
                new TimePickerDialog(((BaseActivity) EditVoteActivity.this).f66601b, new C0668a(), EditVoteActivity.this.L.getVote_end_date().get(11), EditVoteActivity.this.L.getVote_end_date().get(12), true).show();
            }
        }

        i(Calendar calendar) {
            this.f79806b = calendar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26275, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            DatePickerDialog datePickerDialog = new DatePickerDialog(((BaseActivity) EditVoteActivity.this).f66601b, new a(), EditVoteActivity.this.L.getVote_end_date().get(1), EditVoteActivity.this.L.getVote_end_date().get(2), EditVoteActivity.this.L.getVote_end_date().get(5));
            datePickerDialog.getDatePicker().setMinDate(this.f79806b.getTimeInMillis());
            datePickerDialog.show();
        }
    }

    public class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements HeyBoxPopupMenu.h {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
            public void a(View view, KeyDescObj keyDescObj) {
                if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 26279, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                EditVoteActivity.this.L.setVote_type(keyDescObj.getKey());
                EditVoteActivity.T1(EditVoteActivity.this);
                EditVoteActivity.f2(EditVoteActivity.this);
            }
        }

        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26278, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            KeyDescObj keyDescObj = new KeyDescObj();
            keyDescObj.setKey("1");
            keyDescObj.setDesc(com.max.xiaoheihe.utils.d.n0(R.string.vote_type_single));
            arrayList.add(keyDescObj);
            KeyDescObj keyDescObj2 = new KeyDescObj();
            keyDescObj2.setKey("2");
            keyDescObj2.setDesc(com.max.xiaoheihe.utils.d.n0(R.string.vote_type_multi));
            arrayList.add(keyDescObj2);
            if (EditVoteActivity.this.L == null || !keyDescObj2.getKey().equals(EditVoteActivity.this.L.getVote_type())) {
                keyDescObj.setChecked(true);
            } else {
                keyDescObj2.setChecked(true);
            }
            HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(((BaseActivity) EditVoteActivity.this).f66601b, arrayList);
            heyBoxPopupMenu.R(new a());
            heyBoxPopupMenu.show();
        }
    }

    public class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements HeyBoxPopupMenu.h {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
            public void a(View view, KeyDescObj keyDescObj) {
                if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 26281, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                EditVoteActivity.this.L.setVote_num(com.max.hbutils.utils.n.q(keyDescObj.getKey()));
                EditVoteActivity.f2(EditVoteActivity.this);
            }
        }

        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26280, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 < EditVoteActivity.this.P.size()) {
                KeyDescObj keyDescObj = new KeyDescObj();
                i10++;
                String strValueOf = String.valueOf(i10);
                keyDescObj.setKey(strValueOf);
                keyDescObj.setDesc(strValueOf);
                if (EditVoteActivity.this.L == null || EditVoteActivity.this.L.getVote_num() != i10) {
                    keyDescObj.setChecked(false);
                } else {
                    keyDescObj.setChecked(true);
                }
                arrayList.add(keyDescObj);
            }
            HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(((BaseActivity) EditVoteActivity.this).f66601b, arrayList);
            heyBoxPopupMenu.R(new a());
            heyBoxPopupMenu.show();
        }
    }

    static /* synthetic */ void M1(EditVoteActivity editVoteActivity) {
        if (PatchProxy.proxy(new Object[]{editVoteActivity}, null, changeQuickRedirect, true, 26254, new Class[]{EditVoteActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        editVoteActivity.u2();
    }

    static /* synthetic */ void O1(EditVoteActivity editVoteActivity) {
        if (PatchProxy.proxy(new Object[]{editVoteActivity}, null, changeQuickRedirect, true, 26257, new Class[]{EditVoteActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        editVoteActivity.n2();
    }

    static /* synthetic */ void T1(EditVoteActivity editVoteActivity) {
        if (PatchProxy.proxy(new Object[]{editVoteActivity}, null, changeQuickRedirect, true, 26258, new Class[]{EditVoteActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        editVoteActivity.q2();
    }

    static /* synthetic */ void W1(EditVoteActivity editVoteActivity) {
        if (PatchProxy.proxy(new Object[]{editVoteActivity}, null, changeQuickRedirect, true, 26259, new Class[]{EditVoteActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        editVoteActivity.r2();
    }

    static /* synthetic */ void b2(EditVoteActivity editVoteActivity, int i10) {
        if (PatchProxy.proxy(new Object[]{editVoteActivity, new Integer(i10)}, null, changeQuickRedirect, true, 26255, new Class[]{EditVoteActivity.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        editVoteActivity.m2(i10);
    }

    static /* synthetic */ void f2(EditVoteActivity editVoteActivity) {
        if (PatchProxy.proxy(new Object[]{editVoteActivity}, null, changeQuickRedirect, true, 26256, new Class[]{EditVoteActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        editVoteActivity.p2();
    }

    private boolean j2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26250, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (com.max.hbcommon.utils.c.w(this.P)) {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(getString(R.string.option_empty_msg));
            return false;
        }
        for (BBSVoteOptionObj bBSVoteOptionObj : this.P) {
            if (com.max.hbcommon.utils.c.u(bBSVoteOptionObj.getText())) {
                com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(getString(R.string.option_empty_msg));
                return false;
            }
            if (this.L.getOption_mode() == 1 && com.max.hbcommon.utils.c.u(bBSVoteOptionObj.getImgpath()) && com.max.hbcommon.utils.c.u(bBSVoteOptionObj.getImgurl())) {
                com.max.hbutils.utils.c cVar3 = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(getString(R.string.img_empty_msg));
                return false;
            }
        }
        return true;
    }

    public static Intent k2(Context context, BBSLinkVoteObj bBSLinkVoteObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, bBSLinkVoteObj}, null, changeQuickRedirect, true, 26241, new Class[]{Context.class, BBSLinkVoteObj.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) EditVoteActivity.class);
        intent.putExtra(R, bBSLinkVoteObj);
        return intent;
    }

    private void l2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26243, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.Q.f115738g.setLayoutManager(new LinearLayoutManager(this.f66601b));
        d dVar = new d(this.f66601b, this.P, R.layout.item_vote_option_view);
        this.M = dVar;
        this.Q.f115738g.setAdapter(dVar);
    }

    private void m2(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 26253, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        PermissionManager.f71603a.S(this, new b(i10));
    }

    private void n2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26247, new Class[0], Void.TYPE).isSupported || this.Q.f115740i == null || this.L.getVote_end_date() == null) {
            return;
        }
        this.Q.f115740i.setText(com.max.hbutils.utils.w.h(this.L.getVote_end_date().getTimeInMillis(), com.max.hbutils.utils.w.f73605l));
    }

    private void o2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26248, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.L.getOption_mode() == 0) {
            this.Q.f115736e.setChecked(true);
        } else {
            this.Q.f115735d.setChecked(true);
        }
    }

    private void p2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26246, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if ("1".equals(this.L.getVote_type())) {
            this.Q.f115745n.setVisibility(8);
        } else {
            this.Q.f115745n.setVisibility(0);
            this.Q.f115741j.setText(String.valueOf(this.L.getVote_num()));
        }
    }

    private void q2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26245, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if ("1".equals(this.L.getVote_type())) {
            this.Q.f115742k.setText(com.max.xiaoheihe.utils.d.n0(R.string.vote_type_single));
        } else {
            this.Q.f115742k.setText(com.max.xiaoheihe.utils.d.n0(R.string.vote_type_multi));
        }
    }

    private void r2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26252, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.L.setOption_list(this.P);
        Intent intent = new Intent();
        intent.putExtra(R, this.L);
        setResult(-1, intent);
        finish();
    }

    private void u2() {
        int i10 = 0;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26251, new Class[0], Void.TYPE).isSupported && j2()) {
            if (this.L.getOption_mode() == 0) {
                r2();
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (BBSVoteOptionObj bBSVoteOptionObj : this.P) {
                if (com.max.hbcommon.utils.c.u(bBSVoteOptionObj.getImgurl())) {
                    arrayList.add(bBSVoteOptionObj.getImgpath());
                    i10++;
                }
            }
            if (i10 == 0) {
                r2();
            } else {
                this.N = new LoadingDialog(this.f66601b, getString(R.string.commiting)).r();
                com.max.xiaoheihe.module.upload.g.h(this.f66601b, V0(), arrayList, "bbs", new a());
            }
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26242, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        df.t tVarC = df.t.c(this.f66602c);
        this.Q = tVarC;
        setContentView(tVarC.b());
        ButterKnife.a(this);
        this.f66616q.setTitle(getString(R.string.edit_vote));
        this.f66616q.setAction(getString(R.string.complete));
        this.f66616q.setActionOnClickListener(new c());
        BBSLinkVoteObj bBSLinkVoteObj = (BBSLinkVoteObj) getIntent().getSerializableExtra(R);
        this.L = bBSLinkVoteObj;
        if (bBSLinkVoteObj == null) {
            BBSLinkVoteObj bBSLinkVoteObj2 = new BBSLinkVoteObj();
            this.L = bBSLinkVoteObj2;
            bBSLinkVoteObj2.setVote_type("1");
            this.Q.f115739h.setVisibility(8);
        }
        if (this.L.getVote_end_date() == null) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(11, 1);
            this.L.setVote_end_date(calendar);
        }
        if (this.L.getOption_list() == null || this.L.getOption_list().size() < this.O) {
            int size = this.O;
            if (this.L.getOption_list() != null) {
                size -= this.L.getOption_list().size();
            } else {
                this.L.setOption_list(new ArrayList());
            }
            for (int i10 = 0; i10 < size; i10++) {
                this.L.getOption_list().add(new BBSVoteOptionObj());
            }
        }
        this.P.addAll(this.L.getOption_list());
        l2();
        this.M.notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 26249, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        if (i11 == -1) {
            this.P.get(i10).setImgpath(com.max.mediaselector.lib.basic.q.g(intent).get(0).G());
            this.P.get(i10).setImgurl(null);
            this.M.notifyDataSetChanged();
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26244, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        o2();
        q2();
        p2();
        n2();
        this.Q.f115733b.setText(this.L.getVote_title());
        this.Q.f115733b.addTextChangedListener(new e());
        this.Q.f115737f.setOnCheckedChangeListener(new f());
        this.Q.f115743l.setOnClickListener(new g());
        this.Q.f115739h.setOnClickListener(new h());
        this.Q.f115744m.setOnClickListener(new i(Calendar.getInstance()));
        this.Q.f115747p.setOnClickListener(new j());
        this.Q.f115745n.setOnClickListener(new k());
    }
}
