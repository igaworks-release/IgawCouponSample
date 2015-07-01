package com.igaworks.lucy.igawcouponsample;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.util.Log;
import android.view.View;

import com.igaworks.IgawCommon;
import com.igaworks.coupon.IgawCoupon;
import com.igaworks.coupon.interfaces.CouponCallbackListener;


public class MainActivity extends ActionBarActivity {

    // Igaworks Common
    String tag = "Igaw";

    // Igaworks Coupon
    String usn;
    String encryptUsn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Your Code
        TelephonyManager manager =  (TelephonyManager)getSystemService(MainActivity.this.TELEPHONY_SERVICE);
        usn = manager.getDeviceId().toString();
        usn = usn+"a";
        encryptUsn = Base64.encodeToString(usn.getBytes(), 0);


        // Igaworks Common
        IgawCommon.startApplication(MainActivity.this);
        Log.d(tag, "startApplication ::: MainActivity");

        // Igaworks Coupon
        IgawCommon.setUserId(encryptUsn);
        Log.d(tag, "setUserId ::: " + encryptUsn);

        /*
         * Your Code
         */
    }


     /*
      * Your Code
      */


    // Your Code
    public void showCouponDialog(View view){
        Log.d(tag, "showCouponDialog ::: Button Click");

        // Igaworks Coupon
        IgawCoupon.showCouponDialog(MainActivity.this, false, new CouponCallbackListener() {
            @Override
            public void run(Dialog dialog, boolean result, String msg) {
                Log.d(tag, "showCouponDialog ::: " + result + ", "+ msg);

                /*
                 * Your Code
                 */
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();

        // Igaworks Common
        IgawCommon.startSession(MainActivity.this);
        Log.d(tag, "startSession ::: MainActivity" );

        /*
         * Your Code
         */
    }

    @Override
    protected void onPause() {
        super.onPause();

        // Igaworks Common
        IgawCommon.endSession();
        Log.d(tag, "endSession ::: MainActivity");

        /*
         * Your Code
         */
    }

}
