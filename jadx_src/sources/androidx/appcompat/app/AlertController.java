package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.annotation.p0;
import androidx.appcompat.R;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.j1;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class AlertController {
    NestedScrollView A;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    Handler R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final i f1605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Window f1606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f1608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f1609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ListView f1610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f1611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f1612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f1613j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f1614k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f1615l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f1616m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Button f1618o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f1619p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Message f1620q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f1621r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Button f1622s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CharSequence f1623t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    Message f1624u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f1625v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    Button f1626w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CharSequence f1627x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    Message f1628y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Drawable f1629z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f1617n = false;
    private int B = 0;
    int I = -1;
    private int Q = 0;
    private final View.OnClickListener S = new a();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f1630b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f1631c;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f1593z);
            this.f1631c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.RecycleListView_paddingBottomNoButtons, -1);
            this.f1630b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.RecycleListView_paddingTopNoTitle, -1);
        }

        public void setHasDecor(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f1630b, getPaddingRight(), z11 ? getPaddingBottom() : this.f1631c);
        }
    }

    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message messageObtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view == alertController.f1618o && (message3 = alertController.f1620q) != null) {
                messageObtain = Message.obtain(message3);
            } else if (view != alertController.f1622s || (message2 = alertController.f1624u) == null) {
                messageObtain = (view != alertController.f1626w || (message = alertController.f1628y) == null) ? null : Message.obtain(message);
            } else {
                messageObtain = Message.obtain(message2);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f1605b).sendToTarget();
        }
    }

    public class b implements NestedScrollView.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f1633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1634b;

        b(View view, View view2) {
            this.f1633a = view;
            this.f1634b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.c
        public void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
            AlertController.g(nestedScrollView, this.f1633a, this.f1634b);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f1637c;

        c(View view, View view2) {
            this.f1636b = view;
            this.f1637c = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.g(AlertController.this.A, this.f1636b, this.f1637c);
        }
    }

    public class d implements AbsListView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f1639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1640b;

        d(View view, View view2) {
            this.f1639a = view;
            this.f1640b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
            AlertController.g(absListView, this.f1639a, this.f1640b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1642b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f1643c;

        e(View view, View view2) {
            this.f1642b = view;
            this.f1643c = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.g(AlertController.this.f1610g, this.f1642b, this.f1643c);
        }
    }

    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public boolean N;
        public AdapterView.OnItemSelectedListener O;
        public e P;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f1645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LayoutInflater f1646b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Drawable f1648d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f1650f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f1651g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f1652h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CharSequence f1653i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Drawable f1654j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f1655k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f1656l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Drawable f1657m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f1658n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public CharSequence f1659o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Drawable f1660p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f1661q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f1663s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f1664t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f1665u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public CharSequence[] f1666v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ListAdapter f1667w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f1668x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f1669y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public View f1670z;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1647c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1649e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean Q = true;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f1662r = true;

        public class a extends ArrayAdapter<CharSequence> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ RecycleListView f1671b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f1671b = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = f.this.F;
                if (zArr != null && zArr[i10]) {
                    this.f1671b.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        public class b extends CursorAdapter {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f1673b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f1674c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ RecycleListView f1675d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ AlertController f1676e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f1675d = recycleListView;
                this.f1676e = alertController;
                Cursor cursor2 = getCursor();
                this.f1673b = cursor2.getColumnIndexOrThrow(f.this.L);
                this.f1674c = cursor2.getColumnIndexOrThrow(f.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(android.R.id.text1)).setText(cursor.getString(this.f1673b));
                this.f1675d.setItemChecked(cursor.getPosition(), cursor.getInt(this.f1674c) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f1646b.inflate(this.f1676e.M, viewGroup, false);
            }
        }

        public class c implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AlertController f1678b;

            c(AlertController alertController) {
                this.f1678b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                f.this.f1668x.onClick(this.f1678b.f1605b, i10);
                if (f.this.H) {
                    return;
                }
                this.f1678b.f1605b.dismiss();
            }
        }

        public class d implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ RecycleListView f1680b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ AlertController f1681c;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f1680b = recycleListView;
                this.f1681c = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                boolean[] zArr = f.this.F;
                if (zArr != null) {
                    zArr[i10] = this.f1680b.isItemChecked(i10);
                }
                f.this.J.onClick(this.f1681c.f1605b, i10, this.f1680b.isItemChecked(i10));
            }
        }

        public interface e {
            void a(ListView listView);
        }

        public f(Context context) {
            this.f1645a = context;
            this.f1646b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void b(AlertController alertController) {
            ListAdapter hVar;
            RecycleListView recycleListView = (RecycleListView) this.f1646b.inflate(alertController.L, (ViewGroup) null);
            if (this.G) {
                hVar = this.K == null ? new a(this.f1645a, alertController.M, android.R.id.text1, this.f1666v, recycleListView) : new b(this.f1645a, this.K, false, recycleListView, alertController);
            } else {
                int i10 = this.H ? alertController.N : alertController.O;
                if (this.K != null) {
                    hVar = new SimpleCursorAdapter(this.f1645a, i10, this.K, new String[]{this.L}, new int[]{android.R.id.text1});
                } else {
                    hVar = this.f1667w;
                    if (hVar == null) {
                        hVar = new h(this.f1645a, i10, android.R.id.text1, this.f1666v);
                    }
                }
            }
            e eVar = this.P;
            if (eVar != null) {
                eVar.a(recycleListView);
            }
            alertController.H = hVar;
            alertController.I = this.I;
            if (this.f1668x != null) {
                recycleListView.setOnItemClickListener(new c(alertController));
            } else if (this.J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.O;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.H) {
                recycleListView.setChoiceMode(1);
            } else if (this.G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f1610g = recycleListView;
        }

        public void a(AlertController alertController) {
            View view = this.f1651g;
            if (view != null) {
                alertController.n(view);
            } else {
                CharSequence charSequence = this.f1650f;
                if (charSequence != null) {
                    alertController.s(charSequence);
                }
                Drawable drawable = this.f1648d;
                if (drawable != null) {
                    alertController.p(drawable);
                }
                int i10 = this.f1647c;
                if (i10 != 0) {
                    alertController.o(i10);
                }
                int i11 = this.f1649e;
                if (i11 != 0) {
                    alertController.o(alertController.d(i11));
                }
            }
            CharSequence charSequence2 = this.f1652h;
            if (charSequence2 != null) {
                alertController.q(charSequence2);
            }
            CharSequence charSequence3 = this.f1653i;
            if (charSequence3 != null || this.f1654j != null) {
                alertController.l(-1, charSequence3, this.f1655k, null, this.f1654j);
            }
            CharSequence charSequence4 = this.f1656l;
            if (charSequence4 != null || this.f1657m != null) {
                alertController.l(-2, charSequence4, this.f1658n, null, this.f1657m);
            }
            CharSequence charSequence5 = this.f1659o;
            if (charSequence5 != null || this.f1660p != null) {
                alertController.l(-3, charSequence5, this.f1661q, null, this.f1660p);
            }
            if (this.f1666v != null || this.K != null || this.f1667w != null) {
                b(alertController);
            }
            View view2 = this.f1670z;
            if (view2 != null) {
                if (this.E) {
                    alertController.v(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController.u(view2);
                    return;
                }
            }
            int i12 = this.f1669y;
            if (i12 != 0) {
                alertController.t(i12);
            }
        }
    }

    public static final class g extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f1683b = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<DialogInterface> f1684a;

        public g(DialogInterface dialogInterface) {
            this.f1684a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f1684a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, i iVar, Window window) {
        this.f1604a = context;
        this.f1605b = iVar;
        this.f1606c = window;
        this.R = new g(iVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R.styleable.f1574g, R.attr.alertDialogStyle, 0);
        this.J = typedArrayObtainStyledAttributes.getResourceId(R.styleable.AlertDialog_android_layout, 0);
        this.K = typedArrayObtainStyledAttributes.getResourceId(R.styleable.AlertDialog_buttonPanelSideLayout, 0);
        this.L = typedArrayObtainStyledAttributes.getResourceId(R.styleable.AlertDialog_listLayout, 0);
        this.M = typedArrayObtainStyledAttributes.getResourceId(R.styleable.AlertDialog_multiChoiceItemLayout, 0);
        this.N = typedArrayObtainStyledAttributes.getResourceId(R.styleable.AlertDialog_singleChoiceItemLayout, 0);
        this.O = typedArrayObtainStyledAttributes.getResourceId(R.styleable.AlertDialog_listItemLayout, 0);
        this.P = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AlertDialog_showTitle, true);
        this.f1607d = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.AlertDialog_buttonIconDimen, 0);
        typedArrayObtainStyledAttributes.recycle();
        iVar.j(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f1606c.findViewById(R.id.parentPanel);
        int i10 = R.id.topPanel;
        View viewFindViewById4 = viewFindViewById3.findViewById(i10);
        int i11 = R.id.contentPanel;
        View viewFindViewById5 = viewFindViewById3.findViewById(i11);
        int i12 = R.id.buttonPanel;
        View viewFindViewById6 = viewFindViewById3.findViewById(i12);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(R.id.customPanel);
        y(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(i10);
        View viewFindViewById8 = viewGroup.findViewById(i11);
        View viewFindViewById9 = viewGroup.findViewById(i12);
        ViewGroup viewGroupJ = j(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupJ2 = j(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupJ3 = j(viewFindViewById9, viewFindViewById6);
        x(viewGroupJ2);
        w(viewGroupJ3);
        z(viewGroupJ);
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (viewGroupJ == null || viewGroupJ.getVisibility() == 8) ? 0 : 1;
        boolean z12 = (viewGroupJ3 == null || viewGroupJ3.getVisibility() == 8) ? false : true;
        if (!z12 && viewGroupJ2 != null && (viewFindViewById2 = viewGroupJ2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z11 != 0) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f1609f == null && this.f1610g == null) ? null : viewGroupJ.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupJ2 != null && (viewFindViewById = viewGroupJ2.findViewById(R.id.textSpacerNoTitle)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f1610g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).setHasDecor(z11, z12);
        }
        if (!z10) {
            View view = this.f1610g;
            if (view == null) {
                view = this.A;
            }
            if (view != null) {
                r(viewGroupJ2, view, z11 | (z12 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f1610g;
        if (listView2 == null || (listAdapter = this.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i13 = this.I;
        if (i13 > -1) {
            listView2.setItemChecked(i13, true);
            listView2.setSelection(i13);
        }
    }

    private static boolean B(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    static void g(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    @p0
    private ViewGroup j(@p0 View view, @p0 View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int k() {
        int i10 = this.K;
        return (i10 != 0 && this.Q == 1) ? i10 : this.J;
    }

    private void r(ViewGroup viewGroup, View view, int i10, int i11) {
        View viewFindViewById = this.f1606c.findViewById(R.id.scrollIndicatorUp);
        View viewFindViewById2 = this.f1606c.findViewById(R.id.scrollIndicatorDown);
        j1.p2(view, i10, i11);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    private void w(ViewGroup viewGroup) {
        int i10;
        Button button = (Button) viewGroup.findViewById(android.R.id.button1);
        this.f1618o = button;
        button.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f1619p) && this.f1621r == null) {
            this.f1618o.setVisibility(8);
            i10 = 0;
        } else {
            this.f1618o.setText(this.f1619p);
            Drawable drawable = this.f1621r;
            if (drawable != null) {
                int i11 = this.f1607d;
                drawable.setBounds(0, 0, i11, i11);
                this.f1618o.setCompoundDrawables(this.f1621r, null, null, null);
            }
            this.f1618o.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(android.R.id.button2);
        this.f1622s = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f1623t) && this.f1625v == null) {
            this.f1622s.setVisibility(8);
        } else {
            this.f1622s.setText(this.f1623t);
            Drawable drawable2 = this.f1625v;
            if (drawable2 != null) {
                int i12 = this.f1607d;
                drawable2.setBounds(0, 0, i12, i12);
                this.f1622s.setCompoundDrawables(this.f1625v, null, null, null);
            }
            this.f1622s.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(android.R.id.button3);
        this.f1626w = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f1627x) && this.f1629z == null) {
            this.f1626w.setVisibility(8);
        } else {
            this.f1626w.setText(this.f1627x);
            Drawable drawable3 = this.f1629z;
            if (drawable3 != null) {
                int i13 = this.f1607d;
                drawable3.setBounds(0, 0, i13, i13);
                this.f1626w.setCompoundDrawables(this.f1629z, null, null, null);
            }
            this.f1626w.setVisibility(0);
            i10 |= 4;
        }
        if (B(this.f1604a)) {
            if (i10 == 1) {
                b(this.f1618o);
            } else if (i10 == 2) {
                b(this.f1622s);
            } else if (i10 == 4) {
                b(this.f1626w);
            }
        }
        if (i10 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void x(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f1606c.findViewById(R.id.scrollView);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(android.R.id.message);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f1609f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f1610g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f1610g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void y(ViewGroup viewGroup) {
        View viewInflate = this.f1611h;
        if (viewInflate == null) {
            viewInflate = this.f1612i != 0 ? LayoutInflater.from(this.f1604a).inflate(this.f1612i, viewGroup, false) : null;
        }
        boolean z10 = viewInflate != null;
        if (!z10 || !a(viewInflate)) {
            this.f1606c.setFlags(131072, 131072);
        }
        if (!z10) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f1606c.findViewById(R.id.custom);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f1617n) {
            frameLayout.setPadding(this.f1613j, this.f1614k, this.f1615l, this.f1616m);
        }
        if (this.f1610g != null) {
            ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    private void z(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f1606c.findViewById(R.id.title_template).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f1606c.findViewById(android.R.id.icon);
        if (!(!TextUtils.isEmpty(this.f1608e)) || !this.P) {
            this.f1606c.findViewById(R.id.title_template).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f1606c.findViewById(R.id.alertTitle);
        this.E = textView;
        textView.setText(this.f1608e);
        int i10 = this.B;
        if (i10 != 0) {
            this.D.setImageResource(i10);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
        } else {
            this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
            this.D.setVisibility(8);
        }
    }

    public Button c(int i10) {
        if (i10 == -3) {
            return this.f1626w;
        }
        if (i10 == -2) {
            return this.f1622s;
        }
        if (i10 != -1) {
            return null;
        }
        return this.f1618o;
    }

    public int d(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f1604a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f1610g;
    }

    public void f() {
        this.f1605b.setContentView(k());
        A();
    }

    public boolean h(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.m(keyEvent);
    }

    public boolean i(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.m(keyEvent);
    }

    public void l(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f1627x = charSequence;
            this.f1628y = message;
            this.f1629z = drawable;
        } else if (i10 == -2) {
            this.f1623t = charSequence;
            this.f1624u = message;
            this.f1625v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f1619p = charSequence;
            this.f1620q = message;
            this.f1621r = drawable;
        }
    }

    public void m(int i10) {
        this.Q = i10;
    }

    public void n(View view) {
        this.G = view;
    }

    public void o(int i10) {
        this.C = null;
        this.B = i10;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
            }
        }
    }

    public void p(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageDrawable(drawable);
            }
        }
    }

    public void q(CharSequence charSequence) {
        this.f1609f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void s(CharSequence charSequence) {
        this.f1608e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void t(int i10) {
        this.f1611h = null;
        this.f1612i = i10;
        this.f1617n = false;
    }

    public void u(View view) {
        this.f1611h = view;
        this.f1612i = 0;
        this.f1617n = false;
    }

    public void v(View view, int i10, int i11, int i12, int i13) {
        this.f1611h = view;
        this.f1612i = 0;
        this.f1617n = true;
        this.f1613j = i10;
        this.f1614k = i11;
        this.f1615l = i12;
        this.f1616m = i13;
    }
}
