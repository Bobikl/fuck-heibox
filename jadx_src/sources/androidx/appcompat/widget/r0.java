package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: SuggestionsAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class r0 extends androidx.cursoradapter.widget.c implements View.OnClickListener {
    private static final boolean D = false;
    private static final String E = "SuggestionsAdapter";
    private static final int F = 50;
    static final int G = 0;
    static final int H = 1;
    static final int I = 2;
    static final int J = -1;
    private int A;
    private int B;
    private int C;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final SearchView f2906p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final SearchableInfo f2907q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Context f2908r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f2909s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f2910t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f2911u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f2912v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ColorStateList f2913w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f2914x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f2915y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f2916z;

    /* JADX INFO: compiled from: SuggestionsAdapter.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f2917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f2918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f2919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImageView f2920d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f2921e;

        public a(View view) {
            this.f2917a = (TextView) view.findViewById(R.id.text1);
            this.f2918b = (TextView) view.findViewById(R.id.text2);
            this.f2919c = (ImageView) view.findViewById(R.id.icon1);
            this.f2920d = (ImageView) view.findViewById(R.id.icon2);
            this.f2921e = (ImageView) view.findViewById(androidx.appcompat.R.id.edit_query);
        }
    }

    public r0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f2911u = false;
        this.f2912v = 1;
        this.f2914x = -1;
        this.f2915y = -1;
        this.f2916z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.f2906p = searchView;
        this.f2907q = searchableInfo;
        this.f2910t = searchView.getSuggestionCommitIconResId();
        this.f2908r = context;
        this.f2909s = weakHashMap;
    }

    private static String C(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e(E, "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    private void E(ImageView imageView, Drawable drawable, int i10) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i10);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void F(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private void G(String str, Drawable drawable) {
        if (drawable != null) {
            this.f2909s.put(str, drawable.getConstantState());
        }
    }

    private void H(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private Drawable o(String str) {
        Drawable.ConstantState constantState = this.f2909s.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence q(CharSequence charSequence) {
        if (this.f2913w == null) {
            TypedValue typedValue = new TypedValue();
            this.f2908r.getTheme().resolveAttribute(androidx.appcompat.R.attr.textColorSearchUrl, typedValue, true);
            this.f2913w = this.f2908r.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f2913w, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable r(ComponentName componentName) {
        PackageManager packageManager = this.f2908r.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w(E, "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w(E, e10.toString());
            return null;
        }
    }

    private Drawable s(ComponentName componentName) {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f2909s.containsKey(strFlattenToShortString)) {
            Drawable drawableR = r(componentName);
            this.f2909s.put(strFlattenToShortString, drawableR != null ? drawableR.getConstantState() : null);
            return drawableR;
        }
        Drawable.ConstantState constantState = this.f2909s.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f2908r.getResources());
    }

    public static String t(Cursor cursor, String str) {
        return C(cursor, cursor.getColumnIndex(str));
    }

    private Drawable u() {
        Drawable drawableS = s(this.f2907q.getSearchActivity());
        return drawableS != null ? drawableS : this.f2908r.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable v(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return w(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f2908r.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e10) {
                    Log.e(E, "Error closing icon stream for " + uri, e10);
                }
                return drawableCreateFromStream;
            } catch (Throwable th2) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e11) {
                    Log.e(E, "Error closing icon stream for " + uri, e11);
                }
                throw th2;
            }
        } catch (FileNotFoundException e12) {
            Log.w(E, "Icon not found: " + uri + ", " + e12.getMessage());
            return null;
        }
        Log.w(E, "Icon not found: " + uri + ", " + e12.getMessage());
        return null;
    }

    private Drawable x(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i10 = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f2908r.getPackageName() + "/" + i10;
            Drawable drawableO = o(str2);
            if (drawableO != null) {
                return drawableO;
            }
            Drawable drawableI = androidx.core.content.d.i(this.f2908r, i10);
            G(str2, drawableI);
            return drawableI;
        } catch (Resources.NotFoundException unused) {
            Log.w(E, "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableO2 = o(str);
            if (drawableO2 != null) {
                return drawableO2;
            }
            Drawable drawableV = v(Uri.parse(str));
            G(str, drawableV);
            return drawableV;
        }
    }

    private Drawable y(Cursor cursor) {
        int i10 = this.A;
        if (i10 == -1) {
            return null;
        }
        Drawable drawableX = x(cursor.getString(i10));
        return drawableX != null ? drawableX : u();
    }

    private Drawable z(Cursor cursor) {
        int i10 = this.B;
        if (i10 == -1) {
            return null;
        }
        return x(cursor.getString(i10));
    }

    public int A() {
        return this.f2912v;
    }

    Cursor B(SearchableInfo searchableInfo, String str, int i10) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i10 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i10));
        }
        return this.f2908r.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    public void D(int i10) {
        this.f2912v = i10;
    }

    @Override // androidx.cursoradapter.widget.a, androidx.cursoradapter.widget.b.a
    public void a(Cursor cursor) {
        if (this.f2911u) {
            Log.w(E, "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f2914x = cursor.getColumnIndex("suggest_text_1");
                this.f2915y = cursor.getColumnIndex("suggest_text_2");
                this.f2916z = cursor.getColumnIndex("suggest_text_2_url");
                this.A = cursor.getColumnIndex("suggest_icon_1");
                this.B = cursor.getColumnIndex("suggest_icon_2");
                this.C = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e(E, "error changing cursor and caching columns", e10);
        }
    }

    @Override // androidx.cursoradapter.widget.a, androidx.cursoradapter.widget.b.a
    public Cursor c(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f2906p.getVisibility() == 0 && this.f2906p.getWindowVisibility() == 0) {
            try {
                Cursor cursorB = B(this.f2907q, string, 50);
                if (cursorB != null) {
                    cursorB.getCount();
                    return cursorB;
                }
            } catch (RuntimeException e10) {
                Log.w(E, "Search suggestions query threw an exception.", e10);
            }
        }
        return null;
    }

    @Override // androidx.cursoradapter.widget.a, androidx.cursoradapter.widget.b.a
    public CharSequence convertToString(Cursor cursor) {
        String strT;
        String strT2;
        if (cursor == null) {
            return null;
        }
        String strT3 = t(cursor, "suggest_intent_query");
        if (strT3 != null) {
            return strT3;
        }
        if (this.f2907q.shouldRewriteQueryFromData() && (strT2 = t(cursor, "suggest_intent_data")) != null) {
            return strT2;
        }
        if (!this.f2907q.shouldRewriteQueryFromText() || (strT = t(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strT;
    }

    @Override // androidx.cursoradapter.widget.a
    public void d(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i10 = this.C;
        int i11 = i10 != -1 ? cursor.getInt(i10) : 0;
        if (aVar.f2917a != null) {
            F(aVar.f2917a, C(cursor, this.f2914x));
        }
        if (aVar.f2918b != null) {
            String strC = C(cursor, this.f2916z);
            CharSequence charSequenceQ = strC != null ? q(strC) : C(cursor, this.f2915y);
            if (TextUtils.isEmpty(charSequenceQ)) {
                TextView textView = aVar.f2917a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f2917a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f2917a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f2917a.setMaxLines(1);
                }
            }
            F(aVar.f2918b, charSequenceQ);
        }
        ImageView imageView = aVar.f2919c;
        if (imageView != null) {
            E(imageView, y(cursor), 4);
        }
        ImageView imageView2 = aVar.f2920d;
        if (imageView2 != null) {
            E(imageView2, z(cursor), 8);
        }
        int i12 = this.f2912v;
        if (i12 != 2 && (i12 != 1 || (i11 & 1) == 0)) {
            aVar.f2921e.setVisibility(8);
            return;
        }
        aVar.f2921e.setVisibility(0);
        aVar.f2921e.setTag(aVar.f2917a.getText());
        aVar.f2921e.setOnClickListener(this);
    }

    @Override // androidx.cursoradapter.widget.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w(E, "Search suggestions cursor threw exception.", e10);
            View viewH = h(this.f2908r, b(), viewGroup);
            if (viewH != null) {
                ((a) viewH.getTag()).f2917a.setText(e10.toString());
            }
            return viewH;
        }
    }

    @Override // androidx.cursoradapter.widget.a, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w(E, "Search suggestions cursor threw exception.", e10);
            View viewI = i(this.f2908r, b(), viewGroup);
            if (viewI != null) {
                ((a) viewI.getTag()).f2917a.setText(e10.toString());
            }
            return viewI;
        }
    }

    @Override // androidx.cursoradapter.widget.a, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // androidx.cursoradapter.widget.c, androidx.cursoradapter.widget.a
    public View i(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewI = super.i(context, cursor, viewGroup);
        viewI.setTag(new a(viewI));
        ((ImageView) viewI.findViewById(androidx.appcompat.R.id.edit_query)).setImageResource(this.f2910t);
        return viewI;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        H(b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        H(b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f2906p.Y((CharSequence) tag);
        }
    }

    public void p() {
        a(null);
        this.f2911u = true;
    }

    Drawable w(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f2908r.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }
}
