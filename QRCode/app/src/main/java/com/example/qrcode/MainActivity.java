package com.example.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ImageView imageView = (ImageView) findViewById(R.id.qrCode);

		String qrData = "1";
		String test="2";
		String test2="3";
		int qrCodeDimention = 200;

		QRCodeEncoder qrCodeEncoder = new QRCodeEncoder(qrData, null,
		        Contents.Type.TEXT, BarcodeFormat.QR_CODE.toString(), qrCodeDimention);

		try {
		    Bitmap bitmap = qrCodeEncoder.encodeAsBitmap();
		    imageView.setImageBitmap(bitmap);
		} catch (WriterException e) {
		    e.printStackTrace();
		}
		
		
	}

	
}
