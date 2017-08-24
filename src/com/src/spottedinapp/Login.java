package com.src.spottedinapp;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.TextView;

public class Login extends Activity{
		TextView username,password;
		Bitmap bm;
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.id.login_view);
			username=(TextView)findViewById(R.id.user_name);
			username.setCompoundDrawablesWithIntrinsicBounds(
                    R.drawable.photo, 0, 0, 0);
		}
}
