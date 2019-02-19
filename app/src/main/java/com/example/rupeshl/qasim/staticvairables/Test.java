package com.example.rupeshl.qasim.staticvairables;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;

import java.util.Objects;

import static com.example.rupeshl.qasim.TestJava.TAG;

public class Test{
	@RequiresApi(api = Build.VERSION_CODES.KITKAT)
	public static void main(String[] args){
		PrintStaticValue psv=new PrintStaticValue();
		psv.main();
		IntializeValueFirst ivf=new IntializeValueFirst();
		ivf.main();
		PrintStaticValue psv2=new PrintStaticValue();
		psv.main();
		String name=null;



		System.out.print(Objects.requireNonNull(name).toString());
	}


	public  void showLog()
	{
		throw new RuntimeException("");
	}
}