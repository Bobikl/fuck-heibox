package com.max.component.adapter;

import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.max.component.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.u;

/* JADX INFO: compiled from: ComponentMethodAdapter.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class d extends e<Method> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final Context f65434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final List<Method> f65435h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final View f65436i;

    /* JADX INFO: compiled from: ComponentMethodAdapter.kt */
    public static final class a implements RadioGroup.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f65437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f65438b;

        a(Method method, d dVar) {
            this.f65437a = method;
            this.f65438b = dVar;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(@dl.e RadioGroup radioGroup, int i10) throws IllegalAccessException, InvocationTargetException {
            if (PatchProxy.proxy(new Object[]{radioGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.Vk, new Class[]{RadioGroup.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (i10 == R.id.rb_true) {
                this.f65437a.invoke(this.f65438b.y(), Boolean.TRUE);
            } else if (i10 == R.id.rb_false) {
                this.f65437a.invoke(this.f65438b.y(), Boolean.FALSE);
            }
            this.f65438b.y().requestLayout();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@dl.d Context context, @dl.d List<Method> list, @dl.d View component) {
        super(context, list, R.layout.item_component_method);
        f0.p(context, "context");
        f0.p(list, "list");
        f0.p(component, "component");
        this.f65434g = context;
        this.f65435h = list;
        this.f65436i = component;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(Method method, EditText editText, d this$0, View view) {
        Editable text;
        if (PatchProxy.proxy(new Object[]{method, editText, this$0, view}, null, changeQuickRedirect, true, bb.c.b.Tk, new Class[]{Method.class, EditText.class, d.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        try {
            Class<?>[] parameterTypes = method.getParameterTypes();
            f0.o(parameterTypes, "getParameterTypes(...)");
            if (!(parameterTypes.length == 0)) {
                String string = (editText == null || (text = editText.getText()) == null) ? null : text.toString();
                if (string == null) {
                    return;
                }
                Class<?> cls = method.getParameterTypes()[0];
                if (f0.g(cls, Float.TYPE)) {
                    method.invoke(this$0.f65436i, Float.valueOf(Float.parseFloat(string)));
                } else if (f0.g(cls, Double.TYPE)) {
                    method.invoke(this$0.f65436i, Double.valueOf(Double.parseDouble(string)));
                } else if (f0.g(cls, Byte.TYPE)) {
                    method.invoke(this$0.f65436i, Byte.valueOf(Byte.parseByte((String) StringsKt__StringsKt.U4(string, new String[]{"."}, false, 0, 6, null).get(0))));
                } else if (f0.g(cls, Short.TYPE)) {
                    method.invoke(this$0.f65436i, Short.valueOf(Short.parseShort((String) StringsKt__StringsKt.U4(string, new String[]{"."}, false, 0, 6, null).get(0))));
                } else if (f0.g(cls, Integer.TYPE)) {
                    method.invoke(this$0.f65436i, Integer.valueOf(u.v2(string, "#", false, 2, null) ? Color.parseColor(string) : Integer.parseInt((String) StringsKt__StringsKt.U4(string, new String[]{"."}, false, 0, 6, null).get(0))));
                } else if (f0.g(cls, Long.TYPE)) {
                    method.invoke(this$0.f65436i, Long.valueOf(Long.parseLong((String) StringsKt__StringsKt.U4(string, new String[]{"."}, false, 0, 6, null).get(0))));
                } else if (!f0.g(cls, String.class) && f0.g(cls, Boolean.TYPE)) {
                    method.invoke(this$0.f65436i, Boolean.valueOf(this$0.x(string)));
                } else {
                    method.invoke(this$0.f65436i, string);
                }
            } else {
                method.invoke(this$0.f65436i, new Object[0]);
            }
            this$0.f65436i.requestLayout();
        } catch (Throwable th2) {
            String message = th2.getMessage();
            if (message == null) {
                message = "error msg empty";
            }
            Log.e("ComponentMethodAdapter", message);
        }
    }

    @dl.d
    public final List<Method> A() {
        return this.f65435h;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    public void B(@dl.e e.C0530e c0530e, @dl.e final Method method) {
        int i10;
        if (PatchProxy.proxy(new Object[]{c0530e, method}, this, changeQuickRedirect, false, bb.c.b.Rk, new Class[]{e.C0530e.class, Method.class}, Void.TYPE).isSupported || method == null) {
            return;
        }
        TextView textView = c0530e != null ? (TextView) c0530e.g(R.id.tv_method_name) : null;
        final EditText editText = c0530e != null ? (EditText) c0530e.g(R.id.et_value) : null;
        TextView textView2 = c0530e != null ? (TextView) c0530e.g(R.id.tv_set) : null;
        RadioGroup radioGroup = c0530e != null ? (RadioGroup) c0530e.g(R.id.f65397rg) : null;
        TextView textView3 = c0530e != null ? (TextView) c0530e.g(R.id.tv_note) : null;
        qa.a aVar = (qa.a) method.getAnnotation(qa.a.class);
        if (textView3 != null) {
            if ((aVar != null ? aVar.note() : null) == null) {
                i10 = 8;
            } else {
                if (aVar.note().length() > 0) {
                    textView3.setText(aVar.note());
                    i10 = 0;
                } else {
                    i10 = 8;
                }
            }
            textView3.setVisibility(i10);
        }
        if (textView != null) {
            textView.setText(method.getName());
        }
        if (radioGroup != null) {
            radioGroup.setVisibility(8);
        }
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        if (editText != null) {
            editText.setVisibility(0);
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        f0.o(parameterTypes, "getParameterTypes(...)");
        if ((!(parameterTypes.length == 0)) && f0.g(method.getParameterTypes()[0], Boolean.TYPE)) {
            if (radioGroup != null) {
                radioGroup.setVisibility(0);
            }
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            if (editText != null) {
                editText.setVisibility(8);
            }
            if (radioGroup != null) {
                radioGroup.setOnCheckedChangeListener(new a(method, this));
            }
        }
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.max.component.adapter.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.C(method, editText, this, view);
                }
            });
        }
    }

    @Override // com.max.component.adapter.e
    public /* bridge */ /* synthetic */ void r(e.C0530e c0530e, Method method) {
        if (PatchProxy.proxy(new Object[]{c0530e, method}, this, changeQuickRedirect, false, bb.c.b.Uk, new Class[]{e.C0530e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        B(c0530e, method);
    }

    public final boolean x(@dl.d String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.Sk, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(str, "str");
        return u.L1(str, "true", true);
    }

    @dl.d
    public final View y() {
        return this.f65436i;
    }

    @dl.d
    public final Context z() {
        return this.f65434g;
    }
}
