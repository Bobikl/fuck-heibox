package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.u0;
import androidx.collection.j2;
import androidx.core.view.j1;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: AppCompatViewInflater.java */
/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f1809h = "AppCompatViewInflater";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f1811a = new Object[2];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?>[] f1803b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f1804c = {R.attr.onClick};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f1805d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f1806e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f1807f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f1808g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final j2<String, Constructor<? extends View>> f1810i = new j2<>();

    /* JADX INFO: compiled from: AppCompatViewInflater.java */
    public static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f1812b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f1813c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Method f1814d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Context f1815e;

        public a(@n0 View view, @n0 String str) {
            this.f1812b = view;
            this.f1813c = str;
        }

        private void a(@p0 Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f1813c, View.class)) != null) {
                        this.f1814d = method;
                        this.f1815e = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id2 = this.f1812b.getId();
            if (id2 == -1) {
                str = "";
            } else {
                str = " with id '" + this.f1812b.getContext().getResources().getResourceEntryName(id2) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f1813c + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f1812b.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@n0 View view) {
            if (this.f1814d == null) {
                a(this.f1812b.getContext());
            }
            try {
                this.f1814d.invoke(this.f1815e, view);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    private void a(@n0 Context context, @n0 View view, @n0 AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1805d);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            j1.C1(view, typedArrayObtainStyledAttributes.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f1806e);
        if (typedArrayObtainStyledAttributes2.hasValue(0)) {
            j1.E1(view, typedArrayObtainStyledAttributes2.getString(0));
        }
        typedArrayObtainStyledAttributes2.recycle();
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f1807f);
        if (typedArrayObtainStyledAttributes3.hasValue(0)) {
            j1.n2(view, typedArrayObtainStyledAttributes3.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes3.recycle();
    }

    private void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && j1.K0(view)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1804c);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private View s(Context context, String str, String str2) throws InflateException, ClassNotFoundException {
        String str3;
        j2<String, Constructor<? extends View>> j2Var = f1810i;
        Constructor<? extends View> constructor = j2Var.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f1803b);
            j2Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f1811a);
    }

    private View t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals(sd.b.f139384b)) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f1811a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return s(context, str, null);
            }
            int i10 = 0;
            while (true) {
                String[] strArr = f1808g;
                if (i10 >= strArr.length) {
                    return null;
                }
                View viewS = s(context, str, strArr[i10]);
                if (viewS != null) {
                    return viewS;
                }
                i10++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f1811a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context u(Context context, AttributeSet attributeSet, boolean z10, boolean z11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.F, 0, 0);
        int resourceId = z10 ? typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.View_android_theme, 0) : 0;
        if (z11 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.View_theme, 0)) != 0) {
            Log.i(f1809h, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return ((context instanceof androidx.appcompat.view.d) && ((androidx.appcompat.view.d) context).c() == resourceId) ? context : new androidx.appcompat.view.d(context, resourceId);
        }
        return context;
    }

    private void v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    @n0
    protected AppCompatAutoCompleteTextView c(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    @n0
    protected AppCompatButton d(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    @n0
    protected AppCompatCheckBox e(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    @n0
    protected AppCompatCheckedTextView f(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    @n0
    protected AppCompatEditText g(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    @n0
    protected AppCompatImageButton h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    @n0
    protected AppCompatImageView i(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    @n0
    protected AppCompatMultiAutoCompleteTextView j(Context context, AttributeSet attributeSet) {
        return new AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    @n0
    protected AppCompatRadioButton k(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    @n0
    protected AppCompatRatingBar l(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    @n0
    protected AppCompatSeekBar m(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    @n0
    protected AppCompatSpinner n(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    @n0
    protected AppCompatTextView o(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    @n0
    protected AppCompatToggleButton p(Context context, AttributeSet attributeSet) {
        return new AppCompatToggleButton(context, attributeSet);
    }

    @p0
    protected View q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    final View r(View view, String str, @n0 Context context, @n0 AttributeSet attributeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        View viewL;
        Context context2 = (!z10 || view == null) ? context : view.getContext();
        if (z11 || z12) {
            context2 = u(context2, attributeSet, z11, z12);
        }
        if (z13) {
            context2 = u0.b(context2);
        }
        str.hashCode();
        switch (str) {
            case "RatingBar":
                viewL = l(context2, attributeSet);
                v(viewL, str);
                break;
            case "CheckedTextView":
                viewL = f(context2, attributeSet);
                v(viewL, str);
                break;
            case "MultiAutoCompleteTextView":
                viewL = j(context2, attributeSet);
                v(viewL, str);
                break;
            case "TextView":
                viewL = o(context2, attributeSet);
                v(viewL, str);
                break;
            case "ImageButton":
                viewL = h(context2, attributeSet);
                v(viewL, str);
                break;
            case "SeekBar":
                viewL = m(context2, attributeSet);
                v(viewL, str);
                break;
            case "Spinner":
                viewL = n(context2, attributeSet);
                v(viewL, str);
                break;
            case "RadioButton":
                viewL = k(context2, attributeSet);
                v(viewL, str);
                break;
            case "ToggleButton":
                viewL = p(context2, attributeSet);
                v(viewL, str);
                break;
            case "ImageView":
                viewL = i(context2, attributeSet);
                v(viewL, str);
                break;
            case "AutoCompleteTextView":
                viewL = c(context2, attributeSet);
                v(viewL, str);
                break;
            case "CheckBox":
                viewL = e(context2, attributeSet);
                v(viewL, str);
                break;
            case "EditText":
                viewL = g(context2, attributeSet);
                v(viewL, str);
                break;
            case "Button":
                viewL = d(context2, attributeSet);
                v(viewL, str);
                break;
            default:
                viewL = q(context2, str, attributeSet);
                break;
        }
        if (viewL == null && context != context2) {
            viewL = t(context2, str, attributeSet);
        }
        if (viewL != null) {
            b(viewL, attributeSet);
            a(context2, viewL, attributeSet);
        }
        return viewL;
    }
}
