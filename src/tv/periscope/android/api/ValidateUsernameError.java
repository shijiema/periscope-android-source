// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package tv.periscope.android.api;

import java.util.ArrayList;

public class ValidateUsernameError
{
    public class UsernameError
    {

        public int code;
        public String error;
        public ArrayList fields;
        final ValidateUsernameError this$0;

        public UsernameError()
        {
            this$0 = ValidateUsernameError.this;
            super();
        }
    }


    public ArrayList errors;

    public ValidateUsernameError()
    {
    }
}
