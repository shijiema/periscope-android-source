// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.text.Editable;

// Referenced classes of package o:
//            _cls30CE, xd, yo, zp, 
//            _cls06BA, amo, ada

public static class je
{

    public final _cls06BA je;

    public static void _mth02CA(amo amo, Editable editable)
    {
        amo.getApplicationContext().getSharedPreferences("api_tweaks", 0).edit().putString("pref_local_api", editable.toString()).apply();
    }

    public static boolean _mth02CB(ada ada)
    {
        return !yo._mth02CA(xd._mth1FEA()) || ada.getApplicationContext().getSharedPreferences("api_tweaks", 0).getBoolean("pref_enable_chatman", true);
    }

    public static boolean _mth02CE(ada ada)
    {
        zp zp1 = xd._mth1FEA();
        return yo._mth02CA(zp1) && zp1.G() && ada.getApplicationContext().getSharedPreferences("api_tweaks", 0).getBoolean("pref_enable_rank_summary", false);
    }

    public static boolean _mth02CF(ada ada)
    {
        return !yo._mth02CA(xd._mth1FEA()) || ada.getApplicationContext().getSharedPreferences("api_tweaks", 0).getBoolean("pref_enable_pubnub", true);
    }

    public static boolean _mth1428(Context context)
    {
        return yo._mth02CA(xd._mth1FEA()) && context.getApplicationContext().getSharedPreferences("api_tweaks", 0).getBoolean("pref_enable_local_api", false);
    }

    public static boolean FE73(Context context)
    {
        return yo._mth02CA(xd._mth1FEA()) && context.getApplicationContext().getSharedPreferences("api_tweaks", 0).getBoolean("pref_enable_canary_api", false);
    }

    public Bitmap _mth02CA(int i, int j, android.graphics.onfig onfig)
    {
        return je._mth02BB(i, j, onfig);
    }

    public void _mth02CE(Bitmap bitmap)
    {
        if (!je._mth02BD(bitmap))
        {
            bitmap.recycle();
        }
    }

    public map(@   ! {
    }

    public map(_cls06BA _pcls06ba)
    {
        je = _pcls06ba;
    }
}
