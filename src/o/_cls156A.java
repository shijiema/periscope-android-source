// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package o;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

class _cls156A
{

    _cls156A()
    {
    }

    public static void _mth02CA(ViewParent viewparent, View view)
    {
        try
        {
            viewparent.onStopNestedScroll(view);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            Log.e("ViewParentCompat", (new StringBuilder("ViewParent ")).append(viewparent).append(" does not implement interface method onStopNestedScroll").toString(), view);
        }
    }

    public static void _mth02CA(ViewParent viewparent, View view, int i, int j, int k, int l)
    {
        try
        {
            viewparent.onNestedScroll(view, i, j, k, l);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            Log.e("ViewParentCompat", (new StringBuilder("ViewParent ")).append(viewparent).append(" does not implement interface method onNestedScroll").toString(), view);
        }
    }

    public static void _mth02CA(ViewParent viewparent, View view, int i, int j, int ai[])
    {
        try
        {
            viewparent.onNestedPreScroll(view, i, j, ai);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            Log.e("ViewParentCompat", (new StringBuilder("ViewParent ")).append(viewparent).append(" does not implement interface method onNestedPreScroll").toString(), view);
        }
    }

    public static boolean _mth02CA(ViewParent viewparent, View view, float f, float f1)
    {
        boolean flag;
        try
        {
            flag = viewparent.onNestedPreFling(view, f, f1);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            Log.e("ViewParentCompat", (new StringBuilder("ViewParent ")).append(viewparent).append(" does not implement interface method onNestedPreFling").toString(), view);
            return false;
        }
        return flag;
    }

    public static boolean _mth02CA(ViewParent viewparent, View view, float f, float f1, boolean flag)
    {
        try
        {
            flag = viewparent.onNestedFling(view, f, f1, flag);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            Log.e("ViewParentCompat", (new StringBuilder("ViewParent ")).append(viewparent).append(" does not implement interface method onNestedFling").toString(), view);
            return false;
        }
        return flag;
    }

    public static boolean _mth02CA(ViewParent viewparent, View view, View view1, int i)
    {
        boolean flag;
        try
        {
            flag = viewparent.onStartNestedScroll(view, view1, i);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            Log.e("ViewParentCompat", (new StringBuilder("ViewParent ")).append(viewparent).append(" does not implement interface method onStartNestedScroll").toString(), view);
            return false;
        }
        return flag;
    }

    public static void _mth02CB(ViewParent viewparent, View view, View view1, int i)
    {
        try
        {
            viewparent.onNestedScrollAccepted(view, view1, i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            Log.e("ViewParentCompat", (new StringBuilder("ViewParent ")).append(viewparent).append(" does not implement interface method onNestedScrollAccepted").toString(), view);
        }
    }
}
